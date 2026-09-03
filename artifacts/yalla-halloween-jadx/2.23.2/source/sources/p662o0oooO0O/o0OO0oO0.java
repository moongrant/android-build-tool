package p662o0oooO0O;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.jvm.internal.Intrinsics;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class o0OO0oO0 extends o0OO0o00 {
    public static Long OooOOO0(FileTime fileTime) {
        Long lValueOf = Long.valueOf(fileTime.toMillis());
        if (lValueOf.longValue() != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p662o0oooO0O.o0OO0o00, p662o0oooO0O.o0OO000
    @Nullable
    public final o0O OooO(@NotNull o0OOOO00 path) {
        o0OOOO00 o0oooo00OooO00o;
        Intrinsics.checkNotNullParameter(path, "path");
        Path pathOooO0o0 = path.OooO0o0();
        try {
            BasicFileAttributes attributes = Files.readAttributes(pathOooO0o0, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(pathOooO0o0) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = o0OOOO00.f59787OooO0o0;
                Intrinsics.checkNotNullParameter(symbolicLink, "<this>");
                o0oooo00OooO00o = o0OOOO00.OooO00o.OooO00o(symbolicLink.toString(), false);
            } else {
                o0oooo00OooO00o = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lOooOOO0 = fileTimeCreationTime != null ? OooOOO0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lOooOOO1 = fileTimeLastModifiedTime != null ? OooOOO0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new o0O(zIsRegularFile, zIsDirectory, o0oooo00OooO00o, lValueOf, lOooOOO0, lOooOOO1, fileTimeLastAccessTime != null ? OooOOO0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // p662o0oooO0O.o0OO0o00, p662o0oooO0O.o0OO000
    public final void OooO0O0(@NotNull o0OOOO00 source, @NotNull o0OOOO00 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Files.move(source.OooO0o0(), target.OooO0o0(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // p662o0oooO0O.o0OO0o00
    @NotNull
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
