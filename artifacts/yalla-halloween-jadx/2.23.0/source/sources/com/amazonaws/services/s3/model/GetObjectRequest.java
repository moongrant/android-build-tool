package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f9391OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final S3ObjectIdBuilder f9392OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long[] f9393OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f9394OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ProgressListener f9395OooOO0O;

    public GetObjectRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f9392OooO0oO = s3ObjectIdBuilder;
        this.f9391OooO = new ArrayList();
        this.f9394OooOO0 = new ArrayList();
        s3ObjectIdBuilder.f9428OooO0Oo = str;
        s3ObjectIdBuilder.f9430OooO0o0 = str2;
        s3ObjectIdBuilder.f9429OooO0o = null;
    }
}
