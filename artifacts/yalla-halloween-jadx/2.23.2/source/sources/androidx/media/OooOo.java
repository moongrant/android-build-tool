package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: loaded from: classes.dex */
public class OooOo implements OooOOOO.OooO00o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f6165OooO0OO = OooOOOO.f6160OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f6166OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ContentResolver f6167OooO0O0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f6168OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f6169OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f6170OooO0OO;

        public OooO00o(String str, int i, int i2) {
            this.f6168OooO00o = str;
            this.f6169OooO0O0 = i;
            this.f6170OooO0OO = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            int i = this.f6170OooO0OO;
            String str = this.f6168OooO00o;
            int i2 = this.f6169OooO0O0;
            if (i2 < 0 || oooO00o.f6169OooO0O0 < 0) {
                return TextUtils.equals(str, oooO00o.f6168OooO00o) && i == oooO00o.f6170OooO0OO;
            }
            return TextUtils.equals(str, oooO00o.f6168OooO00o) && i2 == oooO00o.f6169OooO0O0 && i == oooO00o.f6170OooO0OO;
        }

        public final int hashCode() {
            return o000OO.OooO0OO.OooO0O0(this.f6168OooO00o, Integer.valueOf(this.f6170OooO0OO));
        }
    }

    public OooOo(Context context) {
        this.f6166OooO00o = context;
        this.f6167OooO0O0 = context.getContentResolver();
    }

    @Override // androidx.media.OooOOOO.OooO00o
    public boolean OooO00o(@NonNull OooO00o oooO00o) {
        boolean z;
        try {
            if (this.f6166OooO00o.getPackageManager().getApplicationInfo(oooO00o.f6168OooO00o, 0) == null) {
                return false;
            }
            if (!OooO0O0(oooO00o, "android.permission.STATUS_BAR_SERVICE") && !OooO0O0(oooO00o, "android.permission.MEDIA_CONTENT_CONTROL") && oooO00o.f6170OooO0OO != 1000) {
                String string = Settings.Secure.getString(this.f6167OooO0O0, "enabled_notification_listeners");
                if (string == null) {
                    z = false;
                    break;
                }
                String[] strArrSplit = string.split(CertificateUtil.DELIMITER);
                int i = 0;
                while (true) {
                    if (i >= strArrSplit.length) {
                        z = false;
                        break;
                    }
                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(strArrSplit[i]);
                    if (componentNameUnflattenFromString != null && componentNameUnflattenFromString.getPackageName().equals(oooO00o.f6168OooO00o)) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (f6165OooO0OO) {
                Log.d("MediaSessionManager", "Package " + oooO00o.f6168OooO00o + " doesn't exist");
            }
            return false;
        }
    }

    public final boolean OooO0O0(OooO00o oooO00o, String str) {
        int i = oooO00o.f6169OooO0O0;
        if (i < 0) {
            return this.f6166OooO00o.getPackageManager().checkPermission(str, oooO00o.f6168OooO00o) == 0;
        }
        return this.f6166OooO00o.checkPermission(str, i, oooO00o.f6170OooO0OO) == 0;
    }
}
