package p032OoooO0;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p054o00000oo.o000OOo0;
import p054o00000oo.o00O000o;
import p054o00000oo.o00OOO00;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o0O0OOO0;
import p100o000oOoO.o0OOO00;
import p145o00Oo0.Oooo0;
import p710ooOO.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f3318OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public oOO00O f3319OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0OOO0 f3320OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o000OOo0 f3321OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o00OOO00 f3322OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Oooo000 f3323OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3324OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3325OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3326OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3327OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3328OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f3329OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public Function1<? super oo0oOO0, Unit> f3330OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o000O00 f3331OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Function1<oo0oOO0, Unit> f3332OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Function1<o00O000o, Unit> f3333OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Oooo0 f3334OooOOo0;

    public static final class OooO00o extends Lambda implements Function1<o00O000o, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00O000o o00o000o2) {
            Function1<Object, Unit> function1;
            Unit unit;
            int i = o00o000o2.f27176OooO00o;
            o000O00 o000o01 = o0O0000O.this.f3331OooOOO0;
            Objects.requireNonNull(o000o01);
            o0ooOOo o0ooooo2 = null;
            if (i == 7) {
                function1 = o000o01.OooO00o().f3045OooO00o;
            } else {
                if (i == 2) {
                    function1 = o000o01.OooO00o().f3046OooO0O0;
                } else {
                    if (i == 6) {
                        function1 = o000o01.OooO00o().f3047OooO0OO;
                    } else {
                        if (i == 5) {
                            function1 = o000o01.OooO00o().f3048OooO0Oo;
                        } else {
                            if (i == 3) {
                                function1 = o000o01.OooO00o().f3050OooO0o0;
                            } else {
                                if (i == 4) {
                                    function1 = o000o01.OooO00o().f3049OooO0o;
                                } else {
                                    if (!((i == 1) || i == 0)) {
                                        throw new IllegalStateException("invalid ImeAction".toString());
                                    }
                                    function1 = null;
                                }
                            }
                        }
                    }
                }
            }
            if (function1 != null) {
                function1.invoke(o000o01);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                if (i == 6) {
                    o0ooOOo o0ooooo3 = o000o01.f3041OooO0O0;
                    if (o0ooooo3 != null) {
                        o0ooooo2 = o0ooooo3;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
                    }
                    o0ooooo2.OooO00o(1);
                } else {
                    if (i == 5) {
                        o0ooOOo o0ooooo4 = o000o01.f3041OooO0O0;
                        if (o0ooooo4 != null) {
                            o0ooooo2 = o0ooooo4;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("focusManager");
                        }
                        o0ooooo2.OooO00o(2);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<oo0oOO0, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oo0oOO0 oo0ooo0) {
            oo0oOO0 it = oo0ooo0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!Intrinsics.areEqual(it.f27236OooO00o.f26756Oooo0o, o0O0000O.this.f3319OooO00o.f3390OooO00o.f26756Oooo0o)) {
                o0O0000O.this.OooO0Oo(HandleState.None);
            }
            o0O0000O.this.f3330OooOOO.invoke(it);
            o0O0000O.this.f3320OooO0O0.invalidate();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<oo0oOO0, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f3337Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(oo0oOO0 oo0ooo0) {
            oo0oOO0 it = oo0ooo0;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public o0O0000O(@NotNull oOO00O textDelegate, @NotNull o0O0OOO0 recomposeScope) {
        Intrinsics.checkNotNullParameter(textDelegate, "textDelegate");
        Intrinsics.checkNotNullParameter(recomposeScope, "recomposeScope");
        this.f3319OooO00o = textDelegate;
        this.f3320OooO0O0 = recomposeScope;
        this.f3321OooO0OO = new o000OOo0();
        Boolean bool = Boolean.FALSE;
        this.f3324OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f3325OooO0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(null);
        this.f3326OooO0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(HandleState.None);
        this.f3327OooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f3328OooOO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f3329OooOO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f3331OooOOO0 = new o000O00();
        this.f3330OooOOO = OooO0OO.f3337Oooo0o;
        this.f3332OooOOOO = new OooO0O0();
        this.f3333OooOOOo = new OooO00o();
        this.f3334OooOOo0 = new Oooo0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HandleState OooO00o() {
        return (HandleState) this.f3326OooO0oo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0O0() {
        return ((Boolean) this.f3324OooO0o0.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final o0O000 OooO0OO() {
        return (o0O000) this.f3325OooO0oO.getValue();
    }

    public final void OooO0Oo(@NotNull HandleState handleState) {
        Intrinsics.checkNotNullParameter(handleState, "<set-?>");
        this.f3326OooO0oo.setValue(handleState);
    }
}
