package com.yalantis.ucrop;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p400o0Oo0O.OooO;
import p552o0oOO0Oo.o000O0o;
import p583o0oOoOoo.m3;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooO0O0 f20278OooO00o;

    public OooO0O0(OooO0o.OooO0O0 oooO0O0) {
        this.f20278OooO00o = oooO0O0;
    }

    @Override // p552o0oOO0Oo.o000O0o
    public final void OooO00o(@NonNull Bitmap bitmap, @NonNull m3 m3Var, @NonNull Uri uri, @Nullable Uri uri2) {
        ImageView imageView = this.f20278OooO00o.f20285OooO00o;
        if (imageView == null || bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // p552o0oOO0Oo.o000O0o
    public final void onFailure(@NonNull Exception exc) {
        ImageView imageView = this.f20278OooO00o.f20285OooO00o;
        if (imageView != null) {
            imageView.setImageResource(OooO.ucrop_color_ba3);
        }
    }
}
