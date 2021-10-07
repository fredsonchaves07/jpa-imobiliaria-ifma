import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import util.RelatorioService;

class TestRelatorio {
    public static void main(String[] args) {

        try {


            RelatorioService rel = new RelatorioService();
            HashMap<String, Object> params = new HashMap<>();

            params.put("NOME_CLIENTE", "Joel");
            String file = rel.gerarRelatorio(params, "jasper_A4", "pdf");
            try {
                Desktop.getDesktop().open(new File(file));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (JRException e) {
            e.printStackTrace();
        }

    }

}
