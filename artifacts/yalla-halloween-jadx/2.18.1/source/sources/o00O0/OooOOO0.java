package o00O0;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import coil.size.Size;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import p115o00O00oO.o00oO0o;
import p674o0oooo0.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements OooOO0O<File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f30079OooO00o;

    public OooOOO0(boolean z) {
        this.f30079OooO00o = z;
    }

    @Override // o00O0.OooOO0O
    public final boolean OooO00o(File file) {
        OooOO0O.OooO00o.OooO00o(this, file);
        return true;
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(File file) {
        File data = file;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.f30079OooO00o) {
            String path = data.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "data.path");
            return path;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) data.getPath());
        sb.append(':');
        sb.append(data.lastModified());
        return sb.toString();
    }

    @Override // o00O0.OooOO0O
    public final Object OooO0OO(p113o00O00Oo.OooO0O0 oooO0O0, File file, Size size, o00oO0o o00oo0o2, Continuation continuation) {
        File file2 = file;
        return new Oooo0(o0O000Oo.OooO0OO(o0O000Oo.OooO0oo(file2)), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file2)), DataSource.DISK);
    }
}
