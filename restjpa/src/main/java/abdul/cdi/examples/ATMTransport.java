package abdul.cdi.examples;

public interface ATMTransport {
	public void communicateWithBank(byte[] datapacket);
	public void setRetries(int retries);
}
