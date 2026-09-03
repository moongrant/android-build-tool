package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.event.ProgressListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GetObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ProgressListener f10808OoooO;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long[] f10810OoooO00;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public S3ObjectIdBuilder f10807Oooo = new S3ObjectIdBuilder();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public List<String> f10809OoooO0 = new ArrayList();

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public List<String> f10811OoooO0O = new ArrayList();

    public GetObjectRequest(String str, String str2) {
        S3ObjectIdBuilder s3ObjectIdBuilder = this.f10807Oooo;
        s3ObjectIdBuilder.f10901Oooo0o = str;
        s3ObjectIdBuilder.f10902Oooo0oO = str2;
        s3ObjectIdBuilder.f10903Oooo0oo = null;
    }

    public final long[] OooO0Oo() {
        long[] jArr = this.f10810OoooO00;
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }
}
