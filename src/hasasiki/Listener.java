package hasasiki;

import javax.jms.*;

public class Listener implements MessageListener {
	public void onMessage(Message message) {
		try {
			System.out.println("��Ϣ������һ�յ�����Ϣ��"+((TextMessage) message).getText());
			
		}catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
