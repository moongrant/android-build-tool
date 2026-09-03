package o00000O;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends o00Ooo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public IconCompat f33464OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public IconCompat f33465OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f33466OooO0Oo;

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static Notification.BigPictureStyle OooO00o(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            return bigPictureStyle.bigPicture(bitmap);
        }

        @DoNotInline
        public static Notification.BigPictureStyle OooO0O0(Notification.Builder builder) {
            return new Notification.BigPictureStyle(builder);
        }

        @DoNotInline
        public static Notification.BigPictureStyle OooO0OO(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            return bigPictureStyle.setBigContentTitle(charSequence);
        }

        @RequiresApi(16)
        public static void OooO0Oo(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    @RequiresApi(23)
    public static class OooO0O0 {
        @RequiresApi(23)
        public static void OooO00o(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    @RequiresApi(31)
    public static class OooO0OO {
        @RequiresApi(31)
        public static void OooO00o(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        @RequiresApi(31)
        public static void OooO0O0(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        @RequiresApi(31)
        public static void OooO0OO(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    @Override // o00000O.o00Ooo
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0O0(oo000o oo000oVar) {
        Bitmap bitmapOooO00o;
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPictureStyleOooO0OO = OooO00o.OooO0OO(OooO00o.OooO0O0(oo000oVar.f33468OooO0O0), null);
        IconCompat iconCompat = this.f33464OooO0O0;
        Context context = oo000oVar.f33467OooO00o;
        if (iconCompat != null) {
            if (i >= 31) {
                OooO0OO.OooO00o(bigPictureStyleOooO0OO, IconCompat.OooO00o.OooO0o(iconCompat, context));
            } else {
                int iOooO0OO = iconCompat.f5311OooO00o;
                if (iOooO0OO == -1) {
                    iOooO0OO = IconCompat.OooO00o.OooO0OO(iconCompat.f5312OooO0O0);
                }
                if (iOooO0OO == 1) {
                    IconCompat iconCompat2 = this.f33464OooO0O0;
                    int i2 = iconCompat2.f5311OooO00o;
                    if (i2 == -1) {
                        Object obj = iconCompat2.f5312OooO0O0;
                        bitmapOooO00o = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        bitmapOooO00o = (Bitmap) iconCompat2.f5312OooO0O0;
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapOooO00o = IconCompat.OooO00o((Bitmap) iconCompat2.f5312OooO0O0, true);
                    }
                    bigPictureStyleOooO0OO = OooO00o.OooO00o(bigPictureStyleOooO0OO, bitmapOooO00o);
                }
            }
        }
        if (this.f33466OooO0Oo) {
            IconCompat iconCompat3 = this.f33465OooO0OO;
            if (iconCompat3 == null) {
                OooO00o.OooO0Oo(bigPictureStyleOooO0OO, null);
            } else {
                OooO0O0.OooO00o(bigPictureStyleOooO0OO, IconCompat.OooO00o.OooO0o(iconCompat3, context));
            }
        }
        if (i >= 31) {
            OooO0OO.OooO0OO(bigPictureStyleOooO0OO, false);
            OooO0OO.OooO0O0(bigPictureStyleOooO0OO, null);
        }
    }

    @Override // o00000O.o00Ooo
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String OooO0OO() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
