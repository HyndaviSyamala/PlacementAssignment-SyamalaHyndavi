package in.ineuron.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAspect {

	Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut(value = "execution(* in.ineuron.*.*.*(..))")
	public void loggingPointCut() {

	}

	@Around("loggingPointCut()")
	public Object loggingAdvice(ProceedingJoinPoint pj) throws Throwable {

		// Logger logger = LoggerFactory.getLogger();

		ObjectMapper mapper = new ObjectMapper();

		String methodName = pj.getSignature().getName();
		String className = pj.getTarget().getClass().toString();

		Object[] array = pj.getArgs();
		log.info("Inside" + className + "class" + methodName + "mehotd,with request:"
				+ mapper.writeValueAsString(array));

		Object response = pj.proceed();

		log.info(className + " : " + methodName + "()" + "Response : " + mapper.writeValueAsString(response));

		return response;

	}
}
