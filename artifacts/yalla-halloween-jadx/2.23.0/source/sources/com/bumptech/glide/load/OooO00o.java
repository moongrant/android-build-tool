package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o00OO0O0.o0ooOOo;
import p129o00O0ooo.o0000;
import p532o0o0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {
    public static int OooO00o(@NonNull o0000 o0000Var, @Nullable InputStream inputStream, @NonNull List list) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o0ooOOo(inputStream, o0000Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iOooO00o = ((ImageHeaderParser) list.get(i)).OooO00o(inputStream, o0000Var);
                inputStream.reset();
                if (iOooO00o != -1) {
                    return iOooO00o;
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
                ImageHeaderParser.ImageType imageTypeOooO0O0 = list.get(i).OooO0O0(byteBuffer);
                oo0o0Oo.OooO0OO(byteBuffer);
                if (imageTypeOooO0O0 != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeOooO0O0;
                }
            } catch (Throwable th) {
                oo0o0Oo.OooO0OO(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @NonNull
    public static ImageHeaderParser.ImageType OooO0OO(@NonNull o0000 o0000Var, @Nullable InputStream inputStream, @NonNull List list) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o0ooOOo(inputStream, o0000Var);
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
