package exam07_7;

public class MySQLDAO implements DBDAO{

	// MYSQLDAO 연동하는 메서드
	@Override
	public void connect() {
		System.out.println("MySQLDAO.connect_oracle");
	}
}
