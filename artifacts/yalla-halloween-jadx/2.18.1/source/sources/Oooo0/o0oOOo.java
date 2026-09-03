package Oooo0;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o0oOOo implements p025Oooo0O0.o000OO0O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f758OooO0o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final p045OooooOo.o00O<o0oOOo, ?> f759OooO0oO = (OooooOo.o00OO000.OooO0OO) p045OooooOo.o00OO000.OooO00o(OooO00o.f765Oooo0o, OooO0O0.f766Oooo0o);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p026Oooo0OO.o000O000 f761OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o0O00OO<Integer> f762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final p025Oooo0O0.OooOOOO f764OooO0o0;

    public static final class OooO00o extends Lambda implements Function2<p045OooooOo.o00OO00O, o0oOOo, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f765Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(p045OooooOo.o00OO00O o00oo00o, o0oOOo o0oooo2) {
            p045OooooOo.o00OO00O Saver = o00oo00o;
            o0oOOo it = o0oooo2;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.OooO0o0());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, o0oOOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f766Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0oOOo invoke(Integer num) {
            return new o0oOOo(num.intValue());
        }
    }

    public static final class OooO0OO {
    }

    public static final class OooO0o extends Lambda implements Function1<Float, Float> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f) {
            float fFloatValue = f.floatValue();
            float fOooO0o0 = o0oOOo.this.OooO0o0() + fFloatValue;
            o0oOOo o0oooo2 = o0oOOo.this;
            float f2 = fOooO0o0 + o0oooo2.f763OooO0Oo;
            float fCoerceIn = RangesKt.coerceIn(f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o0oooo2.OooO0Oo());
            boolean z = !(f2 == fCoerceIn);
            float fOooO0o1 = fCoerceIn - o0oOOo.this.OooO0o0();
            int iRoundToInt = MathKt.roundToInt(fOooO0o1);
            o0oOOo o0oooo3 = o0oOOo.this;
            o0oooo3.f760OooO00o.setValue(Integer.valueOf(o0oooo3.OooO0o0() + iRoundToInt));
            o0oOOo.this.f763OooO0Oo = fOooO0o1 - iRoundToInt;
            if (z) {
                fFloatValue = fOooO0o1;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public o0oOOo(int i) {
        Integer numValueOf = Integer.valueOf(i);
        o oVar = o.f29323OooO00o;
        this.f760OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0OO(numValueOf, oVar);
        this.f761OooO0O0 = new p026Oooo0OO.o000O000();
        this.f762OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0OO(Integer.MAX_VALUE, oVar);
        this.f764OooO0o0 = (p025Oooo0O0.OooOOOO) p025Oooo0O0.o000O.OooO00o(new OooO0o());
    }

    @Override // p025Oooo0O0.o000OO0O
    public final boolean OooO00o() {
        return this.f764OooO0o0.OooO00o();
    }

    @Override // p025Oooo0O0.o000OO0O
    @Nullable
    public final Object OooO0O0(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super p025Oooo0O0.o0000O, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO0O0 = this.f764OooO0o0.OooO0O0(mutatePriority, function2, continuation);
        return objOooO0O0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0O0 : Unit.INSTANCE;
    }

    @Override // p025Oooo0O0.o000OO0O
    public final float OooO0OO(float f) {
        return this.f764OooO0o0.OooO0OO(f);
    }

    public final int OooO0Oo() {
        return this.f762OooO0OO.getValue().intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0o0() {
        return ((Number) this.f760OooO00o.getValue()).intValue();
    }
}
