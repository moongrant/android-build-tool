package p285o0O0OOoo;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.o0O0000O;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooOOO;
import com.google.firebase.crashlytics.internal.model.OooOOO0;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.Oooo0;
import com.google.firebase.crashlytics.internal.model.Oooo000;
import com.google.firebase.crashlytics.internal.model.o00O0O;
import com.google.firebase.crashlytics.internal.model.o0ooOOo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;
import p283o0O0OOo.OooOO0O;
import p286o0O0Oo.OooOOOO;
import p286o0O0Oo.OooOo00;
import p287o0O0Oo0.OooO;
import p287o0O0Oo0.OooO0O0;
import p287o0O0Oo0.OooO0OO;
import p287o0O0Oo0.OooO0o;
import p287o0O0Oo0.OooOO0;
import p291o0O0OoO0.o000000;
import p291o0O0OoO0.o00000O0;
import p291o0O0OoO0.o0000Ooo;
import p295o0O0OooO.oo00o;
import p461o0OooO0.o00000;
import p461o0OooO0.o00000O;
import p461o0OooO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final oo000o f42191OooOOo0 = new oo000o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000 f42192OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f42193OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OO f42194OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O00 f42195OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000oo f42196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O000 f42197OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OoOo0 f42198OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOo00 f42199OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOOO f42200OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0O0OOOo.OooO00o f42201OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O f42202OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0O0ooO f42203OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o0000O0O f42205OooOOO0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f42204OooOOO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f42206OooOOOO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final TaskCompletionSource<Void> f42207OooOOOo = new TaskCompletionSource<>();

    public class OooO00o implements SuccessContinuation<Boolean, Void> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Task f42208OooO0Oo;

        public OooO00o(Task task) {
            this.f42208OooO0Oo = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public final Task<Void> then(@Nullable Boolean bool) throws Exception {
            return o0O0O00.this.f42198OooO0o0.OooO0O0(new oo0o0Oo(this, bool));
        }
    }

    public o0O0O00(Context context, o0OoOo0 o0oooo0, o000O000 o000o001, o000OO o000oo2, OooOo00 oooOo00, o0000O00 o0000o00, OooOOOO oooOOOO, o0000oo o0000ooVar, o00000 o00000Var, o0O0ooO o0o0ooo, o0O0OOOo.OooO00o oooO00o, OooOO0O oooOO0O) {
        new AtomicBoolean(false);
        this.f42193OooO00o = context;
        this.f42198OooO0o0 = o0oooo0;
        this.f42197OooO0o = o000o001;
        this.f42194OooO0O0 = o000oo2;
        this.f42199OooO0oO = oooOo00;
        this.f42195OooO0OO = o0000o00;
        this.f42200OooO0oo = oooOOOO;
        this.f42196OooO0Oo = o0000ooVar;
        this.f42192OooO = o00000Var;
        this.f42201OooOO0 = oooO00o;
        this.f42202OooOO0O = oooOO0O;
        this.f42203OooOO0o = o0o0ooo;
    }

    public static void OooO00o(o0O0O00 o0o0o00, String str) {
        Integer num;
        o0o0o00.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strOooO00o = o00O00OO.OooO00o("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooO00o, null);
        }
        Locale locale = Locale.US;
        String str2 = String.format(locale, "Crashlytics Android SDK/%s", "18.3.7");
        o000O000 o000o001 = o0o0o00.f42197OooO0o;
        String str3 = o000o001.f42165OooO0OO;
        OooOOOO oooOOOO = o0o0o00.f42200OooO0oo;
        OooO0OO oooO0OO = new OooO0OO(str3, oooOOOO.f42097OooO0o, oooOOOO.f42099OooO0oO, o000o001.OooO0OO(), (oooOOOO.f42096OooO0Oo != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).OooO00o(), oooOOOO.f42100OooO0oo);
        String str4 = Build.VERSION.RELEASE;
        String str5 = Build.VERSION.CODENAME;
        OooO oooO = new OooO(str4, str5, o000oOoO.OooOO0());
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int iOrdinal = o000oOoO.OooO00o.OooO00o().ordinal();
        String str6 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jOooO0oO = o000oOoO.OooO0oO();
        boolean zOooO = o000oOoO.OooO();
        int iOooO0Oo = o000oOoO.OooO0Oo();
        String str7 = Build.MANUFACTURER;
        String str8 = Build.PRODUCT;
        o0o0o00.f42201OooOO0.OooO0OO(str, str2, jCurrentTimeMillis, new OooO0O0(oooO0OO, oooO, new OooO0o(iOrdinal, str6, iAvailableProcessors, jOooO0oO, blockCount, zOooO, iOooO0Oo, str7, str8)));
        o0o0o00.f42192OooO.OooO00o(str);
        o0O0ooO o0o0ooo = o0o0o00.f42203OooOO0o;
        o0000oo o0000ooVar = o0o0ooo.f42210OooO00o;
        o0000ooVar.getClass();
        Charset charset = CrashlyticsReport.f19858OooO00o;
        com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o();
        oooO00o.f19996OooO00o = "18.3.7";
        OooOOOO oooOOOO2 = o0000ooVar.f42156OooO0OO;
        String str9 = oooOOOO2.f42093OooO00o;
        if (str9 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        oooO00o.f19997OooO0O0 = str9;
        o000O000 o000o002 = o0000ooVar.f42155OooO0O0;
        String strOooO0OO = o000o002.OooO0OO();
        if (strOooO0OO == null) {
            throw new NullPointerException("Null installationUuid");
        }
        oooO00o.f19999OooO0Oo = strOooO0OO;
        String str10 = oooOOOO2.f42097OooO0o;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        oooO00o.f20001OooO0o0 = str10;
        String str11 = oooOOOO2.f42099OooO0oO;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        oooO00o.f20000OooO0o = str11;
        oooO00o.f19998OooO0OO = 4;
        OooOOO0.OooO00o oooO00o2 = new OooOOO0.OooO00o();
        oooO00o2.f20053OooO0o0 = Boolean.FALSE;
        oooO00o2.f20050OooO0OO = Long.valueOf(jCurrentTimeMillis);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        oooO00o2.f20049OooO0O0 = str;
        String str12 = o0000oo.f42153OooO0oO;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        oooO00o2.f20048OooO00o = str12;
        String str13 = o000o002.f42165OooO0OO;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        String strOooO0OO2 = o000o002.OooO0OO();
        o0O0OOOo.OooO0o oooO0o = oooOOOO2.f42100OooO0oo;
        if (oooO0o.f42084OooO0O0 == null) {
            oooO0o.f42084OooO0O0 = new o0O0OOOo.OooO0o.OooO00o(oooO0o);
        }
        o0O0OOOo.OooO0o.OooO00o oooO00o3 = oooO0o.f42084OooO0O0;
        String str14 = oooO00o3.f42085OooO00o;
        if (oooO00o3 == null) {
            oooO0o.f42084OooO0O0 = new o0O0OOOo.OooO0o.OooO00o(oooO0o);
        }
        oooO00o2.f20052OooO0o = new OooOOO(str13, str10, str11, strOooO0OO2, str14, oooO0o.f42084OooO0O0.f42086OooO0O0);
        o0ooOOo.OooO00o oooO00o4 = new o0ooOOo.OooO00o();
        oooO00o4.f20136OooO00o = 3;
        oooO00o4.f20137OooO0O0 = str4;
        oooO00o4.f20138OooO0OO = str5;
        oooO00o4.f20139OooO0Oo = Boolean.valueOf(o000oOoO.OooOO0());
        oooO00o2.f20055OooO0oo = oooO00o4.OooO00o();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str15 = Build.CPU_ABI;
        int iIntValue = (TextUtils.isEmpty(str15) || (num = (Integer) o0000oo.f42152OooO0o.get(str15.toLowerCase(locale))) == null) ? 7 : num.intValue();
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jOooO0oO2 = o000oOoO.OooO0oO();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zOooO2 = o000oOoO.OooO();
        int iOooO0Oo2 = o000oOoO.OooO0Oo();
        com.google.firebase.crashlytics.internal.model.OooOo00.OooO00o oooO00o5 = new com.google.firebase.crashlytics.internal.model.OooOo00.OooO00o();
        oooO00o5.f20078OooO00o = Integer.valueOf(iIntValue);
        oooO00o5.f20079OooO0O0 = str6;
        oooO00o5.f20080OooO0OO = Integer.valueOf(iAvailableProcessors2);
        oooO00o5.f20081OooO0Oo = Long.valueOf(jOooO0oO2);
        oooO00o5.f20083OooO0o0 = Long.valueOf(blockCount2);
        oooO00o5.f20082OooO0o = Boolean.valueOf(zOooO2);
        oooO00o5.f20084OooO0oO = Integer.valueOf(iOooO0Oo2);
        oooO00o5.f20085OooO0oo = str7;
        oooO00o5.f20077OooO = str8;
        oooO00o2.f20047OooO = oooO00o5.OooO00o();
        oooO00o2.f20057OooOO0O = 3;
        oooO00o.f20002OooO0oO = oooO00o2.OooO00o();
        com.google.firebase.crashlytics.internal.model.OooO0O0 oooO0O0OooO00o = oooO00o.OooO00o();
        OooOo00 oooOo00 = o0o0ooo.f42211OooO0O0.f42239OooO0O0;
        CrashlyticsReport.OooO oooO2 = oooO0O0OooO00o.f19993OooO0oo;
        if (oooO2 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String strOooO0oO = oooO2.OooO0oO();
        try {
            OooOOOO.f42234OooO0o.getClass();
            oo00o oo00oVar = p288o0O0Oo0O.OooOOO.f42269OooO00o;
            oo00oVar.getClass();
            StringWriter stringWriter = new StringWriter();
            try {
                oo00oVar.OooO00o(stringWriter, oooO0O0OooO00o);
            } catch (IOException unused) {
            }
            OooOOOO.OooO0o0(oooOo00.OooO0O0(strOooO0oO, "report"), stringWriter.toString());
            File fileOooO0O0 = oooOo00.OooO0O0(strOooO0oO, "start-time");
            long jOooO = oooO2.OooO();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileOooO0O0), OooOOOO.f42233OooO0Oo);
            try {
                outputStreamWriter.write("");
                fileOooO0O0.setLastModified(jOooO * 1000);
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
            String strOooO00o2 = o00O00OO.OooO00o("Could not persist report for session ", strOooO0oO);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strOooO00o2, e);
            }
        }
    }

    public static Task OooO0O0(o0O0O00 o0o0o00) {
        boolean z;
        Task taskCall;
        o0o0o00.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : OooOo00.OooO0o0(o0o0o00.f42199OooO0oO.f42242OooO0O0.listFiles(f42191OooOOo0))) {
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
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new o00000(o0o0o00, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[LOOP:0: B:15:0x0037->B:17:0x003f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[SYNTHETIC] */
    public static String OooO0o() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i;
        ClassLoader classLoader = o0O0O00.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
            if (resourceAsStream == null) {
                Log.i("FirebaseCrashlytics", "No version control information found", null);
            }
            if (resourceAsStream == null) {
                return null;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            while (true) {
                i = resourceAsStream.read(bArr);
                if (i != -1) {
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        }
        resourceAsStream = null;
        if (resourceAsStream == null) {
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Read version control info", null);
        }
        byteArrayOutputStream = new ByteArrayOutputStream();
        bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        while (true) {
            i = resourceAsStream.read(bArr);
            if (i != -1) {
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0362  */
    /* JADX WARN: Code duplicated, block: B:107:0x0370  */
    /* JADX WARN: Code duplicated, block: B:110:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:115:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:117:0x03db  */
    /* JADX WARN: Code duplicated, block: B:120:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x040a A[LOOP:1: B:124:0x040a->B:129:0x0427, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:126:0x0410  */
    /* JADX WARN: Code duplicated, block: B:128:0x0423  */
    /* JADX WARN: Code duplicated, block: B:133:0x043d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0451  */
    /* JADX WARN: Code duplicated, block: B:138:0x046d  */
    /* JADX WARN: Code duplicated, block: B:140:0x047c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0482  */
    /* JADX WARN: Code duplicated, block: B:144:0x0496  */
    /* JADX WARN: Code duplicated, block: B:151:0x04ba A[Catch: IOException -> 0x04ec, TryCatch #6 {IOException -> 0x04ec, blocks: (B:145:0x049d, B:146:0x04a4, B:148:0x04b2, B:149:0x04b5, B:151:0x04ba, B:153:0x04c6, B:168:0x04e4, B:167:0x04e1, B:170:0x04e6, B:171:0x04eb), top: B:216:0x049d, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:176:0x0505  */
    /* JADX WARN: Code duplicated, block: B:177:0x0519  */
    /* JADX WARN: Code duplicated, block: B:181:0x0540 A[Catch: IOException -> 0x0590, TRY_ENTER, TryCatch #3 {IOException -> 0x0590, blocks: (B:178:0x0528, B:181:0x0540, B:185:0x055c, B:187:0x0573, B:189:0x0580, B:186:0x0568, B:190:0x0588, B:191:0x058f), top: B:210:0x0528 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0559  */
    /* JADX WARN: Code duplicated, block: B:184:0x055a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x055c A[Catch: IOException -> 0x0590, TryCatch #3 {IOException -> 0x0590, blocks: (B:178:0x0528, B:181:0x0540, B:185:0x055c, B:187:0x0573, B:189:0x0580, B:186:0x0568, B:190:0x0588, B:191:0x058f), top: B:210:0x0528 }] */
    /* JADX WARN: Code duplicated, block: B:186:0x0568 A[Catch: IOException -> 0x0590, TryCatch #3 {IOException -> 0x0590, blocks: (B:178:0x0528, B:181:0x0540, B:185:0x055c, B:187:0x0573, B:189:0x0580, B:186:0x0568, B:190:0x0588, B:191:0x058f), top: B:210:0x0528 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x0588 A[Catch: IOException -> 0x0590, TryCatch #3 {IOException -> 0x0590, blocks: (B:178:0x0528, B:181:0x0540, B:185:0x055c, B:187:0x0573, B:189:0x0580, B:186:0x0568, B:190:0x0588, B:191:0x058f), top: B:210:0x0528 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:201:0x05d4 A[LOOP:4: B:199:0x05ce->B:201:0x05d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x05de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:224:0x0427 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x05a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x04ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x04d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x04d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0225  */
    /* JADX WARN: Instruction removed from duplicated block: B:176:0x0505, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(boolean z, o0000Ooo o0000ooo) {
        ArrayList arrayList;
        OooOOOO oooOOOO;
        o0O0O00 o0o0o00;
        boolean z2;
        o0O0OOOo.OooO00o oooO00o;
        boolean z3;
        Object obj;
        long jCurrentTimeMillis;
        OooOo00 oooOo00;
        File file;
        NavigableSet<String> navigableSetDescendingSet;
        int size;
        File file2;
        ArrayList arrayListOooO0O0;
        int size2;
        Iterator it;
        String strOooO00o;
        List listOooO0o0;
        ArrayList arrayList2;
        Iterator it2;
        boolean zHasNext;
        p288o0O0Oo0O.OooOOO oooOOO;
        File fileOooO0O0;
        com.google.firebase.crashlytics.internal.model.OooO0O0 oooO0O0OooOO0;
        OooOO0<CrashlyticsReport.OooO.OooO0o> oooOO1;
        CrashlyticsReport.OooO oooO;
        com.google.firebase.crashlytics.internal.model.OooO0O0 oooO0O0OooO00o;
        CrashlyticsReport.OooO oooO2;
        File file3;
        File file4;
        JsonReader jsonReader;
        String name;
        boolean z4;
        String strOooO00o2;
        String strOooO00o3;
        String strOooO00o4;
        ApplicationExitInfo applicationExitInfoOooO00o;
        String string;
        String str;
        OooOOOO oooOOOO2;
        OooOO0<CrashlyticsReport.OooO00o.AbstractC0253OooO00o> oooOO2;
        o0O0ooO o0o0ooo = this.f42203OooOO0o;
        OooOOOO oooOOOO3 = o0o0ooo.f42211OooO0O0;
        oooOOOO3.getClass();
        ArrayList arrayList3 = new ArrayList(new TreeSet(OooOo00.OooO0o0(oooOOOO3.f42239OooO0O0.f42243OooO0OO.list())).descendingSet());
        if (arrayList3.size() <= z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No open sessions to be closed.", null);
                return;
            }
            return;
        }
        String str2 = (String) arrayList3.get(z ? 1 : 0);
        boolean z5 = ((o00000O0) o0000ooo).OooO0O0().f42286OooO0O0.f42292OooO0O0;
        boolean z6 = true;
        OooOOOO oooOOOO4 = o0o0ooo.f42211OooO0O0;
        if (z5) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                List historicalProcessExitReasons = ((ActivityManager) this.f42193OooO00o.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons.size() != 0) {
                    OooOo00 oooOo01 = this.f42199OooO0oO;
                    o00000 o00000Var = new o00000(oooOo01, str2);
                    o00000O o00000o = new o00000O(oooOo01);
                    o0000oo o0000ooVar = new o0000oo(str2, oooOo01, this.f42198OooO0o0);
                    o0000ooVar.f46653OooO0Oo.f46656OooO00o.getReference().OooO0Oo(o00000o.OooO0O0(str2, false));
                    o0000ooVar.f46655OooO0o0.f46656OooO00o.getReference().OooO0Oo(o00000o.OooO0O0(str2, true));
                    o0000ooVar.f46654OooO0o.set(o00000o.OooO0OO(str2), false);
                    long jLastModified = oooOOOO4.f42239OooO0O0.OooO0O0(str2, "start-time").lastModified();
                    Iterator it3 = historicalProcessExitReasons.iterator();
                    do {
                        if (it3.hasNext()) {
                            applicationExitInfoOooO00o = o0O0000O.OooO00o(it3.next());
                            if (applicationExitInfoOooO00o.getTimestamp() < jLastModified) {
                            }
                        }
                        applicationExitInfoOooO00o = null;
                        break;
                    } while (applicationExitInfoOooO00o.getReason() != 6);
                    if (applicationExitInfoOooO00o == null) {
                        String strOooO00o5 = o00O00OO.OooO00o("No relevant ApplicationExitInfo occurred during session: ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strOooO00o5, null);
                        }
                        z2 = true;
                        o0o0o00 = this;
                        arrayList = arrayList3;
                        oooOOOO = oooOOOO4;
                    } else {
                        try {
                            InputStream traceInputStream = applicationExitInfoOooO00o.getTraceInputStream();
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
                            Log.w("FirebaseCrashlytics", "Could not get input trace in application exit info: " + applicationExitInfoOooO00o.toString() + " Error: " + e, null);
                        }
                        com.google.firebase.crashlytics.internal.model.OooO0OO.OooO00o oooO00o2 = new com.google.firebase.crashlytics.internal.model.OooO0OO.OooO00o();
                        oooO00o2.f20017OooO0Oo = Integer.valueOf(applicationExitInfoOooO00o.getImportance());
                        String processName = applicationExitInfoOooO00o.getProcessName();
                        String str3 = "Null processName";
                        if (processName == null) {
                            throw new NullPointerException("Null processName");
                        }
                        oooO00o2.f20015OooO0O0 = processName;
                        oooO00o2.f20016OooO0OO = Integer.valueOf(applicationExitInfoOooO00o.getReason());
                        oooO00o2.f20020OooO0oO = Long.valueOf(applicationExitInfoOooO00o.getTimestamp());
                        oooO00o2.f20014OooO00o = Integer.valueOf(applicationExitInfoOooO00o.getPid());
                        oooO00o2.f20019OooO0o0 = Long.valueOf(applicationExitInfoOooO00o.getPss());
                        oooO00o2.f20018OooO0o = Long.valueOf(applicationExitInfoOooO00o.getRss());
                        oooO00o2.f20021OooO0oo = string;
                        com.google.firebase.crashlytics.internal.model.OooO0OO oooO0OOOooO00o = oooO00o2.OooO00o();
                        o0000oo o0000ooVar2 = o0o0ooo.f42210OooO00o;
                        int i3 = o0000ooVar2.f42154OooO00o.getResources().getConfiguration().orientation;
                        OooOo.OooO00o oooO00o3 = new OooOo.OooO00o();
                        oooO00o3.f20064OooO0O0 = "anr";
                        long j = oooO0OOOooO00o.f20011OooO0oO;
                        oooO00o3.f20063OooO00o = Long.valueOf(j);
                        arrayList = arrayList3;
                        if (((o00000O0) o0000ooVar2.f42158OooO0o0).OooO0O0().f42286OooO0O0.f42293OooO0OO) {
                            OooOOOO oooOOOO5 = o0000ooVar2.f42156OooO0OO;
                            if (oooOOOO5.f42095OooO0OO.size() > 0) {
                                ArrayList arrayList4 = new ArrayList();
                                Iterator<Oooo000> it4 = oooOOOO5.f42095OooO0OO.iterator();
                                while (it4.hasNext()) {
                                    Iterator<Oooo000> it5 = it4;
                                    Oooo000 next = it4.next();
                                    String str4 = next.f42106OooO00o;
                                    if (str4 == null) {
                                        throw new NullPointerException("Null libraryName");
                                    }
                                    String str5 = str3;
                                    String str6 = next.f42107OooO0O0;
                                    if (str6 == null) {
                                        throw new NullPointerException("Null arch");
                                    }
                                    String str7 = next.f42108OooO0OO;
                                    if (str7 == null) {
                                        throw new NullPointerException("Null buildId");
                                    }
                                    arrayList4.add(new com.google.firebase.crashlytics.internal.model.OooO0o(str6, str4, str7));
                                    it4 = it5;
                                    str3 = str5;
                                    oooOOOO4 = oooOOOO4;
                                }
                                str = str3;
                                oooOOOO2 = oooOOOO4;
                                oooOO2 = new OooOO0<>(arrayList4);
                            } else {
                                str = "Null processName";
                                oooOOOO2 = oooOOOO4;
                                oooOO2 = null;
                            }
                        } else {
                            str = "Null processName";
                            oooOOOO2 = oooOOOO4;
                            oooOO2 = null;
                        }
                        com.google.firebase.crashlytics.internal.model.OooO0OO.OooO00o oooO00o4 = new com.google.firebase.crashlytics.internal.model.OooO0OO.OooO00o();
                        oooO00o4.f20017OooO0Oo = Integer.valueOf(oooO0OOOooO00o.f20008OooO0Oo);
                        String str8 = oooO0OOOooO00o.f20006OooO0O0;
                        if (str8 == null) {
                            throw new NullPointerException(str);
                        }
                        oooO00o4.f20015OooO0O0 = str8;
                        oooO00o4.f20016OooO0OO = Integer.valueOf(oooO0OOOooO00o.f20007OooO0OO);
                        oooO00o4.f20020OooO0oO = Long.valueOf(j);
                        oooO00o4.f20014OooO00o = Integer.valueOf(oooO0OOOooO00o.f20005OooO00o);
                        oooO00o4.f20019OooO0o0 = Long.valueOf(oooO0OOOooO00o.f20010OooO0o0);
                        oooO00o4.f20018OooO0o = Long.valueOf(oooO0OOOooO00o.f20009OooO0o);
                        oooO00o4.f20021OooO0oo = oooO0OOOooO00o.f20012OooO0oo;
                        oooO00o4.f20013OooO = oooOO2;
                        com.google.firebase.crashlytics.internal.model.OooO0OO oooO0OOOooO00o2 = oooO00o4.OooO00o();
                        Boolean boolValueOf = Boolean.valueOf(oooO0OOOooO00o2.f20008OooO0Oo != 100);
                        Integer numValueOf = Integer.valueOf(i3);
                        Long l = 0L;
                        String str9 = l == null ? " address" : "";
                        if (!str9.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str9));
                        }
                        Oooo0 oooo0 = new Oooo0(null, null, oooO0OOOooO00o2, new o00O0O(AppEventsConstants.EVENT_PARAM_VALUE_NO, AppEventsConstants.EVENT_PARAM_VALUE_NO, l.longValue()), o0000ooVar2.OooO00o());
                        String strConcat = numValueOf == null ? "".concat(" uiOrientation") : "";
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        oooO00o3.f20065OooO0OO = new Oooo000(oooo0, null, null, boolValueOf, numValueOf.intValue());
                        oooO00o3.f20066OooO0Oo = o0000ooVar2.OooO0O0(i3);
                        OooOo oooOoOooO00o = oooO00o3.OooO00o();
                        String strOooO00o6 = o00O00OO.OooO00o("Persisting anr for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", strOooO00o6, null);
                        }
                        z6 = true;
                        oooOOOO = oooOOOO2;
                        oooOOOO.OooO0OO(o0O0ooO.OooO00o(oooOoOooO00o, o00000Var, o0000ooVar), str2, true);
                    }
                    oooO00o = o0o0o00.f42201OooOO0;
                    if (oooO00o.OooO0Oo(str2)) {
                        strOooO00o4 = o00O00OO.OooO00o("Finalizing native report for session ", str2);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strOooO00o4, null);
                        }
                        oooO00o.OooO00o(str2).getClass();
                        Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, null);
                        Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, null);
                        Log.w("FirebaseCrashlytics", "No native core present", null);
                    }
                    if (z != 0) {
                        z3 = false;
                        obj = (String) arrayList.get(0);
                    } else {
                        z3 = false;
                        obj = null;
                    }
                    jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    oooOo00 = oooOOOO.f42239OooO0O0;
                    oooOo00.getClass();
                    file = oooOo00.f42241OooO00o;
                    OooOo00.OooO00o(new File(file, ".com.google.firebase.crashlytics"));
                    OooOo00.OooO00o(new File(file, ".com.google.firebase.crashlytics-ndk"));
                    if (Build.VERSION.SDK_INT < 28) {
                        z2 = z3;
                    }
                    if (z2) {
                        OooOo00.OooO00o(new File(file, ".com.google.firebase.crashlytics.files.v1"));
                    }
                    navigableSetDescendingSet = new TreeSet(OooOo00.OooO0o0(oooOOOO.f42239OooO0O0.f42243OooO0OO.list())).descendingSet();
                    if (obj != null) {
                        navigableSetDescendingSet.remove(obj);
                    }
                    size = navigableSetDescendingSet.size();
                    file2 = oooOo00.f42243OooO0OO;
                    if (size > 8) {
                        while (navigableSetDescendingSet.size() > 8) {
                            String str10 = (String) navigableSetDescendingSet.last();
                            strOooO00o3 = o00O00OO.OooO00o("Removing session over cap: ", str10);
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", strOooO00o3, null);
                            }
                            OooOo00.OooO0Oo(new File(file2, str10));
                            navigableSetDescendingSet.remove(str10);
                        }
                    }
                    for (String str11 : navigableSetDescendingSet) {
                        strOooO00o = o00O00OO.OooO00o("Finalizing report for session ", str11);
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", strOooO00o, null);
                        }
                        p286o0O0Oo.OooOOO oooOOO2 = OooOOOO.f42237OooO0oo;
                        File file5 = new File(file2, str11);
                        file5.mkdirs();
                        listOooO0o0 = OooOo00.OooO0o0(file5.listFiles(oooOOO2));
                        if (!listOooO0o0.isEmpty()) {
                            Collections.sort(listOooO0o0);
                            arrayList2 = new ArrayList();
                            it2 = listOooO0o0.iterator();
                            while (true) {
                                zHasNext = it2.hasNext();
                                oooOOO = OooOOOO.f42234OooO0o;
                                if (zHasNext) {
                                    if (!arrayList2.isEmpty()) {
                                        String strOooO0OO = new o00000O(oooOo00).OooO0OO(str11);
                                        fileOooO0O0 = oooOo00.OooO0O0(str11, "report");
                                        try {
                                            String strOooO0Oo = OooOOOO.OooO0Oo(fileOooO0O0);
                                            oooOOO.getClass();
                                            oooO0O0OooOO0 = p288o0O0Oo0O.OooOOO.OooO0oo(strOooO0Oo).OooOO0(jCurrentTimeMillis, strOooO0OO, z3);
                                            oooOO1 = new OooOO0<>(arrayList2);
                                            oooO = oooO0O0OooOO0.f19993OooO0oo;
                                            if (oooO != null) {
                                                throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                                            }
                                            com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o5 = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o(oooO0O0OooOO0);
                                            OooOOO0.OooO00o oooO00oOooOO0o = oooO.OooOO0o();
                                            oooO00oOooOO0o.f20056OooOO0 = oooOO1;
                                            oooO00o5.f20002OooO0oO = oooO00oOooOO0o.OooO00o();
                                            oooO0O0OooO00o = oooO00o5.OooO00o();
                                            oooO2 = oooO0O0OooO00o.f19993OooO0oo;
                                            if (oooO2 != null) {
                                                break;
                                            }
                                            if (z3) {
                                                file3 = new File(oooOo00.f42246OooO0o0, oooO2.OooO0oO());
                                            } else {
                                                file3 = new File(oooOo00.f42244OooO0Oo, oooO2.OooO0oO());
                                            }
                                            oo00o oo00oVar = p288o0O0Oo0O.OooOOO.f42269OooO00o;
                                            oo00oVar.getClass();
                                            StringWriter stringWriter = new StringWriter();
                                            try {
                                                oo00oVar.OooO00o(stringWriter, oooO0O0OooO00o);
                                            } catch (IOException unused) {
                                            }
                                            OooOOOO.OooO0o0(file3, stringWriter.toString());
                                            break;
                                        } catch (IOException e2) {
                                            Log.w("FirebaseCrashlytics", "Could not synthesize final report file for " + fileOooO0O0, e2);
                                            break;
                                        }
                                    }
                                    Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                                    break;
                                }
                                file4 = (File) it2.next();
                                try {
                                    String strOooO0Oo2 = OooOOOO.OooO0Oo(file4);
                                    oooOOO.getClass();
                                    try {
                                        jsonReader = new JsonReader(new StringReader(strOooO0Oo2));
                                        try {
                                            OooOo oooOoOooO0o0 = p288o0O0Oo0O.OooOOO.OooO0o0(jsonReader);
                                            jsonReader.close();
                                            arrayList2.add(oooOoOooO0o0);
                                            if (!z3) {
                                                name = file4.getName();
                                                if (name.startsWith("event") || !name.endsWith("_")) {
                                                    z4 = false;
                                                } else {
                                                    z4 = true;
                                                }
                                                if (z4) {
                                                    z3 = false;
                                                }
                                            }
                                            z3 = true;
                                        } catch (Throwable th) {
                                            try {
                                                jsonReader.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IllegalStateException e3) {
                                        throw new IOException(e3);
                                    }
                                } catch (IOException e4) {
                                    Log.w("FirebaseCrashlytics", "Could not add event to report for " + file4, e4);
                                }
                            }
                        } else {
                            strOooO00o2 = o000oOoO.OooO00o("Session ", str11, " has no events.");
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", strOooO00o2, null);
                            }
                        }
                        OooOo00.OooO0Oo(new File(file2, str11));
                        z3 = false;
                    }
                    ((o00000O0) oooOOOO.f42240OooO0OO).OooO0O0().f42285OooO00o.getClass();
                    arrayListOooO0O0 = oooOOOO.OooO0O0();
                    size2 = arrayListOooO0O0.size();
                    if (size2 <= 4) {
                        return;
                    }
                    it = arrayListOooO0O0.subList(4, size2).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
                arrayList = arrayList3;
                oooOOOO = oooOOOO4;
                String strOooO00o7 = o00O00OO.OooO00o("No ApplicationExitInfo available. Session: ", str2);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO00o7, null);
                }
            } else {
                arrayList = arrayList3;
                oooOOOO = oooOOOO4;
                String strOooO00o8 = android.support.v4.media.OooO00o.OooO00o("ANR feature enabled, but device is API ", i);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO00o8, null);
                }
            }
        } else {
            arrayList = arrayList3;
            oooOOOO = oooOOOO4;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "ANR feature disabled.", null);
            }
        }
        o0o0o00 = this;
        z2 = z6;
        oooO00o = o0o0o00.f42201OooOO0;
        if (oooO00o.OooO0Oo(str2)) {
            strOooO00o4 = o00O00OO.OooO00o("Finalizing native report for session ", str2);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strOooO00o4, null);
            }
            oooO00o.OooO00o(str2).getClass();
            Log.w("FirebaseCrashlytics", "No minidump data found for session " + str2, null);
            Log.i("FirebaseCrashlytics", "No Tombstones data found for session " + str2, null);
            Log.w("FirebaseCrashlytics", "No native core present", null);
        }
        if (z != 0) {
            z3 = false;
            obj = (String) arrayList.get(0);
        } else {
            z3 = false;
            obj = null;
        }
        jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        oooOo00 = oooOOOO.f42239OooO0O0;
        oooOo00.getClass();
        file = oooOo00.f42241OooO00o;
        OooOo00.OooO00o(new File(file, ".com.google.firebase.crashlytics"));
        OooOo00.OooO00o(new File(file, ".com.google.firebase.crashlytics-ndk"));
        if (Build.VERSION.SDK_INT < 28) {
            z2 = z3;
        }
        if (z2) {
            OooOo00.OooO00o(new File(file, ".com.google.firebase.crashlytics.files.v1"));
        }
        navigableSetDescendingSet = new TreeSet(OooOo00.OooO0o0(oooOOOO.f42239OooO0O0.f42243OooO0OO.list())).descendingSet();
        if (obj != null) {
            navigableSetDescendingSet.remove(obj);
        }
        size = navigableSetDescendingSet.size();
        file2 = oooOo00.f42243OooO0OO;
        if (size > 8) {
            while (navigableSetDescendingSet.size() > 8) {
                String str12 = (String) navigableSetDescendingSet.last();
                strOooO00o3 = o00O00OO.OooO00o("Removing session over cap: ", str12);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", strOooO00o3, null);
                }
                OooOo00.OooO0Oo(new File(file2, str12));
                navigableSetDescendingSet.remove(str12);
            }
        }
        while (r4.hasNext()) {
            strOooO00o = o00O00OO.OooO00o("Finalizing report for session ", str11);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", strOooO00o, null);
            }
            p286o0O0Oo.OooOOO oooOOO3 = OooOOOO.f42237OooO0oo;
            File file6 = new File(file2, str11);
            file6.mkdirs();
            listOooO0o0 = OooOo00.OooO0o0(file6.listFiles(oooOOO3));
            if (!listOooO0o0.isEmpty()) {
                strOooO00o2 = o000oOoO.OooO00o("Session ", str11, " has no events.");
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", strOooO00o2, null);
                }
            } else {
                Collections.sort(listOooO0o0);
                arrayList2 = new ArrayList();
                it2 = listOooO0o0.iterator();
                while (true) {
                    zHasNext = it2.hasNext();
                    oooOOO = OooOOOO.f42234OooO0o;
                    if (zHasNext) {
                        if (!arrayList2.isEmpty()) {
                            Log.w("FirebaseCrashlytics", "Could not parse event files for session " + str11, null);
                            break;
                            break;
                        }
                        String strOooO0OO2 = new o00000O(oooOo00).OooO0OO(str11);
                        fileOooO0O0 = oooOo00.OooO0O0(str11, "report");
                        String strOooO0Oo3 = OooOOOO.OooO0Oo(fileOooO0O0);
                        oooOOO.getClass();
                        oooO0O0OooOO0 = p288o0O0Oo0O.OooOOO.OooO0oo(strOooO0Oo3).OooOO0(jCurrentTimeMillis, strOooO0OO2, z3);
                        oooOO1 = new OooOO0<>(arrayList2);
                        oooO = oooO0O0OooOO0.f19993OooO0oo;
                        if (oooO != null) {
                            throw new IllegalStateException("Reports without sessions cannot have events added to them.");
                        }
                        com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o oooO00o6 = new com.google.firebase.crashlytics.internal.model.OooO0O0.OooO00o(oooO0O0OooOO0);
                        OooOOO0.OooO00o oooO00oOooOO0o2 = oooO.OooOO0o();
                        oooO00oOooOO0o2.f20056OooOO0 = oooOO1;
                        oooO00o6.f20002OooO0oO = oooO00oOooOO0o2.OooO00o();
                        oooO0O0OooO00o = oooO00o6.OooO00o();
                        oooO2 = oooO0O0OooO00o.f19993OooO0oo;
                        if (oooO2 != null) {
                            break;
                            break;
                        }
                        if (z3) {
                            file3 = new File(oooOo00.f42246OooO0o0, oooO2.OooO0oO());
                        } else {
                            file3 = new File(oooOo00.f42244OooO0Oo, oooO2.OooO0oO());
                        }
                        oo00o oo00oVar2 = p288o0O0Oo0O.OooOOO.f42269OooO00o;
                        oo00oVar2.getClass();
                        StringWriter stringWriter2 = new StringWriter();
                        oo00oVar2.OooO00o(stringWriter2, oooO0O0OooO00o);
                        OooOOOO.OooO0o0(file3, stringWriter2.toString());
                        break;
                        break;
                    }
                    file4 = (File) it2.next();
                    String strOooO0Oo4 = OooOOOO.OooO0Oo(file4);
                    oooOOO.getClass();
                    jsonReader = new JsonReader(new StringReader(strOooO0Oo4));
                    OooOo oooOoOooO0o1 = p288o0O0Oo0O.OooOOO.OooO0o0(jsonReader);
                    jsonReader.close();
                    arrayList2.add(oooOoOooO0o1);
                    if (!z3) {
                        name = file4.getName();
                        if (name.startsWith("event")) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            z3 = false;
                        }
                    }
                    z3 = true;
                }
            }
            OooOo00.OooO0Oo(new File(file2, str11));
            z3 = false;
        }
        ((o00000O0) oooOOOO.f42240OooO0OO).OooO0O0().f42285OooO00o.getClass();
        arrayListOooO0O0 = oooOOOO.OooO0O0();
        size2 = arrayListOooO0O0.size();
        if (size2 <= 4) {
            return;
        }
        it = arrayListOooO0O0.subList(4, size2).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final boolean OooO0Oo(o0000Ooo o0000ooo) {
        if (!Boolean.TRUE.equals(this.f42198OooO0o0.f42226OooO0Oo.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        o0000O0O o0000o0o2 = this.f42205OooOOO0;
        if (o0000o0o2 != null && o0000o0o2.f42132OooO0o0.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            OooO0OO(true, o0000ooo);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    @Nullable
    public final String OooO0o0() {
        OooOOOO oooOOOO = this.f42203OooOO0o.f42211OooO0O0;
        oooOOOO.getClass();
        NavigableSet navigableSetDescendingSet = new TreeSet(OooOo00.OooO0o0(oooOOOO.f42239OooO0O0.f42243OooO0OO.list())).descendingSet();
        if (navigableSetDescendingSet.isEmpty()) {
            return null;
        }
        return (String) navigableSetDescendingSet.first();
    }

    public final void OooO0oO() {
        try {
            String strOooO0o = OooO0o();
            if (strOooO0o != null) {
                try {
                    this.f42196OooO0Oo.f46655OooO0o0.OooO00o("com.crashlytics.version-control-info", strOooO0o);
                } catch (IllegalArgumentException e) {
                    Context context = this.f42193OooO00o;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    @SuppressLint({"TaskMainThread"})
    public final Task<Void> OooO0oo(Task<o000000> task) {
        Task<Void> task2;
        Task task3;
        OooOo00 oooOo00 = this.f42203OooOO0o.f42211OooO0O0.f42239OooO0O0;
        boolean z = (OooOo00.OooO0o0(oooOo00.f42244OooO0Oo.listFiles()).isEmpty() && OooOo00.OooO0o0(oooOo00.f42246OooO0o0.listFiles()).isEmpty() && OooOo00.OooO0o0(oooOo00.f42245OooO0o.listFiles()).isEmpty()) ? false : true;
        TaskCompletionSource<Boolean> taskCompletionSource = this.f42204OooOOO;
        if (!z) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        o0O0OOOo.OooO oooO = o0O0OOOo.OooO.f42075OooO00o;
        oooO.OooO0OO("Crash reports are available to be sent.");
        o000OO o000oo2 = this.f42194OooO0O0;
        if (o000oo2.OooO00o()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            oooO.OooO0O0("Automatic data collection is disabled.");
            oooO.OooO0OO("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (o000oo2.f42170OooO0O0) {
                task2 = o000oo2.f42171OooO0OO.getTask();
            }
            Task<TContinuationResult> taskOnSuccessTask = task2.onSuccessTask(new o0Oo0oo());
            oooO.OooO0O0("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.f42206OooOOOO.getTask();
            ExecutorService executorService = o00O00.f42181OooO00o;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            o0O000o0.OooO0OO oooO0OO = new o0O000o0.OooO0OO(taskCompletionSource2);
            taskOnSuccessTask.continueWith(oooO0OO);
            task4.continueWith(oooO0OO);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new OooO00o(task));
    }
}
