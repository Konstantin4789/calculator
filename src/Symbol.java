public class Symbol {
    private String symbolName;
    private int symbolId;

    public Symbol (String symbolName,int symbolId ){
        this.symbolName = symbolName;
        this.symbolId = symbolId;
    }

    public void setSymbolName (String symbolName){
        this.symbolName = symbolName;
    }

    public String getSymbolName (){
        return symbolName;
    }

    public int getSymbolId() {
        return symbolId;
    }
}
