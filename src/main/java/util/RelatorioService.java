package util;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;

import com.lowagie.text.pdf.PdfWriter;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

public class RelatorioService implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String FOLDER_RELATORIOS = "/reports/";

    private String caminhoArquivoRelatorio = null;
    @SuppressWarnings("rawtypes")
    private JRExporter exporter = null;
    private File arquivoGerado = null;

    public String gerarRelatorio(HashMap<String, Object> paramsRelatorio,String nomeRelatorioJasper,String tipoExportar) throws JRException{
        String caminhoRelatorio = "src/main/resources/reports/";

        String caminhoArquivosJasper = "src/main/resources/reports/jasper_A4.jrxml";

        JasperReport relatorioJasper = JasperCompileManager.compileReport(caminhoArquivosJasper);

        JasperPrint impressoraJasper = JasperFillManager.fillReport(relatorioJasper, paramsRelatorio,ConnetionFactory.getConnection());

        if (tipoExportar.equalsIgnoreCase("pdf")) {
            exporter = new JRPdfExporter();
        }else if (tipoExportar.equalsIgnoreCase("xls")) {
            exporter = new JRXlsExporter();
        }


        caminhoArquivoRelatorio = caminhoRelatorio + "RelatorioImobiliaria." + tipoExportar;
        arquivoGerado = new File(caminhoArquivoRelatorio);
        exporter.setExporterInput(new SimpleExporterInput(impressoraJasper));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(arquivoGerado));
        SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
        configuration.setPermissions(PdfWriter.ALLOW_COPY | PdfWriter.ALLOW_PRINTING);
        exporter.setConfiguration(configuration);
        exporter.exportReport();



        return caminhoArquivoRelatorio;
    }

}