/**
 * 
 */
package com.diego.clima.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author dcandido
 *
 */
@JsonInclude(content = Include.NON_NULL)
public class RespostaResponse {
	
	@JsonProperty("by")
	private String type;
	
	@JsonProperty("valid_key")
	private Boolean validKey;
	
	@JsonProperty("execution_time")
	private int executionTime;
	
	@JsonProperty("from_cache")
	private Boolean fromCache;	
	
	private ResultsResponse results;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getValidKey() {
		return validKey;
	}
	public void setValidKey(Boolean validKey) {
		this.validKey = validKey;
	}
	public int getExecutionTime() {
		return executionTime;
	}
	public void setExecutionTime(int executionTime) {
		this.executionTime = executionTime;
	}
	public Boolean getFromCache() {
		return fromCache;
	}
	public void setFromCache(Boolean fromCache) {
		this.fromCache = fromCache;
	}
	public ResultsResponse getResults() {
		return results;
	}
	public void setResults(ResultsResponse results) {
		this.results = results;
	}
}
