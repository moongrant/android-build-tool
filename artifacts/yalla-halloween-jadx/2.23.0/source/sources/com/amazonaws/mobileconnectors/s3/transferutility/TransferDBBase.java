package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.o0000O0O;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
class TransferDBBase {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Uri f9143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final UriMatcher f9144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TransferDatabaseHelper f9145OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SQLiteDatabase f9146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Log f9142OooO0o0 = LogFactory.OooO00o(TransferDBBase.class);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Object f9141OooO0o = new Object();

    public TransferDBBase(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.f9145OooO0OO = transferDatabaseHelper;
        this.f9146OooO0Oo = transferDatabaseHelper.getWritableDatabase();
        this.f9143OooO00o = Uri.parse("content://" + packageName + "/transfers");
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.f9144OooO0O0 = uriMatcher;
        uriMatcher.addURI(packageName, "transfers", 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    public final void OooO00o() {
        synchronized (f9141OooO0o) {
            if (!this.f9146OooO0Oo.isOpen()) {
                this.f9146OooO0Oo = this.f9145OooO0OO.getWritableDatabase();
            }
        }
    }

    public final Cursor OooO0O0(Uri uri, String str, String[] strArr) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables("awstransfer");
        int iMatch = this.f9144OooO0O0.match(uri);
        if (iMatch == 10) {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        } else if (iMatch == 20) {
            sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
        } else if (iMatch == 30) {
            sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
        } else {
            if (iMatch != 40) {
                throw new IllegalArgumentException(o0000O0O.OooO00o("Unknown URI: ", uri));
            }
            sQLiteQueryBuilder.appendWhere("state=");
            sQLiteQueryBuilder.appendWhereEscapeString(uri.getLastPathSegment());
        }
        OooO00o();
        return sQLiteQueryBuilder.query(this.f9146OooO0Oo, null, str, strArr, null, null, null);
    }

    public final synchronized int OooO0OO(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate;
        int iMatch = this.f9144OooO0O0.match(uri);
        OooO00o();
        if (iMatch == 10) {
            iUpdate = this.f9146OooO0Oo.update("awstransfer", contentValues, str, strArr);
        } else {
            if (iMatch != 20) {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (TextUtils.isEmpty(str)) {
                iUpdate = this.f9146OooO0Oo.update("awstransfer", contentValues, "_id=" + lastPathSegment, null);
            } else {
                iUpdate = this.f9146OooO0Oo.update("awstransfer", contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
            }
        }
        return iUpdate;
    }
}
