package p222o00oOOO0;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.AnalyticsEvents;
import java.io.InputStream;
import p217o00oO00o.o00000;
import p221o00oOO.o0000;
import p221o00oOO.o00000O;
import p221o00oOO.o00000O0;
import p224o00oOOOo.oOO00;
import p228o00oOo.o000;
import p239o00oOooo.b;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo00 implements o00000O0<Uri, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f33771OooO00o;

    public static class OooO00o implements o00000O<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f33772OooO00o;

        public OooO00o(Context context) {
            this.f33772OooO00o = context;
        }

        @Override // p221o00oOO.o00000O
        @NonNull
        public final o00000O0<Uri, InputStream> OooO00o(o0000 o0000Var) {
            return new o00Oo00(this.f33772OooO00o);
        }

        @Override // p221o00oOO.o00000O
        public final void OooO0O0() {
        }
    }

    public o00Oo00(Context context) {
        this.f33771OooO00o = context.getApplicationContext();
    }

    @Override // p221o00oOO.o00000O0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return com.android.billingclient.api.o0000.OooO0Oo(uri2) && uri2.getPathSegments().contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    @Override // p221o00oOO.o00000O0
    @Nullable
    public final o00000O0.OooO00o<InputStream> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        boolean z = false;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            Long l = (Long) o00000Var.OooO0OO(oOO00.f33827OooO0Oo);
            if (l != null && l.longValue() == -1) {
                z = true;
            }
            if (z) {
                b bVar = new b(uri2);
                Context context = this.f33771OooO00o;
                return new o00000O0.OooO00o<>(bVar, o000.OooO0OO(context, uri2, new o000.OooO0O0(context.getContentResolver())));
            }
        }
        return null;
    }
}
