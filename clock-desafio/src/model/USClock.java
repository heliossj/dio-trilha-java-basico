package model;

public non-sealed class USClock extends Clock {
    private String periodIndicator;

    public void setHour(int hour){
        setBeforeMidDay();
        if (hour > 12 && hour <= 23){
            setAfterMidDay();
            this.setHour(hour-12);
        }
        else if (hour >= 24){
            this.setHour(0);
        } else {
            this.setHour(hour);
        }
    }

    public String getPeriodIndicator(){
        return this.periodIndicator;
    }

    public void setPeriodIndicator(String periodIndicator){
        this.periodIndicator = periodIndicator;
    }

    public void setAfterMidDay(){
        this.periodIndicator = "PM";
    }

    public void setBeforeMidDay(){
        this.periodIndicator = "AM";
    }

    @Override
    public Clock convert(final Clock clock) {
        this.setSecond(clock.getSecond());
        this.setMinutes(clock.getMinutes());

        switch (clock) {
            case USClock usClock -> {
                this.setHour(usClock.getHour());
                this.setPeriodIndicator(usClock.getPeriodIndicator());
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        };
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime() + " " + this.getPeriodIndicator();
    }
}
