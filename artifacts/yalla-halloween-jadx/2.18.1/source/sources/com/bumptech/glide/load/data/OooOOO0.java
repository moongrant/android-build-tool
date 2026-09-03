package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooO0O0<ParcelFileDescriptor> {
    public OooOOO0(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<ParcelFileDescriptor> OooO00o() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final void OooO0OO(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final ParcelFileDescriptor OooO0o(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
