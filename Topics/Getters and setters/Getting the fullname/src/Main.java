class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = " ";
        this.lastName = " ";
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            this.firstName = " ";
        } else if (firstName.isEmpty()) {
            this.firstName = " ";
        } else {
            this.firstName = firstName;
        }// write your code here
    }

    public void setLastName(String lastName) {
     /*   try {
            this.lastName = lastName;
        } catch (Exception e) {
            this.lastName = " ";
        } */
        if (lastName == null){
            this.lastName = " ";
     /*   } else if (lastName.isEmpty()) {
            this.lastName = " "; */
        } else {
            this.lastName = lastName;
        }

    }

    public String getFullName() {
        String fullName = "";
        if (firstName.isBlank() && lastName.isBlank()) {
            fullName = "Unknown";
        } else if (firstName.isBlank()) {
            fullName = lastName;
        } else if (lastName.isBlank()) {
            fullName = firstName;
        } else {
            fullName = firstName + " " + lastName;
        }
        return fullName; // write your code here
    }
}