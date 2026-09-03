package p361o0OOOoOo;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO0OO;
import com.google.firebase.crashlytics.internal.model.OooOO0O;
import com.google.firebase.crashlytics.internal.model.OooOOO0;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o00oO0o;
import com.uc.crashsdk.export.LogType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import o0OOo000.OooO;
import p016OooOoO0.OooOo00;
import p228o00oOo.o0000OO0;
import p354o0OOOo.OooOO0;
import p354o0OOOo.OooOOO;
import p360o0OOOoO0.OooO0O0;
import p362o0OOOoo.o00O0O;
import p362o0OOOoo.o00Oo0;
import p362o0OOOoo.o00Ooo;
import p362o0OOOoo.oo000o;
import p363o0OOOoo0.OooOOOO;
import p363o0OOOoo0.o000oOoO;
import p364o0OOOooO.o000O0;
import p466o0OooO0.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f38494OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38495OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000O00 f38496OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000O f38497OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO f38498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OOo000.OooOO0 f38499OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OO f38500OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOOO f38501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOOO f38502OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final OooO0O0 f38503OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000O000 f38504OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0000 f38505OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f38507OooOOO0 = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f38506OooOOO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final TaskCompletionSource<Void> f38508OooOOOO = new TaskCompletionSource<>();

    public class OooO00o implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Task f38509OooO00o;

        public OooO00o(Task task) {
            this.f38509OooO00o = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public final Task<Void> then(@Nullable Boolean bool) throws Exception {
            return o0OO00O.this.f38498OooO0Oo.OooO0OO(new o0Oo0oo(this, bool));
        }
    }

    public o0OO00O(Context context, o000oOoO o000oooo2, o000OO o000oo2, o0000O00 o0000o00, o0OOo000.OooOO0 oooOO1, o00000O o00000o, OooOOOO oooOOOO, OooOOOO oooOOOO2, o000O000 o000o001, OooOO0 oooOO2, OooO0O0 oooO0O0) {
        new AtomicBoolean(false);
        this.f38495OooO00o = context;
        this.f38498OooO0Oo = o000oooo2;
        this.f38500OooO0o0 = o000oo2;
        this.f38496OooO0O0 = o0000o00;
        this.f38499OooO0o = oooOO1;
        this.f38497OooO0OO = o00000o;
        this.f38501OooO0oO = oooOOOO;
        this.f38502OooO0oo = oooOOOO2;
        this.f38494OooO = oooOO2;
        this.f38503OooOO0 = oooO0O0;
        this.f38504OooOO0O = o000o001;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public static void OooO00o(o0OO00O o0oo00o2, String str) {
        Integer num;
        Objects.requireNonNull(o0oo00o2);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strOooO0Oo = OooOo00.OooO0Oo("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooO0Oo, null);
        }
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "18.2.13");
        o000OO o000oo2 = o0oo00o2.f38500OooO0o0;
        OooOOOO oooOOOO = o0oo00o2.f38501OooO0oO;
        o00Oo0 o00oo1 = new o00Oo0(o000oo2.f38472OooO0OO, oooOOOO.f38401OooO0o0, oooOOOO.f38400OooO0o, o000oo2.OooO0OO(), (oooOOOO.f38398OooO0OO != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).OooO00o(), oooOOOO.f38402OooO0oO);
        String str3 = Build.VERSION.RELEASE;
        String str4 = Build.VERSION.CODENAME;
        oo000o oo000oVar = new oo000o(Oooo0.OooOO0O());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = Oooo0.OooO00o.OooO00o().ordinal();
        String str5 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jOooO0oo = Oooo0.OooO0oo();
        boolean zOooOO0 = Oooo0.OooOO0();
        int iOooO0Oo = Oooo0.OooO0Oo();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        o0oo00o2.f38494OooO.OooO0Oo(str, str2, jCurrentTimeMillis, new o00O0O(o00oo1, oo000oVar, new o00Ooo(iOrdinal, iAvailableProcessors, jOooO0oo, blockCount, zOooOO0, iOooO0Oo)));
        o0oo00o2.f38502OooO0oo.OooO00o(str);
        o000O000 o000o001 = o0oo00o2.f38504OooOO0O;
        o00000OO o00000oo2 = o000o001.f38460OooO00o;
        Objects.requireNonNull(o00000oo2);
        Charset charset = CrashlyticsReport.f18793OooO00o;
        com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o();
        oooO00o.f18923OooO00o = "18.2.13";
        String str8 = o00000oo2.f38443OooO0OO.f38396OooO00o;
        Objects.requireNonNull(str8, "Null gmpAppId");
        oooO00o.f18924OooO0O0 = str8;
        String strOooO0OO = o00000oo2.f38442OooO0O0.OooO0OO();
        Objects.requireNonNull(strOooO0OO, "Null installationUuid");
        oooO00o.f18926OooO0Oo = strOooO0OO;
        String str9 = o00000oo2.f38443OooO0OO.f38401OooO0o0;
        Objects.requireNonNull(str9, "Null buildVersion");
        oooO00o.f18928OooO0o0 = str9;
        String str10 = o00000oo2.f38443OooO0OO.f38400OooO0o;
        Objects.requireNonNull(str10, "Null displayVersion");
        oooO00o.f18927OooO0o = str10;
        oooO00o.f18925OooO0OO = 4;
        OooOO0O.OooO0O0 oooO0O0 = new OooOO0O.OooO0O0();
        oooO0O0.OooO0O0(false);
        oooO0O0.f18967OooO0OO = Long.valueOf(jCurrentTimeMillis);
        Objects.requireNonNull(str, "Null identifier");
        oooO0O0.f18966OooO0O0 = str;
        String str11 = o00000OO.f38439OooO0o;
        Objects.requireNonNull(str11, "Null generator");
        oooO0O0.f18965OooO00o = str11;
        String str12 = o00000oo2.f38442OooO0O0.f38472OooO0OO;
        Objects.requireNonNull(str12, "Null identifier");
        String str13 = o00000oo2.f38443OooO0OO.f38401OooO0o0;
        Objects.requireNonNull(str13, "Null version");
        String str14 = o00000oo2.f38443OooO0OO.f38400OooO0o;
        String strOooO0OO2 = o00000oo2.f38442OooO0O0.OooO0OO();
        OooOOO oooOOO = o00000oo2.f38443OooO0OO.f38402OooO0oO;
        if (oooOOO.f38297OooO0O0 == null) {
            oooOOO.f38297OooO0O0 = new OooOOO.OooO00o(oooOOO);
        }
        String str15 = oooOOO.f38297OooO0O0.f38298OooO00o;
        OooOOO oooOOO2 = o00000oo2.f38443OooO0OO.f38402OooO0oO;
        if (oooOOO2.f38297OooO0O0 == null) {
            oooOOO2.f38297OooO0O0 = new OooOOO.OooO00o(oooOOO2);
        }
        oooO0O0.f18969OooO0o = new OooOOO0(str12, str13, str14, strOooO0OO2, str15, oooOOO2.f38297OooO0O0.f38299OooO0O0);
        o00oO0o.OooO00o oooO00o2 = new o00oO0o.OooO00o();
        oooO00o2.f19075OooO00o = 3;
        oooO00o2.f19076OooO0O0 = str3;
        oooO00o2.f19077OooO0OO = str4;
        oooO00o2.f19078OooO0Oo = Boolean.valueOf(Oooo0.OooOO0O());
        oooO0O0.f18972OooO0oo = oooO00o2.OooO00o();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str16 = Build.CPU_ABI;
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str16) && (num = (Integer) o00000OO.f38440OooO0o0.get(str16.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jOooO0oo2 = Oooo0.OooO0oo();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zOooOO1 = Oooo0.OooOO0();
        int iOooO0Oo2 = Oooo0.OooO0Oo();
        com.google.firebase.crashlytics.internal.model.OooOOOO.OooO00o oooO00o3 = new com.google.firebase.crashlytics.internal.model.OooOOOO.OooO00o();
        oooO00o3.f18992OooO00o = Integer.valueOf(iIntValue);
        oooO00o3.f18993OooO0O0 = str5;
        oooO00o3.f18994OooO0OO = Integer.valueOf(iAvailableProcessors2);
        oooO00o3.f18995OooO0Oo = Long.valueOf(jOooO0oo2);
        oooO00o3.f18997OooO0o0 = Long.valueOf(blockCount2);
        oooO00o3.f18996OooO0o = Boolean.valueOf(zOooOO1);
        oooO00o3.f18998OooO0oO = Integer.valueOf(iOooO0Oo2);
        oooO00o3.f18999OooO0oo = str6;
        oooO00o3.f18991OooO = str7;
        oooO0O0.f18964OooO = oooO00o3.OooO00o();
        oooO0O0.f18974OooOO0O = 3;
        oooO00o.f18929OooO0oO = oooO0O0.OooO00o();
        CrashlyticsReport crashlyticsReportOooO00o = oooO00o.OooO00o();
        OooO oooO = o000o001.f38461OooO0O0;
        Objects.requireNonNull(oooO);
        CrashlyticsReport.OooO oooO2 = ((com.google.firebase.crashlytics.internal.model.OooO0O0) crashlyticsReportOooO00o).f18922OooO0oo;
        if (oooO2 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strOooO0oO = oooO2.OooO0oO();
        try {
            OooO.OooO0o(oooO.f38610OooO0O0.OooO0oO(strOooO0oO, "report"), OooO.f38605OooO0o.OooO0oo(crashlyticsReportOooO00o));
            File fileOooO0oO = oooO.f38610OooO0O0.OooO0oO(strOooO0oO, "start-time");
            long jOooO = oooO2.OooO();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileOooO0oO), OooO.f38604OooO0Oo);
            try {
                outputStreamWriter.write("");
                fileOooO0oO.setLastModified(jOooO * 1000);
                outputStreamWriter.close();
            } catch (Throwable th) {
                try {
                    outputStreamWriter.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (IOException e) {
            String strOooO0Oo2 = OooOo00.OooO0Oo("Could not persist report for session ", strOooO0oO);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strOooO0Oo2, e);
            }
        }
    }

    public static Task OooO0O0(o0OO00O o0oo00o2) {
        boolean z;
        Task taskCall;
        Objects.requireNonNull(o0oo00o2);
        ArrayList arrayList = new ArrayList();
        o0OOo000.OooOO0 oooOO1 = o0oo00o2.f38499OooO0o;
        for (File file : o0OOo000.OooOO0.OooOO0(oooOO1.f38617OooO0O0.listFiles(o00Oo0.f38484OooO00o))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new o000OOo(o0oo00o2, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Could not parse app exception timestamp from file ");
                sbOooO0o0.append(file.getName());
                Log.w("FirebaseCrashlytics", sbOooO0o0.toString(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(boolean z, p366o0OOo00O.OooOOOO oooOOOO) {
        File file;
        ApplicationExitInfo next;
        String string;
        ArrayList arrayList = new ArrayList(this.f38504OooOO0O.f38461OooO0O0.OooO0OO());
        Throwable th = null;
        if (arrayList.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (((p366o0OOo00O.OooOO0O) oooOOOO).OooO0O0().f38623OooO0O0.f38629OooO0O0) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f38495OooO00o.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    OooOOOO oooOOOO2 = new OooOOOO(this.f38499OooO0o, str);
                    p363o0OOOoo0.OooOo00 oooOo00 = new p363o0OOOoo0.OooOo00(this.f38499OooO0o);
                    o000oOoO o000oooo2 = new o000oOoO();
                    o000oooo2.f38572OooO00o.f38575OooO00o.getReference().OooO00o(oooOo00.OooO0O0(str, false));
                    o000oooo2.f38573OooO0O0.f38575OooO00o.getReference().OooO00o(oooOo00.OooO0O0(str, true));
                    o000oooo2.f38574OooO0OO.set(oooOo00.OooO0OO(str), false);
                    o000O000 o000o001 = this.f38504OooOO0O;
                    long jLastModified = o000o001.f38461OooO0O0.f38610OooO0O0.OooO0oO(str, "start-time").lastModified();
                    Iterator<ApplicationExitInfo> it = historicalProcessExitReasons.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                            if (next.getTimestamp() < jLastModified) {
                            }
                        }
                        next = null;
                        break;
                    } while (next.getReason() != 6);
                    if (next == null) {
                        String strOooO0Oo = OooOo00.OooO0Oo("No relevant ApplicationExitInfo occurred during session: ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strOooO0Oo, null);
                        }
                    } else {
                        o00000OO o00000oo2 = o000o001.f38460OooO00o;
                        try {
                            InputStream traceInputStream = next.getTraceInputStream();
                            if (traceInputStream != null) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i2 = traceInputStream.read(bArr);
                                    if (i2 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i2);
                                    }
                                    string = null;
                                }
                                string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            } else {
                                string = null;
                            }
                        } catch (IOException e) {
                            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Could not get input trace in application exit info: ");
                            sbOooO0o0.append(next.toString());
                            sbOooO0o0.append(" Error: ");
                            sbOooO0o0.append(e);
                            Log.w("FirebaseCrashlytics", sbOooO0o0.toString(), null);
                        }
                        OooO0OO.OooO00o oooO00o = new OooO0OO.OooO00o();
                        oooO00o.f18942OooO0Oo = Integer.valueOf(next.getImportance());
                        String processName = next.getProcessName();
                        Objects.requireNonNull(processName, "Null processName");
                        oooO00o.f18940OooO0O0 = processName;
                        oooO00o.f18941OooO0OO = Integer.valueOf(next.getReason());
                        oooO00o.f18945OooO0oO = Long.valueOf(next.getTimestamp());
                        oooO00o.f18939OooO00o = Integer.valueOf(next.getPid());
                        oooO00o.f18944OooO0o0 = Long.valueOf(next.getPss());
                        oooO00o.f18943OooO0o = Long.valueOf(next.getRss());
                        oooO00o.f18946OooO0oo = string;
                        CrashlyticsReport.OooO00o OooO00o2 = oooO00o.OooO00o();
                        int i3 = o00000oo2.f38441OooO00o.getResources().getConfiguration().orientation;
                        com.google.firebase.crashlytics.internal.model.OooOo00.OooO00o oooO00o2 = new com.google.firebase.crashlytics.internal.model.OooOo00.OooO00o();
                        oooO00o2.f19016OooO0O0 = LogType.ANR_TYPE;
                        OooO0OO oooO0OO = (OooO0OO) OooO00o2;
                        oooO00o2.OooO0O0(oooO0OO.f18937OooO0oO);
                        boolean z2 = oooO0OO.f18934OooO0Oo != 100;
                        OooOo.OooO0O0 oooO0O0 = new OooOo.OooO0O0();
                        oooO0O0.f19008OooO0Oo = Boolean.valueOf(z2);
                        oooO0O0.OooO0O0(i3);
                        oooO0O0.f19005OooO00o = new Oooo000(null, null, OooO00o2, o00000oo2.OooO0o0(), o00000oo2.OooO00o(), null);
                        oooO00o2.f19017OooO0OO = oooO0O0.OooO00o();
                        oooO00o2.f19018OooO0Oo = o00000oo2.OooO0O0(i3);
                        CrashlyticsReport.OooO.OooO0o oooO0oOooO00o = oooO00o2.OooO00o();
                        String strOooO0Oo2 = OooOo00.OooO0Oo("Persisting anr for session ", str);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strOooO0Oo2, null);
                        }
                        o000o001.f38461OooO0O0.OooO0Oo(o000o001.OooO00o(oooO0oOooO00o, oooOOOO2, o000oooo2), str, true);
                        th = null;
                    }
                } else {
                    String strOooO0Oo3 = OooOo00.OooO0Oo("No ApplicationExitInfo available. Session: ", str);
                    th = null;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strOooO0Oo3, null);
                    }
                }
            } else {
                String strOooO00o = android.support.v4.media.OooO00o.OooO00o("ANR feature enabled, but device is API ", i);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO00o, null);
                }
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
        }
        if (this.f38494OooO.OooO0OO(str)) {
            String strOooO0Oo4 = OooOo00.OooO0Oo("Finalizing native report for session ", str);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strOooO0Oo4, th);
            }
            Objects.requireNonNull(this.f38494OooO.OooO00o(str));
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str, null);
        }
        String str2 = z != 0 ? (String) arrayList.get(0) : null;
        o000O000 o000o002 = this.f38504OooOO0O;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        OooO oooO = o000o002.f38461OooO0O0;
        o0OOo000.OooOO0 oooOO1 = oooO.f38610OooO0O0;
        Objects.requireNonNull(oooOO1);
        oooOO1.OooO00o(new File(oooOO1.f38616OooO00o, ".com.google.firebase.crashlytics"));
        oooOO1.OooO00o(new File(oooOO1.f38616OooO00o, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT >= 28) {
            oooOO1.OooO00o(new File(oooOO1.f38616OooO00o, ".com.google.firebase.crashlytics.files.v1"));
        }
        SortedSet<String> sortedSetOooO0OO = oooO.OooO0OO();
        if (str2 != null) {
            sortedSetOooO0OO.remove(str2);
        }
        if (sortedSetOooO0OO.size() > 8) {
            while (sortedSetOooO0OO.size() > 8) {
                String strLast = sortedSetOooO0OO.last();
                String strOooO0Oo5 = OooOo00.OooO0Oo("Removing session over cap: ", strLast);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strOooO0Oo5, null);
                }
                o0OOo000.OooOO0 oooOO2 = oooO.f38610OooO0O0;
                Objects.requireNonNull(oooOO2);
                o0OOo000.OooOO0.OooO(new File(oooOO2.f38618OooO0OO, strLast));
                sortedSetOooO0OO.remove(strLast);
            }
        }
        for (String str3 : sortedSetOooO0OO) {
            String strOooO0Oo6 = OooOo00.OooO0Oo("Finalizing report for session ", str3);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strOooO0Oo6, null);
            }
            List listOooOO0 = o0OOo000.OooOO0.OooOO0(oooO.f38610OooO0O0.OooO0o(str3).listFiles(OooO.f38608OooO0oo));
            if (!listOooOO0.isEmpty()) {
                Collections.sort(listOooOO0);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listOooOO0.iterator();
                while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (!it2.hasNext()) {
                            if (!arrayList2.isEmpty()) {
                                String strOooO0OO = new p363o0OOOoo0.OooOo00(oooO.f38610OooO0O0).OooO0OO(str3);
                                File fileOooO0oO = oooO.f38610OooO0O0.OooO0oO(str3, "report");
                                try {
                                    o000O0 o000o0 = OooO.f38605OooO0o;
                                    CrashlyticsReport crashlyticsReportOooO = o000o0.OooO0oO(OooO.OooO0o0(fileOooO0oO)).OooO(jCurrentTimeMillis, z3, strOooO0OO);
                                    p362o0OOOoo.o00oO0o<CrashlyticsReport.OooO.OooO0o> o00oo0o2 = new p362o0OOOoo.o00oO0o<>(arrayList2);
                                    if (((com.google.firebase.crashlytics.internal.model.OooO0O0) crashlyticsReportOooO).f18922OooO0oo == null) {
                                        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                    }
                                    com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o3 = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o((com.google.firebase.crashlytics.internal.model.OooO0O0) crashlyticsReportOooO);
                                    OooOO0O.OooO0O0 oooO0O1 = (OooOO0O.OooO0O0) ((com.google.firebase.crashlytics.internal.model.OooO0O0) crashlyticsReportOooO).f18922OooO0oo.OooOO0o();
                                    oooO0O1.f18973OooOO0 = o00oo0o2;
                                    oooO00o3.f18929OooO0oO = oooO0O1.OooO00o();
                                    CrashlyticsReport crashlyticsReportOooO00o = oooO00o3.OooO00o();
                                    CrashlyticsReport.OooO oooO2 = ((com.google.firebase.crashlytics.internal.model.OooO0O0) crashlyticsReportOooO00o).f18922OooO0oo;
                                    if (oooO2 == null) {
                                        break;
                                    }
                                    if (z3) {
                                        o0OOo000.OooOO0 oooOO3 = oooO.f38610OooO0O0;
                                        String strOooO0oO = oooO2.OooO0oO();
                                        Objects.requireNonNull(oooOO3);
                                        file = new File(oooOO3.f38621OooO0o0, strOooO0oO);
                                    } else {
                                        o0OOo000.OooOO0 oooOO4 = oooO.f38610OooO0O0;
                                        String strOooO0oO2 = oooO2.OooO0oO();
                                        Objects.requireNonNull(oooOO4);
                                        file = new File(oooOO4.f38619OooO0Oo, strOooO0oO2);
                                    }
                                    OooO.OooO0o(file, o000o0.OooO0oo(crashlyticsReportOooO00o));
                                    break;
                                } catch (IOException e2) {
                                    Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileOooO0oO, e2);
                                    break;
                                }
                            }
                            Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str3, null);
                            break;
                        }
                        File file2 = (File) it2.next();
                        try {
                            o000O0 o000o1 = OooO.f38605OooO0o;
                            String strOooO0o0 = OooO.OooO0o0(file2);
                            Objects.requireNonNull(o000o1);
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(strOooO0o0));
                                try {
                                    CrashlyticsReport.OooO.OooO0o oooO0oOooO0Oo = o000O0.OooO0Oo(jsonReader);
                                    jsonReader.close();
                                    arrayList2.add(oooO0oOooO0Oo);
                                    if (!z3) {
                                        String name = file2.getName();
                                        if (!(name.startsWith("event") && name.endsWith("_"))) {
                                            break;
                                        }
                                    }
                                    z3 = true;
                                } catch (Throwable th2) {
                                    try {
                                        jsonReader.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } catch (IllegalStateException e3) {
                                throw new IOException(e3);
                            }
                        } catch (IOException e4) {
                            Log.w("FirebaseCrashlytics", "Could not add event to report for " + file2, e4);
                        }
                    }
                }
            } else {
                String strOooO00o2 = OooO0o.OooO0OO.OooO00o("Session ", str3, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO00o2, null);
                }
            }
            o0OOo000.OooOO0 oooOO5 = oooO.f38610OooO0O0;
            Objects.requireNonNull(oooOO5);
            o0OOo000.OooOO0.OooO(new File(oooOO5.f38618OooO0OO, str3));
        }
        Objects.requireNonNull(((p366o0OOo00O.OooOO0O) oooO.f38611OooO0OO).OooO0O0().f38622OooO00o);
        ArrayList arrayList3 = (ArrayList) oooO.OooO0O0();
        int size = arrayList3.size();
        if (size <= 4) {
            return;
        }
        Iterator it3 = arrayList3.subList(4, size).iterator();
        while (it3.hasNext()) {
            ((File) it3.next()).delete();
        }
    }

    public final void OooO0Oo(long j) {
        try {
            if (this.f38499OooO0o.OooO0O0(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e);
        }
    }

    @Nullable
    public final String OooO0o() {
        SortedSet<String> sortedSetOooO0OO = this.f38504OooOO0O.f38461OooO0O0.OooO0OO();
        if (sortedSetOooO0OO.isEmpty()) {
            return null;
        }
        return sortedSetOooO0OO.first();
    }

    public final boolean OooO0o0(p366o0OOo00O.OooOOOO oooOOOO) {
        this.f38498OooO0Oo.OooO00o();
        o0000 o0000Var = this.f38505OooOO0o;
        if (o0000Var != null && o0000Var.f38415OooO0o0.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            OooO0OO(true, oooOOOO);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final Task<Void> OooO0oO(Task<p366o0OOo00O.OooO> task) {
        Task<Void> task2;
        Task task3;
        OooO oooO = this.f38504OooOO0O.f38461OooO0O0;
        if (!((oooO.f38610OooO0O0.OooO0o0().isEmpty() && oooO.f38610OooO0O0.OooO0Oo().isEmpty() && oooO.f38610OooO0O0.OooO0OO().isEmpty()) ? false : true)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            this.f38507OooOOO0.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        o0000OO0 o0000oo1 = o0000OO0.f33887OooO00o;
        o0000oo1.OooOO0o("Crash reports are available to be sent.");
        if (this.f38496OooO0O0.OooO00o()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            this.f38507OooOOO0.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            o0000oo1.OooO0Oo("Automatic data collection is disabled.");
            o0000oo1.OooOO0o("Notifying that unsent reports are available.");
            this.f38507OooOOO0.trySetResult(Boolean.TRUE);
            o0000O00 o0000o00 = this.f38496OooO0O0;
            synchronized (o0000o00.f38450OooO0O0) {
                task2 = o0000o00.f38451OooO0OO.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new o0ooOOo());
            o0000oo1.OooO0Oo("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.f38506OooOOO.getTask();
            ExecutorService executorService = o000Oo0.f38478OooO00o;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            o00000OO o00000oo2 = new o00000OO(taskCompletionSource);
            taskOnSuccessTask.continueWith(o00000oo2);
            task4.continueWith(o00000oo2);
            task3 = taskCompletionSource.getTask();
        }
        return task3.onSuccessTask(new OooO00o(task));
    }
}
