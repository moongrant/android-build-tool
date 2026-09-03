package o00OoO;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo<Data> implements o0OoOo0<String, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OoOo0<Uri, Data> f37911OooO00o;

    public static final class OooO00o implements o00O0O<String, AssetFileDescriptor> {
        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        public final o0OoOo0<String, AssetFileDescriptor> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new o0Oo0oo(oo000oVar.OooO0OO(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class OooO0O0 implements o00O0O<String, ParcelFileDescriptor> {
        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<String, ParcelFileDescriptor> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new o0Oo0oo(oo000oVar.OooO0OO(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class OooO0OO implements o00O0O<String, InputStream> {
        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<String, InputStream> OooO0Oo(@NonNull oo000o oo000oVar) {
            return new o0Oo0oo(oo000oVar.OooO0OO(Uri.class, InputStream.class));
        }
    }

    public o0Oo0oo(o0OoOo0<Uri, Data> o0oooo1) {
        this.f37911OooO00o = o0oooo1;
    }

    @Override // o00OoO.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull String str) {
        return true;
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull String str, int i, int i2, @NonNull p154o00Oo0oo.oo0o0Oo oo0o0oo) {
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
        if (uriFromFile == null) {
            return null;
        }
        o0OoOo0<Uri, Data> o0oooo1 = this.f37911OooO00o;
        if (o0oooo1.OooO00o(uriFromFile)) {
            return o0oooo1.OooO0O0(uriFromFile, i, i2, oo0o0oo);
        }
        return null;
    }
}
