package oO0OOo0O;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f52834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadMode f52835OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class<?> f52836OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f52837OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f52838OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f52839OooO0o0;

    public OooOOOO(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f52834OooO00o = method;
        this.f52835OooO0O0 = threadMode;
        this.f52836OooO0OO = cls;
        this.f52837OooO0Oo = i;
        this.f52839OooO0o0 = z;
    }

    public final synchronized void OooO00o() {
        if (this.f52838OooO0o == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f52834OooO00o.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f52834OooO00o.getName());
            sb.append('(');
            sb.append(this.f52836OooO0OO.getName());
            this.f52838OooO0o = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooO00o();
        OooOOOO oooOOOO = (OooOOOO) obj;
        oooOOOO.OooO00o();
        return this.f52838OooO0o.equals(oooOOOO.f52838OooO0o);
    }

    public final int hashCode() {
        return this.f52834OooO00o.hashCode();
    }
}
