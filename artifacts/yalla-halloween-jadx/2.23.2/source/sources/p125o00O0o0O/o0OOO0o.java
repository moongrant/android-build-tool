package p125o00O0o0O;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.o000oOoO;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final File f36607OooO00o;

    public static final class OooO00o implements o0ooOOo.OooO00o<File> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            return new o0OOO0o((File) obj);
        }
    }

    public o0OOO0o(@NotNull File file) {
        this.f36607OooO00o = file;
    }

    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) {
        String str = o0OOOO00.f59787OooO0o0;
        File file = this.f36607OooO00o;
        return new oo0o0Oo(new o000oOoO(o0OOOO00.OooO00o.OooO0O0(file), o0OO000.f59771OooO00o, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file)), DataSource.DISK);
    }
}
