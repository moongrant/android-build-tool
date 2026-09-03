package p130o00OO00o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.AnalyticsEvents;
import java.io.InputStream;
import o00OO00O.o00O0O;
import o00OO00O.o0OoOo0;
import o00OO00O.oo000o;
import o00OO0O0.o000OOo;
import o00OOO0O.OooO0o;
import p126o00O0oOo.o00000;
import p128o00O0oo0.OooOO0;
import p128o00O0oo0.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements o0OoOo0<Uri, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37190OooO00o;

    public static class OooO00o implements o00O0O<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f37191OooO00o;

        public OooO00o(Context context) {
            this.f37191OooO00o = context;
        }

        @Override // o00OO00O.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0OO(oo000o oo000oVar) {
            return new o000000O(this.f37191OooO00o);
        }

        @Override // o00OO00O.o00O0O
        public final void OooO0Oo() {
        }
    }

    public o000000O(Context context) {
        this.f37190OooO00o = context.getApplicationContext();
    }

    @Override // o00OO00O.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return OooOO0.OooO00o(uri2) && uri2.getPathSegments().contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    @Override // o00OO00O.o0OoOo0
    @Nullable
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull o00000 o00000Var) {
        Uri uri2 = uri;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            Long l = (Long) o00000Var.OooO0OO(o000OOo.f37214OooO0Oo);
            if (l != null && l.longValue() == -1) {
                OooO0o oooO0o = new OooO0o(uri2);
                Context context = this.f37190OooO00o;
                return new o0OoOo0.OooO00o<>(oooO0o, OooOO0O.OooO0OO(context, uri2, new OooOO0O.OooO0O0(context.getContentResolver())));
            }
        }
        return null;
    }
}
