package com.qiniu.android.storage;

import OooO00o.OooO00o;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.utils.UrlSafeBase64;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
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
        String string = "";
        if (this.accessKey != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
            sbOooO0o0.append(this.accessKey);
            string = sbOooO0o0.toString();
        }
        if (this.bucket == null) {
            return string;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0(string);
        sbOooO0o1.append(this.bucket);
        return sbOooO0o1.toString();
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
