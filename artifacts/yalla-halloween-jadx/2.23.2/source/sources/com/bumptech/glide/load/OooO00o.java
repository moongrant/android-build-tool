package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p156o00OoO00.OooO0o;
import p160o00OoOOO.o00000O;
import p174o00OooOo.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {
    public static int OooO00o(@NonNull OooO0o oooO0o, @Nullable InputStream inputStream, @NonNull List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o00000O(inputStream, oooO0o);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iOooO0Oo = ((ImageHeaderParser) list.get(i)).OooO0Oo(inputStream, oooO0o);
                inputStream.reset();
                if (iOooO0Oo != -1) {
                    return iOooO0Oo;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType OooO0O0(@NonNull List<ImageHeaderParser> list, @Nullable ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeOooO00o = list.get(i).OooO00o(byteBuffer);
                o00O0.OooO0OO(byteBuffer);
                if (imageTypeOooO00o != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeOooO00o;
                }
            } catch (Throwable th) {
                o00O0.OooO0OO(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType OooO0OO(@NonNull OooO0o oooO0o, @Nullable InputStream inputStream, @NonNull List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o00000O(inputStream, oooO0o);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeOooO0OO = ((ImageHeaderParser) list.get(i)).OooO0OO(inputStream);
                inputStream.reset();
                if (imageTypeOooO0OO != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeOooO0OO;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
