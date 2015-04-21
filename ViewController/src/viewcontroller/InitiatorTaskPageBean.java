package viewcontroller;

import com.beans.ADFUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class InitiatorTaskPageBean {
    public InitiatorTaskPageBean() {
    }

    public String l1_action() {
        OperationBinding createInsertOP =
        ADFUtils.findOperation("CreateInsert");
       
        createInsertOP.execute();  
        return null;
    }

    public String createRow() {
        DCBindingContainer dcBindings=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

                        DCIteratorBinding dcIterBind =(DCIteratorBinding)dcBindings.get("RequsitionVO1Iterator");

                        ViewObject vo = dcIterBind.getViewObject();
        
        
        Row r1=vo.createRow();
        vo.insertRow(r1);
        return null;
    }
}
