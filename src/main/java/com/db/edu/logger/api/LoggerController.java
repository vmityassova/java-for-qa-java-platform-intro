package com.db.edu.logger.api;

import com.db.edu.logger.api.businesslogic.service.LogService;

public class LoggerController {
   private LogService logService

    public void log(String message) {
        System.out.println(message);
    }
}
