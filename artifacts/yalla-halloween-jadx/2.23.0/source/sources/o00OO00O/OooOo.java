package o00OO00O;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements o0OoOo0<Uri, File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37110OooO00o;

    public static final class OooO00o implements o00O0O<Uri, File> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37111OooO00o;

        public OooO00o(Context context) {
            this.f37111OooO00o = context;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, File> OooO0OO(oo000o oo000oVar) {
            return new OooOo(this.f37111OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0O0 implements com.bumptech.glide.load.data.OooO0o<File> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final String[] f37112OooO0o = {"_data"};

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Context f37113OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Uri f37114OooO0o0;

        public OooO0O0(Context context, Uri uri) {
            this.f37113OooO0Oo = context;
            this.f37114OooO0o0 = uri;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        @NonNull
        public final Class<File> OooO00o() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0Oo(@NonNull Priority priority, @NonNull com.bumptech.glide.load.data.OooO0o.OooO00o<? super File> oooO00o) {
            Cursor cursorQuery = this.f37113OooO0Oo.getContentResolver().query(this.f37114OooO0o0, f37112OooO0o, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                oooO00o.OooO0o0(new File(string));
                return;
            }
            oooO00o.OooO0OO(new FileNotFoundException("Failed to find file path for: " + this.f37114OooO0o0));
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

    public OooOo(Context context) {
        this.f37110OooO00o = context;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        return p128o00O0oo0.OooOO0.OooO00o(uri);
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<File> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o0OoOo0.OooO00o<>(new o00OOO0O.OooO0o(uri2), new OooO0O0(this.f37110OooO00o, uri2));
    }
}
