package p659o0oooO00;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public class o000O00O extends o0000O0O {
    @Override // p659o0oooO00.o0000O0O
    @Nullable
    public o0000O0 OooO(@NotNull o000OO00 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File fileOooO0Oo = path.OooO0Oo();
        boolean zIsFile = fileOooO0Oo.isFile();
        boolean zIsDirectory = fileOooO0Oo.isDirectory();
        long jLastModified = fileOooO0Oo.lastModified();
        long length = fileOooO0Oo.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileOooO0Oo.exists()) {
            return new o0000O0(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooO00o(@NotNull o000OO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File fileOooO0Oo = file.OooO0Oo();
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(fileOooO0Oo, "<this>");
        return o000O0Oo.OooO0o0(new FileOutputStream(fileOooO0Oo, true));
    }

    @Override // p659o0oooO00.o0000O0O
    public void OooO0O0(@NotNull o000OO00 source, @NotNull o000OO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.OooO0Oo().renameTo(target.OooO0Oo())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // p659o0oooO00.o0000O0O
    public final void OooO0OO(@NotNull o000OO00 dir) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.OooO0Oo().mkdir()) {
            return;
        }
        o0000O0 o0000o0OooO = OooO(dir);
        if (o0000o0OooO != null) {
            z = o0000o0OooO.f60188OooO0O0;
        }
        if (z) {
            return;
        }
        throw new IOException("failed to create directory: " + dir);
    }

    @Override // p659o0oooO00.o0000O0O
    public final void OooO0Oo(@NotNull o000OO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File fileOooO0Oo = path.OooO0Oo();
        if (fileOooO0Oo.delete() || !fileOooO0Oo.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final List<o000OO00> OooO0oO(@NotNull o000OO00 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File fileOooO0Oo = dir.OooO0Oo();
        String[] list = fileOooO0Oo.list();
        if (list == null) {
            if (fileOooO0Oo.exists()) {
                throw new IOException("failed to list " + dir);
            }
            throw new FileNotFoundException("no such file: " + dir);
        }
        ArrayList arrayList = new ArrayList();
        for (String it : list) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(dir.OooO0OO(it));
        }
        CollectionsKt.sort(arrayList);
        Intrinsics.checkNotNull(arrayList);
        return arrayList;
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o0000oo OooOO0(@NotNull o000OO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new o000O00(new RandomAccessFile(file.OooO0Oo(), "r"));
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooOO0O(@NotNull o000OO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File fileOooO0Oo = file.OooO0Oo();
        Logger logger = o000OO0O.f60223OooO00o;
        Intrinsics.checkNotNullParameter(fileOooO0Oo, "<this>");
        return o000O0Oo.OooO0o0(new FileOutputStream(fileOooO0Oo, false));
    }

    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O00 OooOO0o(@NotNull o000OO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return o000O0Oo.OooO0oO(file.OooO0Oo());
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
