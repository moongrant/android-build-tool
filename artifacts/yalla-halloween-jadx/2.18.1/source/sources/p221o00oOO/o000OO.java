package p221o00oOO;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.OooOOO;
import com.bumptech.glide.load.data.Oooo0;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO<Data> implements o00000O0<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f33725OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(ShareInternalUtility.STAGING_PARAM, "android.resource", "content")));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO<Data> f33726OooO00o;

    public static final class OooO00o implements o00000O<Uri, AssetFileDescriptor>, OooO0OO<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f33727OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f33727OooO00o = contentResolver;
        }

        @Override // p221o00oOO.o00000O
        public final o00000O0<Uri, AssetFileDescriptor> OooO00o(o0000 o0000Var) {
            return new o000OO(this);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }

        @Override // o00oOO.o000OO.OooO0OO
        public final com.bumptech.glide.load.data.OooO0o<AssetFileDescriptor> OooO0OO(Uri uri) {
            return new com.bumptech.glide.load.data.OooO00o(this.f33727OooO00o, uri);
        }
    }

    public static class OooO0O0 implements o00000O<Uri, ParcelFileDescriptor>, OooO0OO<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f33728OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.f33728OooO00o = contentResolver;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, ParcelFileDescriptor> OooO00o(o0000 o0000Var) {
            return new o000OO(this);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }

        @Override // o00oOO.o000OO.OooO0OO
        public final com.bumptech.glide.load.data.OooO0o<ParcelFileDescriptor> OooO0OO(Uri uri) {
            return new OooOOO(this.f33728OooO00o, uri);
        }
    }

    public interface OooO0OO<Data> {
        com.bumptech.glide.load.data.OooO0o<Data> OooO0OO(Uri uri);
    }

    public static class OooO0o implements o00000O<Uri, InputStream>, OooO0OO<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f33729OooO00o;

        public OooO0o(ContentResolver contentResolver) {
            this.f33729OooO00o = contentResolver;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, InputStream> OooO00o(o0000 o0000Var) {
            return new o000OO(this);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }

        @Override // o00oOO.o000OO.OooO0OO
        public final com.bumptech.glide.load.data.OooO0o<InputStream> OooO0OO(Uri uri) {
            return new Oooo0(this.f33729OooO00o, uri);
        }
    }

    public o000OO(OooO0OO<Data> oooO0OO) {
        this.f33726OooO00o = oooO0OO;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        return f33725OooO0O0.contains(uri.getScheme());
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o00000O0.OooO00o(new b(uri2), this.f33726OooO00o.OooO0OO(uri2));
    }
}
