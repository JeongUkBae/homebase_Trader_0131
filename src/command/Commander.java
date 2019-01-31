package command;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import enums.Action;

public class Commander {
	public static Command order(HttpServletRequest request, 
						HttpServletResponse response) {
		Command cmd = null;
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case MOVE:
			cmd = new MoveCommand(request,response);
			break;
		case REGISTER:
			cmd = new MoveCommand(request,response);
			break;

		default:
			break;
		}
		return cmd;
		
	}
}
