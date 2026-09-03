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
import p023Oooo00O.oo00o;
import p048OoooooO.o00OO0O0;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000Oo0 extends o000O0O0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o0Oo0oo> f893Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo00o<EnterExitState>.OooO00o<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> f894Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> f895Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o0Oo0oo> f896Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public o00OO0O0 f897OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final oO0Oo<o00OO0O0> f898OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final Function1<oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> f899OoooO0O;

    public static final class OooO extends Lambda implements Function1<EnterExitState, o0000O0O.OooOo> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f901Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j) {
            super(1);
            this.f901Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000O0O.OooOo invoke(EnterExitState enterExitState) {
            int i;
            long jOooO00o;
            EnterExitState targetState = enterExitState;
            Intrinsics.checkNotNullParameter(targetState, "it");
            o000Oo0 o000oo1 = o000Oo0.this;
            long j = this.f901Oooo0oO;
            Objects.requireNonNull(o000oo1);
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (o000oo1.f897OoooO0 == null || o000oo1.f898OoooO00.getValue() == null || Intrinsics.areEqual(o000oo1.f897OoooO0, o000oo1.f898OoooO00.getValue()) || (i = OooO00o.$EnumSwitchMapping$0[targetState.ordinal()]) == 1 || i == 2) {
                o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
                jOooO00o = o0000O0O.OooOo.f27311OooO0OO;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                o0Oo0oo value = o000oo1.f893Oooo.getValue();
                if (value != null) {
                    long j2 = value.f987OooO0O0.invoke(new o0000O0O.o000oOoO(j)).f27322OooO00o;
                    o00OO0O0 value2 = o000oo1.f898OoooO00.getValue();
                    Intrinsics.checkNotNull(value2);
                    o00OO0O0 o00oo0o1 = value2;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    long jOooO00o2 = o00oo0o1.OooO00o(j, j2, layoutDirection);
                    o00OO0O0 o00oo0o2 = o000oo1.f897OoooO0;
                    Intrinsics.checkNotNull(o00oo0o2);
                    long jOooO00o3 = o00oo0o2.OooO00o(j, j2, layoutDirection);
                    o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
                    jOooO00o = o0000O0O.Oooo000.OooO00o(((int) (jOooO00o2 >> 32)) - ((int) (jOooO00o3 >> 32)), o0000O0O.OooOo.OooO0OO(jOooO00o2) - o0000O0O.OooOo.OooO0OO(jOooO00o3));
                } else {
                    o0000O0O.OooOo.OooO00o oooO00o3 = o0000O0O.OooOo.f27310OooO0O0;
                    jOooO00o = o0000O0O.OooOo.f27311OooO0OO;
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o0O0O00.o000O000 f902Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f903Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f904Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0O0O00.o000O000 o000o001, long j, long j2) {
            super(1);
            this.f902Oooo0o = o000o001;
            this.f903Oooo0oO = j;
            this.f904Oooo0oo = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o0O0O00.o000O000.OooO00o oooO00o) {
            o0O0O00.o000O000.OooO00o layout = oooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            o0O0O00.o000O000 o000o001 = this.f902Oooo0o;
            long j = this.f903Oooo0oO;
            o0000O0O.OooOo.OooO00o oooO00o2 = o0000O0O.OooOo.f27310OooO0O0;
            layout.OooO0OO(o000o001, ((int) (this.f904Oooo0oo >> 32)) + ((int) (j >> 32)), o0000O0O.OooOo.OooO0OO(this.f904Oooo0oo) + o0000O0O.OooOo.OooO0OO(j), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<EnterExitState, o0000O0O.o000oOoO> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f906Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j) {
            super(1);
            this.f906Oooo0oO = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0000O0O.o000oOoO invoke(EnterExitState enterExitState) {
            EnterExitState targetState = enterExitState;
            Intrinsics.checkNotNullParameter(targetState, "it");
            o000Oo0 o000oo1 = o000Oo0.this;
            long j = this.f906Oooo0oO;
            Objects.requireNonNull(o000oo1);
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            o0Oo0oo value = o000oo1.f896Oooo0oo.getValue();
            long j2 = value != null ? value.f987OooO0O0.invoke(new o0000O0O.o000oOoO(j)).f27322OooO00o : j;
            o0Oo0oo value2 = o000oo1.f893Oooo.getValue();
            long j3 = value2 != null ? value2.f987OooO0O0.invoke(new o0000O0O.o000oOoO(j)).f27322OooO00o : j;
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

    public static final class OooO0o extends Lambda implements Function1<oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.OooOo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f907Oooo0o = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0000O0O<o0000O0O.OooOo> invoke(oo00o.OooO0O0<EnterExitState> oooO0O0) {
            oo00o.OooO0O0<EnterExitState> animate = oooO0O0;
            Intrinsics.checkNotNullParameter(animate, "$this$animate");
            return o000000.f836OooO0Oo;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<oo00o.OooO0O0<EnterExitState>, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO>> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> invoke(oo00o.OooO0O0<EnterExitState> oooO0O0) {
            oo00o.OooO0O0<EnterExitState> oooO0O1 = oooO0O0;
            Intrinsics.checkNotNullParameter(oooO0O1, "$this$null");
            EnterExitState enterExitState = EnterExitState.PreEnter;
            EnterExitState enterExitState2 = EnterExitState.Visible;
            p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> o0000o0o2 = null;
            if (oooO0O1.OooO0O0(enterExitState, enterExitState2)) {
                o0Oo0oo value = o000Oo0.this.f896Oooo0oo.getValue();
                if (value != null) {
                    o0000o0o2 = value.f988OooO0OO;
                }
            } else if (oooO0O1.OooO0O0(enterExitState2, EnterExitState.PostExit)) {
                o0Oo0oo value2 = o000Oo0.this.f893Oooo.getValue();
                if (value2 != null) {
                    o0000o0o2 = value2.f988OooO0OO;
                }
            } else {
                o0000o0o2 = o000000.f837OooO0o0;
            }
            return o0000o0o2 == null ? o000000.f837OooO0o0 : o0000o0o2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o000Oo0(@NotNull oo00o<EnterExitState>.OooO00o<o0000O0O.o000oOoO, p023Oooo00O.o0OO00O> sizeAnimation, @NotNull oo00o<EnterExitState>.OooO00o<o0000O0O.OooOo, p023Oooo00O.o0OO00O> offsetAnimation, @NotNull oO0Oo<o0Oo0oo> expand, @NotNull oO0Oo<o0Oo0oo> shrink, @NotNull oO0Oo<? extends o00OO0O0> alignment) {
        Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
        Intrinsics.checkNotNullParameter(offsetAnimation, "offsetAnimation");
        Intrinsics.checkNotNullParameter(expand, "expand");
        Intrinsics.checkNotNullParameter(shrink, "shrink");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f894Oooo0o = sizeAnimation;
        this.f895Oooo0oO = offsetAnimation;
        this.f896Oooo0oo = expand;
        this.f893Oooo = shrink;
        this.f898OoooO00 = alignment;
        this.f899OoooO0O = new OooOO0();
    }

    @Override // o0O0O00.oo000o
    @NotNull
    public final o0O0O00.o000000O OoooO0(@NotNull o0O0O00.o00000O0 measure, @NotNull o0O0O00.o0O0O00 measurable, long j) {
        long jOooO00o;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
        long jOooO00o2 = o0000O0O.o0OoOo0.OooO00o(o000o000Oooo000.f35265Oooo0o, o000o000Oooo000.f35266Oooo0oO);
        long j2 = ((o0000O0O.o000oOoO) ((oo00o.OooO00o.C0010OooO00o) this.f894Oooo0o.OooO00o(this.f899OoooO0O, new OooO0OO(jOooO00o2))).getValue()).f27322OooO00o;
        long j3 = ((o0000O0O.OooOo) ((oo00o.OooO00o.C0010OooO00o) this.f895Oooo0oO.OooO00o(OooO0o.f907Oooo0o, new OooO(jOooO00o2))).getValue()).f27312OooO00o;
        o00OO0O0 o00oo0o1 = this.f897OoooO0;
        if (o00oo0o1 != null) {
            jOooO00o = o00oo0o1.OooO00o(jOooO00o2, j2, LayoutDirection.Ltr);
        } else {
            o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
            jOooO00o = o0000O0O.OooOo.f27311OooO0OO;
        }
        return measure.OooOooo((int) (j2 >> 32), o0000O0O.o000oOoO.OooO0O0(j2), MapsKt.emptyMap(), new OooO0O0(o000o000Oooo000, jOooO00o, j3));
    }
}
