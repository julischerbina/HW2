public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
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
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weight = firstBoxer + secondBoxer;
        System.out.println("Общий вес спортсменов составляет " + weight + " кг!");
        var difWeight = secondBoxer - firstBoxer;
        System.out.println("Вес первого бойца меньше, чем вес второго на " + difWeight + " кг!");
        difWeight = secondBoxer % firstBoxer;
        System.out.println("Вес первого бойца меньше, чем вес второго на " + difWeight + " кг!");
        var hours = 640;
        var onePersonHour=8;
        var amount = hours/onePersonHour;
        System.out.println("Всего работников в компании – " + amount +  " человек");
        amount = amount + 94;
        hours = amount * 8;
        System.out.println("Если в компании работает " + amount + " человека, то всего " + hours + " часов работы может быть поделено между сотрудниками");
        char c = 33;
        char d = '!';
        System.out.println(c + " = " + d);
        var class1 = 23;
        var class2 = 27;
        var class3 = 30;
        paper = 480;
        var paperToStudent = paper / (class1+class2+class3);
        System.out.println("На каждого ученика рассчитано " + paperToStudent + " листов бумаги");
        var bottle = 16/2;
        var min20 = 20;
        var day = 24*60;
        var day3 = 24*60*3;
        var month = day*30;
        var bottleIn20 = bottle*min20;
        var bottleInDay = bottle*day;
        var bottleIn3Days = bottleInDay*day3;
        var bottleInMonth = bottleInDay*month;
        System.out.println("За " + min20 + " минут машина произвела бутылок " + bottleIn20 + " штук ");
        System.out.println("За день машина произвела бутылок " + bottleInDay + " штук ");
        System.out.println("За 3 дня машина произвела бутылок " + bottleIn3Days + " штук ");
        System.out.println("За месяц машина произвела бутылок " + bottleInMonth + " штук ");
        var allJar = 120;
        var whiteJar1 = 2;
        var brownJar1 = 4;
        var classes = allJar/(whiteJar1+brownJar1);
        var white = whiteJar1*classes;
        var brown = brownJar1*classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
        var banana = 5*80;
        var milk = 2*105;
        var icecream = 2*100;
        var egg = 4*70;
        var breakfast = banana + milk + icecream + egg;
        var kg = breakfast/1000;
        System.out.println("На завтрак спортсмен съедает " + breakfast + " грамм еды или " + kg + " в килограммах");
        int weight250 = 250;
        int weight500 = 500;
        int weight2 = 7*1000;
        int day1 = weight2/weight250;
        int day2 = weight2/weight500;
        int days = weight2/((weight250+weight500)/2);
        System.out.println("При похудении на " + weight250 + " грамм в день, спортсмен придет в форму за " + day1 + " дней, при похудении на " + weight500 + " грамм в день, потребуется " + day2 + " дней. В среднем же спортсмен может похудеть на " + (weight2/1000) + " кг за " + days + " дней");
        int salaryMashaToday = 67760;
        int salaryDenisToday = 83690;
        int salaryKristinaToday = 76230;
        int salaryMashaNew = (int) (salaryMashaToday*1.1);
        int salaryDenisNew = (int) (salaryDenisToday*1.1);
        int salaryKristinaNew = (int) (salaryKristinaToday*1.1);
        int yearMasha = salaryMashaNew*12 - salaryMashaToday*12;
        int yearDenis = salaryDenisNew*12 - salaryDenisToday*12;
        int yearKristina = salaryKristinaNew*12 - salaryKristinaToday*12;
        System.out.println("Маша теперь получает " + salaryMashaNew + " рублей. Годовой доход вырос на " + yearMasha + " рублей." +
                "Денис теперь получает " + salaryDenisNew + " рублей. Годовой доход вырос на " + yearDenis + " рублей." +
                "Кристина теперь получает " + salaryKristinaNew + " рублей. Годовой доход вырос на " + yearKristina + " рублей.");
    }
}