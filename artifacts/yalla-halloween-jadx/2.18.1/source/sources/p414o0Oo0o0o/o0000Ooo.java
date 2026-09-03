package p414o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import p413o0Oo0o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f39526Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f39527Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ List f39528Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(o00000O0 o00000o1, Object[] objArr, int i, List list, boolean z) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f39526Oooo = o00000o1;
        this.f39527Oooo0oO = i;
        this.f39528Oooo0oo = list;
    }

    @Override // p413o0Oo0o0O.o0Oo0oo
    public final void OooO00o() {
        Objects.requireNonNull(this.f39526Oooo.f39443OoooOOO);
        try {
            this.f39526Oooo.f39451OooooOO.o00Ooo(this.f39527Oooo0oO, ErrorCode.CANCEL);
            synchronized (this.f39526Oooo) {
                this.f39526Oooo.f39452OooooOo.remove(Integer.valueOf(this.f39527Oooo0oO));
            }
        } catch (IOException unused) {
        }
    }
}
