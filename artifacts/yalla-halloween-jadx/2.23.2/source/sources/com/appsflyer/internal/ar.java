package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class ar {
    @Nullable
    public static Uri AFInAppEventParameterName(Activity activity) {
        return activity.getReferrer();
    }
}
