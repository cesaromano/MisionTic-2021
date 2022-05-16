package inheritb;

public class Employee {
    
    private String name;
    private String position;
    private String addres;
    private String phone;

    public Employee(String name, String position, String addres, String phone) {
        this.name = name;
        this.position = position;
        this.addres = addres;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getAddres() {
        return addres;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", position=" + position + ", addres=" + addres + ", phone=" + phone + '}';
    }
    
    
    
}
