package o000OOo0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f28284OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ByteBuffer f28285OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f28286OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f28287OooO0Oo;

    public OooO0OO() {
        if (OooO0o.f28288OooO00o == null) {
            OooO0o.f28288OooO00o = new OooO0o();
        }
    }

    public final int OooO00o(int i) {
        if (i < this.f28287OooO0Oo) {
            return this.f28285OooO0O0.getShort(this.f28286OooO0OO + i);
        }
        return 0;
    }

    public final void OooO0O0(int i, ByteBuffer byteBuffer) {
        this.f28285OooO0O0 = byteBuffer;
        if (byteBuffer == null) {
            this.f28284OooO00o = 0;
            this.f28286OooO0OO = 0;
            this.f28287OooO0Oo = 0;
        } else {
            this.f28284OooO00o = i;
            int i2 = i - byteBuffer.getInt(i);
            this.f28286OooO0OO = i2;
            this.f28287OooO0Oo = this.f28285OooO0O0.getShort(i2);
        }
    }
}
