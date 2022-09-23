package java1.ch11API클래스;

public class Controller {
	boolean create(String cdate, String ccomment) {
		return DAO.getInstance().create(cdate, ccomment);
	}
}
