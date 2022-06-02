package services;

import dto.MedicineDTO;
import entities.MedicineEntity;
import repositories.MedicineRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineService {

    public List<MedicineEntity> getAllMedicines(){
        MedicineRepository repository = new MedicineRepository();
        return repository.fileRead().stream().collect(Collectors.toList());
    }

    public List<MedicineDTO> getByName(String name){
        List<MedicineEntity> medicines = getAllMedicines();

        List<MedicineEntity> foundMedicine = new ArrayList<>();
        List<MedicineDTO> foundMedicineDTO = new ArrayList<>();

        medicines.stream().filter(x -> x.getSellsInTwentyTwenty().equals("Sim")).forEach(medicine -> medicine.getSubstances().forEach(sub -> {
            if(sub.contains(name)){
                foundMedicine.add(medicine);
            }
        }));

        foundMedicineDTO = foundMedicine.stream().map(x -> new MedicineDTO(x)).collect(Collectors.toList());

        if(foundMedicineDTO.isEmpty()){
            System.out.println("Nenhum Medicamento Encontrado com essa Substância.");
        }
        else {
            System.out.println(foundMedicineDTO);
        }
        return foundMedicineDTO;
    }

    public List<MedicineDTO> getByCode(String code) {
        List<MedicineEntity> medicines = getAllMedicines();

        List<MedicineEntity> foundMedicine = new ArrayList<>();
        List<MedicineDTO> foundMedicineDTO = new ArrayList<>();

        medicines.stream().filter(x -> x.getEan1().equals(code)).forEach(medicine ->{
            foundMedicine.add(medicine);
        });
        foundMedicineDTO = foundMedicine.stream().map(x -> new MedicineDTO(x)).collect(Collectors.toList());
        if(foundMedicineDTO.isEmpty()){
            System.out.println("Nenhum Medicamento Encontrado com esse Código.");
        }
        else {
            System.out.println(foundMedicineDTO);
        }
        return foundMedicineDTO;
    }

    public void compareTributaryCredit (){
        List<MedicineEntity> medicines = getAllMedicines();

        List<MedicineEntity> positive  = new ArrayList<>();
        List<MedicineEntity> negative  = new ArrayList<>();
        List<MedicineEntity> neutral  = new ArrayList<>();
        List<MedicineEntity> total  = new ArrayList<>();

        medicines.stream().filter(x -> x.getSellsInTwentyTwenty().equals("Sim")).forEach(medicine ->{
            switch (medicine.getTributaryCredit()) {
                case "Negativa":
                    negative.add(medicine);
                    total.add(medicine);
                    break;

                case "Positiva":
                    positive.add(medicine);
                    total.add(medicine);
                    break;

                case "Neutra":
                    neutral.add(medicine);
                    total.add(medicine);
                    break;

                default:
                    break;
            }
        });

        float negativeSize = negative.size();
        float positiveSize = positive.size();
        float neutralSize = neutral.size();
        float totalSize = total.size();

        float negativePercentage = negativeSize/totalSize*100;
        float positivePercentage = positiveSize/totalSize*100;
        float neutralPercentage = neutralSize/totalSize*100;



        System.out.printf("CLASSIFICAÇÃO     PERCENTUAL\n");
        System.out.printf("Negativas          %.2f%%\n", negativePercentage);
        System.out.printf("Positivas          %.2f%%\n", positivePercentage);
        System.out.printf("Neutras            %.2f%%\n", neutralPercentage);
    }
}

