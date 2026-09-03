package com.ishumei.l111l11111Il.l1111l111111Il;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes3.dex */
public final class l11l1111I1l extends l111l1111lI1l {
    private Context l1111l111111Il;

    public l11l1111I1l(Context context) {
        this.l1111l111111Il = context;
    }

    @Override // com.ishumei.l111l11111Il.l1111l111111Il.l111l1111lI1l
    public final String l1111l111111Il() {
        Cursor cursorQuery;
        Uri uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        ContentResolver contentResolver = this.l1111l111111Il.getContentResolver();
        if (contentResolver == null || (cursorQuery = contentResolver.query(uri, null, null, null, null)) == null) {
            return "";
        }
        cursorQuery.moveToNext();
        String string = cursorQuery.getString(cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        cursorQuery.close();
        return string;
    }
}
