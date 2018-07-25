package com.simplus.gestao.xls;

import com.simplus.gestao.services.CompanyService;
import com.simplus.gestao.services.ProductService;
import com.simplus.gestao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExportController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CompanyService companyService;

    /**
     * Handle request to download an Excel document
     */

    @GetMapping("/download1")//relatório com os produtos da empresa 1
    public String DownProduct1(Model model) {

        model.addAttribute("products", productService.findByCompany(1));

        return "";

    }

    @GetMapping("/download1cx1")//relatório com os produtos da empresa 1 caixa
    public String DownProduct1cx(Model model) {

        model.addAttribute("products", productService.findGtln14(1));

        return "";

    }

    @GetMapping("/download2")//relatório com os produtos da empresa 2
    public String DownProduct2(Model model) {

        model.addAttribute("products", productService.findByCompany(2));

        return "";
    }

    @GetMapping("/download2cx2")//relatório com os produtos da empresa 2 caixa
    public String DownProduct2cx(Model model) {

        model.addAttribute("products", productService.findGtln14(1));

        return "";

    }
}
