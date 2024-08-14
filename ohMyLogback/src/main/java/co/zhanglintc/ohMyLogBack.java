package co.zhanglintc;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class ohMyLogBack {
    public static void main(String[] args) {
        log.info("start: Hello World!");
        System.out.println(ohMyLogBack.class.getClassLoader().getResource(""));
        System.out.println(ohMyLogBack.class.getResource(""));
        log.info("end: Hello World!");
    }
}