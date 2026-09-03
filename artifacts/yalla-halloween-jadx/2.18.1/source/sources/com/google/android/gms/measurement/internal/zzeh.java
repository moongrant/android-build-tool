package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.app.base.interfaceType.FeedbackType;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import o0OO0OoO.OooO00o;
import o0OO0OoO.Oooo0;
import o0OO0OoO.o00Oo0;
import o0OO0OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh extends oo0o0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0 f16122OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16123OooO0Oo;

    public zzeh(zzfy zzfyVar) {
        super(zzfyVar);
        Context contextZzau = this.f37615OooO00o.zzau();
        this.f37615OooO00o.zzf();
        this.f16122OooO0OO = new o00Oo0(this, contextZzau);
    }

    @Override // o0OO0OoO.oo0o0Oo
    public final boolean OooO0O0() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase OooO0OO() throws SQLiteException {
        if (this.f16123OooO0Oo) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f16122OooO0OO.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f16123OooO0Oo = true;
        return null;
    }

    @VisibleForTesting
    public final boolean OooO0Oo() {
        Context contextZzau = this.f37615OooO00o.zzau();
        this.f37615OooO00o.zzf();
        return contextZzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0131  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v19, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v21, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    @WorkerThread
    public final boolean OooO0o0(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOooO0OO;
        SQLiteException sQLiteException;
        ?? r1;
        ?? RawQuery;
        SQLiteFullException e;
        zzg();
        ?? r2 = 0;
        if (this.f16123OooO0Oo) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.f37615OooO00o.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r14 = 0;
            r14 = 0;
            ?? r15 = 0;
            r14 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseOooO0OO = OooO0OO();
                try {
                    if (sQLiteDatabaseOooO0OO == null) {
                        this.f16123OooO0Oo = true;
                        return r2;
                    }
                    sQLiteDatabaseOooO0OO.beginTransaction();
                    RawQuery = sQLiteDatabaseOooO0OO.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r14 = RawQuery;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (r14 != 0) {
                                    r14.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabaseOooO0OO.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r14 != 0) {
                                    r14.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabaseOooO0OO.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e2) {
                            e = e2;
                            try {
                                this.f37615OooO00o.zzay().zzd().zzb("Error writing entry; local database full", e);
                                this.f16123OooO0Oo = true;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                r1 = RawQuery;
                                sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                r14 = r1;
                                if (r14 != 0) {
                                    r14.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabaseOooO0OO.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            r15 = RawQuery;
                            sQLiteException = e;
                            r1 = r15;
                            sQLiteDatabase = sQLiteDatabaseOooO0OO;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                    r14 = r1;
                                    if (r14 != 0) {
                                        r14.close();
                                    }
                                    if (sQLiteDatabaseOooO0OO != null) {
                                        sQLiteDatabaseOooO0OO.close();
                                    }
                                    throw th;
                                }
                            }
                            this.f37615OooO00o.zzay().zzd().zzb("Error writing entry to local database", sQLiteException);
                            this.f16123OooO0Oo = true;
                            if (r1 != 0) {
                                r1.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            r14 = RawQuery;
                            if (r14 != 0) {
                                r14.close();
                            }
                            if (sQLiteDatabaseOooO0OO != null) {
                                sQLiteDatabaseOooO0OO.close();
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        this.f37615OooO00o.zzay().zzd().zza("Data loss, local db full");
                        long j2 = (100000 - j) + 1;
                        String[] strArr = new String[1];
                        strArr[r2] = Long.toString(j2);
                        long jDelete = sQLiteDatabaseOooO0OO.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j2) {
                            this.f37615OooO00o.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseOooO0OO.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                    sQLiteDatabaseOooO0OO.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseOooO0OO.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e4) {
                    e = e4;
                    RawQuery = 0;
                    e = e;
                    this.f37615OooO00o.zzay().zzd().zzb("Error writing entry; local database full", e);
                    this.f16123OooO0Oo = true;
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    if (sQLiteDatabaseOooO0OO != null) {
                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                        sQLiteDatabase.close();
                    }
                    i2++;
                    r2 = 0;
                } catch (SQLiteException e5) {
                    e = e5;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseOooO0OO = null;
            } catch (SQLiteFullException e6) {
                e = e6;
                sQLiteDatabaseOooO0OO = null;
                RawQuery = 0;
            } catch (SQLiteException e7) {
                sQLiteException = e7;
                r1 = 0;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabaseOooO0OO = null;
            }
        }
        Oooo0.OooO00o(this.f37615OooO00o, "Failed to write entry to local database");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0204 A[Catch: all -> 0x024e, TryCatch #25 {all -> 0x024e, blocks: (B:137:0x01fe, B:139:0x0204, B:140:0x0207, B:155:0x0231, B:147:0x0221), top: B:182:0x01fe }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0218  */
    /* JADX WARN: Code duplicated, block: B:150:0x0228  */
    /* JADX WARN: Code duplicated, block: B:157:0x0242  */
    /* JADX WARN: Code duplicated, block: B:159:0x0247 A[PHI: r9 r15
      0x0247: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:143:0x021b, B:158:0x0245, B:151:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x0247: PHI (r15v6 android.database.sqlite.SQLiteDatabase) = 
      (r15v4 android.database.sqlite.SQLiteDatabase)
      (r15v5 android.database.sqlite.SQLiteDatabase)
      (r15v7 android.database.sqlite.SQLiteDatabase)
     binds: [B:143:0x021b, B:158:0x0245, B:151:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:165:0x0253  */
    /* JADX WARN: Code duplicated, block: B:167:0x0258  */
    /* JADX WARN: Code duplicated, block: B:182:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x024a A[SYNTHETIC] */
    public final List zzi(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseOooO0OO;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        zzlc zzlcVarCreateFromParcel;
        zzac zzacVarCreateFromParcel;
        zzg();
        Cursor cursor = null;
        if (this.f16123OooO0Oo) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!OooO0Oo()) {
            return arrayList;
        }
        int i2 = 5;
        for (int i3 = 0; i3 < 5; i3++) {
            try {
                sQLiteDatabaseOooO0OO = OooO0OO();
                if (sQLiteDatabaseOooO0OO == null) {
                    this.f16123OooO0Oo = true;
                    return null;
                }
                try {
                    sQLiteDatabaseOooO0OO.beginTransaction();
                    try {
                        try {
                            cursorQuery2 = sQLiteDatabaseOooO0OO.query("messages", new String[]{"rowid"}, "type=?", new String[]{FeedbackType.Recharge}, null, null, "rowid desc", "1");
                            try {
                                long j2 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j = cursorQuery2.getLong(0);
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        cursorQuery = null;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        cursorQuery = null;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.f16123OooO0Oo = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        cursorQuery = null;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            try {
                                                if (sQLiteDatabaseOooO0OO.inTransaction()) {
                                                    sQLiteDatabaseOooO0OO.endTransaction();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.f16123OooO0Oo = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    cursorQuery2.close();
                                    j = -1;
                                }
                                if (j != -1) {
                                    str = "rowid<?";
                                    strArr = new String[]{String.valueOf(j)};
                                } else {
                                    str = null;
                                    strArr = null;
                                }
                                cursorQuery = sQLiteDatabaseOooO0OO.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j2 = cursorQuery.getLong(0);
                                        int i4 = cursorQuery.getInt(1);
                                        byte[] blob = cursorQuery.getBlob(2);
                                        if (i4 == 0) {
                                            Parcel parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    zzaw zzawVarCreateFromParcel = zzaw.CREATOR.createFromParcel(parcelObtain);
                                                    parcelObtain.recycle();
                                                    if (zzawVarCreateFromParcel != null) {
                                                        arrayList.add(zzawVarCreateFromParcel);
                                                    }
                                                } catch (SafeParcelReader.ParseException unused2) {
                                                    this.f37615OooO00o.zzay().zzd().zza("Failed to load event from local database");
                                                    parcelObtain.recycle();
                                                }
                                            } catch (Throwable th3) {
                                                parcelObtain.recycle();
                                                throw th3;
                                            }
                                        } else if (i4 == 1) {
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                    parcelObtain2.setDataPosition(0);
                                                    zzlcVarCreateFromParcel = zzlc.CREATOR.createFromParcel(parcelObtain2);
                                                    parcelObtain2.recycle();
                                                } catch (Throwable th4) {
                                                    parcelObtain2.recycle();
                                                    throw th4;
                                                }
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                this.f37615OooO00o.zzay().zzd().zza("Failed to load user property from local database");
                                                parcelObtain2.recycle();
                                                zzlcVarCreateFromParcel = null;
                                            }
                                            if (zzlcVarCreateFromParcel != null) {
                                                arrayList.add(zzlcVarCreateFromParcel);
                                            }
                                        } else if (i4 == 2) {
                                            Parcel parcelObtain3 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                    parcelObtain3.setDataPosition(0);
                                                    zzacVarCreateFromParcel = zzac.CREATOR.createFromParcel(parcelObtain3);
                                                    parcelObtain3.recycle();
                                                } catch (Throwable th5) {
                                                    parcelObtain3.recycle();
                                                    throw th5;
                                                }
                                            } catch (SafeParcelReader.ParseException unused4) {
                                                this.f37615OooO00o.zzay().zzd().zza("Failed to load conditional user property from local database");
                                                parcelObtain3.recycle();
                                                zzacVarCreateFromParcel = null;
                                            }
                                            if (zzacVarCreateFromParcel != null) {
                                                arrayList.add(zzacVarCreateFromParcel);
                                            }
                                        } else if (i4 == 3) {
                                            this.f37615OooO00o.zzay().zzk().zza("Skipping app launch break");
                                        } else {
                                            this.f37615OooO00o.zzay().zzd().zza("Unknown record type in local database");
                                        }
                                    } catch (SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.f16123OooO0Oo = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            if (sQLiteDatabaseOooO0OO.inTransaction()) {
                                                sQLiteDatabaseOooO0OO.endTransaction();
                                            }
                                        }
                                        this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.f16123OooO0Oo = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                try {
                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                        this.f37615OooO00o.zzay().zzd().zza("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    cursorQuery.close();
                                    sQLiteDatabase.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseOooO0OO != null) {
                                        sQLiteDatabaseOooO0OO.close();
                                    }
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                    this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.f16123OooO0Oo = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseOooO0OO != null) {
                                        sQLiteDatabaseOooO0OO.close();
                                    }
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                    if (sQLiteDatabaseOooO0OO != null) {
                                        if (sQLiteDatabaseOooO0OO.inTransaction()) {
                                            sQLiteDatabaseOooO0OO.endTransaction();
                                        }
                                    }
                                    this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.f16123OooO0Oo = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseOooO0OO != null) {
                                        sQLiteDatabaseOooO0OO.close();
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused7) {
                                        cursorQuery = null;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (SQLiteFullException e7) {
                                        e = e7;
                                        cursorQuery = null;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.f16123OooO0Oo = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        cursorQuery = null;
                                        sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            if (sQLiteDatabaseOooO0OO.inTransaction()) {
                                                sQLiteDatabaseOooO0OO.endTransaction();
                                            }
                                        }
                                        this.f37615OooO00o.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.f16123OooO0Oo = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseOooO0OO != null) {
                                            sQLiteDatabaseOooO0OO.close();
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase = sQLiteDatabaseOooO0OO;
                            cursorQuery2 = null;
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                    }
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase = sQLiteDatabaseOooO0OO;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    sQLiteDatabase = sQLiteDatabaseOooO0OO;
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLiteDatabase = sQLiteDatabaseOooO0OO;
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteDatabase = sQLiteDatabaseOooO0OO;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursorQuery = null;
                sQLiteDatabaseOooO0OO = null;
            } catch (SQLiteFullException e11) {
                e = e11;
                cursorQuery = null;
                sQLiteDatabaseOooO0OO = null;
            } catch (SQLiteException e12) {
                e = e12;
                cursorQuery = null;
                sQLiteDatabaseOooO0OO = null;
            } catch (Throwable th13) {
                th = th13;
                sQLiteDatabase = null;
            }
        }
        OooO00o.OooO0O0(this.f37615OooO00o, "Failed to read events from database in reasonable time");
        return null;
    }

    @WorkerThread
    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO();
            if (sQLiteDatabaseOooO0OO == null || (iDelete = sQLiteDatabaseOooO0OO.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f37615OooO00o.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.f37615OooO00o.zzay().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return OooO0o0(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzm() {
        zzg();
        if (!this.f16123OooO0Oo && OooO0Oo()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO();
                        if (sQLiteDatabaseOooO0OO == null) {
                            this.f16123OooO0Oo = true;
                            return false;
                        }
                        sQLiteDatabaseOooO0OO.beginTransaction();
                        sQLiteDatabaseOooO0OO.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                        sQLiteDatabaseOooO0OO.endTransaction();
                        sQLiteDatabaseOooO0OO.close();
                        return true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e) {
                    this.f37615OooO00o.zzay().zzd().zzb("Error deleting app launch break from local database", e);
                    this.f16123OooO0Oo = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.f37615OooO00o.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.f16123OooO0Oo = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            OooO00o.OooO0O0(this.f37615OooO00o, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrOooo00O = this.f37615OooO00o.zzv().Oooo00O(zzacVar);
        if (bArrOooo00O.length <= 131072) {
            return OooO0o0(2, bArrOooo00O);
        }
        this.f37615OooO00o.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzax.OooO00o(zzawVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return OooO0o0(0, bArrMarshall);
        }
        this.f37615OooO00o.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlc zzlcVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzld.OooO00o(zzlcVar, parcelObtain);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return OooO0o0(1, bArrMarshall);
        }
        this.f37615OooO00o.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
