package dto;

import entities.MedicineEntity;
import repositories.MedicineRepository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MedicineDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<String> substances = new ArrayList<>();
    private String ean1;
    private String product;
    private String apresentation;
    private String finalPrice;
    private String maxPriceZero;

    public MedicineDTO(){

    }

    public MedicineDTO(MedicineEntity med){
        substances = med.getSubstances();
        ean1 = med.getEan1();
        product = med.getProduct();
        apresentation = med.getApresentation();
        finalPrice = med.getFinalPrice();
        maxPriceZero = med.getMaxPriceZero();
    }

    public List<String> getSubstances() {
        return substances;
    }

    public void setSubstances(List<String> substances) {
        this.substances = substances;
    }

    public String getEan1() {
        return ean1;
    }

    public void setEan1(String ean1) {
        this.ean1 = ean1;
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

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getMaxPriceZero() {
        return maxPriceZero;
    }

    public void setMaxPriceZero(String maxPriceZero) {
        this.maxPriceZero = maxPriceZero;
    }

    @Override
    public String toString() {
        return substances + "\n" +
                "EAN1 = " + ean1 + "\n" +
                "Produto = " + product + "\n" +
                "Apresentação = " + apresentation + "\n" +
                "Preço Final = R$" + finalPrice + "\n" +
                "Preço Máximo = R$" + maxPriceZero + "\n\n\n";
    }
}
