package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p660o0ooo0o0.o00OOOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends o0O0o<o00OOOOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O0o f19985OooO00o;

    public OooO0OO(o0O0o o0o0o) {
        this.f19985OooO00o = o0o0o;
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0OO(TwitterException twitterException) {
        this.f19985OooO00o.OooO0OO(twitterException);
    }

    @Override // p433o0OoOO0o.o0O0o
    public final void OooO0Oo(o0O00O<o00OOOOo> o0o00o2) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(o0o00o2.f39934OooO00o.OooO00o()));
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
                    this.f19985OooO00o.OooO0Oo(new o0O00O(oAuthResponseOooO0O0, null));
                    return;
                }
                this.f19985OooO00o.OooO0OO(new TwitterAuthException("Failed to parse auth response: " + string));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e) {
            this.f19985OooO00o.OooO0OO(new TwitterAuthException(e.getMessage(), e));
        }
    }
}
