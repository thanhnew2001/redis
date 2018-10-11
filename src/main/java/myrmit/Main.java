package myrmit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by CoT on 10/12/17.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.scan("myrmit");

        context.refresh();

        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        Student student = new Student("Thanh", 10);
        studentRepository.save(student);

        List<Student> students = new ArrayList<>();
        Iterator iterator = studentRepository.findAll().iterator();
        while(iterator.hasNext()){
            Student student1 = (Student)iterator.next();
            System.out.println(student1);
        }

    }
}
//Exercise:
//ByeManager as interface
//FrenchByeManager
//JapaneseByeManager
//make byeManager as a property of HelloApp




