package classes;

public class Course {
    private String courseCode;
    private String courseName;
    private String level;
    private String courseType;

    public Course(String courseCode, String courseName, String level, String courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.level = level;
        this.courseType = courseType;
        
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

   
           
        
    
    
}
