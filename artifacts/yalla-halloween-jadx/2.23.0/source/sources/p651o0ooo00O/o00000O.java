package p651o0ooo00O;

import com.google.gson.internal.o00O0O;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p639o0ooOO0o.oo0oOO0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00000O extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f59866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ p659o0oooO00.o00000O f59867OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f59868OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(String str, o000OOo o000ooo2, int i, p659o0oooO00.o00000O o00000o, int i2, boolean z) {
        super(str, true);
        this.f59866OooO0o0 = o000ooo2;
        this.f59865OooO0o = i;
        this.f59867OooO0oO = o00000o;
        this.f59868OooO0oo = i2;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        try {
            o00O0O o00o0o2 = this.f59866OooO0o0.f59949OooOOOO;
            p659o0oooO00.o00000O source = this.f59867OooO0oO;
            int i = this.f59868OooO0oo;
            o00o0o2.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.skip(i);
            this.f59866OooO0o0.f59963OooOoo0.OooOOo(this.f59865OooO0o, ErrorCode.CANCEL);
            synchronized (this.f59866OooO0o0) {
                this.f59866OooO0o0.f59964OooOooO.remove(Integer.valueOf(this.f59865OooO0o));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
