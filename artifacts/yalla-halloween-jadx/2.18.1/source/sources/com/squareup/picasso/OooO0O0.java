package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AssetManager f19703OooO00o;

    public OooO0O0(Context context) {
        this.f19703OooO00o = context.getAssets();
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final boolean OooO0OO(Oooo0 oooo0) {
        Uri uri = oooo0.f19769OooO0Oo;
        return ShareInternalUtility.STAGING_PARAM.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
        return new o0OoOo0.OooO00o(this.f19703OooO00o.open(oooo0.f19769OooO0Oo.toString().substring(22)), Picasso.LoadedFrom.DISK);
    }
}
