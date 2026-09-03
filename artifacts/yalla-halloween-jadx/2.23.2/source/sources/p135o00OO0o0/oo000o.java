package p135o00OO0o0;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.OooO0O0;
import java.util.ArrayList;
import java.util.List;
import p136o00OO0oO.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<OooOo> f37336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final char f37337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f37338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f37339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f37340OooO0o0;

    public oo000o(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f37336OooO00o = arrayList;
        this.f37337OooO0O0 = c;
        this.f37338OooO0OO = d;
        this.f37339OooO0Oo = str;
        this.f37340OooO0o0 = str2;
    }

    public static int OooO00o(String str, char c, String str2) {
        return str2.hashCode() + OooO0O0.OooO00o(str, (c + 0) * 31, 31);
    }

    public final int hashCode() {
        return OooO00o(this.f37340OooO0o0, this.f37337OooO0O0, this.f37339OooO0Oo);
    }
}
