package ezpos.program.EZPOS.service;

import ezpos.program.EZPOS.model.AddOnItem;
import ezpos.program.EZPOS.repository.AddOnItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddOnItemService {
    @Autowired
    private AddOnItemRepository addOnItemRepository;

    public List<AddOnItem> getAllAddOnItems() {
        return addOnItemRepository.findAll();
    }

    public AddOnItem createAddOnItem(AddOnItem addOnItem) {
        return addOnItemRepository.save(addOnItem);
    }
}
