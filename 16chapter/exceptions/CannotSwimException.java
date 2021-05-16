public class CannotSwimException extends RuntimeException{
	public CannotSwimException(){
		super();
	}
	public CannotSwimException(String message){
		super(message);
	}
	public CannotSwimException(Exception e){
		super(e);
	}
}
