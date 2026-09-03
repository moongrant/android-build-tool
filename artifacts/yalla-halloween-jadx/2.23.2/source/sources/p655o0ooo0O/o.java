package p655o0ooo0O;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p652o0ooo000.o00000O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f59414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f59415OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f59416OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, o0OOo000 o0ooo001, int i, oo0OOoo oo0oooo, int i2, boolean z) {
        super(str, true);
        this.f59414OooO0o0 = o0ooo001;
        this.f59413OooO0o = i;
        this.f59415OooO0oO = oo0oooo;
        this.f59416OooO0oo = i2;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        try {
            oO0o0o oo0o0o = this.f59414OooO0o0.f59462OooOOOO;
            oo0OOoo source = this.f59415OooO0oO;
            int i = this.f59416OooO0oo;
            oo0o0o.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i);
            this.f59414OooO0o0.f59476OooOoo0.OooOo00(this.f59413OooO0o, ErrorCode.CANCEL);
            synchronized (this.f59414OooO0o0) {
                this.f59414OooO0o0.f59477OooOooO.remove(Integer.valueOf(this.f59413OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
