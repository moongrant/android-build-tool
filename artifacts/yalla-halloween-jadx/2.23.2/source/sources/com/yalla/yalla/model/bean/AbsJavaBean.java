package com.yalla.yalla.model.bean;

import com.facebook.internal.security.CertificateUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class AbsJavaBean implements Serializable {
    private static final long serialVersionUID = 0;

    public String toJSONString() {
        return BasicGsonConvert.toJson(this);
    }

    public String toString() {
        return getClass().getSimpleName() + CertificateUtil.DELIMITER + toJSONString();
    }
}
