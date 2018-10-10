/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpiti;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author pc1
 
 session.beginTransaction();
        java.util.List collection = new java.util.ArrayList();
        DaybookEntry de=session.get(DaybookEntry.class, Integer.parseInt(jTextField37.getText()));
        collection.add(new DaybookEntry(de.getVoucherid(),de.getVoucheramount(),de.getVoucherexpence(),de.getVoucherdate()));
        report_jasper(cpiti.DaybookFactory.getDaybookCollection(collection),"/reports/DaybookEntry.jasper");
       tx.commit();
	   
	   
	   JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream(path), null, new JRBeanCollectionDataSource(collection));
 
 
 
 */
public class DaybookFactory {
public static java.util.Collection getDaybookCollection()
    {   
        java.util.List collection = new java.util.ArrayList();
        try
        {
            
            collection.add(new cpiti.DaybookEntry(1,"1", BigDecimal.valueOf(500), "fghfgh", new Date()));
            collection.add(new cpiti.DaybookEntry(2,"1", BigDecimal.valueOf(500), "ofgjff", new Date()));
           
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return collection;
    }
public static java.util.Collection getDaybookCollection(java.util.List collection)
    {   
        Iterator iter=collection.iterator();
        while (iter.hasNext()) {
            DaybookEntry next = (DaybookEntry)iter.next();
            System.out.println(next.getVoucherid()+","+next.getVoucherno()+","+next.getVoucherexpence()+","+next.getVoucheramount());
            
        }
        return collection;
    }
}
