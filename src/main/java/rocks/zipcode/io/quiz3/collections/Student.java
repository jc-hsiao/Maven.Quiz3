package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for(Lab l :labs){
            if(l.labName.equals(labName))
                return l;
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(labs.size()==0)
            throw new UnsupportedOperationException();

        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
        labs.add(0,lab);
        lab.setStatus(LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
//        if(getLab(labName) == null)
//            return LabStatus.INCOMPLETE;
//        else
            return getLab(labName).getStatus();
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Lab l:labs) {
            //s.insert(0,l.labName+" > "+l.getStatus()+"\n");
            s.append(l.labName).append(" > ").append(l.getStatus()).append("\n");
        }
        return s.toString().substring(0,s.length()-1);
    }
}
