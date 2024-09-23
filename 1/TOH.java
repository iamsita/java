public class TOH {
    public static void toh(int disk, char source, char dest, char aux) {
        if (disk == 1) {
            System.out.println("Move disk from " + source + " to " + dest);
            return;
        }
        toh(disk - 1, source, aux, dest);
        toh(1, source, dest, aux);
        toh(disk - 1, source, dest, aux);
    }

    public static void main(String[] args) {
        toh(3, 's', 'd', 'a');
    }
}
