package com.android.billingclient.api;

import android.text.TextUtils;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.twitter.sdk.android.core.models.User;
import java.util.List;
import java.util.Locale;
import p436o0OoOOOO.o0O00OOO;
import p436o0OoOOOO.o0O00o00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0OoOo0 {
    public static String OooO00o(String str) {
        return TextUtils.isEmpty(str) ? String.format(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", "twitter_unknown") : String.format(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", str);
    }

    public static boolean OooO0O0(o0O00OOO o0o00ooo2) {
        User user;
        return (o0o00ooo2 == null || o0o00ooo2.f40002OooO <= 0 || (user = o0o00ooo2.f40031OooOooO) == null || TextUtils.isEmpty(user.f20042o00oO0o)) ? false : true;
    }

    public static boolean OooO0OO(o0O00OOO o0o00ooo2) {
        o0O00o00 o0o00o01;
        List<MediaEntity> list;
        return o0o00ooo2.f40024OooOo0O != null && o0o00ooo2.f40035Oooo00o == null && ((o0o00o01 = o0o00ooo2.f40006OooO0Oo) == null || (list = o0o00o01.f40039OooO0OO) == null || list.isEmpty());
    }
}
