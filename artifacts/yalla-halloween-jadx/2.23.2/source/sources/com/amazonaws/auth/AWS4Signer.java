package com.amazonaws.auth;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f12081OooO0o0 = LogFactory.OooO00o(AWS4Signer.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f12082OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f12083OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f12084OooO0Oo;

    public static class HeaderSigningResult {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f12085OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f12086OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final byte[] f12087OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final byte[] f12088OooO0Oo;

        public HeaderSigningResult(byte[] bArr, String str, byte[] bArr2, String str2) {
            this.f12085OooO00o = str;
            this.f12086OooO0O0 = str2;
            this.f12087OooO0OO = bArr;
            this.f12088OooO0Oo = bArr2;
        }
    }

    public AWS4Signer() {
        this(true);
    }

    public static String OooOOOo(DefaultRequest defaultRequest) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(defaultRequest.f12069OooO0Oo.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (OooOOo0(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(StringUtils.OooO00o(str));
            }
        }
        return sb.toString();
    }

    public static boolean OooOOo0(String str) {
        return "date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || ReportItem.RequestKeyHost.equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz");
    }

    @Override // com.amazonaws.auth.ServiceAwareSigner
    public final void OooO00o(String str) {
        this.f12082OooO0O0 = str;
    }

    @Override // com.amazonaws.auth.RegionAwareSigner
    public final void OooO0O0(String str) {
        this.f12083OooO0OO = str;
    }

    @Override // com.amazonaws.auth.Signer
    public final void OooO0OO(DefaultRequest defaultRequest, AWSCredentials aWSCredentials) {
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        AWSCredentials aWSCredentialsOooOO0 = AbstractAWSSigner.OooOO0(aWSCredentials);
        if (aWSCredentialsOooOO0 instanceof AWSSessionCredentials) {
            defaultRequest.OooO00o("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0).OooO0O0());
        }
        String host = defaultRequest.f12071OooO0o0.getHost();
        if (HttpUtils.OooO0OO(defaultRequest.f12071OooO0o0)) {
            StringBuilder sbOooO0O0 = o000O0o.OooO0O0(host, CertificateUtil.DELIMITER);
            sbOooO0O0.append(defaultRequest.f12071OooO0o0.getPort());
            host = sbOooO0O0.toString();
        }
        defaultRequest.OooO00o("Host", host);
        long time = AbstractAWSSigner.OooO0oo(AbstractAWSSigner.OooO(defaultRequest)).getTime();
        String str = DateUtils.OooO0O0("yyyyMMdd").get().format(new Date(time));
        URI uri = defaultRequest.f12071OooO0o0;
        String strOooO00o = this.f12083OooO0OO;
        if (strOooO00o == null) {
            strOooO00o = AwsHostNameUtils.OooO00o(uri.getHost(), this.f12082OooO0O0);
        }
        String str2 = str + "/" + strOooO00o + "/" + OooOOOO(defaultRequest.f12071OooO0o0) + "/aws4_request";
        String strOooOOO = OooOOO(defaultRequest);
        String str3 = DateUtils.OooO0O0("yyyyMMdd'T'HHmmss'Z'").get().format(new Date(time));
        defaultRequest.OooO00o("X-Amz-Date", str3);
        HashMap map = defaultRequest.f12069OooO0Oo;
        if (map.get("x-amz-content-sha256") != null && "required".equals(map.get("x-amz-content-sha256"))) {
            defaultRequest.OooO00o("x-amz-content-sha256", strOooOOO);
        }
        String str4 = aWSCredentialsOooOO0.OooO00o() + "/" + str2;
        URI uri2 = defaultRequest.f12071OooO0o0;
        String strOooO00o2 = this.f12083OooO0OO;
        if (strOooO00o2 == null) {
            strOooO00o2 = AwsHostNameUtils.OooO00o(uri2.getHost(), this.f12082OooO0O0);
        }
        String strOooOOOO = OooOOOO(defaultRequest.f12071OooO0o0);
        String str5 = str + "/" + strOooO00o2 + "/" + strOooOOOO + "/aws4_request";
        String strOooO00o3 = HttpUtils.OooO00o(defaultRequest.f12071OooO0o0.getPath(), defaultRequest.f12066OooO00o, false);
        StringBuilder sb = new StringBuilder();
        sb.append(defaultRequest.f12073OooO0oo.toString());
        sb.append("\n");
        sb.append(AbstractAWSSigner.OooO0oO(strOooO00o3, this.f12084OooO0Oo));
        sb.append("\n");
        sb.append(HttpUtils.OooO0o0(defaultRequest) ? "" : AbstractAWSSigner.OooO0o(defaultRequest.f12068OooO0OO));
        sb.append("\n");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = it;
            String str6 = (String) it.next();
            if (OooOOo0(str6)) {
                String strReplaceAll = StringUtils.OooO00o(str6).replaceAll("\\s+", ZegoConstants.ZegoVideoDataAuxPublishingStream);
                String str7 = (String) map.get(str6);
                sb2.append(strReplaceAll);
                sb2.append(CertificateUtil.DELIMITER);
                if (str7 != null) {
                    sb2.append(str7.replaceAll("\\s+", ZegoConstants.ZegoVideoDataAuxPublishingStream));
                }
                sb2.append("\n");
            }
            it = it2;
            str4 = str4;
        }
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append(OooOOOo(defaultRequest));
        sb.append("\n");
        sb.append(strOooOOO);
        String string = sb.toString();
        String strOooO0O0 = o000oOoO.OooO0O0("AWS4 Canonical Request: '\"", string, "\"");
        Log log = f12081OooO0o0;
        log.OooO0oO(strOooO0O0);
        String str8 = "AWS4-HMAC-SHA256\n" + str3 + "\n" + str5 + "\n" + BinaryUtils.OooO0O0(AbstractAWSSigner.OooO0Oo(string));
        log.OooO0oO("AWS4 String to Sign: '\"" + str8 + "\"");
        String str9 = "AWS4" + aWSCredentialsOooOO0.OooO0OO();
        Charset charset = StringUtils.f12681OooO00o;
        byte[] bytes = str9.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] bArrOooOO0O = AbstractAWSSigner.OooOO0O(signingAlgorithm, "aws4_request", AbstractAWSSigner.OooOO0O(signingAlgorithm, strOooOOOO, AbstractAWSSigner.OooOO0O(signingAlgorithm, strOooO00o2, AbstractAWSSigner.OooOO0O(signingAlgorithm, str, bytes))));
        byte[] bArrOooOO0o = AbstractAWSSigner.OooOO0o(str8.getBytes(charset), bArrOooOO0O, signingAlgorithm);
        HeaderSigningResult headerSigningResult = new HeaderSigningResult(bArrOooOO0O, str3, bArrOooOO0o, str5);
        String strOooO00o4 = o00O00OO.OooO00o("Credential=", str4);
        String str10 = "SignedHeaders=" + OooOOOo(defaultRequest);
        StringBuilder sb3 = new StringBuilder("Signature=");
        byte[] bArr = new byte[bArrOooOO0o.length];
        System.arraycopy(bArrOooOO0o, 0, bArr, 0, bArrOooOO0o.length);
        sb3.append(BinaryUtils.OooO0O0(bArr));
        String string2 = sb3.toString();
        StringBuilder sbOooO00o = OooO0OO.OooO00o("AWS4-HMAC-SHA256 ", strOooO00o4, ", ", str10, ", ");
        sbOooO00o.append(string2);
        defaultRequest.OooO00o("Authorization", sbOooO00o.toString());
        OooOOo(defaultRequest, headerSigningResult);
    }

    public String OooOOO(DefaultRequest defaultRequest) {
        InputStream inputStreamOooO0o0;
        if (HttpUtils.OooO0o0(defaultRequest)) {
            String strOooO0O0 = HttpUtils.OooO0O0(defaultRequest);
            inputStreamOooO0o0 = strOooO0O0 == null ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(strOooO0O0.getBytes(StringUtils.f12681OooO00o));
        } else {
            inputStreamOooO0o0 = AbstractAWSSigner.OooO0o0(defaultRequest);
        }
        inputStreamOooO0o0.mark(-1);
        try {
            MessageDigest messageDigest = AbstractAWSSigner.f12099OooO00o.get();
            messageDigest.reset();
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStreamOooO0o0, messageDigest);
            while (sdkDigestInputStream.read(new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY]) > -1) {
            }
            String strOooO0O1 = BinaryUtils.OooO0O0(sdkDigestInputStream.getMessageDigest().digest());
            try {
                inputStreamOooO0o0.reset();
                return strOooO0O1;
            } catch (IOException e) {
                throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
            }
        } catch (Exception e2) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e2.getMessage(), e2);
        }
    }

    public final String OooOOOO(URI uri) {
        String str = this.f12082OooO0O0;
        if (str != null) {
            return str;
        }
        Pattern pattern = AwsHostNameUtils.f12665OooO00o;
        String host = uri.getHost();
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(o000oOoO.OooO0O0("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
        }
        String strSubstring = host.substring(0, host.indexOf(".amazonaws.com"));
        if (strSubstring.endsWith(".s3") || AwsHostNameUtils.f12665OooO00o.matcher(strSubstring).matches()) {
            return "s3";
        }
        return strSubstring.indexOf(46) == -1 ? strSubstring : strSubstring.substring(0, strSubstring.indexOf(46));
    }

    public void OooOOo(DefaultRequest defaultRequest, HeaderSigningResult headerSigningResult) {
    }

    public AWS4Signer(boolean z) {
        this.f12084OooO0Oo = z;
    }
}
