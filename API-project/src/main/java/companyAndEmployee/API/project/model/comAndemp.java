package companyAndEmployee.API.project.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "comAndemp")
public class comAndemp {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String companyName;

    @Column
    private String mobileNumber;

    @Column
    private String address;

    @Column
    private String UnikCode;

    
    public comAndemp() {
    }

    public comAndemp(Long id, String companyName, String mobileNumber, String address, String unikCode) {
        this.id = id;
        this.companyName = companyName;
        this.mobileNumber = mobileNumber;
        this.address = address;
        UnikCode = unikCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUnikCode() {
        return UnikCode;
    }

    public void setUnikCode(String unikCode) {
        UnikCode = unikCode;
    }

    
}
