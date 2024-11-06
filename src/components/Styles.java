package components;

public enum Styles {
    HEADER("style='text-align: center; border-bottom: 1px solid #000000;'"),
    FOOTER("style='margin-top: 60; text-align: center; font-family: Arial, sans-serif; font-size: 1em; solid #000000;'"),
    TITLE("style='font-family: Arial, sans-serif; color: black; font-size: 1.8 em; margin: 10;'"),
    TABLE("style='width: 100%; border-collapse: collapse; font-family: Arial, sans-serif; background-color: #f9f9f9; border: 1px solid #ddd; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1); border-radius: 8px; overflow: hidden;'"),
    TR("style='border-bottom: 1px solid #000000;'"),
    TH("style='padding: 12px 15px; font-weight: bold; font-size: 1em;'"),
    TD("style='padding: 12px 15px; text-align: left;'");
    

    public final String css;
    
    Styles(String css) {
        this.css = css;
    }
}
