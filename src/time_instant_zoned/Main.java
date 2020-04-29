package time_instant_zoned;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class Main {

	public static void main(String[] args) {
		Instant i1 = Instant.now();
		
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 11, 7, 7, 28, 59, 29, ZoneId.of("Asia/Tokyo"));
		
		Instant i3 = z2.toInstant();
		System.out.println(i3);
		System.out.println(z2);
		
		

	}

}