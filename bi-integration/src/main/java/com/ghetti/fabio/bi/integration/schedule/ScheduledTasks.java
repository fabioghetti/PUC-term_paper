package com.ghetti.fabio.bi.integration.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ghetti.fabio.bi.integration.service.ImportacaoService;
import com.ghetti.fabio.bi.integration.util.IntegrationUtil;

@Component
public class ScheduledTasks {

	@Autowired
	ImportacaoService importacaoService;
	
	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
    	
        log.info("Começando a importar as informações para o BI. {}", IntegrationUtil.getCurrentDateFormated());
        
        importacaoService.realizarImportacao();
        
        log.info("Finalizando importações para o BI. {}", IntegrationUtil.getCurrentDateFormated());
    }
}
