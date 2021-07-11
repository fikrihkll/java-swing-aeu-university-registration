/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univregist;

/**
 *
 * @author zackm
 */
public interface OnDataReceived {
    
    public void onSubjectReceived(int totalSubject);
    public void onCreditReceived(int totalCredit);
    public void onResultIsCalled();
    public void onFinish();
    
}
