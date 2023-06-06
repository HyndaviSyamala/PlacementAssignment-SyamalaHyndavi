

	package in.ineuron.test;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
		import org.hibernate.Session;
		import org.hibernate.Transaction;
import org.hibernate.query.Query;

import in.ineuron.model.Student;
import in.ineuron.util.HibernateUtil;


		public class SaveApp {

			public static void main(String[] args) {

				Session session = null;
				Transaction transaction = null;

				boolean flag = false;
				try {
					session = HibernateUtil.getSession();
					@SuppressWarnings({ "unused", "unchecked" })
					Query<Student> query = session.createQuery("FROM in.ineuron.model.Student");
					 
					if (session != null)
						transaction = session.beginTransaction();
				 
                       
					if (transaction != null) {

						Student student = new Student();
					 System.out.print("enter the value of sid::"  );
						@SuppressWarnings("resource")
						int id11=new Scanner(System.in).nextInt();
						
						 System.out.print("enter the value of sname::"  );
							@SuppressWarnings("resource")
							String name=new Scanner(System.in).next();
							
							 System.out.print("enter the value of saddress::"  );
								@SuppressWarnings("resource")
								String address=new Scanner(System.in).next();
								
								 System.out.print("enter the value of sage::"  );
									@SuppressWarnings("resource")
									int age=new Scanner(System.in).nextInt();
							
						student.setSid(id11);
						student.setSname(name);
						student.setSaddress(address);
						student.setSage(age);

						session.save(student);
						List<Student> students = query.list();

						// process the List Object
						students.forEach(System.out::println);
						
						
						flag = true;
					}

				} catch (HibernateException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (flag) {
						transaction.commit();
						System.out.println("Object saved to database....");
					} else {
						transaction.rollback();
						System.out.println("Object not saved to database...");
					}

					HibernateUtil.closeSession(session);
					HibernateUtil.closeSessionFactory();
				}

			}

}



