package p091o000o00o;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicBoolean f29189OooO00o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RoomDatabase f29190OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile SupportSQLiteStatement f29191OooO0OO;

    public o0000OO0(RoomDatabase roomDatabase) {
        this.f29190OooO0O0 = roomDatabase;
    }

    public final SupportSQLiteStatement OooO00o() {
        this.f29190OooO0O0.OooO00o();
        if (!this.f29189OooO00o.compareAndSet(false, true)) {
            return OooO0O0();
        }
        if (this.f29191OooO0OO == null) {
            this.f29191OooO0OO = OooO0O0();
        }
        return this.f29191OooO0OO;
    }

    public final SupportSQLiteStatement OooO0O0() {
        String strOooO0OO = OooO0OO();
        RoomDatabase roomDatabase = this.f29190OooO0O0;
        roomDatabase.OooO00o();
        roomDatabase.OooO0O0();
        return roomDatabase.f9293OooO0Oo.getWritableDatabase().compileStatement(strOooO0OO);
    }

    public abstract String OooO0OO();

    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement) {
        if (supportSQLiteStatement == this.f29191OooO0OO) {
            this.f29189OooO00o.set(false);
        }
    }
}
