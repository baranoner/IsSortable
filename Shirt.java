public class Shirt implements ISortable {
  private String color;
  private String size;
  private int price;
  
  
  
public Shirt(String color, String size, int price) {
	super();
	this.color = color;
	this.size = size;
	this.price = price;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getSize() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}






public String toString() {
	return "color is  " + color + ", size is  " + size + ", price is  " + price;
}

public Boolean isGreater(ISortable o) throws Exception{
	boolean value;
	if(o.getClass() != this.getClass()) {
		throw new Exception();
	}
	else {
		Shirt v1 = (Shirt) o;
		if(v1.getPrice() >= price) {
			value = true;
		}
		else value = false; 
		
	}
	return value;
}
// This isgreater is very similar to the videofile one, except this one compares prices from the shirts.
  
  
}
