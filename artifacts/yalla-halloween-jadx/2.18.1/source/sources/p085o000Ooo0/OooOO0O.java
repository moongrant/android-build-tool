package p085o000Ooo0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements Closeable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final RandomAccessFile f28394Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final File f28395Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f28396Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final File f28397Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final FileLock f28398OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final FileChannel f28399OoooO00;

    public static class OooO00o extends File {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public long f28400Oooo0o;

        public OooO00o(File file, String str) {
            super(file, str);
            this.f28400Oooo0o = -1L;
        }
    }

    public OooOO0O(File file, File file2) throws IOException {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MultiDexExtractor(");
        sbOooO0o0.append(file.getPath());
        sbOooO0o0.append(", ");
        sbOooO0o0.append(file2.getPath());
        sbOooO0o0.append(")");
        Log.i("MultiDex", sbOooO0o0.toString());
        this.f28395Oooo0o = file;
        this.f28397Oooo0oo = file2;
        this.f28396Oooo0oO = OooO0o(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f28394Oooo = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f28399OoooO00 = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f28398OoooO0 = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                OooO00o(this.f28399OoooO00);
                throw e;
            } catch (Error e2) {
                e = e2;
                OooO00o(this.f28399OoooO00);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                OooO00o(this.f28399OoooO00);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            OooO00o(this.f28394Oooo);
            throw e4;
        }
    }

    public static void OooO00o(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    public static void OooO0O0(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(OooOo00.OooO0Oo("tmp-", str), ".zip", file.getParentFile());
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Extracting ");
        sbOooO0o0.append(fileCreateTempFile.getPath());
        Log.i("MultiDex", sbOooO0o0.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    OooO00o(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            OooO00o(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    public static long OooO0Oo(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long OooO0o(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            OooOOO0.OooO00o OooO00o2 = OooOOO0.OooO00o(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = OooO00o2.f28402OooO0O0;
            randomAccessFile.seek(OooO00o2.f28401OooO00o);
            byte[] bArr = new byte[16384];
            int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            while (i != -1) {
                crc32.update(bArr, 0, i);
                j -= (long) i;
                if (j == 0) {
                    break;
                }
                i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static void OooOOoo(Context context, long j, long j2, List list) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            OooO00o oooO00o = (OooO00o) it.next();
            editorEdit.putLong("dex.crc." + i, oooO00o.f28400Oooo0o);
            editorEdit.putLong("dex.time." + i, oooO00o.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    public final List OooO0oo(Context context, boolean z) throws IOException {
        List<OooO00o> listOooOOo;
        List<OooO00o> listOooOOO;
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MultiDexExtractor.load(");
        sbOooO0o0.append(this.f28395Oooo0o.getPath());
        sbOooO0o0.append(", ");
        sbOooO0o0.append(z);
        sbOooO0o0.append(", ");
        sbOooO0o0.append("");
        sbOooO0o0.append(")");
        Log.i("MultiDex", sbOooO0o0.toString());
        if (!this.f28398OoooO0.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            listOooOOo = OooOOo();
            OooOOoo(context, OooO0Oo(this.f28395Oooo0o), this.f28396Oooo0oO, listOooOOo);
            listOooOOO = listOooOOo;
        } else {
            File file = this.f28395Oooo0o;
            long j = this.f28396Oooo0oO;
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            if ((sharedPreferences.getLong("timestamp", -1L) == OooO0Oo(file) && sharedPreferences.getLong("crc", -1L) == j) ? false : true) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                listOooOOo = OooOOo();
                OooOOoo(context, OooO0Oo(this.f28395Oooo0o), this.f28396Oooo0oO, listOooOOo);
            } else {
                try {
                    listOooOOO = OooOOO(context);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    listOooOOo = OooOOo();
                    OooOOoo(context, OooO0Oo(this.f28395Oooo0o), this.f28396Oooo0oO, listOooOOo);
                    listOooOOO = listOooOOo;
                }
            }
            listOooOOO = listOooOOo;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("load found ");
        sbOooO0o1.append(listOooOOO.size());
        sbOooO0o1.append(" secondary dex files");
        Log.i("MultiDex", sbOooO0o1.toString());
        return listOooOOO;
    }

    public final List OooOOO(Context context) throws IOException {
        OooOO0O oooOO0O = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = oooOO0O.f28395Oooo0o.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            OooO00o oooO00o = new OooO00o(oooOO0O.f28397Oooo0oo, OooO0O0.OooO00o.OooO00o(str, i2, ".zip"));
            if (!oooO00o.isFile()) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Missing extracted secondary dex file '");
                sbOooO0o0.append(oooO00o.getPath());
                sbOooO0o0.append("'");
                throw new IOException(sbOooO0o0.toString());
            }
            oooO00o.f28400Oooo0o = OooO0o(oooO00o);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long jLastModified = oooO00o.lastModified();
            if (j2 == jLastModified) {
                String str2 = str;
                if (j == oooO00o.f28400Oooo0o) {
                    arrayList.add(oooO00o);
                    i2++;
                    oooOO0O = this;
                    str = str2;
                }
            }
            throw new IOException("Invalid extracted dex: " + oooO00o + " (key \"\"), expected modification time: " + j2 + ", modification time: " + jLastModified + ", expected crc: " + j + ", file crc: " + oooO00o.f28400Oooo0o);
        }
        return arrayList;
    }

    public final List<OooO00o> OooOOo() throws IOException {
        String str = this.f28395Oooo0o.getName() + ".classes";
        File[] fileArrListFiles = this.f28397Oooo0oo.listFiles(new OooOO0());
        if (fileArrListFiles == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to list secondary dex dir content (");
            sbOooO0o0.append(this.f28397Oooo0oo.getPath());
            sbOooO0o0.append(").");
            Log.w("MultiDex", sbOooO0o0.toString());
        } else {
            for (File file : fileArrListFiles) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Trying to delete old file ");
                sbOooO0o1.append(file.getPath());
                sbOooO0o1.append(" of size ");
                sbOooO0o1.append(file.length());
                Log.i("MultiDex", sbOooO0o1.toString());
                if (file.delete()) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Deleted old file ");
                    sbOooO0o2.append(file.getPath());
                    Log.i("MultiDex", sbOooO0o2.toString());
                } else {
                    StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("Failed to delete old file ");
                    sbOooO0o3.append(file.getPath());
                    Log.w("MultiDex", sbOooO0o3.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f28395Oooo0o);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                OooO00o oooO00o = new OooO00o(this.f28397Oooo0oo, str + i + ".zip");
                arrayList.add(oooO00o);
                Log.i("MultiDex", "Extraction is needed for file " + oooO00o);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    OooO0O0(zipFile, entry, oooO00o, str);
                    try {
                        oooO00o.f28400Oooo0o = OooO0o(oooO00o);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + oooO00o.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                    sb.append(" '");
                    sb.append(oooO00o.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(oooO00o.length());
                    sb.append(" - crc: ");
                    sb.append(oooO00o.f28400Oooo0o);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        oooO00o.delete();
                        if (oooO00o.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + oooO00o.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + oooO00o.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f28398OoooO0.release();
        this.f28399OoooO00.close();
        this.f28394Oooo.close();
    }
}
