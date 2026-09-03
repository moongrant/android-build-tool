package o00OO00O;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.InputStream;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o<Data> implements o0OoOo0<Uri, Data> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AssetManager f37079OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC0428OooO00o<Data> f37080OooO0O0;

    /* JADX INFO: renamed from: o00OO00O.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0428OooO00o<Data> {
        com.bumptech.glide.load.data.OooO0o<Data> OooO00o(AssetManager assetManager, String str);
    }

    public static class OooO0O0 implements o00O0O<Uri, AssetFileDescriptor>, InterfaceC0428OooO00o<AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AssetManager f37081OooO00o;

        public OooO0O0(AssetManager assetManager) {
            this.f37081OooO00o = assetManager;
        }

        @Override // o00OO00O.OooO00o.InterfaceC0428OooO00o
        public final com.bumptech.glide.load.data.OooO0o<AssetFileDescriptor> OooO00o(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.OooOOO0(assetManager, str);
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, AssetFileDescriptor> OooO0OO(oo000o oo000oVar) {
            return new OooO00o(this.f37081OooO00o, this);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static class OooO0OO implements o00O0O<Uri, InputStream>, InterfaceC0428OooO00o<InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AssetManager f37082OooO00o;

        public OooO0OO(AssetManager assetManager) {
            this.f37082OooO00o = assetManager;
        }

        @Override // o00OO00O.OooO00o.InterfaceC0428OooO00o
        public final com.bumptech.glide.load.data.OooO0o<InputStream> OooO00o(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.Oooo000(assetManager, str);
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0OO(oo000o oo000oVar) {
            return new OooO00o(this.f37082OooO00o, this);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public OooO00o(AssetManager assetManager, InterfaceC0428OooO00o<Data> interfaceC0428OooO00o) {
        this.f37079OooO00o = assetManager;
        this.f37080OooO0O0 = interfaceC0428OooO00o;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return ShareInternalUtility.STAGING_PARAM.equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        return new o0OoOo0.OooO00o(new o00OOO0O.OooO0o(uri2), this.f37080OooO0O0.OooO00o(this.f37079OooO00o, uri2.toString().substring(22)));
    }
}
