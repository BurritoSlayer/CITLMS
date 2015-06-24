package application;

public class TestQuery {
	DBconnection db = new DBconnection();
	public void TestDB(){
		db.setShowData("");
		db.query("Select * From Account Where ID = '1'");
		System.out.println(db.getShowData());
	}
	
	public static void main(String Args[]){
		TestQuery tq = new TestQuery();
		tq.TestDB();
	}
}
