package com.qiniu.android.utils;

import com.facebook.internal.security.CertificateUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class StringUtils {
    public static String getAkAndScope(String str) {
        String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
        try {
            return strArrSplit[0] + new JSONObject(new String(UrlSafeBase64.decode(strArrSplit[2]), com.qiniu.android.common.Constants.UTF_8)).getString("scope").split(CertificateUtil.DELIMITER)[0];
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getBucket(String str) {
        try {
            return new JSONObject(new String(UrlSafeBase64.decode(str.split(CertificateUtil.DELIMITER)[2]), com.qiniu.android.common.Constants.UTF_8)).getString("scope").split(CertificateUtil.DELIMITER)[0];
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().equals("");
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || "".equals(str);
    }

    public static String join(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        StringBuilder sb = new StringBuilder(length == 0 ? 0 : ((strArr[0] == null ? 16 : strArr[0].length()) + ((str == null || str.equals("")) ? 0 : str.length())) * length);
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(str);
            }
            if (strArr[i] != null) {
                sb.append(strArr[i]);
            }
        }
        return sb.toString();
    }

    public static String jsonJoin(String[] strArr) {
        int length = strArr.length;
        if (strArr[0] == null) {
            strArr[0] = "";
        }
        StringBuilder sb = new StringBuilder((strArr[0].length() + 3) * length);
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(Typography.quote);
            sb.append(strArr[i]);
            sb.append(Typography.quote);
        }
        return sb.toString();
    }

    public static String[] longToString(Long[] lArr) {
        int length = lArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            try {
                strArr[i] = String.valueOf(lArr[i]);
            } catch (NumberFormatException unused) {
                strArr[i] = "null";
            }
        }
        return strArr;
    }

    public static String strip(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static byte[] toByteArray(Object obj) {
        byte[] byteArray = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    objectOutputStream.flush();
                    byteArray = byteArrayOutputStream.toByteArray();
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    objectOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                byteArrayOutputStream.close();
                throw th2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String toNonnullString(Object obj) {
        if (obj == null) {
            return "";
        }
        return "" + obj;
    }

    public static Object toObject(byte[] bArr) {
        Object object = null;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    object = objectInputStream.readObject();
                    objectInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                byteArrayInputStream.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return object;
    }

    public static String upperCase(String str) {
        if (str.length() <= 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        if (charArray[0] >= 'a' && charArray[0] <= 'z') {
            charArray[0] = (char) (charArray[0] - ' ');
        }
        return new String(charArray);
    }

    public static byte[] utf8Bytes(String str) {
        try {
            return str.getBytes(com.qiniu.android.common.Constants.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static String jsonJoin(Long[] lArr) {
        return jsonJoin(longToString(lArr));
    }
}
