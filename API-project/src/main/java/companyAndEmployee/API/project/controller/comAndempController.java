package companyAndEmployee.API.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import companyAndEmployee.payload.companySaveRequest;
import companyAndEmployee.service.companyService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class comAndempController {
   
    @Autowired
    private companyService CompanyService ;

    @GetMapping("text")
    public String  getallText(){
      return "hello vishnu";
    }
    

   @GetMapping("/id/{id}")
   public ResponseEntity<?> getByid(@PathVariable("id") Long id){
    return ResponseEntity.ok(CompanyService.getByid(id));
   }
        
   

   @PostMapping("/post")
   public ResponseEntity<?> create(@RequestBody companySaveRequest CompanySaveRequest){
    return ResponseEntity.ok(CompanyService.create(CompanySaveRequest));
   }

   @GetMapping("/all")
   public ResponseEntity<?> getAll(){
    return ResponseEntity.ok( CompanyService.getAll());
   }
   
   @DeleteMapping("/remove/{id}")
   public ResponseEntity<?> delete(@PathVariable Long id){
     return ResponseEntity.ok(CompanyService.delete(id));
   }

   @PutMapping("/update/{id}")
   public ResponseEntity<?> update(@PathVariable Long id,@RequestBody companySaveRequest CompanySaveRequest){
    
    return ResponseEntity.ok(CompanyService.update(id,CompanySaveRequest));
   }
}
