public class Main {
    public static void main(String[] args) {
        //write your code here
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog * 4;
        cat = cat * 4;
        paper = paper * 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксёров " + weight + " кг!");
        var difference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между боксёров " + difference + " кг!");
        var difference2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между боксёрами " + difference2 + " кг!");
        var workingHours = 640;
        var employeeHours = 8;
        var employee = workingHours / employeeHours;
        System.out.println("Всего работников в компании - " + employee + " человек");
        employee = employee + 94;
        var hours = workingHours / employee;
        System.out.println("Если в компании работает " + employee + " человек, то всего "
                + hours + " часов работы может быть поделено между сотрудниками.");

    }
}