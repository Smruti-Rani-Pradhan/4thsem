class Message{
	private String content;
	public Message(String content) {
		this.content=content;
	}
	public String getcontent() {
		return content;
	}
}
class Sender{
	public void sendMessage(Message message,Receiver receiver) {
		System.out.println("Sener:Sending message-"+message.getcontent());
		receiver.receiveMessage(message);
	}
}
class Receiver{
	public void receiveMessage(Message message) {
		System.out.println("Receiver: Message received-"+message.getcontent());
	}
}
public class msgpassing {

	public static void main(String[] args) {
		Message msg=new Message("WElCOME to java class!");
		Sender send=new Sender();
		Receiver rec=new Receiver();
		send.sendMessage(msg, rec);

	}

}
