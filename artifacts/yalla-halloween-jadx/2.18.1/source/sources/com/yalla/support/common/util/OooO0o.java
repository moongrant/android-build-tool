package com.yalla.support.common.util;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {
    public static final boolean OooO00o(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = StringsKt.isBlank(filePath) ? null : new File(filePath);
        return file != null && file.exists();
    }
}
