package p655o0ooo0O;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0000O extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f59521OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ ErrorCode f59522OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(String str, o0OOo000 o0ooo001, int i, ErrorCode errorCode) {
        super(str, true);
        this.f59521OooO0o0 = o0ooo001;
        this.f59520OooO0o = i;
        this.f59522OooO0oO = errorCode;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        oO0o0o oo0o0o = this.f59521OooO0o0.f59462OooOOOO;
        ErrorCode errorCode = this.f59522OooO0oO;
        oo0o0o.getClass();
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this.f59521OooO0o0) {
            this.f59521OooO0o0.f59477OooOooO.remove(Integer.valueOf(this.f59520OooO0o));
            Unit unit = Unit.INSTANCE;
        }
        return -1L;
    }
}
