package com.yalla.yalla.model;

import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
public class QiniuTokenModel extends AbsJavaBean {
    private String fileName;
    private String filename;
    private String upToken;
    private String uptoken;

    public String getFilename() {
        String str = this.filename;
        return str == null ? this.fileName : str;
    }

    public String getUptoken() {
        String str = this.uptoken;
        return str == null ? this.upToken : str;
    }
}
