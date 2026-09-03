package p384o0OOooO0;

import android.graphics.Path;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.StringTokenizer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p330o0OO0Ooo.OooO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f44318OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Path f44319OooO0O0;

    public o00O0O(@NotNull String originValue) {
        Intrinsics.checkNotNullParameter(originValue, "originValue");
        this.f44318OooO00o = StringsKt.OooO0o(originValue, ",") ? StringsKt.OooOoO(originValue, ",", ZegoConstants.ZegoVideoDataAuxPublishingStream) : originValue;
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
        OooO0o oooO0o = new OooO0o(0.0f, 0.0f);
        if (Intrinsics.areEqual(str, "M")) {
            path.moveTo(f11, f7);
            oooO0o = new OooO0o(f11, f7);
        } else if (Intrinsics.areEqual(str, "m")) {
            path.rMoveTo(f11, f7);
            oooO0o = new OooO0o(0.0f + f11, 0.0f + f7);
        }
        OooO0o oooO0o2 = oooO0o;
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
            path.lineTo(f11, oooO0o2.f43160OooO0O0);
        } else if (Intrinsics.areEqual(str, "h")) {
            path.rLineTo(f11, 0.0f);
        }
        if (Intrinsics.areEqual(str, "V")) {
            path.lineTo(oooO0o2.f43159OooO00o, f11);
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
        Path path = this.f44319OooO0O0;
        if (path != null) {
            toPath.set(path);
            return;
        }
        Path path2 = new Path();
        StringTokenizer stringTokenizer = new StringTokenizer(this.f44318OooO00o, "MLHVCSQRAZmlhvcsqraz", true);
        String str = "";
        while (stringTokenizer.hasMoreTokens()) {
            String segment = stringTokenizer.nextToken();
            Intrinsics.checkNotNullExpressionValue(segment, "segment");
            if (!(segment.length() == 0)) {
                if (o00Oo0.f44320OooO00o.contains(segment)) {
                    if (Intrinsics.areEqual(segment, "Z") || Intrinsics.areEqual(segment, "z")) {
                        OooO0O0(path2, segment, new StringTokenizer("", ""));
                    }
                    str = segment;
                } else {
                    OooO0O0(path2, str, new StringTokenizer(segment, ZegoConstants.ZegoVideoDataAuxPublishingStream));
                }
            }
        }
        this.f44319OooO0O0 = path2;
        toPath.set(path2);
    }
}
