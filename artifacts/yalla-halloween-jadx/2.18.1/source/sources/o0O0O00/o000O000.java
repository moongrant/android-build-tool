package o0O0O00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class o000O000 implements o00000O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f35265Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f35266Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public long f35267Oooo0oo = o0000O0O.o0OoOo0.OooO00o(0, 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f35264Oooo = o000O0o.f35284OooO0O0;

    @StabilityInferred(parameters = 0)
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final C0363OooO00o f35268OooO00o = new C0363OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static LayoutDirection f35269OooO0O0 = LayoutDirection.Ltr;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static int f35270OooO0OO;

        /* JADX INFO: renamed from: o0O0O00.o000O000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0363OooO00o extends OooO00o {
            @Override // o0O0O00.o000O000.OooO00o
            @NotNull
            public final LayoutDirection OooO00o() {
                return OooO00o.f35269OooO0O0;
            }

            @Override // o0O0O00.o000O000.OooO00o
            public final int OooO0O0() {
                return OooO00o.f35270OooO0OO;
            }
        }

        public static void OooO(OooO00o oooO00o, o000O000 placeRelativeWithLayer, long j, float f, Function1 function1, int i, Object obj) {
            Function1<p145o00Oo0.o0000, Unit> function2 = o000O0o.f35283OooO00o;
            Function1<p145o00Oo0.o0000, Unit> layerBlock = o000O0o.f35283OooO00o;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (oooO00o.OooO00o() == LayoutDirection.Ltr || oooO00o.OooO0O0() == 0) {
                long jO000oOoO = placeRelativeWithLayer.o000oOoO();
                o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                placeRelativeWithLayer.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (j >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(j)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, layerBlock);
                return;
            }
            int iOooO0O0 = oooO00o.OooO0O0() - ((int) (placeRelativeWithLayer.f35267Oooo0oo >> 32));
            o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
            long jOooO00o = o0000O0O.Oooo000.OooO00o(iOooO0O0 - ((int) (j >> 32)), o0000O0O.OooOo.OooO0OO(j));
            long jO000oOoO2 = placeRelativeWithLayer.o000oOoO();
            placeRelativeWithLayer.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO000oOoO2 >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO2) + o0000O0O.OooOo.OooO0OO(jOooO00o)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, layerBlock);
        }

        public static void OooO0oO(OooO00o oooO00o, o000O000 o000o001, int i, int i2, float f, int i3, Object obj) {
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(o000o001, "<this>");
            long jOooO00o = o0000O0O.Oooo000.OooO00o(i, i2);
            if (oooO00o.OooO00o() == LayoutDirection.Ltr || oooO00o.OooO0O0() == 0) {
                long jO000oOoO = o000o001.o000oOoO();
                o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                o000o001.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(jOooO00o)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null);
                return;
            }
            int iOooO0O0 = oooO00o.OooO0O0() - ((int) (o000o001.f35267Oooo0oo >> 32));
            o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
            long jOooO00o2 = o0000O0O.Oooo000.OooO00o(iOooO0O0 - ((int) (jOooO00o >> 32)), o0000O0O.OooOo.OooO0OO(jOooO00o));
            long jO000oOoO2 = o000o001.o000oOoO();
            o000o001.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o2 >> 32)) + ((int) (jO000oOoO2 >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO2) + o0000O0O.OooOo.OooO0OO(jOooO00o2)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null);
        }

        public static void OooO0oo(OooO00o oooO00o, o000O000 o000o001, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            Function1<p145o00Oo0.o0000, Unit> function2 = o000O0o.f35283OooO00o;
            Function1<p145o00Oo0.o0000, Unit> layerBlock = o000O0o.f35283OooO00o;
            Objects.requireNonNull(oooO00o);
            Intrinsics.checkNotNullParameter(o000o001, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jOooO00o = o0000O0O.Oooo000.OooO00o(i, i2);
            if (oooO00o.OooO00o() == LayoutDirection.Ltr || oooO00o.OooO0O0() == 0) {
                long jO000oOoO = o000o001.o000oOoO();
                o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                o000o001.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(jOooO00o)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, layerBlock);
                return;
            }
            int iOooO0O0 = oooO00o.OooO0O0() - ((int) (o000o001.f35267Oooo0oo >> 32));
            o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
            long jOooO00o2 = o0000O0O.Oooo000.OooO00o(iOooO0O0 - ((int) (jOooO00o >> 32)), o0000O0O.OooOo.OooO0OO(jOooO00o));
            long jO000oOoO2 = o000o001.o000oOoO();
            o000o001.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o2 >> 32)) + ((int) (jO000oOoO2 >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO2) + o0000O0O.OooOo.OooO0OO(jOooO00o2)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, layerBlock);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void OooOO0O(OooO00o oooO00o, o000O000 o000o001, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if ((i3 & 8) != 0) {
                Function1<p145o00Oo0.o0000, Unit> function2 = o000O0o.f35283OooO00o;
                function1 = o000O0o.f35283OooO00o;
            }
            oooO00o.OooOO0(o000o001, i, i2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, function1);
        }

        public static /* synthetic */ void OooOOO0(OooO00o oooO00o, o000O000 o000o001, long j, float f, Function1 function1, int i, Object obj) {
            Function1<p145o00Oo0.o0000, Unit> function2 = o000O0o.f35283OooO00o;
            oooO00o.OooOO0o(o000o001, j, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o000O0o.f35283OooO00o);
        }

        @NotNull
        public abstract LayoutDirection OooO00o();

        public abstract int OooO0O0();

        public final void OooO0OO(@NotNull o000O000 o000o001, int i, int i2, float f) {
            Intrinsics.checkNotNullParameter(o000o001, "<this>");
            long jOooO00o = o0000O0O.Oooo000.OooO00o(i, i2);
            long jO000oOoO = o000o001.o000oOoO();
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
            o000o001.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(jOooO00o)), f, null);
        }

        public final void OooO0o0(@NotNull o000O000 place, long j, float f) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long jO000oOoO = place.o000oOoO();
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
            place.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (j >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(j)), f, null);
        }

        public final void OooOO0(@NotNull o000O000 o000o001, int i, int i2, float f, @NotNull Function1<? super p145o00Oo0.o0000, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(o000o001, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jOooO00o = o0000O0O.Oooo000.OooO00o(i, i2);
            long jO000oOoO = o000o001.o000oOoO();
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
            o000o001.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (jOooO00o >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(jOooO00o)), f, layerBlock);
        }

        public final void OooOO0o(@NotNull o000O000 placeWithLayer, long j, float f, @NotNull Function1<? super p145o00Oo0.o0000, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jO000oOoO = placeWithLayer.o000oOoO();
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
            placeWithLayer.OooooOo(o0000O0O.Oooo000.OooO00o(((int) (j >> 32)) + ((int) (jO000oOoO >> 32)), o0000O0O.OooOo.OooO0OO(jO000oOoO) + o0000O0O.OooOo.OooO0OO(j)), f, layerBlock);
        }
    }

    public /* synthetic */ Object Oooo0o() {
        return null;
    }

    public int OoooOOO() {
        return o0000O0O.o000oOoO.OooO0O0(this.f35267Oooo0oo);
    }

    public int OoooOoO() {
        return (int) (this.f35267Oooo0oo >> 32);
    }

    public abstract void OooooOo(long j, float f, @Nullable Function1<? super p145o00Oo0.o0000, Unit> function1);

    public final void Oooooo() {
        this.f35265Oooo0o = RangesKt.coerceIn((int) (this.f35267Oooo0oo >> 32), o0000O0O.OooO0O0.OooOO0(this.f35264Oooo), o0000O0O.OooO0O0.OooO0oo(this.f35264Oooo));
        this.f35266Oooo0oO = RangesKt.coerceIn(o0000O0O.o000oOoO.OooO0O0(this.f35267Oooo0oo), o0000O0O.OooO0O0.OooO(this.f35264Oooo), o0000O0O.OooO0O0.OooO0oO(this.f35264Oooo));
    }

    public final long o000oOoO() {
        int i = this.f35265Oooo0o;
        long j = this.f35267Oooo0oo;
        return o0000O0O.Oooo000.OooO00o((i - ((int) (j >> 32))) / 2, (this.f35266Oooo0oO - o0000O0O.o000oOoO.OooO0O0(j)) / 2);
    }

    public final void o0OoOo0(long j) {
        if (o0000O0O.o000oOoO.OooO00o(this.f35267Oooo0oo, j)) {
            return;
        }
        this.f35267Oooo0oo = j;
        Oooooo();
    }
}
