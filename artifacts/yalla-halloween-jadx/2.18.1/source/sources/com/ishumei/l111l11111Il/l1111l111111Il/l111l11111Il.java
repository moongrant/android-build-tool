package com.ishumei.l111l11111Il.l1111l111111Il;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l11111Il extends l111l1111lI1l {
    private Context l1111l111111Il;

    public l111l11111Il(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.l111l11111Il.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        try {
            Cursor cursorQuery = this.l1111l111111Il.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            if (cursorQuery == null) {
                return "";
            }
            cursorQuery.moveToFirst();
            int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String string = columnIndex > 0 ? cursorQuery.getString(columnIndex) : "";
            cursorQuery.close();
            return string;
        } catch (Throwable unused) {
            return "";
        }
    }
}
