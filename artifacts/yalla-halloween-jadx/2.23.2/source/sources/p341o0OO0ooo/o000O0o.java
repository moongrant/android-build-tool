package p341o0OO0ooo;

import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0o extends Inflater {
    @Override // java.util.zip.Inflater
    public final int inflate(byte[] bArr, int i, int i2) throws DataFormatException {
        int iInflate = super.inflate(bArr, i, i2);
        if (iInflate != 0 || !needsDictionary()) {
            return iInflate;
        }
        setDictionary(o000O0Oo.f42721OooO00o);
        return super.inflate(bArr, i, i2);
    }
}
