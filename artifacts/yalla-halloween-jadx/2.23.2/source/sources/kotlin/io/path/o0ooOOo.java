package kotlin.io.path;

import java.nio.file.FileSystemException;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o0ooOOo {
    public static /* synthetic */ FileSystemException OooO00o(String str, String str2) {
        return new FileSystemException(str, str2, "Recursively copying a directory into its subdirectory is prohibited.");
    }
}
