package com.trendyol.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ElementInfo {

  @SerializedName("key")
  @Expose
  private String key;
  @SerializedName("iosValue")
  @Expose
  private String iosValue;
  @SerializedName("iosType")
  @Expose
  private String iosType;
  @SerializedName("iosIndex")
  @Expose
  private int iosIndex;

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getIosValue() {
    return iosValue;
  }

  public void setIosValue(String iosValue) {
    this.iosValue = iosValue;
  }

  public String getIosType() {
    return iosType;
  }

  public void setIosType(String iosType) {
    this.iosType = iosType;
  }

  public int getIosIndex() {
    return iosIndex;
  }

  public void setIosIndex(int iosIndex) {
    this.iosIndex = iosIndex;
  }


  @Override
  public String toString() {
    return "ElementInfo{" +
        "key='" + key + '\'' +
        ", iosValue='" + iosValue + '\'' +
        ", iosType='" + iosType + '\'' +
        ", iosIndex=" + iosIndex +
        '}';
  }
}
