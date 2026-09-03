package p655o0ooo0O;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import p652o0ooo000.o00000O;
import p657o0ooo0o0.o000O0o;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Oo extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oO000O0 f59564OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f59565OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(String str, o0OOo000 o0ooo001, oO000O0 oo000o0) {
        super(str, true);
        this.f59565OooO0o0 = o0ooo001;
        this.f59564OooO0o = oo000o0;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        try {
            this.f59565OooO0o0.f59454OooO0o0.OooO0O0(this.f59564OooO0o);
            return -1L;
        } catch (IOException e) {
            o000O0o o000o0o2 = o000O0o.f59618OooO00o;
            o000O0o o000o0o3 = o000O0o.f59618OooO00o;
            String strStringPlus = Intrinsics.stringPlus("Http2Connection.Listener failure for ", this.f59565OooO0o0.f59455OooO0oO);
            o000o0o3.getClass();
            o000O0o.OooO(e, 4, strStringPlus);
            try {
                this.f59564OooO0o.OooO0OO(ErrorCode.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
