package p070o0000ooO;

import android.app.Notification;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends o00000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public CharSequence f27975OooO0O0;

    @Override // p070o0000ooO.o00000O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO00o(@NonNull Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
    }

    @Override // p070o0000ooO.o00000O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0O0(o000OOo o000ooo2) {
        new Notification.BigTextStyle(((o00000O) o000ooo2).f27977OooO0O0).setBigContentTitle(null).bigText(this.f27975OooO0O0);
    }

    @Override // p070o0000ooO.o00000O0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String OooO0OO() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
