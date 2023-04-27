package min.spring.lens.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class ProductController {

	// ---------------------------------------------------------------------------------------------------------------------
	@RequestMapping("/maker/product1") // 1. 상품 조회
	public String productList1() {

		return "maker_product1";
	}

	@RequestMapping("/maker/product2") // 2. 상품 조회
	public String productList2() {

		return "maker_product2";
	}

	@RequestMapping("/maker/product3") // 3. 상품 조회
	public String productlist3() {

		return "maker_product3";
	}

	@RequestMapping("/maker/product4") // 4. 상품 조회
	public String productlist4() {

		return "maker_product4";
	}

	@RequestMapping("/maker/product5") // 5. 상품 조회
	public String productlist5() {

		return "maker_product5";
	}

	// ---------------------------------------------------------------------------------------------------------------------


}