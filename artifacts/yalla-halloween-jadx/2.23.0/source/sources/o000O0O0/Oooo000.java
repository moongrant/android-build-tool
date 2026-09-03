package o000O0O0;

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

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo f34758OooO0Oo;

    public Oooo000(OooOo oooOo) {
        this.f34758OooO0Oo = oooOo;
    }

    public final Set<Integer> OooO00o() {
        OooOo oooOo = this.f34758OooO0Oo;
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        Cursor cursorOooOO0o = oooOo.f34731OooO00o.OooOO0o(new p422o0OoO0o.OooOOOO("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
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
            if (this.f34758OooO0Oo.f34738OooO0oo == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            SupportSQLiteStatement supportSQLiteStatement = this.f34758OooO0Oo.f34738OooO0oo;
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
        ReentrantReadWriteLock.ReadLock lock = this.f34758OooO0Oo.f34731OooO00o.f7883OooO.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        lock.lock();
        try {
            try {
                try {
                    if (this.f34758OooO0Oo.OooO0OO() && this.f34758OooO0Oo.f34735OooO0o.compareAndSet(true, false) && !this.f34758OooO0Oo.f34731OooO00o.OooO0oO().getWritableDatabase().inTransaction()) {
                        SupportSQLiteDatabase writableDatabase = this.f34758OooO0Oo.f34731OooO00o.OooO0oO().getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            setEmptySet = OooO00o();
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            lock.unlock();
                            this.f34758OooO0Oo.getClass();
                            if (!setEmptySet.isEmpty()) {
                                OooOo oooOo = this.f34758OooO0Oo;
                                synchronized (oooOo.f34740OooOO0O) {
                                    Iterator<Map.Entry<K, V>> it = oooOo.f34740OooOO0O.iterator();
                                    while (it.hasNext()) {
                                        ((OooOo.OooO0o) ((Map.Entry) it.next()).getValue()).OooO00o(setEmptySet);
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
                    this.f34758OooO0Oo.getClass();
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
            this.f34758OooO0Oo.getClass();
            throw th2;
        }
    }
}
