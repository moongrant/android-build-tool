package p225o00oOOo;

import androidx.annotation.RestrictTo;
import java.util.List;
import p086o000OooO.o0O0O00;
import p125o00O0o0O.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<o0000Ooo> f33856OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char f33857OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f33858OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f33859OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f33860OooO0o0;

    public o00O0OO(List list, char c, double d, String str, String str2) {
        this.f33856OooO00o = list;
        this.f33857OooO0O0 = c;
        this.f33858OooO0OO = d;
        this.f33859OooO0Oo = str;
        this.f33860OooO0o0 = str2;
    }

    public static int OooO00o(char c, String str, String str2) {
        return str2.hashCode() + o0O0O00.OooO00o(str, (c + 0) * 31, 31);
    }

    public final int hashCode() {
        return OooO00o(this.f33857OooO0O0, this.f33860OooO0o0, this.f33859OooO0Oo);
    }
}
