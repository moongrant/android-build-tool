package p660o0oooO0O;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f60307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadMode f60308OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Class<?> f60309OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f60310OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public String f60311OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f60312OooO0o0;

    public o0oOO(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f60307OooO00o = method;
        this.f60308OooO0O0 = threadMode;
        this.f60309OooO0OO = cls;
        this.f60310OooO0Oo = i;
        this.f60312OooO0o0 = z;
    }

    public final synchronized void OooO00o() {
        if (this.f60311OooO0o == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f60307OooO00o.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f60307OooO00o.getName());
            sb.append('(');
            sb.append(this.f60309OooO0OO.getName());
            this.f60311OooO0o = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0oOO)) {
            return false;
        }
        OooO00o();
        o0oOO o0ooo2 = (o0oOO) obj;
        o0ooo2.OooO00o();
        return this.f60311OooO0o.equals(o0ooo2.f60311OooO0o);
    }

    public final int hashCode() {
        return this.f60307OooO00o.hashCode();
    }
}
