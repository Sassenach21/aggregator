package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Adress;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class AggregatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception{
        //this.mockMvc.perform(post("/server").param("name", "aa").andExpect(status().isOk()));
        this.mockMvc.perform(post("/server").contentType("application/json").content("{\"name\": \"aa\"}")).andExpect(status().isOk());
        //this.mockMvc.perform(get("/server").andDo(print()).andExpect(status().isOk()).andexpect(jsonPath("$[0].adress.street", is("aa"))));
    }

    //klasicky jednoduchy jUnit test
 /*   @Test
    public void test(){
        AggregatorController controller = new AggregatorController();
        controller.saveServer(new Identification("stanice1", new Adress("Nova", "3", "Praha"),
                new Person("Jan", "Novak")));
        List<Identification> list = controller.getIdentification( ).getBody( );
        assertNotNull(list);
        assertEquals(1, list.size());
    }*/

}