package p651o0ooo00O;

import com.google.gson.internal.o00O0O;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000 extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59855OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f59856OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ErrorCode f59857OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(String str, o000OOo o000ooo2, int i, ErrorCode errorCode) {
        super(str, true);
        this.f59856OooO0o0 = o000ooo2;
        this.f59855OooO0o = i;
        this.f59857OooO0oO = errorCode;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        o00O0O o00o0o2 = this.f59856OooO0o0.f59949OooOOOO;
        ErrorCode errorCode = this.f59857OooO0oO;
        o00o0o2.getClass();
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this.f59856OooO0o0) {
            this.f59856OooO0o0.f59964OooOooO.remove(Integer.valueOf(this.f59855OooO0o));
            Unit unit = Unit.INSTANCE;
        }
        return -1L;
    }
}
