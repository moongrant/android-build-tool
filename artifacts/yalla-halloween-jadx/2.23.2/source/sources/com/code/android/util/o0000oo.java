package com.code.android.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nShellUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShellUtil.kt\ncom/code/android/util/ShellUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n1#2:115\n*E\n"})
public final class o0000oo {
    public static void OooO00o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
