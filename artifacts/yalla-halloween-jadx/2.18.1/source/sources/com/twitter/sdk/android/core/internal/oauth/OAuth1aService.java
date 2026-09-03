package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.qiniu.android.http.request.Request;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import java.util.Objects;
import java.util.TreeMap;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p435o0OoOOO0.o00000;
import p440o0OoOOoO.o0OO00o0;
import p660o0ooo0o0.o00OOOOo;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
public final class OAuth1aService extends OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OAuthApi f19962OooO0o0;

    public interface OAuthApi {
        @POST("/oauth/access_token")
        retrofit2.OooO0O0<o00OOOOo> getAccessToken(@Header("Authorization") String str, @Query("oauth_verifier") String str2);

        @POST("/oauth/request_token")
        retrofit2.OooO0O0<o00OOOOo> getTempToken(@Header("Authorization") String str);
    }

    public OAuth1aService(o0O0oo0o o0o0oo0o, o0OO00o0 o0oo00o1) {
        super(o0o0oo0o, o0oo00o1);
        this.f19962OooO0o0 = (OAuthApi) this.f19976OooO0Oo.OooO0O0(OAuthApi.class);
    }

    public static OAuthResponse OooO0O0(String str) {
        TreeMap treeMapOooO00o = o00000.OooO00o(str, false);
        String str2 = (String) treeMapOooO00o.get("oauth_token");
        String str3 = (String) treeMapOooO00o.get("oauth_token_secret");
        String str4 = (String) treeMapOooO00o.get("screen_name");
        long j = treeMapOooO00o.containsKey(AccessToken.USER_ID_KEY) ? Long.parseLong((String) treeMapOooO00o.get(AccessToken.USER_ID_KEY)) : 0L;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(new TwitterAuthToken(str2, str3), str4, j);
    }

    public final String OooO00o(TwitterAuthConfig twitterAuthConfig) {
        Uri.Builder builderBuildUpon = Uri.parse("twittersdk://callback").buildUpon();
        Objects.requireNonNull(this.f19973OooO00o);
        return builderBuildUpon.appendQueryParameter(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "3.3.0.12").appendQueryParameter("app", twitterAuthConfig.f19938Oooo0o).build().toString();
    }

    public final void OooO0OO(o0O0o<OAuthResponse> o0o0o, TwitterAuthToken twitterAuthToken, String str) {
        Objects.requireNonNull(this.f19974OooO0O0);
        this.f19962OooO0o0.getAccessToken(new OooO0O0(this.f19973OooO00o.f39952OooO0Oo, twitterAuthToken, null, Request.HttpMethodPOST, "https://api.twitter.com/oauth/access_token", null).OooO0O0(), str).OoooOo0(new OooO0OO(o0o0o));
    }

    public final void OooO0Oo(o0O0o<OAuthResponse> o0o0o) {
        TwitterAuthConfig twitterAuthConfig = this.f19973OooO00o.f39952OooO0Oo;
        Objects.requireNonNull(this.f19974OooO0O0);
        this.f19962OooO0o0.getTempToken(new OooO0O0(twitterAuthConfig, null, OooO00o(twitterAuthConfig), Request.HttpMethodPOST, "https://api.twitter.com/oauth/request_token", null).OooO0O0()).OoooOo0(new OooO0OO(o0o0o));
    }
}
