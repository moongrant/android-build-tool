package p361o0OOOoOo;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.OooO0o;
import com.google.firebase.crashlytics.internal.model.OooOo;
import com.google.firebase.crashlytics.internal.model.OooOo00;
import com.google.firebase.crashlytics.internal.model.oo000o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import o0O0O0Oo.OooO0O0;
import o0OOo00.OooO00o;
import o0OOo00.OooO0OO;
import o0OOo00.OooO0OO.OooO0O0;
import o0OOo000.OooO;
import o0OOo000.OooOO0;
import p228o00oOo.o0000OO0;
import p286o0O0O0oO.o000000;
import p286o0O0O0oO.oo0o0Oo;
import p362o0OOOoo.o00oO0o;
import p363o0OOOoo0.OooOOOO;
import p363o0OOOoo0.o000oOoO;
import p364o0OOOooO.o000O0;
import p366o0OOo00O.OooOO0O;
import p367o0OOo00o.o0OoOo0;
import p466o0OooO0.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000OO f38460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f38461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO00o f38462OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOOO f38463OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000oOoO f38464OooO0o0;

    public o000O000(o00000OO o00000oo2, OooO oooO, OooO00o oooO00o, OooOOOO oooOOOO, o000oOoO o000oooo2) {
        this.f38460OooO00o = o00000oo2;
        this.f38461OooO0O0 = oooO;
        this.f38462OooO0OO = oooO00o;
        this.f38463OooO0Oo = oooOOOO;
        this.f38464OooO0o0 = o000oooo2;
    }

    public static o000O000 OooO0O0(Context context, o000OO o000oo2, OooOO0 oooOO1, OooOOOO oooOOOO, OooOOOO oooOOOO2, o000oOoO o000oooo2, o0OoOo0 o0oooo1, p366o0OOo00O.OooOOOO oooOOOO3, o0000OO0 o0000oo1) {
        o00000OO o00000oo2 = new o00000OO(context, o000oo2, oooOOOO, o0oooo1);
        OooO oooO = new OooO(oooOO1, oooOOOO3);
        o000O0 o000o0 = OooO00o.f38584OooO0O0;
        o000000.OooO0O0(context);
        return new o000O000(o00000oo2, oooO, new OooO00o(new OooO0OO(((oo0o0Oo) o000000.OooO00o().OooO0OO(new o0O0O0o0.OooO00o(OooO00o.f38585OooO0OO, OooO00o.f38586OooO0Oo))).OooO00o("FIREBASE_CRASHLYTICS_REPORT", new OooO0O0("json"), OooO00o.f38587OooO0o0), ((OooOO0O) oooOOOO3).OooO0O0(), o0000oo1)), oooOOOO2, o000oooo2);
    }

    @NonNull
    public static List<CrashlyticsReport.OooO0OO> OooO0OO(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Objects.requireNonNull(key, "Null key");
            String value = entry.getValue();
            Objects.requireNonNull(value, "Null value");
            arrayList.add(new OooO0o(key, value));
        }
        Collections.sort(arrayList, new Comparator() { // from class: o0OOOoOo.o000
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((CrashlyticsReport.OooO0OO) obj).OooO00o().compareTo(((CrashlyticsReport.OooO0OO) obj2).OooO00o());
            }
        });
        return arrayList;
    }

    public final CrashlyticsReport.OooO.OooO0o OooO00o(CrashlyticsReport.OooO.OooO0o oooO0o, OooOOOO oooOOOO, o000oOoO o000oooo2) {
        OooOo00 oooOo00 = (OooOo00) oooO0o;
        OooOo00.OooO00o oooO00o = new OooOo00.OooO00o(oooOo00);
        String strOooO0O0 = oooOOOO.f38549OooO0O0.OooO0O0();
        if (strOooO0O0 != null) {
            oooO00o.f19019OooO0o0 = new oo000o(strOooO0O0);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        List<CrashlyticsReport.OooO0OO> listOooO0OO = OooO0OO(o000oooo2.f38572OooO00o.OooO00o());
        List<CrashlyticsReport.OooO0OO> listOooO0OO2 = OooO0OO(o000oooo2.f38573OooO0O0.OooO00o());
        if (!((ArrayList) listOooO0OO).isEmpty() || !((ArrayList) listOooO0OO2).isEmpty()) {
            OooOo.OooO0O0 oooO0O0 = (OooOo.OooO0O0) oooOo00.f19012OooO0OO.OooO0o();
            oooO0O0.f19006OooO0O0 = new o00oO0o<>(listOooO0OO);
            oooO0O0.f19007OooO0OO = new o00oO0o<>(listOooO0OO2);
            oooO00o.f19017OooO0OO = oooO0O0.OooO00o();
        }
        return oooO00o.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Runnable>] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<java.lang.Runnable>] */
    public final Task<Void> OooO0Oo(@NonNull Executor executor, @Nullable String str) {
        TaskCompletionSource<o0000Ooo> taskCompletionSource;
        List<File> listOooO0O0 = this.f38461OooO0O0.OooO0O0();
        ArrayList<o0000Ooo> arrayList = new ArrayList();
        for (File file : (ArrayList) listOooO0O0) {
            try {
                arrayList.add(new OooOo00(OooO.f38605OooO0o.OooO0oO(OooO.OooO0o0(file)), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (o0000Ooo o0000ooo : arrayList) {
            if (str == null || str.equals(o0000ooo.OooO0OO())) {
                OooO00o oooO00o = this.f38462OooO0OO;
                boolean z = str != null;
                OooO0OO oooO0OO = oooO00o.f38588OooO00o;
                synchronized (oooO0OO.f38597OooO0o0) {
                    taskCompletionSource = new TaskCompletionSource<>();
                    if (z) {
                        oooO0OO.f38599OooO0oo.f38455OooO00o.getAndIncrement();
                        if (oooO0OO.f38597OooO0o0.size() < oooO0OO.f38595OooO0Oo) {
                            o0000OO0 o0000oo1 = o0000OO0.f33887OooO00o;
                            o0000oo1.OooO0Oo("Enqueueing report: " + o0000ooo.OooO0OO());
                            o0000oo1.OooO0Oo("Queue size: " + oooO0OO.f38597OooO0o0.size());
                            oooO0OO.f38596OooO0o.execute(oooO0OO.new OooO0O0(o0000ooo, taskCompletionSource, null));
                            o0000oo1.OooO0Oo("Closing task for report: " + o0000ooo.OooO0OO());
                            taskCompletionSource.trySetResult(o0000ooo);
                        } else {
                            oooO0OO.OooO00o();
                            String str2 = "Dropping report due to queue being full: " + o0000ooo.OooO0OO();
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            oooO0OO.f38599OooO0oo.f38456OooO0O0.getAndIncrement();
                            taskCompletionSource.trySetResult(o0000ooo);
                        }
                    } else {
                        oooO0OO.OooO0O0(o0000ooo, taskCompletionSource);
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new o0000Ooo(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
