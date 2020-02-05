package com.demo.owlElectronics.controller;

import com.demo.owlElectronics.model.Question;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class QuestionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private QuestionController questionController;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void setQuestion()throws Exception {
        Question question = new Question();
        question.setInputQuestion("Hello, is it me you looking for?");
        question.setLastName("Tester");
        question.setFirstName("Test");
        question.setEmail("test@test");
        String json = mapper.writeValueAsString(question);
        mockMvc.perform(post("/question/place")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
