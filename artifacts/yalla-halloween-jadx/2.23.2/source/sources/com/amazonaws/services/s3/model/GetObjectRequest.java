package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList f12481OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final S3ObjectIdBuilder f12482OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long[] f12483OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList f12484OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ProgressListener f12485OooOO0O;

    public GetObjectRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = new S3ObjectIdBuilder();
        this.f12482OooO0oO = s3ObjectIdBuilder;
        this.f12481OooO = new ArrayList();
        this.f12484OooOO0 = new ArrayList();
        s3ObjectIdBuilder.f12518OooO0Oo = str;
        s3ObjectIdBuilder.f12520OooO0o0 = str2;
        s3ObjectIdBuilder.f12519OooO0o = null;
    }
}
