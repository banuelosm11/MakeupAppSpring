package com.aurora.ControllerV1;

import com.aurora.DTO.Category;
import com.aurora.DTO.Report;
import com.aurora.Domain.Product;
import com.aurora.Repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aurorabanuelos on 7/1/17.
 */
@RestController("inventoryListControllerV1")
@RequestMapping("/inventoryList")
@CrossOrigin("http://localhost:8100")
public class InvReportController {

    @Inject
    private ProductRepository productRepository;

    @RequestMapping(value = "/compute", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam String currentOrEmpty, @RequestParam String timeframe) {

        Report newReport = new Report();

        Iterable<Product> allProducts = productRepository.findAll();

        int totalProducts = 0;
        double totalPrice = 0;
        double lipcatPrice = 0;
        int lipcatCount = 0;

        ArrayList<Category> tempArray = new ArrayList<>();


        if(currentOrEmpty.equals("current") && timeframe.equals("forever")) {
            for (Product p : allProducts) {

                totalProducts++;
                totalPrice += p.getPrice();
                System.out.println(p.getPrice() + p.getCategory());

                if(p.getCategory().equals("Lipsticks")) {
                    lipcatPrice += p.getPrice();
                    lipcatCount++;
                }
            }
        }
                Category lipsticks = new Category();
                lipsticks.setCategoryType("Lipsticks");
                lipsticks.setCatPrice(lipcatPrice);
                lipsticks.setCatQuantity(lipcatCount);
                tempArray.add(lipsticks);

                newReport.setTotalProducts(totalProducts);
                newReport.setTotalPrice(totalPrice);
                newReport.setCategories(tempArray);

        return new ResponseEntity<>(newReport, HttpStatus.OK);

    }
}
