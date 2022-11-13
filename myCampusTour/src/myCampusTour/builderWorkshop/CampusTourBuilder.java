package myCampusTour.builderWorkshop;

public class CampusTourBuilder implements BuilderWorkshopI{
    public void construct(){
        visitBuilding();
        pickGift();
        selectCafeteria();
        attendLecture();
    }
}
