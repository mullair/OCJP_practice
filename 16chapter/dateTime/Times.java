import java.time.*;
public class Times{
	public static void main(String[] args){
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalDate.of(2021,Month.APRIL,20));
		System.out.println(ZonedDateTime.now());
		System.out.println(LocalTime.of(6,15));
		System.out.println(LocalTime.of(6,15));
		LocalDate local=LocalDate.of(2022,12,30);
		System.out.println(LocalTime.of(6,15));
		System.out.println(local.getDayOfWeek());
		System.out.println(local.getMonth());
		System.out.println(local.getYear());
		System.out.println(local.getDayOfYear());
		LocalTime time = LocalTime.of(12,50);
		LocalDateTime datetime = LocalDateTime.of(local,time);
		System.out.println(local.format(DateTimeFormatter.ISO_LOCAL_DATE));
	}
}
