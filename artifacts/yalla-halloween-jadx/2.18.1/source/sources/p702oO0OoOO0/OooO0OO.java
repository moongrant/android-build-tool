package p702oO0OoOO0;

import OooO00o.OooO00o;
import java.security.PrivilegedAction;
import oO000O0O.OooO0o;
import org.bouncycastle.jcajce.provider.drbg.DRBG;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements PrivilegedAction<OooO0o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f52940OooO00o;

    public OooO0OO(String str) {
        this.f52940OooO00o = str;
    }

    @Override // java.security.PrivilegedAction
    public final OooO0o run() {
        try {
            return (OooO0o) DRBG.class.getClassLoader().loadClass(this.f52940OooO00o).newInstance();
        } catch (Exception e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("entropy source ");
            sbOooO0o0.append(this.f52940OooO00o);
            sbOooO0o0.append(" not created: ");
            sbOooO0o0.append(e.getMessage());
            throw new IllegalStateException(sbOooO0o0.toString(), e);
        }
    }
}
