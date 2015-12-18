package cn.jeb.models.command.abstractBean;

public interface Command {

	void execute();
	
	void undo();
}
