package com.amazonaws.auth;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class AWS3Signer extends AbstractAWSSigner {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f10300OooO0O0 = LogFactory.OooO00o(AWS3Signer.class);

    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.amazonaws.auth.Signer
    public final void OooO0O0(Request<?> request, AWSCredentials aWSCredentials) {
        ArrayList arrayList;
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        AWSCredentials aWSCredentialsOooOO0O = OooOO0O(aWSCredentials);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        UUID.randomUUID().toString();
        String strOooO0OO = DateUtils.OooO0OO(OooO(OooOO0(request)));
        DefaultRequest defaultRequest = (DefaultRequest) request;
        defaultRequest.OooO00o("Date", strOooO0OO);
        defaultRequest.OooO00o("X-Amz-Date", strOooO0OO);
        String host = defaultRequest.f10291OooO0o0.getHost();
        if (HttpUtils.OooO0OO(defaultRequest.f10291OooO0o0)) {
            StringBuilder sbOooO00o = Oooo0.OooO00o(host, CertificateUtil.DELIMITER);
            sbOooO00o.append(defaultRequest.f10291OooO0o0.getPort());
            host = sbOooO00o.toString();
        }
        defaultRequest.OooO00o("Host", host);
        if (aWSCredentialsOooOO0O instanceof AWSSessionCredentials) {
            defaultRequest.OooO00o("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0O).OooO00o());
        }
        String strOooO00o = HttpUtils.OooO00o(defaultRequest.f10291OooO0o0.getPath(), defaultRequest.f10286OooO00o, false);
        StringBuilder sb = new StringBuilder();
        sb.append(defaultRequest.f10293OooO0oo.toString());
        sb.append("\n");
        boolean z = true;
        sb.append(OooO0oo(strOooO00o, true));
        sb.append("\n");
        sb.append(OooO0oO(defaultRequest.f10288OooO0OO));
        sb.append("\n");
        List<String> listOooOOOo = OooOOOo(defaultRequest);
        int i = 0;
        while (true) {
            arrayList = (ArrayList) listOooOOOo;
            if (i >= arrayList.size()) {
                break;
            }
            arrayList.set(i, StringUtils.OooO00o((String) arrayList.get(i)));
            i++;
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : defaultRequest.f10289OooO0Oo.entrySet()) {
            if (arrayList.contains(StringUtils.OooO00o((String) entry.getKey()))) {
                treeMap.put(StringUtils.OooO00o((String) entry.getKey()), entry.getValue());
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            sb2.append(StringUtils.OooO00o((String) entry2.getKey()));
            sb2.append(CertificateUtil.DELIMITER);
            sb2.append((String) entry2.getValue());
            sb2.append("\n");
        }
        sb.append(sb2.toString());
        sb.append("\n");
        InputStream inputStreamOooO0o = OooO0o(defaultRequest);
        try {
            inputStreamOooO0o.mark(-1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[5120];
            while (true) {
                int i2 = inputStreamOooO0o.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            }
            byteArrayOutputStream.close();
            inputStreamOooO0o.reset();
            sb.append(new String(byteArrayOutputStream.toByteArray(), StringUtils.f11186OooO00o));
            String string = sb.toString();
            byte[] bArrOooO0o0 = AbstractAWSSigner.OooO0o0(string);
            f10300OooO0O0.OooO00o("Calculated StringToSign: " + string);
            String strOooOOOO = OooOOOO(bArrOooO0o0, aWSCredentialsOooOO0O.OooO0OO(), signingAlgorithm);
            StringBuilder sbOooO00o2 = Oooo0.OooO00o("AWS3", ZegoConstants.ZegoVideoDataAuxPublishingStream);
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AWSAccessKeyId=");
            sbOooO0o0.append(aWSCredentialsOooOO0O.OooO0O0());
            sbOooO0o0.append(",");
            sbOooO00o2.append(sbOooO0o0.toString());
            sbOooO00o2.append("Algorithm=" + signingAlgorithm.toString() + ",");
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("SignedHeaders=");
            for (String str : (ArrayList) OooOOOo(defaultRequest)) {
                if (!z) {
                    sbOooO0o1.append(";");
                }
                sbOooO0o1.append(str);
                z = false;
            }
            sb3.append(sbOooO0o1.toString());
            sb3.append(",");
            sbOooO00o2.append(sb3.toString());
            sbOooO00o2.append("Signature=" + strOooOOOO);
            defaultRequest.OooO00o("X-Amzn-Authorization", sbOooO00o2.toString());
        } catch (Exception e) {
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("Unable to read request payload to sign request: ");
            sbOooO0o2.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o2.toString(), e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final List<String> OooOOOo(Request<?> request) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((DefaultRequest) request).f10289OooO0Oo.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            String strOooO00o = StringUtils.OooO00o(str);
            if (strOooO00o.startsWith("x-amz") || ReportItem.RequestKeyHost.equals(strOooO00o)) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
