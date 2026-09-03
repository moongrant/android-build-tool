package androidx.room;

import Oooo000.Oooo0;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import p095o000o0Oo.oo000o;
import p713oooo00o.o0O000o0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class OooO extends SupportSQLiteOpenHelper.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public androidx.room.OooO00o f9266OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooO00o f9267OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final String f9268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final String f9269OooO0o0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f9270OooO00o;

        public OooO00o(int i) {
            this.f9270OooO00o = i;
        }

        public abstract void OooO00o(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0O0(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0OO();

        public abstract void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase);

        public abstract void OooO0o0();

        @NonNull
        public abstract OooO0O0 OooO0oO(@NonNull SupportSQLiteDatabase supportSQLiteDatabase);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f9271OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f9272OooO0O0;

        public OooO0O0(boolean z, @Nullable String str) {
            this.f9271OooO00o = z;
            this.f9272OooO0O0 = str;
        }
    }

    public OooO(@NonNull androidx.room.OooO00o oooO00o, @NonNull OooO00o oooO00o2, @NonNull String str, @NonNull String str2) {
        super(oooO00o2.f9270OooO00o);
        this.f9266OooO0O0 = oooO00o;
        this.f9267OooO0OO = oooO00o2;
        this.f9268OooO0Oo = str;
        this.f9269OooO0o0 = str2;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0O0() {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0OO(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorQuery.moveToFirst() && cursorQuery.getInt(0) == 0) {
                z = true;
            }
            cursorQuery.close();
            this.f9267OooO0OO.OooO00o(supportSQLiteDatabase);
            if (!z) {
                OooO0O0 oooO0O0OooO0oO = this.f9267OooO0OO.OooO0oO(supportSQLiteDatabase);
                if (!oooO0O0OooO0oO.f9271OooO00o) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Pre-packaged database has an invalid schema: ");
                    sbOooO0o0.append(oooO0O0OooO0oO.f9272OooO0O0);
                    throw new IllegalStateException(sbOooO0o0.toString());
                }
            }
            OooO0oO(supportSQLiteDatabase);
            this.f9267OooO0OO.OooO0OO();
        } catch (Throwable th) {
            cursorQuery.close();
            throw th;
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0Oo(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        OooO0o(supportSQLiteDatabase, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0024  */
    /* JADX WARN: Code duplicated, block: B:18:0x0034 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079 A[LOOP:1: B:11:0x001d->B:38:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:2: B:22:0x0043->B:68:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0o(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
        List listEmptyList;
        TreeMap<Integer, o0O000o0> treeMap;
        Set<Integer> setKeySet;
        Iterator<Integer> it;
        int iIntValue;
        boolean z;
        androidx.room.OooO00o oooO00o = this.f9266OooO0O0;
        boolean z2 = false;
        if (oooO00o != null) {
            RoomDatabase.OooO0OO oooO0OO = oooO00o.f9277OooO0Oo;
            Objects.requireNonNull(oooO0OO);
            if (i == i2) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z3 = i2 > i;
                ArrayList arrayList = new ArrayList();
                int i3 = i;
                while (true) {
                    if (z3) {
                        if (i3 < i2) {
                            treeMap = oooO0OO.f9315OooO00o.get(Integer.valueOf(i3));
                            if (treeMap != null) {
                                if (z3) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        iIntValue = i3;
                                        z = false;
                                        break;
                                    } else {
                                        iIntValue = it.next().intValue();
                                        if (z3 ? !(iIntValue < i2 || iIntValue >= i3) : !(iIntValue > i2 || iIntValue <= i3)) {
                                            arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z) {
                                    i3 = iIntValue;
                                }
                            }
                            listEmptyList = null;
                        } else {
                            listEmptyList = arrayList;
                        }
                    } else if (i3 > i2) {
                        treeMap = oooO0OO.f9315OooO00o.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            if (z3) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    iIntValue = i3;
                                    z = false;
                                    break;
                                } else {
                                    iIntValue = it.next().intValue();
                                    if (z3 ? !(iIntValue < i2 || iIntValue >= i3) : !(iIntValue > i2 || iIntValue <= i3)) {
                                        arrayList.add(treeMap.get(Integer.valueOf(iIntValue)));
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                i3 = iIntValue;
                            }
                        }
                        listEmptyList = null;
                    } else {
                        listEmptyList = arrayList;
                    }
                }
            }
            if (listEmptyList != null) {
                this.f9267OooO0OO.OooO0o(supportSQLiteDatabase);
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((o0O000o0) it2.next()).OooO00o(supportSQLiteDatabase);
                }
                OooO0O0 oooO0O0OooO0oO = this.f9267OooO0OO.OooO0oO(supportSQLiteDatabase);
                if (!oooO0O0OooO0oO.f9271OooO00o) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Migration didn't properly handle: ");
                    sbOooO0o0.append(oooO0O0OooO0oO.f9272OooO0O0);
                    throw new IllegalStateException(sbOooO0o0.toString());
                }
                this.f9267OooO0OO.OooO0o0();
                OooO0oO(supportSQLiteDatabase);
                z2 = true;
            }
        }
        if (z2) {
            return;
        }
        androidx.room.OooO00o oooO00o2 = this.f9266OooO0O0;
        if (oooO00o2 == null || oooO00o2.OooO00o(i, i2)) {
            throw new IllegalStateException(Oooo0.OooO00o("A migration from ", i, " to ", i2, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        this.f9267OooO0OO.OooO0O0(supportSQLiteDatabase);
        this.f9267OooO0OO.OooO00o(supportSQLiteDatabase);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO00o
    public final void OooO0o0(SupportSQLiteDatabase supportSQLiteDatabase) {
        Cursor cursorQuery = supportSQLiteDatabase.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorQuery.moveToFirst() && cursorQuery.getInt(0) != 0;
            cursorQuery.close();
            if (z) {
                Cursor cursorQuery2 = supportSQLiteDatabase.query(new oo000o("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorQuery2.moveToFirst() ? cursorQuery2.getString(0) : null;
                    cursorQuery2.close();
                    if (!this.f9268OooO0Oo.equals(string) && !this.f9269OooO0o0.equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th) {
                    cursorQuery2.close();
                    throw th;
                }
            } else {
                OooO0O0 oooO0O0OooO0oO = this.f9267OooO0OO.OooO0oO(supportSQLiteDatabase);
                if (!oooO0O0OooO0oO.f9271OooO00o) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Pre-packaged database has an invalid schema: ");
                    sbOooO0o0.append(oooO0O0OooO0oO.f9272OooO0O0);
                    throw new IllegalStateException(sbOooO0o0.toString());
                }
                this.f9267OooO0OO.OooO0o0();
                OooO0oO(supportSQLiteDatabase);
            }
            this.f9267OooO0OO.OooO0Oo(supportSQLiteDatabase);
            this.f9266OooO0O0 = null;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public final void OooO0oO(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f9268OooO0Oo + "')");
    }
}
