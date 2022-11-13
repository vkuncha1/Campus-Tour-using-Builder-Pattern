package myCampusTour.builderWorkshop;

import myCampusTour.TourEnums.*;
import myCampusTour.myTour.*;

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

    VisitBuildingI building = new Building();
    VisitCafetiaI cafeteria = new Cafeteria();
    PickGiftI gift = new Gift();
    AttendLectureI lecture =new Lecture();

    public CampusTour(BuildingEnum buildingIn, CafeteriaEnum cafeteriaIn, GiftEnum giftIn, LectureEnum lectureIn, TransitEnum transitIn){
        buildingName = buildingIn.name();
        cafeteriaName = cafeteriaIn.name();
        giftLocation = giftIn.name();
        lectureName = lectureIn.name();
        transitBy = transitIn.name();
    }

    public void print_title_content(){
        //outputStr = outputStr + strIn;
        System.out.println("**************    Welcome to Binghamton University Tour    **************");
    }


    public void print_content(String strIn){
        System.out.println("\n");
        System.out.println(outputStr);
    }

    public void visitBuilding(){
        String buildingVisited = buildingName;
        if (transitBy.equals("BUS")){
            System.out.println(transitBy);
            carbonfootprint = building.carbonFootCal(transitBy);
            cost = building.costCalc(transitBy);
            duration = building.duractionCalc(transitBy);
            effort = building.effortCalc(transitBy);
            outputStr = "Selected Building : "+buildingVisited+" ,Transit BY: BUS" +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);




            System.out.println("Welcome to the Building, You have reached by Bus");
        } else if (transitBy.equals("WALK")) {
            carbonfootprint = building.carbonFootCal(transitBy);
            cost = building.costCalc(transitBy);
            duration = building.duractionCalc(transitBy);
            effort = building.effortCalc(transitBy);
            outputStr = "Selected Building : "+buildingVisited+" ,Transit BY: Walk" +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        }
    }

    public void pickGift(){
        if (giftLocation.equals("UNIVERSITY_UNION")){
            carbonfootprint = gift.carbonFootCal(GiftEnum.UNIVERSITY_UNION.name());
            cost = gift.costCalc(GiftEnum.UNIVERSITY_UNION.name());
            duration = gift.duractionCalc(GiftEnum.UNIVERSITY_UNION.name());
            effort = gift.effortCalc(GiftEnum.UNIVERSITY_UNION.name());
            outputStr = "Selected Location to Pick Gift : "+giftLocation +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        } else if (giftLocation.equals("EVENT_CENTER")) {
            carbonfootprint = gift.carbonFootCal(GiftEnum.EVENT_CENTER.name());
            cost = gift.costCalc(GiftEnum.EVENT_CENTER.name());
            duration = gift.duractionCalc(GiftEnum.EVENT_CENTER.name());
            effort = gift.effortCalc(GiftEnum.EVENT_CENTER.name());
            outputStr = "Selected Location to Pick Gift : "+giftLocation +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        }
    }

    public void selectCafeteria(){
        if (cafeteriaName.equals("CIW")){
            carbonfootprint = cafeteria.carbonFootCal(CafeteriaEnum.CIW.name());
            cost = cafeteria.costCalc(CafeteriaEnum.CIW.name());
            duration = cafeteria.duractionCalc(CafeteriaEnum.CIW.name());
            effort = cafeteria.effortCalc(CafeteriaEnum.CIW.name());
            outputStr = "Selected Cafeteria for Lunch : "+cafeteriaName+"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        } else if (cafeteriaName.equals("MOUTAIN_VIEW")) {
            carbonfootprint = cafeteria.carbonFootCal(CafeteriaEnum.MOUNTAIN_VIEW.name());
            cost = cafeteria.costCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            duration = cafeteria.duractionCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            effort = cafeteria.effortCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            outputStr = "Selected Cafeteria for Lunch : "+cafeteriaName +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        }
    }

    public void attendLecture(){
        if (lectureName.equals("CS540")){
            carbonfootprint = lecture.carbonFootCal(LectureEnum.CS540.name());
            cost = lecture.costCalc(LectureEnum.CS540.name());
            duration = lecture.duractionCalc(LectureEnum.CS540.name());
            effort = lecture.effortCalc(LectureEnum.CS540.name());
            outputStr = "Selected Lecture : "+lectureName +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        } else if (lectureName.equals("CS542")) {
            carbonfootprint = lecture.carbonFootCal(LectureEnum.CS542.name());
            cost = lecture.costCalc(LectureEnum.CS542.name());
            duration = lecture.duractionCalc(LectureEnum.CS542.name());
            effort = lecture.effortCalc(LectureEnum.CS542.name());
            outputStr = "Selected Lecture : "+lectureName +"\n"+ "Carbonfoot Print: "+ carbonfootprint +"\n"+"Cost : "+cost +"\n"+"Duration: "+ duration+"\n"+"Effort: "+ effort;
            print_content(outputStr);
        }

    }

}
