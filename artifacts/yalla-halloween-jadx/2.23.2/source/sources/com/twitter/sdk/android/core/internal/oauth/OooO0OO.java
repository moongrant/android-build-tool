package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import p641o0ooOO0o.o0O00oO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends com.twitter.sdk.android.core.OooO0O0<o0O00oO0> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ com.twitter.sdk.android.core.OooO0O0 f21542OooO00o;

    public OooO0OO(com.twitter.sdk.android.core.OooO0O0 oooO0O0) {
        this.f21542OooO00o = oooO0O0;
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0OO(TwitterException twitterException) {
        this.f21542OooO00o.OooO0OO(twitterException);
    }

    @Override // com.twitter.sdk.android.core.OooO0O0
    public final void OooO0Oo(Oooo0<o0O00oO0> oooo0) throws Throwable {
        com.twitter.sdk.android.core.OooO0O0 oooO0O0 = this.f21542OooO00o;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(oooo0.f21502OooO00o.OooOOo().o0000OoO()));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb.append(line);
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                String string = sb.toString();
                OAuthResponse oAuthResponseOooO0O0 = OAuth1aService.OooO0O0(string);
                if (oAuthResponseOooO0O0 != null) {
                    oooO0O0.OooO0Oo(new Oooo0(oAuthResponseOooO0O0, null));
                    return;
                }
                oooO0O0.OooO0OO(new TwitterAuthException("Failed to parse auth response: " + string));
            } catch (IOException e) {
                oooO0O0.OooO0OO(new TwitterAuthException(e.getMessage(), e));
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
