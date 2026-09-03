package p025Oooo0O0;

import Oooo0.o000O0O0;
import Oooo0.o000OO0O;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o0000O0O.o000oOoO;
import o0000O0O.o0OoOo0;
import o00O0O.OooO;
import o00O0O.OooOO0O;
import o00O0O.OooOOO0;
import o0O0O00.Oooo000;
import o0O0O00.o0000O;
import o0O0O00.o000OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00oO0o;
import p030Oooo0oo.o0O0O0o0;
import p030Oooo0oo.o0O0OO0;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements o0O0O0o0, o0000O, o000OO {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f1354Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f1355Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Orientation f1356Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000OO0O f1357Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f1358OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Oooo000 f1359OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public Oooo000 f1360OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public o000oOoO f1361OoooO0O;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            iArr[Orientation.Vertical.ordinal()] = 1;
            iArr[Orientation.Horizontal.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Oooo000, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Oooo000 oooo000) {
            OooOO0.this.f1360OoooO00 = oooo000;
            return Unit.INSTANCE;
        }
    }

    public OooOO0(@NotNull CoroutineScope scope, @NotNull Orientation orientation, @NotNull o000OO0O scrollableState, boolean z) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        this.f1355Oooo0o = scope;
        this.f1356Oooo0oO = orientation;
        this.f1357Oooo0oo = scrollableState;
        this.f1354Oooo = z;
        OooO0O0 onPositioned = new OooO0O0();
        OooOo00<Function1<Oooo000, Unit>> oooOo00 = o000OO0O.f592OooO00o;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(onPositioned, "onPositioned");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o00OOOO0 o00oooo0OooO00o = o00OOO0O.OooO00o(this, function2, new o000O0O0(onPositioned));
        Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
        Intrinsics.checkNotNullParameter(this, "responder");
        this.f1358OoooO = o00OOO0O.OooO00o(o00oooo0OooO00o, function2, new o0O0OO0(this));
    }

    @Override // p030Oooo0oo.o0O0O0o0
    @NotNull
    public final OooOO0O OooO00o(@NotNull OooOO0O localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        o000oOoO o000oooo2 = this.f1361OoooO0O;
        if (o000oooo2 != null) {
            return OooO0OO(localRect, o000oooo2.f27322OooO00o);
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    @Override // p030Oooo0oo.o0O0O0o0
    @Nullable
    public final Object OooO0O0(@NotNull OooOO0O oooOO0O, @NotNull Continuation<? super Unit> continuation) {
        Object objOooO0Oo = OooO0Oo(oooOO0O, OooO00o(oooOO0O), continuation);
        return objOooO0Oo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0Oo : Unit.INSTANCE;
    }

    public final OooOO0O OooO0OO(OooOO0O oooOO0O, long j) {
        long jOooO0O0 = o0OoOo0.OooO0O0(j);
        int i = OooO00o.$EnumSwitchMapping$0[this.f1356Oooo0oO.ordinal()];
        if (i == 1) {
            return oooOO0O.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, OooO0o0(oooOO0O.f30405OooO0O0, oooOO0O.f30407OooO0Oo, o00O0O.OooOo00.OooO0O0(jOooO0O0)));
        }
        if (i == 2) {
            return oooOO0O.OooO0OO(OooO0o0(oooOO0O.f30404OooO00o, oooOO0O.f30406OooO0OO, o00O0O.OooOo00.OooO0Oo(jOooO0O0)), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Object OooO0Oo(OooOO0O oooOO0O, OooOO0O oooOO0O2, Continuation<? super Unit> continuation) {
        float f;
        float f2;
        int i = OooO00o.$EnumSwitchMapping$0[this.f1356Oooo0oO.ordinal()];
        if (i == 1) {
            f = oooOO0O.f30405OooO0O0;
            f2 = oooOO0O2.f30405OooO0O0;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = oooOO0O.f30404OooO00o;
            f2 = oooOO0O2.f30404OooO00o;
        }
        float f3 = f - f2;
        if (this.f1354Oooo) {
            f3 = -f3;
        }
        Object objOooO00o = o000OO.OooO00o(this.f1357Oooo0oo, f3, o00oO0o.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 7), continuation);
        return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
    }

    public final float OooO0o0(float f, float f2, float f3) {
        if ((f >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 <= f3) || (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 > f3)) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f4 = f2 - f3;
        return Math.abs(f) < Math.abs(f4) ? f : f4;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // o0O0O00.o0000O
    public final void OooOoO(long j) {
        Oooo000 oooo000;
        OooOO0O oooOO0OOooo;
        Oooo000 oooo001 = this.f1359OoooO0;
        o000oOoO o000oooo2 = this.f1361OoooO0O;
        if (o000oooo2 != null && !o000oOoO.OooO00o(o000oooo2.f27322OooO00o, j)) {
            if (oooo001 != null && oooo001.OooOoO()) {
                long j2 = o000oooo2.f27322OooO00o;
                if ((this.f1356Oooo0oO != Orientation.Horizontal ? o000oOoO.OooO0O0(oooo001.OooO00o()) < o000oOoO.OooO0O0(j2) : ((int) (oooo001.OooO00o() >> 32)) < ((int) (j2 >> 32))) && (oooo000 = this.f1360OoooO00) != null && (oooOO0OOooo = oooo001.Oooo(oooo000, false)) != null) {
                    OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
                    OooOO0O oooOO0OOooO00o = OooOOO0.OooO00o(OooO.f30392OooO0OO, o0OoOo0.OooO0O0(j2));
                    OooOO0O oooOO0OOooO0OO = OooO0OO(oooOO0OOooo, oooo001.OooO00o());
                    boolean zOooO0O0 = oooOO0OOooO00o.OooO0O0(oooOO0OOooo);
                    boolean zAreEqual = true ^ Intrinsics.areEqual(oooOO0OOooO0OO, oooOO0OOooo);
                    if (zOooO0O0 && zAreEqual) {
                        BuildersKt__Builders_commonKt.launch$default(this.f1355Oooo0o, null, null, new OooOO0O(this, oooOO0OOooo, oooOO0OOooO0OO, null), 3, null);
                    }
                }
            }
        }
        this.f1361OoooO0O = new o000oOoO(j);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // o0O0O00.o000OO
    public final void Oooo00O(@NotNull Oooo000 coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f1359OoooO0 = coordinates;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
