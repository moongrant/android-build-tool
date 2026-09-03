package com.amazonaws.mobileconnectors.s3.transferutility;

import OooO0o.OooO0OO;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.facebook.internal.ServerProtocol;
import com.qiniu.android.collect.ReportItem;
import com.umeng.analytics.pro.ao;
import p060o0000o.oo000o;
import p386o0OOoo0O.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
class TransferDBUtil {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10459OooO00o = LogFactory.OooO00o(TransferDBUtil.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object f10460OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static TransferDBBase f10461OooO0OO;

    public TransferDBUtil(Context context) {
        new o000OOo0();
        synchronized (f10460OooO0O0) {
            if (f10461OooO0OO == null) {
                f10461OooO0OO = new TransferDBBase(context);
            }
        }
    }

    public final int OooO00o(int i) {
        TransferDBBase transferDBBase = f10461OooO0OO;
        Uri uriOooO0OO = OooO0OO(i);
        int iMatch = transferDBBase.f10456OooO0O0.match(uriOooO0OO);
        transferDBBase.OooO00o();
        if (iMatch == 10) {
            return transferDBBase.f10458OooO0Oo.delete("awstransfer", null, null);
        }
        if (iMatch != 20) {
            throw new IllegalArgumentException("Unknown URI: " + uriOooO0OO);
        }
        String lastPathSegment = uriOooO0OO.getLastPathSegment();
        if (TextUtils.isEmpty(null)) {
            return transferDBBase.f10458OooO0Oo.delete("awstransfer", "_id=" + lastPathSegment, null);
        }
        return transferDBBase.f10458OooO0Oo.delete("awstransfer", "_id=" + lastPathSegment + " and " + ((String) null), null);
    }

    public final Uri OooO0O0(int i) {
        return Uri.parse(f10461OooO0OO.f10455OooO00o + "/part/" + i);
    }

    public final Uri OooO0OO(int i) {
        return Uri.parse(f10461OooO0OO.f10455OooO00o + "/" + i);
    }

    public final Cursor OooO0Oo(TransferType transferType, TransferState[] transferStateArr) {
        String string;
        String strOooO00o;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f10459OooO00o.OooOO0("Cannot create a string of 0 or less placeholders.");
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
            strOooO00o = OooO0OO.OooO00o("state in (", string, ")");
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String strOooO00o2 = oo000o.OooO00o("state in (", string, ") and ", "type", "=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            strOooO00o = strOooO00o2;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f10461OooO0OO;
        return transferDBBase.OooO0O0(transferDBBase.f10455OooO00o, strOooO00o, strArr);
    }

    public final int OooO0o(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ao.d, Integer.valueOf(transferRecord.f10471OooO00o));
        contentValues.put(ServerProtocol.DIALOG_PARAM_STATE, transferRecord.f10479OooOO0.toString());
        contentValues.put(ReportItem.RequestKeyBytesTotal, Long.valueOf(transferRecord.f10475OooO0o));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f10477OooO0oO));
        return f10461OooO0OO.OooO0OO(OooO0OO(transferRecord.f10471OooO00o), contentValues, null, null);
    }

    public final int OooO0o0(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ServerProtocol.DIALOG_PARAM_STATE, transferState.toString());
        return TransferState.FAILED.equals(transferState) ? f10461OooO0OO.OooO0OO(OooO0OO(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()}) : f10461OooO0OO.OooO0OO(OooO0OO(i), contentValues, null, null);
    }
}
