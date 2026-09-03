package Oooo0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo {
    @NotNull
    public static final EdgeEffect OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? OooO0o.f496OooO00o.OooO00o(context, null) : new EdgeEffect(context);
    }

    public static final float OooO0O0(@NotNull EdgeEffect edgeEffect) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        return Build.VERSION.SDK_INT >= 31 ? OooO0o.f496OooO00o.OooO0O0(edgeEffect) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public static final float OooO0OO(@NotNull EdgeEffect edgeEffect, float f) {
        Intrinsics.checkNotNullParameter(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return OooO0o.f496OooO00o.OooO0OO(edgeEffect, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        edgeEffect.onPull(f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        return f;
    }
}
