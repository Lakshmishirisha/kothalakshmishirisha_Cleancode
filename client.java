import construction_cost.cost_calc;
import simplecompound.interest;

class client{
	public static void main(String[] args) {
		interest i = new interest();
		i.calc();
		cost_calc c = new cost_calc();
		c.cost(); 
	}
}