package p662o0oooO;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p664o0oooO00.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51599OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f51600OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List f51601OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(String str, o00oOoo o00oooo2, int i, List list) {
        super(str, true);
        this.f51600OooO0o0 = o00oooo2;
        this.f51599OooO0o = i;
        this.f51601OooO0oO = list;
    }

    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        oo0o0O0 oo0o0o0 = this.f51600OooO0o0.f51671OoooOOo;
        List requestHeaders = this.f51601OooO0oO;
        Objects.requireNonNull(oo0o0o0);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        try {
            this.f51600OooO0o0.f51686o0OoOo0.OooO0oo(this.f51599OooO0o, ErrorCode.CANCEL);
            synchronized (this.f51600OooO0o0) {
                this.f51600OooO0o0.f51685o00O0O.remove(Integer.valueOf(this.f51599OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
