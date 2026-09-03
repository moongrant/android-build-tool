package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @RequiresApi(31)
    public static class OooO0O0 {
        @DoNotInline
        public static EdgeEffect OooO00o(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        public static float OooO0O0(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        }

        @DoNotInline
        public static float OooO0OO(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        }
    }

    public static float OooO00o(@NonNull EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? OooO0O0.OooO0O0(edgeEffect) : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public static float OooO0O0(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return OooO0O0.OooO0OO(edgeEffect, f, f2);
        }
        OooO00o.OooO00o(edgeEffect, f, f2);
        return f;
    }
}
