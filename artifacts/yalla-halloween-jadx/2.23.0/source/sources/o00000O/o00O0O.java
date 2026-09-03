package o00000O;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat$Action;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33939OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Context f33940OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f33944OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f33945OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PendingIntent f33946OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Bitmap f33947OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f33948OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00Oo0 f33950OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Bundle f33951OooOOO;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f33955OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f33956OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Notification f33957OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f33958OooOo00;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final ArrayList<NotificationCompat$Action> f33941OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final ArrayList<o0Oo0oo> f33942OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<NotificationCompat$Action> f33943OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33949OooOO0O = true;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33952OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f33953OooOOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f33954OooOOOo = 0;

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static AudioAttributes OooO00o(AudioAttributes.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static AudioAttributes.Builder OooO0O0() {
            return new AudioAttributes.Builder();
        }

        @DoNotInline
        public static AudioAttributes.Builder OooO0OO(AudioAttributes.Builder builder, int i) {
            return builder.setContentType(i);
        }

        @DoNotInline
        public static AudioAttributes.Builder OooO0Oo(AudioAttributes.Builder builder, int i) {
            return builder.setLegacyStreamType(i);
        }

        @DoNotInline
        public static AudioAttributes.Builder OooO0o0(AudioAttributes.Builder builder, int i) {
            return builder.setUsage(i);
        }
    }

    public o00O0O(@NonNull Context context, @NonNull String str) {
        Notification notification = new Notification();
        this.f33957OooOOoo = notification;
        this.f33940OooO00o = context;
        this.f33956OooOOo0 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f33948OooOO0 = 0;
        this.f33958OooOo00 = new ArrayList<>();
        this.f33955OooOOo = true;
    }

    @Nullable
    public static CharSequence OooO0O0(@Nullable String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    @NonNull
    public final Notification OooO00o() {
        Notification notificationOooO00o;
        Bundle bundle;
        o00Ooo o00ooo2 = new o00Ooo(this);
        o00O0O o00o0o2 = o00ooo2.f33962OooO0OO;
        o00Oo0 o00oo1 = o00o0o2.f33950OooOO0o;
        if (o00oo1 != null) {
            o00oo1.OooO0O0(o00ooo2);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = o00ooo2.f33961OooO0O0;
        if (i < 26 && i < 24) {
            o00Ooo.OooO0OO.OooO00o(builder, o00ooo2.f33963OooO0Oo);
            notificationOooO00o = o00Ooo.OooO00o.OooO00o(builder);
        } else {
            notificationOooO00o = o00Ooo.OooO00o.OooO00o(builder);
        }
        if (o00oo1 != null) {
            o00o0o2.f33950OooOO0o.getClass();
        }
        if (o00oo1 != null && (bundle = notificationOooO00o.extras) != null) {
            o00oo1.OooO00o(bundle);
        }
        return notificationOooO00o;
    }

    @NonNull
    public final void OooO0OO(@Nullable Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f33940OooO00o.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(o00000O0.OooO0O0.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(o00000O0.OooO0O0.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
            }
        }
        this.f33947OooO0oo = bitmap;
    }

    @NonNull
    public final void OooO0Oo(@Nullable o00Oo0 o00oo1) {
        if (this.f33950OooOO0o != o00oo1) {
            this.f33950OooOO0o = o00oo1;
            if (o00oo1.f33959OooO00o != this) {
                o00oo1.f33959OooO00o = this;
                OooO0Oo(o00oo1);
            }
        }
    }
}
