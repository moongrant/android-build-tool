package p662o0oooO;

import java.io.IOException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p664o0oooO00.oo0o0Oo;
import p674o0oooo0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00O extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f51595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00oOoo f51596OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0oOO f51597OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f51598OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(String str, o00oOoo o00oooo2, int i, o0oOO o0ooo2, int i2, boolean z) {
        super(str, true);
        this.f51596OooO0o0 = o00oooo2;
        this.f51595OooO0o = i;
        this.f51597OooO0oO = o0ooo2;
        this.f51598OooO0oo = i2;
    }

    @Override // p664o0oooO00.oo0o0Oo
    public final long OooO00o() {
        try {
            oo0o0O0 oo0o0o0 = this.f51596OooO0o0.f51671OoooOOo;
            o0oOO source = this.f51597OooO0oO;
            int i = this.f51598OooO0oo;
            Objects.requireNonNull(oo0o0o0);
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i);
            this.f51596OooO0o0.f51686o0OoOo0.OooO0oo(this.f51595OooO0o, ErrorCode.CANCEL);
            synchronized (this.f51596OooO0o0) {
                this.f51596OooO0o0.f51685o00O0O.remove(Integer.valueOf(this.f51595OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
