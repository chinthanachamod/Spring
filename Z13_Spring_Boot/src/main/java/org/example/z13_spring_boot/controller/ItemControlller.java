package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.ItemDTO;
import org.example.z13_spring_boot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemControlller {
    @Autowired
    private ItemService itemService;

    @GetMapping("get")
    public List<ItemDTO> getItems() {
        List<ItemDTO> items = itemService.getItems();
        return items;
    }

    @PostMapping("save")
    public boolean saveItem(ItemDTO itemDTO) {
        boolean saveItem = itemService.saveItem(itemDTO);
        return saveItem;
    }

    @PutMapping("update")
    public boolean updateItem(ItemDTO itemDTO) {
        boolean updated = itemService.updateItem(itemDTO);
        return updated;
    }

    @DeleteMapping("delete")
    public boolean deleteItem(ItemDTO itemDTO) {
        boolean deleted = itemService.deleteItem(itemDTO.getId());
        return deleted;
    }
}
