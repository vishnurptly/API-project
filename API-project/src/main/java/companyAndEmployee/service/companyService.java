package companyAndEmployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import companyAndEmployee.API.project.model.comAndemp;
import companyAndEmployee.API.project.repository.comAndempRepository;
import companyAndEmployee.excepton.ResourceNotFoundException;
import companyAndEmployee.mappers.companyMapper;
import companyAndEmployee.payload.companyResponese;
import companyAndEmployee.payload.companySaveRequest;
import jakarta.transaction.Transactional;


@Service
public class companyService {

     @Autowired
    private comAndempRepository ComAndempRepository;

    @Autowired
    private companyMapper CompanyMapper;

    private comAndemp save(comAndemp ComAndemp){
        ComAndempRepository.save(ComAndemp);
        return ComAndemp;
    }

   

    @Transactional
    public companyResponese getByid(Long id) {
        Optional<comAndemp> ComAndempFetched = ComAndempRepository.findById(id);

        if(!ComAndempFetched.isPresent()){
           throw new ResourceNotFoundException("id not found");
        }
        
        return CompanyMapper.map(ComAndempFetched.get());
    }

    @Transactional
    public companyResponese create(companySaveRequest CompanySaveRequest){
        comAndemp ComAndemp =CompanyMapper.map(CompanySaveRequest);
        ComAndemp = this.save(ComAndemp);
       return CompanyMapper.map(ComAndemp);
       
    }

    @Transactional
    public companyResponese update(Long id,companySaveRequest CompanySaveRequest){
        Optional<comAndemp> comAndempFetched = ComAndempRepository.findById(id);
        
        comAndemp ComAndemp = CompanyMapper.update(comAndempFetched.get(), CompanySaveRequest);
        return CompanyMapper.map(ComAndemp);
    }

    @Transactional
    public companyResponese delete(Long id){
        Optional <comAndemp> comAndempFetched = ComAndempRepository.findById(id);
        ComAndempRepository.delete(comAndempFetched.get());
        return CompanyMapper.map(this.save(comAndempFetched.get())) ;
    }
    @Transactional
    public List<companyResponese> getAll(){
       List<comAndemp> comAndempFetched = ComAndempRepository.findAll();
       return CompanyMapper.map(comAndempFetched);
    }


}
