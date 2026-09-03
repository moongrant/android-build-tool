package p221o00oOO;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;
import p217o00oO00o.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0<Data> implements o00000O0<String, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<Uri, Data> f33705OooO00o;

    public static final class OooO00o implements o00000O<String, AssetFileDescriptor> {
        @Override // p221o00oOO.o00000O
        public final o00000O0<String, AssetFileDescriptor> OooO00o(@NonNull o0000 o0000Var) {
            return new o0000O0(o0000Var.OooO0OO(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0O0 implements o00000O<String, ParcelFileDescriptor> {
        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<String, ParcelFileDescriptor> OooO00o(@NonNull o0000 o0000Var) {
            return new o0000O0(o0000Var.OooO0OO(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0OO implements o00000O<String, InputStream> {
        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<String, InputStream> OooO00o(@NonNull o0000 o0000Var) {
            return new o0000O0(o0000Var.OooO0OO(Uri.class, InputStream.class));
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o0000O0(o00000O0<Uri, Data> o00000o1) {
        this.f33705OooO00o = o00000o1;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull String str) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull String str, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile == null || !this.f33705OooO00o.OooO00o(uriFromFile)) {
            return null;
        }
        return this.f33705OooO00o.OooO0O0(uriFromFile, i, i2, o00000Var);
    }
}
