package Nigeria;

public enum GeoPoliticalZone {
    SOUTH_SOUTH("Akwa_Ibom","Bayelsa","Cross_River","Delta","Edo","Rivers"),
    NORTH_EAST ("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_CENTRAL ("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Platuea"),
    SOUTH_EAST ("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_WEST ("Ekiti","Lagos","Osun","Ogun","Oyo","Ondo"),
    NORTH_WEST ("Kaduna","Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara");

    private  String[] states;

    GeoPoliticalZone(String... state){
        this.states = state;
    }

   // public static String[] getStates() {
       // return states;
    //}


}
