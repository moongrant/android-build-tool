package Oooo000;

import androidx.compose.animation.EnterExitState;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends o000OOo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.oo00o<EnterExitState>.OooO00o<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> f857Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00OO0O0> f858OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o0OOO0o> f859OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> f860OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o0OOO0o> f861OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public o00OO0O0 f862OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Function1<Oooo00O.oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> f863o000oOoO;

    public static final class OooO extends Lambda implements Function1<EnterExitState, o0000O0O.OooOo> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f865OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j) {
            super(1);
            this.f865OoooO00 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000O0O.OooOo invoke(EnterExitState enterExitState) {
            int i;
            long jOooO00o;
            EnterExitState targetState = enterExitState;
            Intrinsics.checkNotNullParameter(targetState, "it");
            o000O0 o000o0 = o000O0.this;
            long j = this.f865OoooO00;
            Objects.requireNonNull(o000o0);
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (o000o0.f862OoooOO0 == null || o000o0.f858OoooO.getValue() == null || Intrinsics.areEqual(o000o0.f862OoooOO0, o000o0.f858OoooO.getValue()) || (i = OooO00o.$EnumSwitchMapping$0[targetState.ordinal()]) == 1 || i == 2) {
                o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27330OooO0O0;
                jOooO00o = o0000O0O.OooOo.f27331OooO0OO;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                o0OOO0o value = o000o0.f861OoooO0O.getValue();
                if (value != null) {
                    long j2 = value.f994OooO0O0.invoke(new o0000O0O.o000oOoO(j)).f27342OooO00o;
                    o00OO0O0 value2 = o000o0.f858OoooO.getValue();
                    Intrinsics.checkNotNull(value2);
                    o00OO0O0 o00oo0o1 = value2;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    long jOooO00o2 = o00oo0o1.OooO00o(j, j2, layoutDirection);
                    o00OO0O0 o00oo0o2 = o000o0.f862OoooOO0;
                    Intrinsics.checkNotNull(o00oo0o2);
                    long jOooO00o3 = o00oo0o2.OooO00o(j, j2, layoutDirection);
                    o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27330OooO0O0;
                    jOooO00o = o0000O0O.Oooo000.OooO00o(((int) (jOooO00o2 >> 32)) - ((int) (jOooO00o3 >> 32)), o0000O0O.OooOo.OooO0OO(jOooO00o2) - o0000O0O.OooOo.OooO0OO(jOooO00o3));
                } else {
                    o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27330OooO0O0;
                    jOooO00o = o0000O0O.OooOo.f27331OooO0OO;
                }
            }
            return new o0000O0O.OooOo(jOooO00o);
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnterExitState.values().length];
            iArr[EnterExitState.Visible.ordinal()] = 1;
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
            iArr[EnterExitState.PostExit.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o0O0O00.o000O000.OooO00o, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000 f866Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f867OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f868OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O0O00.o000O000 o000o001, long j, long j2) {
            super(1);
            this.f866Oooo = o000o001;
            this.f868OoooO00 = j;
            this.f867OoooO0 = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0O0O00.o000O000 o000o001 = this.f866Oooo;
            long j = this.f868OoooO00;
            o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27330OooO0O0;
            layout.OooO0OO(o000o001, ((int) (this.f867OoooO0 >> 32)) + ((int) (j >> 32)), o0000O0O.OooOo.OooO0OO(this.f867OoooO0) + o0000O0O.OooOo.OooO0OO(j), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<EnterExitState, o0000O0O.o000oOoO> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f870OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j) {
            super(1);
            this.f870OoooO00 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000O0O.o000oOoO invoke(EnterExitState enterExitState) {
            EnterExitState targetState = enterExitState;
            Intrinsics.checkNotNullParameter(targetState, "it");
            o000O0 o000o0 = o000O0.this;
            long j = this.f870OoooO00;
            Objects.requireNonNull(o000o0);
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            o0OOO0o value = o000o0.f859OoooO0.getValue();
            long j2 = value != null ? value.f994OooO0O0.invoke(new o0000O0O.o000oOoO(j)).f27342OooO00o : j;
            o0OOO0o value2 = o000o0.f861OoooO0O.getValue();
            long j3 = value2 != null ? value2.f994OooO0O0.invoke(new o0000O0O.o000oOoO(j)).f27342OooO00o : j;
            int i = OooO00o.$EnumSwitchMapping$0[targetState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    j = j2;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j = j3;
                }
            }
            return new o0000O0O.o000oOoO(j);
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Oooo00O.oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.OooOo>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0o f871Oooo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0000O0O<o0000O0O.OooOo> invoke(Oooo00O.oo00o.OooO0O0<EnterExitState> oooO0O0) {
            Oooo00O.oo00o.OooO0O0<EnterExitState> animate = oooO0O0;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            return o000OOo.f890OooO0Oo;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Oooo00O.oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> invoke(Oooo00O.oo00o.OooO0O0<EnterExitState> oooO0O0) {
            Oooo00O.oo00o.OooO0O0<EnterExitState> oooO0O1 = oooO0O0;
            Intrinsics.checkNotNullParameter(oooO0O1, "$this$null");
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> o0000o0o2 = null;
            if (oooO0O1.OooO0O0(enterExitState, enterExitState2)) {
                o0OOO0o value = o000O0.this.f859OoooO0.getValue();
                if (value != null) {
                    o0000o0o2 = value.f995OooO0OO;
                }
            } else if (oooO0O1.OooO0O0(enterExitState2, EnterExitState.PostExit)) {
                o0OOO0o value2 = o000O0.this.f861OoooO0O.getValue();
                if (value2 != null) {
                    o0000o0o2 = value2.f995OooO0OO;
                }
            } else {
                o0000o0o2 = o000OOo.f891OooO0o0;
            }
            return o0000o0o2 == null ? o000OOo.f891OooO0o0 : o0000o0o2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000O0(@NotNull p023Oooo00O.oo00o<EnterExitState>.OooO00o<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> sizeAnimation, @NotNull p023Oooo00O.oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> offsetAnimation, @NotNull oO0Oo<o0OOO0o> expand, @NotNull oO0Oo<o0OOO0o> shrink, @NotNull oO0Oo<? extends o00OO0O0> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f857Oooo = sizeAnimation;
        this.f860OoooO00 = offsetAnimation;
        this.f859OoooO0 = expand;
        this.f861OoooO0O = shrink;
        this.f858OoooO = alignment;
        this.f863o000oOoO = new OooOO0();
    }

    @Override // o0O0O00.o00oO0o
    @NotNull
    public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
        long jOooO00o;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        long jOooO00o2 = o0000O0O.o0OoOo0.OooO00o(o000o000Oooo000.f35285Oooo, o000o000Oooo000.f35287OoooO00);
        long j2 = ((o0000O0O.o000oOoO) ((Oooo00O.oo00o.OooO00o.C0010OooO00o) this.f857Oooo.OooO00o(this.f863o000oOoO, new OooO0OO(jOooO00o2))).getValue()).f27342OooO00o;
        long j3 = ((o0000O0O.OooOo) ((Oooo00O.oo00o.OooO00o.C0010OooO00o) this.f860OoooO00.OooO00o(OooO0o.f871Oooo, new OooO(jOooO00o2))).getValue()).f27332OooO00o;
        o00OO0O0 o00oo0o1 = this.f862OoooOO0;
        if (o00oo0o1 != null) {
            jOooO00o = o00oo0o1.OooO00o(jOooO00o2, j2, LayoutDirection.Ltr);
        } else {
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27330OooO0O0;
            jOooO00o = o0000O0O.OooOo.f27331OooO0OO;
        }
        return measure.OooOooo((int) (j2 >> 32), o0000O0O.o000oOoO.OooO0O0(j2), MapsKt.emptyMap(), new OooO0O0(o000o000Oooo000, jOooO00o, j3));
    }
}
