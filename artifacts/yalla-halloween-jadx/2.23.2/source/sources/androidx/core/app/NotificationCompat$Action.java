package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o00000O.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationCompat$Action {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CharSequence f5260OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Bundle f5261OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public IconCompat f5262OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RemoteInput[] f5263OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f5264OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f5265OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f5266OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f5267OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Deprecated
    public final int f5268OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final PendingIntent f5269OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f5270OooOO0O;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SemanticAction {
    }

    public NotificationCompat$Action(@Nullable IconCompat iconCompat, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(iconCompat, str, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
    }

    public NotificationCompat$Action(@Nullable IconCompat iconCompat, @Nullable CharSequence charSequence, @Nullable PendingIntent pendingIntent, @Nullable Bundle bundle, @Nullable RemoteInput[] remoteInputArr, @Nullable RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        this.f5266OooO0o0 = true;
        this.f5262OooO0O0 = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.f5311OooO00o;
            if ((i2 == -1 ? IconCompat.OooO00o.OooO0OO(iconCompat.f5312OooO0O0) : i2) == 2) {
                this.f5268OooO0oo = iconCompat.OooO0Oo();
            }
        }
        this.f5260OooO = o00Oo0.OooO0O0(charSequence);
        this.f5269OooOO0 = pendingIntent;
        this.f5261OooO00o = bundle == null ? new Bundle() : bundle;
        this.f5263OooO0OO = remoteInputArr;
        this.f5264OooO0Oo = z;
        this.f5265OooO0o = i;
        this.f5266OooO0o0 = z2;
        this.f5267OooO0oO = z3;
        this.f5270OooOO0O = z4;
    }
}
