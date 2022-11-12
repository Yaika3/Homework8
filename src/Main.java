public class Main {
    public static void main(String[] args) {

      int salary = 15000;
      int total = 0;
        int i = 0;
      while (total <= 2450000)  {
          total = total + total/100;
          total = total + salary;
          System.out.println("месяц "+ i ++ +" Итого " + total ); // я не понял как выводить номера месяцев если они не в цикле for?
      }
        System.out.println(total);

      //task 2

        int number =0;
        int y = 1;
        while (number < 10){
            number=number + y;

            System.out.print(number);}


        System.out.println("\n");
        //int number2 = 11;
       //int y2 = 1;
        //while (number2 > 1){
         //   number2=number2-y2;
         //   System.out.print(number2);}

        for (int i2 =10; i2 > 0;i2--){
            System.out.print(i2);}



        //task 3
        System.out.println("\n");
        int population= 12_000_000;
        int birthRate = population / 1000 * 17;
        int mortality = 8;
        for (int p = 0;p <= 10;p++){
            population=population + birthRate - mortality;
            population = population + p;
            System.out.println("Год " + p + " численность населения составляет " + population);}


        //task 4
        System.out.println("\n");
        int amount = 15000;
        int am2 = 1;
        int am1 = 0;
        for (; am1 <12_000_000; am1++){
            am1 = amount / 100 * 7;
            amount = amount + am1;
            //System.out.println("Месяц "  + am2++ + " Сумма равна " + amount);
            if (am1 % 6 ==0) {System.out.println("Месяц "  + am2++ + " Сумма равна " + amount);// не понимаю как вывести каждый 6й месяц



        }





    }
        //task 5  не могу поять какой должен быть цикл...пробовал ,выводить каждое 6е число через for,не получилось, дошел до данной конструкции,но первое значение все равно не выводит
        System.out.println("\n");
        int friday= 5;
        int f1 = 0;
        while (f1 <7){
            friday = friday+f1;
            friday=friday+7;
            if (friday >= 31)
                break ;


            System.out.println("Сегодня пятница, " +friday + "е число.Необходимо подготовить отчет.");}



        //task 6 значение выводит ,но вообще не понятно ничего
        int comet = 1000;
        for (int day=0;day< 3000 ;day++){
            comet=comet+79;
            if( comet>1240)
                break;


            System.out.println (comet );}


        //task 7 про таблицу умножения вообще не понял)списывать с нэта смысла не вижу





















        }















    }