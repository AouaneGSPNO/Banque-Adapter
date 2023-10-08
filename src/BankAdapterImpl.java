import java.io.File;

public class BankAdapterImpl implements BankAdapter {

  File XML;
  public File Compte(File XML) {
    this.XML = XML;
    return XML;
  }

  @Override
  public File Compte() {
    System.out.println ("Conversion JSON to XML réussie");
    return XML;
  }
}
