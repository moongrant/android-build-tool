package com.amazonaws.auth;

import OooO00o.OooO00o;
import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAWSSigner implements Signer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<MessageDigest> f10313OooO00o = new ThreadLocal<MessageDigest>() { // from class: com.amazonaws.auth.AbstractAWSSigner.1
        @Override // java.lang.ThreadLocal
        public final MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance(EvpMdRef.SHA256.JCA_NAME);
            } catch (NoSuchAlgorithmException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to get SHA256 Function");
                sbOooO0o0.append(e.getMessage());
                throw new AmazonClientException(sbOooO0o0.toString(), e);
            }
        }
    };

    static {
        BinaryUtils.OooO0O0(OooO0o0(""));
    }

    public static byte[] OooO0o0(String str) {
        try {
            MessageDigest messageDigest = f10313OooO00o.get();
            messageDigest.reset();
            messageDigest.update(str.getBytes(StringUtils.f11186OooO00o));
            return messageDigest.digest();
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to compute hash while signing request: ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }

    public final Date OooO(int i) {
        Date date = new Date();
        return i != 0 ? new Date(date.getTime() - ((long) (i * 1000))) : date;
    }

    public final InputStream OooO0o(Request<?> request) {
        try {
            InputStream inputStream = ((DefaultRequest) request).f10285OooO;
            if (inputStream == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStream instanceof StringInputStream) {
                return inputStream;
            }
            if (inputStream.markSupported()) {
                return ((DefaultRequest) request).f10285OooO;
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to read request payload to sign request: ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }

    public final String OooO0oO(Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            treeMap.put(HttpUtils.OooO0Oo(entry.getKey(), false), HttpUtils.OooO0Oo(entry.getValue(), false));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append((String) entry2.getValue());
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    public final String OooO0oo(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z) {
            str = HttpUtils.OooO0Oo(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    public final int OooOO0(Request<?> request) {
        return SDKGlobalConfiguration.OooO00o() != 0 ? SDKGlobalConfiguration.OooO00o() : ((DefaultRequest) request).f10294OooOO0;
    }

    public final AWSCredentials OooOO0O(AWSCredentials aWSCredentials) {
        String strOooO0O0;
        String strOooO0OO;
        String strOooO00o;
        synchronized (aWSCredentials) {
            strOooO0O0 = aWSCredentials.OooO0O0();
            strOooO0OO = aWSCredentials.OooO0OO();
            strOooO00o = aWSCredentials instanceof AWSSessionCredentials ? ((AWSSessionCredentials) aWSCredentials).OooO00o() : null;
        }
        if (strOooO0OO != null) {
            strOooO0OO = strOooO0OO.trim();
        }
        if (strOooO0O0 != null) {
            strOooO0O0 = strOooO0O0.trim();
        }
        if (strOooO00o != null) {
            strOooO00o = strOooO00o.trim();
        }
        return aWSCredentials instanceof AWSSessionCredentials ? new BasicSessionCredentials(strOooO0O0, strOooO0OO, strOooO00o) : new BasicAWSCredentials(strOooO0O0, strOooO0OO);
    }

    public final byte[] OooOO0o(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return OooOOO0(str.getBytes(StringUtils.f11186OooO00o), bArr, signingAlgorithm);
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to calculate a request signature: ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }

    public final String OooOOO(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return OooOOOO(str.getBytes(StringUtils.f11186OooO00o), str2, signingAlgorithm);
    }

    public final byte[] OooOOO0(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to calculate a request signature: ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }

    public final String OooOOOO(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.OooO0O0(OooOOO0(bArr, str.getBytes(StringUtils.f11186OooO00o), signingAlgorithm));
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to calculate a request signature: ");
            sbOooO0o0.append(e.getMessage());
            throw new AmazonClientException(sbOooO0o0.toString(), e);
        }
    }
}
