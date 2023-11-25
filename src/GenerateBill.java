import java.io.*;
public class GenerateBill {

	public static void main(String[] args) throws Exception , IOException {
		GetPlanFactory PlanFactory = new GetPlanFactory();
		
		System.out.print("Enter name of Plan: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();
		
		
		System.out.print("Enter name of Plan: ");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = PlanFactory.getPlan(planName);
		
		System.out.print("Bill amount for" +planName+ " of "+units+" units is :");
		p.getRate();
		p.calculateBill(units);
	}

}
