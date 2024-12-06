package Singleton_Design_Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AppConfig appConfig=AppConfig.getInstance();
        System.out.println(appConfig);
        System.out.println(appConfig.getLanguage());

        System.out.println("------------------------");

        appConfig.setLanguage("Russian");
        System.out.println(appConfig);
        System.out.println(appConfig.getLanguage());
    }
}