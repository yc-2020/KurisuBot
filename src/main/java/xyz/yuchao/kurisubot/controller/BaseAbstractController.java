package xyz.yuchao.kurisubot.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseAbstractController {
    protected Logger logger= LogManager.getLogger();

    public static final String success="success";

    public static String success(){
        return success;
    }
}
