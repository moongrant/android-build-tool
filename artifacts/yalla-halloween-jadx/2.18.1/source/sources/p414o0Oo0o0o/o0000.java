package p414o0Oo0o0o;

import com.squareup.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.Objects;
import p413o0Oo0o0O.o0Oo0oo;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f39424Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f39425Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0oOO f39426Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f39427OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(o00000O0 o00000o1, Object[] objArr, int i, o0oOO o0ooo2, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.f39427OoooO00 = o00000o1;
        this.f39425Oooo0oO = i;
        this.f39426Oooo0oo = o0ooo2;
        this.f39424Oooo = i2;
    }

    @Override // p413o0Oo0o0O.o0Oo0oo
    public final void OooO00o() {
        try {
            o000O00 o000o01 = this.f39427OoooO00.f39443OoooOOO;
            o0oOO o0ooo2 = this.f39426Oooo0oo;
            int i = this.f39424Oooo;
            Objects.requireNonNull((o000O00.OooO00o) o000o01);
            o0ooo2.skip(i);
            this.f39427OoooO00.f39451OooooOO.o00Ooo(this.f39425Oooo0oO, ErrorCode.CANCEL);
            synchronized (this.f39427OoooO00) {
                this.f39427OoooO00.f39452OooooOo.remove(Integer.valueOf(this.f39425Oooo0oO));
            }
        } catch (IOException unused) {
        }
    }
}
