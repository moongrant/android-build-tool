package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements OooOOO<BigInteger> {
    @Override // com.google.android.gms.common.server.response.OooOOO
    @Nullable
    public final BigInteger OooO00o(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        char[] cArr = fastParser.f15218OooO0OO;
        int iOooO0Oo = fastParser.OooO0Oo(bufferedReader, cArr);
        if (iOooO0Oo == 0) {
            return null;
        }
        return new BigInteger(new String(cArr, 0, iOooO0Oo));
    }
}
