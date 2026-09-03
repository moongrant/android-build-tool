package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements OooOOO<Long> {
    @Override // com.google.android.gms.common.server.response.OooOOO
    @Nullable
    public final /* synthetic */ Long OooO00o(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Long.valueOf(fastParser.OooO0oO(bufferedReader));
    }
}
