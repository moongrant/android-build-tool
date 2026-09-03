package com.twitter.sdk.android.core;

import android.support.v4.media.OooO00o;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import p386o0OOoo0O.o00;
import p433o0OoOO0o.o0oO0Ooo;
import p436o0OoOOOO.o0O000;
import p436o0OoOOOO.o0O000O;
import p660o0ooo0o0.o00O;
import retrofit2.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterApiException extends TwitterException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o0O000 f19937Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwitterApiException(oo0o0Oo oo0o0oo) {
        o0O000 o0o000OooO00o;
        super(OooO00o.OooO00o("HTTP request failed, Status: ", oo0o0oo.f53906OooO00o.f51443OoooO00));
        try {
            String strOooo0o = oo0o0oo.f53908OooO0OO.OooO0oo().OooO0OO().clone().Oooo0o();
            o0o000OooO00o = !TextUtils.isEmpty(strOooo0o) ? OooO00o(strOooo0o) : null;
        } catch (Exception e) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Unexpected response", e);
        }
        o00O o00o2 = oo0o0oo.f53906OooO00o.f51444OoooO0O;
        if (o00o2 == null) {
            throw new IllegalArgumentException("headers must not be null");
        }
        for (int i = 0; i < o00o2.f51230Oooo0o.length / 2; i++) {
            if ("x-rate-limit-limit".equals(o00o2.OooO0O0(i))) {
                Integer.valueOf(o00o2.OooO0o0(i)).intValue();
            } else if ("x-rate-limit-remaining".equals(o00o2.OooO0O0(i))) {
                Integer.valueOf(o00o2.OooO0o0(i)).intValue();
            } else if ("x-rate-limit-reset".equals(o00o2.OooO0O0(i))) {
                Long.valueOf(o00o2.OooO0o0(i)).longValue();
            }
        }
        this.f19937Oooo0o = o0o000OooO00o;
    }

    public static o0O000 OooO00o(String str) {
        o00 o00Var = new o00();
        o00Var.OooO0OO(new SafeListAdapter());
        o00Var.OooO0OO(new SafeMapAdapter());
        try {
            o0O000O o0o000o = (o0O000O) o00Var.OooO00o().OooO0OO(str, o0O000O.class);
            if (o0o000o.f39978OooO00o.isEmpty()) {
                return null;
            }
            return o0o000o.f39978OooO00o.get(0);
        } catch (JsonSyntaxException e) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Invalid json: " + str, e);
            return null;
        }
    }
}
