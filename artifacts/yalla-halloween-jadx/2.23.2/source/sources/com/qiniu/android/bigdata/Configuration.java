package com.qiniu.android.bigdata;

import com.qiniu.android.http.ProxyConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class Configuration implements Cloneable {
    public ProxyConfiguration proxy;
    public String pipelineHost = "https://pipeline.qiniu.com";
    public int connectTimeout = 3;
    public int responseTimeout = 10;

    public static Configuration copy(Configuration configuration) {
        if (configuration == null) {
            return new Configuration();
        }
        try {
            return configuration.m4188clone();
        } catch (CloneNotSupportedException unused) {
            return new Configuration();
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Configuration m4188clone() throws CloneNotSupportedException {
        return (Configuration) super.clone();
    }
}
