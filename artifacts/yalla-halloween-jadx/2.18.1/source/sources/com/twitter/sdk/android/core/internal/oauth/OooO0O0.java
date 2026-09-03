package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;
import okio.ByteString;
import p433o0OoOO0o.o0oO0Ooo;
import p435o0OoOOO0.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final SecureRandom f19978OooO0oO = new SecureRandom();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TwitterAuthConfig f19979OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TwitterAuthToken f19980OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f19981OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f19982OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, String> f19983OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f19984OooO0o0;

    public OooO0O0(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        this.f19979OooO00o = twitterAuthConfig;
        this.f19980OooO0O0 = twitterAuthToken;
        this.f19981OooO0OO = str;
        this.f19982OooO0Oo = str2;
        this.f19984OooO0o0 = str3;
        this.f19983OooO0o = map;
    }

    public final void OooO00o(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(o00000.OooO0O0(str));
            sb.append("=\"");
            sb.append(o00000.OooO0O0(str2));
            sb.append("\",");
        }
    }

    public final String OooO0O0() {
        String strOooO00o;
        String str;
        String str2 = String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(f19978OooO0oO.nextLong()));
        String string = Long.toString(System.currentTimeMillis() / 1000);
        URI uriCreate = URI.create(this.f19984OooO0o0);
        TreeMap treeMapOooO00o = o00000.OooO00o(uriCreate.getRawQuery(), true);
        Map<String, String> map = this.f19983OooO0o;
        if (map != null) {
            treeMapOooO00o.putAll(map);
        }
        String str3 = this.f19981OooO0OO;
        if (str3 != null) {
            treeMapOooO00o.put("oauth_callback", str3);
        }
        treeMapOooO00o.put("oauth_consumer_key", this.f19979OooO00o.f19938Oooo0o);
        treeMapOooO00o.put("oauth_nonce", str2);
        treeMapOooO00o.put("oauth_signature_method", "HMAC-SHA1");
        treeMapOooO00o.put("oauth_timestamp", string);
        TwitterAuthToken twitterAuthToken = this.f19980OooO0O0;
        if (twitterAuthToken != null && (str = twitterAuthToken.f19940Oooo0oO) != null) {
            treeMapOooO00o.put("oauth_token", str);
        }
        treeMapOooO00o.put("oauth_version", "1.0");
        String str4 = uriCreate.getScheme() + "://" + uriCreate.getHost() + uriCreate.getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19982OooO0Oo.toUpperCase(Locale.ENGLISH));
        sb.append(Typography.amp);
        sb.append(o00000.OooO0O0(str4));
        sb.append(Typography.amp);
        StringBuilder sb2 = new StringBuilder();
        int size = treeMapOooO00o.size();
        Iterator it = treeMapOooO00o.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(o00000.OooO0O0(o00000.OooO0O0((String) entry.getKey())));
            sb2.append("%3D");
            sb2.append(o00000.OooO0O0(o00000.OooO0O0((String) entry.getValue())));
            Iterator it2 = it;
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
            String strOooO0OO = OooO0OO();
            byte[] bytes = string2.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(strOooO0OO.getBytes("UTF8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(bytes);
            strOooO00o = ByteString.f53047OoooO00.OooO0Oo(bArrDoFinal, 0, bArrDoFinal.length).OooO00o();
        } catch (UnsupportedEncodingException e) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to calculate signature", e);
            strOooO00o = "";
        } catch (InvalidKeyException e2) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to calculate signature", e2);
            strOooO00o = "";
        } catch (NoSuchAlgorithmException e3) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to calculate signature", e3);
            strOooO00o = "";
        }
        StringBuilder sb3 = new StringBuilder("OAuth");
        OooO00o(sb3, "oauth_callback", this.f19981OooO0OO);
        OooO00o(sb3, "oauth_consumer_key", this.f19979OooO00o.f19938Oooo0o);
        OooO00o(sb3, "oauth_nonce", str2);
        OooO00o(sb3, "oauth_signature", strOooO00o);
        OooO00o(sb3, "oauth_signature_method", "HMAC-SHA1");
        OooO00o(sb3, "oauth_timestamp", string);
        TwitterAuthToken twitterAuthToken2 = this.f19980OooO0O0;
        OooO00o(sb3, "oauth_token", twitterAuthToken2 != null ? twitterAuthToken2.f19940Oooo0oO : null);
        OooO00o(sb3, "oauth_version", "1.0");
        return sb3.substring(0, sb3.length() - 1);
    }

    public final String OooO0OO() {
        TwitterAuthToken twitterAuthToken = this.f19980OooO0O0;
        return o00000.OooO0Oo(this.f19979OooO00o.f19939Oooo0oO) + Typography.amp + o00000.OooO0Oo(twitterAuthToken != null ? twitterAuthToken.f19941Oooo0oo : null);
    }
}
