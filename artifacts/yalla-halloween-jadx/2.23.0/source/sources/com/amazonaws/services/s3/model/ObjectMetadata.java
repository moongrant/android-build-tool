package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.util.DateUtils;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f9411OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, String> f9412OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Date f9413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final TreeMap f9414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Date f9415OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Date f9416OooO0oo;

    static {
        SSEAlgorithm.AES256.getClass();
        f9411OooO = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f9412OooO0Oo = new TreeMap(comparator);
        this.f9414OooO0o0 = new TreeMap(comparator);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO(String str) {
        this.f9414OooO0o0.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0O0(String str) {
        this.f9414OooO0o0.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooO0Oo(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0o(String str) {
        this.f9414OooO0o0.put("x-amz-server-side-encryption", str);
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooO0o0(Date date) {
        this.f9415OooO0oO = date;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0oO(boolean z) {
        if (z) {
            this.f9414OooO0o0.put("x-amz-request-charged", "requester");
        }
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    public final void OooO0oo(Date date) {
        this.f9416OooO0oo = date;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    public final void OooOO0(boolean z) {
    }

    public final String OooOO0O() {
        return (String) this.f9414OooO0o0.get("ETag");
    }

    public final Object clone() throws CloneNotSupportedException {
        return new ObjectMetadata(this);
    }

    public ObjectMetadata(ObjectMetadata objectMetadata) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f9412OooO0Oo = new TreeMap(comparator);
        this.f9414OooO0o0 = new TreeMap(comparator);
        this.f9412OooO0Oo = objectMetadata.f9412OooO0Oo == null ? null : new TreeMap(objectMetadata.f9412OooO0Oo);
        this.f9414OooO0o0 = objectMetadata.f9414OooO0o0 != null ? new TreeMap((Map) objectMetadata.f9414OooO0o0) : null;
        this.f9415OooO0oO = DateUtils.OooO00o(objectMetadata.f9415OooO0oO);
        this.f9413OooO0o = DateUtils.OooO00o(objectMetadata.f9413OooO0o);
        this.f9416OooO0oo = DateUtils.OooO00o(objectMetadata.f9416OooO0oo);
    }
}
