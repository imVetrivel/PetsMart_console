package resources;

public class employee_details {
     
    private String Name;

    private int id;

    private String specific_role;

    private long C_num;

    private int Salary;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecific_role() {
        return specific_role;
    }

    public void setSpecific_role(String specific_role) {
        this.specific_role = specific_role;
    }

    public long getC_num() {
        return C_num;
    }

    public void setC_num(long c_num) {
        C_num = c_num;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    
}
