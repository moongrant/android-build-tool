package Oooo0;

import android.os.Build;
import androidx.compose.ui.layout.LayoutModifierKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final C0005OooO00o f487OooO00o = new C0005OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final p048OoooooO.o00OOOO0 f488OooO0O0;

    /* JADX INFO: renamed from: Oooo0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0005OooO00o implements oo0oOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f489OooO00o;

        @Override // Oooo0.oo0oOO0
        public final void OooO00o(long j, long j2, @Nullable o00O0O.OooO oooO, int i) {
        }

        @Override // Oooo0.oo0oOO0
        @Nullable
        public final Object OooO0O0(long j) {
            o0000O0O.oo000o.OooO00o oooO00o = o0000O0O.oo000o.f27328OooO0O0;
            return new o0000O0O.oo000o(o0000O0O.oo000o.f27329OooO0OO);
        }

        @Override // Oooo0.oo0oOO0
        public final long OooO0OO(long j, @Nullable o00O0O.OooO oooO) {
            o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
            return o00O0O.OooO.f30392OooO0OO;
        }

        @Override // Oooo0.oo0oOO0
        @NotNull
        public final p048OoooooO.o00OOOO0 OooO0Oo() {
            int i = p048OoooooO.o00OOOO0.f4197OooO00o;
            return OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
        }

        @Override // Oooo0.oo0oOO0
        @Nullable
        public final Object OooO0o(long j) {
            return Unit.INSTANCE;
        }

        @Override // Oooo0.oo0oOO0
        public final boolean OooO0o0() {
            return false;
        }

        @Override // Oooo0.oo0oOO0
        public final boolean isEnabled() {
            return this.f489OooO00o;
        }

        @Override // Oooo0.oo0oOO0
        public final void setEnabled(boolean z) {
            this.f489OooO00o = z;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o0O0O00.o00000O0, o0O0O00.o0O0O00, o0000O0O.OooO0O0, o0O0O00.o000000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f490Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final o0O0O00.o000000O invoke(o0O0O00.o00000O0 o00000o1, o0O0O00.o0O0O00 o0o0o00, o0000O0O.OooO0O0 oooO0O0) {
            o0O0O00.o00000O0 layout = o00000o1;
            o0O0O00.o0O0O00 measurable = o0o0o00;
            long j = oooO0O0.f27302OooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
            float f = o00000O0.f547OooO00o;
            int iOoooooO = layout.OoooooO(o00000O0.f547OooO00o * 2);
            return layout.OooOooo(o000o000Oooo000.OoooOoO() - iOoooooO, o000o000Oooo000.OoooOOO() - iOoooooO, MapsKt.emptyMap(), new Oooo0.OooO0O0(o000o000Oooo000, iOoooooO));
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o0O0O00.o00000O0, o0O0O00.o0O0O00, o0000O0O.OooO0O0, o0O0O00.o000000O> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f491Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final o0O0O00.o000000O invoke(o0O0O00.o00000O0 o00000o1, o0O0O00.o0O0O00 o0o0o00, o0000O0O.OooO0O0 oooO0O0) {
            o0O0O00.o00000O0 layout = o00000o1;
            o0O0O00.o0O0O00 measurable = o0o0o00;
            long j = oooO0O0.f27302OooO00o;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            o0O0O00.o000O000 o000o000Oooo000 = measurable.Oooo000(j);
            float f = o00000O0.f547OooO00o;
            int iOoooooO = layout.OoooooO(o00000O0.f547OooO00o * 2);
            return layout.OooOooo(o000o000Oooo000.f35265Oooo0o + iOoooooO, o000o000Oooo000.f35266Oooo0oO + iOoooooO, MapsKt.emptyMap(), new Oooo0.OooO0OO(o000o000Oooo000, iOoooooO));
        }
    }

    static {
        p048OoooooO.o00OOOO0 o00oooo0OooO00o;
        if (Build.VERSION.SDK_INT >= 31) {
            int i = p048OoooooO.o00OOOO0.f4197OooO00o;
            o00oooo0OooO00o = LayoutModifierKt.OooO00o(LayoutModifierKt.OooO00o(OoooooO.o00OOOO0.OooO00o.f4198Oooo0o, OooO0O0.f490Oooo0o), OooO0OO.f491Oooo0o);
        } else {
            int i2 = p048OoooooO.o00OOOO0.f4197OooO00o;
            o00oooo0OooO00o = OoooooO.o00OOOO0.OooO00o.f4198Oooo0o;
        }
        f488OooO0O0 = o00oooo0OooO00o;
    }
}
