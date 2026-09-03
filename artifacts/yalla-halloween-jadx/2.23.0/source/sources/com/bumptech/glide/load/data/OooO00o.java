package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.o0000O0O;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooOo<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<AssetFileDescriptor> OooO00o() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.OooOo
    public final void OooO0OO(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.OooOo
    public final Object OooO0o0(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException(o0000O0O.OooO00o("FileDescriptor is null for: ", uri));
    }
}
