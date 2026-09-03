package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p219o00oO0O0.o0O00o0;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    @NonNull
    ImageType OooO00o(@NonNull ByteBuffer byteBuffer) throws IOException;

    int OooO0O0(@NonNull InputStream inputStream, @NonNull o0O00o0 o0o00o1) throws IOException;

    @NonNull
    ImageType OooO0OO(@NonNull InputStream inputStream) throws IOException;
}
