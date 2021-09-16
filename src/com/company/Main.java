package com.company;

public class Main {

    public static void main(String[] args) {
        User user = new User("Alibey Özbay", "alibeyozbay@hotmail.com");

        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.",
                16,
                "Engin Demiroğ",
                "Programlama",
                false);

        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "2 ay sürecek Yazılım Geliştirici Yetiştirme Kampımızın takip, döküman ve duyurularını buradan yapacağız.",
                16,
                "Engin Demiroğ",
                "Programlama",
                false);

        Course course3 = new Course("Programlamaya Giriş için Temel Kurs",
                "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır",
                16,
                "Engin Demiroğ",
                "Programlama",
                true);


        Course[] courses = {course1, course2, course3};

        for (Course course: courses) {
            System.out.println(course.name);
            System.out.println(course.detail + "");
            System.out.println("Kurs süresi: " + course.days + " gün");
            if (course.isCompleted){
                System.out.println("Tamamlandı\n");
            }else System.out.println("Tamamlanmadı\n");
        }

        CourseManager courseManager = new CourseManager();

        courseManager.joinCourse(course2);

        courseManager.complateCourse(course2);

    }
}
