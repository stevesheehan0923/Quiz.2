package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import core.CarPayment;

class CarPaymentTest {

	@Test
	void test() 
	{
		for(int i = 0; i <= 10000; i++)
		{
			CarPayment car = new CarPayment((Math.random() * 10000) + 5000, (Math.random() * 1000) + 100, Math.random(), (int) (Math.random() * 48) + 12);
			assertEquals(car.monthlyPayment(), (car.totalInterestPaid() + car.getTotalPriceOfCar()) / car.getLengthOfLoan(), 1);
			assertEquals(car.totalInterestPaid(), (car.monthlyPayment() * car.getLengthOfLoan()) - car.getTotalPriceOfCar(), 1);
		}
	}

}
