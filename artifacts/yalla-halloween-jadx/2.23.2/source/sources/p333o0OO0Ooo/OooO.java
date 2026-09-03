package p333o0OO0Ooo;

import android.graphics.Path;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.StringTokenizer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o0OO0o00.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f42420OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Path f42421OooO0O0;

    public OooO(@NotNull String originValue) {
        Intrinsics.checkNotNullParameter(originValue, "originValue");
        this.f42420OooO00o = StringsKt__StringsKt.contains$default(originValue, ",", false, 2, (Object) null) ? StringsKt__StringsJVMKt.replace$default(originValue, ",", ZegoConstants.ZegoVideoDataAuxPublishingStream, false, 4, (Object) null) : originValue;
    }

    public static void OooO0O0(Path path, String str, StringTokenizer stringTokenizer) {
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String s = stringTokenizer.nextToken();
                Intrinsics.checkNotNullExpressionValue(s, "s");
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
        OooO0O0 oooO0O0 = new OooO0O0(0.0f, 0.0f);
        if (Intrinsics.areEqual(str, "M")) {
            path.moveTo(f11, f7);
            oooO0O0 = new OooO0O0(f11, f7);
        } else if (Intrinsics.areEqual(str, "m")) {
            path.rMoveTo(f11, f7);
            oooO0O0 = new OooO0O0(0.0f + f11, 0.0f + f7);
        }
        OooO0O0 oooO0O1 = oooO0O0;
        if (Intrinsics.areEqual(str, "L")) {
            path.lineTo(f11, f7);
        } else if (Intrinsics.areEqual(str, "l")) {
            path.rLineTo(f11, f7);
        }
        if (Intrinsics.areEqual(str, "C")) {
            path.cubicTo(f11, f7, f8, f9, f10, f5);
        } else if (Intrinsics.areEqual(str, "c")) {
            path.rCubicTo(f11, f7, f8, f9, f10, f5);
        }
        if (Intrinsics.areEqual(str, "Q")) {
            path.quadTo(f11, f7, f8, f9);
        } else if (Intrinsics.areEqual(str, "q")) {
            path.rQuadTo(f11, f7, f8, f9);
        }
        if (Intrinsics.areEqual(str, "H")) {
            path.lineTo(f11, oooO0O1.f42462OooO0O0);
        } else if (Intrinsics.areEqual(str, "h")) {
            path.rLineTo(f11, 0.0f);
        }
        if (Intrinsics.areEqual(str, "V")) {
            path.lineTo(oooO0O1.f42461OooO00o, f11);
        } else if (Intrinsics.areEqual(str, "v")) {
            path.rLineTo(0.0f, f11);
        }
        if (Intrinsics.areEqual(str, "Z")) {
            path.close();
        } else if (Intrinsics.areEqual(str, "z")) {
            path.close();
        }
    }

    public final void OooO00o(@NotNull Path toPath) {
        Intrinsics.checkNotNullParameter(toPath, "toPath");
        Path path = this.f42421OooO0O0;
        if (path != null) {
            toPath.set(path);
            return;
        }
        Path path2 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.f42420OooO00o, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String segment = stringTokenizer.nextToken();
            Intrinsics.checkNotNullExpressionValue(segment, "segment");
            if (!(segment.length() == 0)) {
                if (OooOO0.f42426OooO00o.contains(segment)) {
                    if (Intrinsics.areEqual(segment, "Z") || Intrinsics.areEqual(segment, "z")) {
                        OooO0O0(path2, segment, new StringTokenizer("", ""));
                    }
                    str = segment;
                } else {
                    OooO0O0(path2, str, new StringTokenizer(segment, ZegoConstants.ZegoVideoDataAuxPublishingStream));
                }
            }
        }
        this.f42421OooO0O0 = path2;
        toPath.set(path2);
    }
}
