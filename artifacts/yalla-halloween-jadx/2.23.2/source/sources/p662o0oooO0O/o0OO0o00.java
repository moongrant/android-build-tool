package p662o0oooO0O;

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
public class o0OO0o00 extends o0OO000 {
    @Override // p662o0oooO0O.o0OO000
    @Nullable
    public o0O OooO(@NotNull o0OOOO00 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File fileOooO0Oo = path.OooO0Oo();
        boolean zIsFile = fileOooO0Oo.isFile();
        boolean zIsDirectory = fileOooO0Oo.isDirectory();
        long jLastModified = fileOooO0Oo.lastModified();
        long length = fileOooO0Oo.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileOooO0Oo.exists()) {
            return new o0O(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooO00o(@NotNull o0OOOO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File fileOooO0Oo = file.OooO0Oo();
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(fileOooO0Oo, "<this>");
        return o0OO.OooO0o0(new FileOutputStream(fileOooO0Oo, true));
    }

    @Override // p662o0oooO0O.o0OO000
    public void OooO0O0(@NotNull o0OOOO00 source, @NotNull o0OOOO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (source.OooO0Oo().renameTo(target.OooO0Oo())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    @Override // p662o0oooO0O.o0OO000
    public final void OooO0OO(@NotNull o0OOOO00 dir) throws IOException {
        boolean z;
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.OooO0Oo().mkdir()) {
            return;
        }
        o0O o0oOooO2 = OooO(dir);
        if (o0oOooO2 != null) {
            z = o0oOooO2.f59744OooO0O0;
        }
        if (z) {
            return;
        }
        throw new IOException("failed to create directory: " + dir);
    }

    @Override // p662o0oooO0O.o0OO000
    public final void OooO0Oo(@NotNull o0OOOO00 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File fileOooO0Oo = path.OooO0Oo();
        if (fileOooO0Oo.delete() || !fileOooO0Oo.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final List<o0OOOO00> OooO0oO(@NotNull o0OOOO00 dir) throws IOException {
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

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final o0O0oo00 OooOO0(@NotNull o0OOOO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new o0OOooO0(new RandomAccessFile(file.OooO0Oo(), "r"));
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooOO0O(@NotNull o0OOOO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        File fileOooO0Oo = file.OooO0Oo();
        Logger logger = o0OOO00.f59784OooO00o;
        Intrinsics.checkNotNullParameter(fileOooO0Oo, "<this>");
        return o0OO.OooO0o0(new FileOutputStream(fileOooO0Oo, false));
    }

    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final oO00000 OooOO0o(@NotNull o0OOOO00 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return o0OO.OooO0oO(file.OooO0Oo());
    }

    @NotNull
    public String toString() {
        return "JvmSystemFileSystem";
    }
}
