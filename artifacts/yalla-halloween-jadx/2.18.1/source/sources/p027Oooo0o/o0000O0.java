package p027Oooo0o;

import androidx.compose.foundation.lazy.layout.o00Ooo;
import androidx.compose.foundation.lazy.layout.oo000o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o000Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOOO0;
import p048OoooooO.o00OOOOo;
import p048OoooooO.o0o0Oo;
import p076o000OOo.OooOO0O;
import p076o000OOo.OooOOO;
import p076o000OOo.OooOOOO;
import p076o000OOo.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 implements OooOOO<o00Ooo>, OooOO0O, o00Ooo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f1828Oooo = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o000O00O f1829Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o00O0O f1830Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public o00Ooo f1831Oooo0oo;

    public static final class OooO00o implements o00Ooo.OooO00o {
        @Override // androidx.compose.foundation.lazy.layout.o00Ooo.OooO00o
        public final void OooO00o() {
        }
    }

    public static final class OooO0O0 implements o00Ooo.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final o00Ooo.OooO00o f1832OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o00O0O.OooO00o f1833OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00O0O f1835OooO0Oo;

        public OooO0O0(o00O0O o00o0o2) {
            this.f1835OooO0Oo = o00o0o2;
            o00Ooo o00ooo2 = o0000O0.this.f1831Oooo0oo;
            this.f1832OooO00o = o00ooo2 != null ? o00ooo2.OooO00o() : null;
            this.f1833OooO0O0 = o00o0o2.OooO00o(o00o0o2.OooO0OO(), o00o0o2.OooO0O0());
        }

        @Override // androidx.compose.foundation.lazy.layout.o00Ooo.OooO00o
        public final void OooO00o() {
            this.f1835OooO0Oo.OooO0o0(this.f1833OooO0O0);
            o00Ooo.OooO00o oooO00o = this.f1832OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO00o();
            }
            o000Oo0 o000oo0OooO0oo = o0000O0.this.f1829Oooo0o.OooO0oo();
            if (o000oo0OooO0oo != null) {
                o000oo0OooO0oo.OooO0o0();
            }
        }
    }

    public o0000O0(@NotNull o000O00O state, @NotNull o00O0O beyondBoundsInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        this.f1829Oooo0o = state;
        this.f1830Oooo0oO = beyondBoundsInfo;
    }

    @Override // androidx.compose.foundation.lazy.layout.o00Ooo
    @NotNull
    public final o00Ooo.OooO00o OooO00o() {
        o00Ooo.OooO00o OooO00o2;
        o00O0O o00o0o2 = this.f1830Oooo0oO;
        if (o00o0o2.OooO0Oo()) {
            return new OooO0O0(o00o0o2);
        }
        o00Ooo o00ooo2 = this.f1831Oooo0oo;
        return (o00ooo2 == null || (OooO00o2 = o00ooo2.OooO00o()) == null) ? f1828Oooo : OooO00o2;
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ o00OOOO0 OooOOoo(o00OOOO0 o00oooo1) {
        return o0o0Oo.OooO00o(this, o00oooo1);
    }

    @Override // p076o000OOo.OooOO0O
    public final void OooOooO(@NotNull OooOOOO scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f1831Oooo0oo = (o00Ooo) scope.OooO00o(oo000o.f5848OooO00o);
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object Oooo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // p048OoooooO.o00OOOO0
    public final /* synthetic */ boolean OooooOo(Function1 function1) {
        return o00OOOOo.OooO00o(this, function1);
    }

    @Override // p076o000OOo.OooOOO
    @NotNull
    public final OooOo00<o00Ooo> getKey() {
        return oo000o.f5848OooO00o;
    }

    @Override // p076o000OOo.OooOOO
    public final o00Ooo getValue() {
        return this;
    }

    @Override // p048OoooooO.o00OOOO0
    public final Object o0Oo0oo(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this, obj);
    }
}
