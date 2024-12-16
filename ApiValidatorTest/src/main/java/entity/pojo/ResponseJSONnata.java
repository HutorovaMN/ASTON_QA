package entity.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseJSONnata {
    private String uid;
    private String id;
    private String name;
    private String error_type;
    private String attr_id;
    private String attr_name;
    private String error_text;
    private String link;
    private String domain;
    private String validator_type;
}
