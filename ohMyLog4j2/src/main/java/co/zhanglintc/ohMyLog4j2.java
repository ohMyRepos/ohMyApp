package co.zhanglintc;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class ohMyLog4j2 {
    public static void main(String[] args) {
        log.info("start: Hello World!");
        System.out.println(ohMyLog4j2.class.getClassLoader().getResource(""));
        System.out.println(ohMyLog4j2.class.getResource(""));
        log.info("end: Hello World!");
    }
}