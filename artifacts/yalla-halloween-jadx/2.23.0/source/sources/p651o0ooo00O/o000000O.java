package p651o0ooo00O;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p639o0ooOO0o.oo0oOO0;
import p652o0ooo00o.o000O0O0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000000O extends oo0oOO0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f59863OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OOo f59864OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(String str, o000OOo o000ooo2, o0000O0O o0000o0o2) {
        super(str, true);
        this.f59864OooO0o0 = o000ooo2;
        this.f59863OooO0o = o0000o0o2;
    }

    @Override // p639o0ooOO0o.oo0oOO0
    public final long OooO00o() {
        try {
            this.f59864OooO0o0.f59941OooO0o0.OooO0O0(this.f59863OooO0o);
            return -1L;
        } catch (IOException e) {
            o000O0O0 o000o0o1 = o000O0O0.f60031OooO00o;
            o000O0O0 o000o0o2 = o000O0O0.f60031OooO00o;
            String strStringPlus = Intrinsics.stringPlus("Http2Connection.Listener failure for ", this.f59864OooO0o0.f59942OooO0oO);
            o000o0o2.getClass();
            o000O0O0.OooO(e, 4, strStringPlus);
            try {
                this.f59863OooO0o.OooO0OO(ErrorCode.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
