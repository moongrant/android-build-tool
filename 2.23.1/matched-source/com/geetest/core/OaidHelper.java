package com.geetest.core;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.security.MessageDigest;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public class OaidHelper {
    public static final e a;
    public static Context b = null;
    public static boolean c = false;
    public static PackageManager d;

    public static class a extends j {
        public a() {
            super("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService", "com.asus.msa.action.ACCESS_DID", "com.asus.msa.SupplementaryDID.IDidAidlInterface");
        }

        @Override // com.geetest.core.OaidHelper.j
        public final int a() {
            return 2;
        }
    }

    public static class b extends j {
        public b() {
            super("com.coolpad.deviceidsupport", "com.coolpad.deviceidsupport.DeviceIdService", null, "com.coolpad.deviceidsupport.IDeviceIdManager");
        }

        @Override // com.geetest.core.OaidHelper.j
        public final int a() {
            return 2;
        }
    }

    public static class c extends j {
        public c() {
            super("com.huawei.hwid", null, "com.uodis.opendevice.OPENIDS_SERVICE", "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }
    }

    public static class d implements IInterface {
        public final IBinder a;
        public final String b;

        public d(IBinder iBinder, String str) {
            this.a = iBinder;
            this.b = str;
        }

        public final String a(String str, String str2, String str3, int i) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(this.b);
                if (!TextUtils.isEmpty(str)) {
                    parcelObtain.writeString(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    parcelObtain.writeString(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    parcelObtain.writeString(str3);
                }
                this.a.transact(i, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Throwable th) {
                th.printStackTrace();
                try {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return "";
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.a;
        }
    }

    public interface e {
        boolean a(Context context);

        String b(Context context);

        boolean c(Context context);
    }

    public static class f extends j {
        public f() {
            super("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService", null, "com.zui.deviceidservice.IDeviceidInterface");
        }
    }

    public static class g extends h {
        public g() {
            super("com.meizu.flyme.openidsdk", "");
        }

        @Override // com.geetest.core.OaidHelper.h, com.geetest.core.OaidHelper.e
        public final boolean a(Context context) {
            if (super.a(context)) {
                h.f = true;
            } else {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"support"}, null);
                    if (cursorQuery == null) {
                        return false;
                    }
                    cursorQuery.moveToFirst();
                    int columnIndex = cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    if (columnIndex >= 0) {
                        String string = cursorQuery.getString(columnIndex);
                        if (TextUtils.isEmpty(string)) {
                            return false;
                        }
                        h.f = AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(string);
                    } else {
                        h.f = false;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    h.f = false;
                    return false;
                }
            }
            this.d = true;
            return h.f;
        }

        @Override // com.geetest.core.OaidHelper.h, com.geetest.core.OaidHelper.e
        public final String b(Context context) {
            this.c = new String[]{"oaid"};
            return super.b(context);
        }
    }

    public static class h implements e {
        public static String e = null;
        public static boolean f = false;
        public final String a;
        public final String b;
        public String[] c;
        public boolean d = false;

        public h(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.geetest.core.OaidHelper.e
        public boolean a(Context context) {
            if (this.d) {
                return f;
            }
            if (context == null) {
                return false;
            }
            try {
                PackageManager packageManager = OaidHelper.getPackageManager(context);
                f = (packageManager == null || packageManager.resolveContentProvider(this.a, 0) == null) ? false : true;
            } catch (Throwable th) {
                th.printStackTrace();
                f = false;
            }
            this.d = true;
            return f;
        }

        @Override // com.geetest.core.OaidHelper.e
        public String b(Context context) {
            Cursor cursorQuery;
            if (TextUtils.isEmpty(e)) {
                try {
                    cursorQuery = context.getContentResolver().query(Uri.parse("content://" + this.a + "/" + this.b), null, null, this.c, null);
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.moveToFirst();
                            e = cursorQuery.getString(cursorQuery.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        } catch (Throwable th) {
                            th = th;
                            try {
                                th.printStackTrace();
                                e = null;
                                return e;
                            } finally {
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        }
                    }
                    if (cursorQuery != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursorQuery = null;
                }
            }
            return e;
        }

        @Override // com.geetest.core.OaidHelper.e
        public final boolean c(Context context) {
            return true;
        }
    }

    public static class i implements ServiceConnection {
        public d a;
        public final String b;
        public final CountDownLatch c;
        public IBinder d;

        public i(String str, CountDownLatch countDownLatch) {
            this.b = str;
            this.c = countDownLatch;
        }

        public final boolean a(Context context, Intent intent) {
            d dVar;
            if (this.a != null) {
                return true;
            }
            try {
                boolean zBindService = context.bindService(intent, this, 1);
                this.c.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = this.d;
                String str = this.b;
                if (iBinder == null) {
                    dVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(str);
                    dVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, str);
                }
                this.a = dVar;
                return zBindService;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.d = iBinder;
                this.c.countDown();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            this.a = null;
            this.d = null;
        }
    }

    public static class j implements e {
        public static String f = null;
        public static boolean g = false;
        public static boolean h = false;
        public static final CountDownLatch i = new CountDownLatch(1);
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public i e;

        public j(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public int a() {
            return 1;
        }

        public String b() {
            return null;
        }

        @Override // com.geetest.core.OaidHelper.e
        public boolean c(Context context) {
            if (context == null || TextUtils.isEmpty(this.a)) {
                return false;
            }
            if (this.e == null) {
                this.e = new i(this.d, i);
            }
            Intent intent = new Intent();
            if (TextUtils.isEmpty(this.b)) {
                intent.setPackage(this.a);
            } else {
                intent.setComponent(new ComponentName(this.a, this.b));
            }
            if (!TextUtils.isEmpty(this.c)) {
                intent.setAction(this.c);
            }
            return this.e.a(context, intent);
        }

        public String d(Context context) {
            return null;
        }

        public String e(Context context) {
            return null;
        }

        @Override // com.geetest.core.OaidHelper.e
        public boolean a(Context context) {
            if (h) {
                return g;
            }
            boolean z = false;
            if (context == null || TextUtils.isEmpty(this.a)) {
                g = false;
            } else {
                try {
                    PackageInfo packageInfo = OaidHelper.getPackageManager(context).getPackageInfo(this.a, 0);
                    if (Build.VERSION.SDK_INT >= 28) {
                        return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
                    }
                    if (packageInfo != null && packageInfo.versionCode > 0) {
                        z = true;
                    }
                    g = z;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return false;
                }
            }
            h = true;
            return g;
        }

        @Override // com.geetest.core.OaidHelper.e
        public String b(Context context) {
            i iVar;
            d dVar;
            i iVar2;
            if (!TextUtils.isEmpty(f) || (iVar = this.e) == null || (dVar = iVar.a) == null) {
                return f;
            }
            try {
                String strA = dVar.a(d(context), e(context), b(), a());
                f = strA;
                if (!TextUtils.isEmpty(strA) && (iVar2 = this.e) != null) {
                    context.unbindService(iVar2);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return f;
        }
    }

    public static class k extends j {
        public String j;
        public String k;

        public k() {
            super("com.heytap.openid", "com.heytap.openid.IdentifyService", "action.com.heytap.openid.OPEN_ID_SERVICE", "com.heytap.openid.IOpenID");
        }

        @Override // com.geetest.core.OaidHelper.j
        public final String b() {
            return "OUID";
        }

        @Override // com.geetest.core.OaidHelper.j
        public final String d(Context context) {
            if (TextUtils.isEmpty(this.k)) {
                this.k = context.getPackageName();
            }
            return this.k;
        }

        @Override // com.geetest.core.OaidHelper.j
        @SuppressLint({"PackageManagerGetSignatures"})
        public final String e(Context context) {
            if (TextUtils.isEmpty(this.j)) {
                try {
                    if (TextUtils.isEmpty(this.k)) {
                        this.k = context.getPackageName();
                    }
                    this.k = this.k;
                    Signature[] signatureArr = OaidHelper.getPackageManager(context).getPackageInfo(this.k, 64).signatures;
                    if (signatureArr != null && signatureArr.length > 0) {
                        byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(Integer.toHexString((b & UByte.MAX_VALUE) | PSKKeyManager.MAX_KEY_LENGTH_BYTES).substring(1, 3));
                        }
                        this.j = sb.toString();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return this.j;
        }
    }

    public static class l extends j {
        public l() {
            super("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService", null, "com.samsung.android.deviceidservice.IDeviceIdService");
        }
    }

    public static class m extends h {
        public m() {
            super("com.vivo.vms.IdProvider", "IdentifierId/OAID");
        }
    }

    public static class n implements e {
        public static String b;
        public Class a = null;

        @Override // com.geetest.core.OaidHelper.e
        @SuppressLint({"PrivateApi"})
        public final boolean a(Context context) {
            try {
                this.a = Class.forName("com.android.id.impl.IdProviderImpl");
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }

        @Override // com.geetest.core.OaidHelper.e
        public final String b(Context context) {
            if (TextUtils.isEmpty(b)) {
                try {
                    b = String.valueOf(this.a.getMethod("getOAID", Context.class).invoke(this.a.newInstance(), context));
                } catch (Throwable th) {
                    th.printStackTrace();
                    b = null;
                }
            }
            return b;
        }

        @Override // com.geetest.core.OaidHelper.e
        public final boolean c(Context context) {
            return true;
        }
    }

    static {
        e fVar;
        String upperCase = Build.MANUFACTURER.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
            case "LENOVO":
            case "ZUI":
                fVar = new f();
                break;
            case "SAMSUNG":
                fVar = new l();
                break;
            case "XIAOMI":
            case "BLACKSHARK":
            case "REDMI":
                fVar = new n();
                break;
            case "ONEPLUS":
            case "OPPO":
                fVar = new k();
                break;
            case "ASUS":
                fVar = new a();
                break;
            case "IQOO":
            case "VIVO":
                fVar = new m();
                break;
            case "HONOR":
            case "HUA_WEI":
            case "HUAWEI":
                fVar = new c();
                break;
            case "MEIZU":
                fVar = new g();
                break;
            case "COOLPAD":
                fVar = new b();
                break;
            default:
                fVar = null;
                break;
        }
        a = fVar;
    }

    private OaidHelper() {
    }

    public static String getOaid(Context context) {
        isSupport(context);
        if (c) {
            return getOaid();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PackageManager getPackageManager(Context context) {
        if (d == null) {
            d = context.getPackageManager();
        }
        return d;
    }

    private static void isSupport(Context context) {
        e eVar = a;
        if (eVar == null || context == null) {
            return;
        }
        b = context.getApplicationContext();
        if (isSupportService()) {
            c = eVar.c(b);
        }
    }

    private static boolean isSupportService() {
        e eVar;
        try {
            Context context = b;
            return (context == null || (eVar = a) == null || !eVar.a(context)) ? false : true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    private static String getOaid() {
        e eVar;
        try {
            Context context = b;
            if (context == null || (eVar = a) == null || !c) {
                return null;
            }
            return eVar.b(context);
        } catch (Throwable unused) {
            return null;
        }
    }
}
