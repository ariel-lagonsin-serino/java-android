package com.global.api.terminals.builders;

import android.location.Address;

import com.global.api.ServicesContainer;
import com.global.api.entities.enums.CurrencyType;
import com.global.api.entities.enums.PaymentMethodType;
import com.global.api.entities.enums.TaxType;
import com.global.api.entities.enums.TransactionType;
import com.global.api.entities.exceptions.ApiException;
import com.global.api.paymentMethods.IPaymentMethod;
import com.global.api.paymentMethods.TransactionReference;
import com.global.api.terminals.DeviceController;
//import com.global.api.terminals.TerminalResponse;
import com.global.api.terminals.abstractions.ITerminalResponse;
import com.global.api.terminals.ingenico.variables.ExtendedDataTags;
import com.global.api.terminals.ingenico.variables.PaymentMode;
import com.global.api.terminals.ingenico.variables.ReportTypes;

import java.math.BigDecimal;
import java.util.EnumSet;

public class TerminalAuthBuilder extends TerminalBuilder<TerminalAuthBuilder> {
//    private Address address;
    private boolean allowDuplicates;
    private BigDecimal amount;
    private String authCode;
    private BigDecimal cashBackAmount;
    private CurrencyType currency;
    private String customerCode;
    private BigDecimal gratuity;
    private String invoiceNumber;
    private String poNumber;
    private boolean requestMultiUseToken;
    private boolean signatureCapture;
    private BigDecimal taxAmount;
    private String taxExempt;
    private String taxExemptId;
    private String transactionId;

    // ingenico properties
    private String currencyCode;
    private String tableNumber;
    private PaymentMode paymentMode;
    private ExtendedDataTags extendedDataTags;
    private ReportTypes reportType;

//    public Address getAddress() {
//        return address;
//    }
    public boolean isAllowDuplicates() {
        return allowDuplicates;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public String getAuthCode() {
        if(paymentMethod instanceof TransactionReference)
            return ((TransactionReference)paymentMethod).getAuthCode();
        return null;
    }
    public BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }
    public CurrencyType getCurrency() {
        return currency;
    }
    public BigDecimal getGratuity() {
        return gratuity;
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public boolean isRequestMultiUseToken() {
        return requestMultiUseToken;
    }
    public boolean isSignatureCapture() {
        return signatureCapture;
    }
    public String getTransactionId() {
        if(paymentMethod instanceof TransactionReference)
            ((TransactionReference)paymentMethod).getTransactionId();
        return null;
    }
    public String getCustomerCode() {
        return customerCode;
    }
    public String getPoNumber() {
        return poNumber;
    }
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }
    public String getTaxExempt() {
        return taxExempt;
    }
    public String getTaxExemptId() {
        return taxExemptId;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public ExtendedDataTags getExtendedDataTag() {
        return extendedDataTags;
    }

    public ReportTypes getReportType() {
        return reportType;
    }

    public TerminalAuthBuilder withAddress(Address address) {
//        this.address = address;
        return this;
    }
    public TerminalAuthBuilder withAllowDuplicates(boolean allowDuplicates) {
        this.allowDuplicates = allowDuplicates;
        return this;
    }
    public TerminalAuthBuilder withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
    public TerminalAuthBuilder withAuthCode(String value) {
        if (paymentMethod == null || !(paymentMethod instanceof TransactionReference))
            paymentMethod = new TransactionReference();
        ((TransactionReference)paymentMethod).setAuthCode(value);
        this.authCode = value;
        return this;
    }
    public TerminalAuthBuilder withCashBack(BigDecimal value) {
        this.cashBackAmount = value;
        extendedDataTags = ExtendedDataTags.CASHB;
        return this;
    }
    public TerminalAuthBuilder withCurrency(CurrencyType value) {
        this.currency = value;
        return this;
    }
    public TerminalAuthBuilder withCustomerCode(String value) {
        this.customerCode = value;
        return this;
    }
    public TerminalAuthBuilder withGratuity(BigDecimal gratuity) {
        this.gratuity = gratuity;
        return this;
    }
    public TerminalAuthBuilder withInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }
    public TerminalAuthBuilder withPaymentMethod(IPaymentMethod method) {
        paymentMethod = method;
        return this;
    }
    public TerminalAuthBuilder withPoNumber(String value) {
        this.poNumber = value;
        return this;
    }
    public TerminalAuthBuilder withRequestMultiUseToken(boolean requestMultiUseToken) {
        this.requestMultiUseToken = requestMultiUseToken;
        return this;
    }
    public TerminalAuthBuilder withSignatureCapture(boolean signatureCapture) {
        this.signatureCapture = signatureCapture;
        return this;
    }
    public TerminalAuthBuilder withTaxAmount(BigDecimal value) {
        this.taxAmount = value;
        return this;
    }
    public TerminalAuthBuilder withTaxType(TaxType value) {
        return withTaxType(value, null);
    }
    public TerminalAuthBuilder withTaxType(TaxType value, String taxExemptId) {
        this.taxExempt = (value.equals(TaxType.TaxExempt)) ? "1" : "0";
        this.taxExemptId = taxExemptId;
        return this;
    }
    public TerminalAuthBuilder withToken(String value) {
//        if (paymentMethod == null || !(paymentMethod instanceof CreditCardData))
//            paymentMethod = new CreditCardData();
//        ((CreditCardData)paymentMethod).setToken(value);
        return this;
    }
    public TerminalAuthBuilder withTransactionId(String value) {
        if (paymentMethod == null || !(paymentMethod instanceof TransactionReference))
            paymentMethod = new TransactionReference();
        ((TransactionReference)paymentMethod).setTransactionId(value);
        this.transactionId = value;
        return this;
    }

    // ingenico methods
    public TerminalAuthBuilder withCurrencyCode(String value) {
        this.currencyCode = value;
        return this;
    }

    public TerminalAuthBuilder withTableNumber(String value) {
        this.tableNumber = value;
        extendedDataTags = ExtendedDataTags.TABLE_NUMBER;
        return this;
    }

    public TerminalAuthBuilder withPaymentMode(PaymentMode value) {
        this.paymentMode = value;
        return this;
    }

    public TerminalAuthBuilder withReportType(ReportTypes value) {
        this.reportType = value;
        return this;
    }

    public TerminalAuthBuilder(TransactionType type, PaymentMethodType paymentType) {
        super(type, paymentType);
    }

    public ITerminalResponse execute(String configName) throws ApiException {
        super.execute(configName);

        DeviceController device = ServicesContainer.getInstance().getDeviceController(configName);
        return device.processTransaction(this);
    }

    public void setupValidations() {
        this.validations.of(EnumSet.of(TransactionType.Sale, TransactionType.Auth)).check("amount").isNotNull();
        this.validations.of(TransactionType.Refund).check("amount").isNotNull();
        this.validations.of(TransactionType.Auth)
                .with(PaymentMethodType.Credit)
                .when("transactionId").isNotNull()
                .check("authCode").isNotNull();
        this.validations.of(TransactionType.Refund)
                .with(PaymentMethodType.Credit)
                .when("transactionId").isNotNull()
                .check("authCode").isNotNull();
        this.validations.of(PaymentMethodType.Gift).check("currency").isNotNull();
        this.validations.of(TransactionType.AddValue).check("amount").isNotNull();

        this.validations.of(PaymentMethodType.EBT).with(TransactionType.Balance)
                .when("currency").isNotNull()
                .check("currency").isNotEqual(CurrencyType.Voucher);
        this.validations.of(TransactionType.BenefitWithdrawal)
                .when("currency").isNotNull()
                .check("currency").isEqualTo(CurrencyType.CashBenefits);
        this.validations.of(PaymentMethodType.EBT).with(TransactionType.Refund).check("allowDuplicates").isEqualTo(false);
        this.validations.of(PaymentMethodType.EBT).with(TransactionType.BenefitWithdrawal).check("allowDuplicates").isEqualTo(false);
    }
}