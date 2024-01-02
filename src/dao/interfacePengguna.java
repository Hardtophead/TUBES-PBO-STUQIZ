package dao;

import model.Pengguna;
import java.util.List;

public interface interfacePengguna {
    
    public void insert(Pengguna Pengguna1);
    
    public int login(String email, String pass, String role);
    
    public List<Pengguna> getUserData(String Role);
    
    public Pengguna userData(String email, String pass, String role);
}
