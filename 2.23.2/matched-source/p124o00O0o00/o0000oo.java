package p124o00O0o00;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.PostProcessor;
import android.os.Build;
import android.util.Size;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import o00O.OooO00o;
import o00OO00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000O0o;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f36571OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f36572OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f36573OooO0OO;

    public o0000oo(Ref.ObjectRef objectRef, o00000O0 o00000o1, Ref.BooleanRef booleanRef) {
        this.f36571OooO00o = objectRef;
        this.f36572OooO0O0 = o00000o1;
        this.f36573OooO0OO = booleanRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onHeaderDecoded(@NotNull ImageDecoder decoder, @NotNull ImageDecoder.ImageInfo info, @NotNull ImageDecoder.Source source) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f36571OooO00o.element = decoder;
        Size size = info.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        o0O0O00 o0o0o00 = this.f36572OooO0O0.f36545OooO0O0;
        o000O0Oo o000o0oo2 = o0o0o00.f36841OooO0Oo;
        int iOooO00o = o000O0o.OooO00o(o000o0oo2) ? width : OooOO0.OooO00o(o000o0oo2.f36771OooO00o, o0o0o00.f36843OooO0o0);
        o0O0O00 o0o0o01 = this.f36572OooO0O0.f36545OooO0O0;
        o000O0Oo o000o0oo3 = o0o0o01.f36841OooO0Oo;
        int iOooO00o2 = o000O0o.OooO00o(o000o0oo3) ? height : OooOO0.OooO00o(o000o0oo3.f36772OooO0O0, o0o0o01.f36843OooO0o0);
        boolean z = false;
        if (width > 0 && height > 0 && (width != iOooO00o || height != iOooO00o2)) {
            double dOooO00o = OooOOO.OooO00o(width, height, iOooO00o, iOooO00o2, this.f36572OooO0O0.f36545OooO0O0.f36843OooO0o0);
            Ref.BooleanRef booleanRef = this.f36573OooO0OO;
            boolean z2 = dOooO00o < 1.0d;
            booleanRef.element = z2;
            if (z2 || !this.f36572OooO0O0.f36545OooO0O0.f36842OooO0o) {
                decoder.setTargetSize(MathKt.roundToInt(((double) width) * dOooO00o), MathKt.roundToInt(dOooO00o * ((double) height)));
            }
        }
        o0O0O00 o0o0o02 = this.f36572OooO0O0.f36545OooO0O0;
        Bitmap.Config config = o0o0o02.f36839OooO0O0;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            z = true;
        }
        decoder.setAllocator(z ? 3 : 1);
        decoder.setMemorySizePolicy(!o0o0o02.f36844OooO0oO ? 1 : 0);
        ColorSpace colorSpace = o0o0o02.f36840OooO0OO;
        if (colorSpace != null) {
            decoder.setTargetColorSpace(colorSpace);
        }
        decoder.setUnpremultipliedRequired(!o0o0o02.f36845OooO0oo);
        final OooO00o oooO00o = (OooO00o) o0o0o02.f36848OooOO0o.OooO00o("coil#animated_transformation");
        decoder.setPostProcessor(oooO00o != null ? new PostProcessor() { // from class: o00OO00O.OooO
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int i = OooOO0.OooO00o.$EnumSwitchMapping$0[oooO00o.OooO00o().ordinal()];
                if (i == 1) {
                    return 0;
                }
                if (i == 2) {
                    return -3;
                }
                if (i == 3) {
                    return -1;
                }
                throw new NoWhenBranchMatchedException();
            }
        } : 0);
    }
}
