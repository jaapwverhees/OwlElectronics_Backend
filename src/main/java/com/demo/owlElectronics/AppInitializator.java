package com.demo.owlElectronics;

import com.demo.owlElectronics.DTO.CustomerDTO;
import com.demo.owlElectronics.DTO.OrderDTO;
import com.demo.owlElectronics.DTO.ProductDTO;
import com.demo.owlElectronics.controller.OrderController;

import com.demo.owlElectronics.controller.ProductController;
import com.demo.owlElectronics.data.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import javax.annotation.PostConstruct;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Component
public class AppInitializator {

    @Autowired
    ProductController productController;

    @PostConstruct
    private void init() throws Exception {

        setPhoto("src\\images\\uno_rev.jpg", "uno_rev.jpg", "uno_rev.jpg","jpg", 1);
        setPhoto("src\\images\\raspberry_pi_4_model_b_4GB.jpg", "raspberry_pi_4_model_b_4GB.jpg", "raspberry_pi_4_model_b_4GB.jpg","jpg", 2);
        setPhoto("src\\images\\raspberry_pi_4_model_b_2GB.jpg", "raspberry_pi_4_model_b_2GB.jpg", "raspberry_pi_4_model_b_2GB.jpg","jpg", 3);
        setPhoto("src\\images\\rasclock.jpg", "rasclock.jpg", "rasclock.jpg","jpg", 4);
        setPhoto("src\\images\\magician.jpg", "magician.jpg", "magician.jpg","jpg", 5);
        setPhoto("src\\images\\raspbehuis.jpg", "raspbehuis.jpg", "raspbehuis.jpg","jpg", 6);

    }
    void setPhoto(String pathString, String name, String originalFileName, String contentType, int productID)throws Exception{
        Path path = Paths.get(pathString);
        byte[] content = null;
        content = Files.readAllBytes(path);
        MultipartFile result = new MockMultipartFile(name,
                originalFileName, contentType, content);
        productController.setPhoto(productID, result);
    }


}
