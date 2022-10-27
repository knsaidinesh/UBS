package hackerrank;

import java.util.HashMap;
import java.util.stream.Collectors;



public enum Furniture {
	CHAIR("Chair", 100.0f),
	TABLE("Table", 250.0f),
	COUCH("Couch", 500.0f);

	public void addToOrder(final Furniture type, final int furnitureCount) 
	{ 
		Integer count = 0; if(furnitures.containsKey(type)) { count = furnitures.get(type); } furnitures.put(type, count + furnitureCount); 
	}
	private final String label;
	private final float cost;
        public HashMap<Furniture, Integer> getOrderedFurniture()
	{ 
		return new HashMap<Furniture, Integer>(furnitures);
	}
	public float getTotalOrderCost()
	{
		if(!furnitures.isEmpty()) 
		{
			return furnitures.entrySet().stream()    .map(f -> f.getKey().cost() * f.getValue())    .collect(Collectors.toList())    .stream()    .reduce(Float::sum)    .get(); } return 0.0f;
	}
	Furniture(String label, float cost) 
	{
		this.label = label;
		this.cost = cost;
	}

	public int getTypeCount(Furniture type) { if(furnitures.containsKey(type)) {  
		return furnitures.get(type);
	} 
         return 0;
	}
	public String label() {
		return null;
	}

	return furnitures.entrySet().stream()    .map(f -> f.getKey().cost() * f.getValue())    .collect(Collectors.toList())    .stream()    .reduce(Float::sum)    .get();
       } 
     return 0.0f;
       }
	public float cost() 
	{
		return -1.0f;
	}
}
