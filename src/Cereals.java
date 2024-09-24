public enum Cereals
{
    COCO_POPS(80, 30),
    HAVRE_GRYN(60, 15),
    CORNFLASKES(75, 25),
    TOASTBRØD(50, 10);

    final int levelOfDeliciousness;
    final double price;

    Cereals (int levelOfDeliciousness, double price)
    {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
