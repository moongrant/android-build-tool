package com.qiniu.android.storage;

import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.utils.UrlSafeBase64;
import org.json.JSONObject;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class UpToken {
    public final String accessKey;
    public final String bucket;
    private String returnUrl;
    public final String token;

    private UpToken(String str, String str2, String str3, String str4) {
        this.returnUrl = str;
        this.token = str2;
        this.accessKey = str3;
        this.bucket = str4;
    }

    public static boolean isInvalid(UpToken upToken) {
        return upToken == null || !upToken.isValid();
    }

    public static UpToken parse(String str) {
        if (str == null) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
            if (strArrSplit.length != 3) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(new String(UrlSafeBase64.decode(strArrSplit[2])));
            String strOptString = jSONObject.optString("scope");
            if (strOptString.equals("")) {
                return null;
            }
            String[] strArrSplit2 = new String[2];
            try {
                strArrSplit2 = strOptString.split(CertificateUtil.DELIMITER);
            } catch (Exception unused) {
            }
            String str2 = strArrSplit2.length > 0 ? strArrSplit2[0] : "";
            if (jSONObject.optInt("deadline") == 0) {
                return null;
            }
            return new UpToken(jSONObject.optString("returnUrl"), str, strArrSplit[0], str2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public boolean hasReturnUrl() {
        return !this.returnUrl.equals("");
    }

    public String index() {
        String str = "";
        if (this.accessKey != null) {
            str = "" + this.accessKey;
        }
        if (this.bucket == null) {
            return str;
        }
        StringBuilder sbOooO00o = o00OO.OooO00o(str);
        sbOooO00o.append(this.bucket);
        return sbOooO00o.toString();
    }

    public boolean isValid() {
        String str;
        String str2 = this.accessKey;
        return (str2 == null || str2.isEmpty() || (str = this.bucket) == null || str.isEmpty()) ? false : true;
    }

    public String toString() {
        return this.token;
    }
}
