public class VideoFile implements ISortable {
  private String name;
  private int lenght;
  private int resolution;
  
  
public VideoFile(String name, int lenght, int resolution) {
	super();
	this.name = name;
	this.lenght = lenght;
	this.resolution = resolution;
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getLenght() {
	return lenght;
}


public void setLenght(int lenght) {
	this.lenght = lenght;
}


public int getResolution() {
	return resolution;
}


public void setResolution(int resolution) {
	this.resolution = resolution;
}






public String toString() {
	return "name is " + name + ", lenght is" + lenght + ", resolution is" + resolution;
}

public Boolean isGreater(ISortable o) throws Exception{
	boolean value;
	if(o.getClass() != this.getClass()) {
		throw new Exception();
	}
	else {
		VideoFile v1 = (VideoFile) o;
		if(v1.getLenght() >= lenght) {
			value = true;
		}
		else value = false; 
		
	}
	return value;
}
// this method has a parameter ISortable which can take any object from this interface. Method checks if the given ISortable is videofile or not. if it is not it gives exception.
// if it is videofile, the method simply compares the lenghts and returns a boolean value.
