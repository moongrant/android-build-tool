package p221o00oOO;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.billingclient.api.o0000;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import java.io.File;
import java.io.FileNotFoundException;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo implements o00000O0<Uri, File> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33730OooO00o;

    public static final class OooO00o implements o00000O<Uri, File> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f33731OooO00o;

        public OooO00o(Context context) {
            this.f33731OooO00o = context;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, File> OooO00o(o0000 o0000Var) {
            return new o000OOo(this.f33731OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public static class OooO0O0 implements OooO0o<File> {

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public static final String[] f33732Oooo0oo = {"_data"};

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Context f33733Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Uri f33734Oooo0oO;

        public OooO0O0(Context context, Uri uri) {
            this.f33733Oooo0o = context;
            this.f33734Oooo0oO = uri;
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
        @NonNull
        public final DataSource OooO0Oo() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super File> oooO00o) {
            Cursor cursorQuery = this.f33733Oooo0o.getContentResolver().query(this.f33734Oooo0oO, f33732Oooo0oo, null, null, null);
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
                oooO00o.OooO0o(new File(string));
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to find file path for: ");
            sbOooO0o0.append(this.f33734Oooo0oO);
            oooO00o.OooO0OO(new FileNotFoundException(sbOooO0o0.toString()));
        }

        @Override // com.bumptech.glide.load.data.OooO0o
        public final void cancel() {
        }
    }

    public o000OOo(Context context) {
        this.f33730OooO00o = context;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        return o0000.OooO0Oo(uri);
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<File> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o00000O0.OooO00o<>(new b(uri2), new OooO0O0(this.f33730OooO00o, uri2));
    }
}
