package com.zdran.btmovie.provider.domain;

public class MovieType {
    private Integer tpyeId;

    private String typeName;

    public Integer getTpyeId() {
        return tpyeId;
    }

    public void setTpyeId(Integer tpyeId) {
        this.tpyeId = tpyeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}