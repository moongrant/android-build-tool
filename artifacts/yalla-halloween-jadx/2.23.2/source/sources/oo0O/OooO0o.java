package oo0O;

import androidx.annotation.NonNull;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO0OO f60309OooO00o;

    public OooO0o(@NonNull com.airbnb.lottie.OooO0OO.OooO00o oooO00o) {
        this.f60309OooO00o = oooO00o;
    }

    public static String OooO00o(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = ".temp" + fileExtension.extension;
        } else {
            str2 = fileExtension.extension;
        }
        sb.append(str2);
        return sb.toString();
    }

    public final File OooO0O0() {
        com.airbnb.lottie.OooO0OO.OooO00o oooO00o = (com.airbnb.lottie.OooO0OO.OooO00o) this.f60309OooO00o;
        oooO00o.getClass();
        File file = new File(oooO00o.f11809OooO00o.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File OooO0OO(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(OooO0O0(), OooO00o(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }
}
