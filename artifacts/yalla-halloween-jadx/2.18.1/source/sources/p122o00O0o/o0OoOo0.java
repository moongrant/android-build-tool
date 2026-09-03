package p122o00O0o;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import com.airbnb.lottie.OooO0OO;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o000oOoO f30958OooO00o;

    public o0OoOo0(@NonNull o000oOoO o000oooo2) {
        this.f30958OooO00o = o000oooo2;
    }

    public static String OooO00o(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("lottie_cache_");
        sbOooO0o0.append(str.replaceAll("\\W+", ""));
        if (z) {
            Objects.requireNonNull(fileExtension);
            str2 = ".temp" + fileExtension.extension;
        } else {
            str2 = fileExtension.extension;
        }
        sbOooO0o0.append(str2);
        return sbOooO0o0.toString();
    }

    public final File OooO0O0() {
        OooO0OO oooO0OO = (OooO0OO) this.f30958OooO00o;
        Objects.requireNonNull(oooO0OO);
        File file = new File(oooO0OO.f10034OooO00o.getCacheDir(), "lottie_network_cache");
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
                byte[] bArr = new byte[1024];
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
