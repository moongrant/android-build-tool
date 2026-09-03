package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooO0O0<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<AssetFileDescriptor> OooO00o() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final void OooO0OO(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.OooO0O0
    public final AssetFileDescriptor OooO0o0(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
