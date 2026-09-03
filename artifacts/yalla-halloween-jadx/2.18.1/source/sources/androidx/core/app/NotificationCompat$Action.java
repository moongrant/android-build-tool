package androidx.core.app;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p070o0000ooO.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$Action {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Deprecated
    public int f7796OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bundle f7797OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public IconCompat f7798OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RemoteInput[] f7799OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RemoteInput[] f7800OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f7801OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f7802OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f7803OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f7804OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f7805OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PendingIntent f7806OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f7807OooOO0o;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SemanticAction {
    }

    public NotificationCompat$Action(int i, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent) {
        IconCompat iconCompatOooO0O0 = i == 0 ? null : IconCompat.OooO0O0("", i);
        Bundle bundle = new Bundle();
        this.f7801OooO0o = true;
        this.f7798OooO0O0 = iconCompatOooO0O0;
        if (iconCompatOooO0O0 != null) {
            int iOooO0OO = iconCompatOooO0O0.f7839OooO00o;
            if (iOooO0OO == -1 && Build.VERSION.SDK_INT >= 23) {
                iOooO0OO = IconCompat.OooO00o.OooO0OO(iconCompatOooO0O0.f7840OooO0O0);
            }
            if (iOooO0OO == 2) {
                this.f7796OooO = iconCompatOooO0O0.OooO0OO();
            }
        }
        this.f7805OooOO0 = o00000.OooO0O0(charSequence);
        this.f7806OooOO0O = pendingIntent;
        this.f7797OooO00o = bundle;
        this.f7799OooO0OO = null;
        this.f7800OooO0Oo = null;
        this.f7802OooO0o0 = true;
        this.f7803OooO0oO = 0;
        this.f7801OooO0o = true;
        this.f7804OooO0oo = false;
        this.f7807OooOO0o = false;
    }

    @Nullable
    public final IconCompat OooO00o() {
        int i;
        if (this.f7798OooO0O0 == null && (i = this.f7796OooO) != 0) {
            this.f7798OooO0O0 = IconCompat.OooO0O0("", i);
        }
        return this.f7798OooO0O0;
    }
}
