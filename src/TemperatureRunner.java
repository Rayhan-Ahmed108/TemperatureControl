public class TemperatureRunner {
    public static void main(String[] args) {
RangeInput ctInput = new RangeInput(40,60);
        System.out.println("Current Temperature:" +ctInput.getCurrentTemperature());
        ctInput.up();
        ctInput.up();
        System.out.println("Current Temperature:" +ctInput.getCurrentTemperature());
        ctInput.down();
        ctInput.up();
        System.out.println("Current Temperature:" +ctInput.getCurrentTemperature());
    }
}
