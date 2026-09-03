package p130o00OO00o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.facebook.internal.AnalyticsEvents;
import java.io.InputStream;
import o00OO00O.o00O0O;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import o00OOO0O.OooO0o;
import p126o00O0oOo.o00000;
import p128o00O0oo0.OooOO0;
import p128o00O0oo0.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements o0OoOo0<Uri, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37188OooO00o;

    public static class OooO00o implements o00O0O<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37189OooO00o;

        public OooO00o(Context context) {
            this.f37189OooO00o = context;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0OO(oo000o oo000oVar) {
            return new o000000(this.f37189OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o000000(Context context) {
        this.f37188OooO00o = context.getApplicationContext();
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return OooOO0.OooO00o(uri2) && !uri2.getPathSegments().contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    @Override // o00OO00O.o0OoOo0
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        if (!(i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384)) {
            return null;
        }
        OooO0o oooO0o = new OooO0o(uri2);
        Context context = this.f37188OooO00o;
        return new o0OoOo0.OooO00o<>(oooO0o, OooOO0O.OooO0OO(context, uri2, new OooOO0O.OooO00o(context.getContentResolver())));
    }
}
