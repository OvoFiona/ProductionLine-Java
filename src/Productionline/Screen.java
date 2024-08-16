
package Productionline;

public class Screen implements ScreenSpec {
   public String resolution;
    public int refreshrate;
    public int responsetime;

    public Screen(String resolution, int refreshRate, int responseTime) {
        this.resolution = resolution;
        this.refreshrate = refreshRate;
        this.responsetime = responseTime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshrate;
    }

    @Override
    public int getResponseTime() {
        return responsetime;
    }

    @Override
    public String toString() {
        return "Resolution\t:" + resolution + "\n" +
               "Refresh rate\t:" + refreshrate + "\n" +
               "Response time\t:" + responsetime;
    }
 
}
