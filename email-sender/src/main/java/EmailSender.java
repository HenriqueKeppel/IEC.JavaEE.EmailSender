public class EmailSender {

		public static void main(String[] args)
		{
			final String fromEmail = "";
			final String password = "";
			final String toEmail = "";
			
			System.out.println("Initializing email send");
			
			EmailConfig config = new EmailConfig();
			
			config.SendMail(fromEmail, password, toEmail, "Subject", "Email Body");
		}
}
