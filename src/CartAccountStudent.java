public class CartAccountStudent {
    private String name;
    private String surName;
    private String specialization;
    private int id;

    public CartAccountStudent(String name, String surName, String specialization, int id) {
        this.name = name;
        this.surName = surName;
        this.specialization = specialization;
        this.id = id;
    }

    public void robot() {
        System.out.println("Студент " + name + " " + surName + " зашёл в колледж");
        System.out.println("Учиться на " + specialization);
        System.out.println("Под номером " + id);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
