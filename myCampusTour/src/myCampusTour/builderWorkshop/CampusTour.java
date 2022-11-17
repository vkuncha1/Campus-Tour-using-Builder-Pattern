package myCampusTour.builderWorkshop;

import myCampusTour.TourEnums.*;
import myCampusTour.myTour.*;
import myCampusTour.util.FileDisplayInterface;
import myCampusTour.util.Results;
import myCampusTour.util.StdoutDisplayInterface;

import java.util.*;

public class CampusTour implements CampusTourI {
    private double carbonfootprint;
    private double cost;
    private Integer duration;
    private Integer effort;

    private String buildingName;
    private String cafeteriaName;
    private String giftLocation;
    private String lectureName;
    private String transitBy;

    private String outputStr;

    ArrayList<String> store_building_list = new ArrayList<String>();
    ArrayList<String> store_cafeteria_list = new ArrayList<String>();
    ArrayList<String> store_gift_list = new ArrayList<String>();
    ArrayList<String> store_lecture_list = new ArrayList<String>();

    HashMap<String, String> activityList = new LinkedHashMap<String, String>();


    VisitBuildingI building = new Building();
    VisitCafetiaI cafeteria = new Cafeteria();
    PickGiftI gift = new Gift();
    AttendLectureI lecture =new Lecture();

    Results result = new Results();

    public CampusTour(BuildingEnum buildingIn, CafeteriaEnum cafeteriaIn, GiftEnum giftIn, LectureEnum lectureIn, TransitEnum transitIn){
        buildingName = buildingIn.name();
        cafeteriaName = cafeteriaIn.name();
        giftLocation = giftIn.name();
        lectureName = lectureIn.name();
        transitBy = transitIn.name();
    }

    public void print_title_content(){
        System.out.println("**************    Welcome to Binghamton University Tour    **************");
    }

    /**
     * visitBuilding method to print the cost, carbonfootprint, duration and effort
     * stores the value in list
     */
    public void visitBuilding(){
        String buildingVisited = buildingName;
        if (transitBy.equals("BUS")){
            carbonfootprint = building.carbonFootCal(transitBy);
            cost = building.costCalc(transitBy);
            duration = building.durationCalc(transitBy);
            effort = building.effortCalc(transitBy);
            outputStr = "Selected Building : "+buildingVisited+" ,Transit BY: BUS" +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            //Store the values in hashmap
            activityList.put("Activity: Visit Building",outputStr);
        } else if (transitBy.equals("WALK")) {
            carbonfootprint = building.carbonFootCal(transitBy);
            cost = building.costCalc(transitBy);
            duration = building.durationCalc(transitBy);
            effort = building.effortCalc(transitBy);
            outputStr = "Selected Building : "+buildingVisited+" ,Transit BY: Walk" +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            //Store the values in hashmap
            activityList.put("Activity: Visit Building",outputStr);
        }
    }

    public void pickGift(){
        if (giftLocation.equals("UNIVERSITY_UNION")){
            carbonfootprint = gift.carbonFootCal(GiftEnum.UNIVERSITY_UNION.name());
            cost = gift.costCalc(GiftEnum.UNIVERSITY_UNION.name());
            duration = gift.durationCalc(GiftEnum.UNIVERSITY_UNION.name());
            effort = gift.effortCalc(GiftEnum.UNIVERSITY_UNION.name());
            outputStr = "Selected Location to Pick Gift : "+giftLocation +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            activityList.put("Activity: Pick Gift",outputStr);
        } else if (giftLocation.equals("EVENT_CENTER")) {
            carbonfootprint = gift.carbonFootCal(GiftEnum.EVENT_CENTER.name());
            cost = gift.costCalc(GiftEnum.EVENT_CENTER.name());
            duration = gift.durationCalc(GiftEnum.EVENT_CENTER.name());
            effort = gift.effortCalc(GiftEnum.EVENT_CENTER.name());
            outputStr = "Selected Location to Pick Gift : "+giftLocation +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            activityList.put("Activity: Pick Gift",outputStr);
        }
    }

    public void selectCafeteria(){
        if (cafeteriaName.equals("CIW")){
            carbonfootprint = cafeteria.carbonFootCal(CafeteriaEnum.CIW.name());
            cost = cafeteria.costCalc(CafeteriaEnum.CIW.name());
            duration = cafeteria.durationCalc(CafeteriaEnum.CIW.name());
            effort = cafeteria.effortCalc(CafeteriaEnum.CIW.name());
            outputStr = "Selected Cafeteria for Lunch : "+cafeteriaName+"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            activityList.put("Activity: Choose Cafeteria",outputStr);
        } else if (cafeteriaName.equals("MOUNTAIN_VIEW")) {
            carbonfootprint = cafeteria.carbonFootCal(CafeteriaEnum.MOUNTAIN_VIEW.name());
            cost = cafeteria.costCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            duration = cafeteria.durationCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            effort = cafeteria.effortCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            outputStr = "Selected Cafeteria for Lunch : "+cafeteriaName +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"$ [Orginal Cost:"+(cost/1.05)+"$ Surcharge: "+(0.05*(cost/1.05))+"$]\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            activityList.put("Activity: Choose Cafeteria",outputStr);
        }
    }

    public void attendLecture(){
        if (lectureName.equals("CS540")){
            carbonfootprint = lecture.carbonFootCal(LectureEnum.CS540.name());
            cost = lecture.costCalc(LectureEnum.CS540.name());
            duration = lecture.durationCalc(LectureEnum.CS540.name());
            effort = lecture.effortCalc(LectureEnum.CS540.name());
            outputStr = "Selected Lecture : "+lectureName +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            activityList.put("Activity: Select Lecture",outputStr);
        } else if (lectureName.equals("CS542")) {
            carbonfootprint = lecture.carbonFootCal(LectureEnum.CS542.name());
            cost = lecture.costCalc(LectureEnum.CS542.name());
            duration = lecture.durationCalc(LectureEnum.CS542.name());
            effort = lecture.effortCalc(LectureEnum.CS542.name());
            outputStr = "Selected Lecture : "+lectureName +"\n"+ " Carbonfoot Print: "+ carbonfootprint +"\n"+" Cost : "+cost +"$ [Orginal Cost:"+(cost/1.10)+"$ Surcharge: "+(0.10*(cost/1.10))+"$]\n"+" Duration: "+ duration+"\n"+" Effort: "+ effort;
            activityList.put("Activity: Select Lecture",outputStr);
        }

    }

    public void displayTour(){
        System.out.println("**************    Welcome to Binghamton University Tour    **************");
        //Display Activity visitBuilding
        for (Map.Entry<String, String> set : activityList.entrySet()) {
            System.out.println(set.getKey() + " :\n " + set.getValue()+"\n");
        }
        }

}
