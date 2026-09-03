package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AssetManager f21216OooO00o;

    public OooO0O0(Context context) {
        this.f21216OooO00o = context.getAssets();
    }

    @Override // com.squareup.picasso.o00oO0o
    public final boolean OooO0O0(o00Ooo o00ooo2) {
        Uri uri = o00ooo2.f21321OooO0Oo;
        return ShareInternalUtility.STAGING_PARAM.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.o00oO0o
    public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
        return new o00oO0o.OooO00o(this.f21216OooO00o.open(o00ooo2.f21321OooO0Oo.toString().substring(22)), Picasso.LoadedFrom.DISK);
    }
}
