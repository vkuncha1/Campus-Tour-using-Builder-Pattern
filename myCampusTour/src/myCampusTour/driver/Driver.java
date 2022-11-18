package myCampusTour.driver;

import myCampusTour.TourEnums.LectureEnum;
import myCampusTour.TourEnums.CafeteriaEnum;
import myCampusTour.TourEnums.TransitEnum;
import myCampusTour.TourEnums.BuildingEnum;
import myCampusTour.TourEnums.GiftEnum;
import myCampusTour.builderWorkshop.BuilderWorkshopI;
import myCampusTour.builderWorkshop.CampusTour;
import myCampusTour.builderWorkshop.CampusFirstTourBuilder;
import myCampusTour.builderWorkshop.CampusSecondTourBuilder;
import myCampusTour.builderWorkshop.CampusTourI;

/**
 * Driver code used by student for write their orientation plan.
 * @author venkata achyuth kunchapu
 *
 */
public class Driver {
	public static void main(String[] args) {

		if (args.length != 2 || args[0].equals("errorLog.txt") || args[1].equals("${arg1}")) {
		//First Instance
		CampusTourI myFirstTour = new CampusTour(BuildingEnum.WATSON, CafeteriaEnum.MOUNTAIN_VIEW, GiftEnum.EVENT_CENTER, LectureEnum.CS542, TransitEnum.WALK);
		BuilderWorkshopI mbw = new CampusFirstTourBuilder();
		mbw.construct(myFirstTour);
		//Second Instance
		CampusTourI mySecondTour = new CampusTour(BuildingEnum.ITC, CafeteriaEnum.CIW, GiftEnum.UNIVERSITY_UNION, LectureEnum.CS540, TransitEnum.BUS);
		BuilderWorkshopI sbw = new CampusSecondTourBuilder();
		sbw.construct(mySecondTour);
		}
		else{
			System.err.println("Error: Incorrect number of arguments. Program accepts 2 argumnets.");
			System.exit(0);
		}

	}
}
