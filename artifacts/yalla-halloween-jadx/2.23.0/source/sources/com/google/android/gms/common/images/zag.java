package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zag {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f15006OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f15007OooO0O0;

    public zag(Uri uri, int i) {
        this.f15006OooO00o = new OooO0o(uri);
        this.f15007OooO0O0 = i;
    }

    public abstract void OooO00o(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3);

    public final void OooO0O0(Context context, boolean z) {
        int i = this.f15007OooO0O0;
        OooO00o(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }
}
