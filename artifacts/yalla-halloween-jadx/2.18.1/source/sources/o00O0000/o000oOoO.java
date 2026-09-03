package o00O0000;

import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import p091o000o00o.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f30135OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f30136OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f30137OooO0OO;

    public class OooO00o extends o0000OO0 {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class OooO0O0 extends o0000OO0 {
        public OooO0O0(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o000oOoO(RoomDatabase roomDatabase) {
        this.f30135OooO00o = roomDatabase;
        new AtomicBoolean(false);
        this.f30136OooO0O0 = new OooO00o(roomDatabase);
        this.f30137OooO0OO = new OooO0O0(roomDatabase);
    }

    public final void OooO00o(String str) {
        this.f30135OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30136OooO0O0.OooO00o();
        if (str == null) {
            supportSQLiteStatementOooO00o.bindNull(1);
        } else {
            supportSQLiteStatementOooO00o.bindString(1, str);
        }
        this.f30135OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30135OooO00o.OooOOOO();
        } finally {
            this.f30135OooO00o.OooOO0O();
            this.f30136OooO0O0.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }

    public final void OooO0O0() {
        this.f30135OooO00o.OooO0O0();
        SupportSQLiteStatement supportSQLiteStatementOooO00o = this.f30137OooO0OO.OooO00o();
        this.f30135OooO00o.OooO0OO();
        try {
            supportSQLiteStatementOooO00o.executeUpdateDelete();
            this.f30135OooO00o.OooOOOO();
        } finally {
            this.f30135OooO00o.OooOO0O();
            this.f30137OooO0OO.OooO0Oo(supportSQLiteStatementOooO00o);
        }
    }
}
