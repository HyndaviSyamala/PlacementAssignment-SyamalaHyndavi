package in.ineuron.test;

		
import java.util.List;

import java.util.Scanner;
import org.hibernate.HibernateException;
		import org.hibernate.Session;

import org.hibernate.query.Query;

import in.ineuron.model.Product;
import in.ineuron.util.HibernateUtil;

		public class TestApp5 {

				@SuppressWarnings({ "unchecked", "rawtypes" })
				public static void main(String[] args) {

					Session session = null;
					org.hibernate.Transaction transaction = null;
					int count = 0;
					boolean flag = false;

					try {
						session = HibernateUtil.getSession();
						
						transaction = session.beginTransaction();
						
						// Prepare Query object to hold HQL
						Query query = session
								.createQuery("UPDATE in.ineuron.model.Product SET qty=qty+:newQty WHERE pid=:id");
                          Query query1=session.createQuery("FROM in.ineuron.model.Product");
                    System.out.println("enter the id to be fetched::");
                    @SuppressWarnings("resource")
                          int id=new Scanner(System.in).nextInt();
						// Set the Parameter values
						query.setParameter("newQty", 5);
						query.setParameter("id", id);
                        
						// Execute the query
						count = query.executeUpdate();
						flag = true;
						
						List<Product> products = query1.list();

						// process the List Object
						products.forEach(System.out::println);
					} catch (HibernateException he) {
						he.printStackTrace();
						flag =false;
					} finally {
						if (flag) {
							transaction.commit();
							System.out.println("No of rows affected is :: " + count);
						} else {
							transaction.rollback();
							System.out.println("No of rows affected is :: " + count);

						}
						HibernateUtil.closeSession(session);
						HibernateUtil.closeSessionFactory();
					}

			}
		


	}


