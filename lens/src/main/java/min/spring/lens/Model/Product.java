package min.spring.lens.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productCode;

	@Column(length = 30, nullable = false, name = "productName")
	private String productName;

	@ManyToOne
	@JoinColumn(name = "MAKER_CODE")
	private Maker maker;

	@ManyToOne
	@JoinColumn(name = "STORE_CODE")
	private Store store;

	@OneToMany(mappedBy = "product")
	private List<Options> options;

}

//--[Product]
//---P-ProductCode 	Integer					//제품 코드
//---ProductName   	varchar2(30)		//제품 이름
//---F-MakerCode   	Integer 				//메이커 코드
