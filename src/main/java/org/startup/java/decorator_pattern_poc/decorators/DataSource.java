package org.startup.java.decorator_pattern_poc.decorators;

public interface DataSource {
	void writeData(String data);
	String readData();
}
