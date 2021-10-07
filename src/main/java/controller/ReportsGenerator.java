package controller;

import net.sf.jasperreports.engine.JRException;
import util.RelatorioService;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ReportsGenerator {
    public static void main(String[] args) throws JRException {
        RelatorioService rel = new RelatorioService();
        HashMap<String, Object> params = new HashMap<>();

        params.put("NOME_CLIENTE", "Joel");
        String file = rel.gerarRelatorio(params, "jasper_A4", "pdf");

    }
}
