package com.amazonaws.services.s3.internal;

import OooO00o.OooO00o;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.facebook.internal.security.CertificateUtil;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class S3Signer extends AbstractAWSSigner {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f10671OooO0o0 = LogFactory.OooO00o(S3Signer.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f10672OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f10673OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<String> f10674OooO0Oo;

    public S3Signer() {
        this.f10672OooO0O0 = null;
        this.f10673OooO0OO = null;
        this.f10674OooO0Oo = null;
    }

    @Override // com.amazonaws.auth.Signer
    public final void OooO0O0(Request<?> request, AWSCredentials aWSCredentials) {
        if (this.f10673OooO0OO == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        }
        if (aWSCredentials.OooO0OO() == null) {
            f10671OooO0o0.OooO00o("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }
        AWSCredentials aWSCredentialsOooOO0O = OooOO0O(aWSCredentials);
        if (aWSCredentialsOooOO0O instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).OooO00o("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0O).OooO00o());
        }
        DefaultRequest defaultRequest = (DefaultRequest) request;
        String strOooO00o = HttpUtils.OooO00o(defaultRequest.f10291OooO0o0.getPath(), this.f10673OooO0OO, true);
        Date dateOooO = OooO(OooOO0(request));
        Log log = ServiceUtils.f10681OooO00o;
        defaultRequest.OooO00o("Date", DateUtils.OooO0OO(dateOooO));
        String strOooO00o2 = RestUtils.OooO00o(this.f10672OooO0O0, strOooO00o, request, null, this.f10674OooO0Oo);
        f10671OooO0o0.OooO00o("Calculated string to sign:\n\"" + strOooO00o2 + "\"");
        String strOooOOO = OooOOO(strOooO00o2, aWSCredentialsOooOO0O.OooO0OO(), SigningAlgorithm.HmacSHA1);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AWS ");
        sbOooO0o0.append(aWSCredentialsOooOO0O.OooO0O0());
        sbOooO0o0.append(CertificateUtil.DELIMITER);
        sbOooO0o0.append(strOooOOO);
        defaultRequest.OooO00o("Authorization", sbOooO0o0.toString());
    }

    public S3Signer(String str, String str2) {
        if (str2 != null) {
            this.f10672OooO0O0 = str;
            this.f10673OooO0OO = str2;
            this.f10674OooO0Oo = null;
            return;
        }
        throw new IllegalArgumentException("Parameter resourcePath is empty");
    }
}
