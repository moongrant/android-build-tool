package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p219o00oO0O0.o0O00o0;
import p224o00oOOOo.oOO00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    public interface OooO00o {
    }

    public interface OooO0O0 {
    }

    public static int OooO00o(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull o0O00o0 o0o00o1) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new oOO00000(inputStream, o0o00o1);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iOooO0O0 = list.get(i).OooO0O0(inputStream, o0o00o1);
                inputStream.reset();
                if (iOooO0O0 != -1) {
                    return iOooO0O0;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    public static int OooO0O0(@NonNull List<ImageHeaderParser> list, OooO00o oooO00o) throws Throwable {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iOooO00o = ((com.bumptech.glide.load.OooO0O0) oooO00o).OooO00o(list.get(i));
            if (iOooO00o != -1) {
                return iOooO00o;
            }
        }
        return -1;
    }

    @NonNull
    public static ImageHeaderParser.ImageType OooO0OO(@NonNull List<ImageHeaderParser> list, @Nullable InputStream inputStream, @NonNull o0O00o0 o0o00o1) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new oOO00000(inputStream, o0o00o1);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeOooO0OO = list.get(i).OooO0OO(inputStream);
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

    @NonNull
    public static ImageHeaderParser.ImageType OooO0Oo(@NonNull List<ImageHeaderParser> list, OooO0O0 oooO0O0) throws Throwable {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeOooO00o = ((com.bumptech.glide.load.OooO00o) oooO0O0).OooO00o(list.get(i));
            if (imageTypeOooO00o != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeOooO00o;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
