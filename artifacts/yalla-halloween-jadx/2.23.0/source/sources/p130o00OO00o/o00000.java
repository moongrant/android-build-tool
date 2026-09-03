package p130o00OO00o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o00OO00O.o00O0O;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import p128o00O0oo0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public final class o00000<DataT> implements o0OoOo0<Uri, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37171OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0<File, DataT> f37172OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OoOo0<Uri, DataT> f37173OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Class<DataT> f37174OooO0Oo;

    public static abstract class OooO00o<DataT> implements o00O0O<Uri, DataT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37175OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<DataT> f37176OooO0O0;

        public OooO00o(Context context, Class<DataT> cls) {
            this.f37175OooO00o = context;
            this.f37176OooO0O0 = cls;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, DataT> OooO0OO(@NonNull oo000o oo000oVar) {
            Class<DataT> cls = this.f37176OooO0O0;
            return new o00000(this.f37175OooO00o, oo000oVar.OooO0OO(File.class, cls), oo000oVar.OooO0OO(Uri.class, cls), cls);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    @RequiresApi(29)
    public static final class OooO0O0 extends OooO00o<ParcelFileDescriptor> {
        public OooO0O0(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class OooO0OO extends OooO00o<InputStream> {
        public OooO0OO(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class OooO0o<DataT> implements com.bumptech.glide.load.data.OooO0o<DataT> {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String[] f37177OooOOO = {"_data"};

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f37178OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Context f37179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o0OoOo0<Uri, DataT> f37180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0OoOo0<File, DataT> f37181OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Uri f37182OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f37183OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final p126o00O0oOo.o00000 f37184OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final Class<DataT> f37185OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public volatile boolean f37186OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public volatile com.bumptech.glide.load.data.OooO0o<DataT> f37187OooOOO0;

        public OooO0o(Context context, o0OoOo0<File, DataT> o0oooo0, o0OoOo0<Uri, DataT> o0oooo1, Uri uri, int i, int i2, p126o00O0oOo.o00000 o00000Var, Class<DataT> cls) {
            this.f37179OooO0Oo = context.getApplicationContext();
            this.f37181OooO0o0 = o0oooo0;
            this.f37180OooO0o = o0oooo1;
            this.f37182OooO0oO = uri;
            this.f37183OooO0oo = i;
            this.f37178OooO = i2;
            this.f37184OooOO0 = o00000Var;
            this.f37185OooOO0O = cls;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<DataT> OooO00o() {
            return this.f37185OooOO0O;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            com.bumptech.glide.load.data.OooO0o<DataT> oooO0o = this.f37187OooOOO0;
            if (oooO0o != null) {
                oooO0o.OooO0O0();
            }
        }

        @Nullable
        public final com.bumptech.glide.load.data.OooO0o<DataT> OooO0OO() throws Throwable {
            o0OoOo0.OooO00o<DataT> oooO00oOooO0O0;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            p126o00O0oOo.o00000 o00000Var = this.f37184OooOO0;
            int i = this.f37178OooO;
            int i2 = this.f37183OooO0oo;
            Context context = this.f37179OooO0Oo;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f37182OooO0oO;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f37177OooOOO, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                oooO00oOooO0O0 = this.f37181OooO0o0.OooO0O0(file, i2, i, o00000Var);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                boolean z = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
                Uri requireOriginal = this.f37182OooO0oO;
                if (z) {
                    requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                }
                oooO00oOooO0O0 = this.f37180OooO0o.OooO0O0(requireOriginal, i2, i, o00000Var);
            }
            if (oooO00oOooO0O0 != null) {
                return oooO00oOooO0O0.f37152OooO0OO;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super DataT> oooO00o) throws Throwable {
            try {
                com.bumptech.glide.load.data.OooO0o<DataT> oooO0oOooO0OO = OooO0OO();
                if (oooO0oOooO0OO == null) {
                    oooO00o.OooO0OO(new IllegalArgumentException("Failed to build fetcher for: " + this.f37182OooO0oO));
                } else {
                    this.f37187OooOOO0 = oooO0oOooO0OO;
                    if (this.f37186OooOO0o) {
                        cancel();
                    } else {
                        oooO0oOooO0OO.OooO0Oo(priority, oooO00o);
                    }
                }
            } catch (FileNotFoundException e) {
                oooO00o.OooO0OO(e);
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
            this.f37186OooOO0o = true;
            com.bumptech.glide.load.data.OooO0o<DataT> oooO0o = this.f37187OooOOO0;
            if (oooO0o != null) {
                oooO0o.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }
    }

    public o00000(Context context, o0OoOo0<File, DataT> o0oooo0, o0OoOo0<Uri, DataT> o0oooo1, Class<DataT> cls) {
        this.f37171OooO00o = context.getApplicationContext();
        this.f37172OooO0O0 = o0oooo0;
        this.f37173OooO0OO = o0oooo1;
        this.f37174OooO0Oo = cls;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && OooOO0.OooO00o(uri);
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull p126o00O0oOo.o00000 o00000Var) {
        Uri uri2 = uri;
        return new o0OoOo0.OooO00o(new o00OOO0O.OooO0o(uri2), new OooO0o(this.f37171OooO00o, this.f37172OooO0O0, this.f37173OooO0OO, uri2, i, i2, o00000Var, this.f37174OooO0Oo));
    }
}
