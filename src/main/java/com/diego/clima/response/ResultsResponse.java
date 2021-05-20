/**
 * 
 */
package com.diego.clima.response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author dcandido
 *
 */
@JsonInclude(content = Include.NON_NULL)
public class ResultsResponse {

	private Integer temp;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;
	
	@JsonFormat(pattern = "HH:MM")
    private Date time;
	
    @JsonProperty("condition_code")
    private Integer conditionCode;
    
    private String description;
    
    private String currently;
    
    private String cid;
    
    @JsonProperty("img_id")
    private Integer imgId;
    
    private Integer humidity;
    
    @JsonProperty("wind_speedy")
    private String windSpeedy;
    
    private String sunrise;
    
    private String sunset;
    
    @JsonProperty("condition_slug")
    private String conditionSlug;
    
    @JsonProperty("city_name")
    private String cityName;
    
    private String city;
    
    @JsonProperty("forecast")
    private List<ForecastResponse> forecasts;

	public Integer getTemp() {
		return temp;
	}

	public void setTemp(Integer temp) {
		this.temp = temp;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getConditionCode() {
		return conditionCode;
	}

	public void setConditionCode(Integer conditionCode) {
		this.conditionCode = conditionCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrently() {
		return currently;
	}

	public void setCurrently(String currently) {
		this.currently = currently;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Integer getImgId() {
		return imgId;
	}

	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public String getWindSpeedy() {
		return windSpeedy;
	}

	public void setWindSpeedy(String windSpeedy) {
		this.windSpeedy = windSpeedy;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getConditionSlug() {
		return conditionSlug;
	}

	public void setConditionSlug(String conditionSlug) {
		this.conditionSlug = conditionSlug;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<ForecastResponse> getForecasts() {
		return forecasts;
	}

	public void setForecasts(List<ForecastResponse> forecasts) {
		this.forecasts = forecasts;
	}
}
