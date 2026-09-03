package com.common.support.atd.detectors.virtualapk;

import android.content.Context;
import com.facebook.appevents.UserDataStore;
import kotlin.Metadata;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteOpenHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/common/support/atd/detectors/virtualapk/PackageDBOpenHelper;", "Lnet/sqlcipher/database/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onCreate", "", UserDataStore.DATE_OF_BIRTH, "Lnet/sqlcipher/database/SQLiteDatabase;", "onUpgrade", "oldVersion", "", "newVersion", "Companion", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PackageDBOpenHelper extends SQLiteOpenHelper {

    @NotNull
    public static final String COLUMN_ID = "id";

    @NotNull
    public static final String COLUMN_NAME = "name";

    @NotNull
    public static final String DB_NAME = "vap_database";

    @NotNull
    public static final String DB_PWD = "ZwDsSPOiIGdTTEl01VPSGIBYSXNR8TPJM2qFBJSOmnc=";
    public static final int DB_VERSION = 1;

    @NotNull
    public static final String TABLE_NAME = "vap_table";

    public PackageDBOpenHelper(@Nullable Context context) {
        super(context, DB_NAME, null, 1);
        SQLiteDatabase.loadLibs(context);
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public void onCreate(@Nullable SQLiteDatabase db) {
        if (db != null) {
            db.execSQL("create table if not exists vap_table(id integer primary key, name text)");
        }
    }

    @Override // net.sqlcipher.database.SQLiteOpenHelper
    public void onUpgrade(@Nullable SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
