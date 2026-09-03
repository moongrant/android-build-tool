package com.google.android.gms.common.data;

import android.content.ContentValues;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends DataHolder.Builder {
    public OooO00o(String[] strArr) {
        super(strArr);
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final DataHolder.Builder withRow(ContentValues contentValues) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }

    @Override // com.google.android.gms.common.data.DataHolder.Builder
    public final DataHolder.Builder zaa(HashMap<String, Object> map) {
        throw new UnsupportedOperationException("Cannot add data to empty builder");
    }
}
