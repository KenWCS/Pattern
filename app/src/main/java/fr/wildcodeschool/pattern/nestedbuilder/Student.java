package fr.wildcodeschool.pattern.nestedbuilder;

@SuppressWarnings("unused")
public class Student {
  private String firstname = "";
  private String lastname = "";
  private String age = "";

  // Student constructor
  private Student() { }

  // Student constructor
  private Student(String firstname) {
    this.firstname = firstname;
  }

  // Student constructor
  private Student(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
  }

  // Student constructor
  private Student(String firstname, String lastname, String age) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
  }

  // Student getters
  public String getFirstname() { return firstname; }
  public String getLastname() { return lastname; }
  public String getAge() { return age; }


  /**
   * Student.Builder class
   */
  public static class Builder {
    private Student mStudent;

    /**
     * Student.Builder Constructor
     */
    public Builder() {
      mStudent = new Student();
    }

    /**
     * Firstname setter
     * @param firstname value to store
     * @return  Builder instance
     */
    public Builder setFirstname(String firstname) {
      mStudent.firstname = firstname;
      return this;
    }

    /**
     * Lastname setter
     * @param lastname value to store
     * @return Builder instance
     */
    public Builder setLastname(String lastname) {
      mStudent.lastname = lastname;
      return this;
    }

    /**
     * Age setter
     * @param age value to store
     * @return Builder instance
     */
    public Builder setAge(String age) {
      mStudent.age = age;
      return this;
    }

    /**
     * Return the instance of Student
     * @return Student instance
     */
    public Student build() {
      return mStudent;
    }

  }
}
