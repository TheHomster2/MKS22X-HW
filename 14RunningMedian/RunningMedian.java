public class RunningMedian{

private MyHeap maximum;
private MyHeap minimum;

public RunningMedian(){
	maximum = new MyHeap(true);
	minimum = new MyHeap(false);
}

public void add(int value){
	if (minimum.size() == 0){
		minimum.add(value);
	}
	else if (maximum.size() == 0) {
	    maximum.add(value);
	}		
	else{
		if (value > getMedian()){
			maximum.add(value);
		}
		else{
			minimum.add(value);
		}
	}
	while ((Math.abs(minimum.size() - maximum.size())) > 1) {
	    if (maximum.size() - 1 > minimum.size()) {
		minimum.add(maximum.remove());
	    }
	    if (maximum.size() < minimum.size() - 1) {
		maximum.add(minimum.remove());
		}
	}
}

public double getMedian(){
	if (maximum.size() == minimum.size()){
		return (maximum.peek() + minimum.peek()) / 2.0;
	}
	else if (minimum.size() > maximum.size()){
		return minimum.peek();
	}
	else{
		return maximum.peek();
	}
}
}