package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0 {
    public static boolean OooO00o(Context context, Intent intent) {
        if (!(!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty())) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }
}
