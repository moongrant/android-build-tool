package p105o000oo0o;

import android.webkit.MimeTypeMap;
import coil.decode.DataSource;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.io.FilesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.oo000o;
import p109o000ooo.o0Oo0oo;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final File f35799OooO00o;

    public static final class OooO00o implements o00O0OO0.OooO00o<File> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            return new oo0o0O0((File) obj);
        }
    }

    public oo0o0O0(@NotNull File file) {
        this.f35799OooO00o = file;
    }

    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) {
        String str = o000OO00.f60221OooO0o0;
        File file = this.f35799OooO00o;
        return new oo0oOO0(new oo000o(o000OO00.OooO00o.OooO0O0(file), o0000O0O.f60198OooO00o, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file)), DataSource.DISK);
    }
}
