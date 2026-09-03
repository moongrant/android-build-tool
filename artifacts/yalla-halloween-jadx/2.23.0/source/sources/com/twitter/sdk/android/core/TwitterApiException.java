package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import p634o0ooO0oO.oo0O;
import retrofit2.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public class TwitterApiException extends TwitterException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final com.twitter.sdk.android.core.models.OooO00o f21975OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwitterApiException(o0000O0O o0000o0o2) {
        com.twitter.sdk.android.core.models.OooO00o OooO00o2;
        super(android.support.v4.media.OooO00o.OooO00o("HTTP request failed, Status: ", o0000o0o2.f61108OooO00o.f57345OooO0oO));
        try {
            String strOoooOO0 = o0000o0o2.f61110OooO0OO.OooOOo0().OooO0Oo().clone().OoooOO0();
            OooO00o2 = !TextUtils.isEmpty(strOoooOO0) ? OooO00o(strOoooOO0) : null;
        } catch (Exception e) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Unexpected response", e);
        }
        oo0O oo0o = o0000o0o2.f61108OooO00o.f57341OooO;
        if (oo0o == null) {
            throw new IllegalArgumentException("headers must not be null");
        }
        for (int i = 0; i < oo0o.f57369OooO0Oo.length / 2; i++) {
            if ("x-rate-limit-limit".equals(oo0o.OooO0OO(i))) {
                Integer.valueOf(oo0o.OooO0o0(i)).intValue();
            } else if ("x-rate-limit-remaining".equals(oo0o.OooO0OO(i))) {
                Integer.valueOf(oo0o.OooO0o0(i)).intValue();
            } else if ("x-rate-limit-reset".equals(oo0o.OooO0OO(i))) {
                Long.valueOf(oo0o.OooO0o0(i)).longValue();
            }
        }
        this.f21975OooO0Oo = OooO00o2;
    }

    public static com.twitter.sdk.android.core.models.OooO00o OooO00o(String str) {
        com.google.gson.OooOOO oooOOO = new com.google.gson.OooOOO();
        oooOOO.OooO0OO(new SafeListAdapter());
        oooOOO.OooO0OO(new SafeMapAdapter());
        try {
            com.twitter.sdk.android.core.models.OooO0O0 oooO0O0 = (com.twitter.sdk.android.core.models.OooO0O0) oooOOO.OooO00o().OooO0OO(str, com.twitter.sdk.android.core.models.OooO0O0.class);
            if (oooO0O0.f22048OooO00o.isEmpty()) {
                return null;
            }
            return oooO0O0.f22048OooO00o.get(0);
        } catch (JsonSyntaxException e) {
            o00Oo0.OooO0OO().OooO0Oo("Twitter", "Invalid json: ".concat(str), e);
            return null;
        }
    }
}
