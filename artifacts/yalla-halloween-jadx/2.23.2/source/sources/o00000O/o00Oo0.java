package o00000O;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat$Action;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33427OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final Context f33428OooO00o;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public CharSequence f33432OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public CharSequence f33433OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public PendingIntent f33434OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public IconCompat f33435OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f33436OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00Ooo f33438OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Bundle f33439OooOOO;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f33443OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f33444OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Notification f33445OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f33446OooOo00;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final ArrayList<NotificationCompat$Action> f33429OooO0O0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final ArrayList<o0Oo0oo> f33430OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayList<NotificationCompat$Action> f33431OooO0Oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f33437OooOO0O = true;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33440OooOOO0 = false;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f33441OooOOOO = 0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f33442OooOOOo = 0;

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

    public o00Oo0(@NonNull Context context, @NonNull String str) {
        Notification notification = new Notification();
        this.f33445OooOOoo = notification;
        this.f33428OooO00o = context;
        this.f33444OooOOo0 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f33436OooOO0 = 0;
        this.f33446OooOo00 = new ArrayList<>();
        this.f33443OooOOo = true;
    }

    @Nullable
    public static CharSequence OooO0O0(@Nullable CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    @NonNull
    public final Notification OooO00o() {
        Notification notificationOooO00o;
        Bundle bundle;
        oo000o oo000oVar = new oo000o(this);
        o00Oo0 o00oo1 = oo000oVar.f33469OooO0OO;
        o00Ooo o00ooo2 = o00oo1.f33438OooOO0o;
        if (o00ooo2 != null) {
            o00ooo2.OooO0O0(oo000oVar);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = oo000oVar.f33468OooO0O0;
        if (i < 26 && i < 24) {
            oo000o.OooO0OO.OooO00o(builder, oo000oVar.f33470OooO0Oo);
            notificationOooO00o = oo000o.OooO00o.OooO00o(builder);
        } else {
            notificationOooO00o = oo000o.OooO00o.OooO00o(builder);
        }
        if (o00ooo2 != null) {
            o00oo1.f33438OooOO0o.getClass();
        }
        if (o00ooo2 != null && (bundle = notificationOooO00o.extras) != null) {
            o00ooo2.OooO00o(bundle);
        }
        return notificationOooO00o;
    }

    public final void OooO0OO(int i, boolean z) {
        Notification notification = this.f33445OooOOoo;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    @NonNull
    public final void OooO0Oo(@Nullable Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f33428OooO00o.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(o00000O0.OooO0OO.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(o00000O0.OooO0OO.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f5309OooOO0O;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f5312OooO0O0 = bitmap;
            iconCompat = iconCompat2;
        }
        this.f33435OooO0oo = iconCompat;
    }

    @NonNull
    public final void OooO0o0(@Nullable o00Ooo o00ooo2) {
        if (this.f33438OooOO0o != o00ooo2) {
            this.f33438OooOO0o = o00ooo2;
            if (o00ooo2 != null) {
                o00ooo2.OooO0Oo(this);
            }
        }
    }
}
