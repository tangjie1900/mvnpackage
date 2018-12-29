package cn.saylife.mvnservice;

import cn.saylife.mvncommon.RandomNameUtil;
import cn.saylife.mvnmodel.Person;
import org.apache.log4j.Logger;


public class Program {

    private static Logger logger = Logger.getLogger(Program.class);

    public static void main(String[] args) {
        logger.info("start");
        Person person = new Person("jie", 18);
        logger.info(person);
        for (int i = 20; i < 25; i++) {
            person = new Person(RandomNameUtil.randomName(), i);
            logger.info(person);
        }
        logger.info("end");
    }

}
