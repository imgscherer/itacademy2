package services;

import repositories.MedicineRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineService {

    public List<MedicineBO> getAllMedicines(){
        MedicineRepository repository = new MedicineRepository();
        MedicineConverter converter = new MedicineConverter();
        return repository.fileRead().stream().map(converter::toBO).collect(Collectors.toList());
    }

    public List<MedicineBO> getByName(String name){
        List<MedicineBO> medicines = getAllMedicines();

        List<MedicineBO> foundMedicine = new ArrayList<>();

        medicines.forEach(medicine -> medicine.getSubstances().forEach(sub -> {
            if(sub.contains(name)){
                foundMedicine.add(medicine);
            }
        }));

        System.out.println(foundMedicine);

        return foundMedicine;
    }

    /*public List<MedicineBO> getByCode(Long code) {

        List<MedicineBO> medicines = getAllMedicines();

        Collections.singletonList(medicines).stream().findFirst();

        //getAllMedicines().stream().filter(x -> x.getEan1().equals(code)).findFirst();
        return null;
    }*/
}

