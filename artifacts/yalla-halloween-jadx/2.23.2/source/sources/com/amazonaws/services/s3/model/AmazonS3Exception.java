package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class AmazonS3Exception extends AmazonServiceException implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public String f12454OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Map<String, String> f12455OooOO0;

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ", S3 Extended Request ID: " + this.f12454OooO;
    }
}
