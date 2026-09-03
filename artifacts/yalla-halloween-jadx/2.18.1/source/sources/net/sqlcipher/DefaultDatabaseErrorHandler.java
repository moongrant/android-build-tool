package net.sqlcipher;

import OooO00o.OooO00o;
import android.util.Log;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = "DefaultDatabaseErrorHandler";

    private void deleteDatabaseFile(String str) {
        if (str.equalsIgnoreCase(SQLiteDatabase.MEMORY) || str.trim().length() == 0) {
            return;
        }
        Log.e(this.TAG, "deleting the database file: " + str);
        try {
            new File(str).delete();
        } catch (Exception e) {
            String str2 = this.TAG;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("delete failed: ");
            sbOooO0o0.append(e.getMessage());
            Log.w(str2, sbOooO0o0.toString());
        }
    }

    @Override // net.sqlcipher.DatabaseErrorHandler
    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        String str = this.TAG;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Corruption reported by sqlite on database, deleting: ");
        sbOooO0o0.append(sQLiteDatabase.getPath());
        Log.e(str, sbOooO0o0.toString());
        if (sQLiteDatabase.isOpen()) {
            Log.e(this.TAG, "Database object for corrupted database is already open, closing");
            try {
                sQLiteDatabase.close();
            } catch (Exception e) {
                Log.e(this.TAG, "Exception closing Database object for corrupted database, ignored", e);
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }
}
