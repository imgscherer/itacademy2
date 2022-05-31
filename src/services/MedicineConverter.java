package services;

import entities.MedicineEntity;

public class MedicineConverter {

    public MedicineBO toBO(MedicineEntity entity){
        return new MedicineBO(
                entity.getCnpj(), entity.getLaboratory(), Long.parseLong(entity.getCode()),
                Long.parseLong(entity.getRegister()), Long.parseLong(entity.getEan1()),Long.parseLong(entity.getEan2()),
                Long.parseLong(entity.getEan3()), entity.getProduct(), entity.getApresentation(),
                entity.getTerapeuticalClass(), entity.getProductType(), entity.getPriceType(),
                Float.parseFloat(entity.getFinalPrice()), Float.parseFloat(entity.getFinalPriceZero()), Float.parseFloat(entity.getFinalPriceTwelve()),
                Float.parseFloat(entity.getFinalPriceSeventeen()), Float.parseFloat(entity.getFinalPriceSeventeenAlc()), Float.parseFloat(entity.getFinalPriceSeventeenHalf()),
                Float.parseFloat(entity.getFinalPriceSeventeenHalfAlc()), Float.parseFloat(entity.getFinalPriceEighteen()), Float.parseFloat(entity.getFinalPriceEighteenAlc()),
                Float.parseFloat(entity.getFinalPriceTwenty()), Float.parseFloat(entity.getMaxPriceZero()), Float.parseFloat(entity.getMaxPriceTwelve()),
                Float.parseFloat(entity.getMaxPriceSeventeen()), Float.parseFloat(entity.getMaxPriceSeventeenAlc()), Float.parseFloat(entity.getMaxPriceSeventeenHalf()),
                Float.parseFloat(entity.getMaxPriceSeventeenHalfAlc()),Float.parseFloat(entity.getMaxPriceEighteen()), Float.parseFloat(entity.getMaxPriceEighteenHalf()),
                Float.parseFloat(entity.getMaxPriceTwenty()), entity.getHospitalarRestriction(), entity.getCap(),
                entity.getConfaz(), entity.getIcms(), Integer.parseInt(entity.getRecursalAnalisys()),
                entity.getTributaryCredit(), entity.getSellsInTwentyTwenty(), entity.getStripe()
        );
    }
}
