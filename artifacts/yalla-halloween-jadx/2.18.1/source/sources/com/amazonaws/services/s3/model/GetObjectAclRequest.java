package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectAclRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public S3ObjectIdBuilder f10804Oooo;

    public GetObjectAclRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f10804Oooo = s3ObjectIdBuilder;
        s3ObjectIdBuilder.f10901Oooo0o = str;
        s3ObjectIdBuilder.f10902Oooo0oO = str2;
        s3ObjectIdBuilder.f10903Oooo0oo = null;
    }

    public GetObjectAclRequest(String str, String str2, String str3) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f10804Oooo = s3ObjectIdBuilder;
        s3ObjectIdBuilder.f10901Oooo0o = str;
        s3ObjectIdBuilder.f10902Oooo0oO = str2;
        s3ObjectIdBuilder.f10903Oooo0oo = str3;
    }
}
