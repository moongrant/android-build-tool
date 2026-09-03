package p070o0000ooO;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends o00000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Bitmap f27972OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public IconCompat f27973OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f27974OooO0Oo;

    @RequiresApi(16)
    public static class OooO00o {
        @RequiresApi(16)
        public static void OooO00o(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
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
        public static void OooO00o(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        @RequiresApi(31)
        public static void OooO0O0(Notification.BigPictureStyle bigPictureStyle, boolean z) {
            bigPictureStyle.showBigPictureWhenCollapsed(z);
        }
    }

    @Override // p070o0000ooO.o00000O0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void OooO0O0(o000OOo o000ooo2) {
        Bitmap bitmapOooO00o;
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(((o00000O) o000ooo2).f27977OooO0O0).setBigContentTitle(null).bigPicture(this.f27972OooO0O0);
        if (this.f27974OooO0Oo) {
            IconCompat iconCompat = this.f27973OooO0OO;
            if (iconCompat == null) {
                OooO00o.OooO00o(bigPictureStyleBigPicture, null);
            } else if (i >= 23) {
                Context context = ((o00000O) o000ooo2).f27976OooO00o;
                if (i < 23) {
                    throw new UnsupportedOperationException("This method is only supported on API level 23+");
                }
                OooO0O0.OooO00o(bigPictureStyleBigPicture, IconCompat.OooO00o.OooO0o(iconCompat, context));
            } else {
                int iOooO0OO = iconCompat.f7839OooO00o;
                if (iOooO0OO == -1 && i >= 23) {
                    iOooO0OO = IconCompat.OooO00o.OooO0OO(iconCompat.f7840OooO0O0);
                }
                if (iOooO0OO == 1) {
                    IconCompat iconCompat2 = this.f27973OooO0OO;
                    int i2 = iconCompat2.f7839OooO00o;
                    if (i2 == -1 && i >= 23) {
                        Object obj = iconCompat2.f7840OooO0O0;
                        bitmapOooO00o = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        bitmapOooO00o = (Bitmap) iconCompat2.f7840OooO0O0;
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        bitmapOooO00o = IconCompat.OooO00o((Bitmap) iconCompat2.f7840OooO0O0, true);
                    }
                    OooO00o.OooO00o(bigPictureStyleBigPicture, bitmapOooO00o);
                } else {
                    OooO00o.OooO00o(bigPictureStyleBigPicture, null);
                }
            }
        }
        if (i >= 31) {
            OooO0OO.OooO0O0(bigPictureStyleBigPicture, false);
            OooO0OO.OooO00o(bigPictureStyleBigPicture, null);
        }
    }

    @Override // p070o0000ooO.o00000O0
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final String OooO0OO() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @NonNull
    public final o000000 OooO0Oo() {
        this.f27973OooO0OO = null;
        this.f27974OooO0Oo = true;
        return this;
    }
}
