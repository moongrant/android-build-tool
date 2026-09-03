package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface GifDecoder {

    @Retention(RetentionPolicy.SOURCE)
    public @interface GifDecodeStatus {
    }

    public interface OooO00o {
    }

    @Nullable
    Bitmap OooO00o();

    void OooO0O0();

    int OooO0OO();

    int OooO0Oo();

    int OooO0o();

    @NonNull
    ByteBuffer OooO0o0();

    int OooO0oO();

    int OooO0oo();

    void clear();
}
