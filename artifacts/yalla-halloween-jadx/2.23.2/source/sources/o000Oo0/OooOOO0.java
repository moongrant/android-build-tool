package o000Oo0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.media3.database.DatabaseIOException;
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
import p022Oooo00O.o00O00OO;
import p080o000OoO.o00;
import p080o000OoO.o00Ooo;
import p083o000Ooo.o00O000;
import p083o000Ooo.o00oOoo;
import p083o000Ooo.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap<String, OooOO0O> f34813OooO00o = new HashMap<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<String> f34814OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseBooleanArray f34815OooO0OO = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SparseBooleanArray f34816OooO0Oo = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO f34817OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f34818OooO0o0;

    public static final class OooO00o implements OooO0OO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final String[] f34819OooO0o0 = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O0ooO f34820OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final SparseArray<OooOO0O> f34821OooO0O0 = new SparseArray<>();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public String f34822OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public String f34823OooO0Oo;

        public OooO00o(o00oOoo o00oooo2) {
            this.f34820OooO00o = o00oooo2;
        }

        public final void OooO(SQLiteDatabase sQLiteDatabase, OooOO0O oooOO0O) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OooOOO0.OooO0O0(oooOO0O.f34810OooO0o0, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(oooOO0O.f34806OooO00o));
            contentValues.put("key", oooOO0O.f34807OooO0O0);
            contentValues.put("metadata", byteArray);
            String str = this.f34823OooO0Oo;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final boolean OooO00o() throws DatabaseIOException {
            try {
                SQLiteDatabase readableDatabase = this.f34820OooO00o.getReadableDatabase();
                String str = this.f34822OooO0OO;
                str.getClass();
                return o00O000.OooO00o(readableDatabase, 1, str) != -1;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0O0(HashMap<String, OooOO0O> map) throws IOException {
            SparseArray<OooOO0O> sparseArray = this.f34821OooO0O0;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f34820OooO00o.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        OooOO0O oooOO0OValueAt = sparseArray.valueAt(i);
                        if (oooOO0OValueAt == null) {
                            int iKeyAt = sparseArray.keyAt(i);
                            String str = this.f34823OooO0Oo;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                        } else {
                            OooO(writableDatabase, oooOO0OValueAt);
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

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0OO(long j) {
            String hexString = Long.toHexString(j);
            this.f34822OooO0OO = hexString;
            this.f34823OooO0Oo = o00O00OO.OooO00o("ExoPlayerCacheIndex", hexString);
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0Oo(HashMap<String, OooOO0O> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f34820OooO00o.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    OooOO0(writableDatabase);
                    Iterator<OooOO0O> it = map.values().iterator();
                    while (it.hasNext()) {
                        OooO(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f34821OooO0O0.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0o(OooOO0O oooOO0O, boolean z) {
            SparseArray<OooOO0O> sparseArray = this.f34821OooO0O0;
            int i = oooOO0O.f34806OooO00o;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0o0(OooOO0O oooOO0O) {
            this.f34821OooO0O0.put(oooOO0O.f34806OooO00o, oooOO0O);
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0oO(HashMap<String, OooOO0O> map, SparseArray<String> sparseArray) throws IOException {
            o0O0ooO o0o0ooo = this.f34820OooO00o;
            p080o000OoO.o00Oo0.OooO0Oo(this.f34821OooO0O0.size() == 0);
            try {
                SQLiteDatabase readableDatabase = o0o0ooo.getReadableDatabase();
                String str = this.f34822OooO0OO;
                str.getClass();
                if (o00O000.OooO00o(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = o0o0ooo.getWritableDatabase();
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
                SQLiteDatabase readableDatabase2 = o0o0ooo.getReadableDatabase();
                String str2 = this.f34823OooO0Oo;
                str2.getClass();
                Cursor cursorQuery = readableDatabase2.query(str2, f34819OooO0o0, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        int i = cursorQuery.getInt(0);
                        String string = cursorQuery.getString(1);
                        string.getClass();
                        map.put(string, new OooOO0O(i, string, OooOOO0.OooO00o(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
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

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0oo() throws DatabaseIOException {
            o0O0ooO o0o0ooo = this.f34820OooO00o;
            String str = this.f34822OooO0OO;
            str.getClass();
            try {
                String strConcat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = o0o0ooo.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    int i = o00O000.f35002OooO00o;
                    try {
                        if (o00.OoooO(writableDatabase, "ExoPlayerVersions")) {
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
            String str = this.f34822OooO0OO;
            str.getClass();
            o00O000.OooO0O0(sQLiteDatabase, 1, str, 1);
            String str2 = this.f34823OooO0Oo;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f34823OooO0Oo + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    public static class OooO0O0 implements OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f34824OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Cipher f34825OooO0O0 = null;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final SecretKeySpec f34826OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final SecureRandom f34827OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f34828OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o00Ooo f34829OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public o000oOoO f34830OooO0oO;

        public OooO0O0(File file) {
            this.f34829OooO0o0 = new o00Ooo(file);
        }

        public static int OooO(OooOO0O oooOO0O, int i) {
            int iHashCode = oooOO0O.f34807OooO0O0.hashCode() + (oooOO0O.f34806OooO00o * 31);
            if (i >= 2) {
                return (iHashCode * 31) + oooOO0O.f34810OooO0o0.hashCode();
            }
            long jOooO00o = OooOOO.OooO00o(oooOO0O.f34810OooO0o0);
            return (iHashCode * 31) + ((int) (jOooO00o ^ (jOooO00o >>> 32)));
        }

        public static OooOO0O OooOO0(int i, DataInputStream dataInputStream) throws IOException {
            OooOo oooOoOooO00o;
            int i2 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i < 2) {
                long j = dataInputStream.readLong();
                OooOo00 oooOo00 = new OooOo00();
                Long lValueOf = Long.valueOf(j);
                HashMap map = oooOo00.f34834OooO00o;
                lValueOf.getClass();
                map.put("exo_len", lValueOf);
                oooOo00.f34835OooO0O0.remove("exo_len");
                oooOoOooO00o = OooOo.f34831OooO0OO.OooO00o(oooOo00);
            } else {
                oooOoOooO00o = OooOOO0.OooO00o(dataInputStream);
            }
            return new OooOO0O(i2, utf, oooOoOooO00o);
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final boolean OooO00o() {
            o00Ooo o00ooo2 = this.f34829OooO0o0;
            return o00ooo2.f34987OooO00o.exists() || o00ooo2.f34988OooO0O0.exists();
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0O0(HashMap<String, OooOO0O> map) throws Throwable {
            if (this.f34828OooO0o) {
                OooO0Oo(map);
            }
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0OO(long j) {
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0Oo(HashMap<String, OooOO0O> map) throws Throwable {
            DataOutputStream dataOutputStream;
            Cipher cipher = this.f34825OooO0O0;
            o00Ooo o00ooo2 = this.f34829OooO0o0;
            try {
                o00Ooo.OooO00o OooO00o2 = o00ooo2.OooO00o();
                o000oOoO o000oooo2 = this.f34830OooO0oO;
                if (o000oooo2 == null) {
                    this.f34830OooO0oO = new o000oOoO(OooO00o2);
                } else {
                    o000oooo2.OooO00o(OooO00o2);
                }
                o000oOoO o000oooo3 = this.f34830OooO0oO;
                dataOutputStream = new DataOutputStream(o000oooo3);
                try {
                    dataOutputStream.writeInt(2);
                    boolean z = this.f34824OooO00o;
                    dataOutputStream.writeInt(z ? 1 : 0);
                    if (z) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f34827OooO0Oo;
                        int i = o00.f34910OooO00o;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            cipher.init(1, this.f34826OooO0OO, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(o000oooo3, cipher));
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
                    for (OooOO0O oooOO0O : map.values()) {
                        dataOutputStream.writeInt(oooOO0O.f34806OooO00o);
                        dataOutputStream.writeUTF(oooOO0O.f34807OooO0O0);
                        OooOOO0.OooO0O0(oooOO0O.f34810OooO0o0, dataOutputStream);
                        iOooO += OooO(oooOO0O, 2);
                    }
                    dataOutputStream.writeInt(iOooO);
                    dataOutputStream.close();
                    o00ooo2.f34988OooO0O0.delete();
                    int i2 = o00.f34910OooO00o;
                    this.f34828OooO0o = false;
                } catch (Throwable th) {
                    th = th;
                    o00.OooO0oO(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0o(OooOO0O oooOO0O, boolean z) {
            this.f34828OooO0o = true;
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0o0(OooOO0O oooOO0O) {
            this.f34828OooO0o = true;
        }

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0oO(HashMap<String, OooOO0O> map, SparseArray<String> sparseArray) throws Throwable {
            boolean z = true;
            p080o000OoO.o00Oo0.OooO0Oo(!this.f34828OooO0o);
            o00Ooo o00ooo2 = this.f34829OooO0o0;
            boolean z2 = o00ooo2.f34987OooO00o.exists() || o00ooo2.f34988OooO0O0.exists();
            File file = o00ooo2.f34987OooO00o;
            File file2 = o00ooo2.f34988OooO0O0;
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
                                Cipher cipher = this.f34825OooO0O0;
                                if (cipher != null) {
                                    byte[] bArr = new byte[16];
                                    dataInputStream2.readFully(bArr);
                                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                                    try {
                                        SecretKeySpec secretKeySpec = this.f34826OooO0OO;
                                        int i2 = o00.f34910OooO00o;
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
                            } else if (this.f34824OooO00o) {
                                this.f34828OooO0o = true;
                            }
                            int i3 = dataInputStream2.readInt();
                            int iOooO = 0;
                            for (int i4 = 0; i4 < i3; i4++) {
                                OooOO0O oooOO0OOooOO0 = OooOO0(i, dataInputStream2);
                                String str = oooOO0OOooOO0.f34807OooO0O0;
                                map.put(str, oooOO0OOooOO0);
                                sparseArray.put(oooOO0OOooOO0.f34806OooO00o, str);
                                iOooO += OooO(oooOO0OOooOO0, i);
                            }
                            int i5 = dataInputStream2.readInt();
                            boolean z3 = dataInputStream2.read() == -1;
                            if (i5 == iOooO && z3) {
                                o00.OooO0oO(dataInputStream2);
                            }
                        }
                        o00.OooO0oO(dataInputStream2);
                    } catch (IOException unused) {
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            o00.OooO0oO(dataInputStream);
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataInputStream = dataInputStream2;
                        if (dataInputStream != null) {
                            o00.OooO0oO(dataInputStream);
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

        @Override // o000Oo0.OooOOO0.OooO0OO
        public final void OooO0oo() {
            o00Ooo o00ooo2 = this.f34829OooO0o0;
            o00ooo2.f34987OooO00o.delete();
            o00ooo2.f34988OooO0O0.delete();
        }
    }

    public interface OooO0OO {
        boolean OooO00o() throws IOException;

        void OooO0O0(HashMap<String, OooOO0O> map) throws IOException;

        void OooO0OO(long j);

        void OooO0Oo(HashMap<String, OooOO0O> map) throws IOException;

        void OooO0o(OooOO0O oooOO0O, boolean z);

        void OooO0o0(OooOO0O oooOO0O);

        void OooO0oO(HashMap<String, OooOO0O> map, SparseArray<String> sparseArray) throws IOException;

        void OooO0oo() throws IOException;
    }

    public OooOOO0(@Nullable o00oOoo o00oooo2, @Nullable File file) {
        OooO00o oooO00o = o00oooo2 != null ? new OooO00o(o00oooo2) : null;
        OooO0O0 oooO0O0 = new OooO0O0(new File(file, "cached_content_index.exi"));
        if (oooO00o != null) {
            this.f34818OooO0o0 = oooO00o;
            this.f34817OooO0o = oooO0O0;
        } else {
            int i = o00.f34910OooO00o;
            this.f34818OooO0o0 = oooO0O0;
            this.f34817OooO0o = oooO00o;
        }
    }

    public static OooOo OooO00o(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(android.support.v4.media.OooO00o.OooO00o("Invalid value size: ", i3));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = o00.f34914OooO0o;
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
        return new OooOo(map);
    }

    public static void OooO0O0(OooOo oooOo, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = oooOo.f34833OooO0O0.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    @Nullable
    public final OooOO0O OooO0OO(String str) {
        return this.f34813OooO00o.get(str);
    }

    public final OooOO0O OooO0Oo(String str) {
        HashMap<String, OooOO0O> map = this.f34813OooO00o;
        OooOO0O oooOO0O = map.get(str);
        if (oooOO0O != null) {
            return oooOO0O;
        }
        SparseArray<String> sparseArray = this.f34814OooO0O0;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        OooOO0O oooOO0O2 = new OooOO0O(iKeyAt, str, OooOo.f34831OooO0OO);
        map.put(str, oooOO0O2);
        sparseArray.put(iKeyAt, str);
        this.f34816OooO0Oo.put(iKeyAt, true);
        this.f34818OooO0o0.OooO0o0(oooOO0O2);
        return oooOO0O2;
    }

    public final void OooO0o(String str) {
        HashMap<String, OooOO0O> map = this.f34813OooO00o;
        OooOO0O oooOO0O = map.get(str);
        if (oooOO0O != null && oooOO0O.f34808OooO0OO.isEmpty() && oooOO0O.f34809OooO0Oo.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = this.f34816OooO0Oo;
            int i = oooOO0O.f34806OooO00o;
            boolean z = sparseBooleanArray.get(i);
            this.f34818OooO0o0.OooO0o(oooOO0O, z);
            SparseArray<String> sparseArray = this.f34814OooO0O0;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f34815OooO0OO.put(i, true);
            }
        }
    }

    @WorkerThread
    public final void OooO0o0(long j) throws IOException {
        OooO0OO oooO0OO;
        OooO0OO oooO0OO2 = this.f34818OooO0o0;
        oooO0OO2.OooO0OO(j);
        OooO0OO oooO0OO3 = this.f34817OooO0o;
        if (oooO0OO3 != null) {
            oooO0OO3.OooO0OO(j);
        }
        boolean zOooO00o = oooO0OO2.OooO00o();
        SparseArray<String> sparseArray = this.f34814OooO0O0;
        HashMap<String, OooOO0O> map = this.f34813OooO00o;
        if (zOooO00o || (oooO0OO = this.f34817OooO0o) == null || !oooO0OO.OooO00o()) {
            oooO0OO2.OooO0oO(map, sparseArray);
        } else {
            this.f34817OooO0o.OooO0oO(map, sparseArray);
            oooO0OO2.OooO0Oo(map);
        }
        OooO0OO oooO0OO4 = this.f34817OooO0o;
        if (oooO0OO4 != null) {
            oooO0OO4.OooO0oo();
            this.f34817OooO0o = null;
        }
    }

    @WorkerThread
    public final void OooO0oO() throws IOException {
        this.f34818OooO0o0.OooO0O0(this.f34813OooO00o);
        SparseBooleanArray sparseBooleanArray = this.f34815OooO0OO;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f34814OooO0O0.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f34816OooO0Oo.clear();
    }
}
