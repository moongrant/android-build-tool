package com.code.android.util;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {
    @Nullable
    public static final Color OooO00o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Color.m1671boximpl(ColorKt.Color(android.graphics.Color.parseColor(str)));
        } catch (Exception unused) {
            return null;
        }
    }
}
