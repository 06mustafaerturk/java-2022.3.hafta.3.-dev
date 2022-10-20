package logging;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class FileLogger implements Logger<Object> {

	@Override
	public void log(Object data) {
		
		if (data instanceof Course) {
		System.out.println(((Course) data).getCourseName()+" adlý kurs Dosyaya loglandý");
		}
		else if(data instanceof Instructor) {
		System.out.println(((Instructor) data).getInstructorName() +"adlý egitmen Dosyaya Loglandý");	
		}else if(data instanceof Category) {
		System.out.println(((Category) data).getCategoryName()+"adlý kategoriy Dosyaya loglandý");
		}
		
	}

	
	

}
