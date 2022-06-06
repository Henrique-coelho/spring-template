package basePackage.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "Produto")
@NoArgsConstructor
public class Example extends BaseEntity {

    private String id;

    public Example(String id) {
        super(id);
    }
}
