package exStreams;

import java.time.LocalDate;
import java.util.List;

public class order {
	Long id;
	String status;
	LocalDate orderDate;
	LocalDate deliveryDate;
	List<product> products;
	customer customer;
}
