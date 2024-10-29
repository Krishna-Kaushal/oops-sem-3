class Course {
    // Protected attributes
    protected String code;
    protected String name;
    protected int credit;

    // Constructor
    public Course(String code, String name, int credit) {
        this.code = code;
        this.name = name;
        this.credit = credit;
    }

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

class UGCourse extends Course {

    // Constructor
    public UGCourse(String uniqueId, String name, int credit) {
        super("UG-" + uniqueId, name, credit);
    }
}

class PGCourse extends Course {

    // Constructor
    public PGCourse(String uniqueId, String name, int credit) {
        super("PG-" + uniqueId, name, credit);
    }
}

public class q2 {
    public static void main(String[] args) {
        // Creating UG Course
        UGCourse ugCourse = new UGCourse("1001", "Introduction to Computer Science", 4);

        // Display UG Course details
        System.out.println("UG Course Code: " + ugCourse.getCode());
        System.out.println("UG Course Name: " + ugCourse.getName());
        System.out.println("UG Course Credit: " + ugCourse.getCredit());

        // Creating PG Course
        PGCourse pgCourse = new PGCourse("2001", "Advanced Algorithms", 3);

        // Display PG Course details
        System.out.println("PG Course Code: " + pgCourse.getCode());
        System.out.println("PG Course Name: " + pgCourse.getName());
        System.out.println("PG Course Credit: " + pgCourse.getCredit());
    }
}

