package com.example.cronjob;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AplicativoJob {
	
	private static final Logger LOG = LoggerFactory.getLogger(AplicativoJob.class);
    //@Scheduled(cron = "#{@obtenerTiempoCron}")
	//cron = "0 0/01 * * * ?"
    @Scheduled(fixedRate = 5000) // Minutos
    public void run() {
    	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    	LOG.info("La hora actual es {}", dateFormat.format(new Date()));
    }
}
