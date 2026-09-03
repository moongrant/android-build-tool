package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements OooOOO<Integer> {
    @Override // com.google.android.gms.common.server.response.OooOOO
    @Nullable
    public final /* synthetic */ Integer OooO00o(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Integer.valueOf(fastParser.OooO0OO(bufferedReader));
    }
}
