package com.squareup.picasso;

import android.media.ExifInterface;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends OooOO0O {
    @Override // com.squareup.picasso.OooOO0O, com.squareup.picasso.o00oO0o
    public final boolean OooO0O0(o00Ooo o00ooo2) {
        return ShareInternalUtility.STAGING_PARAM.equals(o00ooo2.f21794OooO0Oo.getScheme());
    }

    @Override // com.squareup.picasso.OooOO0O, com.squareup.picasso.o00oO0o
    public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
        int i;
        InputStream inputStreamOooO0oO = OooO0oO(o00ooo2);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        int attributeInt = new ExifInterface(o00ooo2.f21794OooO0Oo.getPath()).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i = 180;
        } else if (attributeInt != 6) {
            i = attributeInt != 8 ? 0 : 270;
        } else {
            i = 90;
        }
        return new o00oO0o.OooO00o(null, inputStreamOooO0oO, loadedFrom, i);
    }
}
