package services;

import java.util.ArrayList;
import java.util.List;

public class MedicineBO {

    private final List<String> substances = new ArrayList<>();
    private final String cnpj;
    private final String laboratory;
    private final Long code;
    private final Long register;
    private final Long ean1;
    private final Long ean2;
    private final Long ean3;
    private final String product;
    private final String apresentation;
    private final String terapeuticalClass;
    private final String productType;
    private final String priceType;
    private final Float finalPrice;
    private final Float finalPriceZero;
    private final Float finalPriceTwelve;
    private final Float finalPriceSeventeen;
    private final Float finalPriceSeventeenAlc;
    private final Float finalPriceSeventeenHalf;
    private final Float finalPriceSeventeenHalfAlc;
    private final Float finalPriceEighteen;
    private final Float finalPriceEighteenAlc;
    private final Float finalPriceTwenty;
    private final Float maxPriceZero;
    private final Float maxPriceTwelve;
    private final Float maxPriceSeventeen;
    private final Float maxPriceSeventeenAlc;
    private final Float maxPriceSeventeenHalf;
    private final Float maxPriceSeventeenHalfAlc;
    private final Float maxPriceEighteen;
    private final Float maxPriceEighteenHalf;
    private final Float maxPriceTwenty;
    private final String hospitalarRestriction;
    private final String cap;
    private final String confaz;
    private final String icms;
    private final Integer recursalAnalisys;
    private final String tributaryCredit;
    private final String sellsInTwentyTwenty;
    private final String stripe;

    public MedicineBO(String cnpj, String laboratory, Long code, Long register, Long ean1, Long ean2, Long ean3, String product, String apresentation, String terapeuticalClass, String productType, String priceType, Float finalPrice, Float finalPriceZero, Float finalPriceTwelve, Float finalPriceSeventeen, Float finalPriceSeventeenAlc, Float finalPriceSeventeenHalf, Float finalPriceSeventeenHalfAlc, Float finalPriceEighteen, Float finalPriceEighteenAlc, Float finalPriceTwenty, Float maxPriceZero, Float maxPriceTwelve, Float maxPriceSeventeen, Float maxPriceSeventeenAlc, Float maxPriceSeventeenHalf, Float maxPriceSeventeenHalfAlc, Float maxPriceEighteen, Float maxPriceEighteenHalf, Float maxPriceTwenty, String hospitalarRestriction, String cap, String confaz, String icms, Integer recursalAnalisys, String tributaryCredit, String sellsInTwentyTwenty, String stripe) {
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
        this.maxPriceEighteenHalf = maxPriceEighteenHalf;
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

    public String getCnpj() {
        return cnpj;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public Long getCode() {
        return code;
    }

    public Long getRegister() {
        return register;
    }

    public Long getEan1() {
        return ean1;
    }

    public Long getEan2() {

        return ean2;
    }

    public Long getEan3() {

        return ean3;
    }

    public String getProduct() {

        return product;
    }

    public String getApresentation() {

        return apresentation;
    }

    public String getTerapeuticalClass() {

        return terapeuticalClass;
    }

    public String getProductType() {

        return productType;
    }

    public String getPriceType() {

        return priceType;
    }

    public Float getFinalPrice() {

        return finalPrice;
    }

    public Float getFinalPriceZero() {

        return finalPriceZero;
    }

    public Float getFinalPriceTwelve() {

        return finalPriceTwelve;
    }

    public Float getFinalPriceSeventeen() {
        return finalPriceSeventeen;
    }

    public Float getFinalPriceSeventeenAlc() {
        return finalPriceSeventeenAlc;
    }

    public Float getFinalPriceSeventeenHalf() {
        return finalPriceSeventeenHalf;
    }

    public Float getFinalPriceSeventeenHalfAlc() {
        return finalPriceSeventeenHalfAlc;
    }

    public Float getFinalPriceEighteen() {
        return finalPriceEighteen;
    }

    public Float getFinalPriceEighteenAlc() {
        return finalPriceEighteenAlc;
    }

    public Float getFinalPriceTwenty() {
        return finalPriceTwenty;
    }

    public Float getMaxPriceZero() {
        return maxPriceZero;
    }

    public Float getMaxPriceTwelve() {
        return maxPriceTwelve;
    }

    public Float getMaxPriceSeventeen() {
        return maxPriceSeventeen;
    }

    public Float getMaxPriceSeventeenAlc() {
        return maxPriceSeventeenAlc;
    }

    public Float getMaxPriceSeventeenHalf() {
        return maxPriceSeventeenHalf;
    }

    public Float getMaxPriceSeventeenHalfAlc() {
        return maxPriceSeventeenHalfAlc;
    }

    public Float getMaxPriceEighteen() {
        return maxPriceEighteen;
    }

    public Float getMaxPriceEighteenHalf() {
        return maxPriceEighteenHalf;
    }

    public Float getMaxPriceTwenty() {
        return maxPriceTwenty;
    }

    public String getHospitalarRestriction() {
        return hospitalarRestriction;
    }

    public String getCap() {
        return cap;
    }

    public String getConfaz() {
        return confaz;
    }

    public String getIcms() {
        return icms;
    }

    public Integer getRecursalAnalisys() {
        return recursalAnalisys;
    }

    public String getTributaryCredit() {
        return tributaryCredit;
    }

    public String getSellsInTwentyTwenty() {
        return sellsInTwentyTwenty;
    }

    public String getStripe() {
        return stripe;
    }

    public List<String> getSubstances() {
        return substances;
    }
}

