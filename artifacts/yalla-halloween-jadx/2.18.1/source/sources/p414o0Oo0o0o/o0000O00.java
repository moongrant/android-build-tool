package p414o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.util.Objects;
import p413o0Oo0o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f39481Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f39482Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O00(o00000O0 o00000o1, Object[] objArr, int i, ErrorCode errorCode) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f39482Oooo0oo = o00000o1;
        this.f39481Oooo0oO = i;
    }

    @Override // p413o0Oo0o0O.o0Oo0oo
    public final void OooO00o() {
        Objects.requireNonNull(this.f39482Oooo0oo.f39443OoooOOO);
        synchronized (this.f39482Oooo0oo) {
            this.f39482Oooo0oo.f39452OooooOo.remove(Integer.valueOf(this.f39481Oooo0oO));
        }
    }
}
