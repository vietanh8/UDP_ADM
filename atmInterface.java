import java.rmi.Remote;
import java.rmi.RemoteException;

public interface atmInterface extends Remote{
	public int kttk() throws RemoteException;
	public void naptien(int x) throws RemoteException;
	public void ruttien(int x) throws RemoteException;
}