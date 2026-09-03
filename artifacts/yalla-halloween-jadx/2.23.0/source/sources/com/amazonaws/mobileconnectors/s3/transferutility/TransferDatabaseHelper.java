package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes2.dex */
class TransferDatabaseHelper extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9150OooO0Oo;

    public TransferDatabaseHelper(Context context) {
        super(context, "awss3transfertable.db", (SQLiteDatabase.CursorFactory) null, 6);
        this.f9150OooO0Oo = 6;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table awstransfer(_id integer primary key autoincrement, main_upload_id integer, type text not null, state text not null, bucket_name text not null, key text not null, version_id text, bytes_total bigint, bytes_current bigint, speed bigint, is_requester_pays integer, is_encrypted integer, file text not null, file_offset bigint, is_multipart int, part_num int not null, is_last_part integer, multipart_id text, etag text, range_start bigint, range_last bigint, header_content_type text, header_content_language text, header_content_disposition text, header_content_encoding text, header_cache_control text, header_expire text);");
        TransferTable.OooO00o(sQLiteDatabase, 1, this.f9150OooO0Oo);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        TransferTable.OooO00o(sQLiteDatabase, i, i2);
    }
}
