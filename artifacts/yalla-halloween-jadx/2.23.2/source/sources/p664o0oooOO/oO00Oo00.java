package p664o0oooOO;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes5.dex */
public final class oO00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f59886OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadMode f59887OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class<?> f59888OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f59889OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f59890OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f59891OooO0o0;

    public oO00Oo00(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f59886OooO00o = method;
        this.f59887OooO0O0 = threadMode;
        this.f59888OooO0OO = cls;
        this.f59889OooO0Oo = i;
        this.f59891OooO0o0 = z;
    }

    public final synchronized void OooO00o() {
        if (this.f59890OooO0o == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f59886OooO00o.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f59886OooO00o.getName());
            sb.append('(');
            sb.append(this.f59888OooO0OO.getName());
            this.f59890OooO0o = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oO00Oo00)) {
            return false;
        }
        OooO00o();
        oO00Oo00 oo00oo00 = (oO00Oo00) obj;
        oo00oo00.OooO00o();
        return this.f59890OooO0o.equals(oo00oo00.f59890OooO0o);
    }

    public final int hashCode() {
        return this.f59886OooO00o.hashCode();
    }
}
