package p267o00oooOo;

import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0o0o implements Iterable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CharSequence f40416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzx f40417OooO0o0;

    public oO0o0o(zzx zzxVar, CharSequence charSequence) {
        this.f40417OooO0o0 = zzxVar;
        this.f40416OooO0Oo = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zzx zzxVar = this.f40417OooO0o0;
        return new oO000O0O(zzxVar.f14889OooO0OO, zzxVar, this.f40416OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (((oO0OoOO0) it).hasNext()) {
                Object next = ((oO0OoOO0) it).next();
                next.getClass();
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (((oO0OoOO0) it).hasNext()) {
                    sb.append((CharSequence) ", ");
                    Object next2 = ((oO0OoOO0) it).next();
                    next2.getClass();
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
