package com.app.model;

import OooO00o.OooO00o;
import android.text.TextUtils;
import com.app.impl.UploadSingleCallback;
import java.io.File;
import java.io.Serializable;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class UploadModel implements Serializable {
    private String address;
    private String bucket;
    private String compressPath;
    private long id;
    private String name;
    private String path;
    private UploadSingleCallback.State status;
    private String url;
    private String xPhone;

    public UploadModel(String str, String str2) {
        this.path = str;
        this.address = str2;
    }

    private String getHashCode(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iHashCode = new File(str).hashCode();
        if (iHashCode < 0) {
            iHashCode *= -1;
        }
        return OooOo00.OooO0Oo(iHashCode + "", str.length() > 4 ? str.substring(str.lastIndexOf("."), str.length()) : "");
    }

    public String getAddress() {
        return this.address;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getCompressPath() {
        return TextUtils.isEmpty(this.compressPath) ? this.path : this.compressPath;
    }

    public long getId() {
        return this.id;
    }

    public String getKey() {
        if (TextUtils.isEmpty(this.bucket) && TextUtils.isEmpty(this.name)) {
            return getHashCode(this.path);
        }
        return this.bucket + this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public UploadSingleCallback.State getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public String getXPhone() {
        return this.xPhone;
    }

    public UploadModel onCancel() {
        this.status = UploadSingleCallback.State.cancel;
        return this;
    }

    public UploadModel onComplete() {
        if (!TextUtils.isEmpty(this.address)) {
            if (this.address.lastIndexOf("/") == this.address.length() - 1) {
                setUrl(this.address + getKey());
            } else {
                setUrl(this.address + File.separator + getKey());
            }
        }
        this.status = UploadSingleCallback.State.complete;
        return this;
    }

    public UploadModel onErr() {
        this.status = UploadSingleCallback.State.err;
        return this;
    }

    public UploadModel setAddress(String str) {
        this.address = str;
        return this;
    }

    public UploadModel setBucket(String str) {
        this.bucket = str;
        return this;
    }

    public UploadModel setCompressPath(String str) {
        this.compressPath = str;
        return this;
    }

    public UploadModel setId(long j) {
        this.id = j;
        return this;
    }

    public UploadModel setName(String str) {
        this.name = str;
        return this;
    }

    public UploadModel setPath(String str) {
        this.path = str;
        return this;
    }

    public UploadModel setUrl(String str) {
        this.url = str;
        return this;
    }

    public UploadModel setXPhone(String str) {
        this.xPhone = str;
        return this;
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UploadModel{id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", path='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.path, '\'', ", compressPath=");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.compressPath, '\'', ", url='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", bucket='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.bucket, '\'', ", name='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", address='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.address, '\'', ", xPhone='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.xPhone, '\'', ", status=");
        sbOooO0o0.append(this.status);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    public UploadModel(String str) {
        this(str, null);
    }
}
