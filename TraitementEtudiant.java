import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import gs_etudiant.Etudiant;
import java.util.logging.Logger;
 

public class TraitementEtudiant {
 
    PreparedStatement st = null;
    ResultSet rs = null;
    Connection con = null;
 
    public int save(Etudiant etu) {
        int save = 0;
        int idcat = 0;
        con = Connexion.getCon();
        String insert = "INSERT INTO etudiant(nom,prenom,sexe)VALUES(?,?,?)";
 
        try {
            st = con.prepareStatement(insert);
            st.setString(1, etu.getNom());
            st.setString(2, etu.getPrenom());
            st.setString(3, etu.getSexe());
            save = st.executeUpdate();
 
        } catch (SQLException ex) {
            Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return save;
    }
 
    public int delete_etudiant(Etudiant etu) {
        con = Connexion.getCon();
        int sup = 0;
        String delete = "DELETE FROM etudiant WHERE id = ?";
        try {
            st = con.prepareStatement(delete);
            st.setInt(1, etu.getId());
            sup = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        return sup;
 
    }
 
    public int update(Etudiant prod) {
        int edit = 0;
        con = Connexion.getCon();
        String update = "UPDATE etudiant SET nom =?,prenom =?,sexe =?  WHERE id =?";
        try {
 
            st = con.prepareStatement(update);
            st.setString(1, prod.getNom());
            st.setString(2, prod.getPrenom());
            st.setString(3, prod.getSexe());
            st.setInt(4,
                     prod.getId());
 
            edit = st.executeUpdate();
            st.close();
 
        } catch (SQLException e) {
 
            e.printStackTrace();
        }
 
        return edit;
 
    }
 
    public ArrayList<Etudiant> afficher() {
 
        ArrayList list = new ArrayList<Etudiant>();
        con = Connexion.getCon();
 
        String select = "SELECT * FROM etudiant";
        try {
            st = con.prepareStatement(select);;
            rs = st.executeQuery();
            while (rs.next()) {
                Etudiant etu = new Etudiant();
                etu.setId(rs.getInt("id"));
                etu.setNom(rs.getString("nom"));
                etu.setPrenom(rs.getString("prenom"));
                etu.setSexe(rs.getString("sexe"));
 
                list.add(etu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TraitementEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return list;
    }
 
}