package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public class AWS3Signer extends AbstractAWSSigner {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Log f8990OooO0O0 = LogFactory.OooO00o(AWS3Signer.class);

    public static ArrayList OooOOO(DefaultRequest defaultRequest) {
        ArrayList arrayList = new ArrayList();
        Iterator it = defaultRequest.f8979OooO0Oo.entrySet().iterator();
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

    @Override // com.amazonaws.auth.Signer
    public final void OooO0OO(DefaultRequest defaultRequest, AWSCredentials aWSCredentials) {
        if (aWSCredentials instanceof AnonymousAWSCredentials) {
            return;
        }
        AWSCredentials aWSCredentialsOooOO0 = AbstractAWSSigner.OooOO0(aWSCredentials);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        UUID.randomUUID().toString();
        String str = DateUtils.OooO0O0("EEE, dd MMM yyyy HH:mm:ss z").get().format(AbstractAWSSigner.OooO0oo(AbstractAWSSigner.OooO(defaultRequest)));
        defaultRequest.OooO00o("Date", str);
        defaultRequest.OooO00o("X-Amz-Date", str);
        String host = defaultRequest.f8981OooO0o0.getHost();
        if (HttpUtils.OooO0OO(defaultRequest.f8981OooO0o0)) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(host, CertificateUtil.DELIMITER);
            sbOooO0O0.append(defaultRequest.f8981OooO0o0.getPort());
            host = sbOooO0O0.toString();
        }
        defaultRequest.OooO00o("Host", host);
        if (aWSCredentialsOooOO0 instanceof AWSSessionCredentials) {
            defaultRequest.OooO00o("x-amz-security-token", ((AWSSessionCredentials) aWSCredentialsOooOO0).OooO0O0());
        }
        String strOooO00o = HttpUtils.OooO00o(defaultRequest.f8981OooO0o0.getPath(), defaultRequest.f8976OooO00o, false);
        StringBuilder sb = new StringBuilder();
        sb.append(defaultRequest.f8983OooO0oo.toString());
        sb.append("\n");
        boolean z = true;
        sb.append(AbstractAWSSigner.OooO0oO(strOooO00o, true));
        sb.append("\n");
        sb.append(AbstractAWSSigner.OooO0o(defaultRequest.f8978OooO0OO));
        sb.append("\n");
        ArrayList arrayListOooOOO = OooOOO(defaultRequest);
        for (int i = 0; i < arrayListOooOOO.size(); i++) {
            arrayListOooOOO.set(i, StringUtils.OooO00o((String) arrayListOooOOO.get(i)));
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : defaultRequest.f8979OooO0Oo.entrySet()) {
            if (arrayListOooOOO.contains(StringUtils.OooO00o((String) entry.getKey()))) {
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
        InputStream inputStreamOooO0o0 = AbstractAWSSigner.OooO0o0(defaultRequest);
        try {
            inputStreamOooO0o0.mark(-1);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[5120];
            while (true) {
                int i2 = inputStreamOooO0o0.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
            }
            byteArrayOutputStream.close();
            inputStreamOooO0o0.reset();
            sb.append(new String(byteArrayOutputStream.toByteArray(), StringUtils.f9590OooO00o));
            String string = sb.toString();
            byte[] bArrOooO0Oo = AbstractAWSSigner.OooO0Oo(string);
            f8990OooO0O0.OooO0oO("Calculated StringToSign: ".concat(string));
            String strOooOOO0 = AbstractAWSSigner.OooOOO0(signingAlgorithm, aWSCredentialsOooOO0.OooO0OO(), bArrOooO0Oo);
            StringBuilder sb3 = new StringBuilder("AWS3 ");
            sb3.append("AWSAccessKeyId=" + aWSCredentialsOooOO0.OooO00o() + ",");
            sb3.append("Algorithm=" + signingAlgorithm.toString() + ",");
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder("SignedHeaders=");
            for (String str2 : OooOOO(defaultRequest)) {
                if (!z) {
                    sb5.append(";");
                }
                sb5.append(str2);
                z = false;
            }
            sb4.append(sb5.toString());
            sb4.append(",");
            sb3.append(sb4.toString());
            sb3.append("Signature=" + strOooOOO0);
            defaultRequest.OooO00o("X-Amzn-Authorization", sb3.toString());
        } catch (Exception e) {
            throw new AmazonClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }
}
