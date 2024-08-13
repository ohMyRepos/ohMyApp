package co.zhanglintc;

import lombok.extern.slf4j.Slf4j;

/**
 * Hello world!
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("start: Hello World!");
        System.out.println(App.class.getClassLoader().getResource(""));
        System.out.println(App.class.getResource(""));
        log.info("end: Hello World!");
    }
}
