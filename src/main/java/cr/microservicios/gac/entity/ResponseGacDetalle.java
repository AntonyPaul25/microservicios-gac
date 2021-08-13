package cr.microservicios.gac.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseGacDetalle {

	@JsonProperty("codeID")
	private String codeID;

	@JsonProperty("documentIdType")
	private String documentIdType;

	@JsonProperty("documentIdNumber")
	private String documentIdNumber;

	@JsonProperty("warrantyNumber")
	private String warrantyNumber;

	@JsonProperty("documentCode")
	private String documentCode;

	@JsonProperty("documentName")
	private String documentName;

	@JsonProperty("coverageTypeCode")
	private String coverageTypeCode;

	@JsonProperty("typeCoverage")
	private String typeCoverage;

	@JsonProperty("currencyCode")
	private String currencyCode;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("status")
	private String status;

	@JsonProperty("realizationValue")
	private String realizationValue;

	@JsonProperty("commercialValue")
	private String commercialValue;

	@JsonProperty("taxValue")
	private String taxValue;

	public String getCodeID() {
		return codeID;
	}

	public void setCodeID(String codeID) {
		this.codeID = codeID;
	}

	public String getDocumentIdType() {
		return documentIdType;
	}

	public void setDocumentIdType(String documentIdType) {
		this.documentIdType = documentIdType;
	}

	public String getDocumentIdNumber() {
		return documentIdNumber;
	}

	public void setDocumentIdNumber(String documentIdNumber) {
		this.documentIdNumber = documentIdNumber;
	}

	public String getWarrantyNumber() {
		return warrantyNumber;
	}

	public void setWarrantyNumber(String warrantyNumber) {
		this.warrantyNumber = warrantyNumber;
	}

	public String getDocumentCode() {
		return documentCode;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getCoverageTypeCode() {
		return coverageTypeCode;
	}

	public void setCoverageTypeCode(String coverageTypeCode) {
		this.coverageTypeCode = coverageTypeCode;
	}

	public String getTypeCoverage() {
		return typeCoverage;
	}

	public void setTypeCoverage(String typeCoverage) {
		this.typeCoverage = typeCoverage;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRealizationValue() {
		return realizationValue;
	}

	public void setRealizationValue(String realizationValue) {
		this.realizationValue = realizationValue;
	}

	public String getCommercialValue() {
		return commercialValue;
	}

	public void setCommercialValue(String commercialValue) {
		this.commercialValue = commercialValue;
	}

	public String getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(String taxValue) {
		this.taxValue = taxValue;
	}

}
