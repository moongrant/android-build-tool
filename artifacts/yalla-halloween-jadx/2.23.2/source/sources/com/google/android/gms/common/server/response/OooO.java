package com.google.android.gms.common.server.response;

import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO implements OooOOO<Boolean> {
    @Override // com.google.android.gms.common.server.response.OooOOO
    @Nullable
    public final /* bridge */ /* synthetic */ Boolean OooO00o(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        return Boolean.valueOf(fastParser.OooOOO0(bufferedReader, false));
    }
}
