package beans;

import bean.Baby;
import bean.Father;
import bean.Mother;

public class Family {

    public Father father;
    public Mother mother;
    public Baby baby;

    public Family(Father father, Mother mother, Baby baby) {
        this.father = father;
        this.mother = mother;
        this.baby = baby;
    }

    @Override
    public String toString() {
        return "The family: " +
                "father-" + father.name +
                ", mother-" + mother.name +
                ", baby-" + baby.name +
                '.';
    }
}
