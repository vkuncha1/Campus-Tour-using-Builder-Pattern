package myCampusTour.builderWorkshop;

/**
 * Campus Second Tour Builder implementing Builder Workshop Interface
 * This class includes construct method:
 * the method has list of activities to be completed by the student.
 */
public class CampusSecondTourBuilder implements BuilderWorkshopI{
    public void construct(CampusTourI ct){
        ct.pickGift();
        ct.attendLecture();
        ct.visitBuilding();
        ct.selectCafeteria();
        ct.displayTour();
    }
}
