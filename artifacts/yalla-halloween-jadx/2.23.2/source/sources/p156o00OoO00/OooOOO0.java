package p156o00OoO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements OooO0OO<byte[]> {
    @Override // p156o00OoO00.OooO0OO
    public final int OooO00o() {
        return 1;
    }

    @Override // p156o00OoO00.OooO0OO
    public final int OooO0O0(byte[] bArr) {
        return bArr.length;
    }

    @Override // p156o00OoO00.OooO0OO
    public final String getTag() {
        return "ByteArrayPool";
    }

    @Override // p156o00OoO00.OooO0OO
    public final byte[] newArray(int i) {
        return new byte[i];
    }
}
