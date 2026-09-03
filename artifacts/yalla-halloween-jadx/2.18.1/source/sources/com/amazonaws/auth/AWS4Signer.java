package com.amazonaws.auth;

import OooO00o.OooO00o;
import OooO0O0.OooO0O0;
import OooO0o.OooO0OO;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import com.yalla.support.cloudfilemanager.uploader.AmazonS3Client1;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Pattern;
import p016OooOoO0.OooOo00;
import p058o0000OoO.OooO;
import p130o00O0oo.o00oOoo;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner, Presigner {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f10301OooO0o0 = LogFactory.OooO00o(AWS4Signer.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f10302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f10303OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f10304OooO0Oo = true;

    public static class HeaderSigningResult {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f10305OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f10306OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f10307OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f10308OooO0Oo;

        public HeaderSigningResult(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.f10305OooO00o = str;
            this.f10306OooO0O0 = str2;
            this.f10307OooO0OO = bArr;
            this.f10308OooO0Oo = bArr2;
        }

        public final byte[] OooO00o() {
            byte[] bArr = this.f10308OooO0Oo;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public AWS4Signer() {
    }

    @Override // com.amazonaws.auth.ServiceAwareSigner
    public final void OooO00o(String str) {
        this.f10302OooO0O0 = str;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.amazonaws.auth.Signer
    public final void OooO0O0(Request<?> request, AWSCredentials aWSCredentials) {
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        AWSCredentials aWSCredentialsOooOO0O = OooOO0O(aWSCredentials);
        if (aWSCredentialsOooOO0O instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).OooO00o("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0O).OooO00o());
        }
        OooOOOo(request);
        long time = OooO(OooOO0(request)).getTime();
        String strOooO0O0 = DateUtils.OooO0O0("yyyyMMdd", new Date(time));
        String strOooOo0 = OooOo0(request, strOooO0O0);
        String strOooOOo0 = OooOOo0(request);
        String strOooOo0o = OooOo0o(time);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO00o("X-Amz-Date", strOooOo0o);
        if (defaultRequest.f10289OooO0Oo.get("x-amz-content-sha256") != null && "required".equals(defaultRequest.f10289OooO0Oo.get("x-amz-content-sha256"))) {
            defaultRequest.OooO00o("x-amz-content-sha256", strOooOOo0);
        }
        String str = aWSCredentialsOooOO0O.OooO0O0() + "/" + strOooOo0;
        HeaderSigningResult headerSigningResultOooOOoo = OooOOoo(request, strOooO0O0, strOooOo0o, strOooOOo0, aWSCredentialsOooOO0O);
        String strOooO0Oo = OooOo00.OooO0Oo("Credential=", str);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SignedHeaders=");
        sbOooO0o0.append(OooOo0O(request));
        String string = sbOooO0o0.toString();
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Signature=");
        sbOooO0o1.append(BinaryUtils.OooO0O0(headerSigningResultOooOOoo.OooO00o()));
        String string2 = sbOooO0o1.toString();
        StringBuilder sbOooO00o = o00oOoo.OooO00o("AWS4-HMAC-SHA256 ", strOooO0Oo, ", ", string, ", ");
        sbOooO00o.append(string2);
        defaultRequest.OooO00o("Authorization", sbOooO00o.toString());
        OooOoO0(request, headerSigningResultOooOOoo);
    }

    @Override // com.amazonaws.auth.RegionAwareSigner
    public final void OooO0OO(String str) {
        this.f10303OooO0OO = str;
    }

    @Override // com.amazonaws.auth.Presigner
    public final void OooO0Oo(Request<?> request, AWSCredentials aWSCredentials, Date date) {
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        long time = date != null ? (date.getTime() - System.currentTimeMillis()) / 1000 : 604800L;
        if (time > 604800) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request [");
            sbOooO0o0.append(OooOo0o(date.getTime()));
            sbOooO0o0.append("] has exceeded this limit.");
            throw new AmazonClientException(sbOooO0o0.toString());
        }
        OooOOOo(request);
        AWSCredentials aWSCredentialsOooOO0O = OooOO0O(aWSCredentials);
        if (aWSCredentialsOooOO0O instanceof AWSSessionCredentials) {
            ((DefaultRequest) request).OooO0O0("X-Amz-Security-Token", ((AWSSessionCredentials) aWSCredentialsOooOO0O).OooO00o());
        }
        long time2 = OooO(OooOO0(request)).getTime();
        String strOooO0O0 = DateUtils.OooO0O0("yyyyMMdd", new Date(time2));
        String str = aWSCredentialsOooOO0O.OooO0O0() + "/" + OooOo0(request, strOooO0O0);
        String strOooOo0o = OooOo0o(time2);
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO0O0("X-Amz-Algorithm", "AWS4-HMAC-SHA256");
        defaultRequest.OooO0O0("X-Amz-Date", strOooOo0o);
        defaultRequest.OooO0O0("X-Amz-SignedHeaders", OooOo0O(request));
        defaultRequest.OooO0O0("X-Amz-Expires", Long.toString(time));
        defaultRequest.OooO0O0("X-Amz-Credential", str);
        defaultRequest.OooO0O0("X-Amz-Signature", BinaryUtils.OooO0O0(OooOOoo(request, strOooO0O0, strOooOo0o, OooOOo(request), aWSCredentialsOooOO0O).OooO00o()));
    }

    public final void OooOOOo(Request<?> request) {
        String host = ((DefaultRequest) request).f10291OooO0o0.getHost();
        DefaultRequest defaultRequest = (DefaultRequest) request;
        if (HttpUtils.OooO0OO(defaultRequest.f10291OooO0o0)) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(host, CertificateUtil.DELIMITER);
            sbOooO00o.append(defaultRequest.f10291OooO0o0.getPort());
            host = sbOooO00o.toString();
        }
        defaultRequest.OooO00o("Host", host);
    }

    public String OooOOo(Request<?> request) {
        return OooOOo0(request);
    }

    public String OooOOo0(Request<?> request) {
        InputStream inputStreamOooO0o;
        if (HttpUtils.OooO0o0(request)) {
            String strOooO0O0 = HttpUtils.OooO0O0(request);
            inputStreamOooO0o = strOooO0O0 == null ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(strOooO0O0.getBytes(StringUtils.f11186OooO00o));
        } else {
            inputStreamOooO0o = OooO0o(request);
        }
        inputStreamOooO0o.mark(-1);
        try {
            MessageDigest messageDigest = AbstractAWSSigner.f10313OooO00o.get();
            messageDigest.reset();
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStreamOooO0o, messageDigest);
            while (sdkDigestInputStream.read(new byte[1024]) > -1) {
            }
            String strOooO0O1 = BinaryUtils.OooO0O0(sdkDigestInputStream.getMessageDigest().digest());
            try {
                inputStreamOooO0o.reset();
                return strOooO0O1;
            } catch (IOException e) {
                throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
            }
        } catch (Exception e2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to compute hash while signing request: ");
            sbOooO0o0.append(e2.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final HeaderSigningResult OooOOoo(Request request, String str, String str2, String str3, AWSCredentials aWSCredentials) {
        DefaultRequest defaultRequest = (DefaultRequest) request;
        URI uri = defaultRequest.f10291OooO0o0;
        String strOooO00o = this.f10303OooO0OO;
        if (strOooO00o == null) {
            strOooO00o = AwsHostNameUtils.OooO00o(uri.getHost(), this.f10302OooO0O0);
        }
        String strOooOo00 = OooOo00(defaultRequest.f10291OooO0o0);
        String strOooO00o2 = OooO.OooO00o(o00oOoo.OooO00o(str, "/", strOooO00o, "/", strOooOo00), "/", "aws4_request");
        String strOooO00o3 = HttpUtils.OooO00o(defaultRequest.f10291OooO0o0.getPath(), defaultRequest.f10286OooO00o, false);
        StringBuilder sb = new StringBuilder();
        sb.append(defaultRequest.f10293OooO0oo.toString());
        sb.append("\n");
        sb.append(OooO0oo(strOooO00o3, this.f10304OooO0Oo));
        sb.append("\n");
        sb.append(HttpUtils.OooO0o0(request) ? "" : OooO0oO(defaultRequest.f10288OooO0OO));
        sb.append("\n");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(defaultRequest.f10289OooO0Oo.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (OooOo(str4)) {
                String strReplaceAll = StringUtils.OooO00o(str4).replaceAll("\\s+", ZegoConstants.ZegoVideoDataAuxPublishingStream);
                Iterator it2 = it;
                String str5 = (String) defaultRequest.f10289OooO0Oo.get(str4);
                sb2.append(strReplaceAll);
                sb2.append(CertificateUtil.DELIMITER);
                if (str5 != null) {
                    sb2.append(str5.replaceAll("\\s+", ZegoConstants.ZegoVideoDataAuxPublishingStream));
                }
                sb2.append("\n");
                it = it2;
            }
        }
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append(OooOo0O(request));
        String strOooO00o4 = OooO.OooO00o(sb, "\n", str3);
        Log log = f10301OooO0o0;
        log.OooO00o("AWS4 Canonical Request: '\"" + strOooO00o4 + "\"");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("AWS4-HMAC-SHA256");
        OooO0O0.OooO00o(sb3, "\n", str2, "\n", strOooO00o2);
        sb3.append("\n");
        sb3.append(BinaryUtils.OooO0O0(AbstractAWSSigner.OooO0o0(strOooO00o4)));
        String string = sb3.toString();
        log.OooO00o("AWS4 String to Sign: '\"" + string + "\"");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("AWS4");
        sb4.append(aWSCredentials.OooO0OO());
        String string2 = sb4.toString();
        Charset charset = StringUtils.f11186OooO00o;
        byte[] bytes = string2.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] bArrOooOO0o = OooOO0o("aws4_request", OooOO0o(strOooOo00, OooOO0o(strOooO00o, OooOO0o(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new HeaderSigningResult(str2, strOooO00o2, bArrOooOO0o, OooOOO0(string.getBytes(charset), bArrOooOO0o, signingAlgorithm));
    }

    public final boolean OooOo(String str) {
        return "date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || ReportItem.RequestKeyHost.equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz");
    }

    public final String OooOo0(Request<?> request, String str) {
        URI uri = ((DefaultRequest) request).f10291OooO0o0;
        String strOooO00o = this.f10303OooO0OO;
        if (strOooO00o == null) {
            strOooO00o = AwsHostNameUtils.OooO00o(uri.getHost(), this.f10302OooO0O0);
        }
        return OooO.OooO00o(o00oOoo.OooO00o(str, "/", strOooO00o, "/", OooOo00(((DefaultRequest) request).f10291OooO0o0)), "/", "aws4_request");
    }

    public final String OooOo00(URI uri) {
        String str = this.f10302OooO0O0;
        if (str != null) {
            return str;
        }
        Pattern pattern = AwsHostNameUtils.f11171OooO00o;
        String host = uri.getHost();
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(OooO0OO.OooO00o("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
        }
        String strSubstring = host.substring(0, host.indexOf(".amazonaws.com"));
        if (strSubstring.endsWith(".s3") || AwsHostNameUtils.f11171OooO00o.matcher(strSubstring).matches()) {
            return AmazonS3Client1.S3_SERVICE_NAME;
        }
        return strSubstring.indexOf(46) == -1 ? strSubstring : strSubstring.substring(0, strSubstring.indexOf(46));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final String OooOo0O(Request<?> request) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(((DefaultRequest) request).f10289OooO0Oo.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (OooOo(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(StringUtils.OooO00o(str));
            }
        }
        return sb.toString();
    }

    public final String OooOo0o(long j) {
        return DateUtils.OooO0O0("yyyyMMdd'T'HHmmss'Z'", new Date(j));
    }

    public void OooOoO0(Request<?> request, HeaderSigningResult headerSigningResult) {
    }

    public AWS4Signer(boolean z) {
    }
}
