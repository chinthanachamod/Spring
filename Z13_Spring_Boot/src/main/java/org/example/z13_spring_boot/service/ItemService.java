package org.example.z13_spring_boot.service;


import org.example.z13_spring_boot.dto.ItemDTO;
import org.example.z13_spring_boot.entity.Item;
import org.example.z13_spring_boot.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public List<ItemDTO> getItems() {
        List<Item> itemList = itemRepo.findAll();
        List<ItemDTO> itemDtos = new ArrayList<>();

        for (Item item : itemList) {
            itemDtos.add(new ItemDTO(item.getId(), item.getName(), item.getDescription(), item.getPrice(), item.getQuantity()));
        }
        return itemDtos;
    }

    public boolean saveItem(ItemDTO itemDTO) {
        itemRepo.save(new Item(itemDTO.getId(), itemDTO.getName(), itemDTO.getDescription(), itemDTO.getPrice(), itemDTO.getQuantity()));
        return true;
    }

    public boolean updateItem(ItemDTO itemDTO) {
        Item item = itemRepo.findById(itemDTO.getId()).orElse(null);
        item.setName(itemDTO.getName());
        item.setDescription(itemDTO.getDescription());
        item.setPrice(itemDTO.getPrice());
        item.setQuantity(itemDTO.getQuantity());
        itemRepo.save(item);
        return true;
    }

    public boolean deleteItem(int id) {
        itemRepo.deleteById(id);
        return true;
    }
}
