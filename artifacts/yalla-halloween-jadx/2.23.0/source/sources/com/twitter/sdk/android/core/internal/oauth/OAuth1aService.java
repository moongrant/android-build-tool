package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o0OOO0o;
import java.util.TreeMap;
import o0OOOOO.OooOo00;
import p634o0ooO0oO.o0O0o;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes4.dex */
public final class OAuth1aService extends OooOO0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OAuthApi f22000OooO0o0;

    public interface OAuthApi {
        @POST("/oauth/access_token")
        retrofit2.OooO0O0<o0O0o> getAccessToken(@Header("Authorization") String str, @Query("oauth_verifier") String str2);

        @POST("/oauth/request_token")
        retrofit2.OooO0O0<o0O0o> getTempToken(@Header("Authorization") String str);
    }

    public OAuth1aService(o0OOO0o o0ooo0o2, OooOo00 oooOo00) {
        super(o0ooo0o2, oooOo00);
        this.f22000OooO0o0 = (OAuthApi) this.f22021OooO0Oo.OooO0O0(OAuthApi.class);
    }

    public static OAuthResponse OooO0O0(String str) {
        TreeMap<String, String> treeMapOooO00o = o0OOOOOO.OooOO0.OooO00o(str, false);
        String str2 = treeMapOooO00o.get("oauth_token");
        String str3 = treeMapOooO00o.get("oauth_token_secret");
        String str4 = treeMapOooO00o.get("screen_name");
        long j = treeMapOooO00o.containsKey(AccessToken.USER_ID_KEY) ? Long.parseLong(treeMapOooO00o.get(AccessToken.USER_ID_KEY)) : 0L;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(j, new TwitterAuthToken(str2, str3), str4);
    }

    public final String OooO00o(TwitterAuthConfig twitterAuthConfig) {
        Uri.Builder builderBuildUpon = Uri.parse("twittersdk://callback").buildUpon();
        this.f22018OooO00o.getClass();
        return builderBuildUpon.appendQueryParameter(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "3.3.0.12").appendQueryParameter("app", twitterAuthConfig.f21976OooO0Oo).build().toString();
    }

    public final void OooO0OO(com.twitter.sdk.android.core.identity.OooO0O0 oooO0O0, TwitterAuthToken twitterAuthToken, String str) {
        this.f22019OooO0O0.getClass();
        this.f22000OooO0o0.getAccessToken(OooO0O0.OooO00o(this.f22018OooO00o.f22223OooO0Oo, twitterAuthToken, null, "POST", "https://api.twitter.com/oauth/access_token", null), str).OooOooO(new OooO0o(oooO0O0));
    }

    public final void OooO0Oo(com.twitter.sdk.android.core.identity.OooO00o oooO00o) {
        TwitterAuthConfig twitterAuthConfig = this.f22018OooO00o.f22223OooO0Oo;
        this.f22019OooO0O0.getClass();
        this.f22000OooO0o0.getTempToken(OooO0O0.OooO00o(twitterAuthConfig, null, OooO00o(twitterAuthConfig), "POST", "https://api.twitter.com/oauth/request_token", null)).OooOooO(new OooO0o(oooO00o));
    }
}
