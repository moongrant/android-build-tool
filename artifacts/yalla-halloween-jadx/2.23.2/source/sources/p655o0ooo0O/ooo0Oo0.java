package p655o0ooo0O;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class ooo0Oo0 extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f59575OooO0o = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000.OooO0OO f59576OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0Oo0oo f59577OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(String str, o0OOo000.OooO0OO oooO0OO, oO0Oo0oo oo0oo0oo) {
        super(str, true);
        this.f59576OooO0o0 = oooO0OO;
        this.f59577OooO0oO = oo0oo0oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, o0ooo0O.oO0Oo0oo] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        ?? r2;
        long jOooO00o;
        int i;
        oO000O0[] oo000o0Arr;
        o0OOo000.OooO0OO oooO0OO = this.f59576OooO0o0;
        boolean z = this.f59575OooO0o;
        oO0Oo0oo settings = this.f59577OooO0oO;
        oooO0OO.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        o0OOo000 o0ooo001 = oooO0OO.f59492OooO0o0;
        synchronized (o0ooo001.f59476OooOoo0) {
            synchronized (o0ooo001) {
                oO0Oo0oo oo0oo0oo = o0ooo001.f59470OooOo0O;
                if (z) {
                    r2 = settings;
                } else {
                    oO0Oo0oo oo0oo0oo2 = new oO0Oo0oo();
                    oo0oo0oo2.OooO0O0(oo0oo0oo);
                    oo0oo0oo2.OooO0O0(settings);
                    r2 = oo0oo0oo2;
                }
                objectRef.element = r2;
                jOooO00o = ((long) r2.OooO00o()) - ((long) oo0oo0oo.OooO00o());
                i = 0;
                if (jOooO00o == 0 || o0ooo001.f59453OooO0o.isEmpty()) {
                    oo000o0Arr = null;
                } else {
                    Object[] array = o0ooo001.f59453OooO0o.values().toArray(new oO000O0[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    oo000o0Arr = (oO000O0[]) array;
                }
                oO0Oo0oo oo0oo0oo3 = (oO0Oo0oo) objectRef.element;
                Intrinsics.checkNotNullParameter(oo0oo0oo3, "<set-?>");
                o0ooo001.f59470OooOo0O = oo0oo0oo3;
                o0ooo001.f59460OooOOO.OooO0OO(new o0o0000(Intrinsics.stringPlus(o0ooo001.f59455OooO0oO, " onSettings"), o0ooo001, objectRef), 0L);
                Unit unit = Unit.INSTANCE;
            }
            try {
                o0ooo001.f59476OooOoo0.OooO00o((oO0Oo0oo) objectRef.element);
            } catch (IOException e) {
                o0ooo001.OooO0OO(e);
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (oo000o0Arr == null) {
            return -1L;
        }
        int length = oo000o0Arr.length;
        while (i < length) {
            oO000O0 oo000o0 = oo000o0Arr[i];
            i++;
            synchronized (oo000o0) {
                oo000o0.f59537OooO0o += jOooO00o;
                if (jOooO00o > 0) {
                    oo000o0.notifyAll();
                }
                Unit unit3 = Unit.INSTANCE;
            }
        }
        return -1L;
    }
}
