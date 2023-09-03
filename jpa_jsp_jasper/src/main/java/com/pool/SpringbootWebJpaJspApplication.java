package com.comrade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.comrade.dao.*;
import com.comrade.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition.CustomUserMyBaseRepository;
import com.comrade.dao.manytomany.StudentRepository;
import com.comrade.model.entityinheritance.*;
import com.comrade.model.onetoone.Instrucror;
import com.comrade.model.onetoone.InstrucrorDetails;
import com.comrade.service.EmployeeService;
import com.comrade.service.JoinedTableInheritanceService;
import com.comrade.service.PostService;
import com.comrade.service.TagService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
/* @EnableCaching */
public class SpringbootWebJpaJspApplication implements CommandLineRunner /* extends SpringBootServletInitializer */ {
	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { return
	 * builder.sources(SpringbootWebJpaJspApplication.class); }
	 */
	@Autowired
	CustomUserMyBaseRepository customUserMyBaseRepository;
	@Autowired
	InstrucrorRepository instrucrorRepository;
	@Autowired
	InstrucrorDetailsRepository instrucrorDetailsRepository;
	@Autowired
	FullTimeEmployeeRepository fullTimeEmployeeRepository;
	@Autowired
	EmployeeService employeeDao;
	@Autowired
	JoinedTableInheritanceService joinedTableInheritanceService;
	@Autowired
	TagService tagService;
	@Autowired
	PostService postService;
	@Autowired
	EntityManager entityManager;
	@Autowired
	LionRepository lionRepository;
	@Autowired
	ElephantRepository elephantRepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	StudentembeddedIdRepository studentembeddedIdRepository;
	@Autowired
	PostOneToOneRepository postOneToOneRepository;
	@Autowired
	ProductRepository productRepository;
	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootWebJpaJspApplication.class, args);
	}

	@Override

	public void run(String... args) throws Exception {

		System.out.println("This is Created" + customUserMyBaseRepository.findByEmailAddress("dasarishiva1@gmail.com"));
		InstrucrorDetails ind = new InstrucrorDetails();
		ind.setHobby("Programming");
		ind.setYoutubeChannel("No");
		Instrucror in = new Instrucror();
		in.setFirstName("Shiva");
		in.setLastName("Dasari");
		in.setInstrucrorDetails(ind);
		instrucrorRepository.save(in);
		InstrucrorDetails ind1 = new InstrucrorDetails();
		ind1.setHobby("Programming");
		ind1.setYoutubeChannel("No");
		Instrucror in1 = new Instrucror();
		in1.setFirstName("Shiva");
		in1.setLastName("Dasari");
		in1.setInstrucrorDetails(ind1);
		instrucrorRepository.save(in1);
		/* instrucrorRepository.delete(in); */
		InstrucrorDetails instrucrorDetails2 = null;
		Optional<InstrucrorDetails> instrucrorDetails = instrucrorDetailsRepository.findById(2);
		if (instrucrorDetails.isPresent()) {
			instrucrorDetails2 = instrucrorDetails.get();
		}
		System.out.println("AAA" + instrucrorDetails2);
		System.out.println("AAA" + instrucrorDetails2.getInstrucror());
		instrucrorDetails2.getInstrucror().setInstrucrorDetails(null);
		/* bi-directional delete */
		instrucrorDetailsRepository.deleteById(2);
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
		partTimeEmployee.setName("Shiva");
		partTimeEmployee.setWeeklySalary(100);
		employeeDao.savePart(partTimeEmployee);
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
		fullTimeEmployee.setName("Satish");
		fullTimeEmployee.setSalary(10000);
		employeeDao.saveFull(fullTimeEmployee);
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setHourlyRate(100);
		contractEmployee.setName("SD");
		employeeDao.saveContr(contractEmployee);
		SmsNotification smsNotification = new SmsNotification();
		smsNotification.setFirstName("shiva");
		smsNotification.setLastName("Dasari");
		smsNotification.setPhoneNumber("8247621473");
		// fullTimeEmployeeRepository.save(partTimeEmployee);
		joinedTableInheritanceService.sendSme(smsNotification);

		PostComment comment = new PostComment();
		comment.setReview("Good");

		PostComment comment1 = new PostComment();
		comment1.setReview("Very Good");

		List<PostComment> postCommentList = new ArrayList<>();
		postCommentList.add(comment);
		postCommentList.add(comment1);

		PostDetails details = new PostDetails();
		details.setCreatedBy("Shiva");
		details.setCreatedOn(new Date());
		PostDetails details1 = new PostDetails();
		details1.setCreatedBy("Sai");
		details1.setCreatedOn(new Date());

		List<PostDetails> postDetailsList = new ArrayList<>();
		postDetailsList.add(details);
		postDetailsList.add(details1);

		Tag tag = new Tag();
		tag.setName("JDBC");

		Tag tag1 = new Tag();
		tag1.setName("Hibernate");
		tagService.saveTag(tag);
		tagService.saveTag(tag1);

		Post post = new Post();
		post.setTitle("High-Performance Java Persistence");

		post.addDetails(details);
		postCommentList.forEach(post::addComment);

		post.getTags().add(tagService.getTag("JDBC"));
		post.getTags().add(tagService.getTag("Hibernate"));
		postService.savePost(post);

		Animal animal1 = new Animal();
		animal1.setLocation("HYD");
		animal1.setName("Lion");

		Animal animal2 = new Animal();
		animal2.setLocation("TMP");
		animal2.setName("Elephant");

		Lion lion = new Lion();
		lion.setAnimal(animal1);
		lionRepository.save(lion);
		Elephant elephant = new Elephant();
		elephant.setAnimal(animal2);
		elephantRepository.save(elephant);

		System.out.println(lionRepository.findAll());
		System.out.println(elephantRepository.findAll());

		Course course = new Course();
		course.setName("Java");

		Course course1 = new Course();
		course1.setName("Spring frameWork");

		Course course2 = new Course();
		course2.setName("CNC");

		Course course3 = new Course();
		course3.setName("Machine drowing");

		List<Course> courseList = new ArrayList<>();
		courseList.add(course);
		courseList.add(course1);

		Student student = new Student();
		student.setName("Shiva");
		courseList.forEach(student::addCourse);

		Student student1 = new Student();
		student1.setName("Staish");
		courseList.forEach(student1::addCourse);

		List<Student> studentList = new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);

		List<Course> courseList1 = new ArrayList<>();
		courseList1.add(course2);
		courseList1.add(course3);

		studentRepository.save(student);
		studentRepository.save(student1);
		Optional<Student> studenttest = studentRepository.findById(1);
		System.out.println(studenttest.get());

		Person person = new Person();
		person.setFirstName("Shiva");
		person.setLastName("Dasari");
		person.setPersonId(1);
		StudentembeddedId studentembeddedId = new StudentembeddedId();
		studentembeddedId.setLocation("Thalla Malkapuram");
		studentembeddedId.setId(person);
		studentembeddedIdRepository.save(studentembeddedId);
		PostOneToOne postOneToOne = new PostOneToOne();
		/* postOneToOne.setDetailsOneToOne(detailsOneToOne); */
		// postOneToOne.addPostDetailsOneToOne(detailsOneToOne);
		postOneToOne.setTitle("One to One Maps");
		PostDetailsOneToOne detailsOneToOne = new PostDetailsOneToOne();
		detailsOneToOne.setCreatedBy("Shiva");
		detailsOneToOne.setCreatedOn(new Date());
		// detailsOneToOne.setPostOneToOne(postOneToOne);
		// changes for @MapsId
		// postOneToOne.setDetailsOneToOne(detailsOneToOne);
		postOneToOne.addPostDetailsOneToOne(detailsOneToOne);
		postOneToOneRepository.save(postOneToOne);
		Optional<PostOneToOne> optional = postOneToOneRepository.findById(1);
		System.out.println("One to One MapsId:" + optional.get());

		
		Product product = new Product();
		product.setName("rice");
		product.addPrice(new BigDecimal(1200));
		/*product.addPrice(new BigDecimal(1300));*/
		productRepository.save(product);
		/*Optional<Product> optional2=productRepository.findById(1L);
		System.out.println(optional2.get());*/
		
		
	}
}
