package p228o00oOo;

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
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o000 implements OooO0o<InputStream> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Uri f33880Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o000O0o f33881Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public InputStream f33882Oooo0oo;

    public static class OooO00o implements o000O000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f33883OooO0O0 = {"_data"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f33884OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f33884OooO00o = contentResolver;
        }

        @Override // p228o00oOo.o000O000
        public final Cursor OooO00o(Uri uri) {
            return this.f33884OooO00o.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f33883OooO0O0, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static class OooO0O0 implements o000O000 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final String[] f33885OooO0O0 = {"_data"};

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f33886OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.f33886OooO00o = contentResolver;
        }

        @Override // p228o00oOo.o000O000
        public final Cursor OooO00o(Uri uri) {
            return this.f33886OooO00o.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f33885OooO0O0, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @VisibleForTesting
    public o000(Uri uri, o000O0o o000o0o2) {
        this.f33880Oooo0o = uri;
        this.f33881Oooo0oO = o000o0o2;
    }

    public static o000 OooO0OO(Context context, Uri uri, o000O000 o000o001) {
        return new o000(uri, new o000O0o(OooO0OO.OooO0O0(context).f12377OoooO00.OooO0o0(), o000o001, OooO0OO.OooO0O0(context).f12376OoooO0, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final Class<InputStream> OooO00o() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void OooO0O0() {
        InputStream inputStream = this.f33882Oooo0oo;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    @NonNull
    public final DataSource OooO0Oo() {
        return DataSource.LOCAL;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049 A[PHI: r6
      0x0049: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v9 android.database.Cursor) binds: [B:20:0x0047, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final InputStream OooO0o() throws Throwable {
        SecurityException e;
        Cursor cursorOooO00o;
        String string;
        InputStream inputStreamOpenInputStream;
        int iOooO00o;
        Uri uri;
        File file;
        Uri uriFromFile;
        o000O0o o000o0o2 = this.f33881Oooo0oO;
        Uri uri2 = this.f33880Oooo0o;
        Objects.requireNonNull(o000o0o2);
        boolean z = false;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            cursorOooO00o = o000o0o2.f33892OooO00o.OooO00o(uri2);
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
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri2, e);
                        }
                        if (cursorOooO00o != null) {
                            cursorOooO00o.close();
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() && 0 < file.length()) {
                            z = true;
                        }
                        if (z) {
                            uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = o000o0o2.f33894OooO0OO.openInputStream(uriFromFile);
                            } catch (NullPointerException e3) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri2 + " -> " + uriFromFile).initCause(e3));
                            }
                        } else {
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        o000O0o o000o0o3 = this.f33881Oooo0oO;
                        uri = this.f33880Oooo0o;
                        Objects.requireNonNull(o000o0o3);
                        try {
                            try {
                                inputStreamOpenInputStream2 = o000o0o3.f33894OooO0OO.openInputStream(uri);
                                iOooO00o = com.bumptech.glide.load.OooO0OO.OooO00o(o000o0o3.f33895OooO0Oo, inputStreamOpenInputStream2, o000o0o3.f33893OooO0O0);
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
        if (TextUtils.isEmpty(string)) {
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
                inputStreamOpenInputStream = o000o0o2.f33894OooO0OO.openInputStream(uriFromFile);
            }
        }
        if (inputStreamOpenInputStream != null) {
            o000O0o o000o0o4 = this.f33881Oooo0oO;
            uri = this.f33880Oooo0o;
            Objects.requireNonNull(o000o0o4);
            inputStreamOpenInputStream2 = o000o0o4.f33894OooO0OO.openInputStream(uri);
            iOooO00o = com.bumptech.glide.load.OooO0OO.OooO00o(o000o0o4.f33895OooO0Oo, inputStreamOpenInputStream2, o000o0o4.f33893OooO0O0);
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
    public final void OooO0o0(@NonNull Priority priority, @NonNull OooO0o.OooO00o<? super InputStream> oooO00o) throws Throwable {
        try {
            InputStream inputStreamOooO0o = OooO0o();
            this.f33882Oooo0oo = inputStreamOooO0o;
            oooO00o.OooO0o(inputStreamOooO0o);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            oooO00o.OooO0OO(e);
        }
    }

    @Override // com.bumptech.glide.load.data.OooO0o
    public final void cancel() {
    }
}
