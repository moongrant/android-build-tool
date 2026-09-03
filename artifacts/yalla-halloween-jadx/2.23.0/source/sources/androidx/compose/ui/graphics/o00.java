package androidx.compose.ui.graphics;

import java.nio.file.FileSystemException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00 {
    public static /* synthetic */ FileSystemException OooO0Oo(String str, String str2) {
        return new FileSystemException(str, str2, "Recursively copying a directory into its subdirectory is prohibited.");
    }
}
