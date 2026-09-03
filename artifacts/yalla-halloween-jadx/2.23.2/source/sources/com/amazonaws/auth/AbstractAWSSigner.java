package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAWSSigner implements Signer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<MessageDigest> f12099OooO00o = new ThreadLocal<MessageDigest>() { // from class: com.amazonaws.auth.AbstractAWSSigner.1
        @Override // java.lang.ThreadLocal
        public final MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e) {
                throw new AmazonClientException("Unable to get SHA256 Function" + e.getMessage(), e);
            }
        }
    };

    static {
        BinaryUtils.OooO0O0(OooO0Oo(""));
    }

    public static int OooO(DefaultRequest defaultRequest) {
        int i = defaultRequest.f12074OooOO0;
        AtomicInteger atomicInteger = SDKGlobalConfiguration.f12079OooO00o;
        return atomicInteger.get() != 0 ? atomicInteger.get() : i;
    }

    public static byte[] OooO0Oo(String str) {
        try {
            MessageDigest messageDigest = f12099OooO00o.get();
            messageDigest.reset();
            messageDigest.update(str.getBytes(StringUtils.f12681OooO00o));
            return messageDigest.digest();
        } catch (Exception e) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e.getMessage(), e);
        }
    }

    public static String OooO0o(LinkedHashMap linkedHashMap) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            treeMap.put(HttpUtils.OooO0Oo((String) entry.getKey(), false), HttpUtils.OooO0Oo((String) entry.getValue(), false));
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

    public static InputStream OooO0o0(DefaultRequest defaultRequest) {
        try {
            InputStream inputStream = defaultRequest.f12065OooO;
            if (inputStream == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStream instanceof StringInputStream) {
                return inputStream;
            }
            if (inputStream.markSupported()) {
                return defaultRequest.f12065OooO;
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e) {
            throw new AmazonClientException("Unable to read request payload to sign request: " + e.getMessage(), e);
        }
    }

    public static String OooO0oO(String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z) {
            str = HttpUtils.OooO0Oo(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    public static Date OooO0oo(int i) {
        Date date = new Date();
        return i != 0 ? new Date(date.getTime() - ((long) (i * 1000))) : date;
    }

    public static AWSCredentials OooOO0(AWSCredentials aWSCredentials) {
        String strOooO00o;
        String strOooO0OO;
        String strOooO0O0;
        synchronized (aWSCredentials) {
            strOooO00o = aWSCredentials.OooO00o();
            strOooO0OO = aWSCredentials.OooO0OO();
            strOooO0O0 = aWSCredentials instanceof AWSSessionCredentials ? ((AWSSessionCredentials) aWSCredentials).OooO0O0() : null;
        }
        if (strOooO0OO != null) {
            strOooO0OO = strOooO0OO.trim();
        }
        if (strOooO00o != null) {
            strOooO00o = strOooO00o.trim();
        }
        if (strOooO0O0 != null) {
            strOooO0O0 = strOooO0O0.trim();
        }
        return aWSCredentials instanceof AWSSessionCredentials ? new BasicSessionCredentials(strOooO00o, strOooO0OO, strOooO0O0) : new BasicAWSCredentials(strOooO00o, strOooO0OO);
    }

    public static byte[] OooOO0O(SigningAlgorithm signingAlgorithm, String str, byte[] bArr) {
        try {
            return OooOO0o(str.getBytes(StringUtils.f12681OooO00o), bArr, signingAlgorithm);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }

    public static byte[] OooOO0o(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac mac = Mac.getInstance(signingAlgorithm.toString());
            mac.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return mac.doFinal(bArr);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }

    public static String OooOOO0(SigningAlgorithm signingAlgorithm, String str, byte[] bArr) {
        try {
            return Base64.OooO0O0(OooOO0o(bArr, str.getBytes(StringUtils.f12681OooO00o), signingAlgorithm));
        } catch (Exception e) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e.getMessage(), e);
        }
    }
}
