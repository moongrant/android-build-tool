package net.sqlcipher.database;

import OooO00o.OooO00o;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    public SQLiteDatabase mDatabase;
    private String mSqlStmt;
    public long nHandle;
    public long nStatement = 0;
    private boolean mInUse = false;

    public SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        this.nHandle = 0L;
        this.mSqlStmt = null;
        if (!sQLiteDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(sQLiteDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        this.mDatabase = sQLiteDatabase;
        this.mSqlStmt = str;
        this.nHandle = sQLiteDatabase.mNativeHandle;
        compile(str, true);
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("database ");
            sbOooO0o0.append(this.mDatabase.getPath());
            sbOooO0o0.append(" already closed");
            throw new IllegalStateException(sbOooO0o0.toString());
        }
        if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    private final native void native_compile(String str);

    private final native void native_finalize();

    public synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v(TAG, "Acquired DbObj (id#" + this.nStatement + ") from DB cache");
        }
        return true;
    }

    public void finalize() throws Throwable {
        try {
            if (this.nStatement == 0) {
                return;
            }
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                Log.v(TAG, "** warning ** Finalized DbObj (id#" + this.nStatement + ")");
            }
            releaseSqlStatement();
        } finally {
            super.finalize();
        }
    }

    public synchronized void release() {
        if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
            Log.v(TAG, "Released DbObj (id#" + this.nStatement + ") back to DB cache");
        }
        this.mInUse = false;
    }

    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("closed and deallocated DbObj (id#");
                sbOooO0o0.append(this.nStatement);
                sbOooO0o0.append(")");
                Log.v(TAG, sbOooO0o0.toString());
            }
            native_finalize();
            this.nStatement = 0L;
        }
    }
}
