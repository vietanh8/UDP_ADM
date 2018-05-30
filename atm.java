import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class atm extends UnicastRemoteObject implements atmInterface {
	int taikhoan;
	public atm() throws RemoteException {
		super();
		taikhoan=0;
	}

	public int kttk() throws RemoteException {
		// TODO Auto-generated method stub
		return taikhoan;
	}

	public void naptien(int x) throws RemoteException {
		// TODO Auto-generated method stub
		taikhoan+=x;
	}

	public void ruttien(int x) throws RemoteException {
		// TODO Auto-generated method stub
		taikhoan-=x;
	}
	
}