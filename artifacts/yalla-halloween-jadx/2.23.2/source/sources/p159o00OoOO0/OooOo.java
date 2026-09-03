package p159o00OoOO0;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.AnalyticsEvents;
import java.io.InputStream;
import o00OoO.o00O0O;
import o00OoO.o0OoOo0;
import o00OoO.oo000o;
import p154o00Oo0oo.oo0o0Oo;
import p160o00OoOOO.o0000O0;
import p173o00OooOO.oo00o;
import p548o0oOO.Oooo0;
import p548o0oOO.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements o0OoOo0<Uri, InputStream> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38021OooO00o;

    public static class OooO00o implements o00O0O<Uri, InputStream> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f38022OooO00o;

        public OooO00o(Context context) {
            this.f38022OooO00o = context;
        }

        @Override // o00OoO.o00O0O
        public final void OooO0OO() {
        }

        @Override // o00OoO.o00O0O
        @NonNull
        public final o0OoOo0<Uri, InputStream> OooO0Oo(oo000o oo000oVar) {
            return new OooOo(this.f38022OooO00o);
        }
    }

    public OooOo(Context context) {
        this.f38021OooO00o = context.getApplicationContext();
    }

    @Override // o00OoO.o0OoOo0
    public final boolean OooO00o(@NonNull Uri uri) {
        Uri uri2 = uri;
        return Oooo000.OooO00o(uri2) && uri2.getPathSegments().contains(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO);
    }

    @Override // o00OoO.o0OoOo0
    @Nullable
    public final o0OoOo0.OooO00o<InputStream> OooO0O0(@NonNull Uri uri, int i, int i2, @NonNull oo0o0Oo oo0o0oo) {
        Uri uri2 = uri;
        if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384) {
            Long l = (Long) oo0o0oo.OooO0OO(o0000O0.f38072OooO0Oo);
            if (l != null && l.longValue() == -1) {
                oo00o oo00oVar = new oo00o(uri2);
                Context context = this.f38021OooO00o;
                return new o0OoOo0.OooO00o<>(oo00oVar, Oooo0.OooO0OO(context, uri2, new Oooo0.OooO0O0(context.getContentResolver())));
            }
        }
        return null;
    }
}
