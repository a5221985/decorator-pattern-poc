package org.startup.java.decorator_pattern_poc;

import org.startup.java.decorator_pattern_poc.decorators.CompressionDecorator;
import org.startup.java.decorator_pattern_poc.decorators.DataSource;
import org.startup.java.decorator_pattern_poc.decorators.DataSourceDecorator;
import org.startup.java.decorator_pattern_poc.decorators.EncryptionDecorator;
import org.startup.java.decorator_pattern_poc.decorators.FileDataSource;

public class Demo {

	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("C:/Users/161264/Documents/OutputDemo.txt")));
		encoded.writeData(salaryRecords);
		DataSource plain = new FileDataSource("C:/Users/161264/Documents/OutputDemo.txt");
		
		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(plain.readData());
		System.out.println("- Decoded --------------");
		System.out.println(encoded.readData());
	}

}
