package p221o00oOO;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o<Data> implements o00000O0<File, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o<Data> f33749OooO00o;

    public static class OooO extends OooO00o<InputStream> {

        public class OooO00o implements OooO0o<InputStream> {
            @Override // o00oOO.o0OOO0o.OooO0o
            public final Class<InputStream> OooO00o() {
                return InputStream.class;
            }

            @Override // o00oOO.o0OOO0o.OooO0o
            public final InputStream OooO0O0(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            @Override // o00oOO.o0OOO0o.OooO0o
            public final void OooO0OO(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public OooO() {
            super(new OooO00o());
        }
    }

    public static class OooO00o<Data> implements o00000O<File, Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o<Data> f33750OooO00o;

        public OooO00o(OooO0o<Data> oooO0o) {
            this.f33750OooO00o = oooO0o;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<File, Data> OooO00o(@NonNull o0000 o0000Var) {
            return new o0OOO0o(this.f33750OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0O0 extends OooO00o<ParcelFileDescriptor> {

        public class OooO00o implements OooO0o<ParcelFileDescriptor> {
            @Override // o00oOO.o0OOO0o.OooO0o
            public final Class<ParcelFileDescriptor> OooO00o() {
                return ParcelFileDescriptor.class;
            }

            @Override // o00oOO.o0OOO0o.OooO0o
            public final ParcelFileDescriptor OooO0O0(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
            }

            @Override // o00oOO.o0OOO0o.OooO0o
            public final void OooO0OO(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public OooO0O0() {
            super(new OooO00o());
        }
    }

    public static final class OooO0OO<Data> implements com.bumptech.glide.load.data.OooO0o<Data> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final File f33751Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final OooO0o<Data> f33752Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Data f33753Oooo0oo;

        public OooO0OO(File file, OooO0o<Data> oooO0o) {
            this.f33751Oooo0o = file;
            this.f33752Oooo0oO = oooO0o;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f33752Oooo0oO.OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            Data data = this.f33753Oooo0oo;
            if (data != null) {
                try {
                    this.f33752Oooo0oO.OooO0OO(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource OooO0Oo() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0o0(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            try {
                Data dataOooO0O0 = this.f33752Oooo0oO.OooO0O0(this.f33751Oooo0o);
                this.f33753Oooo0oo = dataOooO0O0;
                oooO00o.OooO0o(dataOooO0O0);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                oooO00o.OooO0OO(e);
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }
    }

    public interface OooO0o<Data> {
        Class<Data> OooO00o();

        Data OooO0O0(File file) throws FileNotFoundException;

        void OooO0OO(Data data) throws IOException;
    }

    public o0OOO0o(OooO0o<Data> oooO0o) {
        this.f33749OooO00o = oooO0o;
    }

    @Override // p221o00oOO.o00000O0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull File file) {
        return true;
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull File file, int i, int i2, @NonNull o00000 o00000Var) {
        File file2 = file;
        return new o00000O0.OooO00o(new b(file2), new OooO0OO(file2, this.f33749OooO00o));
    }
}
