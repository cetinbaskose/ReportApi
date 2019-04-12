package com.example.reportapi.dto;

public class ResponseDto {

	    private String currency;
		private Long count;
		private Double total;
		
		public ResponseDto(String currency,Long count,Double total) {
			super();
			this.currency = currency;
			this.count = count;
			this.total = total;
		}
		
		public ResponseDto(String currency, String count, String total) {
			super();
			this.currency = currency;

		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Long getCount() {
			return count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Double getTotal() {
			return total;
		}

		public void setTotal(Double total) {
			this.total = total;
		}
		

		

		

    
	
}
