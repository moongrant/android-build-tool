package p414o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p413o0Oo0o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f39465Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f39466Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ List f39467Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(o00000O0 o00000o1, Object[] objArr, int i, List list) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f39465Oooo = o00000o1;
        this.f39466Oooo0oO = i;
        this.f39467Oooo0oo = list;
    }

    @Override // p413o0Oo0o0O.o0Oo0oo
    public final void OooO00o() {
        Objects.requireNonNull(this.f39465Oooo.f39443OoooOOO);
        try {
            this.f39465Oooo.f39451OooooOO.o00Ooo(this.f39466Oooo0oO, ErrorCode.CANCEL);
            synchronized (this.f39465Oooo) {
                this.f39465Oooo.f39452OooooOo.remove(Integer.valueOf(this.f39466Oooo0oO));
            }
        } catch (IOException unused) {
        }
    }
}
