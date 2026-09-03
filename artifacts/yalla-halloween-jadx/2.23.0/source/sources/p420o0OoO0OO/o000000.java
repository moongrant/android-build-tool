package p420o0OoO0OO;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import o0OoO.OooO00o;
import p423o0OoO0o0.Oooo0;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo0oOO0;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile o000000 f45541OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00OOOO0 f45542OooO00o = new o00OOOO0(new o00OOOO0.OooO00o());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f45543OooO0O0 = OooO00o.f45430OooO00o;

    public static o000000 OooO0O0() {
        if (f45541OooO0OO == null) {
            synchronized (o000000.class) {
                if (f45541OooO0OO == null) {
                    f45541OooO0OO = new o000000();
                }
            }
        }
        return f45541OooO0OO;
    }

    public final void OooO00o(String str) {
        List<o00O00o0> listUnmodifiableList;
        oo0oOO0 oo0ooo0 = this.f45542OooO00o.f57256OooO0Oo;
        synchronized (oo0ooo0) {
            ArrayDeque<oO0Oo0oo.OooO00o> arrayDeque = oo0ooo0.f57382OooO0O0;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque, 10));
            Iterator<oO0Oo0oo.OooO00o> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f59671OooO0o);
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        }
        for (o00O00o0 o00o00o1 : listUnmodifiableList) {
            o00OOOOo o00oooooOooO00o = o00o00o1.OooO00o();
            o00oooooOooO00o.getClass();
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (str.equals(Object.class.cast(o00oooooOooO00o.f57318OooO0o0.get(Object.class)))) {
                o00o00o1.cancel();
            }
        }
        for (o00O00o0 o00o00o2 : this.f45542OooO00o.f57256OooO0Oo.OooO0oo()) {
            o00OOOOo o00oooooOooO00o2 = o00o00o2.OooO00o();
            o00oooooOooO00o2.getClass();
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (str.equals(Object.class.cast(o00oooooOooO00o2.f57318OooO0o0.get(Object.class)))) {
                o00o00o2.cancel();
            }
        }
    }

    public final void OooO0OO(oO0Oo0oo oo0oo0oo, Exception exc, Oooo0 oooo0, int i, String str, int i2) {
        if (oooo0 == null) {
            return;
        }
        this.f45543OooO0O0.OooO00o().execute(new o0O0O00(oooo0, oo0oo0oo, exc, i2, i, str));
    }
}
