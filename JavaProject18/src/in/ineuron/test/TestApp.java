package in.ineuron.test;

		import java.util.List;

		import org.hibernate.HibernateException;
		import org.hibernate.Session;
		import org.hibernate.query.Query;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;

		public class TestApp {

			@SuppressWarnings("unchecked")
			public static void main(String[] args) {

				Session session = null;
				try {
					session = HibernateUtil.getSession();

					// Prepare Query object to hold HQL
					Query<Student> query = session.createQuery("FROM in.ineuron.model.Student");// select * from product;

					// Execute the query
					List<Student> students = query.list();

					// process the List Object
					students.forEach(System.out::println);

				} catch (HibernateException he) {
					he.printStackTrace();
				} finally {
					HibernateUtil.closeSession(session);
					HibernateUtil.closeSessionFactory();
				}

			}
		


	}


