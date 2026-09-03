package p265o00oooOo;

import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00oO0 implements Iterable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CharSequence f41078OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzx f41079OooO0o0;

    public o0O00oO0(zzx zzxVar, CharSequence charSequence) {
        this.f41079OooO0o0 = zzxVar;
        this.f41078OooO0Oo = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zzx zzxVar = this.f41079OooO0o0;
        return new o0oO0Ooo(zzxVar.f15365OooO0OO, zzxVar, this.f41078OooO0Oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (((o0O0O0O) it).hasNext()) {
                Object objOooO0O0 = ((o0O0O0O) it).next();
                objOooO0O0.getClass();
                sb.append(objOooO0O0 instanceof CharSequence ? (CharSequence) objOooO0O0 : objOooO0O0.toString());
                while (((o0O0O0O) it).hasNext()) {
                    sb.append((CharSequence) ", ");
                    Object objOooO0O1 = ((o0O0O0O) it).next();
                    objOooO0O1.getClass();
                    sb.append(objOooO0O1 instanceof CharSequence ? (CharSequence) objOooO0O1 : objOooO0O1.toString());
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
