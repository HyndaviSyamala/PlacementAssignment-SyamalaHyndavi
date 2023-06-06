package in.ineuron.model;


	

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "student")
	public class Student implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;

		@Column(length = 20)
		private String name;
		private Integer age;
		@Column(length=20)
		private String Address;
		@Column(length=20)
		private String Course;
		
		public Student() {
			System.out.println("USED BY HIBERNATE....");
		}

		
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getAge() {
			return age;
		}


		public void setAge(Integer age) {
			this.age = age;
		}


		public String getAddress() {
			return Address;
		}


		public void setAddress(String address) {
			Address = address;
		}


		public String getCourse() {
			return Course;
		}


		public void setCourse(String course) {
			Course = course;
		}


		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", Address=" + Address + ", Course="
					+ Course + "]";
		}

		
	}
