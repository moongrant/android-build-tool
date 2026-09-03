package oOO00O;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;
import p069o0000ooO.o0OO00O;
import p113o00O00Oo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0Oo0oo> f60836OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char f60837OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f60838OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f60839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f60840OooO0o0;

    public OooO0OO(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f60836OooO00o = arrayList;
        this.f60837OooO0O0 = c;
        this.f60838OooO0OO = d;
        this.f60839OooO0Oo = str;
        this.f60840OooO0o0 = str2;
    }

    public static int OooO00o(String str, char c, String str2) {
        return str2.hashCode() + o0OO00O.OooO00o(str, (c + 0) * 31, 31);
    }

    public final int hashCode() {
        return OooO00o(this.f60840OooO0o0, this.f60837OooO0O0, this.f60839OooO0Oo);
    }
}
