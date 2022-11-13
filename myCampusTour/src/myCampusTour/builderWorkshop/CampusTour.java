package myCampusTour.builderWorkshop;

import myCampusTour.TourEnums.*;
import myCampusTour.myTour.Building;
import myCampusTour.myTour.Cafeteria;
import myCampusTour.myTour.Gift;
import myCampusTour.myTour.Lecture;

public class CampusTour implements campusTourI{
    private double carbonfootprint;
    private double cost;
    private Integer duration;
    private Integer effort;

    String buildingName;
    String cafeteriaName;
    String giftLocation;
    String LectureName;
    String TransitBy;

    Building building;
    Cafeteria cafeteria;
    Gift gift;
    Lecture lecture;





    public CampusTour(BuildingEnum buildingIn, CafeteriaEnum cafeteriaIn, GiftEnum giftIn, LectureEnum lectureIn, TransitEnum transitIn){
        buildingName = buildingIn.name();
        cafeteriaName = cafeteriaIn.name();
        giftLocation = giftIn.name();
        LectureName = lectureIn.name();
        TransitBy = transitIn.name();
    }


    public void visitBuilding(){
        if (buildingName.equals("WATSON")){
            carbonfootprint = building.carbonFootCal("WATSON");
            cost = building.costCalc("WATSON");
            duration = building.duractionCalc("WATSON");
            effort = building.effortCalc("WATSON");
        } else if (buildingName.equals("ITC")) {
            carbonfootprint = building.carbonFootCal("ITC");
            cost = building.costCalc("ITC");
            duration = building.duractionCalc("ITC");
            effort = building.effortCalc("ITC");
        }
    }

    public void pickGift(){
        if (buildingName.equals("UNIVERSITY_UNION")){
            carbonfootprint = building.carbonFootCal("UNIVERSITY_UNION");
            cost = building.costCalc("UNIVERSITY_UNION");
            duration = building.duractionCalc("UNIVERSITY_UNION");
            effort = building.effortCalc("UNIVERSITY_UNION");
        } else if (buildingName.equals("EVENT_CENTER")) {
            carbonfootprint = building.carbonFootCal("EVENT_CENTER");
            cost = building.costCalc("EVENT_CENTER");
            duration = building.duractionCalc("EVENT_CENTER");
            effort = building.effortCalc("EVENT_CENTER");
        }
    }

    public void selectCafeteria(){
        if (buildingName.equals("CIW")){
            carbonfootprint = building.carbonFootCal("CIW");
            cost = building.costCalc("CIW");
            duration = building.duractionCalc("CIW");
            effort = building.effortCalc("CIW");
        } else if (buildingName.equals("MOUTAIN_VIEW")) {
            carbonfootprint = building.carbonFootCal("MOUTAIN_VIEW");
            cost = building.costCalc("MOUTAIN_VIEW");
            duration = building.duractionCalc("MOUTAIN_VIEW");
            effort = building.effortCalc("MOUTAIN_VIEW");
        }
    }

    public void attendLecture(){
        if (buildingName.equals("CS540")){
            carbonfootprint = building.carbonFootCal("CS540");
            cost = building.costCalc("CS540");
            duration = building.duractionCalc("CS540");
            effort = building.effortCalc("CS540");
        } else if (buildingName.equals("CS542")) {
            carbonfootprint = building.carbonFootCal("CS542");
            cost = building.costCalc("CS542");
            duration = building.duractionCalc("CS542");
            effort = building.effortCalc("CS542");
        }

    }


}
