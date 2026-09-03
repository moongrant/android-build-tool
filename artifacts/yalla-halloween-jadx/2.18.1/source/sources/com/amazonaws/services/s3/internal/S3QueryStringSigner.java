package com.amazonaws.services.s3.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.SigningAlgorithm;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class S3QueryStringSigner extends AbstractAWSSigner {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Long f10667OooO0o0 = 1000L;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10668OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f10669OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Date f10670OooO0Oo;

    public S3QueryStringSigner(String str, String str2, Date date) {
        this.f10668OooO0O0 = str;
        this.f10669OooO0OO = str2;
        this.f10670OooO0Oo = date;
        if (str2 == null) {
            throw new IllegalArgumentException("Parameter resourcePath is empty");
        }
    }

    @Override // com.amazonaws.auth.Signer
    public final void OooO0O0(Request<?> request, AWSCredentials aWSCredentials) {
        AWSCredentials aWSCredentialsOooOO0O = OooOO0O(aWSCredentials);
        if (aWSCredentialsOooOO0O instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).OooO0O0("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0O).OooO00o());
        }
        String string = Long.toString(this.f10670OooO0Oo.getTime() / f10667OooO0o0.longValue());
        String strOooOOO = OooOOO(RestUtils.OooO00o(this.f10668OooO0O0, this.f10669OooO0OO, request, string, null), aWSCredentialsOooOO0O.OooO0OO(), SigningAlgorithm.HmacSHA1);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO0O0("AWSAccessKeyId", aWSCredentialsOooOO0O.OooO0O0());
        defaultRequest.OooO0O0("Expires", string);
        defaultRequest.OooO0O0("Signature", strOooOOO);
    }
}
