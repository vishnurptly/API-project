package companyAndEmployee.API.project.service;

import companyAndEmployee.API.project.model.comAndemp;
import companyAndEmployee.API.project.repository.comAndempRepository;

public class ComAndempService {
    private  comAndempRepository ComAndempRepository;

    public Object create(comAndemp ComAndemp) {
       return ComAndempRepository.save(ComAndemp);
    }

}
