package com.ishumei.smantifraud;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.Keep;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.facebook.appevents.AppEventsConstants;
import com.ishumei.l1111l111111Il.l111l1111llIl;
import com.ishumei.l1111l111111Il.l11l1111I1l;
import com.ishumei.l1111l111111Il.l11l1111lIIl;
import com.ishumei.l111l1111llIl.l111l11111lIl;
import com.ishumei.l111l1111llIl.l111l1111lI1l;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SmAntiFraud {

    @Keep
    public static final String AREA_BJ = "bj";

    @Keep
    public static final String AREA_FJNY = "fjny";

    @Keep
    public static final String AREA_XJP = "xjp";

    @Keep
    public static final int SM_AF_ASYN_MODE = 1;

    @Keep
    public static final int SM_AF_SYN_MODE = 0;
    public static SmOption l1111l111111Il = null;
    private static IServerSmidCallback l111l11111I1l = null;
    private static final String l111l11111lIl = "sm";

    /* JADX INFO: renamed from: com.ishumei.smantifraud.SmAntiFraud$1, reason: invalid class name */
    public static class AnonymousClass1 implements Runnable {
        private /* synthetic */ String l1111l111111Il;

        public AnonymousClass1(String str) {
            this.l1111l111111Il = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SmAntiFraud.l111l11111I1l.onSuccess("B" + this.l1111l111111Il);
        }
    }

    @Keep
    public interface IDeviceIdCallback {
        void onResult(String str);
    }

    @Keep
    public interface IServerSmidCallback {
        void onError(int i);

        void onSuccess(String str);
    }

    public static class SmOption {
        private static final int l1111l111111Il = 1024;
        private String l111l11IlIlIl;
        private Set<String> l11l1111I1ll;
        private boolean l11l1111Il;
        private byte[] l11l11IlIIll;
        private boolean l111l11111lIl = false;
        private String l111l11111I1l = "";
        private String l111l11111Il = "";
        private boolean l111l1111l1Il = true;
        private boolean l111l1111llIl = true;
        private boolean l11l1111lIIl = false;
        private boolean l11l1111I11l = false;
        private IServerSmidCallback l11l1111I1l = null;
        private String l11l1111Il1l = NewFriendsOld.State_Default;
        private String l11l1111Ill = null;
        private boolean l11l111l11Il = false;
        private String l11l111l1lll = SmAntiFraud.AREA_BJ;
        private String l111l1111lI1l = "/deviceprofile/v4";
        private String l111l1111lIl = "/v3/cloudconf";

        private boolean l111l11IlIlIl() {
            return this.l11l1111Il;
        }

        private boolean l11l111l1lll() {
            return this.l111l11111lIl;
        }

        public final String l1111l111111Il() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.l111l1111l1Il ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sb.append(this.l111l1111llIl ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sb.append(this.l11l1111lIIl ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sb.append(this.l11l1111I11l ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            sb.append(SmAntiFraud.l111l11111I1l != null ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            Set<String> set = this.l11l1111I1ll;
            sb.append((set == null || set.size() <= 0) ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
            sb.append(this.l11l111l11Il ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
            return sb.toString();
        }

        public final boolean l111l11111I1l() {
            return this.l11l1111I11l;
        }

        public final boolean l111l11111Il() {
            return this.l11l111l11Il;
        }

        public final String l111l11111lIl() {
            return this.l11l111l1lll;
        }

        public final byte[] l111l1111l1Il() {
            return this.l11l11IlIIll;
        }

        public final IServerSmidCallback l111l1111lI1l() {
            return this.l11l1111I1l;
        }

        public final String l111l1111lIl() {
            return this.l111l1111lIl;
        }

        public final String l111l1111llIl() {
            return this.l11l1111Ill;
        }

        public final boolean l11l1111I11l() {
            return this.l111l1111llIl;
        }

        public final boolean l11l1111I1l() {
            return this.l111l1111l1Il;
        }

        public final String l11l1111I1ll() {
            return this.l111l11111I1l;
        }

        public final String l11l1111Il() {
            return this.l111l11111Il;
        }

        public final String l11l1111Il1l() {
            return this.l111l1111lI1l;
        }

        public final Set<String> l11l1111Ill() {
            return this.l11l1111I1ll;
        }

        public final boolean l11l1111lIIl() {
            return this.l11l1111lIIl;
        }

        public final String l11l111l11Il() {
            return this.l111l11IlIlIl;
        }

        public final String l11l11IlIIll() {
            return this.l11l1111Il1l;
        }

        public void setAppId(String str) {
            this.l11l1111Il1l = str;
        }

        public void setArea(String str) {
            this.l11l111l1lll = str;
        }

        public void setChannel(String str) {
            this.l111l11111Il = str;
        }

        public void setCheckCrt(boolean z) {
            this.l11l111l11Il = z;
        }

        public void setCloudConf(boolean z) {
            this.l111l1111llIl = z;
        }

        public void setConfUrl(String str) {
            this.l111l1111lIl = str;
        }

        public void setExtraInfo(String str) {
            if (str == null) {
                return;
            }
            if (str.length() > 1024) {
                this.l111l11IlIlIl = str.substring(0, 1024);
            } else {
                this.l111l11IlIlIl = str;
            }
        }

        public void setFirst(boolean z) {
            this.l11l1111Il = z;
        }

        public void setHttpsCrt(byte[] bArr) {
            this.l11l11IlIIll = bArr;
        }

        public void setNotCollect(Set<String> set) {
            this.l11l1111I1ll = set;
        }

        public void setOrganization(String str) {
            this.l111l11111I1l = str;
        }

        public void setPublicKey(String str) {
            this.l11l1111Ill = str;
        }

        public void setServerIdCallback(IServerSmidCallback iServerSmidCallback) {
            this.l11l1111I1l = iServerSmidCallback;
        }

        public void setSynMode(boolean z) {
            this.l111l11111lIl = z;
        }

        public void setTransport(boolean z) {
            this.l111l1111l1Il = z;
        }

        public void setUrl(String str) {
            this.l111l1111lI1l = str;
        }

        public void setUsingHttps(boolean z) {
            this.l11l1111I11l = z;
        }

        public void setUsingMD5(boolean z) {
            this.l11l1111lIIl = z;
        }
    }

    private SmAntiFraud() {
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    public static synchronized void create(Context context, SmOption smOption) {
        byte b;
        String[] strArr;
        if (smOption != null) {
            if (!TextUtils.isEmpty(smOption.l11l1111I1ll())) {
                if (TextUtils.isEmpty(smOption.l111l1111llIl())) {
                    Log.e(l111l11111lIl, l111l1111lI1l.l111l11111Il("8f8a9d93969cb49a86df979e8cdf91908bdf9d9a9a91df8c9a8bdf869a8bd1"));
                    return;
                }
                if (TextUtils.isEmpty(smOption.l11l11IlIIll())) {
                    Log.e(l111l11111lIl, l111l1111lI1l.l111l11111Il("9e8f8fb69bdf979e8cdf91908bdf9d9a9a91df8c9a8bdf869a8bd1"));
                }
                try {
                    try {
                        l111l11111lIl.l1111l111111Il().l111l11111lIl();
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext == null) {
                            l111l11111lIl.l1111l111111Il().l111l11111I1l();
                            return;
                        }
                        l111l1111llIl.l1111l111111Il.l111l11111Il = applicationContext;
                        if (l111l1111llIl.l1111l111111Il.l111l1111l1Il == null) {
                            l111l1111llIl.l1111l111111Il.l111l1111l1Il = String.format(Locale.CHINA, "%d-%05d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(new Random().nextInt(AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength)));
                        }
                        l1111l111111Il = smOption;
                        String strL111l11111lIl = smOption.l111l11111lIl();
                        int iHashCode = strL111l11111lIl.hashCode();
                        if (iHashCode != 3144) {
                            if (iHashCode != 118718) {
                                if (iHashCode == 3144079 && strL111l11111lIl.equals(AREA_FJNY)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strL111l11111lIl.equals(AREA_XJP)) {
                                b = 1;
                            } else {
                                b = -1;
                            }
                        } else if (strL111l11111lIl.equals(AREA_BJ)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        if (b == 0) {
                            strArr = com.ishumei.l111l11111lIl.l111l1111llIl.l1111l111111Il;
                        } else if (b != 1) {
                            strArr = b != 2 ? new String[]{l1111l111111Il.l11l1111Il1l(), l1111l111111Il.l111l11111lIl()} : com.ishumei.l111l11111lIl.l111l1111llIl.l111l11111I1l;
                        } else {
                            strArr = com.ishumei.l111l11111lIl.l111l1111llIl.l111l11111lIl;
                        }
                        SmOption smOption2 = l1111l111111Il;
                        l111l1111llIl.l1111l111111Il();
                        smOption2.setUrl(l111l1111llIl.l1111l111111Il(strArr[0], l1111l111111Il.l11l1111Il1l(), l1111l111111Il.l111l11111I1l()));
                        SmOption smOption3 = l1111l111111Il;
                        l111l1111llIl.l1111l111111Il();
                        smOption3.setConfUrl(l111l1111llIl.l1111l111111Il(strArr[0], l1111l111111Il.l111l1111lIl(), l1111l111111Il.l111l11111I1l()));
                        l11l1111I1l.l1111l111111Il().l1111l111111Il(strArr[1], l1111l111111Il.l11l1111I1ll());
                        com.ishumei.l111l1111l1Il.l1111l111111Il.l1111l111111Il(smOption);
                        com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l1111l111111Il(smOption);
                        if (l1111l111111Il.l111l1111lI1l() != null) {
                            l111l11111I1l = l1111l111111Il.l111l1111lI1l();
                        }
                        String strL111l11111lIl2 = l11l1111I1l.l1111l111111Il().l111l11111lIl();
                        if (!TextUtils.isEmpty(strL111l11111lIl2) && l111l11111I1l != null) {
                            synchronized (SmAntiFraud.class) {
                                com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(new AnonymousClass1(strL111l11111lIl2), 2);
                            }
                        }
                        if (com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl()) {
                            l111l1111llIl.l1111l111111Il().l111l11111lIl();
                        }
                        l111l11111lIl.l1111l111111Il().l111l11111I1l();
                        return;
                    } catch (Throwable th) {
                        l111l11111lIl.l1111l111111Il().l111l11111I1l();
                        throw th;
                    }
                } catch (Exception unused) {
                    l111l11111lIl.l1111l111111Il().l111l11111I1l();
                    return;
                }
            }
        }
        Log.e(l111l11111lIl, l111l1111lI1l.l111l11111Il("ac92b08f8b969091df9e919bdf908d989e9196859e8b969091df9c908a939bdf91908bdf9d9adf918a9393d1"));
    }

    public static String getDeviceId() {
        String str;
        SmOption smOption = l1111l111111Il;
        if (smOption == null) {
            str = "ac92be918b96b98d9e8a9bd19c8d9a9e8b9adf979e8cdf91908bdf9d9a9a91df9c9e93939a9bdf869a8bd1";
        } else if (TextUtils.isEmpty(smOption.l11l1111I1ll())) {
            str = "908d989e9196859e8b969091df979e8cdf91908bdf9d9a9a91df8c9a8bdf869a8bd1";
        } else {
            if (!TextUtils.isEmpty(l1111l111111Il.l111l1111llIl())) {
                if (TextUtils.isEmpty(l1111l111111Il.l11l11IlIIll())) {
                    str = "9e8f8fb69bdf979e8cdf91908bdf9d9a9a91df8c9a8bdf869a8bd1";
                }
                return l111l1111llIl.l1111l111111Il().l111l11111I1l();
            }
            str = "8f8a9d93969cb49a86df979e8cdf91908bdf9d9a9a91df8c9a8bdf869a8bd1";
        }
        Log.e(l111l11111lIl, l111l1111lI1l.l111l11111Il(str));
        return l111l1111llIl.l1111l111111Il().l111l11111I1l();
    }

    public static String getSDKVersion() {
        return "3.0.6";
    }

    public static IServerSmidCallback getServerIdCallback() {
        return l111l11111I1l;
    }

    private static void l111l11111lIl(SmOption smOption) {
        String[] strArr;
        l1111l111111Il = smOption;
        String strL111l11111lIl = smOption.l111l11111lIl();
        strL111l11111lIl.getClass();
        switch (strL111l11111lIl) {
            case "bj":
                strArr = com.ishumei.l111l11111lIl.l111l1111llIl.l1111l111111Il;
                break;
            case "xjp":
                strArr = com.ishumei.l111l11111lIl.l111l1111llIl.l111l11111lIl;
                break;
            case "fjny":
                strArr = com.ishumei.l111l11111lIl.l111l1111llIl.l111l11111I1l;
                break;
            default:
                strArr = new String[]{l1111l111111Il.l11l1111Il1l(), l1111l111111Il.l111l11111lIl()};
                break;
        }
        SmOption smOption2 = l1111l111111Il;
        l111l1111llIl.l1111l111111Il();
        smOption2.setUrl(l111l1111llIl.l1111l111111Il(strArr[0], l1111l111111Il.l11l1111Il1l(), l1111l111111Il.l111l11111I1l()));
        SmOption smOption3 = l1111l111111Il;
        l111l1111llIl.l1111l111111Il();
        smOption3.setConfUrl(l111l1111llIl.l1111l111111Il(strArr[0], l1111l111111Il.l111l1111lIl(), l1111l111111Il.l111l11111I1l()));
        l11l1111I1l.l1111l111111Il().l1111l111111Il(strArr[1], l1111l111111Il.l11l1111I1ll());
        com.ishumei.l111l1111l1Il.l1111l111111Il.l1111l111111Il(smOption);
        com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l1111l111111Il(smOption);
        if (l1111l111111Il.l111l1111lI1l() != null) {
            l111l11111I1l = l1111l111111Il.l111l1111lI1l();
        }
    }

    public static synchronized void registerServerIdCallback(IServerSmidCallback iServerSmidCallback) {
        l111l11111I1l = iServerSmidCallback;
    }

    public static void track(String str, String str2, MotionEvent motionEvent) {
        l11l1111lIIl.l1111l111111Il().l1111l111111Il(str, str2, motionEvent);
    }

    public static void getDeviceId(IDeviceIdCallback iDeviceIdCallback) {
        if (iDeviceIdCallback == null) {
            throw new IllegalArgumentException("callback cannot be null.");
        }
        l111l1111llIl.l1111l111111Il().l1111l111111Il(iDeviceIdCallback, Thread.currentThread() == Looper.getMainLooper().getThread());
    }

    private static void l1111l111111Il(SmOption smOption) {
        l111l11111lIl(smOption);
        String strL111l11111lIl = l11l1111I1l.l1111l111111Il().l111l11111lIl();
        if (!TextUtils.isEmpty(strL111l11111lIl) && l111l11111I1l != null) {
            synchronized (SmAntiFraud.class) {
                com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(new AnonymousClass1(strL111l11111lIl), 2);
            }
        }
        if (com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl()) {
            l111l1111llIl.l1111l111111Il().l111l11111lIl();
        }
    }
}
