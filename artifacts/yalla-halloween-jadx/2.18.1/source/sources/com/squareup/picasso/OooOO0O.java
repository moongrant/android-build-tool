package com.squareup.picasso;

import android.content.Context;
import android.media.ExifInterface;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooO {
    public OooOO0O(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.OooO, com.squareup.picasso.o0OoOo0
    public final boolean OooO0OO(Oooo0 oooo0) {
        return ShareInternalUtility.STAGING_PARAM.equals(oooo0.f19769OooO0Oo.getScheme());
    }

    @Override // com.squareup.picasso.OooO, com.squareup.picasso.o0OoOo0
    public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
        int i;
        InputStream inputStreamOooO0oo = OooO0oo(oooo0);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        int attributeInt = new ExifInterface(oooo0.f19769OooO0Oo.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i = 180;
        } else if (attributeInt != 6) {
            i = attributeInt != 8 ? 0 : 270;
        } else {
            i = 90;
        }
        return new o0OoOo0.OooO00o(null, inputStreamOooO0oo, loadedFrom, i);
    }
}
