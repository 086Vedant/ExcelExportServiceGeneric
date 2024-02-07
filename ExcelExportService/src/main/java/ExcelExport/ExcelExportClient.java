package ExcelExport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ExcelExportClient {

     @Inject
     UserService userSvc;

     @Inject
     ExcelExportService ExcelExportSvc;

     public byte[] generateExcelWorkbookUser() throws IOException
     {
            
             List<String> Header = new ArrayList<>();
             Header.add("name");
             Header.add("phone");
             Header.add("city");
             
            return ExcelExportSvc.generateExcelWorkbook(userSvc.getAllUsers(), Header,"UserData");
     }
    
}
