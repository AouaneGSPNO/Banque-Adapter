public class Client  {
  String Id;
  String Nom;

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getNom() {
    return Nom;
  }

  public void setNom(String nom) {
    Nom = nom;
  }

  public Client(String id, String nom) {
    Id = id;
    Nom = nom;
  }
}

