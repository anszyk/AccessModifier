package AccessModifier.DateAndTime; //Работа с датой page 130

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now(); //метод now() создает новый объект LocalDateTime(объект будет содержать текущее значение времени)
        System.out.println("\nСейчас " + today);

        //currentTime = currentTime.withYear(2018); //метод withYear() изменяет значение поля Год
        //System.out.println("\nТеперь текущее время " + currentTime);

        String fields = "\nГод: \t\t\t" + today.getYear();
        fields += "\nМесяц: \t\t\t" + today.getMonth(); //использование конкатенации строк применяется для вывода, поскольку функция println() вызывается только один раз
        fields += "\nНомер месяца: \t" + today.getMonthValue();
        fields += "\nДень недели: \t" + today.getDayOfWeek();
        fields += "\nДень месяца: \t" + today.getDayOfMonth();
        fields += "\nДень в году: \t" + today.getDayOfYear();
        fields += "\nЧас (0-23): \t" + today.getHour();
        fields += "\nМинута: \t\t" + today.getMinute();
        fields += "\nСекунда: \t\t" + today.getSecond();
        System.out.println(fields);
        System.out.println(" ");

        LocalDateTime payday = LocalDateTime.of(2022,04,20,13,55, 01);

        long seconds = ChronoUnit.SECONDS.between(today, payday); //нашли разницу в секундах, преобразовываем в нормальный вид:

        int day = (int) TimeUnit.SECONDS.toDays(seconds);
        long hours = TimeUnit.SECONDS.toHours(seconds) - TimeUnit.DAYS.toHours(day);
        // TimeUnit.SECONDS.toHours(секунды) даст прямое преобразование от секунд до часа (без учета дней, которые вы уже рассчитали).
        // Минус часов в течение нескольких дней, которые у вас уже есть, день * 24. Теперь у вас осталось несколько часов.
        // То же самое для минуты и секунды. Вам нужно минус уже пройденный час и минуты соответственно
        long minute = TimeUnit.SECONDS.toMinutes(seconds) - TimeUnit.DAYS.toMinutes(day) - TimeUnit.HOURS.toMinutes(hours);
        long second = TimeUnit.SECONDS.toSeconds(seconds) - TimeUnit.DAYS.toSeconds(day) - TimeUnit.HOURS.toSeconds(hours) -
                TimeUnit.MINUTES.toSeconds(minute);

        System.out.println("Осталось до зп: " + day + " день, " + hours + " часов, "  + minute + " минут, "  + second + " секунд");
        System.out.println("Осталось до зп: " + day + ".0" + hours + ":"  + minute + ":"  + second);

        /*DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d, hh:mm:ss");
        String txt = String.valueOf(day) + String.valueOf(hours) + String.valueOf(minute) + String.valueOf(second);
        System.out.println(txt);
        long millisecond = Long.parseLong(txt);*/



    }
}









