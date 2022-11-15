package myCampusTour.driver;

import myCampusTour.TourEnums.*;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.CampusTour;
import myCampusTour.builderWorkshop.CampusTourBuilder;
import myCampusTour.builderWorkshop.CampusTourI;

/**
 * Driver code used by student for write their orientation plan.
 * @author venkata achyuth kunchapu
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		//First Instance
		CampusTourI myFirstTour = new CampusTour(BuildingEnum.WATSON, CafeteriaEnum.MOUNTAIN_VIEW, GiftEnum.EVENT_CENTER, LectureEnum.CS542, TransitEnum.WALK);
		BuilderWorkshopI mbw = new CampusTourBuilder();
		mbw.construct((CampusTour) myFirstTour);
		//Second Instance



//	    if (args.length != 2 || args[0].equals("${arg0}") || args[1].equals("${arg1}")) {
//
//			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
//			System.exit(0);
//		}


	}
}
