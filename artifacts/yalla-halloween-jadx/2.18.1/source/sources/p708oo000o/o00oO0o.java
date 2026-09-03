package p708oo000o;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O00O;
import p100o000oOoO.o00O0OO;
import p100o000oOoO.o00O0OOO;
import p100o000oOoO.o00OO000;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.o0o0Oo;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p145o00Oo0.o00000O;
import p191o00o0O.o0Oo0oo;
import p191o00o0O.o0ooOOo;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends o000OO0O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final o000oOoO f53218OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f53219OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f53220OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public o00O0OO f53221OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f53222OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public o00000O f53223OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f53224o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O0OO f53225Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O0OO o00o0oo2) {
            super(1);
            this.f53225Oooo0o = o00o0oo2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
            o00OOOO0 DisposableEffect = o00oooo1;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new oo000o(this.f53225Oooo0o);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f53226Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f53228Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f53229Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f53230OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function4<Float, Float, oOO00O, Integer, Unit> f53231OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(String str, float f, float f2, Function4<? super Float, ? super Float, ? super oOO00O, ? super Integer, Unit> function4, int i) {
            super(2);
            this.f53228Oooo0oO = str;
            this.f53229Oooo0oo = f;
            this.f53226Oooo = f2;
            this.f53231OoooO00 = function4;
            this.f53230OoooO0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o00oO0o.this.OooOO0O(this.f53228Oooo0oO, this.f53229Oooo0oo, this.f53226Oooo, this.f53231OoooO00, ooo00o, this.f53230OoooO0 | 1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00oO0o.this.f53224o000oOoO.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public o00oO0o() {
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        this.f53219OoooO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new OooOo00(OooOo00.f30417OooO0OO));
        this.f53220OoooO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
        o000oOoO o000oooo2 = new o000oOoO();
        OooO0OO oooO0OO = new OooO0OO();
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        o000oooo2.f53199OooO0o0 = oooO0OO;
        this.f53218OoooO = o000oooo2;
        this.f53224o000oOoO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
        this.f53222OoooOOO = 1.0f;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0OO(float f) {
        this.f53222OoooOOO = f;
        return true;
    }

    @Override // p263o00ooo.o000OO0O
    public final boolean OooO0o0(@Nullable o00000O o00000o) {
        this.f53223OoooOOo = o00000o;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p263o00ooo.o000OO0O
    public final long OooO0oo() {
        return ((OooOo00) this.f53219OoooO0.getValue()).f30419OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p263o00ooo.o000OO0O
    public final void OooOO0(@NotNull o0Oo0oo o0oo0oo2) {
        Intrinsics.checkNotNullParameter(o0oo0oo2, "<this>");
        o000oOoO o000oooo2 = this.f53218OoooO;
        o00000O o00000o = this.f53223OoooOOo;
        if (o00000o == null) {
            o00000o = (o00000O) o000oooo2.f53198OooO0o.getValue();
        }
        if (((Boolean) this.f53220OoooO0O.getValue()).booleanValue() && o0oo0oo2.getLayoutDirection() == LayoutDirection.Rtl) {
            long jO00Oo0 = o0oo0oo2.o00Oo0();
            o0ooOOo o0oooooOoooo0o = o0oo0oo2.Ooooo0o();
            long jOooO0OO = o0oooooOoooo0o.OooO0OO();
            o0oooooOoooo0o.OooO0o().OooO0oo();
            o0oooooOoooo0o.OooO0Oo().OooO0o0(-1.0f, 1.0f, jO00Oo0);
            o000oooo2.OooO0o(o0oo0oo2, this.f53222OoooOOO, o00000o);
            o0oooooOoooo0o.OooO0o().OooOOo0();
            o0oooooOoooo0o.OooO0o0(jOooO0OO);
        } else {
            o000oooo2.OooO0o(o0oo0oo2, this.f53222OoooOOO, o00000o);
        }
        if (((Boolean) this.f53224o000oOoO.getValue()).booleanValue()) {
            this.f53224o000oOoO.setValue(Boolean.FALSE);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void OooOO0O(@NotNull String value, float f, float f2, @NotNull Function4<? super Float, ? super Float, ? super oOO00O, ? super Integer, Unit> content, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(value, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(1264894527);
        o000oOoO o000oooo2 = this.f53218OoooO;
        Objects.requireNonNull(o000oooo2);
        Intrinsics.checkNotNullParameter(value, "value");
        OooOO0O oooOO0O = o000oooo2.f53195OooO0O0;
        Objects.requireNonNull(oooOO0O);
        Intrinsics.checkNotNullParameter(value, "value");
        oooOO0O.f53058OooO = value;
        oooOO0O.OooO0OO();
        if (!(o000oooo2.f53200OooO0oO == f)) {
            o000oooo2.f53200OooO0oO = f;
            o000oooo2.OooO0o0();
        }
        if (!(o000oooo2.f53201OooO0oo == f2)) {
            o000oooo2.f53201OooO0oo = f2;
            o000oooo2.OooO0o0();
        }
        o00O0OOO o00o0oooOooO0O0 = o00O00O.OooO0O0(ooo00oOooOOo);
        o00O0OO o00o0ooOooO00o = this.f53221OoooOO0;
        if (o00o0ooOooO00o == null || o00o0ooOooO00o.OooO0o0()) {
            o00o0ooOooO00o = o00OO000.OooO00o(new Oooo000(this.f53218OoooO.f53195OooO0O0), o00o0oooOooO0O0);
        }
        this.f53221OoooOO0 = o00o0ooOooO00o;
        o00o0ooOooO00o.OooO(o00O0000.OooO0O0(-1916507005, true, new o0ooOOo(content, this)));
        o00Oo00.OooO0O0(o00o0ooOooO00o, new OooO00o(o00o0ooOooO00o), ooo00oOooOOo);
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(value, f, f2, content, i));
    }
}
