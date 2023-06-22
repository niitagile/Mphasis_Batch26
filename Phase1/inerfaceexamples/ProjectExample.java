package inerfaceexamples;
interface SDLC{
	int maxdays=30;
	void problemstatement();
	void analysis();
}


class WebApplication implements SDLC{

	@Override  // annotations are special words to give any instruction to jvm
	public void problemstatement() {
		//maxdays=40;
		System.out.println("Require to develop a website for e-shopping");
	}

	@Override
	public void analysis() {
		System.out.println("Questionairs");
		
	}
	
}

class DesktopApplication implements SDLC{

	@Override
	public void problemstatement() {
		
		System.out.println("require to deleop a desktop application for jwellery shop");
	}

	@Override
	public void analysis() {
		System.out.println("questionairs aw well as studying existing project");
		
	}
	
}
public class ProjectExample {

	public static void main(String[] args) {
		WebApplication web=new WebApplication();
		web.problemstatement();
		web.analysis();
		DesktopApplication desk=new DesktopApplication();
		desk.problemstatement();
		desk.analysis();

	}

}


/*
interface SDLC{
	public final int maxdays=30;
	public abstract void problemstatement();
	public abstract void analysis();
}
*/