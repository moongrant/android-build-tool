package p103o000oo00;

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
import o00.OooO00o;
import org.jetbrains.annotations.NotNull;
import p109o000ooo.o0Oo0oo;
import p111o000oooO.o00O00;
import p111o000oooO.o00O0000;
import p321o0O0ooO.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O0O implements ImageDecoder$OnHeaderDecodedListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f35689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00000OO f35690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f35691OooO0OO;

    public o0000O0O(Ref.ObjectRef objectRef, o00000OO o00000oo2, Ref.BooleanRef booleanRef) {
        this.f35689OooO00o = objectRef;
        this.f35690OooO0O0 = o00000oo2;
        this.f35691OooO0OO = booleanRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onHeaderDecoded(@NotNull ImageDecoder decoder, @NotNull ImageDecoder.ImageInfo info, @NotNull ImageDecoder.Source source) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f35689OooO00o.element = decoder;
        Size size = info.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        o0Oo0oo o0oo0oo2 = this.f35690OooO0O0.f35671OooO0O0;
        o00O00 o00o01 = o0oo0oo2.f35866OooO0Oo;
        int iOooO00o = o00O0000.OooO00o(o00o01) ? width : o000O00.OooO00o(o00o01.f35924OooO00o, o0oo0oo2.f35868OooO0o0);
        o0Oo0oo o0oo0oo3 = this.f35690OooO0O0.f35671OooO0O0;
        o00O00 o00o02 = o0oo0oo3.f35866OooO0Oo;
        int iOooO00o2 = o00O0000.OooO00o(o00o02) ? height : o000O00.OooO00o(o00o02.f35925OooO0O0, o0oo0oo3.f35868OooO0o0);
        boolean z = false;
        if (width > 0 && height > 0 && (width != iOooO00o || height != iOooO00o2)) {
            double dOooO00o = Oooo0.OooO00o(width, height, iOooO00o, iOooO00o2, this.f35690OooO0O0.f35671OooO0O0.f35868OooO0o0);
            Ref.BooleanRef booleanRef = this.f35691OooO0OO;
            boolean z2 = dOooO00o < 1.0d;
            booleanRef.element = z2;
            if (z2 || !this.f35690OooO0O0.f35671OooO0O0.f35867OooO0o) {
                decoder.setTargetSize(MathKt.roundToInt(((double) width) * dOooO00o), MathKt.roundToInt(dOooO00o * ((double) height)));
            }
        }
        o0Oo0oo o0oo0oo4 = this.f35690OooO0O0.f35671OooO0O0;
        Bitmap.Config config = o0oo0oo4.f35864OooO0O0;
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            z = true;
        }
        decoder.setAllocator(z ? 3 : 1);
        decoder.setMemorySizePolicy(!o0oo0oo4.f35869OooO0oO ? 1 : 0);
        ColorSpace colorSpace = o0oo0oo4.f35865OooO0OO;
        if (colorSpace != null) {
            decoder.setTargetColorSpace(colorSpace);
        }
        decoder.setUnpremultipliedRequired(!o0oo0oo4.f35870OooO0oo);
        final OooO00o oooO00o = (OooO00o) o0oo0oo4.f35873OooOO0o.OooO00o("coil#animated_transformation");
        decoder.setPostProcessor(oooO00o != null ? new PostProcessor() { // from class: o0O0ooO.o000Oo0
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int i = o000O00.OooO00o.$EnumSwitchMapping$0[oooO00o.OooO00o().ordinal()];
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
