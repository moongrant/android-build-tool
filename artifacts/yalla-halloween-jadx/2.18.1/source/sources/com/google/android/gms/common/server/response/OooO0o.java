package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements OooOOO<Double> {
    @Override // com.google.android.gms.common.server.response.OooOOO
    @Nullable
    public final /* synthetic */ Double OooO00o(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Double.valueOf(fastParser.OooO0OO(bufferedReader));
    }
}
