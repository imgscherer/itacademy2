package services;

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

    public List<MedicineEntity> getByName(String name){
        List<MedicineEntity> medicines = getAllMedicines();

        List<MedicineEntity> foundMedicine = new ArrayList<>();

        medicines.forEach(medicine -> medicine.getSubstances().forEach(sub -> {
            if(sub.contains(name)){
                foundMedicine.add(medicine);
            }
        }));

        System.out.println(foundMedicine);

        return foundMedicine;
    }

    /*public List<MedicineEntity> getByCode(Long code) {

        List<MedicineEntity> medicines = getAllMedicines();

        Collections.singletonList(medicines).stream().findFirst();

        //getAllMedicines().stream().filter(x -> x.getEan1().equals(code)).findFirst();
        return null;
    }*/
}

