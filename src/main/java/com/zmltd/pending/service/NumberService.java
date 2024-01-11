// package com.zmltd.pending.service;
// // 
// import org.springframework.stereotype.Service;
// import com.zmltd.pending.entity.PhoneNumber;
// import com.zmltd.pending.repo.NumberRepo;

// @Service

// public class NumberService {

//     private final NumberRepo numberRepo;

//     public NumberService(NumberRepo numberRepo) {

//         this.numberRepo = numberRepo;
//     }

//     public PhoneNumber saveNumber(PhoneNumber number) {

//         PhoneNumber number1 = new PhoneNumber();
//         number1.setMsisdn(number.getMsisdn());
//         return numberRepo.save(number);

//     }

//     // Deleting stuff

//     // public String deleteNumber(int id) {
//     // String response = "failed to delete";
//     // Optional<PhoneNumber> number = numberRepo.findById(id);
//     // if(number.isPresent()){
//     // numberRepo.deleteById(id);
//     // response = "Number has been deleted successfully";
//     // }
//     // return response;
//     // }

// }
