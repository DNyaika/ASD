package adapter;

public interface TargetQueue {
	public void add(String str);

	public String remove();

	public boolean isEmpty();
}
