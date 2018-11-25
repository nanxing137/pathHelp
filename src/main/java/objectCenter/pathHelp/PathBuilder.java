package objectCenter.pathHelp;

public interface PathBuilder {
	URI build();
	PathBuilder setPathType(PathEnum pathEnum);
	PathBuilder setIOType(IOEnum ioEnum);
	PathBuilder and(String path);
	static PathBuilder get() {
		return null;
	};
}
