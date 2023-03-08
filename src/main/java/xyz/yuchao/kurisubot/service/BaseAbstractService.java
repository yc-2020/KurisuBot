package xyz.yuchao.kurisubot.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseAbstractService {
    public Logger logger= LogManager.getLogger(this.getClass());
}
