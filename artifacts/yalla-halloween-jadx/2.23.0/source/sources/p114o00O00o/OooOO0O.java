package p114o00O00o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.o00Ooo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooOO0 f36399OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final OooO0o f36400OooO0O0;

    public OooOO0O(@NonNull OooOO0 oooOO1, @NonNull OooO0o oooO0o) {
        this.f36399OooO00o = oooOO1;
        this.f36400OooO0O0 = oooO0o;
    }

    @NonNull
    public final o00Ooo<OooOO0> OooO00o(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        FileExtension fileExtension;
        o00Ooo<OooOO0> o00oooOooO0oO;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean zContains = str2.contains("application/zip");
        OooOO0 oooOO1 = this.f36399OooO00o;
        if (zContains || str.split("\\?")[0].endsWith(".lottie")) {
            o00O0.OooOO0.OooO00o();
            fileExtension = FileExtension.ZIP;
            o00oooOooO0oO = str3 == null ? com.airbnb.lottie.OooOO0O.OooO0oO(new ZipInputStream(inputStream), null) : com.airbnb.lottie.OooOO0O.OooO0oO(new ZipInputStream(new FileInputStream(oooOO1.OooO0OO(str, inputStream, fileExtension))), str);
        } else {
            o00O0.OooOO0.OooO00o();
            fileExtension = FileExtension.JSON;
            o00oooOooO0oO = str3 == null ? com.airbnb.lottie.OooOO0O.OooO0OO(inputStream, null) : com.airbnb.lottie.OooOO0O.OooO0OO(new FileInputStream(oooOO1.OooO0OO(str, inputStream, fileExtension).getAbsolutePath()), str);
        }
        if (str3 != null && o00oooOooO0oO.f8920OooO00o != null) {
            oooOO1.getClass();
            File file = new File(oooOO1.OooO0O0(), OooOO0.OooO00o(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            o00O0.OooOO0.OooO00o();
            if (!zRenameTo) {
                o00O0.OooOO0.OooO0O0("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return o00oooOooO0oO;
    }
}
