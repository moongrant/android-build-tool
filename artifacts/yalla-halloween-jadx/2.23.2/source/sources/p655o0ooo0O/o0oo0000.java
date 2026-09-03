package p655o0ooo0O;

import java.io.IOException;
import p652o0ooo000.o00000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oo0000 extends o00000O {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f59500OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OOo000 f59501OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f59502OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(String str, o0OOo000 o0ooo001, int i, int i2) {
        super(str, true);
        this.f59501OooO0o0 = o0ooo001;
        this.f59500OooO0o = i;
        this.f59502OooO0oO = i2;
    }

    @Override // p652o0ooo000.o00000O
    public final long OooO00o() {
        int i = this.f59500OooO0o;
        int i2 = this.f59502OooO0oO;
        o0OOo000 o0ooo001 = this.f59501OooO0o0;
        o0ooo001.getClass();
        try {
            o0ooo001.f59476OooOoo0.OooO0oo(i, i2, true);
            return -1L;
        } catch (IOException e) {
            o0ooo001.OooO0OO(e);
            return -1L;
        }
    }
}
