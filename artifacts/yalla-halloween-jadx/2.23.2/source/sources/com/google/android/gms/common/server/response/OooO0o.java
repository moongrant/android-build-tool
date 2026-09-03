package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o implements OooOOO<Double> {
    @Override // com.google.android.gms.common.server.response.OooOOO
    @Nullable
    public final Double OooO00o(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        char[] cArr = fastParser.f14742OooO0OO;
        int iOooO0Oo = fastParser.OooO0Oo(bufferedReader, cArr);
        return Double.valueOf(iOooO0Oo == 0 ? 0.0d : Double.parseDouble(new String(cArr, 0, iOooO0Oo)));
    }
}
