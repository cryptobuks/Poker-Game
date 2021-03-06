package server;


import protocol.MessageBox;

interface MessageHandler extends Runnable {

        void handle(MessageBox messageBox);

        SessionTracker getSessionTracker();

        MessageSender getMessageSender();
}
