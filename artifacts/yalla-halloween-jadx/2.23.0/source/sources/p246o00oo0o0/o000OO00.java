package p246o00oo0o0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.compose.ui.graphics.o0o0Oo;
import com.google.android.exoplayer2.database.DatabaseIOException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p204o00o0oO.o00O00O;
import p204o00o0oO.o00O00OO;
import p204o00o0oO.oOO00O;
import p245o00oo0o.o00O00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<String, o000O> f40698OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<String> f40699OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseBooleanArray f40700OooO0OO = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseBooleanArray f40701OooO0Oo = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f40702OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f40703OooO0o0;

    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final String[] f40704OooO0o0 = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o00O00O f40705OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<o000O> f40706OooO0O0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f40707OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f40708OooO0Oo;

        public OooO00o(oOO00O ooo00o) {
            this.f40705OooO00o = ooo00o;
        }

        public final void OooO(SQLiteDatabase sQLiteDatabase, o000O o000o) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            o000OO00.OooO0O0(o000o.f40681OooO0o0, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(o000o.f40677OooO00o));
            contentValues.put("key", o000o.f40678OooO0O0);
            contentValues.put("metadata", byteArray);
            String str = this.f40708OooO0Oo;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO00o(o000O o000o, boolean z) {
            SparseArray<o000O> sparseArray = this.f40706OooO0O0;
            int i = o000o.f40677OooO00o;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final boolean OooO0O0() throws DatabaseIOException {
            try {
                SQLiteDatabase readableDatabase = this.f40705OooO00o.getReadableDatabase();
                String str = this.f40707OooO0OO;
                str.getClass();
                return o00O00OO.OooO00o(readableDatabase, 1, str) != -1;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0OO(HashMap<String, o000O> map) throws IOException {
            SparseArray<o000O> sparseArray = this.f40706OooO0O0;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f40705OooO00o.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        o000O o000oValueAt = sparseArray.valueAt(i);
                        if (o000oValueAt == null) {
                            int iKeyAt = sparseArray.keyAt(i);
                            String str = this.f40708OooO0Oo;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            OooO(writableDatabase, o000oValueAt);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0Oo(long j) {
            String hexString = Long.toHexString(j);
            this.f40707OooO0OO = hexString;
            this.f40708OooO0Oo = p022Oooo00O.o00O00OO.OooO00o("ExoPlayerCacheIndex", hexString);
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0o(o000O o000o) {
            this.f40706OooO0O0.put(o000o.f40677OooO00o, o000o);
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0o0(HashMap<String, o000O> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f40705OooO00o.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    OooOO0(writableDatabase);
                    Iterator<o000O> it = map.values().iterator();
                    while (it.hasNext()) {
                        OooO(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f40706OooO0O0.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0oO(HashMap<String, o000O> map, SparseArray<String> sparseArray) throws IOException {
            o00O00O o00o00o2 = this.f40705OooO00o;
            o00O000o.OooO0Oo(this.f40706OooO0O0.size() == 0);
            try {
                SQLiteDatabase readableDatabase = o00o00o2.getReadableDatabase();
                String str = this.f40707OooO0OO;
                str.getClass();
                if (o00O00OO.OooO00o(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = o00o00o2.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        OooOO0(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = o00o00o2.getReadableDatabase();
                String str2 = this.f40708OooO0Oo;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, f40704OooO0o0, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new o000O(i, string, o000OO00.OooO00o(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                        sparseArray.put(i, string);
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                }
                cursorQuery.close();
            } catch (SQLiteException e) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e);
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0oo() throws DatabaseIOException {
            o00O00O o00o00o2 = this.f40705OooO00o;
            String str = this.f40707OooO0OO;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = o00o00o2.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i = o00O00OO.f39306OooO00o;
                    try {
                        int i2 = o0O00.f40595OooO00o;
                        if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                            writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                        }
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (SQLException e) {
                        throw new DatabaseIOException(e);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        public final void OooOO0(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            String str = this.f40707OooO0OO;
            str.getClass();
            o00O00OO.OooO0O0(sQLiteDatabase, 1, str);
            String str2 = this.f40708OooO0Oo;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f40708OooO0Oo + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public static class OooO0O0 implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f40709OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Cipher f40710OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final SecretKeySpec f40711OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final SecureRandom f40712OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f40713OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00O00 f40714OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o00O000 f40715OooO0oO;

        public OooO0O0(File file) {
            this.f40714OooO0o0 = new o00O00(file);
        }

        public static int OooO(o000O o000o, int i) {
            int iHashCode = o000o.f40678OooO0O0.hashCode() + (o000o.f40677OooO00o * 31);
            if (i >= 2) {
                return (iHashCode * 31) + o000o.f40681OooO0o0.hashCode();
            }
            long jOooO00o = o0o0Oo.OooO00o(o000o.f40681OooO0o0);
            return (iHashCode * 31) + ((int) (jOooO00o ^ (jOooO00o >>> 32)));
        }

        public static o000O OooOO0(int i, DataInputStream dataInputStream) throws IOException {
            o00O0000 o00o0000OooO00o;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                o00 o00Var = new o00();
                Long lValueOf = Long.valueOf(j);
                HashMap map = o00Var.f40675OooO00o;
                lValueOf.getClass();
                map.put("exo_len", lValueOf);
                o00Var.f40676OooO0O0.remove("exo_len");
                o00o0000OooO00o = o00O0000.f40726OooO0OO.OooO00o(o00Var);
            } else {
                o00o0000OooO00o = o000OO00.OooO00o(dataInputStream);
            }
            return new o000O(i2, utf, o00o0000OooO00o);
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO00o(o000O o000o, boolean z) {
            this.f40713OooO0o = true;
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final boolean OooO0O0() {
            o00O00 o00o01 = this.f40714OooO0o0;
            return o00o01.f40557OooO00o.exists() || o00o01.f40558OooO0O0.exists();
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0OO(HashMap<String, o000O> map) throws Throwable {
            if (this.f40713OooO0o) {
                OooO0o0(map);
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0Oo(long j) {
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0o(o000O o000o) {
            this.f40713OooO0o = true;
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0o0(HashMap<String, o000O> map) throws Throwable {
            DataOutputStream dataOutputStream;
            Cipher cipher = this.f40710OooO0O0;
            o00O00 o00o01 = this.f40714OooO0o0;
            try {
                o00O00.OooO00o OooO00o2 = o00o01.OooO00o();
                o00O000 o00o001 = this.f40715OooO0oO;
                if (o00o001 == null) {
                    this.f40715OooO0oO = new o00O000(OooO00o2);
                } else {
                    o00o001.OooO00o(OooO00o2);
                }
                o00O000 o00o002 = this.f40715OooO0oO;
                dataOutputStream = new DataOutputStream(o00o002);
                try {
                    dataOutputStream.writeInt(2);
                    boolean z = this.f40709OooO00o;
                    dataOutputStream.writeInt(z ? 1 : 0);
                    if (z) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f40712OooO0Oo;
                        int i = o0O00.f40595OooO00o;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            cipher.init(1, this.f40711OooO0OO, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(o00o002, cipher));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream.writeInt(map.size());
                    int iOooO = 0;
                    for (o000O o000o : map.values()) {
                        dataOutputStream.writeInt(o000o.f40677OooO00o);
                        dataOutputStream.writeUTF(o000o.f40678OooO0O0);
                        o000OO00.OooO0O0(o000o.f40681OooO0o0, dataOutputStream);
                        iOooO += OooO(o000o, 2);
                    }
                    dataOutputStream.writeInt(iOooO);
                    dataOutputStream.close();
                    o00o01.f40558OooO0O0.delete();
                    int i2 = o0O00.f40595OooO00o;
                    this.f40713OooO0o = false;
                } catch (Throwable th) {
                    th = th;
                    o0O00.OooO0oO(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0oO(HashMap<String, o000O> map, SparseArray<String> sparseArray) throws Throwable {
            boolean z = true;
            o00O000o.OooO0Oo(!this.f40713OooO0o);
            o00O00 o00o01 = this.f40714OooO0o0;
            boolean z2 = o00o01.f40557OooO00o.exists() || o00o01.f40558OooO0O0.exists();
            File file = o00o01.f40557OooO00o;
            File file2 = o00o01.f40558OooO0O0;
            if (z2) {
                DataInputStream dataInputStream = null;
                try {
                    if (file2.exists()) {
                        file.delete();
                        file2.renameTo(file);
                    }
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                    try {
                        int i = dataInputStream2.readInt();
                        if (i >= 0 && i <= 2) {
                            if ((dataInputStream2.readInt() & 1) != 0) {
                                Cipher cipher = this.f40710OooO0O0;
                                if (cipher != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.f40711OooO0OO;
                                        int i2 = o0O00.f40595OooO00o;
                                        cipher.init(2, secretKeySpec, ivParameterSpec);
                                        dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                                    } catch (InvalidAlgorithmParameterException e) {
                                        e = e;
                                        throw new IllegalStateException(e);
                                    } catch (InvalidKeyException e2) {
                                        e = e2;
                                        throw new IllegalStateException(e);
                                    }
                                }
                            } else if (this.f40709OooO00o) {
                                this.f40713OooO0o = true;
                            }
                            int i3 = dataInputStream2.readInt();
                            int iOooO = 0;
                            for (int i4 = 0; i4 < i3; i4++) {
                                o000O o000oOooOO0 = OooOO0(i, dataInputStream2);
                                String str = o000oOooOO0.f40678OooO0O0;
                                map.put(str, o000oOooOO0);
                                sparseArray.put(o000oOooOO0.f40677OooO00o, str);
                                iOooO += OooO(o000oOooOO0, i);
                            }
                            int i5 = dataInputStream2.readInt();
                            boolean z3 = dataInputStream2.read() == -1;
                            if (i5 == iOooO && z3) {
                                o0O00.OooO0oO(dataInputStream2);
                            }
                        }
                        o0O00.OooO0oO(dataInputStream2);
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            o0O00.OooO0oO(dataInputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            o0O00.OooO0oO(dataInputStream);
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
                z = false;
            }
            if (z) {
                return;
            }
            map.clear();
            sparseArray.clear();
            file.delete();
            file2.delete();
        }

        @Override // o00oo0o0.o000OO00.OooO0OO
        public final void OooO0oo() {
            o00O00 o00o01 = this.f40714OooO0o0;
            o00o01.f40557OooO00o.delete();
            o00o01.f40558OooO0O0.delete();
        }
    }

    public interface OooO0OO {
        void OooO00o(o000O o000o, boolean z);

        boolean OooO0O0() throws IOException;

        void OooO0OO(HashMap<String, o000O> map) throws IOException;

        void OooO0Oo(long j);

        void OooO0o(o000O o000o);

        void OooO0o0(HashMap<String, o000O> map) throws IOException;

        void OooO0oO(HashMap<String, o000O> map, SparseArray<String> sparseArray) throws IOException;

        void OooO0oo() throws IOException;
    }

    public o000OO00(@Nullable oOO00O ooo00o, @Nullable File file) {
        OooO00o oooO00o = new OooO00o(ooo00o);
        OooO0O0 oooO0O0 = new OooO0O0(new File(file, "cached_content_index.exi"));
        this.f40703OooO0o0 = oooO00o;
        this.f40702OooO0o = oooO0O0;
    }

    public static o00O0000 OooO00o(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(android.support.v4.media.OooO00o.OooO00o("Invalid value size: ", i3));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = o0O00.f40599OooO0o;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new o00O0000(map);
    }

    public static void OooO0O0(o00O0000 o00o0001, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = o00o0001.f40728OooO0O0.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Nullable
    public final o000O OooO0OO(String str) {
        return this.f40698OooO00o.get(str);
    }

    public final o000O OooO0Oo(String str) {
        HashMap<String, o000O> map = this.f40698OooO00o;
        o000O o000o = map.get(str);
        if (o000o != null) {
            return o000o;
        }
        SparseArray<String> sparseArray = this.f40699OooO0O0;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        o000O o000o2 = new o000O(iKeyAt, str, o00O0000.f40726OooO0OO);
        map.put(str, o000o2);
        sparseArray.put(iKeyAt, str);
        this.f40701OooO0Oo.put(iKeyAt, true);
        this.f40703OooO0o0.OooO0o(o000o2);
        return o000o2;
    }

    public final void OooO0o(String str) {
        HashMap<String, o000O> map = this.f40698OooO00o;
        o000O o000o = map.get(str);
        if (o000o != null && o000o.f40679OooO0OO.isEmpty() && o000o.f40680OooO0Oo.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = this.f40701OooO0Oo;
            int i = o000o.f40677OooO00o;
            boolean z = sparseBooleanArray.get(i);
            this.f40703OooO0o0.OooO00o(o000o, z);
            SparseArray<String> sparseArray = this.f40699OooO0O0;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f40700OooO0OO.put(i, true);
            }
        }
    }

    @WorkerThread
    public final void OooO0o0(long j) throws IOException {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2 = this.f40703OooO0o0;
        oooO0OO2.OooO0Oo(j);
        OooO0OO oooO0OO3 = this.f40702OooO0o;
        if (oooO0OO3 != null) {
            oooO0OO3.OooO0Oo(j);
        }
        boolean zOooO0O0 = oooO0OO2.OooO0O0();
        SparseArray<String> sparseArray = this.f40699OooO0O0;
        HashMap<String, o000O> map = this.f40698OooO00o;
        if (zOooO0O0 || (oooO0OO = this.f40702OooO0o) == null || !oooO0OO.OooO0O0()) {
            oooO0OO2.OooO0oO(map, sparseArray);
        } else {
            this.f40702OooO0o.OooO0oO(map, sparseArray);
            oooO0OO2.OooO0o0(map);
        }
        OooO0OO oooO0OO4 = this.f40702OooO0o;
        if (oooO0OO4 != null) {
            oooO0OO4.OooO0oo();
            this.f40702OooO0o = null;
        }
    }

    @WorkerThread
    public final void OooO0oO() throws IOException {
        this.f40703OooO0o0.OooO0OO(this.f40698OooO00o);
        SparseBooleanArray sparseBooleanArray = this.f40700OooO0OO;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f40699OooO0O0.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f40701OooO0Oo.clear();
    }
}
