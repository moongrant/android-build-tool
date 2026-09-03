package p414o0Oo0o0o;

import java.io.IOException;
import p413o0Oo0o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O extends o0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f39428Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f39430Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f39431OoooO0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f39429Oooo0oO = true;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f39432OoooO00 = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(o00000O0 o00000o1, Object[] objArr, int i, int i2) {
        super("OkHttp %s ping %08x%08x", objArr);
        this.f39431OoooO0 = o00000o1;
        this.f39430Oooo0oo = i;
        this.f39428Oooo = i2;
    }

    @Override // p413o0Oo0o0O.o0Oo0oo
    public final void OooO00o() {
        try {
            o00000O0 o00000o1 = this.f39431OoooO0;
            boolean z = this.f39429Oooo0oO;
            int i = this.f39430Oooo0oo;
            int i2 = this.f39428Oooo;
            o000Oo0 o000oo1 = this.f39432OoooO00;
            synchronized (o00000o1.f39451OooooOO) {
                if (o000oo1 != null) {
                    if (o000oo1.f39560OooO00o != -1) {
                        throw new IllegalStateException();
                    }
                    o000oo1.f39560OooO00o = System.nanoTime();
                }
                o00000o1.f39451OooooOO.OooO(z, i, i2);
            }
        } catch (IOException unused) {
        }
    }
}
