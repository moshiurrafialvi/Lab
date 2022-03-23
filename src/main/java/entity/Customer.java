package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


public class Customer {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String location;
    @Field
    private double gender;
    @Field
    private int orderHistory[];
    @Field
    private int age;
    @Field
    private int creditcardnumber;
}
