package p257o00ooOOo;

import com.google.android.gms.common.internal.zas;
import com.google.gson.internal.OooO;
import com.jeremyliao.liveeventbus.BuildConfig;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o00O0O;
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
import o0OO000o.OooO00o;
import o0OO000o.OooO0O0;
import okio.ByteString;
import oo0oO0.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0 implements zas {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f40356OooO00o = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static void OooO00o(OooO0O0 oooO0O0, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    oooO0O0.OooO0Oo(i5, i4);
                    oooO0O0.OooO0Oo(i5, i6);
                    oooO0O0.OooO0Oo(i4, i5);
                    oooO0O0.OooO0Oo(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        oooO0O0.OooO0Oo(i7, i7);
        int i8 = i7 + 1;
        oooO0O0.OooO0Oo(i8, i7);
        oooO0O0.OooO0Oo(i7, i8);
        int i9 = i + i2;
        oooO0O0.OooO0Oo(i9, i7);
        oooO0O0.OooO0Oo(i9, i8);
        oooO0O0.OooO0Oo(i9, i9 - 1);
    }

    public static OooO00o OooO0O0(OooO00o oooO00o, int i, int i2) {
        oo0oO0.OooO00o oooO00o2;
        int i3 = oooO00o.f42262OooO0o0 / i2;
        if (i2 == 4) {
            oooO00o2 = oo0oO0.OooO00o.f60346OooOO0;
        } else if (i2 == 6) {
            oooO00o2 = oo0oO0.OooO00o.f60343OooO;
        } else if (i2 == 8) {
            oooO00o2 = oo0oO0.OooO00o.f60348OooOO0o;
        } else if (i2 == 10) {
            oooO00o2 = oo0oO0.OooO00o.f60345OooO0oo;
        } else {
            if (i2 != 12) {
                throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
            }
            oooO00o2 = oo0oO0.OooO00o.f60344OooO0oO;
        }
        OooO0OO oooO0OO = new OooO0OO(oooO00o2);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = oooO00o.f42262OooO0o0 / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= oooO00o.OooO0o((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        oooO0OO.OooO00o(i4 - i3, iArr);
        OooO00o oooO00o3 = new OooO00o();
        oooO00o3.OooO0Oo(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            oooO00o3.OooO0Oo(iArr[i9], i2);
        }
        return oooO00o3;
    }

    public static String OooO0OO(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, HashMap map) {
        String strOooO00o;
        String str4;
        com.twitter.sdk.android.core.internal.oauth.OooO0O0 oooO0O0 = new com.twitter.sdk.android.core.internal.oauth.OooO0O0(twitterAuthConfig, twitterAuthToken, str, str2, str3, map);
        String str5 = String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(com.twitter.sdk.android.core.internal.oauth.OooO0O0.f21538OooO0Oo.nextLong()));
        String string = Long.toString(System.currentTimeMillis() / 1000);
        URI uriCreate = URI.create(str3);
        TreeMap treeMapOooO0OO = OooO.OooO0OO(uriCreate.getRawQuery(), true);
        if (map != null) {
            treeMapOooO0OO.putAll(map);
        }
        if (str != null) {
            treeMapOooO0OO.put("oauth_callback", str);
        }
        treeMapOooO0OO.put("oauth_consumer_key", twitterAuthConfig.f21505OooO0Oo);
        treeMapOooO0OO.put("oauth_nonce", str5);
        treeMapOooO0OO.put("oauth_signature_method", "HMAC-SHA1");
        treeMapOooO0OO.put("oauth_timestamp", string);
        if (twitterAuthToken != null && (str4 = twitterAuthToken.f21508OooO0o0) != null) {
            treeMapOooO0OO.put("oauth_token", str4);
        }
        treeMapOooO0OO.put("oauth_version", BuildConfig.VERSION_NAME);
        String str6 = uriCreate.getScheme() + "://" + uriCreate.getHost() + uriCreate.getPath();
        StringBuilder sb = new StringBuilder();
        sb.append(str2.toUpperCase(Locale.ENGLISH));
        sb.append(Typography.amp);
        sb.append(OooO.OooO0Oo(str6));
        sb.append(Typography.amp);
        StringBuilder sb2 = new StringBuilder();
        int size = treeMapOooO0OO.size();
        Iterator it = treeMapOooO0OO.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(OooO.OooO0Oo(OooO.OooO0Oo((String) entry.getKey())));
            sb2.append("%3D");
            sb2.append(OooO.OooO0Oo(OooO.OooO0Oo((String) entry.getValue())));
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
            String strOooO0O0 = oooO0O0.OooO0O0();
            byte[] bytes = string2.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(strOooO0O0.getBytes("UTF8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            byte[] bArrDoFinal = mac.doFinal(bytes);
            int length = bArrDoFinal.length;
            ByteString byteString = ByteString.f60193OooO0oO;
            strOooO00o = ByteString.OooO00o.OooO0Oo(0, length, bArrDoFinal).OooO00o();
        } catch (UnsupportedEncodingException e) {
            o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to calculate signature", e);
            strOooO00o = "";
        } catch (InvalidKeyException e2) {
            o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to calculate signature", e2);
            strOooO00o = "";
        } catch (NoSuchAlgorithmException e3) {
            o00O0O.OooO0OO().OooO0Oo("Twitter", "Failed to calculate signature", e3);
            strOooO00o = "";
        }
        StringBuilder sb3 = new StringBuilder("OAuth");
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_callback", str);
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_consumer_key", twitterAuthConfig.f21505OooO0Oo);
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_nonce", str5);
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_signature", strOooO00o);
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_signature_method", "HMAC-SHA1");
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_timestamp", string);
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_token", twitterAuthToken != null ? twitterAuthToken.f21508OooO0o0 : null);
        com.twitter.sdk.android.core.internal.oauth.OooO0O0.OooO00o(sb3, "oauth_version", BuildConfig.VERSION_NAME);
        return sb3.substring(0, sb3.length() - 1);
    }

    public static OooO00o OooO0Oo(int i, OooO00o oooO00o) {
        OooO00o oooO00o2 = new OooO00o();
        int i2 = oooO00o.f42262OooO0o0;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || oooO00o.OooO0o(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                oooO00o2.OooO0Oo(i8, i);
            } else {
                if (i8 == 0) {
                    oooO00o2.OooO0Oo(i5 | 1, i);
                } else {
                    oooO00o2.OooO0Oo(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return oooO00o2;
    }
}
