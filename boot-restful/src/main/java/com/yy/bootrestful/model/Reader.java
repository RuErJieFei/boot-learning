package com.yy.bootrestful.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/10 7:03 下午
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reader {
    private String name;
    private Integer age;

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(Reader.builder().name("YY").age(12).build());
        Reader reader = mapper.readValue(s, Reader.class);
        System.out.println(reader.toString());
    }
}
