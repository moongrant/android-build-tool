package net.sqlcipher.database;

import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import net.sqlcipher.AbstractWindowedCursor;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.SQLException;

/* JADX INFO: loaded from: classes5.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final String TAG = "Cursor";
    private String[] mColumns;
    private SQLiteDatabase mDatabase;
    private SQLiteCursorDriver mDriver;
    private String mEditTable;
    protected MainThreadNotificationHandler mNotificationHandler;
    private SQLiteQuery mQuery;
    private int mCount = -1;
    private int mCursorWindowCapacity = 0;
    private boolean fillWindowForwardOnly = false;
    private int mMaxRead = Integer.MAX_VALUE;
    private int mInitialRead = Integer.MAX_VALUE;
    private int mCursorState = 0;
    private ReentrantLock mLock = null;
    private boolean mPendingData = false;
    private Throwable mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
    private Map<String, Integer> mColumnNameMap = null;

    public static class MainThreadNotificationHandler extends Handler {
        private final WeakReference<SQLiteCursor> wrappedCursor;

        public MainThreadNotificationHandler(SQLiteCursor sQLiteCursor) {
            this.wrappedCursor = new WeakReference<>(sQLiteCursor);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            SQLiteCursor sQLiteCursor = this.wrappedCursor.get();
            if (sQLiteCursor != null) {
                sQLiteCursor.notifyDataSetChange();
            }
        }
    }

    public final class QueryThread implements Runnable {
        private final int mThreadState;

        public QueryThread(int i) {
            this.mThreadState = i;
        }

        private void sendMessage() {
            SQLiteCursor sQLiteCursor = SQLiteCursor.this;
            MainThreadNotificationHandler mainThreadNotificationHandler = sQLiteCursor.mNotificationHandler;
            if (mainThreadNotificationHandler == null) {
                sQLiteCursor.mPendingData = true;
            } else {
                mainThreadNotificationHandler.sendEmptyMessage(1);
                SQLiteCursor.this.mPendingData = false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            CursorWindow cursorWindow = ((AbstractWindowedCursor) SQLiteCursor.this).mWindow;
            Process.setThreadPriority(Process.myTid(), 10);
            while (true) {
                if (SQLiteCursor.this.mLock == null) {
                    SQLiteCursor.this.mLock = new ReentrantLock(true);
                }
                SQLiteCursor.this.mLock.lock();
                if (SQLiteCursor.this.mCursorState != this.mThreadState) {
                    SQLiteCursor.this.mLock.unlock();
                    return;
                }
                try {
                    int iFillWindow = SQLiteCursor.this.mQuery.fillWindow(cursorWindow, SQLiteCursor.this.mMaxRead, SQLiteCursor.this.mCount);
                    if (iFillWindow != 0) {
                        if (iFillWindow == -1) {
                            SQLiteCursor sQLiteCursor = SQLiteCursor.this;
                            SQLiteCursor.access$512(sQLiteCursor, sQLiteCursor.mMaxRead);
                            sendMessage();
                            SQLiteCursor.this.mLock.unlock();
                        } else {
                            SQLiteCursor.this.mCount = iFillWindow;
                            sendMessage();
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    SQLiteCursor.this.mLock.unlock();
                    throw th;
                }
                SQLiteCursor.this.mLock.unlock();
                return;
            }
        }
    }

    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.mDatabase = sQLiteDatabase;
        this.mDriver = sQLiteCursorDriver;
        this.mEditTable = str;
        this.mQuery = sQLiteQuery;
        try {
            sQLiteDatabase.lock();
            int iColumnCountLocked = this.mQuery.columnCountLocked();
            this.mColumns = new String[iColumnCountLocked];
            for (int i = 0; i < iColumnCountLocked; i++) {
                String strColumnNameLocked = this.mQuery.columnNameLocked(i);
                this.mColumns[i] = strColumnNameLocked;
                if ("_id".equals(strColumnNameLocked)) {
                    this.mRowIdColumnIndex = i;
                }
            }
            sQLiteDatabase.unlock();
        } catch (Throwable th) {
            sQLiteDatabase.unlock();
            throw th;
        }
    }

    public static /* synthetic */ int access$512(SQLiteCursor sQLiteCursor, int i) {
        int i2 = sQLiteCursor.mCount + i;
        sQLiteCursor.mCount = i2;
        return i2;
    }

    private void deactivateCommon() {
        this.mCursorState = 0;
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null) {
            cursorWindow.close();
            this.mWindow = null;
        }
    }

    private void fillWindow(int i) {
        int iCursorPickFillWindowStartPosition;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
                queryThreadUnlock();
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        if (this.fillWindowForwardOnly) {
            iCursorPickFillWindowStartPosition = i;
        } else {
            iCursorPickFillWindowStartPosition = this.mCount == -1 ? cursorPickFillWindowStartPosition(i, 0) : cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(iCursorPickFillWindowStartPosition);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = iCursorPickFillWindowStartPosition + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }

    private void queryThreadLock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.lock();
        }
    }

    private void queryThreadUnlock() {
        ReentrantLock reentrantLock = this.mLock;
        if (reentrantLock != null) {
            reentrantLock.unlock();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        deactivateCommon();
        this.mQuery.close();
        this.mDriver.cursorClosed();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[Catch: all -> 0x0128, DONT_GENERATE, TryCatch #1 {, blocks: (B:8:0x000d, B:9:0x0012, B:11:0x001b, B:13:0x001d, B:34:0x0112, B:35:0x011c, B:39:0x0122, B:40:0x0127, B:14:0x0022, B:15:0x0033, B:17:0x0039, B:20:0x004f, B:23:0x0056, B:24:0x0087, B:26:0x008d, B:28:0x00ad, B:29:0x00b2, B:30:0x00b5, B:31:0x00ee, B:32:0x010c, B:33:0x010d), top: B:45:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x001d A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #1 {, blocks: (B:8:0x000d, B:9:0x0012, B:11:0x001b, B:13:0x001d, B:34:0x0112, B:35:0x011c, B:39:0x0122, B:40:0x0127, B:14:0x0022, B:15:0x0033, B:17:0x0039, B:20:0x004f, B:23:0x0056, B:24:0x0087, B:26:0x008d, B:28:0x00ad, B:29:0x00b2, B:30:0x00b5, B:31:0x00ee, B:32:0x010c, B:33:0x010d), top: B:45:0x000d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x0121, TryCatch #0 {all -> 0x0121, blocks: (B:14:0x0022, B:15:0x0033, B:17:0x0039, B:20:0x004f, B:23:0x0056, B:24:0x0087, B:26:0x008d, B:28:0x00ad, B:29:0x00b2, B:30:0x00b5, B:31:0x00ee, B:32:0x010c, B:33:0x010d), top: B:44:0x0022, outer: #1 }] */
    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(Map<? extends Long, ? extends Map<String, Object>> map) {
        Map<String, Object> value;
        Long key;
        if (!supportsUpdates()) {
            return false;
        }
        synchronized (this.mUpdatedRows) {
            if (map == null) {
                if (this.mUpdatedRows.size() == 0) {
                    return true;
                }
                this.mDatabase.beginTransaction();
                StringBuilder sb = new StringBuilder(128);
                for (Map.Entry<Long, Map<String, Object>> entry : this.mUpdatedRows.entrySet()) {
                    value = entry.getValue();
                    key = entry.getKey();
                    if (key != null) {
                    }
                    throw new IllegalStateException("null rowId or values found! rowId = " + key + ", values = " + value);
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            }
            this.mUpdatedRows.putAll(map);
            if (this.mUpdatedRows.size() == 0) {
                return true;
            }
            this.mDatabase.beginTransaction();
            try {
                StringBuilder sb2 = new StringBuilder(128);
                while (r3.hasNext()) {
                    value = entry.getValue();
                    key = entry.getKey();
                    if (key != null || value == null) {
                        throw new IllegalStateException("null rowId or values found! rowId = " + key + ", values = " + value);
                    }
                    if (value.size() != 0) {
                        long jLongValue = key.longValue();
                        Iterator<Map.Entry<String, Object>> it = value.entrySet().iterator();
                        sb2.setLength(0);
                        sb2.append("UPDATE " + this.mEditTable + " SET ");
                        Object[] objArr = new Object[value.size()];
                        int i = 0;
                        while (it.hasNext()) {
                            Map.Entry<String, Object> next = it.next();
                            sb2.append(next.getKey());
                            sb2.append("=?");
                            objArr[i] = next.getValue();
                            if (it.hasNext()) {
                                sb2.append(", ");
                            }
                            i++;
                        }
                        sb2.append(" WHERE " + this.mColumns[this.mRowIdColumnIndex] + '=' + jLongValue);
                        sb2.append(';');
                        this.mDatabase.execSQL(sb2.toString(), objArr);
                        this.mDatabase.rowUpdated(this.mEditTable, jLongValue);
                    }
                }
                this.mDatabase.setTransactionSuccessful();
                this.mDatabase.endTransaction();
                this.mUpdatedRows.clear();
                onChange(true);
                return true;
            } catch (Throwable th) {
                this.mDatabase.endTransaction();
                throw th;
            }
            throw th;
        }
    }

    public int cursorPickFillWindowStartPosition(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        deactivateCommon();
        this.mDriver.cursorDeactivated();
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
        boolean z;
        checkPosition();
        if (this.mRowIdColumnIndex == -1 || this.mCurrentRowID == null) {
            return false;
        }
        this.mDatabase.lock();
        try {
            try {
                this.mDatabase.delete(this.mEditTable, this.mColumns[this.mRowIdColumnIndex] + "=?", new String[]{this.mCurrentRowID.toString()});
                z = true;
            } catch (SQLException unused) {
                z = false;
            }
            int i = this.mPos;
            requery();
            moveToPosition(i);
            this.mDatabase.unlock();
            if (!z) {
                return false;
            }
            onChange(true);
            return true;
        } catch (Throwable th) {
            this.mDatabase.unlock();
            throw th;
        }
    }

    @Override // net.sqlcipher.AbstractCursor
    public void finalize() {
        try {
            if (this.mWindow != null) {
                this.mQuery.mSql.getClass();
                close();
                SQLiteDebug.notifyActiveCursorFinalized();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.mColumnNameMap == null) {
            String[] strArr = this.mColumns;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.mColumnNameMap = map;
        }
        if (str.lastIndexOf(46) != -1) {
            new Exception();
        }
        Integer num = this.mColumnNameMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.mColumns;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.mCount == -1) {
            fillWindow(0);
        }
        return this.mCount;
    }

    public SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        CursorWindow cursorWindow = this.mWindow;
        if (cursorWindow != null && i2 >= cursorWindow.getStartPosition()) {
            if (i2 < this.mWindow.getNumRows() + this.mWindow.getStartPosition()) {
                return true;
            }
        }
        fillWindow(i2);
        return true;
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        super.registerDataSetObserver(dataSetObserver);
        if (!(Integer.MAX_VALUE == this.mMaxRead && Integer.MAX_VALUE == this.mInitialRead) && this.mNotificationHandler == null) {
            queryThreadLock();
            try {
                this.mNotificationHandler = new MainThreadNotificationHandler(this);
                if (this.mPendingData) {
                    notifyDataSetChange();
                    this.mPendingData = false;
                }
            } finally {
                queryThreadUnlock();
            }
        }
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        this.mDatabase.lock();
        try {
            CursorWindow cursorWindow = this.mWindow;
            if (cursorWindow != null) {
                cursorWindow.clear();
            }
            this.mPos = -1;
            this.mDriver.cursorRequeried(this);
            this.mCount = -1;
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mQuery.requery();
                queryThreadUnlock();
                this.mDatabase.unlock();
                return super.requery();
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        } catch (Throwable th2) {
            this.mDatabase.unlock();
            throw th2;
        }
    }

    public void setFillWindowForwardOnly(boolean z) {
        this.fillWindowForwardOnly = z;
    }

    public void setLoadStyle(int i, int i2) {
        this.mMaxRead = i2;
        this.mInitialRead = i;
        this.mLock = new ReentrantLock(true);
    }

    public void setSelectionArguments(String[] strArr) {
        this.mDriver.setBindArguments(strArr);
    }

    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        if (this.mWindow != null) {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.close();
                queryThreadUnlock();
                this.mCount = -1;
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        this.mWindow = cursorWindow;
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
        return !TextUtils.isEmpty(this.mEditTable);
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        int iCursorPickFillWindowStartPosition;
        if (this.mWindow == null) {
            this.mWindow = new CursorWindow(true);
        } else {
            this.mCursorState++;
            queryThreadLock();
            try {
                this.mWindow.clear();
                queryThreadUnlock();
            } catch (Throwable th) {
                queryThreadUnlock();
                throw th;
            }
        }
        if (this.fillWindowForwardOnly) {
            iCursorPickFillWindowStartPosition = i;
        } else if (this.mCount == -1) {
            iCursorPickFillWindowStartPosition = cursorPickFillWindowStartPosition(i, 0);
        } else {
            iCursorPickFillWindowStartPosition = cursorPickFillWindowStartPosition(i, this.mCursorWindowCapacity);
        }
        this.mWindow.setStartPosition(iCursorPickFillWindowStartPosition);
        this.mWindow.setRequiredPosition(i);
        this.mCount = this.mQuery.fillWindow(this.mWindow, this.mInitialRead, 0);
        if (this.mCursorWindowCapacity == 0) {
            this.mCursorWindowCapacity = this.mWindow.getNumRows();
        }
        if (this.mCount == -1) {
            this.mCount = iCursorPickFillWindowStartPosition + this.mInitialRead;
            new Thread(new QueryThread(this.mCursorState), "query thread").start();
        }
    }
}
