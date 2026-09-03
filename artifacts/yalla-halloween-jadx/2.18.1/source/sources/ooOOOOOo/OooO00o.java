package ooOOOOOo;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import kotlin.UByte;
import p691oO000o0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooOOO0 f53500OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public String f53501OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f53502OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f53503OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ServiceConnectionC0444OooO00o f53504OooO0o0 = new ServiceConnectionC0444OooO00o();

    /* JADX INFO: renamed from: ooOOOOOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public class ServiceConnectionC0444OooO00o implements ServiceConnection {
        public ServiceConnectionC0444OooO00o() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            OooOOO0 c0434OooO00o;
            OooO00o oooO00o = OooO00o.this;
            int i = OooOOO0.OooO00o.f52701OooO00o;
            if (iBinder == null) {
                c0434OooO00o = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
                c0434OooO00o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof OooOOO0)) ? new OooOOO0.OooO00o.C0434OooO00o(iBinder) : (OooOOO0) iInterfaceQueryLocalInterface;
            }
            oooO00o.f53500OooO00o = c0434OooO00o;
            synchronized (OooO00o.this.f53503OooO0Oo) {
                OooO00o.this.f53503OooO0Oo.notify();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            OooO00o.this.f53500OooO00o = null;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f53506OooO00o = new OooO00o();
    }

    public final boolean OooO00o(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.heytap.openid", 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
            }
            return packageInfo != null && packageInfo.versionCode >= 1;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final String OooO0O0(Context context) {
        Signature[] signatureArr;
        if (TextUtils.isEmpty(this.f53501OooO0O0)) {
            this.f53501OooO0O0 = context.getPackageName();
        }
        if (TextUtils.isEmpty(this.f53502OooO0OO)) {
            String string = null;
            try {
                signatureArr = context.getPackageManager().getPackageInfo(this.f53501OooO0O0, 64).signatures;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
                signatureArr = null;
            }
            if (signatureArr != null && signatureArr.length > 0) {
                byte[] byteArray = signatureArr[0].toByteArray();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & UByte.MAX_VALUE) | 256).substring(1, 3));
                        }
                        string = sb.toString();
                    }
                } catch (NoSuchAlgorithmException e2) {
                    e2.printStackTrace();
                }
            }
            this.f53502OooO0OO = string;
        }
        OooOOO0 oooOOO0 = this.f53500OooO00o;
        String str = this.f53501OooO0O0;
        String str2 = this.f53502OooO0OO;
        OooOOO0.OooO00o.C0434OooO00o c0434OooO00o = (OooOOO0.OooO00o.C0434OooO00o) oooOOO0;
        Objects.requireNonNull(c0434OooO00o);
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.heytap.openid.IOpenID");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeString("OUID");
            c0434OooO00o.f52702OooO00o.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            String string2 = parcelObtain2.readString();
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return TextUtils.isEmpty(string2) ? "" : string2;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
