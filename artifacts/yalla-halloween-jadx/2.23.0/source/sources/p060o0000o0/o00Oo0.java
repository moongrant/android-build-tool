package p060o0000o0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f34260OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f34261OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f34262OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f34263OooO0Oo;

    public o00Oo0() {
        if (o00Ooo.f34264OooO00o == null) {
            o00Ooo.f34264OooO00o = new o00Ooo();
        }
    }

    public final int OooO00o(int i) {
        if (i < this.f34263OooO0Oo) {
            return this.f34261OooO0O0.getShort(this.f34262OooO0OO + i);
        }
        return 0;
    }

    public final void OooO0O0(int i, ByteBuffer byteBuffer) {
        this.f34261OooO0O0 = byteBuffer;
        if (byteBuffer == null) {
            this.f34260OooO00o = 0;
            this.f34262OooO0OO = 0;
            this.f34263OooO0Oo = 0;
        } else {
            this.f34260OooO00o = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f34262OooO0OO = i2;
            this.f34263OooO0Oo = this.f34261OooO0O0.getShort(i2);
        }
    }
}
