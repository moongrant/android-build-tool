package p517o0o0O00O;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.model.ReadPostTable;
import p091o000o00o.o0000O0;
import p091o000o00o.o000OOo;
import p092o000o0O.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RoomDatabase f42129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOo<ReadPostTable> f42130OooO0O0;

    public class OooO00o extends o000OOo<ReadPostTable> {
        public OooO00o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // p091o000o00o.o0000OO0
        public final String OooO0OO() {
            return "INSERT OR REPLACE INTO `ReadPostTable` (`cid`,`userId`,`readPostId`) VALUES (?,?,?)";
        }

        @Override // p091o000o00o.o000OOo
        public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, ReadPostTable readPostTable) {
            ReadPostTable readPostTable2 = readPostTable;
            supportSQLiteStatement.bindLong(1, readPostTable2.getCid());
            supportSQLiteStatement.bindLong(2, readPostTable2.getUserId());
            supportSQLiteStatement.bindLong(3, readPostTable2.getReadPostId());
        }
    }

    public o00000O0(RoomDatabase roomDatabase) {
        this.f42129OooO00o = roomDatabase;
        this.f42130OooO0O0 = new OooO00o(roomDatabase);
    }

    @Override // p517o0o0O00O.o00000
    public final void OooO00o(ReadPostTable readPostTable) {
        this.f42129OooO00o.OooO0O0();
        this.f42129OooO00o.OooO0OO();
        try {
            this.f42130OooO0O0.OooO0oO(readPostTable);
            this.f42129OooO00o.OooOOOO();
        } finally {
            this.f42129OooO00o.OooOO0O();
        }
    }

    @Override // p517o0o0O00O.o00000
    public final ReadPostTable OooO0O0(long j, long j2) {
        ReadPostTable readPostTable;
        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("Select * from ReadPostTable Where cid = ? and userId = ?", 2);
        o0000o0OooO0o.bindLong(1, j);
        o0000o0OooO0o.bindLong(2, j2);
        this.f42129OooO00o.OooO0O0();
        Cursor cursorOooOOO = this.f42129OooO00o.OooOOO(o0000o0OooO0o);
        try {
            int iOooO00o = o00O0O.OooO00o(cursorOooOOO, "cid");
            int iOooO00o2 = o00O0O.OooO00o(cursorOooOOO, "userId");
            int iOooO00o3 = o00O0O.OooO00o(cursorOooOOO, "readPostId");
            if (cursorOooOOO.moveToFirst()) {
                readPostTable = new ReadPostTable();
                readPostTable.setCid(cursorOooOOO.getLong(iOooO00o));
                readPostTable.setUserId(cursorOooOOO.getLong(iOooO00o2));
                readPostTable.setReadPostId(cursorOooOOO.getLong(iOooO00o3));
            } else {
                readPostTable = null;
            }
            return readPostTable;
        } finally {
            cursorOooOOO.close();
            o0000o0OooO0o.release();
        }
    }
}
