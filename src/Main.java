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

        
        byte spirit = 10;
        short ofMana = 300;
        int health = 200;
        long dexterity = 1000;
        float experience = 3.6f;
        double energy = 4.567;
        System.out.println("Значение переменно spirit переменной byte равно " + spirit);
        System.out.println("Значение переменно ofMana переменной short равно " + ofMana);
        System.out.println("Значение переменно health переменной int равно " + health);
        System.out.println("Значение переменно dexterity переменной long равно " + dexterity);
        System.out.println("Значение переменно experience переменной float равно " + experience);
        System.out.println("Значение переменно energy переменной double равно " + energy);
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        char d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        short ludmila = 23;
        short anna = 27;
        short ekaterina = 30;
        short papper = 480;
        int student = papper / (ludmila + anna + ekaterina);
        System.out.println("На каждого ученика рассчитано " + student + " листов бумаги.");

        short bottles = 16 /2;
        int bottlesminutes = 20 * bottles;
        int bottlesADay = (24 * 60) * bottles;
        int bottlesThreeDays = (72 * 60) * bottles;
        int bottlesMonth = ((30 * 24) * 60) * bottles;
        System.out.println("За 20 минут машина произвела " + bottlesminutes + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + bottlesADay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottlesMonth + " штук бутылок");

        short paint = 120;
        short brown = 2;
        short white = 4;
        int paintOffice = brown + white;
        int office = paint / paintOffice;
        int brownOffice = office * brown;
        int whiteOffice = office * white;
        System.out.println("В школе, где " + office + " классов, нужно " + whiteOffice + " банок белой краски и " + brownOffice + " банок коричневой краски.");

        int kg = 1000;
        short bananas = 5 * 80;
        int milk = 200 * 210;
        short iceCreamSundae = 2 * 100;
        short rawEggs = 4 * 70;
        int mixture = bananas + milk + iceCreamSundae + rawEggs;
        float weigh = (float) mixture / kg;
        System.out.println("Вес спортзавтрака равен " + mixture + " гр.");
        System.out.println("Вес спортзавтрака равен " + weigh + " кг.");

        short reset = 7000;
        short a1 = 250;
        short b1 = 500;
        int average = (a1 + b1) / 2;
        int a1day = reset / a1;
        int b1day = reset / b1;
        int averageday = reset / average;
        System.out.println(a1day + " дней понадобиться, если сбрасывать по " + a1 +"гр в день.");
        System.out.println(b1day + " дней понадобиться, если сбрасывать по " + b1 +"гр в день.");
        System.out.println(averageday + " дней понадобиться, если сбрасывать по " + average +"гр в день.");

        short percent = 10;
        int maha = 67760;
        int denis = 83690;
        int cristina = 76230;
        float percent10 = 1 + (percent / 100f);
        int mahPer =(int) (maha * percent10);
        int denPer =(int) (denis * percent10);
        int criPer =(int) (cristina * percent10);
        int mahYear = maha * 12;
        int denYear = denis * 12;
        int criYear = cristina * 12;
        int mahYearPer = mahPer * 12;
        int denYearPer = denPer * 12;
        int criYearPer = criPer * 12;
        int mahYearPerDiff = mahYearPer - mahYear;
        int denYearPerDiff = denYearPer - denYear;
        int criYearPerDiff = criYearPer - criYear;
        System.out.println("Маша теперь получает " + mahYearPer + " рублей. Годовой доход вырос на " + mahYearPerDiff + " рублей.");
        System.out.println("Денис теперь получает " + denYearPer + " рублей. Годовой доход вырос на " + denYearPerDiff + " рублей.");
        System.out.println("Крестина теперь получает " + criYearPer + " рублей. Годовой доход вырос на " + criYearPerDiff + " рублей.");






















    }
}