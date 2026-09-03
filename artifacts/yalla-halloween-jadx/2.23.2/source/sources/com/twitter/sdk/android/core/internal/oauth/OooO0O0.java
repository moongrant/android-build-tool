package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final SecureRandom f21538OooO0Oo = new SecureRandom();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TwitterAuthConfig f21539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TwitterAuthToken f21540OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f21541OooO0OO;

    public OooO0O0(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, HashMap map) {
        this.f21539OooO00o = twitterAuthConfig;
        this.f21540OooO0O0 = twitterAuthToken;
        this.f21541OooO0OO = map;
    }

    public static void OooO00o(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(com.google.gson.internal.OooO.OooO0Oo(str));
            sb.append("=\"");
            sb.append(com.google.gson.internal.OooO.OooO0Oo(str2));
            sb.append("\",");
        }
    }

    public final String OooO0O0() {
        TwitterAuthToken twitterAuthToken = this.f21540OooO0O0;
        return com.google.gson.internal.OooO.OooO0oO(this.f21539OooO00o.f21506OooO0o0) + Typography.amp + com.google.gson.internal.OooO.OooO0oO(twitterAuthToken != null ? twitterAuthToken.f21507OooO0o : null);
    }
}
