package p110o000ooo0;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import p323o0O0ooO.o0000OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000O f35831OooO0Oo;

    public o00000(o000000O o000000o2) {
        this.f35831OooO0Oo = o000000o2;
    }

    public final Set<Integer> OooO00o() {
        o000000O o000000o2 = this.f35831OooO0Oo;
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        Cursor cursorOooOO0o = o000000o2.f35836OooO00o.OooOO0o(new o0000OO0("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (cursorOooOO0o.moveToNext()) {
            try {
                setCreateSetBuilder.add(Integer.valueOf(cursorOooOO0o.getInt(0)));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorOooOO0o, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(cursorOooOO0o, null);
        Set<Integer> setBuild = SetsKt.build(setCreateSetBuilder);
        if (!setBuild.isEmpty()) {
            if (this.f35831OooO0Oo.f35843OooO0oo == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            SupportSQLiteStatement supportSQLiteStatement = this.f35831OooO0Oo.f35843OooO0oo;
            if (supportSQLiteStatement == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            supportSQLiteStatement.executeUpdateDelete();
        }
        return setBuild;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<Integer> setEmptySet;
        ReentrantReadWriteLock.ReadLock lock = this.f35831OooO0Oo.f35836OooO00o.f10977OooO.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
                try {
                    if (this.f35831OooO0Oo.OooO0OO() && this.f35831OooO0Oo.f35840OooO0o.compareAndSet(true, false) && !this.f35831OooO0Oo.f35836OooO00o.OooO0oO().getWritableDatabase().inTransaction()) {
                        SupportSQLiteDatabase writableDatabase = this.f35831OooO0Oo.f35836OooO00o.OooO0oO().getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            setEmptySet = OooO00o();
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            lock.unlock();
                            this.f35831OooO0Oo.getClass();
                            if (!setEmptySet.isEmpty()) {
                                o000000O o000000o2 = this.f35831OooO0Oo;
                                synchronized (o000000o2.f35845OooOO0O) {
                                    Iterator<Map.Entry<K, V>> it = o000000o2.f35845OooOO0O.iterator();
                                    while (it.hasNext()) {
                                        ((o000000O.OooO0o) ((Map.Entry) it.next()).getValue()).OooO00o(setEmptySet);
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                    lock.unlock();
                    this.f35831OooO0Oo.getClass();
                } catch (IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    setEmptySet = SetsKt.emptySet();
                }
            } catch (SQLiteException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                setEmptySet = SetsKt.emptySet();
            }
        } catch (Throwable th2) {
            lock.unlock();
            this.f35831OooO0Oo.getClass();
            throw th2;
        }
    }
}
