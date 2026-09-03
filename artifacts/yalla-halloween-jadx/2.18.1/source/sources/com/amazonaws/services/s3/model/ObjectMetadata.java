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
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class ObjectMetadata implements ServerSideEncryptionResult, S3RequesterChargedResult, ObjectExpirationResult, ObjectRestoreResult, Cloneable, Serializable {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final String f10864OoooO0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Date f10865Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Map<String, String> f10866Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Map<String, Object> f10867Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Date f10868Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Date f10869OoooO00;

    static {
        Objects.requireNonNull(SSEAlgorithm.AES256);
        f10864OoooO0 = SSEAlgorithm.KMS.getAlgorithm();
    }

    public ObjectMetadata() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f10866Oooo0o = new TreeMap(comparator);
        this.f10867Oooo0oO = new TreeMap(comparator);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO(String str) {
        this.f10867Oooo0oO.put("x-amz-server-side-encryption-customer-key-MD5", str);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0OO(String str) {
        this.f10867Oooo0oO.put("x-amz-server-side-encryption-customer-algorithm", str);
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void OooO0Oo(String str) {
        this.f10867Oooo0oO.put("x-amz-server-side-encryption", str);
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public final void OooO0o(boolean z) {
        if (z) {
            this.f10867Oooo0oO.put("x-amz-request-charged", "requester");
        }
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    public final void OooO0o0(Date date) {
        this.f10869OoooO00 = date;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String OooO0oO() {
        return (String) this.f10867Oooo0oO.get("x-amz-server-side-encryption");
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String OooOO0() {
        return (String) this.f10867Oooo0oO.get("x-amz-server-side-encryption-customer-key-MD5");
    }

    @Override // com.amazonaws.services.s3.internal.ObjectRestoreResult
    public final void OooOO0O(boolean z) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooOO0o(String str) {
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    public final void OooOOO(Date date) {
        this.f10865Oooo = date;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String OooOOO0() {
        return (String) this.f10867Oooo0oO.get("x-amz-server-side-encryption-customer-algorithm");
    }

    public final String OooOOOO() {
        return (String) this.f10867Oooo0oO.get("Content-MD5");
    }

    public final String OooOOOo() {
        return (String) this.f10867Oooo0oO.get("ETag");
    }

    public final void OooOOo(String str) {
        this.f10867Oooo0oO.put("Content-Type", str);
    }

    public final void OooOOo0(long j) {
        this.f10867Oooo0oO.put("Content-Length", Long.valueOf(j));
    }

    public final void OooOOoo(String str, Object obj) {
        this.f10867Oooo0oO.put(str, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        return new ObjectMetadata(this);
    }

    public ObjectMetadata(ObjectMetadata objectMetadata) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        this.f10866Oooo0o = new TreeMap(comparator);
        this.f10867Oooo0oO = new TreeMap(comparator);
        this.f10866Oooo0o = objectMetadata.f10866Oooo0o == null ? null : new TreeMap(objectMetadata.f10866Oooo0o);
        this.f10867Oooo0oO = objectMetadata.f10867Oooo0oO != null ? new TreeMap(objectMetadata.f10867Oooo0oO) : null;
        this.f10865Oooo = DateUtils.OooO00o(objectMetadata.f10865Oooo);
        this.f10868Oooo0oo = DateUtils.OooO00o(objectMetadata.f10868Oooo0oo);
        this.f10869OoooO00 = DateUtils.OooO00o(objectMetadata.f10869OoooO00);
    }
}
