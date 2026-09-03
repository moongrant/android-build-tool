package o000Oo0;

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
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements Closeable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final FileLock f34915OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f34916OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final File f34917OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f34918OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final RandomAccessFile f34919OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final FileChannel f34920OooO0oo;

    public static class OooO00o extends File {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f34921OooO0Oo;

        public OooO00o(File file, String str) {
            super(file, str);
            this.f34921OooO0Oo = -1L;
        }
    }

    public OooO0o(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f34916OooO0Oo = file;
        this.f34917OooO0o = file2;
        this.f34918OooO0o0 = OooO0oO(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f34919OooO0oO = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f34920OooO0oo = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f34915OooO = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                OooO00o(this.f34920OooO0oo);
                throw e;
            } catch (Error e2) {
                e = e2;
                OooO00o(this.f34920OooO0oo);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                OooO00o(this.f34920OooO0oo);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            OooO00o(this.f34919OooO0oO);
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

    public static void OooO0OO(ZipFile zipFile, ZipEntry zipEntry, OooO00o oooO00o, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(o00O00OO.OooO00o("tmp-", str), ".zip", oooO00o.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
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
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + oooO00o.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + oooO00o.getPath());
                if (fileCreateTempFile.renameTo(oooO00o)) {
                    OooO00o(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + oooO00o.getAbsolutePath() + "\"");
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

    public static long OooO0oO(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            OooO.OooO00o OooO00o2 = OooO.OooO00o(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = OooO00o2.f34912OooO0O0;
            randomAccessFile.seek(OooO00o2.f34911OooO00o);
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

    public static void OooOo0(Context context, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong("timestamp", j);
        editorEdit.putLong("crc", j2);
        editorEdit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            OooO00o oooO00o = (OooO00o) it.next();
            editorEdit.putLong(android.support.v4.media.OooO00o.OooO00o("dex.crc.", i), oooO00o.f34921OooO0Oo);
            editorEdit.putLong("dex.time." + i, oooO00o.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    public final ArrayList OooOOo(Context context) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = this.f34916OooO0Oo.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        for (int i2 = 2; i2 <= i; i2++) {
            OooO00o oooO00o = new OooO00o(this.f34917OooO0o, str + i2 + ".zip");
            if (!oooO00o.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + oooO00o.getPath() + "'");
            }
            oooO00o.f34921OooO0Oo = OooO0oO(oooO00o);
            long j = sharedPreferences.getLong("dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong("dex.time." + i2, -1L);
            long jLastModified = oooO00o.lastModified();
            if (j2 != jLastModified || j != oooO00o.f34921OooO0Oo) {
                StringBuilder sb = new StringBuilder("Invalid extracted dex: ");
                sb.append(oooO00o);
                sb.append(" (key \"\"), expected modification time: ");
                sb.append(j2);
                OooO0O0.OooO00o(sb, ", modification time: ", jLastModified, ", expected crc: ");
                sb.append(j);
                sb.append(", file crc: ");
                sb.append(oooO00o.f34921OooO0Oo);
                throw new IOException(sb.toString());
            }
            arrayList.add(oooO00o);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    public final ArrayList OooOOo0(Context context, boolean z) throws Throwable {
        ArrayList arrayListOooOo00;
        long jLastModified;
        ArrayList arrayListOooOOo;
        StringBuilder sb = new StringBuilder("MultiDexExtractor.load(");
        File file = this.f34916OooO0Oo;
        sb.append(file.getPath());
        sb.append(", ");
        sb.append(z);
        sb.append(", )");
        Log.i("MultiDex", sb.toString());
        if (!this.f34915OooO.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            arrayListOooOo00 = OooOo00();
            jLastModified = file.lastModified();
            if (jLastModified == -1) {
                jLastModified--;
            }
            OooOo0(context, jLastModified, this.f34918OooO0o0, arrayListOooOo00);
            arrayListOooOOo = arrayListOooOo00;
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            long j = sharedPreferences.getLong("timestamp", -1L);
            long jLastModified2 = file.lastModified();
            if (jLastModified2 == -1) {
                jLastModified2--;
            }
            if ((j == jLastModified2 && sharedPreferences.getLong("crc", -1L) == this.f34918OooO0o0) ? false : true) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                arrayListOooOo00 = OooOo00();
                jLastModified = file.lastModified();
                if (jLastModified == -1) {
                    jLastModified--;
                }
                OooOo0(context, jLastModified, this.f34918OooO0o0, arrayListOooOo00);
            } else {
                try {
                    arrayListOooOOo = OooOOo(context);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    arrayListOooOo00 = OooOo00();
                    long jLastModified3 = file.lastModified();
                    if (jLastModified3 == -1) {
                        jLastModified3--;
                    }
                    OooOo0(context, jLastModified3, this.f34918OooO0o0, arrayListOooOo00);
                    arrayListOooOOo = arrayListOooOo00;
                }
            }
            arrayListOooOOo = arrayListOooOo00;
        }
        Log.i("MultiDex", "load found " + arrayListOooOOo.size() + " secondary dex files");
        return arrayListOooOOo;
    }

    public final ArrayList OooOo00() throws Throwable {
        Throwable th;
        boolean z;
        StringBuilder sb = new StringBuilder();
        File file = this.f34916OooO0Oo;
        sb.append(file.getName());
        sb.append(".classes");
        String string = sb.toString();
        OooO0OO oooO0OO = new OooO0OO();
        File file2 = this.f34917OooO0o;
        File[] fileArrListFiles = file2.listFiles(oooO0OO);
        String str = "MultiDex";
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : fileArrListFiles) {
                Log.i("MultiDex", "Trying to delete old file " + file3.getPath() + " of size " + file3.length());
                if (file3.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file3.getPath());
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                OooO00o oooO00o = new OooO00o(file2, string + i + ".zip");
                arrayList.add(oooO00o);
                Log.i(str, "Extraction is needed for file " + oooO00o);
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    int i3 = i2 + 1;
                    OooO0OO(zipFile, entry, oooO00o, string);
                    String str2 = str;
                    try {
                        oooO00o.f34921OooO0Oo = OooO0oO(oooO00o);
                        z = true;
                        str = str2;
                    } catch (IOException e) {
                        try {
                            str = str2;
                            Log.w(str, "Failed to read crc from " + oooO00o.getAbsolutePath(), e);
                            z = false;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                    sb2.append(" '");
                    sb2.append(oooO00o.getAbsolutePath());
                    sb2.append("': length ");
                    ZipEntry zipEntry = entry;
                    String str3 = string;
                    sb2.append(oooO00o.length());
                    sb2.append(" - crc: ");
                    sb2.append(oooO00o.f34921OooO0Oo);
                    Log.i(str, sb2.toString());
                    if (!z) {
                        oooO00o.delete();
                        if (oooO00o.exists()) {
                            Log.w(str, "Failed to delete corrupted secondary dex '" + oooO00o.getPath() + "'");
                        }
                    }
                    string = str3;
                    entry = zipEntry;
                    z2 = z;
                    i2 = i3;
                }
                String str4 = string;
                if (!z2) {
                    throw new IOException("Could not create zip file " + oooO00o.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
                string = str4;
                th = th;
                try {
                    zipFile.close();
                    throw th;
                } catch (IOException e2) {
                    Log.w(str, "Failed to close resource", e2);
                    throw th;
                }
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w(str, "Failed to close resource", e3);
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f34915OooO.release();
        this.f34920OooO0oo.close();
        this.f34919OooO0oO.close();
    }
}
