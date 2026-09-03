package com.twitter.sdk.android.core.internal.oauth;

import com.jeremyliao.liveeventbus.BuildConfig;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o00Oo0;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 {
    public static String OooO00o(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, HashMap map) {
        String strOooO00o;
        String str4;
        OooO0OO oooO0OO = new OooO0OO(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
        String str5 = String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(OooO0OO.f22012OooO0Oo.nextLong()));
        String string = Long.toString(System.currentTimeMillis() / 1000);
        URI uriCreate = URI.create(str3);
        TreeMap<String, String> treeMapOooO00o = o0OOOOOO.OooOO0.OooO00o(uriCreate.getRawQuery(), true);
        if (map != null) {
            treeMapOooO00o.putAll(map);
        }
        if (str != null) {
            treeMapOooO00o.put("oauth_callback", str);
        }
        treeMapOooO00o.put("oauth_consumer_key", twitterAuthConfig.f21976OooO0Oo);
        treeMapOooO00o.put("oauth_nonce", str5);
        treeMapOooO00o.put("oauth_signature_method", "HMAC-SHA1");
        treeMapOooO00o.put("oauth_timestamp", string);
        if (twitterAuthToken != null && (str4 = twitterAuthToken.f21979OooO0o0) != null) {
            treeMapOooO00o.put("oauth_token", str4);
        }
        treeMapOooO00o.put("oauth_version", BuildConfig.VERSION_NAME);
        String str6 = uriCreate.getScheme() + "://" + uriCreate.getHost() + uriCreate.getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(str2.toUpperCase(Locale.ENGLISH));
        sb.append(Typography.amp);
        sb.append(o0OOOOOO.OooOO0.OooO0O0(str6));
        sb.append(Typography.amp);
        StringBuilder sb2 = new StringBuilder();
        int size = treeMapOooO00o.size();
        Iterator<Map.Entry<String, String>> it = treeMapOooO00o.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sb2.append(o0OOOOOO.OooOO0.OooO0O0(o0OOOOOO.OooOO0.OooO0O0(next.getKey())));
            sb2.append("%3D");
            sb2.append(o0OOOOOO.OooOO0.OooO0O0(o0OOOOOO.OooOO0.OooO0O0(next.getValue())));
            Iterator<Map.Entry<String, String>> it2 = it;
            int i2 = i + 1;
            if (i2 < size) {
                sb2.append("%26");
            }
            i = i2;
            it = it2;
        }
        sb.append(sb2.toString());
        String string2 = sb.toString();
        try {
            String strOooO0O0 = oooO0OO.OooO0O0();
            byte[] bytes = string2.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(strOooO0O0.getBytes("UTF8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(bytes);
            int length = bArrDoFinal.length;
            ByteString byteString = ByteString.f60866OooO0oO;
            strOooO00o = ByteString.OooO00o.OooO0Oo(0, length, bArrDoFinal).OooO00o();
        } catch (UnsupportedEncodingException e) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Failed to calculate signature", e);
            strOooO00o = "";
        } catch (InvalidKeyException e2) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Failed to calculate signature", e2);
            strOooO00o = "";
        } catch (NoSuchAlgorithmException e3) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Failed to calculate signature", e3);
            strOooO00o = "";
        }
        StringBuilder sb3 = new StringBuilder("OAuth");
        OooO0OO.OooO00o(sb3, "oauth_callback", str);
        OooO0OO.OooO00o(sb3, "oauth_consumer_key", twitterAuthConfig.f21976OooO0Oo);
        OooO0OO.OooO00o(sb3, "oauth_nonce", str5);
        OooO0OO.OooO00o(sb3, "oauth_signature", strOooO00o);
        OooO0OO.OooO00o(sb3, "oauth_signature_method", "HMAC-SHA1");
        OooO0OO.OooO00o(sb3, "oauth_timestamp", string);
        OooO0OO.OooO00o(sb3, "oauth_token", twitterAuthToken != null ? twitterAuthToken.f21979OooO0o0 : null);
        OooO0OO.OooO00o(sb3, "oauth_version", BuildConfig.VERSION_NAME);
        return sb3.substring(0, sb3.length() - 1);
    }

    public static String OooO0O0(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}
