package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.o0000O0O;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.google.gson.OooOOO0;
import com.qiniu.android.collect.ReportItem;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
class TransferDBUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f12237OooO00o = LogFactory.OooO00o(TransferDBUtil.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f12238OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static TransferDBBase f12239OooO0OO;

    public TransferDBUtil(Context context) {
        new OooOOO0();
        synchronized (f12238OooO0O0) {
            if (f12239OooO0OO == null) {
                f12239OooO0OO = new TransferDBBase(context);
            }
        }
    }

    public static void OooO00o(int i) {
        TransferDBBase transferDBBase = f12239OooO0OO;
        Uri uriOooO0OO = OooO0OO(i);
        int iMatch = transferDBBase.f12234OooO0O0.match(uriOooO0OO);
        transferDBBase.OooO00o();
        if (iMatch == 10) {
            transferDBBase.f12236OooO0Oo.delete("awstransfer", null, null);
            return;
        }
        if (iMatch != 20) {
            throw new IllegalArgumentException(o0000O0O.OooO00o("Unknown URI: ", uriOooO0OO));
        }
        String lastPathSegment = uriOooO0OO.getLastPathSegment();
        if (!TextUtils.isEmpty(null)) {
            transferDBBase.f12236OooO0Oo.delete("awstransfer", o000oOoO.OooO0O0("_id=", lastPathSegment, " and null"), null);
            return;
        }
        transferDBBase.f12236OooO0Oo.delete("awstransfer", "_id=" + lastPathSegment, null);
    }

    public static Uri OooO0O0(int i) {
        return Uri.parse(f12239OooO0OO.f12233OooO00o + "/part/" + i);
    }

    public static Uri OooO0OO(int i) {
        return Uri.parse(f12239OooO0OO.f12233OooO00o + "/" + i);
    }

    public static Cursor OooO0Oo(TransferType transferType, TransferState[] transferStateArr) {
        String string;
        String strOooO0O0;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f12237OooO00o.OooO0o0("Cannot create a string of 0 or less placeholders.");
            string = null;
        } else {
            StringBuilder sb = new StringBuilder((length * 2) - 1);
            sb.append("?");
            for (int i = 1; i < length; i++) {
                sb.append(",?");
            }
            string = sb.toString();
        }
        int i2 = 0;
        if (transferType == TransferType.ANY) {
            strOooO0O0 = o000oOoO.OooO0O0("state in (", string, ")");
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String strOooO0O1 = o000oOoO.OooO0O0("state in (", string, ") and type=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            strOooO0O0 = strOooO0O1;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f12239OooO0OO;
        return transferDBBase.OooO0O0(transferDBBase.f12233OooO00o, strOooO0O0, strArr);
    }

    public static int OooO0o(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(transferRecord.f12249OooO00o));
        contentValues.put("state", transferRecord.f12257OooOO0.toString());
        contentValues.put(ReportItem.RequestKeyBytesTotal, Long.valueOf(transferRecord.f12253OooO0o));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f12255OooO0oO));
        return f12239OooO0OO.OooO0OO(OooO0OO(transferRecord.f12249OooO00o), contentValues, null, null);
    }

    public static int OooO0o0(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        return TransferState.FAILED.equals(transferState) ? f12239OooO0OO.OooO0OO(OooO0OO(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()}) : f12239OooO0OO.OooO0OO(OooO0OO(i), contentValues, null, null);
    }
}
