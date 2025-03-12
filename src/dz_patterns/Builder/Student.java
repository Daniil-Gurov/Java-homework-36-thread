package dz_patterns.Builder;

public class Student {

    private String name;
    private int age;
    private String group;

    private Student(StudentBuilder studentBuilder) {
        name = studentBuilder.name;
        age = studentBuilder.age;
        group = studentBuilder.group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private String group;


        public StudentBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public StudentBuilder setGroup(String group) {
            this.group = group;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

class TestBuilder {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Дмитрий", 22).setGroup("1101").build();
    }
}
