package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import p271o00ooooo.oOOoOOO0;
import p271o00ooooo.oOo00o0o;

/* JADX INFO: loaded from: classes3.dex */
public final class zzem extends oOo00o0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oOOoOOO0 f15442OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15443OooO0Oo;

    public zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context contextZzaw = this.f40788OooO00o.zzaw();
        this.f40788OooO00o.zzf();
        this.f15442OooO0OO = new oOOoOOO0(this, contextZzaw);
    }

    @Override // p271o00ooooo.oOo00o0o
    public final boolean OooO0O0() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase OooO0OO() throws SQLiteException {
        if (this.f15443OooO0Oo) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f15442OooO0OO.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f15443OooO0Oo = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0110  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:83:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x012a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @WorkerThread
    public final boolean OooO0Oo(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseOooO0OO;
        ?? RawQuery;
        SQLiteFullException e;
        ?? r6;
        long j;
        zzg();
        if (this.f15443OooO0Oo) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        zzgd zzgdVar = this.f40788OooO00o;
        zzgdVar.zzf();
        int i2 = 0;
        ?? r3 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r15 = 0;
            String str = null;
            r15 = 0;
            r15 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseOooO0OO = OooO0OO();
                try {
                    if (sQLiteDatabaseOooO0OO == null) {
                        this.f15443OooO0Oo = true;
                        return r3;
                    }
                    sQLiteDatabaseOooO0OO.beginTransaction();
                    RawQuery = sQLiteDatabaseOooO0OO.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r3);
                            } else {
                                j = 0;
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r15 = RawQuery;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (r15 != 0) {
                                    r15.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabaseOooO0OO.close();
                                }
                                i2++;
                                r3 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r15 != 0) {
                                    r15.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabaseOooO0OO.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e2) {
                            e = e2;
                            try {
                                zzgdVar.zzaA().zzd().zzb("Error writing entry; local database full", e);
                                this.f15443OooO0Oo = true;
                                if (RawQuery != 0) {
                                    RawQuery.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r3 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteDatabase = sQLiteDatabaseOooO0OO;
                                sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                r15 = RawQuery;
                                if (r15 != 0) {
                                    r15.close();
                                }
                                if (sQLiteDatabaseOooO0OO != null) {
                                    sQLiteDatabaseOooO0OO.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            r6 = RawQuery;
                            sQLiteDatabase = sQLiteDatabaseOooO0OO;
                            RawQuery = r6;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteDatabaseOooO0OO = sQLiteDatabase;
                                    r15 = RawQuery;
                                    if (r15 != 0) {
                                        r15.close();
                                    }
                                    if (sQLiteDatabaseOooO0OO != null) {
                                        sQLiteDatabaseOooO0OO.close();
                                    }
                                    throw th;
                                }
                            }
                            zzgdVar.zzaA().zzd().zzb("Error writing entry to local database", e);
                            this.f15443OooO0Oo = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r3 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            r15 = RawQuery;
                            if (r15 != 0) {
                                r15.close();
                            }
                            if (sQLiteDatabaseOooO0OO != null) {
                                sQLiteDatabaseOooO0OO.close();
                            }
                            throw th;
                        }
                    } else {
                        j = 0;
                    }
                    if (j >= 100000) {
                        zzgdVar.zzaA().zzd().zza("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j2 = (100000 - j) + 1;
                        strArr[r3] = Long.toString(j2);
                        long jDelete = sQLiteDatabaseOooO0OO.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j2) {
                            zzgdVar.zzaA().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                        str = null;
                    }
                    sQLiteDatabaseOooO0OO.insertOrThrow("messages", str, contentValues);
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
                    zzgdVar.zzaA().zzd().zzb("Error writing entry; local database full", e);
                    this.f15443OooO0Oo = true;
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    if (sQLiteDatabaseOooO0OO != null) {
                        sQLiteDatabase = sQLiteDatabaseOooO0OO;
                        sQLiteDatabase.close();
                    }
                    i2++;
                    r3 = 0;
                } catch (SQLiteException e5) {
                    e = e5;
                    r6 = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseOooO0OO = null;
            } catch (SQLiteFullException e6) {
                e = e6;
                sQLiteDatabaseOooO0OO = null;
                RawQuery = 0;
            } catch (SQLiteException e7) {
                e = e7;
                RawQuery = 0;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabaseOooO0OO = null;
                if (r15 != 0) {
                    r15.close();
                }
                if (sQLiteDatabaseOooO0OO != null) {
                    sQLiteDatabaseOooO0OO.close();
                }
                throw th;
            }
        }
        zzgdVar.zzaA().zzj().zza("Failed to write entry to local database");
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6331. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.util.List zzi(int r24) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzi(int):java.util.List");
    }

    @WorkerThread
    public final void zzj() {
        int iDelete;
        zzgd zzgdVar = this.f40788OooO00o;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO();
            if (sQLiteDatabaseOooO0OO == null || (iDelete = sQLiteDatabaseOooO0OO.delete("messages", null, null)) <= 0) {
                return;
            }
            zzgdVar.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            zzgdVar.zzaA().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return OooO0Oo(3, new byte[0]);
    }

    @WorkerThread
    public final boolean zzm() {
        zzg();
        if (this.f15443OooO0Oo) {
            return false;
        }
        zzgd zzgdVar = this.f40788OooO00o;
        Context contextZzaw = zzgdVar.zzaw();
        zzgdVar.zzf();
        if (contextZzaw.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseOooO0OO = OooO0OO();
                        if (sQLiteDatabaseOooO0OO == null) {
                            this.f15443OooO0Oo = true;
                            return false;
                        }
                        sQLiteDatabaseOooO0OO.beginTransaction();
                        sQLiteDatabaseOooO0OO.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseOooO0OO.setTransactionSuccessful();
                        sQLiteDatabaseOooO0OO.endTransaction();
                        sQLiteDatabaseOooO0OO.close();
                        return true;
                    } catch (SQLiteFullException e) {
                        zzgdVar.zzaA().zzd().zzb("Error deleting app launch break from local database", e);
                        this.f15443OooO0Oo = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
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
                    zzgdVar.zzaA().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.f15443OooO0Oo = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            zzgdVar.zzaA().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        zzgd zzgdVar = this.f40788OooO00o;
        zzgdVar.zzv().getClass();
        byte[] bArrOooo000 = zzlp.Oooo000(zzacVar);
        if (bArrOooo000.length <= 131072) {
            return OooO0Oo(2, bArrOooo000);
        }
        zzgdVar.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzav.OooO00o(zzauVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return OooO0Oo(0, bArrMarshall);
        }
        this.f40788OooO00o.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzll.OooO00o(zzlkVar, parcelObtain);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return OooO0Oo(1, bArrMarshall);
        }
        this.f40788OooO00o.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
