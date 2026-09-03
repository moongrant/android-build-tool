package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Exception extends AmazonServiceException {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f10706OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Map<String, String> f10707OoooO0O;

    public AmazonS3Exception(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + ", S3 Extended Request ID: " + this.f10706OoooO0;
    }
}
