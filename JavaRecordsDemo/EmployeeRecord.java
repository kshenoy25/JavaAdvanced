package JavaRecordsDemo;

// generates private fields
// generated as final fields as well after record is created
// having a record has the ability for canonical constructor creation (automatic generation)
// automatic generated toString, equals, and hashCode methods
// does not generate setter methods, but they are immutable by default
// record object cannot be changed
// records cannot extend any other class
// records are implicitly final
// records can implement the Runnable interface
// records have a unique implementation called compact constructors


public record EmployeeRecord (String name, int employeeNumber) {
    public static final String DEFAULT_EMPLOYEE_NAME = "Kunal";

    // compact constructor
    public EmployeeRecord {
        if (employeeNumber < 0) {
            throw new IllegalArgumentException("Employee number cannot be negative");
        }
    }

    public String nameInUpperCase(){
        return name.toUpperCase();
    }
    public static void printWhatever(){
        System.out.println("Whatever");
    }
}
