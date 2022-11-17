package myCampusTour.builderWorkshop;

public class CampusFirstTourBuilder implements BuilderWorkshopI{
    public void construct(CampusTour ct){
        ct.visitBuilding();
        ct.pickGift();
        ct.selectCafeteria();
        ct.attendLecture();
        ct.displayTour();
    }
}
