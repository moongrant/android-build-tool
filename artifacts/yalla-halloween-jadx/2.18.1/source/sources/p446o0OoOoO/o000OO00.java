package p446o0OoOoO;

import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements Iterable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ CharSequence f40265Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzx f40266Oooo0oO;

    public o000OO00(zzx zzxVar, CharSequence charSequence) {
        this.f40266Oooo0oO = zzxVar;
        this.f40265Oooo0o = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zzx zzxVar = this.f40266Oooo0oO;
        return new o000O(zzxVar.f15877OooO0OO, zzxVar, this.f40265Oooo0o);
    }

    public final String toString() {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('[');
        try {
            o000OOo0 o000ooo1 = (o000OOo0) iterator();
            if (o000ooo1.hasNext()) {
                Object next = o000ooo1.next();
                Objects.requireNonNull(next);
                sbOooO00o.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (o000ooo1.hasNext()) {
                    sbOooO00o.append((CharSequence) ", ");
                    Object next2 = o000ooo1.next();
                    Objects.requireNonNull(next2);
                    sbOooO00o.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            sbOooO00o.append(']');
            return sbOooO00o.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
