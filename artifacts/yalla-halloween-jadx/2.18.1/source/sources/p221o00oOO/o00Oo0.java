package p221o00oOO;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.OooO0o;
import com.bumptech.glide.load.data.OooOOO0;
import com.bumptech.glide.load.data.Oooo000;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.InputStream;
import p217o00oO00o.o00000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0<Data> implements o00000O0<Uri, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AssetManager f33735OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o<Data> f33736OooO0O0;

    public interface OooO00o<Data> {
        OooO0o<Data> OooO0OO(AssetManager assetManager, String str);
    }

    public static class OooO0O0 implements o00000O<Uri, ParcelFileDescriptor>, OooO00o<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AssetManager f33737OooO00o;

        public OooO0O0(AssetManager assetManager) {
            this.f33737OooO00o = assetManager;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, ParcelFileDescriptor> OooO00o(o0000 o0000Var) {
            return new o00Oo0(this.f33737OooO00o, this);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }

        @Override // o00oOO.o00Oo0.OooO00o
        public final OooO0o<ParcelFileDescriptor> OooO0OO(AssetManager assetManager, String str) {
            return new OooOOO0(assetManager, str);
        }
    }

    public static class OooO0OO implements o00000O<Uri, InputStream>, OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AssetManager f33738OooO00o;

        public OooO0OO(AssetManager assetManager) {
            this.f33738OooO00o = assetManager;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, InputStream> OooO00o(o0000 o0000Var) {
            return new o00Oo0(this.f33738OooO00o, this);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }

        @Override // o00oOO.o00Oo0.OooO00o
        public final OooO0o<InputStream> OooO0OO(AssetManager assetManager, String str) {
            return new Oooo000(assetManager, str);
        }
    }

    public o00Oo0(AssetManager assetManager, OooO00o<Data> oooO00o) {
        this.f33735OooO00o = assetManager;
        this.f33736OooO0O0 = oooO00o;
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return ShareInternalUtility.STAGING_PARAM.equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o00000O0.OooO00o(new b(uri2), this.f33736OooO0O0.OooO0OO(this.f33735OooO00o, uri2.toString().substring(22)));
    }
}
