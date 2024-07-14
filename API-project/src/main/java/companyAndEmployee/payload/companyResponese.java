package companyAndEmployee.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class companyResponese {
     
    private Long id;

    private String companyName;

   
    private String mobileNumber;

    
    private String address;

    
    private String UnikCode;

}
