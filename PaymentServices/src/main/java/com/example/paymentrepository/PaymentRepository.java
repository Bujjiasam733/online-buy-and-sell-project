package com.example.paymentrepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.payment.Payment;

public class PaymentRepository {

	@Repository
	public interface CompanyRepository
		extends CrudRepository<Payment,Integer> {

		Payment findById(int id);
		List<Payment> findAll();
		void deleteById(int id);
	}

	

	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return findAll();
	}
	

}
