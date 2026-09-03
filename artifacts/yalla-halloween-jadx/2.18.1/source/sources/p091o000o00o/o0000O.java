package p091o000o00o;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.OooO00o;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import p092o000o0O.o00Oo0;
import p092o000o0O.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O implements SupportSQLiteOpenHelper, oo0o0Oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final Callable<InputStream> f29154Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    public final Context f29155Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final String f29156Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final File f29157Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f29158OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NonNull
    public final SupportSQLiteOpenHelper f29159OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f29160OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public OooO00o f29161OoooO0O;

    public final void OooO00o(File file) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f29156Oooo0oO != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f29155Oooo0o.getAssets().open(this.f29156Oooo0oO));
        } else if (this.f29157Oooo0oo != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f29157Oooo0oo).getChannel();
        } else {
            Callable<InputStream> callable = this.f29154Oooo;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
            } catch (Exception e) {
                throw new IOException("inputStreamCallable exception on call", e);
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f29155Oooo0o.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT <= 23) {
                InputStream inputStreamNewInputStream = Channels.newInputStream(readableByteChannelNewChannel);
                OutputStream outputStreamNewOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStreamNewInputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        outputStreamNewOutputStream.write(bArr, 0, i);
                    }
                }
            } else {
                channel.transferFrom(readableByteChannelNewChannel, 0L, Long.MAX_VALUE);
            }
            channel.force(false);
            readableByteChannelNewChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to create directories for ");
                sbOooO0o0.append(file.getAbsolutePath());
                throw new IOException(sbOooO0o0.toString());
            }
            if (fileCreateTempFile.renameTo(file)) {
                return;
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Failed to move intermediate file (");
            sbOooO0o1.append(fileCreateTempFile.getAbsolutePath());
            sbOooO0o1.append(") to destination (");
            sbOooO0o1.append(file.getAbsolutePath());
            sbOooO0o1.append(").");
            throw new IOException(sbOooO0o1.toString());
        } catch (Throwable th) {
            readableByteChannelNewChannel.close();
            channel.close();
            throw th;
        }
    }

    public final void OooO0O0(boolean z) {
        String databaseName = getDatabaseName();
        File databasePath = this.f29155Oooo0o.getDatabasePath(databaseName);
        OooO00o oooO00o = this.f29161OoooO0O;
        o0OoOo0 o0oooo1 = new o0OoOo0(databaseName, this.f29155Oooo0o.getFilesDir(), oooO00o == null || oooO00o.f9284OooOO0o);
        try {
            o0oooo1.f29267OooO0O0.lock();
            if (o0oooo1.f29268OooO0OO) {
                try {
                    FileChannel channel = new FileOutputStream(o0oooo1.f29266OooO00o).getChannel();
                    o0oooo1.f29269OooO0Oo = channel;
                    channel.lock();
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to grab copy lock.", e);
                }
            }
            if (!databasePath.exists()) {
                try {
                    OooO00o(databasePath);
                    o0oooo1.OooO00o();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            }
            if (this.f29161OoooO0O == null) {
                o0oooo1.OooO00o();
                return;
            }
            try {
                int iOooO0OO = o00Oo0.OooO0OO(databasePath);
                int i = this.f29160OoooO00;
                if (iOooO0OO == i) {
                    o0oooo1.OooO00o();
                    return;
                }
                if (this.f29161OoooO0O.OooO00o(iOooO0OO, i)) {
                    o0oooo1.OooO00o();
                    return;
                }
                if (this.f29155Oooo0o.deleteDatabase(databaseName)) {
                    try {
                        OooO00o(databasePath);
                    } catch (IOException e3) {
                        Log.w("ROOM", "Unable to copy database file.", e3);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                o0oooo1.OooO00o();
                return;
            } catch (IOException e4) {
                Log.w("ROOM", "Unable to read database version.", e4);
                o0oooo1.OooO00o();
                return;
            }
        } catch (Throwable th) {
            o0oooo1.OooO00o();
            throw th;
        }
        o0oooo1.OooO00o();
        throw th;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f29159OoooO0.close();
        this.f29158OoooO = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.f29159OoooO0.getDatabaseName();
    }

    @Override // p091o000o00o.oo0o0Oo
    @NonNull
    public final SupportSQLiteOpenHelper getDelegate() {
        return this.f29159OoooO0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final synchronized SupportSQLiteDatabase getWritableDatabase() {
        if (!this.f29158OoooO) {
            OooO0O0(true);
            this.f29158OoooO = true;
        }
        return this.f29159OoooO0.getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.f29159OoooO0.setWriteAheadLoggingEnabled(z);
    }
}
