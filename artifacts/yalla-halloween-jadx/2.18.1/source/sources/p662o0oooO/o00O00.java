package p662o0oooO;

import java.io.IOException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p664o0oooO00.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f51567OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00oOoo.OooO f51568OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f51569OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(String str, o00oOoo.OooO oooO, o00O0OOO o00o0ooo2) {
        super(str, true);
        this.f51568OooO0o0 = oooO;
        this.f51569OooO0oO = o00o0ooo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, o0oooO.o00O0O0>] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, o0oooO.o00O0OOO] */
    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        ?? r2;
        int i;
        T t;
        o00oOoo.OooO oooO = this.f51568OooO0o0;
        boolean z = this.f51567OooO0o;
        o00O0OOO settings = this.f51569OooO0oO;
        Objects.requireNonNull(oooO);
        Intrinsics.checkNotNullParameter(settings, "settings");
        Ref.LongRef longRef = new Ref.LongRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        synchronized (oooO.f51689Oooo0oO.f51686o0OoOo0) {
            synchronized (oooO.f51689Oooo0oO) {
                o00O0OOO o00o0ooo2 = oooO.f51689Oooo0oO.f51678OooooOO;
                if (z) {
                    r2 = settings;
                } else {
                    o00O0OOO o00o0ooo3 = new o00O0OOO();
                    o00o0ooo3.OooO0O0(o00o0ooo2);
                    o00o0ooo3.OooO0O0(settings);
                    Unit unit = Unit.INSTANCE;
                    r2 = o00o0ooo3;
                }
                objectRef2.element = r2;
                long jOooO00o = ((long) r2.OooO00o()) - ((long) o00o0ooo2.OooO00o());
                longRef.element = jOooO00o;
                if (jOooO00o == 0 || oooO.f51689Oooo0oO.f51664Oooo0oo.isEmpty()) {
                    t = 0;
                } else {
                    Object[] array = oooO.f51689Oooo0oO.f51664Oooo0oo.values().toArray(new o00O0O0[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    t = (o00O0O0[]) array;
                }
                objectRef.element = t;
                o00oOoo o00oooo2 = oooO.f51689Oooo0oO;
                o00O0OOO o00o0ooo4 = (o00O0OOO) objectRef2.element;
                Objects.requireNonNull(o00oooo2);
                Intrinsics.checkNotNullParameter(o00o0ooo4, "<set-?>");
                o00oooo2.f51678OooooOO = o00o0ooo4;
                oooO.f51689Oooo0oO.f51670OoooOOO.OooO0OO(new o00O000(oooO.f51689Oooo0oO.f51661Oooo + " onSettings", oooO, objectRef2), 0L);
                Unit unit2 = Unit.INSTANCE;
            }
            try {
                oooO.f51689Oooo0oO.f51686o0OoOo0.OooO00o((o00O0OOO) objectRef2.element);
            } catch (IOException e) {
                o00oOoo.OooO00o(oooO.f51689Oooo0oO, e);
            }
            Unit unit3 = Unit.INSTANCE;
        }
        o00O0O0[] o00o0o0Arr = (o00O0O0[]) objectRef.element;
        if (o00o0o0Arr == null) {
            return -1L;
        }
        Intrinsics.checkNotNull(o00o0o0Arr);
        for (o00O0O0 o00o0o0 : o00o0o0Arr) {
            synchronized (o00o0o0) {
                long j = longRef.element;
                o00o0o0.f51609OooO0Oo += j;
                if (j > 0) {
                    o00o0o0.notifyAll();
                }
                Unit unit4 = Unit.INSTANCE;
            }
        }
        return -1L;
    }
}
