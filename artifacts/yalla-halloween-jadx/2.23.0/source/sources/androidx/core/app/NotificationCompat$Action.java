package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00000O.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$Action {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CharSequence f5254OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bundle f5255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public IconCompat f5256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RemoteInput[] f5257OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f5258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f5259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f5260OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f5261OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Deprecated
    public final int f5262OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final PendingIntent f5263OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f5264OooOO0O;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SemanticAction {
    }

    public NotificationCompat$Action(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        IconCompat iconCompatOooO0O0 = i == 0 ? null : IconCompat.OooO0O0("", i);
        Bundle bundle = new Bundle();
        this.f5260OooO0o0 = true;
        this.f5256OooO0O0 = iconCompatOooO0O0;
        if (iconCompatOooO0O0 != null) {
            int i2 = iconCompatOooO0O0.f5301OooO00o;
            if ((i2 == -1 ? IconCompat.OooO00o.OooO0OO(iconCompatOooO0O0.f5302OooO0O0) : i2) == 2) {
                this.f5262OooO0oo = iconCompatOooO0O0.OooO0OO();
            }
        }
        this.f5254OooO = o00O0O.OooO0O0(str);
        this.f5263OooOO0 = pendingIntent;
        this.f5255OooO00o = bundle;
        this.f5257OooO0OO = null;
        this.f5258OooO0Oo = true;
        this.f5259OooO0o = 0;
        this.f5260OooO0o0 = true;
        this.f5261OooO0oO = false;
        this.f5264OooOO0O = false;
    }
}
