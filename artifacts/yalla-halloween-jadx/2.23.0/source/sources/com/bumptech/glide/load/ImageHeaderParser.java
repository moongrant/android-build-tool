package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p129o00O0ooo.o0000;

/* JADX INFO: loaded from: classes2.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i = OooO00o.f9943OooO00o[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f9943OooO00o;

        static {
            int[] iArr = new int[ImageType.values().length];
            f9943OooO00o = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9943OooO00o[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9943OooO00o[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int OooO00o(@NonNull InputStream inputStream, @NonNull o0000 o0000Var) throws IOException;

    @NonNull
    ImageType OooO0O0(@NonNull ByteBuffer byteBuffer) throws IOException;

    @NonNull
    ImageType OooO0OO(@NonNull InputStream inputStream) throws IOException;

    int OooO0Oo(@NonNull ByteBuffer byteBuffer, @NonNull o0000 o0000Var) throws IOException;
}
