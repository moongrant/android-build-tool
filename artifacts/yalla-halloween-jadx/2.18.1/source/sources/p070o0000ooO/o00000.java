package p070o0000ooO;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat$Action;
import java.util.ArrayList;
import java.util.Objects;
import p069o0000oo0.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f27952OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Context f27953OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f27957OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f27958OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PendingIntent f27959OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Bitmap f27960OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f27961OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00000O0 f27963OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Bundle f27964OooOOO;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f27968OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f27969OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Notification f27970OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Deprecated
    public ArrayList<String> f27971OooOo00;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ArrayList<NotificationCompat$Action> f27954OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ArrayList<o0000oo> f27955OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ArrayList<NotificationCompat$Action> f27956OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f27962OooOO0O = true;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f27965OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f27966OooOOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f27967OooOOOo = 0;

    public o00000(@NonNull Context context, @NonNull String str) {
        Notification notification = new Notification();
        this.f27970OooOOoo = notification;
        this.f27953OooO00o = context;
        this.f27969OooOOo0 = str;
        notification.when = System.currentTimeMillis();
        this.f27970OooOOoo.audioStreamType = -1;
        this.f27961OooOO0 = 0;
        this.f27971OooOo00 = new ArrayList<>();
        this.f27968OooOOo = true;
    }

    @Nullable
    public static CharSequence OooO0O0(@Nullable CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    @NonNull
    public final Notification OooO00o() {
        Notification notificationBuild;
        Bundle bundle;
        o00000O o00000o = new o00000O(this);
        o00000O0 o00000o1 = o00000o.f27978OooO0OO.f27963OooOO0o;
        if (o00000o1 != null) {
            o00000o1.OooO0O0(o00000o);
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            o00000o.f27977OooO0O0.setExtras(o00000o.f27980OooO0o0);
            notificationBuild = o00000o.f27977OooO0O0.build();
        } else {
            notificationBuild = o00000o.f27977OooO0O0.build();
        }
        Objects.requireNonNull(o00000o.f27978OooO0OO);
        if (o00000o1 != null) {
            Objects.requireNonNull(o00000o.f27978OooO0OO.f27963OooOO0o);
        }
        if (o00000o1 != null && (bundle = notificationBuild.extras) != null) {
            o00000o1.OooO00o(bundle);
        }
        return notificationBuild;
    }

    @NonNull
    public final o00000 OooO0OO(boolean z) {
        if (z) {
            this.f27970OooOOoo.flags |= 16;
        } else {
            this.f27970OooOOoo.flags &= -17;
        }
        return this;
    }

    @NonNull
    public final o00000 OooO0Oo(@Nullable Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f27953OooO00o.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(o000O0Oo.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(o000O0Oo.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
            }
        }
        this.f27960OooO0oo = bitmap;
        return this;
    }

    @NonNull
    public final o00000 OooO0o0(@Nullable o00000O0 o00000o1) {
        if (this.f27963OooOO0o != o00000o1) {
            this.f27963OooOO0o = o00000o1;
            if (o00000o1.f27981OooO00o != this) {
                o00000o1.f27981OooO00o = this;
                OooO0o0(o00000o1);
            }
        }
        return this;
    }
}
