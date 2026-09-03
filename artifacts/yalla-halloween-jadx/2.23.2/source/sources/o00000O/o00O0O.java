package o00000O;

import android.app.Notification;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends o00Ooo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public CharSequence f33426OooO0O0;

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static Notification.BigTextStyle OooO00o(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.bigText(charSequence);
        }

        @DoNotInline
        public static Notification.BigTextStyle OooO0O0(Notification.Builder builder) {
            return new Notification.BigTextStyle(builder);
        }

        @DoNotInline
        public static Notification.BigTextStyle OooO0OO(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setBigContentTitle(charSequence);
        }

        @DoNotInline
        public static Notification.BigTextStyle OooO0Oo(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
            return bigTextStyle.setSummaryText(charSequence);
        }
    }

    @Override // o00000O.o00Ooo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o(@NonNull Bundle bundle) {
        super.OooO00o(bundle);
    }

    @Override // o00000O.o00Ooo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0O0(oo000o oo000oVar) {
        OooO00o.OooO00o(OooO00o.OooO0OO(OooO00o.OooO0O0(oo000oVar.f33468OooO0O0), null), this.f33426OooO0O0);
    }

    @Override // o00000O.o00Ooo
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String OooO0OO() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
