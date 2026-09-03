package p668o0oooOO0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oO0O0o implements o0O0oo0o {
    @Override // p668o0oooOO0.o0O0oo0o
    @NotNull
    public final o0O0O0O OooO00o(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        return o0O000Oo.OooO0oo(file);
    }

    @Override // p668o0oooOO0.o0O0oo0o
    @NotNull
    public final o0O00o00 OooO0O0(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return o0O000Oo.OooO0oO(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return o0O000Oo.OooO0oO(file);
        }
    }

    @Override // p668o0oooOO0.o0O0oo0o
    public final void OooO0OO(@NotNull File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + directory);
        }
        for (File file : fileArrListFiles) {
            Intrinsics.checkNotNullExpressionValue(file, "file");
            if (file.isDirectory()) {
                OooO0OO(file);
            }
            if (!file.delete()) {
                throw new IOException("failed to delete " + file);
            }
        }
    }

    @Override // p668o0oooOO0.o0O0oo0o
    public final boolean OooO0Oo(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    @Override // p668o0oooOO0.o0O0oo0o
    public final void OooO0o(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + file);
    }

    @Override // p668o0oooOO0.o0O0oo0o
    public final void OooO0o0(@NotNull File from, @NotNull File to) throws IOException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        OooO0o(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    @Override // p668o0oooOO0.o0O0oo0o
    @NotNull
    public final o0O00o00 OooO0oO(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return o0O000Oo.OooO00o(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return o0O000Oo.OooO00o(file);
        }
    }

    @Override // p668o0oooOO0.o0O0oo0o
    public final long OooO0oo(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.length();
    }

    @NotNull
    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
