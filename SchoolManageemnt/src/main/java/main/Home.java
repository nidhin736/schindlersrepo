	
`

                     ackage main;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Student;
 

public class Home {
public static void main(String[] args){
	ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml"); 
	Student student=(Student) context.getBean("studentbean");
	System.out.print(student.getName());
	
	
}
}
