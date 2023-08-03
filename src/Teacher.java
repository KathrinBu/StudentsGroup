public abstract class Teacher {

    private String name;

    public static void says(String s) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;
    }


}
