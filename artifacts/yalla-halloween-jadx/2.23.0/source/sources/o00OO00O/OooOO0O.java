package o00OO00O;

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
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O<Data> implements o0OoOo0<File, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o<Data> f37097OooO00o;

    public static class OooO extends OooO00o<InputStream> {

        public class OooO00o implements OooO0o<InputStream> {
            @Override // o00OO00O.OooOO0O.OooO0o
            public final Class<InputStream> OooO00o() {
                return InputStream.class;
            }

            @Override // o00OO00O.OooOO0O.OooO0o
            public final void OooO0O0(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // o00OO00O.OooOO0O.OooO0o
            public final InputStream OooO0OO(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public OooO() {
            super(new OooO00o());
        }
    }

    public static class OooO00o<Data> implements o00O0O<File, Data> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o<Data> f37098OooO00o;

        public OooO00o(OooO0o<Data> oooO0o) {
            this.f37098OooO00o = oooO0o;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<File, Data> OooO0OO(@NonNull oo000o oo000oVar) {
            return new OooOO0O(this.f37098OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0O0 extends OooO00o<ParcelFileDescriptor> {

        public class OooO00o implements OooO0o<ParcelFileDescriptor> {
            @Override // o00OO00O.OooOO0O.OooO0o
            public final Class<ParcelFileDescriptor> OooO00o() {
                return ParcelFileDescriptor.class;
            }

            @Override // o00OO00O.OooOO0O.OooO0o
            public final void OooO0O0(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // o00OO00O.OooOO0O.OooO0o
            public final ParcelFileDescriptor OooO0OO(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
            }
        }

        public OooO0O0() {
            super(new OooO00o());
        }
    }

    public static final class OooO0OO<Data> implements com.bumptech.glide.load.data.OooO0o<Data> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final File f37099OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Data f37100OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO0o<Data> f37101OooO0o0;

        public OooO0OO(File file, OooO0o<Data> oooO0o) {
            this.f37099OooO0Oo = file;
            this.f37101OooO0o0 = oooO0o;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<Data> OooO00o() {
            return this.f37101OooO0o0.OooO00o();
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            Data data = this.f37100OooO0o;
            if (data != null) {
                try {
                    this.f37101OooO0o0.OooO0O0(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super Data> oooO00o) {
            try {
                Data dataOooO0OO = this.f37101OooO0o0.OooO0OO(this.f37099OooO0Oo);
                this.f37100OooO0o = dataOooO0OO;
                oooO00o.OooO0o0(dataOooO0OO);
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

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public interface OooO0o<Data> {
        Class<Data> OooO00o();

        void OooO0O0(Data data) throws IOException;

        Data OooO0OO(File file) throws FileNotFoundException;
    }

    public OooOO0O(OooO0o<Data> oooO0o) {
        this.f37097OooO00o = oooO0o;
    }

    @Override // o00OO00O.o0OoOo0
    public final /* bridge */ /* synthetic */ boolean OooO00o(@NonNull File file) {
        return true;
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull File file, int i, int i2, @NonNull o00000 o00000Var) {
        File file2 = file;
        return new o0OoOo0.OooO00o(new o00OOO0O.OooO0o(file2), new OooO0OO(file2, this.f37097OooO00o));
    }
}
