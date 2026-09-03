package p651o0ooo00O;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000O0 extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f59869OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo.OooO0OO f59870OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f59871OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(String str, o000OOo.OooO0OO oooO0OO, o000 o000Var) {
        super(str, true);
        this.f59870OooO0o0 = oooO0OO;
        this.f59871OooO0oO = o000Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, o0ooo00O.o000] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        ?? r2;
        long jOooO00o;
        int i;
        o0000O0O[] o0000o0oArr;
        o000OOo.OooO0OO oooO0OO = this.f59870OooO0o0;
        boolean z = this.f59869OooO0o;
        o000 settings = this.f59871OooO0oO;
        oooO0OO.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        o000OOo o000ooo2 = oooO0OO.f59979OooO0o0;
        synchronized (o000ooo2.f59963OooOoo0) {
            synchronized (o000ooo2) {
                o000 o000Var = o000ooo2.f59957OooOo0O;
                if (z) {
                    r2 = settings;
                } else {
                    o000 o000Var2 = new o000();
                    o000Var2.OooO0O0(o000Var);
                    o000Var2.OooO0O0(settings);
                    r2 = o000Var2;
                }
                objectRef.element = r2;
                jOooO00o = ((long) r2.OooO00o()) - ((long) o000Var.OooO00o());
                i = 0;
                if (jOooO00o == 0 || o000ooo2.f59940OooO0o.isEmpty()) {
                    o0000o0oArr = null;
                } else {
                    Object[] array = o000ooo2.f59940OooO0o.values().toArray(new o0000O0O[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o0000o0oArr = (o0000O0O[]) array;
                }
                o000 o000Var3 = (o000) objectRef.element;
                Intrinsics.checkNotNullParameter(o000Var3, "<set-?>");
                o000ooo2.f59957OooOo0O = o000Var3;
                o000ooo2.f59947OooOOO.OooO0OO(new o000000(Intrinsics.stringPlus(o000ooo2.f59942OooO0oO, " onSettings"), o000ooo2, objectRef), 0L);
                Unit unit = Unit.INSTANCE;
            }
            try {
                o000ooo2.f59963OooOoo0.OooO00o((o000) objectRef.element);
            } catch (IOException e) {
                o000ooo2.OooO0OO(e);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (o0000o0oArr == null) {
            return -1L;
        }
        int length = o0000o0oArr.length;
        while (i < length) {
            o0000O0O o0000o0o2 = o0000o0oArr[i];
            i++;
            synchronized (o0000o0o2) {
                o0000o0o2.f59898OooO0o += jOooO00o;
                if (jOooO00o > 0) {
                    o0000o0o2.notifyAll();
                }
                Unit unit3 = Unit.INSTANCE;
            }
        }
        return -1L;
    }
}
