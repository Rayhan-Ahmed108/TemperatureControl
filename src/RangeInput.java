public class RangeInput {
    private int minTemperature, maxTemperature,currentTemperature;
    public RangeInput(){
        this.minTemperature = 60;
        this.maxTemperature = 80;
        setAvgTemperature();
    }
    public RangeInput(int min, int max){
        this.minTemperature=min;
        this.maxTemperature=max;
        setAvgTemperature();
    }
    private void setAvgTemperature(){
        this.currentTemperature = (maxTemperature +minTemperature) / 2;
    }
    public void up(){
        this.currentTemperature= Math.min(currentTemperature+1,maxTemperature);
    }
    public void down(){
        this.currentTemperature= Math.max(currentTemperature-1,minTemperature);
    }
    public int getCurrentTemperature(){
        return this.currentTemperature;
    }
}
