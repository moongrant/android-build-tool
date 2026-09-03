package p690oO000o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Handler {
    public OooO0OO(Looper looper) {
        super(looper);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Uri uri;
        Uri uri2;
        Cursor cursorQuery;
        Object obj;
        if (message.what != 11) {
            Log.e("VMS_IDLG_SDK_Client", "message type valid");
            return;
        }
        int i = message.getData().getInt("type");
        String string = message.getData().getString(AppsFlyerProperties.APP_ID);
        OooO0O0 oooO0O0 = OooO0o.f52700OooOO0;
        Objects.requireNonNull(oooO0O0);
        String string2 = null;
        if (i == 0) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        } else if (i == 1) {
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/VAID_" + string);
        } else {
            if (i != 2) {
                if (i != 4) {
                    uri2 = null;
                } else {
                    uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                }
                cursorQuery = oooO0O0.f52690OooO00o.getContentResolver().query(uri2, null, null, null, null);
                if (cursorQuery != null) {
                    string2 = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE)) : null;
                    cursorQuery.close();
                } else {
                    Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
                }
                OooO0o.f52698OooO0oO = string2;
                Context context = OooO0o.f52692OooO00o;
                obj = OooO0o.f52695OooO0Oo;
                synchronized (obj) {
                    obj.notify();
                }
            }
            uri = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/AAID_" + string);
        }
        uri2 = uri;
        cursorQuery = oooO0O0.f52690OooO00o.getContentResolver().query(uri2, null, null, null, null);
        if (cursorQuery != null) {
            if (cursorQuery.moveToNext()) {
            }
            cursorQuery.close();
        } else {
            Log.d("VMS_IDLG_SDK_DB", "return cursor is null,return");
        }
        OooO0o.f52698OooO0oO = string2;
        Context context2 = OooO0o.f52692OooO00o;
        obj = OooO0o.f52695OooO0Oo;
        synchronized (obj) {
            obj.notify();
        }
    }
}
