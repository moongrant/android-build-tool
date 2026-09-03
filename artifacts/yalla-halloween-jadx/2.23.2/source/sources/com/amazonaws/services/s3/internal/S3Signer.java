package com.amazonaws.services.s3.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public class S3Signer extends AbstractAWSSigner {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f12424OooO0o0 = LogFactory.OooO00o(S3Signer.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f12425OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f12426OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Set<String> f12427OooO0Oo;

    public S3Signer() {
        this.f12425OooO0O0 = null;
        this.f12426OooO0OO = null;
        this.f12427OooO0Oo = null;
    }

    @Override // com.amazonaws.auth.Signer
    public final void OooO0OO(DefaultRequest defaultRequest, AWSCredentials aWSCredentials) {
        Set<String> set;
        String str = this.f12426OooO0OO;
        if (str == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        }
        String strOooO0OO = aWSCredentials.OooO0OO();
        Log log = f12424OooO0o0;
        if (strOooO0OO == null) {
            log.OooO0oO("Canonical string will not be signed, as no AWS Secret Key was provided");
            return;
        }
        AWSCredentials aWSCredentialsOooOO0 = AbstractAWSSigner.OooOO0(aWSCredentials);
        if (aWSCredentialsOooOO0 instanceof AWSSessionCredentials) {
            defaultRequest.OooO00o("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0).OooO0O0());
        }
        String strOooO00o = HttpUtils.OooO00o(defaultRequest.f12071OooO0o0.getPath(), str, true);
        Date dateOooO0oo = AbstractAWSSigner.OooO0oo(AbstractAWSSigner.OooO(defaultRequest));
        Log log2 = ServiceUtils.f12431OooO00o;
        defaultRequest.OooO00o("Date", DateUtils.OooO0O0("EEE, dd MMM yyyy HH:mm:ss z").get().format(dateOooO0oo));
        List<String> list = RestUtils.f12420OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12425OooO0O0 + "\n");
        HashMap map = defaultRequest.f12069OooO0Oo;
        TreeMap treeMap = new TreeMap();
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (str2 != null) {
                    String strOooO00o2 = StringUtils.OooO00o(str2);
                    if ("content-type".equals(strOooO00o2) || "content-md5".equals(strOooO00o2) || "date".equals(strOooO00o2) || strOooO00o2.startsWith("x-amz-")) {
                        treeMap.put(strOooO00o2, str3);
                    }
                }
            }
        }
        if (treeMap.containsKey("x-amz-date")) {
            treeMap.put("date", "");
        }
        if (!treeMap.containsKey("content-type")) {
            treeMap.put("content-type", "");
        }
        if (!treeMap.containsKey("content-md5")) {
            treeMap.put("content-md5", "");
        }
        LinkedHashMap linkedHashMap = defaultRequest.f12068OooO0OO;
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getKey()).startsWith("x-amz-")) {
                treeMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : treeMap.entrySet()) {
            String str4 = (String) entry3.getKey();
            String str5 = (String) entry3.getValue();
            if (str4.startsWith("x-amz-")) {
                sb.append(str4);
                sb.append(':');
                if (str5 != null) {
                    sb.append(str5);
                }
            } else if (str5 != null) {
                sb.append(str5);
            }
            sb.append("\n");
        }
        sb.append(strOooO00o);
        String[] strArr = (String[]) linkedHashMap.keySet().toArray(new String[linkedHashMap.size()]);
        Arrays.sort(strArr);
        char c = '?';
        for (String str6 : strArr) {
            if (RestUtils.f12420OooO00o.contains(str6) || ((set = this.f12427OooO0Oo) != null && set.contains(str6))) {
                if (sb.length() == 0) {
                    sb.append(c);
                }
                sb.append(str6);
                String str7 = (String) linkedHashMap.get(str6);
                if (str7 != null) {
                    sb.append("=");
                    sb.append(str7);
                }
                c = Typography.amp;
            }
        }
        String string = sb.toString();
        log.OooO0oO("Calculated string to sign:\n\"" + string + "\"");
        defaultRequest.OooO00o("Authorization", "AWS " + aWSCredentialsOooOO0.OooO00o() + CertificateUtil.DELIMITER + AbstractAWSSigner.OooOOO0(SigningAlgorithm.HmacSHA1, aWSCredentialsOooOO0.OooO0OO(), string.getBytes(StringUtils.f12681OooO00o)));
    }

    public S3Signer(String str, String str2) {
        if (str2 != null) {
            this.f12425OooO0O0 = str;
            this.f12426OooO0OO = str2;
            this.f12427OooO0Oo = null;
            return;
        }
        throw new IllegalArgumentException("Parameter resourcePath is empty");
    }
}
