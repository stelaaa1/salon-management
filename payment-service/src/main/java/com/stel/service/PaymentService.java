package com.stel.service;

import com.razorpay.PaymentLink;
import com.razorpay.RazorpayException;
import com.stel.domain.PaymentMethod;
import com.stel.model.PaymentOrder;
import com.stel.payload.response.PaymentLinkResponse;
import com.stel.payload.response.dto.BookingDTO;
import com.stel.payload.response.dto.UserDTO;
import com.stripe.exception.StripeException;

public interface PaymentService {

    PaymentLinkResponse createOrder(UserDTO user,
                                    BookingDTO booking,
                                    PaymentMethod paymentMethod);

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    PaymentOrder getPaymentOrderByPaymentId (String paymentId);

    PaymentLink createRazorpayPaymentLink(UserDTO user,
                                          Long amount,
                                          Long orderId) throws RazorpayException;

    String createStripePaymentLink(UserDTO user,
                                   Long amount,
                                   Long orderId) throws StripeException;

    Boolean proceedPayment(PaymentOrder paymentOrder, String paymentId, String paymentLinkId) throws RazorpayException;

}
