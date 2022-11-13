package myCampusTour.builderWorkshop;

public class CampusTourBuilder implements BuilderWorkshopI{
    public void construct(CampusTour ct){
        ct.visitBuilding();
        ct.pickGift();
        ct.selectCafeteria();
        ct.attendLecture();
    }
}
