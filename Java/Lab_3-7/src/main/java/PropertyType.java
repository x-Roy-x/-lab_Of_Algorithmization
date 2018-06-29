
public enum PropertyType {
    Life(4), Health(3), Car(2), Pension(1), House(3), Catastrofe(5), Fire(4), Bankruptcy(3);

    private int coefficientProperty;


    PropertyType(int coefficientProperty) {
        this.coefficientProperty = coefficientProperty;
    }

    public int getCoefficientProperty() {
        return coefficientProperty;
    }

}
