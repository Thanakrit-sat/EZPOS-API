package ezpos.program.EZPOS.controller;

import ezpos.program.EZPOS.model.AddOnItem;
import ezpos.program.EZPOS.service.AddOnItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/addonitem")
public class AddOnItemController {
    @Autowired
    private AddOnItemService addOnItemService;

    @GetMapping
    public List<AddOnItem> getAllAddOnItems() {
        return addOnItemService.getAllAddOnItems();
    }

    @PostMapping
    public AddOnItem createAddOnItem(@RequestBody AddOnItem addOnItem) {
        return addOnItemService.createAddOnItem(addOnItem);
    }
}
