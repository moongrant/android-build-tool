package p222o00oOOO0;

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
import p217o00oO00o.o00000;
import p221o00oOO.o0000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000O0;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o0oOO<DataT> implements o00000O0<Uri, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33774OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000O0<File, DataT> f33775OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000O0<Uri, DataT> f33776OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Class<DataT> f33777OooO0Oo;

    public static abstract class OooO00o<DataT> implements o00000O<Uri, DataT> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f33778OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Class<DataT> f33779OooO0O0;

        public OooO00o(Context context, Class<DataT> cls) {
            this.f33778OooO00o = context;
            this.f33779OooO0O0 = cls;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, DataT> OooO00o(@NonNull o0000 o0000Var) {
            return new o0oOO(this.f33778OooO00o, o0000Var.OooO0OO(File.class, this.f33779OooO0O0), o0000Var.OooO0OO(Uri.class, this.f33779OooO0O0), this.f33779OooO0O0);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
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

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public static final String[] f33780OoooOOO = {"_data"};

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final Uri f33781Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Context f33782Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final o00000O0<File, DataT> f33783Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final o00000O0<Uri, DataT> f33784Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final Class<DataT> f33785OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final int f33786OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final int f33787OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final o00000 f33788OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public volatile boolean f33789OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        @Nullable
        public volatile com.bumptech.glide.load.data.OooO0o<DataT> f33790o000oOoO;

        public OooO0o(Context context, o00000O0<File, DataT> o00000o1, o00000O0<Uri, DataT> o00000o2, Uri uri, int i, int i2, o00000 o00000Var, Class<DataT> cls) {
            this.f33782Oooo0o = context.getApplicationContext();
            this.f33783Oooo0oO = o00000o1;
            this.f33784Oooo0oo = o00000o2;
            this.f33781Oooo = uri;
            this.f33787OoooO00 = i;
            this.f33786OoooO0 = i2;
            this.f33788OoooO0O = o00000Var;
            this.f33785OoooO = cls;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<DataT> OooO00o() {
            return this.f33785OoooO;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
            com.bumptech.glide.load.data.OooO0o<DataT> oooO0o = this.f33790o000oOoO;
            if (oooO0o != null) {
                oooO0o.OooO0O0();
            }
        }

        @Nullable
        public final com.bumptech.glide.load.data.OooO0o<DataT> OooO0OO() throws Throwable {
            o00000O0.OooO00o<DataT> oooO00oOooO0O0;
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                o00000O0<File, DataT> o00000o1 = this.f33783Oooo0oO;
                Uri uri = this.f33781Oooo;
                try {
                    Cursor cursorQuery = this.f33782Oooo0o.getContentResolver().query(uri, f33780OoooOOO, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                oooO00oOooO0O0 = o00000o1.OooO0O0(file, this.f33787OoooO00, this.f33786OoooO0, this.f33788OoooO0O);
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
                oooO00oOooO0O0 = this.f33784Oooo0oo.OooO0O0(this.f33782Oooo0o.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f33781Oooo) : this.f33781Oooo, this.f33787OoooO00, this.f33786OoooO0, this.f33788OoooO0O);
            }
            if (oooO00oOooO0O0 != null) {
                return oooO00oOooO0O0.f33698OooO0OO;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final DataSource OooO0Oo() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0o0(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super DataT> oooO00o) throws Throwable {
            try {
                com.bumptech.glide.load.data.OooO0o<DataT> oooO0oOooO0OO = OooO0OO();
                if (oooO0oOooO0OO == null) {
                    oooO00o.OooO0OO(new IllegalArgumentException("Failed to build fetcher for: " + this.f33781Oooo));
                    return;
                }
                this.f33790o000oOoO = oooO0oOooO0OO;
                if (this.f33789OoooOO0) {
                    cancel();
                } else {
                    oooO0oOooO0OO.OooO0o0(priority, oooO00o);
                }
            } catch (FileNotFoundException e) {
                oooO00o.OooO0OO(e);
            }
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
            this.f33789OoooOO0 = true;
            com.bumptech.glide.load.data.OooO0o<DataT> oooO0o = this.f33790o000oOoO;
            if (oooO0o != null) {
                oooO0o.cancel();
            }
        }
    }

    public o0oOO(Context context, o00000O0<File, DataT> o00000o1, o00000O0<Uri, DataT> o00000o2, Class<DataT> cls) {
        this.f33774OooO00o = context.getApplicationContext();
        this.f33775OooO0O0 = o00000o1;
        this.f33776OooO0OO = o00000o2;
        this.f33777OooO0Oo = cls;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.android.billingclient.api.o0000.OooO0Oo(uri);
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o00000O0.OooO00o(new b(uri2), new OooO0o(this.f33774OooO00o, this.f33775OooO0O0, this.f33776OooO0OO, uri2, i, i2, o00000Var, this.f33777OooO0Oo));
    }
}
