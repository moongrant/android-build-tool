package p548o0oOO;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.OooO0o;
import com.bumptech.glide.load.data.OooOO0O;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooO0o<InputStream> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Uri f55854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InputStream f55855OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OoOo0 f55856OooO0o0;

    public static class OooO00o implements o000oOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f55857OooO0O0 = {"_data"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f55858OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f55858OooO00o = contentResolver;
        }

        @Override // p548o0oOO.o000oOoO
        public final Cursor OooO00o(Uri uri) {
            return this.f55858OooO00o.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f55857OooO0O0, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class OooO0O0 implements o000oOoO {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f55859OooO0O0 = {"_data"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f55860OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.f55860OooO00o = contentResolver;
        }

        @Override // p548o0oOO.o000oOoO
        public final Cursor OooO00o(Uri uri) {
            return this.f55860OooO00o.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f55859OooO0O0, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public Oooo0(Uri uri, o0OoOo0 o0oooo1) {
        this.f55854OooO0Oo = uri;
        this.f55856OooO0o0 = o0oooo1;
    }

    public static Oooo0 OooO0OO(Context context, Uri uri, o000oOoO o000oooo2) {
        return new Oooo0(uri, new o0OoOo0(OooO0OO.OooO0O0(context).f12945OooO0oO.OooO0O0().OooO0o(), o000oooo2, OooO0OO.OooO0O0(context).f12946OooO0oo, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        InputStream inputStream = this.f55855OooO0o;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0Oo(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) throws Throwable {
        try {
            InputStream inputStreamOooO0o0 = OooO0o0();
            this.f55855OooO0o = inputStreamOooO0o0;
            oooO00o.OooO0o0(inputStreamOooO0o0);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            oooO00o.OooO0OO(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[PHI: r7
      0x0046: PHI (r7v4 android.database.Cursor) = (r7v3 android.database.Cursor), (r7v9 android.database.Cursor) binds: [B:20:0x0044, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final InputStream OooO0o0() throws Throwable {
        SecurityException e;
        Cursor cursorOooO00o;
        String string;
        boolean zIsEmpty;
        ContentResolver contentResolver;
        InputStream inputStreamOpenInputStream;
        int iOooO00o;
        File file;
        Uri uriFromFile;
        Uri uri = this.f55854OooO0Oo;
        o0OoOo0 o0oooo1 = this.f55856OooO0o0;
        o0oooo1.getClass();
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        boolean z = false;
        try {
            cursorOooO00o = o0oooo1.f55861OooO00o.OooO00o(uri);
            if (cursorOooO00o != null) {
                try {
                    try {
                        if (cursorOooO00o.moveToFirst()) {
                            string = cursorOooO00o.getString(0);
                            cursorOooO00o.close();
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorOooO00o != null) {
                            cursorOooO00o.close();
                        }
                    }
                    zIsEmpty = TextUtils.isEmpty(string);
                    contentResolver = o0oooo1.f55863OooO0OO;
                    if (zIsEmpty) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() && 0 < file.length()) {
                            z = true;
                        }
                        if (z) {
                            uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e3) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e3));
                            }
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            try {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iOooO00o = com.bumptech.glide.load.OooO00o.OooO00o(o0oooo1.f55862OooO0O0, inputStreamOpenInputStream2, o0oooo1.f55864OooO0Oo);
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    try {
                                        r5.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException | NullPointerException e4) {
                            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e4);
                            }
                            if (inputStreamOpenInputStream2 != null) {
                                try {
                                    inputStreamOpenInputStream2.close();
                                } catch (IOException unused3) {
                                }
                            }
                            iOooO00o = -1;
                        }
                    } else {
                        iOooO00o = -1;
                    }
                    if (iOooO00o != -1) {
                        return new OooOO0O(inputStreamOpenInputStream, iOooO00o);
                    }
                    return inputStreamOpenInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    r5 = cursorOooO00o;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            }
            if (cursorOooO00o != null) {
                cursorOooO00o.close();
            }
        } catch (SecurityException e5) {
            e = e5;
            cursorOooO00o = null;
        } catch (Throwable th3) {
            th = th3;
            if (r5 != 0) {
                r5.close();
            }
            throw th;
        }
        string = null;
        zIsEmpty = TextUtils.isEmpty(string);
        contentResolver = o0oooo1.f55863OooO0OO;
        if (zIsEmpty) {
            inputStreamOpenInputStream = null;
        } else {
            file = new File(string);
            if (file.exists()) {
                z = true;
            }
            if (z) {
                inputStreamOpenInputStream = null;
            } else {
                uriFromFile = Uri.fromFile(file);
                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
            iOooO00o = com.bumptech.glide.load.OooO00o.OooO00o(o0oooo1.f55862OooO0O0, inputStreamOpenInputStream2, o0oooo1.f55864OooO0Oo);
            if (inputStreamOpenInputStream2 != null) {
                inputStreamOpenInputStream2.close();
            }
        } else {
            iOooO00o = -1;
        }
        if (iOooO00o != -1) {
            return new OooOO0O(inputStreamOpenInputStream, iOooO00o);
        }
        return inputStreamOpenInputStream;
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
