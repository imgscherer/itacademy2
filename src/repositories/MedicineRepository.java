package repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import entities.MedicineEntity;

public class MedicineRepository {

    public List<MedicineEntity> fileRead() {

        String path = "C:\\Users\\Gabriel\\eclipse-workspace\\itAcademyGabrielScherer\\src\\files\\TA_PRECO_MEDICAMENTO.csv";

        List<MedicineEntity> listMedicines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<String> collect = br.lines().skip(1L).collect(Collectors.toList());
            collect.forEach(line -> {
                MedicineEntity medicine;
                String[] lineForMedicine;
                List<String> substancies = new ArrayList<>();

                if(line.contains("\"")){
                    lineForMedicine = line.split("\"");
                    buildItemsForMedicine(lineForMedicine[1], substancies);
                    medicine = buildDataAboutMedicine(lineForMedicine[2]);
                    medicine.addAllSubstancies(substancies);
                }
                else {
                    medicine = buildDataAboutMedicine(line);
                    medicine.addSubstancies(line.split(";")[0]);
                }
                listMedicines.add(medicine);
                //System.out.println(listMedicines);
            });

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return listMedicines;
    }

    private MedicineEntity buildDataAboutMedicine(String s) {
        Integer dataAcessControl = 1;
        String[] lineForMedicine = s.replace(",", ".").split(";");


        String cnpj = lineForMedicine[dataAcessControl++];
        String laboratory = lineForMedicine[dataAcessControl++];
        String code = lineForMedicine[dataAcessControl++];
        String register = lineForMedicine[dataAcessControl++];
        String ean1 = lineForMedicine[dataAcessControl++];
        String ean2 = lineForMedicine[dataAcessControl++];
        String ean3 = lineForMedicine[dataAcessControl++];
        String product = lineForMedicine[dataAcessControl++];
        String apresentation = lineForMedicine[dataAcessControl++];
        String terapeuticalClass = lineForMedicine[dataAcessControl++];
        String productType = lineForMedicine[dataAcessControl++];
        String priceType = lineForMedicine[dataAcessControl++];
        String finalPrice = lineForMedicine[dataAcessControl++];
        String finalPriceZero = lineForMedicine[dataAcessControl++];
        String finalPriceTwelve = lineForMedicine[dataAcessControl++];
        String finalPriceSeventeen = lineForMedicine[dataAcessControl++];
        String finalPriceSeventeenAlc = lineForMedicine[dataAcessControl++];
        String finalPriceSeventeenHalf = lineForMedicine[dataAcessControl++];
        String finalPriceSeventeenHalfAlc = lineForMedicine[dataAcessControl++];
        String finalPriceEighteen = lineForMedicine[dataAcessControl++];
        String finalPriceEighteenAlc = lineForMedicine[dataAcessControl++];
        String finalPriceTwenty = lineForMedicine[dataAcessControl++];
        String maxPriceZero = lineForMedicine[dataAcessControl++];
        String maxPriceTwelve = lineForMedicine[dataAcessControl++];
        String maxPriceSeventeen = lineForMedicine[dataAcessControl++];
        String maxPriceSeventeenAlc = lineForMedicine[dataAcessControl++];
        String maxPriceSeventeenHalf = lineForMedicine[dataAcessControl++];
        String maxPriceSeventeenHalfAlc = lineForMedicine[dataAcessControl++];
        String maxPriceEighteen = lineForMedicine[dataAcessControl++];
        String maxPriceEighteenHalf = lineForMedicine[dataAcessControl++];
        String maxPriceTwenty = lineForMedicine[dataAcessControl++];
        String hospitalarRestriction = lineForMedicine[dataAcessControl++];
        String cap = lineForMedicine[dataAcessControl++];
        String confaz = lineForMedicine[dataAcessControl++];
        String icms = lineForMedicine[dataAcessControl++];
        String recursalAnalisys = lineForMedicine[dataAcessControl++];
        String tributaryCredit = lineForMedicine[dataAcessControl++];
        String sellsInTwentyTwenty = lineForMedicine[dataAcessControl++];
        String stripe = lineForMedicine[dataAcessControl];

        return new MedicineEntity(
                cnpj,
                laboratory,
                code,
                register,
                ean1,
                ean2,
                ean3,
                product,
                apresentation,
                terapeuticalClass,
                productType,
                priceType,
                finalPrice,
                finalPriceZero,
                finalPriceTwelve,
                finalPriceSeventeen,
                finalPriceSeventeenAlc,
                finalPriceSeventeenHalf,
                finalPriceSeventeenHalfAlc,
                finalPriceEighteen,
                finalPriceEighteenAlc,
                finalPriceTwenty,
                maxPriceZero,
                maxPriceTwelve,
                maxPriceSeventeen,
                maxPriceSeventeenAlc,
                maxPriceSeventeenHalf,
                maxPriceSeventeenHalfAlc,
                maxPriceEighteen,
                maxPriceEighteenHalf,
                maxPriceTwenty,
                hospitalarRestriction,
                cap,
                confaz,
                icms,
                recursalAnalisys,
                tributaryCredit,
                sellsInTwentyTwenty,
                stripe
        );
    }

    private void buildItemsForMedicine(String s, List<String> substancies) {
        substancies.addAll(Arrays.stream(s.split(";")).collect(Collectors.toList()));
    }
}
