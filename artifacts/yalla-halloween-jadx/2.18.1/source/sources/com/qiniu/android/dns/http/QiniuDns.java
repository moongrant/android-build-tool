package com.qiniu.android.dns.http;

import OooO00o.OooO00o;
import com.qiniu.android.dns.DnsException;
import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.NetworkInfo;
import com.qiniu.android.dns.Record;
import com.qiniu.android.dns.util.DES;
import com.qiniu.android.dns.util.MD5;
import com.qiniu.android.http.ResponseInfo;
import com.youth.banner.config.BannerConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QiniuDns implements IResolver {
    private static final String ENDPOINT = "http://httpdns.qnydns.net:18302/";
    private static final String ENDPOINT_SSL = "https://httpdns.qnydns.net:18443/";
    private static String mAccountId = null;
    private static String mEncryptKey = null;
    private static int mExpireTimeSecond = 0;
    private static boolean mIsEncrypted = true;
    private static boolean mIsHttps = true;

    public QiniuDns(String str, String str2, int i) {
        mAccountId = str;
        mEncryptKey = str2;
        mExpireTimeSecond = i;
    }

    @Override // com.qiniu.android.dns.IResolver
    public Record[] resolve(Domain domain, NetworkInfo networkInfo) throws IOException {
        String string;
        if (mAccountId == null || mEncryptKey == null) {
            throw new DnsException(domain.domain, "Invalid account id or encrypt key");
        }
        if (mIsHttps) {
            string = ENDPOINT_SSL;
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0(ENDPOINT);
            sbOooO0o0.append(mAccountId);
            sbOooO0o0.append("/d?dn=");
            sbOooO0o0.append(mIsEncrypted ? DES.encrypt(domain.domain, mEncryptKey) : domain.domain);
            sbOooO0o0.append("&e=");
            sbOooO0o0.append(Integer.toString(mExpireTimeSecond));
            sbOooO0o0.append("&s=");
            sbOooO0o0.append(MD5.encrypt(domain.domain + "-" + mEncryptKey + "-" + mExpireTimeSecond));
            sbOooO0o0.append("&ttl=1&echo=1");
            string = sbOooO0o0.toString();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
        httpURLConnection.setConnectTimeout(BannerConfig.LOOP_TIME);
        httpURLConnection.setReadTimeout(ResponseInfo.UnknownError);
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                try {
                    break;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            sb.append(line);
        }
        JSONArray jSONArrayOptJSONArray = mIsEncrypted ? new JSONArray(DES.decrypt(new JSONObject(sb.toString()).optString("data"), mEncryptKey)).optJSONArray(0) : new JSONObject(sb.toString()).optJSONArray("data").optJSONArray(0);
        if (jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        Record[] recordArr = new Record[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            recordArr[i] = new Record(jSONObjectOptJSONObject.optString("data"), 1, jSONObjectOptJSONObject.optInt("TTL"), System.currentTimeMillis() / 1000, Record.Source.DnspodFree);
        }
        return recordArr;
    }

    public void setEncrypted(boolean z) {
        mIsEncrypted = z;
    }

    public void setHttps(boolean z) {
        mIsHttps = z;
    }
}
