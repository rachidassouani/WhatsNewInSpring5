package io.rachidassouani;

public class ShowMessageBean implements MessageBean{

	@Override
	public void showMessage(String msg) {
		System.out.println(msg);
	}

}
