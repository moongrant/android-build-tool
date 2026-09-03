package net.sqlcipher.database;

/* JADX INFO: loaded from: classes5.dex */
public interface SQLiteTransactionListener {
    void onBegin();

    void onCommit();

    void onRollback();
}
