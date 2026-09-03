package com.twitter.sdk.android.tweetui;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {
    public static String OooO00o(String str) {
        return TextUtils.isEmpty(str) ? String.format(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", "twitter_unknown") : String.format(Locale.US, "https://twitter.com/%s?ref_src=twsrc%%5Etwitterkit", str);
    }
}
