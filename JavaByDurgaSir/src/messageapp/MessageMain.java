package messageapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

//import com.mysql.jdbc.PreparedStatement;

public class MessageMain
{

	static Connection conn;

	public static void main(String[] args)
	{

		String jdbcUrl = "jdbc:mysql://localhost:3306/threads";
		String dbUser = "root";
		String dbPassword = "root";

		try
		{
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = (Connection) DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
			// here sonoo is database name, root is username and password

			String venderFilePath = "C:\\Java Program\\JavaByDurgaSir\\src\\messageapp\\csv\\VENDER.CSV";
			String messageToSendFilePath = "C:\\Java Program\\JavaByDurgaSir\\src\\messageapp\\csv\\MESSAGE_TO_SEND.CSV";
			String messageSentFilePath = "C:\\Java Program\\JavaByDurgaSir\\src\\messageapp\\csv\\MESSAGE_SENT.CSV";

//			CSVReader csvReader = new CSVReader(new FileReader(filePath));
//			List<String[]> csvData = csvReader.readAll();
//			for (String[] row : csvData) {
//				insertDataIntoDatabase(conn, row);
//
//			}
//			System.out.println("Data Inserted into the database Successfully");

			try
			{
//				ArrayList csvData = readDataFromCSV(venderFilePath);

//				System.out.print(csvData);
				String query = insertDataIntoDatabase("VENDOR", readDataFromCSV(venderFilePath));
				System.out.println(query);
				query = insertDataIntoDatabase("MESSAGE_TO_SEND", readDataFromCSV(messageToSendFilePath));
				System.out.println(query);
				query = insertDataIntoDatabase("MESSAGE_SENT", readDataFromCSV(messageSentFilePath));
				System.out.println(query);
			} catch (Exception e)
			{
				e.printStackTrace();
			}

		} catch (Exception e)
		{

			e.printStackTrace();
		}

	}

	public static ArrayList<String[]> readDataFromCSV(String path) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;
		boolean header = true;
		ArrayList<String[]> alString = new ArrayList<String[]>();
		while ((line = reader.readLine()) != null)
		{
			String[] values = line.split(",");
			if (header)
				header = false;
			else
				for (int i = 0; i < values.length; i++)
					if (!(values[i].contains("true") || values[i].contains("false")))
						values[i] = "'" + values[i] + "'";
			alString.add(values);
		}

		return alString;
	}

	private static String insertDataIntoDatabase(String tableName, ArrayList csvData) throws SQLException
	{
		String insertQuery = "INSERT INTO " + tableName;
		for (int line = 0; line < csvData.size(); line++)
		{
			String[] rowString = (String[]) csvData.get(line);
			String col = "";
			if (line == 0)
			{
				for (int colNo = 0; colNo < rowString.length; colNo++)
					col = col + rowString[colNo] + ", ";
				col = col.substring(0, col.length() - 2);
				insertQuery = insertQuery + " (" + col + ") values ";
			} else
			{

				for (int colNo = 0; colNo < rowString.length; colNo++)
					col = col + rowString[colNo] + ", ";
				col = col.substring(0, col.length() - 2);
				insertQuery = insertQuery + "(" + col + "), ";
			}
		}
		insertQuery = insertQuery.substring(0, insertQuery.length() - 2);
//		PreparedStatement psmt = (PreparedStatement) conn.prepareStatement(insertQuery);
//		psmt.executeUpdate();
		return insertQuery;
	}
}
