package com.beans;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class InitiatorBean {
    public InitiatorBean() {
    }

    public String addNewOrder() {
        System.out.println("in CI MEthod");
        OperationBinding createInsertOP =
        ADFUtils.findOperation("CreateInsert");
        System.out.println("-------------------------------------"+createInsertOP);
        createInsertOP.execute();  
        return null;
    }
    
    public void onLoad(){
        OperationBinding createInsertOP =
        ADFUtils.findOperation("CreateInsert");
        createInsertOP.execute();  
    }

    public String CreateRow() {
        DCBindingContainer dcBindings=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();

                        DCIteratorBinding dcIterBind =(DCIteratorBinding)dcBindings.get("RequsitionVO1Iterator");

                        ViewObject vo = dcIterBind.getViewObject();
        
    
        Row r1=vo.createRow();
        vo.insertRow(r1);
    
return null;
    }

//    public String action_save() {
//        // Add event code here...
//      DCIteratorBinding requisitionIterator = ADFUtils.findIterator("RequsitionVO1Iterator");
//        Row currentRow = requisitionIterator.getCurrentRow();
//        int reqNo=(Integer)currentRow.getAttribute("RequisitionNo");
//        System.out.println("reqNo--------"+reqNo);
//        
//        String requestor1=(String)currentRow.getAttribute("Requestor");
//        System.out.println("Requestor-----"+requestor1);
//        
//        String status1=(String)currentRow.getAttribute("Status");
//        System.out.println("Status1---"+status1);
//        
//        
//
//        return null;
//    }
}
