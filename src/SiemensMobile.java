abstract public class SiemensMobile implements Mobile{
    final static String brend = "Siemens";
    @Override
    abstract public void setSpecs(String ModelId, String display, int BataryCap, String oc);
    @Override
    abstract public void getSpecs();
}
