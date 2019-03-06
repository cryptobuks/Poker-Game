package server;


class LoginCommand extends Command {
	

	LoginCommand(ConnectionTracker connectionTracker) {
		super(connectionTracker);
	}

	@Override
	public void execute(MessageBox messageBox) {
		setUserName(messageBox.getData());
		registerSender();
	}

	private void setUserName(String username) {
		getMessageSender().getUser().setName(username);
	}

	private void registerSender() {
		getConnectionTracker().getSession("global").addUser(getMessageSender());
	}
}
