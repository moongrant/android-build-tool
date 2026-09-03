package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteDatabase;", "Ljava/io/Closeable;", "sqlite_release"}, k = 1, mv = {1, 7, 1})
public interface SupportSQLiteDatabase extends Closeable {
    void beginTransaction();

    void beginTransactionNonExclusive();

    @NotNull
    SupportSQLiteStatement compileStatement(@NotNull String str);

    void endTransaction();

    void execSQL(@NotNull String str) throws SQLException;

    void execSQL(@NotNull String str, @NotNull Object[] objArr) throws SQLException;

    boolean inTransaction();

    long insert(@NotNull String str, int i, @NotNull ContentValues contentValues) throws SQLException;

    boolean isOpen();

    @RequiresApi(api = 16)
    boolean isWriteAheadLoggingEnabled();

    @NotNull
    Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery);

    @RequiresApi(api = 16)
    @NotNull
    Cursor query(@NotNull SupportSQLiteQuery supportSQLiteQuery, @Nullable CancellationSignal cancellationSignal);

    @NotNull
    Cursor query(@NotNull String str);

    void setTransactionSuccessful();

    int update(@NotNull String str, int i, @NotNull ContentValues contentValues, @Nullable String str2, @Nullable Object[] objArr);
}
