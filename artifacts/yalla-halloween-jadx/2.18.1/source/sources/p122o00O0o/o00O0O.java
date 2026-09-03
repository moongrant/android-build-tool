package p122o00O0o;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.OooOO0O;
import com.airbnb.lottie.OooOOO0;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.o0OoOo0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.ZipInputStream;
import p129o00O0oOo.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0OoOo0 f30956OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Oooo0 f30957OooO0O0;

    public o00O0O(@NonNull o0OoOo0 o0oooo1, @NonNull Oooo0 oooo0) {
        this.f30956OooO00o = o0oooo1;
        this.f30957OooO0O0 = oooo0;
    }

    @NonNull
    public final o0OoOo0<OooOO0O> OooO00o(@NonNull String str, @NonNull InputStream inputStream, @Nullable String str2, @Nullable String str3) throws IOException {
        FileExtension fileExtension;
        o0OoOo0<OooOO0O> o0oooo0OooOO0O;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            o000Oo0.OooO00o();
            fileExtension = FileExtension.ZIP;
            o0oooo0OooOO0O = str3 == null ? OooOOO0.OooOO0O(new ZipInputStream(inputStream), null) : OooOOO0.OooOO0O(new ZipInputStream(new FileInputStream(this.f30956OooO00o.OooO0OO(str, inputStream, fileExtension))), str);
        } else {
            o000Oo0.OooO00o();
            fileExtension = FileExtension.JSON;
            o0oooo0OooOO0O = str3 == null ? OooOOO0.OooO0o0(inputStream, null) : OooOOO0.OooO0o0(new FileInputStream(this.f30956OooO00o.OooO0OO(str, inputStream, fileExtension).getAbsolutePath()), str);
        }
        if (str3 != null && o0oooo0OooOO0O.f10248OooO00o != null) {
            o0OoOo0 o0oooo1 = this.f30956OooO00o;
            Objects.requireNonNull(o0oooo1);
            File file = new File(o0oooo1.OooO0O0(), o0OoOo0.OooO00o(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            o000Oo0.OooO00o();
            if (!zRenameTo) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to rename cache file ");
                sbOooO0o0.append(file.getAbsolutePath());
                sbOooO0o0.append(" to ");
                sbOooO0o0.append(file2.getAbsolutePath());
                sbOooO0o0.append(".");
                o000Oo0.OooO0OO(sbOooO0o0.toString());
            }
        }
        return o0oooo0OooOO0O;
    }
}
