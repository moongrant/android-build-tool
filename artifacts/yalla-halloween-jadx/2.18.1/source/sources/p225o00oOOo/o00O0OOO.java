package p225o00oOOo;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00O0OOO f33864OooO0OO = new o00O0OOO("COMPOSITION");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f33865OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public oo0oOO0 f33866OooO0O0;

    public o00O0OOO(String... strArr) {
        this.f33865OooO00o = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o00O0OOO OooO00o(String str) {
        o00O0OOO o00o0ooo2 = new o00O0OOO(this);
        o00o0ooo2.f33865OooO00o.add(str);
        return o00o0ooo2;
    }

    public final boolean OooO0O0() {
        List<String> list = this.f33865OooO00o;
        return list.get(list.size() - 1).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO0OO(String str, int i) {
        if (i >= this.f33865OooO00o.size()) {
            return false;
        }
        boolean z = i == this.f33865OooO00o.size() - 1;
        String str2 = this.f33865OooO00o.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f33865OooO00o.size() + (-2) && OooO0O0())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f33865OooO00o.get(i + 1).equals(str)) {
            return i == this.f33865OooO00o.size() + (-2) || (i == this.f33865OooO00o.size() + (-3) && OooO0O0());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.f33865OooO00o.size() - 1) {
            return false;
        }
        return this.f33865OooO00o.get(i2).equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int OooO0Oo(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.f33865OooO00o.get(i).equals("**")) {
            return (i != this.f33865OooO00o.size() - 1 && this.f33865OooO00o.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO0o(String str, int i) {
        return "__container".equals(str) || i < this.f33865OooO00o.size() - 1 || this.f33865OooO00o.get(i).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO0o0(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.f33865OooO00o.size()) {
            return false;
        }
        return this.f33865OooO00o.get(i).equals(str) || this.f33865OooO00o.get(i).equals("**") || this.f33865OooO00o.get(i).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o00O0OOO OooO0oO(oo0oOO0 oo0ooo0) {
        o00O0OOO o00o0ooo2 = new o00O0OOO(this);
        o00o0ooo2.f33866OooO0O0 = oo0ooo0;
        return o00o0ooo2;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("KeyPath{keys=");
        sbOooO0o0.append(this.f33865OooO00o);
        sbOooO0o0.append(",resolved=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f33866OooO0O0 != null, '}');
    }

    public o00O0OOO(o00O0OOO o00o0ooo2) {
        this.f33865OooO00o = new ArrayList(o00o0ooo2.f33865OooO00o);
        this.f33866OooO0O0 = o00o0ooo2.f33866OooO0O0;
    }
}
