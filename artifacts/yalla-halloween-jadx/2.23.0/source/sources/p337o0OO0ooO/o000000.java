package p337o0OO0ooO;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Inflater {
    @Override // java.util.zip.Inflater
    public final int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
        int iInflate = super.inflate(bArr, i, i2);
        if (iInflate != 0 || !needsDictionary()) {
            return iInflate;
        }
        setDictionary(o00000OO.f43372OooO00o);
        return super.inflate(bArr, i, i2);
    }
}
