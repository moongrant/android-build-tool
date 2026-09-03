package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.HttpMethod;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GeneratePresignedUrlRequest extends AmazonWebServiceRequest implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public HttpMethod f10789Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Map<String, String> f10790OoooO = new HashMap();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public String f10791OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f10792OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Date f10793OoooO0O;

    public GeneratePresignedUrlRequest(String str, String str2, HttpMethod httpMethod) {
        this.f10792OoooO00 = str;
        this.f10791OoooO0 = str2;
        this.f10789Oooo = httpMethod;
    }
}
