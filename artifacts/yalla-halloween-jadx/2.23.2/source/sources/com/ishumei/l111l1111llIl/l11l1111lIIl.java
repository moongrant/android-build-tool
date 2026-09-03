package com.ishumei.l111l1111llIl;

import java.io.ByteArrayOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class l11l1111lIIl {
    public static byte[] l1111l111111Il(byte[] bArr) {
        int iInflate;
        byte[] bArr2 = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        while (!inflater.finished() && (iInflate = inflater.inflate(bArr2)) > 0) {
            byteArrayOutputStream.write(bArr2, 0, iInflate);
        }
        inflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
