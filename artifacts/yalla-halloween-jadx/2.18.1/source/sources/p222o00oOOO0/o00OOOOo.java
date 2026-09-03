package p222o00oOOO0;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.facebook.internal.AnalyticsEvents;
import java.io.InputStream;
import p217o00oO00o.o00000;
import p221o00oOO.o0000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000O0;
import p228o00oOo.o000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOOo implements o00000O0<Uri, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33769OooO00o;

    public static class OooO00o implements o00000O<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f33770OooO00o;

        public OooO00o(Context context) {
            this.f33770OooO00o = context;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, InputStream> OooO00o(o0000 o0000Var) {
            return new o00OOOOo(this.f33770OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o00OOOOo(Context context) {
        this.f33769OooO00o = context.getApplicationContext();
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return com.android.billingclient.api.o0000.OooO0Oo(uri2) && !uri2.getPathSegments().contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    @Override // p221o00oOO.o00000O0
    public final o00000O0.OooO00o<InputStream> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        if (!(i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384)) {
            return null;
        }
        b bVar = new b(uri2);
        Context context = this.f33769OooO00o;
        return new o00000O0.OooO00o<>(bVar, o000.OooO0OO(context, uri2, new o000.OooO00o(context.getContentResolver())));
    }
}
