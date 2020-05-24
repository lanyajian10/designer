package designMode.behavioral.memorandum;

import lombok.AllArgsConstructor;
import lombok.Setter;

/**
 * @author YJ Lan
 * @create 2020-05-24-17:24
 */
@AllArgsConstructor
@Setter
public class Originator {

    private int liftNum;
    private int defenseNum;

    public Memorandum save(){
        return new Memorandum(liftNum, defenseNum);
    }

    public void getDataFromMemorandum(Memorandum memorandum){
        this.liftNum = memorandum.getLiftNum();
        this.defenseNum = memorandum.getDefenseNum();
    }

    @Override
    public String toString() {
        return "生命："+ liftNum + "   护甲：" + defenseNum;
    }
}
