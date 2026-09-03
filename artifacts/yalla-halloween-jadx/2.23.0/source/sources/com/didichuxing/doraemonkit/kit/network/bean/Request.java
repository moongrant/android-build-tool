package com.didichuxing.doraemonkit.kit.network.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class Request implements Serializable {
    public String encode;
    public String headers;
    public String method;
    public String postData;
    public String url;

    public boolean filter(String str) {
        return false;
    }

    public String toString() {
        return "";
    }
}
