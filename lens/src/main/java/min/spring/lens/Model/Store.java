package min.spring.lens.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer storeCode;

	@Column(nullable = false, length = 30)
	private String storeName;

	@Column(unique = true, length = 30)
	private String storeTel;

	@OneToMany(mappedBy = "store")
	private List<Reservation> reservations;

	@OneToMany(mappedBy = "store")
	private List<Product> products;

	@OneToMany(mappedBy = "store")
	private List<Member> member;
	 
}

//--[Store]
//---P-StoreCode 	Integer					//매장 코드
//---StoreName	 	varchar2(50)   			//매장 이름
//---StoreTel			varchar2(50)		//매장 전화번호
