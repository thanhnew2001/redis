package myrmit;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by CoT on 10/9/18.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

}