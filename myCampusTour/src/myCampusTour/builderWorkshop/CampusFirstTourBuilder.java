package myCampusTour.builderWorkshop;

/**
 * Campus First Tour Builder implementing Builder Workshop Interface
 * This class includes construct method:
 * the method has list of activities to be completed by the student.
 */
public class CampusFirstTourBuilder implements BuilderWorkshopI{

    public void construct(CampusTourI ct){
        ct.visitBuilding();
        ct.pickGift();
        ct.selectCafeteria();
        ct.attendLecture();
        ct.displayTour();
    }
}
