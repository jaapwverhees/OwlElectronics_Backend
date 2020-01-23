package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.DTO.CustomerDTO;
import com.demo.owlElectronics.DTO.OrderDTO;
import com.demo.owlElectronics.DTO.ProductDTO;
import com.demo.owlElectronics.model.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @Autowired
    private OrderController controller;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;

    @Test
    void contextLoads()throws Exception{
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

    //TODO below test gives following error:
//    Description:
//    Field orderRepository in com.demo.owlElectronics.controller.OrderController required a bean of type 'com.demo.owlElectronics.data.OrderRepository' that could not be found.
//    The injection point has the following annotations:- @org.springframework.beans.factory.annotation.Autowired(required=true)
//    Action: Consider defining a bean of type 'com.demo.owlElectronics.data.OrderRepository' in your configuration.

    @Test
    void placeOrder() throws Exception{
        CustomerDTO customerDTO = getValidCustomerDTO();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductID(1);
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCustomer(customerDTO);
        orderDTO.setProduct(productDTO);
        String json = mapper.writeValueAsString(orderDTO);
        mockMvc.perform(post("order/place")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private CustomerDTO getValidCustomerDTO(){
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