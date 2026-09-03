package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final SecureRandom f22012OooO0Oo = new SecureRandom();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TwitterAuthConfig f22013OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TwitterAuthToken f22014OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f22015OooO0OO;

    public OooO0OO(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, HashMap map) {
        this.f22013OooO00o = twitterAuthConfig;
        this.f22014OooO0O0 = twitterAuthToken;
        this.f22015OooO0OO = map;
    }

    public static void OooO00o(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(o0OOOOOO.OooOO0.OooO0O0(str));
            sb.append("=\"");
            sb.append(o0OOOOOO.OooOO0.OooO0O0(str2));
            sb.append("\",");
        }
    }

    public final String OooO0O0() {
        TwitterAuthToken twitterAuthToken = this.f22014OooO0O0;
        return o0OOOOOO.OooOO0.OooO0Oo(this.f22013OooO00o.f21977OooO0o0) + Typography.amp + o0OOOOOO.OooOO0.OooO0Oo(twitterAuthToken != null ? twitterAuthToken.f21978OooO0o : null);
    }
}
