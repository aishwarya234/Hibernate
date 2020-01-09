package inheritance;

//import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="JAVA")
public class JavaBook extends Book{
	
	private double dicount;

	public double getDicount() {
		return dicount;
	}

	public void setDicount(double dicount) {
		this.dicount = dicount;
	}

}
