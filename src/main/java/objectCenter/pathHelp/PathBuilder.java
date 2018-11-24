package objectCenter.pathHelp;

public interface PathBuilder {
	Path build();
	PathBuilder setPathType(PathEnum pathEnum);
	PathBuilder setIOType(IOEnum ioEnum);
	PathBuilder and(String path);
	static PathBuilder get() {
		return null;
	};
}
