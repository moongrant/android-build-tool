package com.google.android.exoplayer2.database;

import android.database.SQLException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }
}
