package com.switchfly.compress;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Asset {

    private AssetType _type;
    private String _url;
    private String _group;

    public AssetType getType() {
        return _type;
    }

    public void setType(AssetType type) {
        _type = type;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String url) {
        _url = url;
    }

    public String getGroup() {
        return _group;
    }

    public void setGroup(String group) {
        _group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) o;
        return StringUtils.equals(getUrl(), asset.getUrl());
    }

    @Override
    public int hashCode() {
        return _url == null ? 0 : _url.hashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
            append("url", _url).
            append("type", _type).
            append("group", _group).
            toString();
    }
}