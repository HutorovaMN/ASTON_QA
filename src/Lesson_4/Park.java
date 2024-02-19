package Lesson_4;

import java.math.BigDecimal;

/*3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 *  времени их работы и стоимости.*/
public class Park {

	public static class Attraction {
		String attractionName;
		String time;
		BigDecimal price;

		public Attraction(String attractionName, String time, BigDecimal price) {
			this.attractionName = attractionName;
			this.time = time;
			this.price = price;
		}

		@Override
		public String toString() {
			return "Attraction [attractionName=" + attractionName + ", time=" + time + ", price=" + price + "]";
		}

	}

}
