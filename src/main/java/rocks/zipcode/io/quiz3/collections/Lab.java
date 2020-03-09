package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;
    LabStatus stat;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labName = labName;
        stat = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        stat = labStatus;
    }

    public LabStatus getStatus() {
        return stat;
    }

    @Override
    public String toString() {
        return labName;
    }
}
