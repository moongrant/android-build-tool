package p110o000ooo0;

import android.database.Cursor;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o00Ooo;
import p046Oooooo0.o0O00o0;
import p109o000ooo.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000OO0 extends SupportSQLiteOpenHelper.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o0ooOOo f35880OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO00o f35881OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f35882OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f35883OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        public final int f35884OooO00o;

        public OooO00o(int i) {
            this.f35884OooO00o = i;
        }

        public abstract void OooO00o(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0O0(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0OO(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0Oo(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0o(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0o0();

        @NotNull
        public abstract OooO0O0 OooO0oO(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @JvmField
        public final boolean f35885OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @JvmField
        @Nullable
        public final String f35886OooO0O0;

        public OooO0O0(boolean z, @Nullable String str) {
            this.f35885OooO00o = z;
            this.f35886OooO0O0 = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(@NotNull o0ooOOo configuration, @NotNull OooO00o delegate, @NotNull String identityHash, @NotNull String legacyHash) {
        super(delegate.f35884OooO00o);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f35880OooO0O0 = configuration;
        this.f35881OooO0OO = delegate;
        this.f35882OooO0Oo = identityHash;
        this.f35883OooO0o0 = legacyHash;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0O0(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0OO(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorQuery = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) == 0) {
                z = true;
            }
            CloseableKt.closeFinally(cursorQuery, null);
            OooO00o oooO00o = this.f35881OooO0OO;
            oooO00o.OooO00o(db);
            if (!z) {
                OooO0O0 oooO0O0OooO0oO = oooO00o.OooO0oO(db);
                if (!oooO0O0OooO0oO.f35885OooO00o) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + oooO0O0OooO0oO.f35886OooO0O0);
                }
            }
            OooO0oO(db);
            oooO00o.OooO0OO(db);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(cursorQuery, th);
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0Oo(@NotNull SupportSQLiteDatabase db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        OooO0o(db, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0o(@NotNull SupportSQLiteDatabase db, int i, int i2) {
        List listEmptyList;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(db, "db");
        o0ooOOo o0ooooo = this.f35880OooO0O0;
        OooO00o oooO00o = this.f35881OooO0OO;
        boolean z3 = false;
        if (o0ooooo != null) {
            RoomDatabase.OooO0OO oooO0OO = o0ooooo.f35956OooO0Oo;
            oooO0OO.getClass();
            if (i != i2) {
                boolean z4 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int iIntValue = i;
                while (true) {
                    if (!(!z4 ? iIntValue <= i2 : iIntValue >= i2)) {
                        listEmptyList = arrayList;
                        break;
                    }
                    TreeMap treeMap = (TreeMap) oooO0OO.f11006OooO00o.get(Integer.valueOf(iIntValue));
                    if (treeMap != null) {
                        Iterator it = (z4 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = false;
                                break;
                            }
                            Integer targetVersion = (Integer) it.next();
                            if (z4) {
                                int i3 = iIntValue + 1;
                                Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                int iIntValue2 = targetVersion.intValue();
                                if (i3 > iIntValue2 || iIntValue2 > i2) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            } else {
                                Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                                int iIntValue3 = targetVersion.intValue();
                                if (i2 > iIntValue3 || iIntValue3 >= iIntValue) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                Object obj = treeMap.get(targetVersion);
                                Intrinsics.checkNotNull(obj);
                                arrayList.add(obj);
                                iIntValue = targetVersion.intValue();
                                z = true;
                                break;
                            }
                        }
                        if (!z) {
                        }
                    }
                    listEmptyList = null;
                    break;
                }
            }
            listEmptyList = CollectionsKt.emptyList();
            if (listEmptyList != null) {
                oooO00o.OooO0o(db);
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((o00O0OO0) it2.next()).OooO00o(db);
                }
                OooO0O0 oooO0O0OooO0oO = oooO00o.OooO0oO(db);
                if (!oooO0O0OooO0oO.f35885OooO00o) {
                    throw new IllegalStateException("Migration didn't properly handle: " + oooO0O0OooO0oO.f35886OooO0O0);
                }
                oooO00o.OooO0o0();
                OooO0oO(db);
                z3 = true;
            }
        }
        if (z3) {
            return;
        }
        o0ooOOo o0ooooo2 = this.f35880OooO0O0;
        if (o0ooooo2 == null || o0ooooo2.OooO00o(i, i2)) {
            throw new IllegalStateException(o0O00o0.OooO00o("A migration from ", i, " to ", i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        oooO00o.OooO0O0(db);
        oooO00o.OooO00o(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0o0(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorQuery = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0;
            CloseableKt.closeFinally(cursorQuery, null);
            OooO00o oooO00o = this.f35881OooO0OO;
            if (z) {
                Cursor cursorQuery2 = db.query(new p323o0O0ooO.o0000OO0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorQuery2.moveToFirst() ? cursorQuery2.getString(0) : null;
                    CloseableKt.closeFinally(cursorQuery2, null);
                    String str = this.f35882OooO0Oo;
                    if (!Intrinsics.areEqual(str, string) && !Intrinsics.areEqual(this.f35883OooO0o0, string)) {
                        throw new IllegalStateException(o00Ooo.OooO00o("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursorQuery2, th);
                        throw th2;
                    }
                }
            } else {
                OooO0O0 oooO0O0OooO0oO = oooO00o.OooO0oO(db);
                if (!oooO0O0OooO0oO.f35885OooO00o) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + oooO0O0OooO0oO.f35886OooO0O0);
                }
                oooO00o.OooO0o0();
                OooO0oO(db);
            }
            oooO00o.OooO0Oo(db);
            this.f35880OooO0O0 = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(cursorQuery, th3);
                throw th4;
            }
        }
    }

    public final void OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String hash = this.f35882OooO0Oo;
        Intrinsics.checkNotNullParameter(hash, "hash");
        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
    }
}
