package companyAndEmployee.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import companyAndEmployee.API.project.model.comAndemp;
import companyAndEmployee.payload.companyResponese;
import companyAndEmployee.payload.companySaveRequest;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy  = ReportingPolicy.IGNORE)
public interface  companyMapper {

     companyMapper INSTANCE = Mappers.getMapper(companyMapper.class);

     comAndemp map(companySaveRequest CompanySaveRequest);

     List<companyResponese> map(List<comAndemp> ComAndemp);

     companyResponese map(comAndemp ComAndemp);

     comAndemp update(@MappingTarget comAndemp ComAndemp,
                        companySaveRequest CompanySaveRequest);

    
}
