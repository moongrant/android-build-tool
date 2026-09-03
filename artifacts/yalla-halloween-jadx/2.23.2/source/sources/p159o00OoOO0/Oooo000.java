package p159o00OoOO0;

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
import o00OoO.o00O0O;
import o00OoO.o0OoOo0;
import o00OoO.oo000o;
import p154o00Oo0oo.oo0o0Oo;
import p173o00OooOO.oo00o;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(29)
public final class Oooo000<DataT> implements o0OoOo0<Uri, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38026OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0<File, DataT> f38027OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OoOo0<Uri, DataT> f38028OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Class<DataT> f38029OooO0Oo;

    public static abstract class OooO00o<DataT> implements o00O0O<Uri, DataT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f38030OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<DataT> f38031OooO0O0;

        public OooO00o(Context context, Class<DataT> cls) {
            this.f38030OooO00o = context;
            this.f38031OooO0O0 = cls;
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Uri, DataT> OooO0Oo(@NonNull oo000o oo000oVar) {
            Class<DataT> cls = this.f38031OooO0O0;
            return new Oooo000(this.f38030OooO00o, oo000oVar.OooO0OO(File.class, cls), oo000oVar.OooO0OO(Uri.class, cls), cls);
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
        public static final String[] f38032OooOOO = {"_data"};

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f38033OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Context f38034OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final o0OoOo0<Uri, DataT> f38035OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0OoOo0<File, DataT> f38036OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Uri f38037OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f38038OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final oo0o0Oo f38039OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final Class<DataT> f38040OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public volatile boolean f38041OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public volatile com.bumptech.glide.load.data.OooO0o<DataT> f38042OooOOO0;

        public OooO0o(Context context, o0OoOo0<File, DataT> o0oooo1, o0OoOo0<Uri, DataT> o0oooo2, Uri uri, int i, int i2, oo0o0Oo oo0o0oo, Class<DataT> cls) {
            this.f38034OooO0Oo = context.getApplicationContext();
            this.f38036OooO0o0 = o0oooo1;
            this.f38035OooO0o = o0oooo2;
            this.f38037OooO0oO = uri;
            this.f38038OooO0oo = i;
            this.f38033OooO = i2;
            this.f38039OooOO0 = oo0o0oo;
            this.f38040OooOO0O = cls;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<DataT> OooO00o() {
            return this.f38040OooOO0O;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            com.bumptech.glide.load.data.OooO0o<DataT> oooO0o = this.f38042OooOOO0;
            if (oooO0o != null) {
                oooO0o.OooO0O0();
            }
        }

        @Nullable
        public final com.bumptech.glide.load.data.OooO0o<DataT> OooO0OO() throws Throwable {
            o0OoOo0.OooO00o<DataT> oooO00oOooO0O0;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.f38034OooO0Oo;
            oo0o0Oo oo0o0oo = this.f38039OooOO0;
            int i = this.f38033OooO;
            int i2 = this.f38038OooO0oo;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.f38037OooO0oO;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, f38032OooOOO, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                oooO00oOooO0O0 = this.f38036OooO0o0.OooO0O0(file, i2, i, oo0o0oo);
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
                Uri requireOriginal = this.f38037OooO0oO;
                boolean z = p548o0oOO.Oooo000.OooO00o(requireOriginal) && requireOriginal.getPathSegments().contains("picker");
                o0OoOo0<Uri, DataT> o0oooo1 = this.f38035OooO0o;
                if (z) {
                    oooO00oOooO0O0 = o0oooo1.OooO0O0(requireOriginal, i2, i, oo0o0oo);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    oooO00oOooO0O0 = o0oooo1.OooO0O0(requireOriginal, i2, i, oo0o0oo);
                }
            }
            if (oooO00oOooO0O0 != null) {
                return oooO00oOooO0O0.f37914OooO0OO;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super DataT> oooO00o) throws Throwable {
            try {
                com.bumptech.glide.load.data.OooO0o<DataT> oooO0oOooO0OO = OooO0OO();
                if (oooO0oOooO0OO == null) {
                    oooO00o.OooO0OO(new IllegalArgumentException("Failed to build fetcher for: " + this.f38037OooO0oO));
                } else {
                    this.f38042OooOOO0 = oooO0oOooO0OO;
                    if (this.f38041OooOO0o) {
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
            this.f38041OooOO0o = true;
            com.bumptech.glide.load.data.OooO0o<DataT> oooO0o = this.f38042OooOOO0;
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

    public Oooo000(Context context, o0OoOo0<File, DataT> o0oooo1, o0OoOo0<Uri, DataT> o0oooo2, Class<DataT> cls) {
        this.f38026OooO00o = context.getApplicationContext();
        this.f38027OooO0O0 = o0oooo1;
        this.f38028OooO0OO = o0oooo2;
        this.f38029OooO0Oo = cls;
    }

    @Override // o00OoO.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && p548o0oOO.Oooo000.OooO00o(uri);
    }

    @Override // o00OoO.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull oo0o0Oo oo0o0oo) {
        Uri uri2 = uri;
        return new o0OoOo0.OooO00o(new oo00o(uri2), new OooO0o(this.f38026OooO00o, this.f38027OooO0O0, this.f38028OooO0OO, uri2, i, i2, oo0o0oo, this.f38029OooO0Oo));
    }
}
