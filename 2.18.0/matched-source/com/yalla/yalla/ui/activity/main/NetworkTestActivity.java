package com.yalla.yalla.ui.activity.main;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.app.base.application.App;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.WlanIpSaveModel;
import com.code.android.util.ToastUtil;
import com.common.support.apmwrapper.model.NetModel;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.security.CertificateUtil;
import com.qiniu.android.collect.ReportItem;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.yalla.common.util.NetWorkUtil;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p016OooOoO0.OooOo00;
import p023Oooo00O.o00O0;
import p034OoooO0O.o0Oo0oo;
import p131o00O0oo.o00oOoo;
import p154o00Oo0oO.o000000O;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p161o00OoOO0.o00OO0OO;
import p163o00OoOOo.o0O00000;
import p268o00ooo0o.o00OO00O;
import p489o0o000oO.o0ooOOo;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p518o0o0O000.o00000O;
import p553o0oOO.OooOOO0;
import p553o0oOO.OooOOOO;
import p617o0oo0OoO.oO0;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkTestActivity extends BaseActivity {

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public static final String f21997o000OO = p496o0o00OO0.OooO0o.f41174OooO00o.OooO0o0() + File.separator;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public String f21998Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String f21999Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f22000OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public String f22001OooooOO;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public String f22003Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public String f22004Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public String f22005OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public String f22006Ooooooo;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public oO0 f22009o000000;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public OooO0o f22019o0000O0;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public OooO0O0 f22023o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public OooO00o f22024o0000oo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public String f22026o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public String f22027o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public TextView f22028o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public TextView f22029o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public TextView f22030o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public TextView f22031o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public TextView f22032o00ooo;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public Button f22034o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public View f22035o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public View f22036o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public String f22037o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public ImageView f22038o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public ImageView f22039o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public ProgressBar f22040o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public TextView f22041oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public Button f22042oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public String f22043ooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public String f22002OooooOo = "Country:\n";

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f22033o0O0O00 = 0;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public int f22025o000OOo = 15;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public boolean f22010o000000O = false;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public String[] f22011o000000o = {"apiv2.yalla.live", "room03.yalla.live", "dtslave.yalla.live", "file.yalla.live", "upload.qiniup.com"};

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public String[] f22008o00000 = {"www.1688.com:443", "apiv2.yalla.live:443", "room03.yalla.live:7000", "dtslave.yalla.live:7410", "file.yalla.live:443", "upload.qiniup.com:443"};

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public String f22013o00000O0 = "network_down_file.tmp";

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public String f22012o00000O = "chuan.png";

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public String f22014o00000OO = "network_test.txt";

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public long f22015o00000Oo = 0;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public long f22016o00000o0 = 0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public float f22022o0000Ooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public long f22017o00000oO = 0;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public long f22018o00000oo = 0;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public float f22007o0000 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public long f22020o0000O00 = 0;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public NetModel f22021o0000O0O = new NetModel();

    public class OooO00o extends AsyncTask<Void, Float, Void> {
        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:34:0x019d  */
        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            char c;
            String str;
            WlanIpSaveModel wlanIpSaveModel;
            NetworkInfo activeNetworkInfo;
            NetworkInfo.State state;
            publishProgress(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            networkTestActivity.f21998Ooooo00 = "Test Time: ";
            String strOooOoOO = NetworkTestActivity.OooOoOO(networkTestActivity);
            NetworkTestActivity.this.f21998Ooooo00 += ((Object) OooOo00.OooO00o(strOooOoOO, "\n"));
            publishProgress(Float.valueOf(1.0f));
            NetworkTestActivity.this.f22021o0000O0O.setStartTime(strOooOoOO);
            OooOOO oooOOO = OooOOO.f41235OooO00o;
            String value = oooOOO.OooOoO0().getValue();
            if (value == null) {
                value = "";
            }
            NetworkTestActivity networkTestActivity2 = NetworkTestActivity.this;
            networkTestActivity2.f21999Ooooo0o = "User ID: ";
            networkTestActivity2.f21999Ooooo0o += ((Object) OooO00o.OooO00o.OooO00o(new StringBuilder(), oooOOO.OooOoO0().getValue(), "\n"));
            publishProgress(Float.valueOf(2.0f));
            NetworkTestActivity.this.f22021o0000O0O.setUserId(value);
            StringBuilder sb = new StringBuilder();
            sb.append(Build.BRAND);
            sb.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            sb.append(Build.MODEL);
            sb.append("(Android ");
            sb.append(Build.VERSION.RELEASE);
            sb.append(" SDK ");
            String strOooO0O0 = OooO0o.OooO0OO.OooO0O0(sb, Build.VERSION.SDK_INT, ")");
            NetworkTestActivity networkTestActivity3 = NetworkTestActivity.this;
            networkTestActivity3.f22000OooooO0 = "Device Name (System Version):\n";
            networkTestActivity3.f22000OooooO0 += ((Object) OooOo00.OooO00o(strOooO0O0, "\n"));
            publishProgress(Float.valueOf(3.0f));
            NetworkTestActivity.this.f22021o0000O0O.setDevice(strOooO0O0);
            StringBuilder sb2 = new StringBuilder();
            o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
            sb2.append(o0ooOOo.OooO0O0());
            sb2.append("(");
            sb2.append(o00000O.OooO0O0(NetworkTestActivity.this));
            sb2.append(")");
            String string = sb2.toString();
            NetworkTestActivity networkTestActivity4 = NetworkTestActivity.this;
            networkTestActivity4.f22001OooooOO = "Application Version:\n";
            networkTestActivity4.f22001OooooOO += ((Object) OooOo00.OooO00o(string, "\n"));
            publishProgress(Float.valueOf(4.0f));
            NetworkTestActivity.this.f22021o0000O0O.setVersion(string);
            NetworkTestActivity networkTestActivity5 = NetworkTestActivity.this;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) networkTestActivity5.getSystemService("connectivity");
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                    c = 0;
                } else {
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                    if (networkInfo == null || (state = networkInfo.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                        int networkType = ((TelephonyManager) networkTestActivity5.getSystemService("phone")).getNetworkType();
                        if (networkType != 20) {
                            switch (networkType) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                    c = 2;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case 15:
                                    c = 3;
                                    break;
                                case 13:
                                    c = 4;
                                    break;
                                default:
                                    c = 0;
                                    break;
                            }
                        } else {
                            c = 5;
                        }
                    } else {
                        c = 1;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (c == 0) {
                str = "Network not connected";
            } else if (c == 1) {
                str = "WIFI";
            } else if (c == 2) {
                str = "2G";
            } else if (c == 3) {
                str = "3G";
            } else if (c != 4) {
                str = c != 5 ? "UNKOWN" : "5G";
            } else {
                str = "4G";
            }
            NetworkTestActivity networkTestActivity6 = NetworkTestActivity.this;
            networkTestActivity6.f22004Oooooo0 = "Network Type: ";
            networkTestActivity6.f22004Oooooo0 += ((Object) OooOo00.OooO00o(str, "\n"));
            publishProgress(Float.valueOf(5.0f));
            NetworkTestActivity.this.f22021o0000O0O.setNetwork(str);
            NetworkTestActivity networkTestActivity7 = NetworkTestActivity.this;
            networkTestActivity7.f22003Oooooo = "Network Operator: ";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(((TelephonyManager) NetworkTestActivity.this.getSystemService("phone")).getSimOperatorName());
            sb3.append("(SIM:");
            sb3.append(((TelephonyManager) NetworkTestActivity.this.getSystemService("phone")).getSimState() == 5);
            sb3.append(")\n");
            networkTestActivity7.f22003Oooooo += ((Object) sb3.toString());
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22003Oooooo + "\n");
            publishProgress(Float.valueOf(6.0f));
            ArrayList arrayList = new ArrayList();
            arrayList.add(NetworkUtil.f20518OooO00o.OooO0Oo());
            NetworkTestActivity.this.f22021o0000O0O.setOperator(arrayList);
            NetworkTestActivity.this.f22005OoooooO = "Public IP Address: ";
            String strOooO0OO = com.android.billingclient.api.o00000O.OooO0O0().OooO0OO("NETWORK_TEST_WLANIP");
            if (TextUtils.isEmpty(strOooO0OO)) {
                wlanIpSaveModel = null;
            } else {
                try {
                    wlanIpSaveModel = (WlanIpSaveModel) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(strOooO0OO.getBytes(), 0))).readObject();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    wlanIpSaveModel = null;
                } catch (ClassNotFoundException e3) {
                    e3.printStackTrace();
                    wlanIpSaveModel = null;
                }
            }
            if (wlanIpSaveModel == null || TextUtils.isEmpty(wlanIpSaveModel.getWlanIp()) || !NetworkTestActivity.this.f22004Oooooo0.equals(wlanIpSaveModel.getNetworkType())) {
                NetworkTestActivity.this.f22005OoooooO += ((Object) "\n");
                publishProgress(Float.valueOf(7.0f));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
                NetworkTestActivity.this.f22021o0000O0O.setPublicIp(arrayList2);
                if (!NetworkTestActivity.this.isFinishing() || !NetworkTestActivity.this.isDestroyed()) {
                    o0Oo0oo.OooO0o0(601, null);
                }
            } else {
                NetworkTestActivity.this.f22005OoooooO += ((Object) (wlanIpSaveModel.getWlanIp() + "\n"));
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(wlanIpSaveModel.getWlanIp());
                NetworkTestActivity.this.f22021o0000O0O.setPublicIp(arrayList3);
                publishProgress(Float.valueOf(7.0f));
                o0Oo0oo.OooO0o0(601, null);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            super.onPostExecute(r1);
        }

        @Override // android.os.AsyncTask
        public final void onProgressUpdate(Float[] fArr) {
            Float[] fArr2 = fArr;
            super.onProgressUpdate(fArr2);
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            float fFloatValue = fArr2[0].floatValue();
            String str = NetworkTestActivity.f21997o000OO;
            networkTestActivity.OooOooO(fFloatValue);
        }
    }

    public class OooO0O0 extends AsyncTask<Void, Float, Void> {
        public OooO0O0() {
        }

        /* JADX WARN: Code duplicated, block: B:176:0x03b9 A[PHI: r10 r11 r13 r14 r25
          0x03b9: PHI (r10v19 java.lang.Process) = (r10v20 java.lang.Process), (r10v27 java.lang.Process) binds: [B:175:0x03b7, B:135:0x0346] A[DONT_GENERATE, DONT_INLINE]
          0x03b9: PHI (r11v16 int) = (r11v17 int), (r11v29 int) binds: [B:175:0x03b7, B:135:0x0346] A[DONT_GENERATE, DONT_INLINE]
          0x03b9: PHI (r13v6 java.lang.StringBuilder) = (r13v7 java.lang.StringBuilder), (r13v15 java.lang.StringBuilder) binds: [B:175:0x03b7, B:135:0x0346] A[DONT_GENERATE, DONT_INLINE]
          0x03b9: PHI (r14v20 java.lang.StringBuilder) = (r14v21 java.lang.StringBuilder), (r14v25 java.lang.StringBuilder) binds: [B:175:0x03b7, B:135:0x0346] A[DONT_GENERATE, DONT_INLINE]
          0x03b9: PHI (r25v4 java.lang.String) = (r25v5 java.lang.String), (r25v15 java.lang.String) binds: [B:175:0x03b7, B:135:0x0346] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:179:0x03c0  */
        /* JADX WARN: Code duplicated, block: B:180:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:182:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:183:0x03ca  */
        /* JADX WARN: Code duplicated, block: B:186:0x03d3  */
        /* JADX WARN: Code duplicated, block: B:192:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:198:0x0413  */
        /* JADX WARN: Code duplicated, block: B:243:0x04b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:252:0x04d6  */
        /* JADX WARN: Code duplicated, block: B:254:0x04da  */
        /* JADX WARN: Code duplicated, block: B:256:0x04dd  */
        /* JADX WARN: Code duplicated, block: B:263:0x053e  */
        /* JADX WARN: Code duplicated, block: B:264:0x0553  */
        /* JADX WARN: Code duplicated, block: B:268:0x057d A[LOOP:5: B:102:0x0271->B:268:0x057d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:274:0x0599  */
        /* JADX WARN: Code duplicated, block: B:294:0x0442 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:355:0x0603 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:362:0x04ce A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:365:0x04c3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:370:0x04de A[SYNTHETIC] */
        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) throws Throwable {
            ConnectivityManager connectivityManager;
            NetworkInfo activeNetworkInfo;
            Process processExec;
            BufferedReader bufferedReader;
            int i;
            DataOutputStream dataOutputStream;
            BufferedReader bufferedReader2;
            int i2;
            DataOutputStream dataOutputStream2;
            StringBuilder sb;
            StringBuilder sb2;
            NetWorkUtil.CommandResult commandResult;
            String string;
            String string2;
            String str;
            String strOooO00o;
            String str2;
            String str3;
            HashMap map;
            String str4;
            String string3;
            String[] strArrSplit;
            HashMap map2;
            String hostAddress;
            InetSocketAddress inetSocketAddress;
            int i3;
            int[] iArr;
            int i4;
            int i5;
            int i6;
            String strOooO00o2;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            Socket socket;
            Socket socket2;
            int iCurrentTimeMillis;
            BufferedReader bufferedReader3;
            BufferedReader bufferedReader4;
            int i12;
            String hostAddress2;
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            LinkedList linkedList = new LinkedList();
            try {
                LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
                while (true) {
                    String line = lineNumberReader.readLine();
                    if (line == null) {
                        break;
                    }
                    int iIndexOf = line.indexOf("]: [");
                    if (iIndexOf != -1) {
                        String strSubstring = line.substring(1, iIndexOf);
                        String strSubstring2 = line.substring(iIndexOf + 4, line.length() - 1);
                        if (strSubstring.endsWith(".dns") || strSubstring.endsWith(".dns1") || strSubstring.endsWith(".dns2") || strSubstring.endsWith(".dns3") || strSubstring.endsWith(".dns4")) {
                            InetAddress byName = InetAddress.getByName(strSubstring2);
                            if (byName != null && (hostAddress2 = byName.getHostAddress()) != null && hostAddress2.length() != 0) {
                                linkedList.add(hostAddress2);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            char c = 0;
            String[] strArr = linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]);
            if (strArr == null || strArr.length == 0) {
                LinkedList linkedList2 = new LinkedList();
                if (networkTestActivity != null && (connectivityManager = (ConnectivityManager) networkTestActivity.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                        if (networkInfo != null && networkInfo.getType() == activeNetworkInfo.getType()) {
                            Iterator<InetAddress> it = connectivityManager.getLinkProperties(network).getDnsServers().iterator();
                            while (it.hasNext()) {
                                linkedList2.add(it.next().getHostAddress());
                            }
                        }
                    }
                }
                strArr = linkedList2.isEmpty() ? new String[0] : (String[]) linkedList2.toArray(new String[linkedList2.size()]);
            }
            StringBuilder sb3 = new StringBuilder();
            if (strArr != null) {
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (i13 > 0) {
                        sb3.append(" / ");
                    }
                    sb3.append(strArr[i13]);
                }
                NetworkTestActivity.this.f22021o0000O0O.setDns(Arrays.asList(strArr));
            }
            NetworkTestActivity networkTestActivity2 = NetworkTestActivity.this;
            networkTestActivity2.f22006Ooooooo = "Local DNS:";
            networkTestActivity2.f22006Ooooooo += ((Object) (sb3.toString() + "\n"));
            publishProgress(Float.valueOf(8.0f));
            if (isCancelled()) {
                return null;
            }
            HashMap map3 = new HashMap();
            NetworkTestActivity.this.f22037o0OoOo0 = "Domain list resolution:\n";
            String str5 = "";
            String string4 = "";
            int i14 = 0;
            do {
                NetworkTestActivity networkTestActivity3 = NetworkTestActivity.this;
                if (i14 < networkTestActivity3.f22011o000000o.length) {
                    String strOooO00o3 = OooO00o.OooO00o.OooO00o(OooO00o.OooO00o.OooO0O0(string4), NetworkTestActivity.this.f22011o000000o[i14], "::{\n");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String[] strArr2 = new String[0];
                    try {
                        InetAddress[] allByName = InetAddress.getAllByName(NetworkTestActivity.this.f22011o000000o[i14]);
                        if (allByName != null && allByName.length > 0) {
                            strArr2 = new String[allByName.length];
                            for (int i15 = 0; i15 < allByName.length; i15++) {
                                strArr2[i15] = allByName[i15].getHostAddress();
                            }
                        }
                    } catch (UnknownHostException e2) {
                        e2.printStackTrace();
                    }
                    int i16 = 0;
                    while (i16 < strArr2.length) {
                        strOooO00o3 = i16 == strArr2.length - 1 ? OooO00o.OooO00o.OooO00o(o00O0.OooO0O0(strOooO00o3, "  "), strArr2[i16], "\n") : OooO00o.OooO00o.OooO00o(o00O0.OooO0O0(strOooO00o3, "  "), strArr2[i16], ",\n");
                        i16++;
                    }
                    map3.put(NetworkTestActivity.this.f22011o000000o[i14], Arrays.asList(strArr2));
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    StringBuilder sbOooO0O0 = o00O0.OooO0O0(strOooO00o3, "}(");
                    sbOooO0O0.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
                    sbOooO0O0.append("ms)\n");
                    string4 = sbOooO0O0.toString();
                    i14++;
                    publishProgress(Float.valueOf((i14 / NetworkTestActivity.this.f22011o000000o.length) + 8.0f));
                    NetworkTestActivity.this.f22021o0000O0O.setResolution(map3);
                } else {
                    networkTestActivity3.f22037o0OoOo0 += ((Object) OooOo00.OooO00o(string4, "\n"));
                    publishProgress(Float.valueOf(9.0f));
                    if (isCancelled()) {
                        return null;
                    }
                    HashMap map4 = new HashMap();
                    NetworkTestActivity.this.f22043ooOO = "Domain list ping:\n";
                    String strOooO00o4 = "";
                    int i17 = 1;
                    int i18 = 0;
                    while (true) {
                        NetworkTestActivity networkTestActivity4 = NetworkTestActivity.this;
                        if (i18 >= networkTestActivity4.f22008o00000.length) {
                            networkTestActivity4.f22043ooOO += ((Object) OooOo00.OooO00o(strOooO00o4, "\n"));
                            publishProgress(Float.valueOf(10.0f));
                            NetworkTestActivity.this.f22021o0000O0O.setTcpPing(map4);
                            if (isCancelled()) {
                                return null;
                            }
                            publishProgress(Float.valueOf(11.0f));
                            if (isCancelled()) {
                                return null;
                            }
                            NetworkTestActivity.this.f22026o00O0O = "Start testing download speed...\n";
                            OooOOO0 oooOOO0 = new OooOOO0();
                            p154o00Oo0oO.o0ooOOo o0ooooo2 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
                            oooOOO0.f44627OooO00o = p154o00Oo0oO.o0ooOOo.f32338o000O00O;
                            oooOOO0.OooO0O0().OooO00o(new com.yalla.yalla.ui.activity.main.OooO00o(this));
                            return null;
                        }
                        String strOooO00o5 = OooO00o.OooO00o.OooO00o(o00O0.OooO0O0(strOooO00o4, "Start ping: "), NetworkTestActivity.this.f22008o00000[i18], "...\n");
                        String[] strArrSplit2 = NetworkTestActivity.this.f22008o00000[i18].split(CertificateUtil.DELIMITER);
                        String str6 = strArrSplit2[c];
                        if (str6 == null || str6.length() <= 0) {
                            str6 = "223.5.5.5";
                        }
                        String[] strArr3 = new String[i17];
                        Object[] objArr = new Object[i17];
                        objArr[c] = str6;
                        strArr3[c] = String.format("ping -c 4 %s", objArr);
                        try {
                            try {
                                processExec = Runtime.getRuntime().exec("sh");
                                try {
                                    dataOutputStream2 = new DataOutputStream(processExec.getOutputStream());
                                    int i19 = 0;
                                    while (i19 < i17) {
                                        try {
                                            try {
                                                String str7 = strArr3[i19];
                                                if (str7 != null) {
                                                    dataOutputStream2.write(str7.getBytes());
                                                    dataOutputStream2.writeBytes("\n");
                                                    dataOutputStream2.flush();
                                                }
                                                i19++;
                                                i17 = 1;
                                            } catch (Throwable th) {
                                                th = th;
                                                bufferedReader3 = null;
                                                bufferedReader = null;
                                                i = 3;
                                                dataOutputStream = dataOutputStream2;
                                                bufferedReader2 = bufferedReader3;
                                                Closeable[] closeableArr = new Closeable[i];
                                                closeableArr[0] = dataOutputStream;
                                                closeableArr[1] = bufferedReader2;
                                                closeableArr[2] = bufferedReader;
                                                NetWorkUtil.OooO00o(closeableArr);
                                                if (processExec != null) {
                                                    processExec.destroy();
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str5 = str5;
                                            i2 = -1;
                                            sb2 = null;
                                            sb = null;
                                            bufferedReader3 = null;
                                            bufferedReader4 = null;
                                            e.printStackTrace();
                                            NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                            if (processExec != null) {
                                                processExec.destroy();
                                            }
                                            if (sb2 == null) {
                                                string = null;
                                            } else {
                                                string = sb2.toString();
                                            }
                                            if (sb == null) {
                                                string2 = null;
                                            } else {
                                                string2 = sb.toString();
                                            }
                                            commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                            if (i2 != 0) {
                                                str = commandResult.f21230OooO00o;
                                            } else {
                                                str = commandResult.f21230OooO00o;
                                            }
                                            strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                            str2 = strArrSplit2[0];
                                            str3 = strArrSplit2[1];
                                            hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                            inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                            i3 = 4;
                                            iArr = new int[4];
                                            i4 = 0;
                                            map = map4;
                                            str4 = strOooO00o;
                                            i5 = 0;
                                            i6 = -1;
                                            strOooO00o2 = str5;
                                            while (true) {
                                                if (i5 < i3) {
                                                    i7 = 1000000;
                                                    i9 = 0;
                                                    i10 = 0;
                                                    for (i8 = 0; i8 <= i6; i8++) {
                                                        i11 = iArr[i8];
                                                        if (i11 > i9) {
                                                            i9 = i11;
                                                        }
                                                        if (i11 < i7) {
                                                            i7 = i11;
                                                        }
                                                        i10 += i11;
                                                    }
                                                    StringBuilder sbOooO00o = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                    sbOooO00o.append("\n     4 probes sent.\n     ");
                                                    int i20 = 4 - i4;
                                                    sbOooO00o.append(i20);
                                                    sbOooO00o.append(" successful, ");
                                                    sbOooO00o.append(i4);
                                                    sbOooO00o.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                    sbOooO00o.append(i7);
                                                    sbOooO00o.append("ms, Maximum = ");
                                                    sbOooO00o.append(i9);
                                                    sbOooO00o.append("ms, Average = ");
                                                    sbOooO00o.append(i10 / i20);
                                                    sbOooO00o.append("ms\n");
                                                    string3 = sbOooO00o.toString();
                                                    break;
                                                }
                                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                                try {
                                                    socket = new Socket();
                                                    try {
                                                        try {
                                                            socket.connect(inetSocketAddress, 20000);
                                                            try {
                                                                socket.close();
                                                            } catch (IOException e4) {
                                                                try {
                                                                    e4.printStackTrace();
                                                                } catch (IOException e5) {
                                                                    e5.printStackTrace();
                                                                    Log.e("NETWORKUTIL", e5.getMessage());
                                                                    byte b = e5 instanceof SocketTimeoutException ? (byte) -3 : (byte) -2;
                                                                    if (i5 == 0) {
                                                                        StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("TCPPING ");
                                                                        OooO0O0.OooO0O0.OooO00o(sbOooO0O1, b != -3 ? "NotReach" : "TimeOut", " host: ", str2, CertificateUtil.DELIMITER);
                                                                        string3 = OooO00o.OooO00o.OooO00o(sbOooO0O1, str3, "\n");
                                                                        break;
                                                                    }
                                                                    i4++;
                                                                    StringBuilder sbOooO00o2 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                    sbOooO00o2.append("/tcp - ");
                                                                    strOooO00o2 = OooO00o.OooO00o.OooO00o(sbOooO00o2, b != -3 ? "NotReach" : "TimeOut", "\n");
                                                                }
                                                            }
                                                            int i21 = i4;
                                                            iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis3);
                                                            StringBuilder sbOooO00o3 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                            sbOooO00o3.append("/tcp - time=");
                                                            sbOooO00o3.append(iCurrentTimeMillis);
                                                            sbOooO00o3.append("ms\n");
                                                            strOooO00o2 = sbOooO00o3.toString();
                                                            iArr[i5] = iCurrentTimeMillis;
                                                            if (100 <= iCurrentTimeMillis) {
                                                            }
                                                            i4 = i21;
                                                            i6 = i5;
                                                            inetSocketAddress = inetSocketAddress;
                                                            i5++;
                                                            i3 = 4;
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            e.printStackTrace();
                                                            throw e;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        socket2 = socket;
                                                        Throwable th3 = th;
                                                        if (socket2 != null) {
                                                            try {
                                                                socket2.close();
                                                            } catch (IOException e7) {
                                                                e7.printStackTrace();
                                                            }
                                                        }
                                                        throw th3;
                                                    }
                                                } catch (IOException e8) {
                                                    e = e8;
                                                    socket = null;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    socket = null;
                                                    socket2 = socket;
                                                    Throwable th5 = th;
                                                    if (socket2 != null) {
                                                        socket2.close();
                                                    }
                                                    throw th5;
                                                }
                                            }
                                            strArrSplit = string3.split("\n");
                                            if (strArrSplit != null) {
                                                map2 = map;
                                                map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                            } else {
                                                map2 = map;
                                            }
                                            strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                            i18++;
                                            publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                            if (isCancelled()) {
                                                return null;
                                            }
                                            i17 = 1;
                                            c = 0;
                                            str5 = str5;
                                            map4 = map2;
                                        }
                                    }
                                    dataOutputStream2.writeBytes("exit\n");
                                    dataOutputStream2.flush();
                                    int iWaitFor = processExec.waitFor();
                                    try {
                                        sb2 = new StringBuilder();
                                        try {
                                            sb = new StringBuilder();
                                            try {
                                                str5 = str5;
                                                try {
                                                    bufferedReader3 = new BufferedReader(new InputStreamReader(processExec.getInputStream(), "UTF-8"));
                                                    try {
                                                        try {
                                                            i12 = iWaitFor;
                                                            try {
                                                                bufferedReader4 = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), "UTF-8"));
                                                                while (true) {
                                                                    try {
                                                                        try {
                                                                            String line2 = bufferedReader3.readLine();
                                                                            if (line2 == null) {
                                                                                break;
                                                                            }
                                                                            sb2.append(line2 + "\n");
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            i2 = i12;
                                                                            e.printStackTrace();
                                                                            NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                                                            if (processExec != null) {
                                                                            }
                                                                            if (sb2 == null) {
                                                                                string = null;
                                                                            } else {
                                                                                string = sb2.toString();
                                                                            }
                                                                            if (sb == null) {
                                                                                string2 = null;
                                                                            } else {
                                                                                string2 = sb.toString();
                                                                            }
                                                                            commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                                                            if (i2 != 0) {
                                                                                str = commandResult.f21230OooO00o;
                                                                            } else {
                                                                                str = commandResult.f21230OooO00o;
                                                                            }
                                                                            strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                                                            str2 = strArrSplit2[0];
                                                                            str3 = strArrSplit2[1];
                                                                            hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                                                            inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                                                            i3 = 4;
                                                                            iArr = new int[4];
                                                                            i4 = 0;
                                                                            map = map4;
                                                                            str4 = strOooO00o;
                                                                            i5 = 0;
                                                                            i6 = -1;
                                                                            strOooO00o2 = str5;
                                                                            while (true) {
                                                                                if (i5 < i3) {
                                                                                    i7 = 1000000;
                                                                                    i9 = 0;
                                                                                    i10 = 0;
                                                                                    while (i8 <= i6) {
                                                                                        i11 = iArr[i8];
                                                                                        if (i11 > i9) {
                                                                                            i9 = i11;
                                                                                        }
                                                                                        if (i11 < i7) {
                                                                                            i7 = i11;
                                                                                        }
                                                                                        i10 += i11;
                                                                                    }
                                                                                    StringBuilder sbOooO00o4 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                                    sbOooO00o4.append("\n     4 probes sent.\n     ");
                                                                                    int i22 = 4 - i4;
                                                                                    sbOooO00o4.append(i22);
                                                                                    sbOooO00o4.append(" successful, ");
                                                                                    sbOooO00o4.append(i4);
                                                                                    sbOooO00o4.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                                                    sbOooO00o4.append(i7);
                                                                                    sbOooO00o4.append("ms, Maximum = ");
                                                                                    sbOooO00o4.append(i9);
                                                                                    sbOooO00o4.append("ms, Average = ");
                                                                                    sbOooO00o4.append(i10 / i22);
                                                                                    sbOooO00o4.append("ms\n");
                                                                                    string3 = sbOooO00o4.toString();
                                                                                    break;
                                                                                }
                                                                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                                                                socket = new Socket();
                                                                                socket.connect(inetSocketAddress, 20000);
                                                                                socket.close();
                                                                                int i23 = i4;
                                                                                iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis4);
                                                                                StringBuilder sbOooO00o5 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                                sbOooO00o5.append("/tcp - time=");
                                                                                sbOooO00o5.append(iCurrentTimeMillis);
                                                                                sbOooO00o5.append("ms\n");
                                                                                strOooO00o2 = sbOooO00o5.toString();
                                                                                iArr[i5] = iCurrentTimeMillis;
                                                                                if (100 <= iCurrentTimeMillis) {
                                                                                }
                                                                                i4 = i23;
                                                                                i6 = i5;
                                                                                inetSocketAddress = inetSocketAddress;
                                                                                i5++;
                                                                                i3 = 4;
                                                                            }
                                                                            strArrSplit = string3.split("\n");
                                                                            if (strArrSplit != null) {
                                                                                map2 = map;
                                                                                map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                                                            } else {
                                                                                map2 = map;
                                                                            }
                                                                            strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                                                            i18++;
                                                                            publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                                                            if (isCancelled()) {
                                                                                return null;
                                                                            }
                                                                            i17 = 1;
                                                                            c = 0;
                                                                            str5 = str5;
                                                                            map4 = map2;
                                                                        }
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        bufferedReader = bufferedReader4;
                                                                        i = 3;
                                                                        dataOutputStream = dataOutputStream2;
                                                                        bufferedReader2 = bufferedReader3;
                                                                        Closeable[] closeableArr2 = new Closeable[i];
                                                                        closeableArr2[0] = dataOutputStream;
                                                                        closeableArr2[1] = bufferedReader2;
                                                                        closeableArr2[2] = bufferedReader;
                                                                        NetWorkUtil.OooO00o(closeableArr2);
                                                                        if (processExec != null) {
                                                                            processExec.destroy();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                while (true) {
                                                                    String line3 = bufferedReader4.readLine();
                                                                    if (line3 == null) {
                                                                        break;
                                                                    }
                                                                    sb.append(line3 + "\n");
                                                                }
                                                                NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                                                i2 = i12;
                                                                while (true) {
                                                                    if (i5 < i3) {
                                                                        i7 = 1000000;
                                                                        i9 = 0;
                                                                        i10 = 0;
                                                                        while (i8 <= i6) {
                                                                            i11 = iArr[i8];
                                                                            if (i11 > i9) {
                                                                                i9 = i11;
                                                                            }
                                                                            if (i11 < i7) {
                                                                                i7 = i11;
                                                                            }
                                                                            i10 += i11;
                                                                        }
                                                                        StringBuilder sbOooO00o6 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                        sbOooO00o6.append("\n     4 probes sent.\n     ");
                                                                        int i24 = 4 - i4;
                                                                        sbOooO00o6.append(i24);
                                                                        sbOooO00o6.append(" successful, ");
                                                                        sbOooO00o6.append(i4);
                                                                        sbOooO00o6.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                                        sbOooO00o6.append(i7);
                                                                        sbOooO00o6.append("ms, Maximum = ");
                                                                        sbOooO00o6.append(i9);
                                                                        sbOooO00o6.append("ms, Average = ");
                                                                        sbOooO00o6.append(i10 / i24);
                                                                        sbOooO00o6.append("ms\n");
                                                                        string3 = sbOooO00o6.toString();
                                                                        break;
                                                                    }
                                                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                                                    socket = new Socket();
                                                                    socket.connect(inetSocketAddress, 20000);
                                                                    socket.close();
                                                                    int i25 = i4;
                                                                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis5);
                                                                    StringBuilder sbOooO00o7 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                    sbOooO00o7.append("/tcp - time=");
                                                                    sbOooO00o7.append(iCurrentTimeMillis);
                                                                    sbOooO00o7.append("ms\n");
                                                                    strOooO00o2 = sbOooO00o7.toString();
                                                                    iArr[i5] = iCurrentTimeMillis;
                                                                    if (100 <= iCurrentTimeMillis && iCurrentTimeMillis > 0) {
                                                                        try {
                                                                            Thread.sleep(100 - iCurrentTimeMillis);
                                                                        } catch (Exception e10) {
                                                                            e10.printStackTrace();
                                                                        }
                                                                    }
                                                                    i4 = i25;
                                                                    i6 = i5;
                                                                    inetSocketAddress = inetSocketAddress;
                                                                    i5++;
                                                                    i3 = 4;
                                                                }
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                i2 = i12;
                                                                bufferedReader4 = null;
                                                                e.printStackTrace();
                                                                NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                                                if (processExec != null) {
                                                                    processExec.destroy();
                                                                }
                                                                if (sb2 == null) {
                                                                    string = null;
                                                                } else {
                                                                    string = sb2.toString();
                                                                }
                                                                if (sb == null) {
                                                                    string2 = null;
                                                                } else {
                                                                    string2 = sb.toString();
                                                                }
                                                                commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                                                if (i2 != 0) {
                                                                    str = commandResult.f21230OooO00o;
                                                                } else {
                                                                    str = commandResult.f21230OooO00o;
                                                                }
                                                                strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                                                str2 = strArrSplit2[0];
                                                                str3 = strArrSplit2[1];
                                                                hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                                                inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                                                i3 = 4;
                                                                iArr = new int[4];
                                                                i4 = 0;
                                                                map = map4;
                                                                str4 = strOooO00o;
                                                                i5 = 0;
                                                                i6 = -1;
                                                                strOooO00o2 = str5;
                                                                while (true) {
                                                                    if (i5 < i3) {
                                                                        i7 = 1000000;
                                                                        i9 = 0;
                                                                        i10 = 0;
                                                                        while (i8 <= i6) {
                                                                            i11 = iArr[i8];
                                                                            if (i11 > i9) {
                                                                                i9 = i11;
                                                                            }
                                                                            if (i11 < i7) {
                                                                                i7 = i11;
                                                                            }
                                                                            i10 += i11;
                                                                        }
                                                                        StringBuilder sbOooO00o8 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                        sbOooO00o8.append("\n     4 probes sent.\n     ");
                                                                        int i26 = 4 - i4;
                                                                        sbOooO00o8.append(i26);
                                                                        sbOooO00o8.append(" successful, ");
                                                                        sbOooO00o8.append(i4);
                                                                        sbOooO00o8.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                                        sbOooO00o8.append(i7);
                                                                        sbOooO00o8.append("ms, Maximum = ");
                                                                        sbOooO00o8.append(i9);
                                                                        sbOooO00o8.append("ms, Average = ");
                                                                        sbOooO00o8.append(i10 / i26);
                                                                        sbOooO00o8.append("ms\n");
                                                                        string3 = sbOooO00o8.toString();
                                                                        break;
                                                                    }
                                                                    long jCurrentTimeMillis6 = System.currentTimeMillis();
                                                                    socket = new Socket();
                                                                    socket.connect(inetSocketAddress, 20000);
                                                                    socket.close();
                                                                    int i27 = i4;
                                                                    iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis6);
                                                                    StringBuilder sbOooO00o9 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                                    sbOooO00o9.append("/tcp - time=");
                                                                    sbOooO00o9.append(iCurrentTimeMillis);
                                                                    sbOooO00o9.append("ms\n");
                                                                    strOooO00o2 = sbOooO00o9.toString();
                                                                    iArr[i5] = iCurrentTimeMillis;
                                                                    if (100 <= iCurrentTimeMillis) {
                                                                    }
                                                                    i4 = i27;
                                                                    i6 = i5;
                                                                    inetSocketAddress = inetSocketAddress;
                                                                    i5++;
                                                                    i3 = 4;
                                                                }
                                                                strArrSplit = string3.split("\n");
                                                                if (strArrSplit != null) {
                                                                    map2 = map;
                                                                    map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                                                } else {
                                                                    map2 = map;
                                                                }
                                                                strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                                                i18++;
                                                                publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                                                if (isCancelled()) {
                                                                    return null;
                                                                }
                                                                i17 = 1;
                                                                c = 0;
                                                                str5 = str5;
                                                                map4 = map2;
                                                            }
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            i12 = iWaitFor;
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        bufferedReader = null;
                                                        i = 3;
                                                        dataOutputStream = dataOutputStream2;
                                                        bufferedReader2 = bufferedReader3;
                                                        Closeable[] closeableArr3 = new Closeable[i];
                                                        closeableArr3[0] = dataOutputStream;
                                                        closeableArr3[1] = bufferedReader2;
                                                        closeableArr3[2] = bufferedReader;
                                                        NetWorkUtil.OooO00o(closeableArr3);
                                                        if (processExec != null) {
                                                            processExec.destroy();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    i2 = iWaitFor;
                                                    bufferedReader3 = null;
                                                    bufferedReader4 = null;
                                                    e.printStackTrace();
                                                    NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                                    if (processExec != null) {
                                                        processExec.destroy();
                                                    }
                                                    if (sb2 == null) {
                                                        string = null;
                                                    } else {
                                                        string = sb2.toString();
                                                    }
                                                    if (sb == null) {
                                                        string2 = null;
                                                    } else {
                                                        string2 = sb.toString();
                                                    }
                                                    commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                                    if (i2 != 0) {
                                                        str = commandResult.f21230OooO00o;
                                                    } else {
                                                        str = commandResult.f21230OooO00o;
                                                    }
                                                    strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                                    str2 = strArrSplit2[0];
                                                    str3 = strArrSplit2[1];
                                                    hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                                    inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                                    i3 = 4;
                                                    iArr = new int[4];
                                                    i4 = 0;
                                                    map = map4;
                                                    str4 = strOooO00o;
                                                    i5 = 0;
                                                    i6 = -1;
                                                    strOooO00o2 = str5;
                                                    while (true) {
                                                        if (i5 < i3) {
                                                            i7 = 1000000;
                                                            i9 = 0;
                                                            i10 = 0;
                                                            while (i8 <= i6) {
                                                                i11 = iArr[i8];
                                                                if (i11 > i9) {
                                                                    i9 = i11;
                                                                }
                                                                if (i11 < i7) {
                                                                    i7 = i11;
                                                                }
                                                                i10 += i11;
                                                            }
                                                            StringBuilder sbOooO00o10 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                            sbOooO00o10.append("\n     4 probes sent.\n     ");
                                                            int i28 = 4 - i4;
                                                            sbOooO00o10.append(i28);
                                                            sbOooO00o10.append(" successful, ");
                                                            sbOooO00o10.append(i4);
                                                            sbOooO00o10.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                            sbOooO00o10.append(i7);
                                                            sbOooO00o10.append("ms, Maximum = ");
                                                            sbOooO00o10.append(i9);
                                                            sbOooO00o10.append("ms, Average = ");
                                                            sbOooO00o10.append(i10 / i28);
                                                            sbOooO00o10.append("ms\n");
                                                            string3 = sbOooO00o10.toString();
                                                            break;
                                                        }
                                                        long jCurrentTimeMillis7 = System.currentTimeMillis();
                                                        socket = new Socket();
                                                        socket.connect(inetSocketAddress, 20000);
                                                        socket.close();
                                                        int i29 = i4;
                                                        iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis7);
                                                        StringBuilder sbOooO00o11 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                        sbOooO00o11.append("/tcp - time=");
                                                        sbOooO00o11.append(iCurrentTimeMillis);
                                                        sbOooO00o11.append("ms\n");
                                                        strOooO00o2 = sbOooO00o11.toString();
                                                        iArr[i5] = iCurrentTimeMillis;
                                                        if (100 <= iCurrentTimeMillis) {
                                                        }
                                                        i4 = i29;
                                                        i6 = i5;
                                                        inetSocketAddress = inetSocketAddress;
                                                        i5++;
                                                        i3 = 4;
                                                    }
                                                    strArrSplit = string3.split("\n");
                                                    if (strArrSplit != null) {
                                                        map2 = map;
                                                        map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                                    } else {
                                                        map2 = map;
                                                    }
                                                    strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                                    i18++;
                                                    publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                                    if (isCancelled()) {
                                                        return null;
                                                    }
                                                    i17 = 1;
                                                    c = 0;
                                                    str5 = str5;
                                                    map4 = map2;
                                                }
                                            } catch (Exception e14) {
                                                e = e14;
                                                str5 = str5;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            str5 = str5;
                                            i2 = iWaitFor;
                                            sb = null;
                                            bufferedReader3 = null;
                                            bufferedReader4 = null;
                                            e.printStackTrace();
                                            NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                            if (processExec != null) {
                                                processExec.destroy();
                                            }
                                            if (sb2 == null) {
                                                string = null;
                                            } else {
                                                string = sb2.toString();
                                            }
                                            if (sb == null) {
                                                string2 = null;
                                            } else {
                                                string2 = sb.toString();
                                            }
                                            commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                            if (i2 != 0) {
                                                str = commandResult.f21230OooO00o;
                                            } else {
                                                str = commandResult.f21230OooO00o;
                                            }
                                            strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                            str2 = strArrSplit2[0];
                                            str3 = strArrSplit2[1];
                                            hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                            inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                            i3 = 4;
                                            iArr = new int[4];
                                            i4 = 0;
                                            map = map4;
                                            str4 = strOooO00o;
                                            i5 = 0;
                                            i6 = -1;
                                            strOooO00o2 = str5;
                                            while (true) {
                                                if (i5 < i3) {
                                                    i7 = 1000000;
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i8 <= i6) {
                                                        i11 = iArr[i8];
                                                        if (i11 > i9) {
                                                            i9 = i11;
                                                        }
                                                        if (i11 < i7) {
                                                            i7 = i11;
                                                        }
                                                        i10 += i11;
                                                    }
                                                    StringBuilder sbOooO00o12 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                    sbOooO00o12.append("\n     4 probes sent.\n     ");
                                                    int i210 = 4 - i4;
                                                    sbOooO00o12.append(i210);
                                                    sbOooO00o12.append(" successful, ");
                                                    sbOooO00o12.append(i4);
                                                    sbOooO00o12.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                    sbOooO00o12.append(i7);
                                                    sbOooO00o12.append("ms, Maximum = ");
                                                    sbOooO00o12.append(i9);
                                                    sbOooO00o12.append("ms, Average = ");
                                                    sbOooO00o12.append(i10 / i210);
                                                    sbOooO00o12.append("ms\n");
                                                    string3 = sbOooO00o12.toString();
                                                    break;
                                                }
                                                long jCurrentTimeMillis8 = System.currentTimeMillis();
                                                socket = new Socket();
                                                socket.connect(inetSocketAddress, 20000);
                                                socket.close();
                                                int i211 = i4;
                                                iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis8);
                                                StringBuilder sbOooO00o13 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                sbOooO00o13.append("/tcp - time=");
                                                sbOooO00o13.append(iCurrentTimeMillis);
                                                sbOooO00o13.append("ms\n");
                                                strOooO00o2 = sbOooO00o13.toString();
                                                iArr[i5] = iCurrentTimeMillis;
                                                if (100 <= iCurrentTimeMillis) {
                                                }
                                                i4 = i211;
                                                i6 = i5;
                                                inetSocketAddress = inetSocketAddress;
                                                i5++;
                                                i3 = 4;
                                            }
                                            strArrSplit = string3.split("\n");
                                            if (strArrSplit != null) {
                                                map2 = map;
                                                map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                            } else {
                                                map2 = map;
                                            }
                                            strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                            i18++;
                                            publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                            if (isCancelled()) {
                                                return null;
                                            }
                                            i17 = 1;
                                            c = 0;
                                            str5 = str5;
                                            map4 = map2;
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        str5 = str5;
                                        i2 = iWaitFor;
                                        sb2 = null;
                                        sb = null;
                                        bufferedReader3 = null;
                                        bufferedReader4 = null;
                                        e.printStackTrace();
                                        NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                        if (processExec != null) {
                                            processExec.destroy();
                                        }
                                        if (sb2 == null) {
                                            string = null;
                                        } else {
                                            string = sb2.toString();
                                        }
                                        if (sb == null) {
                                            string2 = null;
                                        } else {
                                            string2 = sb.toString();
                                        }
                                        commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                        if (i2 != 0) {
                                            str = commandResult.f21230OooO00o;
                                        } else {
                                            str = commandResult.f21230OooO00o;
                                        }
                                        strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                        str2 = strArrSplit2[0];
                                        str3 = strArrSplit2[1];
                                        hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                        inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                        i3 = 4;
                                        iArr = new int[4];
                                        i4 = 0;
                                        map = map4;
                                        str4 = strOooO00o;
                                        i5 = 0;
                                        i6 = -1;
                                        strOooO00o2 = str5;
                                        while (true) {
                                            if (i5 < i3) {
                                                i7 = 1000000;
                                                i9 = 0;
                                                i10 = 0;
                                                while (i8 <= i6) {
                                                    i11 = iArr[i8];
                                                    if (i11 > i9) {
                                                        i9 = i11;
                                                    }
                                                    if (i11 < i7) {
                                                        i7 = i11;
                                                    }
                                                    i10 += i11;
                                                }
                                                StringBuilder sbOooO00o14 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                                sbOooO00o14.append("\n     4 probes sent.\n     ");
                                                int i212 = 4 - i4;
                                                sbOooO00o14.append(i212);
                                                sbOooO00o14.append(" successful, ");
                                                sbOooO00o14.append(i4);
                                                sbOooO00o14.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                                sbOooO00o14.append(i7);
                                                sbOooO00o14.append("ms, Maximum = ");
                                                sbOooO00o14.append(i9);
                                                sbOooO00o14.append("ms, Average = ");
                                                sbOooO00o14.append(i10 / i212);
                                                sbOooO00o14.append("ms\n");
                                                string3 = sbOooO00o14.toString();
                                                break;
                                            }
                                            long jCurrentTimeMillis9 = System.currentTimeMillis();
                                            socket = new Socket();
                                            socket.connect(inetSocketAddress, 20000);
                                            socket.close();
                                            int i213 = i4;
                                            iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis9);
                                            StringBuilder sbOooO00o15 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                            sbOooO00o15.append("/tcp - time=");
                                            sbOooO00o15.append(iCurrentTimeMillis);
                                            sbOooO00o15.append("ms\n");
                                            strOooO00o2 = sbOooO00o15.toString();
                                            iArr[i5] = iCurrentTimeMillis;
                                            if (100 <= iCurrentTimeMillis) {
                                            }
                                            i4 = i213;
                                            i6 = i5;
                                            inetSocketAddress = inetSocketAddress;
                                            i5++;
                                            i3 = 4;
                                        }
                                        strArrSplit = string3.split("\n");
                                        if (strArrSplit != null) {
                                            map2 = map;
                                            map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                        } else {
                                            map2 = map;
                                        }
                                        strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                        i18++;
                                        publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                        if (isCancelled()) {
                                            return null;
                                        }
                                        i17 = 1;
                                        c = 0;
                                        str5 = str5;
                                        map4 = map2;
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    i2 = -1;
                                    dataOutputStream2 = null;
                                    sb2 = null;
                                    sb = null;
                                    bufferedReader3 = null;
                                    bufferedReader4 = null;
                                    e.printStackTrace();
                                    NetWorkUtil.OooO00o(dataOutputStream2, bufferedReader3, bufferedReader4);
                                    if (processExec != null) {
                                        processExec.destroy();
                                    }
                                    if (sb2 == null) {
                                        string = null;
                                    } else {
                                        string = sb2.toString();
                                    }
                                    if (sb == null) {
                                        string2 = null;
                                    } else {
                                        string2 = sb.toString();
                                    }
                                    commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                                    if (i2 != 0) {
                                        str = commandResult.f21230OooO00o;
                                    } else {
                                        str = commandResult.f21230OooO00o;
                                    }
                                    strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                                    str2 = strArrSplit2[0];
                                    str3 = strArrSplit2[1];
                                    hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                                    inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                                    i3 = 4;
                                    iArr = new int[4];
                                    i4 = 0;
                                    map = map4;
                                    str4 = strOooO00o;
                                    i5 = 0;
                                    i6 = -1;
                                    strOooO00o2 = str5;
                                    while (true) {
                                        if (i5 < i3) {
                                            i7 = 1000000;
                                            i9 = 0;
                                            i10 = 0;
                                            while (i8 <= i6) {
                                                i11 = iArr[i8];
                                                if (i11 > i9) {
                                                    i9 = i11;
                                                }
                                                if (i11 < i7) {
                                                    i7 = i11;
                                                }
                                                i10 += i11;
                                            }
                                            StringBuilder sbOooO00o16 = o00oOoo.OooO00o(strOooO00o2, "Ping statistics for ", hostAddress, CertificateUtil.DELIMITER, str3);
                                            sbOooO00o16.append("\n     4 probes sent.\n     ");
                                            int i214 = 4 - i4;
                                            sbOooO00o16.append(i214);
                                            sbOooO00o16.append(" successful, ");
                                            sbOooO00o16.append(i4);
                                            sbOooO00o16.append(" failed.\nApproximate trip times in milli-seconds:\n     Minimum = ");
                                            sbOooO00o16.append(i7);
                                            sbOooO00o16.append("ms, Maximum = ");
                                            sbOooO00o16.append(i9);
                                            sbOooO00o16.append("ms, Average = ");
                                            sbOooO00o16.append(i10 / i214);
                                            sbOooO00o16.append("ms\n");
                                            string3 = sbOooO00o16.toString();
                                            break;
                                        }
                                        long jCurrentTimeMillis10 = System.currentTimeMillis();
                                        socket = new Socket();
                                        socket.connect(inetSocketAddress, 20000);
                                        socket.close();
                                        int i215 = i4;
                                        iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis10);
                                        StringBuilder sbOooO00o17 = o00oOoo.OooO00o(strOooO00o2, "Probing ", hostAddress, CertificateUtil.DELIMITER, str3);
                                        sbOooO00o17.append("/tcp - time=");
                                        sbOooO00o17.append(iCurrentTimeMillis);
                                        sbOooO00o17.append("ms\n");
                                        strOooO00o2 = sbOooO00o17.toString();
                                        iArr[i5] = iCurrentTimeMillis;
                                        if (100 <= iCurrentTimeMillis) {
                                        }
                                        i4 = i215;
                                        i6 = i5;
                                        inetSocketAddress = inetSocketAddress;
                                        i5++;
                                        i3 = 4;
                                    }
                                    strArrSplit = string3.split("\n");
                                    if (strArrSplit != null) {
                                        map2 = map;
                                        map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                                    } else {
                                        map2 = map;
                                    }
                                    strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                                    i18++;
                                    publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                                    if (isCancelled()) {
                                        return null;
                                    }
                                    i17 = 1;
                                    c = 0;
                                    str5 = str5;
                                    map4 = map2;
                                } catch (Throwable th8) {
                                    th = th8;
                                    bufferedReader = null;
                                    i = 3;
                                    dataOutputStream = null;
                                    bufferedReader2 = null;
                                    Closeable[] closeableArr4 = new Closeable[i];
                                    closeableArr4[0] = dataOutputStream;
                                    closeableArr4[1] = bufferedReader2;
                                    closeableArr4[2] = bufferedReader;
                                    NetWorkUtil.OooO00o(closeableArr4);
                                    if (processExec != null) {
                                        processExec.destroy();
                                    }
                                    throw th;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                processExec = null;
                            } catch (Throwable th9) {
                                th = th9;
                                processExec = null;
                            }
                            hostAddress = InetAddress.getAllByName(str2)[0].getHostAddress();
                            inetSocketAddress = new InetSocketAddress(hostAddress, Integer.parseInt(str3));
                            i3 = 4;
                            iArr = new int[4];
                            i4 = 0;
                            map = map4;
                            str4 = strOooO00o;
                            i5 = 0;
                            i6 = -1;
                            strOooO00o2 = str5;
                        } catch (UnknownHostException e19) {
                            map = map4;
                            str4 = strOooO00o;
                            e19.printStackTrace();
                            string3 = "TCPPING Unknown host: " + str2 + "\n";
                        }
                        processExec.destroy();
                        if (sb2 == null) {
                            string = null;
                        } else {
                            string = sb2.toString();
                        }
                        if (sb == null) {
                            string2 = null;
                        } else {
                            string2 = sb.toString();
                        }
                        commandResult = new NetWorkUtil.CommandResult(i2, string, string2);
                        if (i2 != 0 || (i2 == 1 && !TextUtils.isEmpty(string))) {
                            str = commandResult.f21230OooO00o;
                        } else {
                            str = commandResult.f21231OooO0O0;
                        }
                        strOooO00o = OooO0o.OooO0OO.OooO00o(strOooO00o5, str, "\n");
                        str2 = strArrSplit2[0];
                        str3 = strArrSplit2[1];
                        strArrSplit = string3.split("\n");
                        if (strArrSplit != null) {
                            map2 = map;
                            map2.put(NetworkTestActivity.this.f22008o00000[i18], new ArrayList(Arrays.asList(strArrSplit)));
                        } else {
                            map2 = map;
                        }
                        strOooO00o4 = OooO0o.OooO0OO.OooO00o(str4, string3, "\n");
                        i18++;
                        publishProgress(Float.valueOf((i18 / NetworkTestActivity.this.f22008o00000.length) + 9.0f));
                        if (isCancelled()) {
                            return null;
                        }
                        i17 = 1;
                        c = 0;
                        str5 = str5;
                        map4 = map2;
                    }
                }
            } while (!isCancelled());
            return null;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            super.onPostExecute(r1);
        }

        @Override // android.os.AsyncTask
        public final void onProgressUpdate(Float[] fArr) {
            Float[] fArr2 = fArr;
            super.onProgressUpdate(fArr2);
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            float fFloatValue = fArr2[0].floatValue();
            String str = NetworkTestActivity.f21997o000OO;
            networkTestActivity.OooOooO(fFloatValue);
        }
    }

    public class OooO0OO extends AsyncTask<Void, Integer, Void> {
        public OooO0OO() {
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) {
            NetworkTestActivity.this.f22027o00Oo0 = OooO00o.OooO00o.OooO00o(new StringBuilder(), NetworkTestActivity.this.f21998Ooooo00, "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f21999Ooooo0o + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22000OooooO0 + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22001OooooOO + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22002OooooOo + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22004Oooooo0 + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22005OoooooO + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22006Ooooooo + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22037o0OoOo0 + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22043ooOO + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, NetworkTestActivity.this.f22026o00O0O + "\n");
            NetworkTestActivity.OooOoO(NetworkTestActivity.this, "End all test!\n");
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            networkTestActivity.f22021o0000O0O.setEndTime(NetworkTestActivity.OooOoOO(networkTestActivity));
            o0.OooO00o oooO00o = o0.OooO00o.f26572OooO0O0;
            NetModel netModel = NetworkTestActivity.this.f22021o0000O0O;
            Intrinsics.checkNotNullParameter(netModel, "netModel");
            try {
                String json = o0.OooO00o.f26571OooO00o.OooO0oo(netModel);
                o00OO00O o00oo00o = o00OO00O.f34941OooO00o;
                Intrinsics.checkNotNullExpressionValue(json, "json");
                o00oo00o.OooO00o("net", json);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                FileWriter fileWriter = new FileWriter(NetworkTestActivity.f21997o000OO + NetworkTestActivity.this.f22014o00000OO, true);
                fileWriter.write("\r\n\r\n" + NetworkTestActivity.this.f22027o00Oo0);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                File fileOooO0O0 = p496o0o00OO0.OooO0o.f41174OooO00o.OooO0O0(NetworkTestActivity.this.f22013o00000O0);
                if (!fileOooO0O0.exists()) {
                    o0Oo0oo.OooO0o0(604, 0);
                    return null;
                }
                String str = "";
                FileInputStream fileInputStream = new FileInputStream(fileOooO0O0);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    str = str + line + "\n";
                }
                fileInputStream.close();
                if (TextUtils.isEmpty(str)) {
                    o0Oo0oo.OooO0o0(604, 0);
                    return null;
                }
                o000000O.OooO0O0(str.trim(), new com.yalla.yalla.ui.activity.main.OooO0O0(NetworkTestActivity.this, fileOooO0O0));
                return null;
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
                return null;
            } catch (IOException e3) {
                e3.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            super.onPostExecute(r1);
        }

        @Override // android.os.AsyncTask
        public final void onProgressUpdate(Integer[] numArr) {
            super.onProgressUpdate(numArr);
        }
    }

    public class OooO0o extends AsyncTask<Void, Integer, Void> {
        public OooO0o() {
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:72:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x009a A[EXC_TOP_SPLITTER, PHI: r1 r3
          0x009a: PHI (r1v6 java.io.File) = (r1v5 java.io.File), (r1v11 java.io.File) binds: [B:47:0x0098, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE]
          0x009a: PHI (r3v5 java.io.FileOutputStream) = (r3v4 java.io.FileOutputStream), (r3v16 java.io.FileOutputStream) binds: [B:47:0x0098, B:25:0x0072] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList, java.util.List<o0oOO.OooOOOO$OooO00o>] */
        @Override // android.os.AsyncTask
        public final Void doInBackground(Void[] voidArr) throws Throwable {
            FileOutputStream fileOutputStream;
            IOException e;
            File fileOooO0O0;
            InputStream inputStreamOpen;
            NetworkTestActivity.this.f22026o00O0O += ((Object) "Start testing upload speed...\n");
            InputStream inputStream = null;
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOooO0O0 = p496o0o00OO0.OooO0o.f41174OooO00o.OooO0O0(NetworkTestActivity.this.f22013o00000O0);
                    try {
                        inputStreamOpen = NetworkTestActivity.this.getAssets().open("cruise/chuan.png");
                        try {
                            if (fileOooO0O0.exists() && fileOooO0O0.length() == inputStreamOpen.available()) {
                                fileOutputStream = null;
                            } else {
                                File parentFile = fileOooO0O0.getParentFile();
                                if (!parentFile.exists()) {
                                    parentFile.mkdirs();
                                }
                                fileOutputStream = new FileOutputStream(fileOooO0O0);
                                try {
                                    byte[] bArr = new byte[8192];
                                    while (true) {
                                        int i = inputStreamOpen.read(bArr);
                                        if (i == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, i);
                                    }
                                    fileOutputStream.flush();
                                } catch (IOException e2) {
                                    e = e2;
                                    try {
                                        e.printStackTrace();
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        inputStream = inputStreamOpen;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        if (fileOutputStream == null) {
                                            throw th;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (IOException unused4) {
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream2 = fileOutputStream;
                                    fileOutputStream = fileOutputStream2;
                                    inputStream = inputStreamOpen;
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    fileOutputStream.close();
                                    throw th;
                                }
                            }
                            if (inputStreamOpen != null) {
                                try {
                                    inputStreamOpen.close();
                                } catch (IOException unused5) {
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                        } catch (IOException e3) {
                            e = e3;
                            fileOutputStream = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        inputStreamOpen = null;
                        fileOutputStream = null;
                        e.printStackTrace();
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (!isCancelled()) {
                            if (fileOooO0O0 == null) {
                                o0Oo0oo.OooO0o0(603, 0);
                            } else {
                                o0Oo0oo.OooO0o0(603, 0);
                            }
                        }
                        return null;
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileOooO0O0 = null;
                }
                if (!isCancelled()) {
                    if (fileOooO0O0 == null && fileOooO0O0.exists()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                        o00oO0o o00oo0o3 = o00000OO.f32228OooO00o;
                        String str = NetworkTestActivity.this.f22012o00000O;
                        com.yalla.yalla.ui.activity.main.OooO0OO oooO0OO = new com.yalla.yalla.ui.activity.main.OooO0OO(this, jCurrentTimeMillis, fileOooO0O0);
                        App app = App.f11473OoooO00;
                        Map<String, String> mapOooO00o = com.app.base.Function.OooO0OO.OooO00o();
                        p154o00Oo0oO.o0ooOOo o0ooooo2 = p154o00Oo0oO.o0ooOOo.f32239OooO00o;
                        String str2 = p154o00Oo0oO.o0ooOOo.f32317o0000OO0;
                        oooO0OO.OooO0OO();
                        OooOOOO oooOOOO = new OooOOOO();
                        oooOOOO.f44627OooO00o = str2;
                        oooOOOO.f44630OooO0Oo = mapOooO00o;
                        oooOOOO.f44631OooO0o0.add(new OooOOOO.OooO00o(str, fileOooO0O0));
                        o00OO0OO.OooO00o(oooOOOO, mapOooO00o);
                        oooOOOO.OooO0O0().OooO00o(new com.app.base.Function.OooO(oooO0OO));
                    } else {
                        o0Oo0oo.OooO0o0(603, 0);
                    }
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (fileOutputStream == null) {
                    throw th;
                }
                fileOutputStream.close();
                throw th;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Void r1) {
            super.onPostExecute(r1);
        }

        @Override // android.os.AsyncTask
        public final void onProgressUpdate(Integer[] numArr) {
            Integer[] numArr2 = numArr;
            super.onProgressUpdate(numArr2);
            NetworkTestActivity networkTestActivity = NetworkTestActivity.this;
            float fIntValue = numArr2[0].intValue();
            String str = NetworkTestActivity.f21997o000OO;
            networkTestActivity.OooOooO(fIntValue);
        }
    }

    public static /* synthetic */ String OooOoO(NetworkTestActivity networkTestActivity, Object obj) {
        String str = networkTestActivity.f22027o00Oo0 + obj;
        networkTestActivity.f22027o00Oo0 = str;
        return str;
    }

    public static String OooOoOO(NetworkTestActivity networkTestActivity) {
        Objects.requireNonNull(networkTestActivity);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("en"));
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
        return simpleDateFormat.format(new Date());
    }

    public final void OooOoo() {
        this.f22028o00Ooo.setVisibility(8);
        this.f22029o00o0O.setVisibility(8);
        this.f22032o00ooo.setVisibility(8);
        this.f22041oo000o.setVisibility(8);
        this.f22031o00oO0o.setVisibility(8);
        this.f22030o00oO0O.setVisibility(8);
        this.f22038o0ooOO0.setVisibility(8);
        this.f22039o0ooOOo.setVisibility(8);
        this.f22040o0ooOoO.setVisibility(8);
        this.f22035o0OOO0o.setVisibility(8);
        this.f22036o0Oo0oo.setVisibility(8);
        this.f22034o0OO00O.setVisibility(8);
        this.f22042oo0o0Oo.setVisibility(8);
    }

    public final void OooOoo0() {
        this.f21998Ooooo00 = "";
        this.f21999Ooooo0o = "";
        this.f22000OooooO0 = "";
        this.f22001OooooOO = "";
        this.f22004Oooooo0 = "";
        this.f22003Oooooo = "";
        this.f22005OoooooO = "";
        this.f22006Ooooooo = "";
        this.f22037o0OoOo0 = "";
        this.f22043ooOO = "";
        this.f22026o00O0O = "";
        this.f22027o00Oo0 = "";
    }

    public final void OooOooO(float f) {
        int i = (int) ((100.0f * f) / this.f22025o000OOo);
        o00O00.OooO0OO("NetWorkTest", "progress = " + f + " percentage = " + i);
        TextView textView = this.f22032o00ooo;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("%");
        textView.setText(sb.toString());
        if (Build.VERSION.SDK_INT >= 24) {
            this.f22040o0ooOoO.setProgress(i, true);
        } else {
            this.f22040o0ooOoO.setProgress(i);
        }
    }

    public final void OooOooo() {
        this.f22021o0000O0O.setSpeedTest(new NetModel.NetSpeedModel());
        OooO00o oooO00o = new OooO00o();
        this.f22024o0000oo = oooO00o;
        oooO00o.execute(new Void[0]);
    }

    public final void Oooo000() {
        this.f22028o00Ooo.setVisibility(0);
        this.f22035o0OOO0o.setVisibility(0);
        this.f22040o0ooOoO.setProgress(0);
        this.f22040o0ooOoO.setVisibility(0);
        this.f22032o00ooo.setText("0%");
        this.f22032o00ooo.setVisibility(0);
        this.f22041oo000o.setVisibility(0);
        this.f22031o00oO0o.setVisibility(0);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(View view) {
        if (view.getId() != R.id.btn_network_test_button_start) {
            if (view.getId() == R.id.btn_network_test_restart) {
                this.f22033o0O0O00 = 1;
                OooOoo0();
                OooOoo();
                Oooo000();
                OooOooo();
                return;
            }
            return;
        }
        int i = this.f22033o0O0O00;
        if (i == 0) {
            this.f22033o0O0O00 = 1;
            OooOoo0();
            OooOoo();
            Oooo000();
            OooOooo();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(ReportItem.QualityKeyResult, this.f22027o00Oo0));
            ToastUtil.f12582OooO00o.OooO0O0(getString(R.string.network_test_copied));
            return;
        }
        this.f22033o0O0O00 = 3;
        OooOoo();
        this.f22029o00o0O.setText(this.f22027o00Oo0);
        this.f22029o00o0O.setVisibility(0);
        this.f22036o0Oo0oo.setVisibility(0);
        this.f22034o0OO00O.setText(getString(R.string.network_test_button_copy_result));
        this.f22034o0OO00O.setVisibility(0);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_network_test);
        StringBuilder sb = new StringBuilder();
        sb.append("App version:Yalla ");
        o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
        sb.append(o0ooOOo.OooO0O0());
        this.f22001OooooOO = sb.toString();
        this.f11480OoooOOO.setTitle(R.string.Network_Test);
        OooOo0O(1);
        this.f22028o00Ooo = (TextView) findViewById(R.id.tv_network_test_description);
        TextView textView = (TextView) findViewById(R.id.tv_network_test_result);
        this.f22029o00o0O = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.f22032o00ooo = (TextView) findViewById(R.id.tv_network_test_progress_number);
        this.f22041oo000o = (TextView) findViewById(R.id.tv_network_test_testing);
        this.f22031o00oO0o = (TextView) findViewById(R.id.tv_network_test_tips);
        this.f22030o00oO0O = (TextView) findViewById(R.id.tv_network_test_completed);
        this.f22038o0ooOO0 = (ImageView) findViewById(R.id.iv_network_test_radar);
        this.f22039o0ooOOo = (ImageView) findViewById(R.id.iv_network_test_completed);
        this.f22040o0ooOoO = (ProgressBar) findViewById(R.id.pb_network_test_run);
        this.f22035o0OOO0o = findViewById(R.id.view_network_run_bg);
        this.f22036o0Oo0oo = findViewById(R.id.view_network_test_line);
        this.f22034o0OO00O = (Button) OooOOo(R.id.btn_network_test_button_start);
        this.f22042oo0o0Oo = (Button) OooOOo(R.id.btn_network_test_restart);
        OooOoo();
        this.f22028o00Ooo.setVisibility(0);
        this.f22038o0ooOO0.setVisibility(0);
        this.f22036o0Oo0oo.setVisibility(0);
        this.f22034o0OO00O.setText(getString(R.string.network_test_button_start));
        this.f22034o0OO00O.setVisibility(0);
        this.f22010o000000O = true;
        o0O0O00.OooO0OO(this, oo0o0Oo.f48626OooO0Oo, new Function0() { // from class: o0o0OOoO.ooOOO00O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.f43747Oooo.f22010o000000O = false;
                return Unit.INSTANCE;
            }
        }, new o0O00000(this, 1));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        OooO00o oooO00o = this.f22024o0000oo;
        if (oooO00o != null) {
            oooO00o.cancel(true);
        }
        OooO0O0 oooO0O0 = this.f22023o0000oO;
        if (oooO0O0 != null) {
            oooO0O0.cancel(true);
        }
        OooO0o oooO0o = this.f22019o0000O0;
        if (oooO0o != null) {
            oooO0o.cancel(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, p141o00OOOoO.OooO0o
    public final void onEventMainThread(p141o00OOOoO.OooO0OO oooO0OO) {
        super.onEventMainThread(oooO0OO);
        switch (oooO0OO.f31906OooO00o) {
            case 601:
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f22023o0000oO = oooO0O0;
                oooO0O0.execute(new Void[0]);
                break;
            case 602:
                OooOooO(12.0f);
                if (((Integer) oooO0OO.f31908OooO0OO).intValue() == 1) {
                    DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("en"));
                    decimalFormat.applyLocalizedPattern("0.##");
                    String str = decimalFormat.format(this.f22022o0000Ooo) + "kB/s";
                    this.f22026o00O0O += "Download speed test results: " + str + "\n";
                    this.f22026o00O0O += "Source file size: " + (this.f22015o00000Oo / 1024) + "kB\n";
                    this.f22026o00O0O += "Download file size: " + (this.f22016o00000o0 / 1024) + "kB\n";
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f22026o00O0O);
                    sb.append("Download Time: ");
                    this.f22026o00O0O = android.support.v4.media.session.OooOOO0.OooO00o(sb, this.f22017o00000oO, "ms\n");
                    this.f22021o0000O0O.getSpeedTest().setDownload(str);
                } else {
                    this.f22026o00O0O = OooO00o.OooO00o.OooO00o(new StringBuilder(), this.f22026o00O0O, "Download speed test results: Error!\n");
                    this.f22021o0000O0O.getSpeedTest().setDownload("Error");
                }
                this.f22026o00O0O = OooO00o.OooO00o.OooO00o(new StringBuilder(), this.f22026o00O0O, "Download speed test end!\n");
                OooO0o oooO0o = new OooO0o();
                this.f22019o0000O0 = oooO0o;
                oooO0o.execute(new Void[0]);
                break;
            case 603:
                OooOooO(13.0f);
                if (((Integer) oooO0OO.f31908OooO0OO).intValue() == 1) {
                    DecimalFormat decimalFormat2 = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("en"));
                    decimalFormat2.applyLocalizedPattern("0.##");
                    String str2 = decimalFormat2.format(this.f22007o0000) + "kB/s";
                    this.f22026o00O0O += "Upload speed test results: " + str2 + "\n";
                    this.f22026o00O0O += "Source file size: " + (this.f22018o00000oo / 1024) + "kB\n";
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f22026o00O0O);
                    sb2.append("Upload Time: ");
                    this.f22026o00O0O = android.support.v4.media.session.OooOOO0.OooO00o(sb2, this.f22020o0000O00, "ms\n");
                    this.f22021o0000O0O.getSpeedTest().setUpload(str2);
                } else {
                    this.f22026o00O0O = OooO00o.OooO00o.OooO00o(new StringBuilder(), this.f22026o00O0O, "Upload speed test results: Error!\n");
                    this.f22021o0000O0O.getSpeedTest().setUpload("Error");
                }
                this.f22026o00O0O = OooO00o.OooO00o.OooO00o(new StringBuilder(), this.f22026o00O0O, "Upload speed test end!\n");
                this.f22033o0O0O00 = 2;
                if (!this.f22010o000000O) {
                    OooOooO(14.0f);
                    new OooO0OO().execute(new Void[0]);
                }
                break;
            case 604:
                OooOooO(15.0f);
                OooOoo();
                this.f22028o00Ooo.setVisibility(0);
                this.f22039o0ooOOo.setVisibility(0);
                this.f22030o00oO0O.setVisibility(0);
                this.f22036o0Oo0oo.setVisibility(0);
                this.f22034o0OO00O.setText(getString(R.string.network_test_button_show_result));
                this.f22034o0OO00O.setVisibility(0);
                this.f22042oo0o0Oo.setVisibility(0);
                break;
        }
    }
}
