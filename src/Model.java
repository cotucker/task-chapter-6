public class Model extends SiemensMobile{
    String modelId;
    String display;
    int bataryCap;
    String OC;

    public Model(){

    }
    public Model(String ModelId, String Display, int BataryCap, String oc) {
        modelId = ModelId;
        display = Display;
        bataryCap = BataryCap;
        OC = oc;
    }
    @Override
    public void setSpecs(String ModelId, String Display, int BataryCap, String oc){
        modelId = ModelId;
        display = Display;
        bataryCap = BataryCap;
        OC = oc;
    }
    @Override
    public void getSpecs(){
        System.out.println("----------------------------------\n| Brend: " + brend + "\n| Model ID: " + modelId + "\n| Display: " + display + "\n| Battery: " + bataryCap + " mA/h\n| OC: " + OC + "\n----------------------------------\n");
    }
}
