import java.util.Objects;

public abstract class Transport {
    private String marks;
    private String model;
    private double engineVolume;
    private double startTime;
    private double endTime;


    public Transport(String marks, String model, double engineVolume, double startTime, double endTime) {
        if (marks == null || marks.isEmpty() || marks.isBlank()) {
            this.marks = "defolt";
        } else {
            this.marks = marks;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "defolt";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (startTime <= 0) {
            this.startTime = 1;
        } else {
            this.startTime = startTime;
        }
        if (endTime <= 0) {
            this.endTime = 4;
        } else {
            this.endTime = endTime;
        }

    }
    public Transport(String marks, String model){
        this(marks,model,1.5,1,4);
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        if (startTime <= 0) {
            this.startTime = 1;
        } else {
            this.startTime = startTime;
        }
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        if (endTime <= 0) {
            this.endTime = 1;
        } else {
            this.endTime = endTime;
        }
    }

    public String getMarks() {
        return marks;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void goStart();

    public abstract void goEnd();
    public abstract void printtypeMachine();

    @Override
    public String toString() {
        return "Траснспорт: " +
                " марка " + marks + '\'' +
                ". Модель - " + model + '\'' +
                " объем двигателя " + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(marks, transport.marks)
                && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks, model, engineVolume);
    }


}


