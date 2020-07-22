package com.chkpt4training.training.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired MenuService menuService;

    @GetMapping()
    public List<Menu> getMenus() {
        return menuService.getMenus();
    }

    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable Long id) {
        Menu menu = new Menu();
        Optional<Menu> optionalMenu = menuService.getMenuById(id);
        if(optionalMenu.isPresent()) {
            menu = optionalMenu.get();
        }
        return menu;
    }

    @PostMapping()
    public Menu createMenu(@RequestBody Menu menu) { return menuService.createMenu(menu); }
}
