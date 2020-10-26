package com.global.api.terminals.abstractions;

import java.math.BigDecimal;

import com.global.api.entities.enums.ApplicationCryptogramType;
import com.global.api.terminals.ingenico.variables.DynamicCurrencyStatus;
import com.global.api.terminals.ingenico.variables.PaymentMethod;
import com.global.api.terminals.ingenico.variables.PaymentMode;
import com.global.api.terminals.ingenico.variables.TransactionSubTypes;

public interface ITerminalResponse extends IDeviceResponse {
    String getResponseCode();

    void setResponseCode(String responseCode);

    String getResponseText();

    void setResponseText(String responseText);

    String getTransactionId();

    void setTransactionId(String transactionId);

    String getTerminalRefNumber();

    void setTerminalRefNumber(String terminalRefNumber);

    String getToken();

    void setToken(String token);

    String getSignatureStatus();

    void setSignatureStatus(String signatureStatus);

    byte[] getSignatureData();

    void setSignatureData(byte[] signatureData);

    String getTransactionType();

    void setTransactionType(String transactionType);

    String getMaskedCardNumber();

    void setMaskedCardNumber(String maskedCardNumber);

    String getEntryMethod();

    void setEntryMethod(String entryMethod);

    String getAuthorizationCode();

    void setAuthorizationCode(String authorizationCode);

    String getApprovalCode();

    void setApprovalCode(String approvalCode);

    BigDecimal getTransactionAmount();

    void setTransactionAmount(BigDecimal amount);

    BigDecimal getAmountDue();

    void setAmountDue(BigDecimal amountDue);

    BigDecimal getBalanceAmount();

    void setBalanceAmount(BigDecimal balanceAmount);

    String getCardHolderName();

    void setCardHolderName(String cardHolderName);

    String getCardBIN();

    void setCardBIN(String cardBIN);

    boolean getCardPresent();

    void setCardPresent(boolean cardPresent);

    String getExpirationDate();

    void setExpirationDate(String expiradationDate);

    BigDecimal getTipAmount();

    void setTipAmount(BigDecimal tipAmount);

    BigDecimal getCashBackAmount();

    void setCashBackAmount(BigDecimal cashBackAmount);

    String getAvsResponseCode();

    void setAvsResponseCode(String avsResponseCode);

    String getAvsResponseText();

    void setAvsResponseText(String avsResponseText);

    String getCvvResponseCode();

    void setCvvResponseCode(String cvvResponseCode);

    String getCvvResponseText();

    void setCvvResponseText(String cvvResponseText);

    boolean getTaxExempt();

    void setTaxExempt(boolean taxExempt);

    String getTaxExemptId();

    void setTaxExemptId(String taxExemptId);

    String getTicketNumber();

    void setTicketNumber(String ticketNumber);

    String getPaymentType();

    void setPaymentType(String paymentType);

    String getApplicationPreferredName();

    void setApplicationPreferredName(String applicationPreferredName);

    String getApplicationLabel();

    void setApplicationLabel(String applicationLabel);

    String getApplicationId();

    void setApplicationId(String applicationId);

    ApplicationCryptogramType getApplicationCryptogramType();

    void setApplicationCryptogramType(ApplicationCryptogramType applicationCryptogramType);

    String getApplicationCryptogram();

    void setApplicationCryptogram(String applicationCryptogram);

    String getCardHolderVerificationMethod();

    void setCardHolderVerificationMethod(String cardHolderVerificationMethod);

    String getTerminalVerificationResults();

    void setTerminalVerificationResults(String terminalVerificationResults);

    //--
    String getCurrencyCode();

    void setCurrencyCode(String currencyCode);

    String getPrivateData();

    void setPrivateData(String privateData);

    BigDecimal getFinalTransactionAmount();

    void setFinalTransactionAmount(BigDecimal finalTransactionAmount);

    String getPaymentMethod();

    void setPaymentMethod(PaymentMethod paymentMethod);

    String getTransactionSubType();

    void setTransactionSubType(TransactionSubTypes transactionSubType);

    BigDecimal getSplitSaleAmount();

    void setSplitSaleAmount(BigDecimal splitSaleAmount);

    BigDecimal getDynamicCurrencyCodeAmount();

    void setDyanmicCurrencyCodeAmount(BigDecimal dynamicCurrencyCodeAmount);

    String getDynamicCurrencyCode();

    void setDynamicCurrencyCode(String dynamicCurrencyCode);

    String getDynamicCurrencyCodeStatus();

    void setDynamicCurrencyCodeStatus(DynamicCurrencyStatus status);

    String getPaymentMode();

    void setPaymentMode(PaymentMode paymentMode);
}