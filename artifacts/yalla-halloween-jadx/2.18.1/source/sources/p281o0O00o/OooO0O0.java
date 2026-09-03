package p281o0O00o;

import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o00OOO00;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooOo00.OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35157OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35158OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35159OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35160OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f35161OooO0oO;

    public static final class OooO extends Lambda implements Function0<OooOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO0O0[] f35162Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OooOo00.OooO0O0[] oooO0O0Arr) {
            super(0);
            this.f35162Oooo0o = oooO0O0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0 invoke() {
            OooOo00.OooO0O0[] oooO0O0Arr = this.f35162Oooo0o;
            Objects.requireNonNull(OooOO0.f35177OooO00o);
            OooOO0 oooOO0OooO00o = OooOO0.OooO00o.f35179OooO0O0;
            for (OooOo00.OooO0O0 oooO0O0 : oooO0O0Arr) {
                oooOO0OooO00o = OooOO0O.OooO00o(oooOO0OooO00o, oooO0O0);
            }
            return oooOO0OooO00o;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<OooOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO0O0[] f35163Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOo00.OooO0O0[] oooO0O0Arr) {
            super(0);
            this.f35163Oooo0o = oooO0O0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooOO0 invoke() {
            OooOo00.OooO0O0[] oooO0O0Arr = this.f35163Oooo0o;
            Objects.requireNonNull(OooOO0.f35177OooO00o);
            OooOO0 oooOO0OooO00o = OooOO0.OooO00o.f35179OooO0O0;
            for (OooOo00.OooO0O0 oooO0O0 : oooO0O0Arr) {
                oooOO0OooO00o = OooOO0O.OooO00o(oooOO0OooO00o, oooO0O0);
            }
            return oooOO0OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0O00o.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0358OooO0O0 extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO0O0[] f35164Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0358OooO0O0(OooOo00.OooO0O0[] oooO0O0Arr) {
            super(0);
            this.f35164Oooo0o = oooO0O0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            OooOo00.OooO0O0[] oooO0O0Arr = this.f35164Oooo0o;
            int i = 1;
            if (oooO0O0Arr.length == 0) {
                throw new NoSuchElementException();
            }
            float fOooO0OO = oooO0O0Arr[0].OooO0OO();
            int lastIndex = ArraysKt.getLastIndex(oooO0O0Arr);
            if (1 <= lastIndex) {
                while (true) {
                    fOooO0OO = Math.max(fOooO0OO, oooO0O0Arr[i].OooO0OO());
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return Float.valueOf(fOooO0OO);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO0O0[] f35165Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooOo00.OooO0O0[] oooO0O0Arr) {
            super(0);
            this.f35165Oooo0o = oooO0O0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z = false;
            for (OooOo00.OooO0O0 oooO0O0 : this.f35165Oooo0o) {
                if (oooO0O0.OooO0Oo()) {
                    z = true;
                    break;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO0O0[] f35166Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OooOo00.OooO0O0[] oooO0O0Arr) {
            super(0);
            this.f35166Oooo0o = oooO0O0Arr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z = false;
            for (OooOo00.OooO0O0 oooO0O0 : this.f35166Oooo0o) {
                if (!oooO0O0.isVisible()) {
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
    }

    public OooO0O0(@NotNull OooOo00.OooO0O0... types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f35157OooO0OO = (o00OOO00) o0OOO00.OooO0O0(new OooO(types));
        this.f35158OooO0Oo = (o00OOO00) o0OOO00.OooO0O0(new OooO00o(types));
        this.f35160OooO0o0 = (o00OOO00) o0OOO00.OooO0O0(new OooO0o(types));
        this.f35159OooO0o = (o00OOO00) o0OOO00.OooO0O0(new OooO0OO(types));
        this.f35161OooO0oO = (o00OOO00) o0OOO00.OooO0O0(new C0358OooO0O0(types));
    }

    @Override // o0O00o.OooOo00.OooO0O0
    @NotNull
    public final OooOO0 OooO00o() {
        return (OooOO0) this.f35158OooO0Oo.getValue();
    }

    @Override // o0O00o.OooOo00.OooO0O0
    @NotNull
    public final OooOO0 OooO0O0() {
        return (OooOO0) this.f35157OooO0OO.getValue();
    }

    @Override // o0O00o.OooOo00.OooO0O0
    public final float OooO0OO() {
        return ((Number) this.f35161OooO0oO.getValue()).floatValue();
    }

    @Override // o0O00o.OooOo00.OooO0O0
    public final boolean OooO0Oo() {
        return ((Boolean) this.f35159OooO0o.getValue()).booleanValue();
    }

    @Override // p281o0O00o.OooOO0
    public final int OooO0o0() {
        return (OooO0Oo() ? OooO00o() : OooO0O0()).OooO0o0();
    }

    @Override // p281o0O00o.OooOO0
    public final int OooO0oO() {
        return (OooO0Oo() ? OooO00o() : OooO0O0()).OooO0oO();
    }

    @Override // p281o0O00o.OooOO0
    public final int OooOO0O() {
        return (OooO0Oo() ? OooO00o() : OooO0O0()).OooOO0O();
    }

    @Override // p281o0O00o.OooOO0
    public final int OooOOO() {
        return (OooO0Oo() ? OooO00o() : OooO0O0()).OooOOO();
    }

    @Override // o0O00o.OooOo00.OooO0O0
    public final boolean isVisible() {
        return ((Boolean) this.f35160OooO0o0.getValue()).booleanValue();
    }
}
