package com.demo.owlElectronics.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.demo.owlElectronics.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {

    Product product;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductController controller;

    @Test
    void contextLoads()throws Exception{
        assertThat(controller).isNotNull();
    }

    //TODO test only tests if Reaction Status is 200. should expand test to content of response.
    @Test
    void getAllProducts() throws Exception {
        this.mockMvc.perform(get("/products/all")).andExpect(status().isOk());
    }

    //TODO test only tests if Reaction Status is 200. should expand test to content of response.
    @Test
    void findByProductId() throws Exception {
        this.mockMvc.perform(get("/products/single/1")).andExpect(status().isOk());
    }
}