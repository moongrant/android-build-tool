package p589o0oOooO0;

import android.graphics.Path;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.StringTokenizer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p647o0ooOOOO.b6;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f47179OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Path f47180OooO0O0;

    public oo00oO(@NotNull String str) {
        this.f47179OooO00o = StringsKt__StringsKt.contains$default(str, ",", false, 2, (Object) null) ? StringsKt.OooOo00(str, ",", ZegoConstants.ZegoVideoDataAuxPublishingStream) : str;
    }

    public final void OooO00o(@NotNull Path path) {
        Path path2 = this.f47180OooO0O0;
        if (path2 != null) {
            path.set(path2);
            return;
        }
        Path path3 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.f47179OooO00o, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String segment = stringTokenizer.nextToken();
            Intrinsics.checkExpressionValueIsNotNull(segment, "segment");
            if (!(segment.length() == 0)) {
                if (o0oOOo.f47178OooO00o.contains(segment)) {
                    if (Intrinsics.areEqual(segment, "Z") || Intrinsics.areEqual(segment, ak.aD)) {
                        OooO0O0(path3, segment, new StringTokenizer("", ""));
                    }
                    str = segment;
                } else {
                    OooO0O0(path3, str, new StringTokenizer(segment, ZegoConstants.ZegoVideoDataAuxPublishingStream));
                }
            }
        }
        this.f47180OooO0O0 = path3;
        path.set(path3);
    }

    public final void OooO0O0(Path path, String str, StringTokenizer stringTokenizer) {
        int i = 0;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String s = stringTokenizer.nextToken();
                Intrinsics.checkExpressionValueIsNotNull(s, "s");
                if (!(s.length() == 0)) {
                    if (i == 0) {
                        f = Float.parseFloat(s);
                    }
                    if (i == 1) {
                        f2 = Float.parseFloat(s);
                    }
                    if (i == 2) {
                        f3 = Float.parseFloat(s);
                    }
                    if (i == 3) {
                        f4 = Float.parseFloat(s);
                    }
                    if (i == 4) {
                        f6 = Float.parseFloat(s);
                    }
                    if (i == 5) {
                        f5 = Float.parseFloat(s);
                    }
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        float f7 = f2;
        float f8 = f3;
        float f9 = f4;
        float f10 = f6;
        float f11 = f;
        b6 b6Var = new b6(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        if (Intrinsics.areEqual(str, "M")) {
            path.moveTo(f11, f7);
            b6Var = new b6(f11, f7);
        } else if (Intrinsics.areEqual(str, "m")) {
            path.rMoveTo(f11, f7);
            b6Var = new b6(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE + f11, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE + f7);
        }
        b6 b6Var2 = b6Var;
        if (Intrinsics.areEqual(str, "L")) {
            path.lineTo(f11, f7);
        } else if (Intrinsics.areEqual(str, "l")) {
            path.rLineTo(f11, f7);
        }
        if (Intrinsics.areEqual(str, "C")) {
            path.cubicTo(f11, f7, f8, f9, f10, f5);
        } else if (Intrinsics.areEqual(str, ak.aF)) {
            path.rCubicTo(f11, f7, f8, f9, f10, f5);
        }
        if (Intrinsics.areEqual(str, "Q")) {
            path.quadTo(f11, f7, f8, f9);
        } else if (Intrinsics.areEqual(str, "q")) {
            path.rQuadTo(f11, f7, f8, f9);
        }
        if (Intrinsics.areEqual(str, "H")) {
            path.lineTo(f11, b6Var2.f48890OooO0O0);
        } else if (Intrinsics.areEqual(str, "h")) {
            path.rLineTo(f11, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (Intrinsics.areEqual(str, "V")) {
            path.lineTo(b6Var2.f48889OooO00o, f11);
        } else if (Intrinsics.areEqual(str, ak.aE)) {
            path.rLineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f11);
        }
        if (Intrinsics.areEqual(str, "Z")) {
            path.close();
        } else if (Intrinsics.areEqual(str, ak.aD)) {
            path.close();
        }
    }
}
