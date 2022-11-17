package myCampusTour.builderWorkshop;

import myCampusTour.TourEnums.LectureEnum;
import myCampusTour.TourEnums.CafeteriaEnum;
import myCampusTour.TourEnums.TransitEnum;
import myCampusTour.TourEnums.BuildingEnum;
import myCampusTour.TourEnums.GiftEnum;
import myCampusTour.myTour.VisitBuildingI;
import myCampusTour.myTour.AttendLectureI;
import myCampusTour.myTour.PickGiftI;
import myCampusTour.myTour.VisitCafetiaI;
import myCampusTour.myTour.Building;
import myCampusTour.myTour.Gift;
import myCampusTour.myTour.Lecture;
import myCampusTour.myTour.Cafeteria;
import myCampusTour.util.Results;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/**
 * CampusTour class implementing responsible for calculating the
 * cost, effort, carbonfootprint and duration for each activity
 */

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
    private static final DecimalFormat df = new DecimalFormat("0.00");


    ArrayList<Double> storeCo2 = new ArrayList<Double>();
    ArrayList<Double> storeCost= new ArrayList<Double>();
    ArrayList<Integer> storeEffort = new ArrayList<Integer>();
    ArrayList<Integer> storeDuration = new ArrayList<Integer>();
    HashMap<String, String> activityList = new LinkedHashMap<String, String>();


    VisitBuildingI building = new Building();
    VisitCafetiaI cafeteria = new Cafeteria();
    PickGiftI gift = new Gift();
    AttendLectureI lecture =new Lecture();
    Results result = new Results();

    /**
     * Constructor
     */
    public CampusTour(BuildingEnum buildingIn, CafeteriaEnum cafeteriaIn, GiftEnum giftIn, LectureEnum lectureIn, TransitEnum transitIn){
        buildingName = buildingIn.name();
        cafeteriaName = cafeteriaIn.name();
        giftLocation = giftIn.name();
        lectureName = lectureIn.name();
        transitBy = transitIn.name();
    }


    /**
     * visitBuilding method to print the cost, carbonfootprint, duration and effort
     * stores the cost, carbonfootprint, duration and effort in key,value list
     */
    public void visitBuilding(){
        String buildingVisited = buildingName;
        if (transitBy.equals("BUS")){
            carbonfootprint = building.carbonFootCal(transitBy);
            cost = building.costCalc(transitBy);
            duration = building.durationCalc(transitBy);
            effort = building.effortCalc(transitBy);
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Building : "+buildingVisited+" ,Transit BY:"+transitBy +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            //Store the values in hashmap
            activityList.put("Activity: Visit Building",outputStr);
        } else if (transitBy.equals("WALK")) {
            carbonfootprint = building.carbonFootCal(transitBy);
            cost = building.costCalc(transitBy);
            duration = building.durationCalc(transitBy);
            effort = building.effortCalc(transitBy);
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Building : "+buildingVisited+" ,Transit BY:"+transitBy +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            //Store the values in hashmap
            activityList.put("Activity: Visit Building",outputStr);
        }
    }

    /**
     * pick gift method to print the cost, carbonfootprint, duration and effort
     * stores the cost, carbonfootprint, duration and effort in key,value list
     */

    public void pickGift(){
        if (giftLocation.equals("UNIVERSITY_UNION")){
            carbonfootprint = gift.carbonFootCal(GiftEnum.UNIVERSITY_UNION.name());
            cost = gift.costCalc(GiftEnum.UNIVERSITY_UNION.name());
            duration = gift.durationCalc(GiftEnum.UNIVERSITY_UNION.name());
            effort = gift.effortCalc(GiftEnum.UNIVERSITY_UNION.name());
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Location to Pick Gift : "+giftLocation +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            activityList.put("Activity: Pick Gift",outputStr);
        } else if (giftLocation.equals("EVENT_CENTER")) {
            carbonfootprint = gift.carbonFootCal(GiftEnum.EVENT_CENTER.name());
            cost = gift.costCalc(GiftEnum.EVENT_CENTER.name());
            duration = gift.durationCalc(GiftEnum.EVENT_CENTER.name());
            effort = gift.effortCalc(GiftEnum.EVENT_CENTER.name());
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Location to Pick Gift : "+giftLocation +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            activityList.put("Activity: Pick Gift",outputStr);
        }
    }

    /**
     * selecting cafeteria method to print the cost, carbonfootprint, duration and effort
     * stores the cost, carbonfootprint, duration and effort in key,value list
     */
    public void selectCafeteria(){
        if (cafeteriaName.equals("CIW")){
            carbonfootprint = cafeteria.carbonFootCal(CafeteriaEnum.CIW.name());
            cost = cafeteria.costCalc(CafeteriaEnum.CIW.name());
            duration = cafeteria.durationCalc(CafeteriaEnum.CIW.name());
            effort = cafeteria.effortCalc(CafeteriaEnum.CIW.name());
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Cafeteria for Lunch : "+cafeteriaName+"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            activityList.put("Activity: Choose Cafeteria",outputStr);
        } else if (cafeteriaName.equals("MOUNTAIN_VIEW")) {
            carbonfootprint = cafeteria.carbonFootCal(CafeteriaEnum.MOUNTAIN_VIEW.name());
            cost = cafeteria.costCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            duration = cafeteria.durationCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            effort = cafeteria.effortCalc(CafeteriaEnum.MOUNTAIN_VIEW.name());
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Cafeteria for Lunch : "+cafeteriaName +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$ [Orginal Cost:"+(cost/1.05)+"$ Surcharge: "+(0.05*(cost/1.05))+"$]\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            activityList.put("Activity: Choose Cafeteria",outputStr);
        }
    }

    /**
     * selecting lecture to print the cost, carbonfootprint, duration and effort
     * stores the cost, carbonfootprint, duration and effort in key,value list
     */
    public void attendLecture(){
        if (lectureName.equals("CS540")){
            carbonfootprint = lecture.carbonFootCal(LectureEnum.CS540.name());
            cost = lecture.costCalc(LectureEnum.CS540.name());
            duration = lecture.durationCalc(LectureEnum.CS540.name());
            effort = lecture.effortCalc(LectureEnum.CS540.name());
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Lecture : "+lectureName +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            activityList.put("Activity: Select Lecture",outputStr);
        } else if (lectureName.equals("CS542")) {
            carbonfootprint = lecture.carbonFootCal(LectureEnum.CS542.name());
            cost = lecture.costCalc(LectureEnum.CS542.name());
            duration = lecture.durationCalc(LectureEnum.CS542.name());
            effort = lecture.effortCalc(LectureEnum.CS542.name());
            storeCost.add(cost);
            storeCo2.add(carbonfootprint);
            storeDuration.add(duration);
            storeEffort.add(effort);
            outputStr = "Selected Lecture : "+lectureName +"\n"+ " Carbonfoot Print: "+ carbonfootprint +" co2\n"+" Cost : "+cost +"$ [Orginal Cost:"+(cost/1.10)+"$ Surcharge: "+(0.10*(cost/1.10))+"$]\n"+" Duration: "+ duration+" min\n"+" Effort: "+ effort+" Calories";
            activityList.put("Activity: Select Lecture",outputStr);
        }

    }




    /**
     *Get Sum of elements from Integer Arraylist
     */
    public Integer getIntSum(ArrayList<Integer> inp){
        Integer sum = 0;
        for (int i : inp) {
            sum += i;
        }
        return sum;
    }


    /**
     *Get Sum of elements from Double Arraylist
     */
    public Double getDoubleSum(ArrayList<Double> inp){
        Double sum = 0.0;
        for(Double d : inp)
            sum += d;
        return sum;
    }

    /**
     *Method to display the whole tour of student.
     */
    public void displayTour(){
        result.FileOutputDisplay("**************    Welcome to Binghamton University Tour    **************");
        result.TerminalOutput("**************    Welcome to Binghamton University Tour    **************");
        //Display Activity
        for (Map.Entry<String, String> set : activityList.entrySet()) {
            result.FileOutputDisplay(set.getKey() + " :\n " + set.getValue()+"\n");
            result.TerminalOutput(set.getKey() + " :\n " + set.getValue()+"\n");
        }
        //Display Total
        result.FileOutputDisplay("Total Tour Carbonfootprint: "+ df.format(getDoubleSum(storeCo2))+" co2"+", cost: "+getDoubleSum(storeCost)+"$, Duration: "+getIntSum(storeDuration)+" min, Effort: "+getIntSum(storeEffort) +" Calories");
        result.TerminalOutput("Total Tour Carbonfootprint: "+ df.format(getDoubleSum(storeCo2))+" co2"+", cost: "+getDoubleSum(storeCost)+"$, Duration: "+getIntSum(storeDuration)+" min, Effort: "+getIntSum(storeEffort) +" Calories");
        }
}
