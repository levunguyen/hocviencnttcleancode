package function.switchstatement;

public class Example {

	private static final String COMMISSIONED = null;
	private static final String HOURLY = null;
	private static final String SALARIED = null;

	public Money calculatePay(Employee e) throws InvalidEmployeeType {
		switch (e.type) {
		case COMMISSIONED:
			return calculateCommissionedPay(e);
		case HOURLY:
			return calculateHourlyPay(e);
		case SALARIED:
			return calculateSalariedPay(e);
		default:
			throw new InvalidEmployeeType(e.type);
		}
	}

	private Money calculateCommissionedPay(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	private Money calculateHourlyPay(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	private Money calculateSalariedPay(Employee e) {
		// TODO Auto-generated method stub
		return null;
	}
}
