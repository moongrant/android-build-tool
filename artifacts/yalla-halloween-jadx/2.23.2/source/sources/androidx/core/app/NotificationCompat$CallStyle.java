package androidx.core.app;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00000O.o00Ooo;
import o00000O.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$CallStyle extends o00Ooo {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface CallType {
    }

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static Notification.Builder OooO00o(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        public static Notification.Builder OooO0O0(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }
    }

    @Override // o00000O.o00Ooo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o(@NonNull Bundle bundle) {
        super.OooO00o(bundle);
        bundle.putInt("android.callType", 0);
        bundle.putBoolean("android.callIsVideo", false);
        bundle.putCharSequence("android.verificationText", null);
        bundle.putParcelable("android.answerIntent", null);
        bundle.putParcelable("android.declineIntent", null);
        bundle.putParcelable("android.hangUpIntent", null);
    }

    @Override // o00000O.o00Ooo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0O0(oo000o oo000oVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (Log.isLoggable("NotifCompat", 3)) {
                Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(0));
                return;
            }
            return;
        }
        Notification.Builder builder = oo000oVar.f33468OooO0O0;
        builder.setContentTitle(null);
        Bundle bundle = this.f33447OooO00o.f33439OooOOO;
        CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f33447OooO00o.f33439OooOOO.getCharSequence("android.text");
        builder.setContentText(charSequence != null ? charSequence : null);
        OooO00o.OooO0O0(builder, "call");
    }

    @Override // o00000O.o00Ooo
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String OooO0OO() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }
}
