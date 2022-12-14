package task02;

import java.util.Comparator;

public class CommodityWeightComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return (int)(o1.getProductWeight()-o2.getProductWeight());
	}
}