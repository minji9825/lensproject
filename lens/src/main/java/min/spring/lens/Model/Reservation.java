package min.spring.lens.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reservationCode;

	private LocalDateTime createDate;

	@Column(length = 30, nullable = false)
	private String buyTime;

	@Column(length = 30, nullable = false)
	private Integer count;

	@Column(length = 30, nullable = false)
	private String productOption;

	@Column(length = 30, nullable = false)
	private String productName;

	@ManyToOne
	@JoinColumn(name = "MEMBER_CODE")
	private Member member;

	@ManyToOne
	@JoinColumn(name = "STORE_CODE")
	private Store store;
}
