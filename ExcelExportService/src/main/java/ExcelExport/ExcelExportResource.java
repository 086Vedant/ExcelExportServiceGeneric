package ExcelExport;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

//Resource class for handling Excel export requests.
 @Path("/export")
 public class ExcelExportResource {
    
    // @Inject
    // ExcelExportService ExcelExportSvc; 

    @Inject
    ExcelExportClient ExcelExportCli;

    @GET
    @Produces("application/vnd.ms-excel")
    public Response ExportUserExcel() throws IOException 
    {   
		    String headerKey = "Content-Disposition";
		    String headerValue = "attachment;filename=users.xlsx";
    
        InputStream is = new ByteArrayInputStream(ExcelExportCli.generateExcelWorkbookUser());
        return Response.ok(is).header(headerKey, headerValue).build();
    } 

 }




