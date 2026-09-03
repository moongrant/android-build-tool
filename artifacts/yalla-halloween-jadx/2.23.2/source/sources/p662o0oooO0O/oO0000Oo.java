package p662o0oooO0O;

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
import p659o0oooO.o000O00;
import p659o0oooO.o000OO0O;
import p659o0oooO.o000OOo0;
import p659o0oooO.o0O0ooO;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000Oo extends o0OO000 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final o0OOOO00 f59815OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0OOOO00 f59816OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OO000 f59817OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<o0OOOO00, o000OO0O> f59818OooO0Oo;

    static {
        String str = o0OOOO00.f59787OooO0o0;
        f59815OooO0o0 = o0OOOO00.OooO00o.OooO00o("/", false);
    }

    public oO0000Oo(@NotNull o0OOOO00 zipPath, @NotNull o0OO0o00 fileSystem, @NotNull Map entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f59816OooO0O0 = zipPath;
        this.f59817OooO0OO = fileSystem;
        this.f59818OooO0Oo = entries;
    }

    @Override // p662o0oooO0O.o0OO000
    @Nullable
    public final o0O OooO(@NotNull o0OOOO00 child) throws Throwable {
        o0o0000 o0o0000VarOooO0O0;
        Intrinsics.checkNotNullParameter(child, "path");
        o0OOOO00 o0oooo01 = f59815OooO0o0;
        o0oooo01.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o000OO0O o000oo0o2 = this.f59818OooO0Oo.get(o0O0ooO.OooO0O0(o0oooo01, child, true));
        Throwable th = null;
        if (o000oo0o2 == null) {
            return null;
        }
        boolean z = o000oo0o2.f59643OooO0O0;
        o0O basicMetadata = new o0O(!z, z, null, z ? null : Long.valueOf(o000oo0o2.f59645OooO0Oo), null, o000oo0o2.f59646OooO0o, null);
        long j = o000oo0o2.f59648OooO0oO;
        if (j == -1) {
            return basicMetadata;
        }
        o0O0oo00 o0o0oo00OooOO0 = this.f59817OooO0OO.OooOO0(this.f59816OooO0O0);
        try {
            o0o0000VarOooO0O0 = o0OO.OooO0O0(o0o0oo00OooOO0.OooOOo(j));
        } catch (Throwable th2) {
            o0o0000VarOooO0O0 = null;
            th = th2;
        }
        if (o0o0oo00OooOO0 != null) {
            try {
                o0o0oo00OooOO0.close();
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
        Intrinsics.checkNotNull(o0o0000VarOooO0O0);
        Intrinsics.checkNotNullParameter(o0o0000VarOooO0O0, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        o0O o0oOooO0o0 = o000OOo0.OooO0o0(o0o0000VarOooO0O0, basicMetadata);
        Intrinsics.checkNotNull(o0oOooO0o0);
        return o0oOooO0o0;
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooO00o(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0O0(@NotNull o0OOOO00 source, @NotNull o0OOOO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0OO(@NotNull o0OOOO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0Oo(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final List<o0OOOO00> OooO0oO(@NotNull o0OOOO00 child) throws IOException {
        Intrinsics.checkNotNullParameter(child, "dir");
        o0OOOO00 o0oooo01 = f59815OooO0o0;
        o0oooo01.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o000OO0O o000oo0o2 = this.f59818OooO0Oo.get(o0O0ooO.OooO0O0(o0oooo01, child, true));
        if (o000oo0o2 != null) {
            List<o0OOOO00> list = CollectionsKt.toList(o000oo0o2.f59649OooO0oo);
            Intrinsics.checkNotNull(list);
            return list;
        }
        throw new IOException("not a directory: " + child);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final o0O0oo00 OooOO0(@NotNull o0OOOO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooOO0O(@NotNull o0OOOO00 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final oO00000 OooOO0o(@NotNull o0OOOO00 child) throws Throwable {
        o0o0000 o0o0000VarOooO0O0;
        Intrinsics.checkNotNullParameter(child, "file");
        o0OOOO00 o0oooo01 = f59815OooO0o0;
        o0oooo01.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        o000OO0O o000oo0o2 = this.f59818OooO0Oo.get(o0O0ooO.OooO0O0(o0oooo01, child, true));
        if (o000oo0o2 == null) {
            throw new FileNotFoundException("no such file: " + child);
        }
        o0O0oo00 o0o0oo00OooOO0 = this.f59817OooO0OO.OooOO0(this.f59816OooO0O0);
        try {
            o0o0000VarOooO0O0 = o0OO.OooO0O0(o0o0oo00OooOO0.OooOOo(o000oo0o2.f59648OooO0oO));
            th = null;
        } catch (Throwable th) {
            th = th;
            o0o0000VarOooO0O0 = null;
        }
        if (o0o0oo00OooOO0 != null) {
            try {
                o0o0oo00OooOO0.close();
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
        Intrinsics.checkNotNull(o0o0000VarOooO0O0);
        Intrinsics.checkNotNullParameter(o0o0000VarOooO0O0, "<this>");
        o000OOo0.OooO0o0(o0o0000VarOooO0O0, null);
        int i = o000oo0o2.f59647OooO0o0;
        long j = o000oo0o2.f59645OooO0Oo;
        return i == 0 ? new o000O00(o0o0000VarOooO0O0, j, true) : new o000O00(new o0OO0(new o000O00(o0o0000VarOooO0O0, o000oo0o2.f59644OooO0OO, true), new Inflater(true)), j, false);
    }
}
