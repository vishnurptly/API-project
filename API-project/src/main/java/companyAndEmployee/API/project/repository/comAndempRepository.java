package companyAndEmployee.API.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import companyAndEmployee.API.project.model.comAndemp;

@Repository
public interface comAndempRepository extends  JpaRepository<comAndemp, Long>{
    // Optional<comAndemp>findById(Long id);
    
}
