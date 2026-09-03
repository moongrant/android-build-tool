package o00OO00O;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo<Data> implements o0OoOo0<Uri, Data> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<String> f37166OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(ShareInternalUtility.STAGING_PARAM, "content", "android.resource")));

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO<Data> f37167OooO00o;

    public static final class OooO00o implements o00O0O<Uri, AssetFileDescriptor>, OooO0OO<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f37168OooO00o;

        public OooO00o(ContentResolver contentResolver) {
            this.f37168OooO00o = contentResolver;
        }

        @Override // o00OO00O.oo0o0Oo.OooO0OO
        public final com.bumptech.glide.load.data.OooO0o<AssetFileDescriptor> OooO00o(Uri uri) {
            return new com.bumptech.glide.load.data.OooO00o(this.f37168OooO00o, uri);
        }

        @Override // o00OO00O.o00O0O
        public final o0OoOo0<Uri, AssetFileDescriptor> OooO0OO(oo000o oo000oVar) {
            return new oo0o0Oo(this);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0O0 implements o00O0O<Uri, ParcelFileDescriptor>, OooO0OO<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f37169OooO00o;

        public OooO0O0(ContentResolver contentResolver) {
            this.f37169OooO00o = contentResolver;
        }

        @Override // o00OO00O.oo0o0Oo.OooO0OO
        public final com.bumptech.glide.load.data.OooO0o<ParcelFileDescriptor> OooO00o(Uri uri) {
            return new com.bumptech.glide.load.data.OooOOO(this.f37169OooO00o, uri);
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, ParcelFileDescriptor> OooO0OO(oo000o oo000oVar) {
            return new oo0o0Oo(this);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public interface OooO0OO<Data> {
        com.bumptech.glide.load.data.OooO0o<Data> OooO00o(Uri uri);
    }

    public static class OooO0o implements o00O0O<Uri, InputStream>, OooO0OO<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContentResolver f37170OooO00o;

        public OooO0o(ContentResolver contentResolver) {
            this.f37170OooO00o = contentResolver;
        }

        @Override // o00OO00O.oo0o0Oo.OooO0OO
        public final com.bumptech.glide.load.data.OooO0o<InputStream> OooO00o(Uri uri) {
            return new com.bumptech.glide.load.data.Oooo0(this.f37170OooO00o, uri);
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0OO(oo000o oo000oVar) {
            return new oo0o0Oo(this);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public oo0o0Oo(OooO0OO<Data> oooO0OO) {
        this.f37167OooO00o = oooO0OO;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        return f37166OooO0O0.contains(uri.getScheme());
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o0OoOo0.OooO00o(new o00OOO0O.OooO0o(uri2), this.f37167OooO00o.OooO00o(uri2));
    }
}
