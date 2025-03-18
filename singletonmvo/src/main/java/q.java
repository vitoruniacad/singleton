public class q {

    private static q instance;
    private String qPositions;
    private q() {
        qPositions = "Uma Impressão na Fila";
    }


    public static q getInstance() {
            synchronized (q.class) {
                if (instance == null) {
                    instance = new q();
            }
        }
        return instance;
    }

    public String getqPositions() {
        return qPositions;
    }
}