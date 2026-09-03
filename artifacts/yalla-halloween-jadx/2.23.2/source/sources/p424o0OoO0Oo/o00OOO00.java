package p424o0OoO0Oo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p428o0OoO0oo.o00OOOO0;
import p431o0OoOO0o.o000000;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.oo00oO;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile o00OOO00 f46735OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0OoO00O f46736OooO00o = new o0OoO00O(new o0OoO00O.OooO00o());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000 f46737OooO0O0 = o000000.f46841OooO00o;

    public static o00OOO00 OooO0O0() {
        if (f46735OooO0OO == null) {
            synchronized (o00OOO00.class) {
                if (f46735OooO0OO == null) {
                    f46735OooO0OO = new o00OOO00();
                }
            }
        }
        return f46735OooO0OO;
    }

    public final void OooO00o(String str) {
        List<o00OO> listUnmodifiableList;
        oo00oO oo00oo = this.f46736OooO00o.f57885OooO0Oo;
        synchronized (oo00oo) {
            ArrayDeque<o0000O0.OooO00o> arrayDeque = oo00oo.f57966OooO0O0;
            ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(arrayDeque));
            Iterator<o0000O0.OooO00o> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f59323OooO0o);
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        }
        for (o00OO o00oo2 : listUnmodifiableList) {
            o0O00O0o o0o00o0oOooO00o = o00oo2.OooO00o();
            o0o00o0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (str.equals(Object.class.cast(o0o00o0oOooO00o.f57833OooO0o0.get(Object.class)))) {
                o00oo2.cancel();
            }
        }
        for (o00OO o00oo3 : this.f46736OooO00o.f57885OooO0Oo.OooO0oo()) {
            o0O00O0o o0o00o0oOooO00o2 = o00oo3.OooO00o();
            o0o00o0oOooO00o2.getClass();
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (str.equals(Object.class.cast(o0o00o0oOooO00o2.f57833OooO0o0.get(Object.class)))) {
                o00oo3.cancel();
            }
        }
    }

    public final void OooO0OO(o0000O0 o0000o1, Exception exc, o00OOOO0 o00oooo1, int i, String str, int i2) {
        if (o00oooo1 == null) {
            return;
        }
        this.f46737OooO0O0.OooO00o().execute(new oo0O(o00oooo1, o0000o1, exc, i2, i, str));
    }
}
