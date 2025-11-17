public class BonusMilesService {
    public int calculate (int price) {
        int rubMile = 20;
        int miles = price / rubMile;
        return miles;
    }
}
