package p319o0O0oOo0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.trackselection.OooO0OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f36751OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000O0Oo[] f36752OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O f36753OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Object f36754OooO0Oo;

    public o000(o000O0Oo[] o000o0ooArr, OooO0OO[] oooO0OOArr, @Nullable Object obj) {
        this.f36752OooO0O0 = o000o0ooArr;
        this.f36753OooO0OO = new o0000O(oooO0OOArr);
        this.f36754OooO0Oo = obj;
        this.f36751OooO00o = o000o0ooArr.length;
    }

    public final boolean OooO00o(@Nullable o000 o000Var, int i) {
        return o000Var != null && o000OOo0.OooO00o(this.f36752OooO0O0[i], o000Var.f36752OooO0O0[i]) && o000OOo0.OooO00o(this.f36753OooO0OO.f36756OooO0O0[i], o000Var.f36753OooO0OO.f36756OooO0O0[i]);
    }

    public final boolean OooO0O0(int i) {
        return this.f36752OooO0O0[i] != null;
    }
}
