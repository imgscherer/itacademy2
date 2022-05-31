package entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicineEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<String> substances = new ArrayList<>();
    private String cnpj;
    private String laboratory;
    private String code;
    private String register;
    private String ean1;
    private String ean2;
    private String ean3;
    private String product;
    private String apresentation;
    private String terapeuticalClass;
    private String productType;
    private String priceType;
    private String finalPrice;
    private String finalPriceZero;
    private String finalPriceTwelve;
    private String finalPriceSeventeen;
    private String finalPriceSeventeenAlc;
    private String finalPriceSeventeenHalf;
    private String finalPriceSeventeenHalfAlc;
    private String finalPriceEighteen;
    private String finalPriceEighteenAlc;
    private String finalPriceTwenty;
    private String maxPriceZero;
    private String maxPriceTwelve;
    private String maxPriceSeventeen;
    private String maxPriceSeventeenAlc;
    private String maxPriceSeventeenHalf;
    private String maxPriceSeventeenHalfAlc;
    private String maxPriceEighteen;
    private String maxPriceEighteenAlc;
    private String maxPriceTwenty;
    private String hospitalarRestriction;
    private String cap;
    private String confaz;
    private String icms;
    private String recursalAnalisys;
    private String tributaryCredit;
    private String sellsInTwentyTwenty;
    private String stripe;


    public MedicineEntity(String cnpj, String laboratory, String code, String register, String ean1, String ean2,
                          String ean3, String product, String apresentation, String terapeuticalClass, String productType,
                          String priceType, String finalPrice, String finalPriceZero, String finalPriceTwelve, String finalPriceSeventeen,
                          String finalPriceSeventeenAlc, String finalPriceSeventeenHalf, String finalPriceSeventeenHalfAlc,
                          String finalPriceEighteen, String finalPriceEighteenAlc, String finalPriceTwenty, String maxPriceZero,
                          String maxPriceTwelve, String maxPriceSeventeen, String maxPriceSeventeenAlc, String maxPriceSeventeenHalf,
                          String maxPriceSeventeenHalfAlc, String maxPriceEighteen, String maxPriceEighteenAlc, String maxPriceTwenty,
                          String hospitalarRestriction, String cap, String confaz, String icms, String recursalAnalisys,
                          String tributaryCredit, String sellsInTwentyTwenty, String stripe) {
        this.cnpj = cnpj;
        this.laboratory = laboratory;
        this.code = code;
        this.register = register;
        this.ean1 = ean1;
        this.ean2 = ean2;
        this.ean3 = ean3;
        this.product = product;
        this.apresentation = apresentation;
        this.terapeuticalClass = terapeuticalClass;
        this.productType = productType;
        this.priceType = priceType;
        this.finalPrice = finalPrice;
        this.finalPriceZero = finalPriceZero;
        this.finalPriceTwelve = finalPriceTwelve;
        this.finalPriceSeventeen = finalPriceSeventeen;
        this.finalPriceSeventeenAlc = finalPriceSeventeenAlc;
        this.finalPriceSeventeenHalf = finalPriceSeventeenHalf;
        this.finalPriceSeventeenHalfAlc = finalPriceSeventeenHalfAlc;
        this.finalPriceEighteen = finalPriceEighteen;
        this.finalPriceEighteenAlc = finalPriceEighteenAlc;
        this.finalPriceTwenty = finalPriceTwenty;
        this.maxPriceZero = maxPriceZero;
        this.maxPriceTwelve = maxPriceTwelve;
        this.maxPriceSeventeen = maxPriceSeventeen;
        this.maxPriceSeventeenAlc = maxPriceSeventeenAlc;
        this.maxPriceSeventeenHalf = maxPriceSeventeenHalf;
        this.maxPriceSeventeenHalfAlc = maxPriceSeventeenHalfAlc;
        this.maxPriceEighteen = maxPriceEighteen;
        this.maxPriceEighteenAlc = maxPriceEighteenAlc;
        this.maxPriceTwenty = maxPriceTwenty;
        this.hospitalarRestriction = hospitalarRestriction;
        this.cap = cap;
        this.confaz = confaz;
        this.icms = icms;
        this.recursalAnalisys = recursalAnalisys;
        this.tributaryCredit = tributaryCredit;
        this.sellsInTwentyTwenty = sellsInTwentyTwenty;
        this.stripe = stripe;
    }

    public void addSubstancies(String substance){
        substances.add(substance);
    }

    public void addAllSubstancies(List<String> subs){
        substances.addAll(subs);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getEan1() {
        return ean1;
    }

    public void setEan1(String ean1) {
        this.ean1 = ean1;
    }

    public String getEan2() {
        return ean2;
    }

    public void setEan2(String ean2) {
        this.ean2 = ean2;
    }

    public String getEan3() {
        return ean3;
    }

    public void setEan3(String ean3) {
        this.ean3 = ean3;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getApresentation() {
        return apresentation;
    }

    public void setApresentation(String apresentation) {
        this.apresentation = apresentation;
    }

    public String getTerapeuticalClass() {
        return terapeuticalClass;
    }

    public void setTerapeuticalClass(String terapeuticalClass) {
        this.terapeuticalClass = terapeuticalClass;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getFinalPriceZero() {
        return finalPriceZero;
    }

    public void setFinalPriceZero(String finalPriceZero) {
        this.finalPriceZero = finalPriceZero;
    }

    public String getFinalPriceTwelve() {
        return finalPriceTwelve;
    }

    public void setFinalPriceTwelve(String finalPriceTwelve) {
        this.finalPriceTwelve = finalPriceTwelve;
    }

    public String getFinalPriceSeventeen() {
        return finalPriceSeventeen;
    }

    public void setFinalPriceSeventeen(String finalPriceSeventeen) {
        this.finalPriceSeventeen = finalPriceSeventeen;
    }

    public String getFinalPriceSeventeenAlc() {
        return finalPriceSeventeenAlc;
    }

    public void setFinalPriceSeventeenAlc(String finalPriceSeventeenAlc) {
        this.finalPriceSeventeenAlc = finalPriceSeventeenAlc;
    }

    public String getFinalPriceSeventeenHalf() {
        return finalPriceSeventeenHalf;
    }

    public void setFinalPriceSeventeenHalf(String finalPriceSeventeenHalf) {
        this.finalPriceSeventeenHalf = finalPriceSeventeenHalf;
    }

    public String getFinalPriceSeventeenHalfAlc() {
        return finalPriceSeventeenHalfAlc;
    }

    public void setFinalPriceSeventeenHalfAlc(String finalPriceSeventeenHalfAlc) {
        this.finalPriceSeventeenHalfAlc = finalPriceSeventeenHalfAlc;
    }

    public String getFinalPriceEighteen() {
        return finalPriceEighteen;
    }

    public void setFinalPriceEighteen(String finalPriceEighteen) {
        this.finalPriceEighteen = finalPriceEighteen;
    }

    public String getFinalPriceEighteenAlc() {
        return finalPriceEighteenAlc;
    }

    public void setFinalPriceEighteenAlc(String finalPriceEighteenAlc) {
        this.finalPriceEighteenAlc = finalPriceEighteenAlc;
    }

    public String getFinalPriceTwenty() {
        return finalPriceTwenty;
    }

    public void setFinalPriceTwenty(String finalPriceTwenty) {
        this.finalPriceTwenty = finalPriceTwenty;
    }

    public String getMaxPriceZero() {
        return maxPriceZero;
    }

    public void setMaxPriceZero(String maxPriceZero) {
        this.maxPriceZero = maxPriceZero;
    }

    public String getMaxPriceTwelve() {
        return maxPriceTwelve;
    }

    public void setMaxPriceTwelve(String maxPriceTwelve) {
        this.maxPriceTwelve = maxPriceTwelve;
    }

    public String getMaxPriceSeventeen() {
        return maxPriceSeventeen;
    }

    public void setMaxPriceSeventeen(String maxPriceSeventeen) {
        this.maxPriceSeventeen = maxPriceSeventeen;
    }

    public String getMaxPriceSeventeenAlc() {
        return maxPriceSeventeenAlc;
    }

    public void setMaxPriceSeventeenAlc(String maxPriceSeventeenAlc) {
        this.maxPriceSeventeenAlc = maxPriceSeventeenAlc;
    }

    public String getMaxPriceSeventeenHalf() {
        return maxPriceSeventeenHalf;
    }

    public void setMaxPriceSeventeenHalf(String maxPriceSeventeenHalf) {
        this.maxPriceSeventeenHalf = maxPriceSeventeenHalf;
    }

    public String getMaxPriceSeventeenHalfAlc() {
        return maxPriceSeventeenHalfAlc;
    }

    public void setMaxPriceSeventeenHalfAlc(String maxPriceSeventeenHalfAlc) {
        this.maxPriceSeventeenHalfAlc = maxPriceSeventeenHalfAlc;
    }

    public String getMaxPriceEighteen() {
        return maxPriceEighteen;
    }

    public void setMaxPriceEighteen(String maxPriceEighteen) {
        this.maxPriceEighteen = maxPriceEighteen;
    }

    public String getMaxPriceEighteenHalf() {
        return maxPriceEighteenAlc;
    }

    public void setMaxPriceEighteenHalf(String maxPriceEighteenHalf) {
        this.maxPriceEighteenAlc = maxPriceEighteenHalf;
    }

    public String getMaxPriceTwenty() {
        return maxPriceTwenty;
    }

    public void setMaxPriceTwenty(String maxPriceTwenty) {
        this.maxPriceTwenty = maxPriceTwenty;
    }

    public String getHospitalarRestriction() {
        return hospitalarRestriction;
    }

    public void setHospitalarRestriction(String hospitalarRestriction) {
        this.hospitalarRestriction = hospitalarRestriction;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getConfaz() {
        return confaz;
    }

    public void setConfaz(String confaz) {
        this.confaz = confaz;
    }

    public String getIcms() {
        return icms;
    }

    public void setIcms(String icms) {
        this.icms = icms;
    }

    public String getRecursalAnalisys() {
        return recursalAnalisys;
    }

    public void setRecursalAnalisys(String recursalAnalisys) {
        this.recursalAnalisys = recursalAnalisys;
    }

    public String getTributaryCredit() {
        return tributaryCredit;
    }

    public void setTributaryCredit(String tributaryCredit) {
        this.tributaryCredit = tributaryCredit;
    }

    public String getSellsInTwentyTwenty() {
        return sellsInTwentyTwenty;
    }

    public void setSellsInTwentyTwenty(String sellsInTwentyTwenty) {
        this.sellsInTwentyTwenty = sellsInTwentyTwenty;
    }

    public String getStripe() {
        return stripe;
    }

    public void setStripe(String stripe) {
        this.stripe = stripe;
    }

    public List<String> getSubstances() {
        return substances;
    }

    public void setSubstances(List<String> substances) {
        this.substances = substances;
    }

    @Override
    public String toString() {
        return "Substâncias=" + substances + ", " + "CNPJ = " + cnpj + ", " + "Laboratório = " + laboratory + ", "
                + "Código = " + code + ", " + "Registro = " + register + ", " + "ean1 = " + ean1 + ", " + "ean2 = "
                + ean2 + ", " + "ean3 = " + ean3 + ", " + "Produto = " + product + ", " + "Apresentação = "
                + apresentation + ", " + "Classe Terapeutica = " + terapeuticalClass + ", " + "Tipo de Produto = "
                + productType + ", " + "Regime de Preços = " + priceType + ", " + "Preço final Sem Impostos = "
                + finalPrice + ", " + "PF 0% = " + finalPriceZero + ", " + "PF 12% = " + finalPriceTwelve + ", "
                + "PF 17% = " + finalPriceSeventeen + ", " + "PF 17% ALC = " + finalPriceSeventeenAlc + ", "
                + "PF 17,5%=" + finalPriceSeventeenHalf + ", " + "PF 17,5% ALC = "
                + finalPriceSeventeenHalfAlc + ", " + "PF 18% =" + finalPriceEighteen + ", "
                + "PF 18% ALC = " + finalPriceEighteenAlc + ", " + "PF 20% = " + finalPriceTwenty
                + ", " + "PMC 0% = " + maxPriceZero + ", " + "PMC 12% = " + maxPriceTwelve + ", "
                + "PMC 17% = " + maxPriceSeventeen + ", " + "PMC 17% ALC = " + maxPriceSeventeenAlc
                + ", " + "PMC 17,5% = " + maxPriceSeventeenHalf + ", " + "PMC 17,5 ALC% = "
                + maxPriceSeventeenHalfAlc + ", " + "PMC 18% = " + maxPriceEighteen + ", "
                + "PMC 18% ALC=" + maxPriceEighteenAlc + ", " + "PMC 20% =" + maxPriceTwenty + ", "
                + "Restrição Hospitalar = " + hospitalarRestriction + ", " + "CAP = " + cap + ", " + "CONPAZ = " + confaz
                + ", " + "ICMS = " + icms + ", " + "Análise Recursal=" + recursalAnalisys + ", " + "Concessão de Crédito Tributário = "
                + tributaryCredit + ", " + "Comercialização 2020 = " + sellsInTwentyTwenty + ", " + "Tarja = " + stripe + "\n";
    }
}