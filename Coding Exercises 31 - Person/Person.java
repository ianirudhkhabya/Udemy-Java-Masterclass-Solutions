public class Person {
    private String firstName;
    private String lastName;
    private int age; 
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }
    
    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0) {
            this.age = 0;
        }
        else { 
            this.age = age;
        }
    }
    
    public boolean isTeen() {
        if(this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        }
        if(this.lastName.isEmpty()) {
            return firstName;
        }
        if(this.firstName.isEmpty()) {
            return lastName;
        }
        return firstName + " " + lastName;
    }
}
