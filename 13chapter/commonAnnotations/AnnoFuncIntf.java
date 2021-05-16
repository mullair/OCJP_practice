@FunctionalInterface
public interface AnnoFuncIntf{
	int goRunning();
	default int goRunning(int a){return a;};
	public abstract boolean equals(Object object);
	 }


