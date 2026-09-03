package com.yalla.support.common.util;

import com.facebook.internal.ServerProtocol;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {
    @NotNull
    public static final String OooO(@Nullable Long l, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (l == null) {
            return str;
        }
        try {
            String string = l.toString();
            return string == null ? str : string;
        } catch (Exception unused) {
            return str;
        }
    }

    public static final boolean OooO00o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Intrinsics.areEqual(str, "1") || StringsKt.OooO(str, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        } catch (NumberFormatException unused) {
        }
    }

    public static final double OooO0O0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static final float OooO0OO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
    }

    public static final int OooO0Oo(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final long OooO0o(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static int OooO0o0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long OooO0oO(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @NotNull
    public static final String OooO0oo(@Nullable Integer num, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        if (num == null) {
            return str;
        }
        try {
            String string = num.toString();
            return string == null ? str : string;
        } catch (Exception unused) {
            return str;
        }
    }
}
