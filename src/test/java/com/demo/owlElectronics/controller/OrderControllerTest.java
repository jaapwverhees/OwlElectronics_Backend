package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.DTO.CustomerDTO;
import com.demo.owlElectronics.DTO.OrderDTO;
import com.demo.owlElectronics.DTO.ProductDTO;
import com.demo.owlElectronics.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class OrderControllerTest {

    @Autowired
    private OrderController controller;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;

    @Test
    void contextLoads(){
        assertThat(controller).isNotNull();
    }

    @Test
    void orderDTOToCustomerTransformer() {
        CustomerDTO customerDTO = getValidCustomerDTO();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCustomer(customerDTO);
        Customer customer = controller.orderDTOToCustomerTransformer(orderDTO);
        assertEquals(customer.getFirstName(), customerDTO.getFirstName());
        assertEquals(customer.getLastName(), customerDTO.getLastName());
        assertEquals(customer.getEmail(), customerDTO.getEmail());
        assertEquals(customer.getCity(), customerDTO.getCity());
        assertEquals(customer.getStreetName(), customerDTO.getStreetName());
        assertEquals(customer.getStreetNumber(), customerDTO.getStreetNumber());
        assertEquals(customer.getZipCode(),customerDTO.getZipCode());
    }

    @Test
    void placeOrder() throws Exception{
        CustomerDTO customerDTO = getValidCustomerDTO();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductID(1);
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCustomer(customerDTO);
        orderDTO.setProduct(productDTO);
        String json = mapper.writeValueAsString(orderDTO);
        mockMvc.perform(post("/order/place")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    public CustomerDTO getValidCustomerDTO(){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setFirstName("firstName");
        customerDTO.setLastName("lastname");
        customerDTO.setCity("city");
        customerDTO.setEmail("email");
        customerDTO.setStreetName("streetName");
        customerDTO.setStreetNumber("number");
        customerDTO.setZipCode("zipCod");
        return customerDTO;
    }
}