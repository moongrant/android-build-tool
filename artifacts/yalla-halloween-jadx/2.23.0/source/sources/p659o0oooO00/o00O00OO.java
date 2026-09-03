package p659o0oooO00;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658o0oooO0.o00O;
import p658o0oooO0.o00O00o0;
import p658o0oooO0.o00O0O0;
import p658o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O00OO extends o0000O0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final o000OO00 f60241OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000OO00 f60242OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000O0O f60243OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<o000OO00, o00O0O0> f60244OooO0Oo;

    static {
        String str = o000OO00.f60221OooO0o0;
        f60241OooO0o0 = o000OO00.OooO00o.OooO00o("/", false);
    }

    public o00O00OO(@NotNull o000OO00 zipPath, @NotNull o000O00O fileSystem, @NotNull Map entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f60242OooO0O0 = zipPath;
        this.f60243OooO0OO = fileSystem;
        this.f60244OooO0Oo = entries;
    }

    @Override // p659o0oooO00.o0000O0O
    @Nullable
    public final o0000O0 OooO(@NotNull o000OO00 child) throws Throwable {
        o00O0000 o00o0000OooO0O0;
        Intrinsics.checkNotNullParameter(child, "path");
        o000OO00 o000oo01 = f60241OooO0o0;
        o000oo01.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o00O0O0 o00o0o0 = this.f60244OooO0Oo.get(o00O.OooO0O0(o000oo01, child, true));
        Throwable th = null;
        if (o00o0o0 == null) {
            return null;
        }
        boolean z = o00o0o0.f60141OooO0O0;
        o0000O0 basicMetadata = new o0000O0(!z, z, null, z ? null : Long.valueOf(o00o0o0.f60143OooO0Oo), null, o00o0o0.f60144OooO0o, null);
        long j = o00o0o0.f60146OooO0oO;
        if (j == -1) {
            return basicMetadata;
        }
        o0000oo o0000ooVarOooOO0 = this.f60243OooO0OO.OooOO0(this.f60242OooO0O0);
        try {
            o00o0000OooO0O0 = o000O0Oo.OooO0O0(o0000ooVarOooOO0.OooOOo0(j));
        } catch (Throwable th2) {
            o00o0000OooO0O0 = null;
            th = th2;
        }
        if (o0000ooVarOooOO0 != null) {
            try {
                o0000ooVarOooOO0.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else {
                    ExceptionsKt.addSuppressed(th, th3);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(o00o0000OooO0O0);
        Intrinsics.checkNotNullParameter(o00o0000OooO0O0, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        o0000O0 o0000o0OooO0o0 = o00O0OO.OooO0o0(o00o0000OooO0O0, basicMetadata);
        Intrinsics.checkNotNull(o0000o0OooO0o0);
        return o0000o0OooO0o0;
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooO00o(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0O0(@NotNull o000OO00 source, @NotNull o000OO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0OO(@NotNull o000OO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0Oo(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final List<o000OO00> OooO0oO(@NotNull o000OO00 child) throws IOException {
        Intrinsics.checkNotNullParameter(child, "dir");
        o000OO00 o000oo01 = f60241OooO0o0;
        o000oo01.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o00O0O0 o00o0o0 = this.f60244OooO0Oo.get(o00O.OooO0O0(o000oo01, child, true));
        if (o00o0o0 != null) {
            List<o000OO00> list = CollectionsKt.toList(o00o0o0.f60147OooO0oo);
            Intrinsics.checkNotNull(list);
            return list;
        }
        throw new IOException("not a directory: " + child);
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o0000oo OooOO0(@NotNull o000OO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooOO0O(@NotNull o000OO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O00 OooOO0o(@NotNull o000OO00 child) throws Throwable {
        o00O0000 o00o0000OooO0O0;
        Intrinsics.checkNotNullParameter(child, "file");
        o000OO00 o000oo01 = f60241OooO0o0;
        o000oo01.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o00O0O0 o00o0o0 = this.f60244OooO0Oo.get(o00O.OooO0O0(o000oo01, child, true));
        if (o00o0o0 == null) {
            throw new FileNotFoundException("no such file: " + child);
        }
        o0000oo o0000ooVarOooOO0 = this.f60243OooO0OO.OooOO0(this.f60242OooO0O0);
        try {
            o00o0000OooO0O0 = o000O0Oo.OooO0O0(o0000ooVarOooOO0.OooOOo0(o00o0o0.f60146OooO0oO));
            th = null;
        } catch (Throwable th) {
            th = th;
            o00o0000OooO0O0 = null;
        }
        if (o0000ooVarOooOO0 != null) {
            try {
                o0000ooVarOooOO0.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    ExceptionsKt.addSuppressed(th, th2);
                }
            }
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(o00o0000OooO0O0);
        Intrinsics.checkNotNullParameter(o00o0000OooO0O0, "<this>");
        o00O0OO.OooO0o0(o00o0000OooO0O0, null);
        int i = o00o0o0.f60145OooO0o0;
        long j = o00o0o0.f60143OooO0Oo;
        return i == 0 ? new o00O00o0(o00o0000OooO0O0, j, true) : new o00O00o0(new o000O0o(new o00O00o0(o00o0000OooO0O0, o00o0o0.f60142OooO0OO, true), new Inflater(true)), j, false);
    }
}
