package o00OO00O;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.List;
import p126o00O0oOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo<DataT> implements o0OoOo0<Uri, DataT> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37153OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0<Integer, DataT> f37154OooO0O0;

    public static final class OooO00o implements o00O0O<Uri, AssetFileDescriptor> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37155OooO00o;

        public OooO00o(Context context) {
            this.f37155OooO00o = context;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, AssetFileDescriptor> OooO0OO(@NonNull oo000o oo000oVar) {
            return new o0ooOOo(this.f37155OooO00o, oo000oVar.OooO0OO(Integer.class, AssetFileDescriptor.class));
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public static final class OooO0O0 implements o00O0O<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37156OooO00o;

        public OooO0O0(Context context) {
            this.f37156OooO00o = context;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0OO(@NonNull oo000o oo000oVar) {
            return new o0ooOOo(this.f37156OooO00o, oo000oVar.OooO0OO(Integer.class, InputStream.class));
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o0ooOOo(Context context, o0OoOo0<Integer, DataT> o0oooo0) {
        this.f37153OooO00o = context.getApplicationContext();
        this.f37154OooO0O0 = o0oooo0;
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.f37153OooO00o.getPackageName().equals(uri2.getAuthority());
    }

    @Override // o00OO00O.o0OoOo0
    @Nullable
    public final o0OoOo0.OooO00o OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        o0OoOo0<Integer, DataT> o0oooo0 = this.f37154OooO0O0;
        o0OoOo0.OooO00o<DataT> oooO00oOooO0O0 = null;
        if (size == 1) {
            try {
                int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i3 != 0) {
                    oooO00oOooO0O0 = o0oooo0.OooO0O0(Integer.valueOf(i3), i, i2, o00000Var);
                } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                }
                return oooO00oOooO0O0;
            } catch (NumberFormatException e) {
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return oooO00oOooO0O0;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e);
                return oooO00oOooO0O0;
            }
        }
        if (pathSegments.size() != 2) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
            return null;
        }
        List<String> pathSegments2 = uri2.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = this.f37153OooO00o;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return o0oooo0.OooO0O0(Integer.valueOf(identifier), i, i2, o00000Var);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
        return null;
    }
}
