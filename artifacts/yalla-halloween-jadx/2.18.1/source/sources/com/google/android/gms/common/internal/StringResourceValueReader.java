package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class StringResourceValueReader {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Resources f15620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f15621OooO0O0;

    public StringResourceValueReader(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        Resources resources = context.getResources();
        this.f15620OooO00o = resources;
        this.f15621OooO0O0 = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @Nullable
    @KeepForSdk
    public String getString(@NonNull String str) {
        int identifier = this.f15620OooO00o.getIdentifier(str, "string", this.f15621OooO0O0);
        if (identifier == 0) {
            return null;
        }
        return this.f15620OooO00o.getString(identifier);
    }
}
