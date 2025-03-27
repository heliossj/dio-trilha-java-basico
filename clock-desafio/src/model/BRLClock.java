package model;

public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert(Clock clock) {
        this.setSecond(clock.getSecond());
        this.setMinutes(clock.getMinutes());
        switch (clock) {
            case USClock usClock -> this.setHour(usClock.getPeriodIndicator().equals("PMA") ? usClock.getHour() + 12 : usClock.getHour());
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        };
        return this;
    }
}
