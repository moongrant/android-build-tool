package oOO00O;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0o f60841OooO0OO = new OooO0o("COMPOSITION");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<String> f60842OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public OooO f60843OooO0O0;

    public OooO0o(String... strArr) {
        this.f60842OooO00o = Arrays.asList(strArr);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO00o(int i, String str) {
        List<String> list = this.f60842OooO00o;
        if (i >= list.size()) {
            return false;
        }
        boolean z = i == list.size() - 1;
        String str2 = list.get(i);
        if (!str2.equals("**")) {
            return (z || (i == list.size() + (-2) && list.get(list.size() + (-1)).equals("**"))) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && list.get(i + 1).equals(str)) {
            return i == list.size() + (-2) || (i == list.size() + (-3) && list.get(list.size() + (-1)).equals("**"));
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < list.size() - 1) {
            return false;
        }
        return list.get(i2).equals(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final int OooO0O0(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.f60842OooO00o;
        if (list.get(i).equals("**")) {
            return (i != list.size() - 1 && list.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO0OO(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f60842OooO00o;
        if (i >= list.size()) {
            return false;
        }
        return list.get(i).equals(str) || list.get(i).equals("**") || list.get(i).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean OooO0Oo(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.f60842OooO00o;
        return i < list.size() - 1 || list.get(i).equals("**");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f60842OooO00o);
        sb.append(",resolved=");
        return androidx.compose.animation.OooO0o.OooO00o(sb, this.f60843OooO0O0 != null, '}');
    }

    public OooO0o(OooO0o oooO0o) {
        this.f60842OooO00o = new ArrayList(oooO0o.f60842OooO00o);
        this.f60843OooO0O0 = oooO0o.f60843OooO0O0;
    }
}
