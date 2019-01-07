package jar;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;
import org.json.*;
import org.junit.Test;

public class JsonParsingTest {
	
	@Test
	public void testMinPriceList() throws Exception 
	{
		JsonParsing output = new JsonParsing();
		Object[] result =  output.getCarRentalData();
		String expected = "[{\"metadata\":{\"Color\":\"Red\",\"Notes\":\"Scratches on the front side of the car\"},\"perdayrent\":{\"Discount\":15,\"Price\":112},\"model\":\"A7\",\"vin\":\"09AGHY64352JITEG98K\",\"metrics\":{\"yoymaintenancecost\":2190.76,\"rentalcount\":{\"lastweek\":4,\"yeartodate\":221},\"depreciation\":2256.43},\"make\":\"Audi\"}]";
		//System.out.println(result[0].toString());
		assertEquals(result[0].toString(),expected);
	}

	@Test
	public void testMinDiscountList() throws Exception 
	{
		JsonParsing output = new JsonParsing();
		Object[] result =  output.getCarRentalData();
		String expected = "[{\"metadata\":{\"Color\":\"Blue\",\"Notes\":\"No scraches\"},\"perdayrent\":{\"Discount\":9,\"Price\":155},\"model\":\"3\",\"vin\":\"09AGHY64352JITEG98K\",\"metrics\":{\"yoymaintenancecost\":2190.76,\"rentalcount\":{\"lastweek\":4,\"yeartodate\":221},\"depreciation\":2256.43},\"make\":\"Tesla\"}]";
		assertEquals(result[1].toString(),expected);	 
	}

	@Test
	public void testMaxRevenue() throws Exception 
	{
		JsonParsing output = new JsonParsing();
		Object[] result =  output.getCarRentalData();
		String expected = "[{\"metadata\":{\"Color\":\"Blue\",\"Notes\":\"No scraches\"},\"perdayrent\":{\"Discount\":9,\"Price\":155},\"model\":\"3\",\"vin\":\"09AGHY64352JITEG98K\",\"metrics\":{\"yoymaintenancecost\":2190.76,\"rentalcount\":{\"lastweek\":4,\"yeartodate\":221},\"depreciation\":2256.43},\"make\":\"Tesla\"}]";
		assertEquals(result[2].toString(),expected);	 
	}

	@Test
	public void testSelectedCars() throws Exception 
	{
		JsonParsing output = new JsonParsing();
		Object[] result =  output.getCarRentalData();
		String expected = "[{\"metadata\":{\"Color\":\"Blue\",\"Notes\":\"Scratches on the front side of the car\"},\"perdayrent\":{\"Discount\":20,\"Price\":140},\"model\":\"A7\",\"vin\":\"09AGHY64352JITEG98K\",\"metrics\":{\"yoymaintenancecost\":2255.08,\"rentalcount\":{\"lastweek\":4,\"yeartodate\":198},\"depreciation\":2476.57},\"make\":\"Tesla\"}, {\"metadata\":{\"Color\":\"Blue\",\"Notes\":\"No scraches\"},\"perdayrent\":{\"Discount\":9,\"Price\":155},\"model\":\"3\",\"vin\":\"09AGHY64352JITEG98K\",\"metrics\":{\"yoymaintenancecost\":2190.76,\"rentalcount\":{\"lastweek\":4,\"yeartodate\":221},\"depreciation\":2256.43},\"make\":\"Tesla\"}]";
		assertEquals(result[3].toString(),expected);	 
	}
}
