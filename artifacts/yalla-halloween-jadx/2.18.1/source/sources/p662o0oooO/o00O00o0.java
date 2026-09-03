package p662o0oooO;

import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p664o0oooO00.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51602OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f51603OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ErrorCode f51604OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(String str, o00oOoo o00oooo2, int i, ErrorCode errorCode) {
        super(str, true);
        this.f51603OooO0o0 = o00oooo2;
        this.f51602OooO0o = i;
        this.f51604OooO0oO = errorCode;
    }

    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        oo0o0O0 oo0o0o0 = this.f51603OooO0o0.f51671OoooOOo;
        ErrorCode errorCode = this.f51604OooO0oO;
        Objects.requireNonNull(oo0o0o0);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this.f51603OooO0o0) {
            this.f51603OooO0o0.f51685o00O0O.remove(Integer.valueOf(this.f51602OooO0o));
            Unit unit = Unit.INSTANCE;
        }
        return -1L;
    }
}
