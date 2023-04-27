package min.spring.lens.Model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StoreCreateForm {
	
	@NotEmpty(message="이미 등록된 매장이름 입니다.")
	@Size(min=1, max=30)
	private String storeName;

	@NotEmpty(message="이미 등록된 전화번호 입니다.")
	@Size(min=1, max=30)
	private String storeTel;
}
