package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.oo000o;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o0O0OOO.OooOO0;
import o0O0OOOo.OooO00o;
import o0O0o0.OooO;
import p022Oooo00O.o00O00OO;
import p203o00o0o0o.o000OO00;
import p203o00o0o0o.o000OOo0;
import p285o0O0OOoo.OooOOOO;
import p285o0O0OOoo.Oooo0;
import p285o0O0OOoo.Oooo000;
import p285o0O0OOoo.o000;
import p285o0O0OOoo.o0000O00;
import p285o0O0OOoo.o0000O0O;
import p285o0O0OOoo.o0000Ooo;
import p285o0O0OOoo.o000O000;
import p285o0O0OOoo.o000OO;
import p285o0O0OOoo.o000oOoO;
import p285o0O0OOoo.o00O00;
import p285o0O0OOoo.o00oO0o;
import p285o0O0OOoo.o00oOoo;
import p285o0O0OOoo.o0O0O00;
import p285o0O0OOoo.o0O0ooO;
import p285o0O0OOoo.o0OoOo0;
import p286o0O0Oo.OooOo00;
import p291o0O0OoO0.o0000;
import p291o0O0OoO0.o00000;
import p291o0O0OoO0.o000000;
import p291o0O0OoO0.o000000O;
import p291o0O0OoO0.o00000O;
import p291o0O0OoO0.o00000O0;
import p291o0O0OoO0.o000OOo;
import p291o0O0OoO0.oo0o0Oo;
import p314o0O0oOo0.o000O0Oo;
import p461o0OooO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(OooOO0.class);
        OooO00o2.f19801OooO00o = "fire-cls";
        OooO00o2.OooO00o(OooOo.OooO0O0(p281o0O0O0oO.OooOO0.class));
        OooO00o2.OooO00o(OooOo.OooO0O0(OooO.class));
        OooO00o2.OooO00o(new OooOo(0, 2, OooO00o.class));
        OooO00o2.OooO00o(new OooOo(0, 2, o0O0OO0O.OooO00o.class));
        OooO00o2.f19805OooO0o = new com.google.firebase.components.OooO() { // from class: o0O0OOO.OooO0OO
            /* JADX WARN: Code duplicated, block: B:106:0x04b8 A[Catch: Exception -> 0x0507, TryCatch #4 {Exception -> 0x0507, blocks: (B:101:0x0447, B:103:0x048d, B:104:0x0492, B:106:0x04b8, B:111:0x04c7, B:113:0x04d5), top: B:158:0x0447 }] */
            /* JADX WARN: Code duplicated, block: B:108:0x04c2  */
            /* JADX WARN: Code duplicated, block: B:109:0x04c4  */
            /* JADX WARN: Code duplicated, block: B:117:0x04de  */
            /* JADX WARN: Code duplicated, block: B:119:0x04e1  */
            /* JADX WARN: Code duplicated, block: B:123:0x04ec A[Catch: Exception -> 0x04f4, TryCatch #5 {Exception -> 0x04f4, blocks: (B:121:0x04e6, B:123:0x04ec, B:124:0x04f0), top: B:160:0x04e6 }] */
            /* JADX WARN: Code duplicated, block: B:130:0x04ff  */
            /* JADX WARN: Code duplicated, block: B:141:0x052b  */
            /* JADX WARN: Code duplicated, block: B:84:0x036b  */
            /* JADX WARN: Code duplicated, block: B:96:0x03e2  */
            @Override // com.google.firebase.components.OooO
            public final Object OooO0OO(oo000o oo000oVar) throws Throwable {
                o0000Ooo o0000ooo;
                int i;
                Throwable th;
                ExecutorService executorService;
                Task<Void> task;
                ExecutorService executorService2;
                Task taskOnSuccessTask;
                boolean z;
                OooOOOO oooOOOO;
                String str;
                boolean z2;
                ExecutorService executorService3;
                String str2;
                boolean z3;
                String str3;
                boolean zExists;
                boolean z4;
                boolean z5;
                NetworkInfo activeNetworkInfo;
                Resources resources;
                o000000 o000000VarOooO00o;
                this.f42016OooO0Oo.getClass();
                p281o0O0O0oO.OooOO0 oooOO1 = (p281o0O0O0oO.OooOO0) oo000oVar.OooO00o(p281o0O0O0oO.OooOO0.class);
                p298o0O0o00o.OooO0O0 oooO0O0OooO0oO = oo000oVar.OooO0oO(o0O0OOOo.OooO00o.class);
                p298o0O0o00o.OooO0O0 oooO0O0OooO0oO2 = oo000oVar.OooO0oO(o0O0OO0O.OooO00o.class);
                o0O0o0.OooO oooO = (o0O0o0.OooO) oo000oVar.OooO00o(o0O0o0.OooO.class);
                oooOO1.OooO00o();
                Context context = oooOO1.f41949OooO00o;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.3.7 for " + packageName, null);
                OooOo00 oooOo00 = new OooOo00(context);
                o000OO o000oo2 = new o000OO(oooOO1);
                o000O000 o000o001 = new o000O000(context, packageName, oooO, o000oo2);
                o0O0OOOo.OooO0OO oooO0OO = new o0O0OOOo.OooO0OO(oooO0O0OooO0oO);
                OooO00o oooO00o = new OooO00o(oooO0O0OooO0oO2);
                o0000Ooo o0000ooo2 = o0000ooo;
                o0000Ooo o0000ooo3 = new o0000Ooo(oooOO1, o000o001, oooO0OO, o000oo2, new o000OO00(oooO00o), new o000OOo0(oooO00o), oooOo00, o000.OooO00o("Crashlytics Exception Handler"));
                oooOO1.OooO00o();
                String str4 = oooOO1.f41951OooO0OO.f41961OooO0O0;
                String strOooO0o0 = o000oOoO.OooO0o0(context);
                ArrayList<Oooo000> arrayList = new ArrayList();
                int iOooO0o = o000oOoO.OooO0o(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iOooO0o2 = o000oOoO.OooO0o(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iOooO0o3 = o000oOoO.OooO0o(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iOooO0o == 0 || iOooO0o2 == 0 || iOooO0o3 == 0) {
                    o0000ooo = o0000ooo2;
                    String str5 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iOooO0o), Integer.valueOf(iOooO0o2), Integer.valueOf(iOooO0o3));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str5, null);
                        i = 3;
                        th = null;
                    } else {
                        i = 3;
                        th = null;
                    }
                } else {
                    String[] stringArray = context.getResources().getStringArray(iOooO0o);
                    String[] stringArray2 = context.getResources().getStringArray(iOooO0o2);
                    String[] stringArray3 = context.getResources().getStringArray(iOooO0o3);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i2 = 0;
                        while (i2 < stringArray3.length) {
                            arrayList.add(new Oooo000(stringArray[i2], stringArray2[i2], stringArray3[i2]));
                            i2++;
                            o0000ooo2 = o0000ooo2;
                        }
                        o0000ooo = o0000ooo2;
                        th = null;
                        i = 3;
                    } else {
                        o0000ooo = o0000ooo2;
                        String str6 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        i = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", str6, null);
                        }
                        th = null;
                    }
                }
                String strOooO00o = o00O00OO.OooO00o("Mapping file ID is: ", strOooO0o0);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                    Log.d("FirebaseCrashlytics", strOooO00o, th);
                }
                for (Oooo000 oooo000 : arrayList) {
                    Object[] objArr = new Object[i];
                    objArr[0] = oooo000.f42106OooO00o;
                    objArr[1] = oooo000.f42107OooO0O0;
                    objArr[2] = oooo000.f42108OooO0OO;
                    String str7 = String.format("Build id for %s on %s: %s", objArr);
                    if (Log.isLoggable("FirebaseCrashlytics", i)) {
                        Log.d("FirebaseCrashlytics", str7, null);
                    }
                }
                o0O0OOOo.OooO0o oooO0o = new o0O0OOOo.OooO0o(context);
                try {
                    String packageName2 = context.getPackageName();
                    String strOooO0Oo = o000o001.OooO0Oo();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    String string = Integer.toString(packageInfo.versionCode);
                    String str8 = packageInfo.versionName;
                    if (str8 == null) {
                        str8 = "0.0";
                    }
                    String str9 = str8;
                    OooOOOO oooOOOO2 = new OooOOOO(str4, strOooO0o0, arrayList, strOooO0Oo, packageName2, string, str9, oooO0o);
                    String strOooO00o2 = o00O00OO.OooO00o("Installer package name is: ", strOooO0Oo);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strOooO00o2, null);
                    }
                    ExecutorService executorServiceOooO00o = o000.OooO00o("com.google.firebase.crashlytics.startup");
                    p289o0O0Oo0o.OooOo00 oooOo01 = new p289o0O0Oo0o.OooOo00();
                    String strOooO0Oo2 = o000o001.OooO0Oo();
                    com.google.firebase.perf.util.OooO00o oooO00o2 = new com.google.firebase.perf.util.OooO00o();
                    o00000O o00000o = new o00000O(oooO00o2);
                    oo0o0Oo oo0o0oo = new oo0o0Oo(oooOo00);
                    Locale locale = Locale.US;
                    o000OOo o000ooo2 = new o000OOo(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str4), oooOo01);
                    String str10 = Build.MANUFACTURER;
                    String str11 = o000O000.f42162OooO0oo;
                    String str12 = String.format(locale, "%s/%s", str10.replaceAll(str11, ""), Build.MODEL.replaceAll(str11, ""));
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str11, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str11, "");
                    String[] strArr = {o000oOoO.OooO0o0(context), str4, str9, string};
                    ArrayList arrayList2 = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        executorService = executorServiceOooO00o;
                        if (i3 >= 4) {
                            break;
                        }
                        String str13 = strArr[i3];
                        String[] strArr2 = strArr;
                        if (str13 != null) {
                            arrayList2.add(str13.replace("-", "").toLowerCase(Locale.US));
                        }
                        i3++;
                        strArr = strArr2;
                        executorServiceOooO00o = executorService;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    String string2 = sb.toString();
                    o00000O0 o00000o1 = new o00000O0(context, new o0000(str4, str12, strReplaceAll, strReplaceAll2, o000o001, string2.length() > 0 ? o000oOoO.OooOO0O(string2) : null, str9, string, (strOooO0Oo2 != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).OooO00o()), oooO00o2, o00000o, oo0o0oo, o000ooo2, o000oo2);
                    o000000O o000000o2 = o000000O.USE_CACHE;
                    boolean z6 = !o00000o1.f42297OooO00o.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(o00000o1.f42298OooO0O0.f42280OooO0o);
                    AtomicReference<TaskCompletionSource<o000000>> atomicReference = o00000o1.f42296OooO;
                    AtomicReference<o000000> atomicReference2 = o00000o1.f42304OooO0oo;
                    if (z6 || (o000000VarOooO00o = o00000o1.OooO00o(o000000o2)) == null) {
                        o000000 o000000VarOooO00o2 = o00000o1.OooO00o(o000000O.IGNORE_CACHE_EXPIRATION);
                        if (o000000VarOooO00o2 != null) {
                            atomicReference2.set(o000000VarOooO00o2);
                            atomicReference.get().trySetResult(o000000VarOooO00o2);
                        }
                        o000OO o000oo3 = o00000o1.f42303OooO0oO;
                        Task<Void> task2 = o000oo3.f42173OooO0o.getTask();
                        synchronized (o000oo3.f42170OooO0O0) {
                            task = o000oo3.f42171OooO0OO.getTask();
                        }
                        ExecutorService executorService4 = o00O00.f42181OooO00o;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        o00oOoo o00oooo2 = new o00oOoo(taskCompletionSource);
                        executorService2 = executorService;
                        task2.continueWith(executorService2, o00oooo2);
                        task.continueWith(executorService2, o00oooo2);
                        taskOnSuccessTask = taskCompletionSource.getTask().onSuccessTask(executorService2, new o00000(o00000o1));
                    } else {
                        atomicReference2.set(o000000VarOooO00o);
                        atomicReference.get().trySetResult(o000000VarOooO00o);
                        taskOnSuccessTask = Tasks.forResult(null);
                        executorService2 = executorService;
                    }
                    taskOnSuccessTask.continueWith(executorService2, new OooO0o());
                    o0000Ooo o0000ooo4 = o0000ooo;
                    o0OoOo0 o0oooo0 = o0000ooo4.f42150OooOOO0;
                    OooOo00 oooOo02 = o0000ooo4.f42137OooO;
                    Context context2 = o0000ooo4.f42138OooO00o;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z = true;
                    } else {
                        int iOooO0o4 = o000oOoO.OooO0o(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iOooO0o4 > 0) {
                            z = resources.getBoolean(iOooO0o4);
                        } else {
                            int iOooO0o5 = o000oOoO.OooO0o(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iOooO0o5 > 0) {
                                z = Boolean.parseBoolean(context2.getString(iOooO0o5));
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        oooOOOO = oooOOOO2;
                        str = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(oooOOOO.f42094OooO0O0)) {
                            Log.e(str, ".");
                            Log.e(str, ".     |  | ");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".   \\ |  | /");
                            Log.e(str, ".    \\    /");
                            Log.e(str, ".     \\  /");
                            Log.e(str, ".      \\/");
                            Log.e(str, ".");
                            Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str, ".");
                            Log.e(str, ".      /\\");
                            Log.e(str, ".     /  \\");
                            Log.e(str, ".    /    \\");
                            Log.e(str, ".   / |  | \\");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".");
                            z2 = false;
                        }
                        if (z2) {
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                        new Oooo0(o0000ooo4.f42145OooO0oo);
                        String str14 = Oooo0.f42105OooO0O0;
                        try {
                            o0000ooo4.f42142OooO0o = new o0000O00(oooOo02, "crash_marker");
                            o0000ooo4.f42143OooO0o0 = new o0000O00(oooOo02, "initialization_marker");
                            o0000oo o0000ooVar = new o0000oo(str14, oooOo02, o0oooo0);
                            p461o0OooO0.o00000 o00000Var = new p461o0OooO0.o00000(oooOo02);
                            executorService3 = executorService2;
                            try {
                                str3 = str;
                                try {
                                    o0000ooo4.f42144OooO0oO = new o0O0O00(o0000ooo4.f42138OooO00o, o0000ooo4.f42150OooOOO0, o0000ooo4.f42145OooO0oo, o0000ooo4.f42139OooO0O0, o0000ooo4.f42137OooO, o0000ooo4.f42142OooO0o, oooOOOO, o0000ooVar, o00000Var, o0O0ooO.OooO0O0(o0000ooo4.f42138OooO00o, o0000ooo4.f42145OooO0oo, o0000ooo4.f42137OooO, oooOOOO, o00000Var, o0000ooVar, new oo0OOoo.OooO00o(new oo0OOoo.OooO0OO()), o00000o1, o0000ooo4.f42140OooO0OO), o0000ooo4.f42149OooOOO, o0000ooo4.f42147OooOO0O);
                                    o0000O00 o0000o00 = o0000ooo4.f42143OooO0o0;
                                    OooOo00 oooOo03 = o0000o00.f42127OooO0O0;
                                    oooOo03.getClass();
                                    zExists = new File(oooOo03.f42242OooO0O0, o0000o00.f42126OooO00o).exists();
                                    try {
                                        Boolean.TRUE.equals((Boolean) o00O00.OooO00o(o0oooo0.OooO00o(new p285o0O0OOoo.o0000(o0000ooo4))));
                                    } catch (Exception unused) {
                                    }
                                    o0O0O00 o0o0o00 = o0000ooo4.f42144OooO0oO;
                                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                    o0o0o00.getClass();
                                    o0o0o00.f42198OooO0o0.OooO00o(new p285o0O0OOoo.o000000O(o0o0o00, str14));
                                    o0000O0O o0000o0o2 = new o0000O0O(new o00oO0o(o0o0o00), o00000o1, defaultUncaughtExceptionHandler, o0o0o00.f42201OooOO0);
                                    o0o0o00.f42205OooOOO0 = o0000o0o2;
                                    Thread.setDefaultUncaughtExceptionHandler(o0000o0o2);
                                    if (zExists) {
                                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (z4 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z5) {
                                            str2 = str3;
                                            try {
                                                if (Log.isLoggable(str2, 3)) {
                                                    Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                                }
                                                o0000ooo4.OooO0O0(o00000o1);
                                            } catch (Exception e) {
                                                e = e;
                                                Log.e(str2, "Crashlytics was not started due to an exception during initialization", e);
                                                o0000ooo4.f42144OooO0oO = null;
                                            }
                                            z3 = false;
                                        }
                                        Tasks.call(executorService3, new OooO(z3, o0000ooo4, o00000o1));
                                        return new OooOO0(o0000ooo4);
                                    }
                                    if (Log.isLoggable(str3, 3)) {
                                        Log.d(str3, "Successfully configured exception handler.", null);
                                    }
                                    z3 = true;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = str3;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                str2 = str;
                                Log.e(str2, "Crashlytics was not started due to an exception during initialization", e);
                                o0000ooo4.f42144OooO0oO = null;
                                z3 = false;
                                Tasks.call(executorService3, new OooO(z3, o0000ooo4, o00000o1));
                                return new OooOO0(o0000ooo4);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            executorService3 = executorService2;
                        }
                        Tasks.call(executorService3, new OooO(z3, o0000ooo4, o00000o1));
                        return new OooOO0(o0000ooo4);
                    }
                    str = "FirebaseCrashlytics";
                    if (Log.isLoggable(str, 2)) {
                        Log.v(str, "Configured not to require a build ID.", null);
                    }
                    oooOOOO = oooOOOO2;
                    z2 = true;
                    if (z2) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                    new Oooo0(o0000ooo4.f42145OooO0oo);
                    String str15 = Oooo0.f42105OooO0O0;
                    o0000ooo4.f42142OooO0o = new o0000O00(oooOo02, "crash_marker");
                    o0000ooo4.f42143OooO0o0 = new o0000O00(oooOo02, "initialization_marker");
                    o0000oo o0000ooVar2 = new o0000oo(str15, oooOo02, o0oooo0);
                    p461o0OooO0.o00000 o00000Var2 = new p461o0OooO0.o00000(oooOo02);
                    executorService3 = executorService2;
                    str3 = str;
                    o0000ooo4.f42144OooO0oO = new o0O0O00(o0000ooo4.f42138OooO00o, o0000ooo4.f42150OooOOO0, o0000ooo4.f42145OooO0oo, o0000ooo4.f42139OooO0O0, o0000ooo4.f42137OooO, o0000ooo4.f42142OooO0o, oooOOOO, o0000ooVar2, o00000Var2, o0O0ooO.OooO0O0(o0000ooo4.f42138OooO00o, o0000ooo4.f42145OooO0oo, o0000ooo4.f42137OooO, oooOOOO, o00000Var2, o0000ooVar2, new oo0OOoo.OooO00o(new oo0OOoo.OooO0OO()), o00000o1, o0000ooo4.f42140OooO0OO), o0000ooo4.f42149OooOOO, o0000ooo4.f42147OooOO0O);
                    o0000O00 o0000o01 = o0000ooo4.f42143OooO0o0;
                    OooOo00 oooOo04 = o0000o01.f42127OooO0O0;
                    oooOo04.getClass();
                    zExists = new File(oooOo04.f42242OooO0O0, o0000o01.f42126OooO00o).exists();
                    Boolean.TRUE.equals((Boolean) o00O00.OooO00o(o0oooo0.OooO00o(new p285o0O0OOoo.o0000(o0000ooo4))));
                    o0O0O00 o0o0o01 = o0000ooo4.f42144OooO0oO;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    o0o0o01.getClass();
                    o0o0o01.f42198OooO0o0.OooO00o(new p285o0O0OOoo.o000000O(o0o0o01, str15));
                    o0000O0O o0000o0o3 = new o0000O0O(new o00oO0o(o0o0o01), o00000o1, defaultUncaughtExceptionHandler2, o0o0o01.f42201OooOO0);
                    o0o0o01.f42205OooOOO0 = o0000o0o3;
                    Thread.setDefaultUncaughtExceptionHandler(o0000o0o3);
                    if (zExists) {
                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (z5) {
                            str2 = str3;
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            o0000ooo4.OooO0O0(o00000o1);
                            z3 = false;
                        }
                        Tasks.call(executorService3, new OooO(z3, o0000ooo4, o00000o1));
                        return new OooOO0(o0000ooo4);
                    }
                    if (Log.isLoggable(str3, 3)) {
                        Log.d(str3, "Successfully configured exception handler.", null);
                    }
                    z3 = true;
                    Tasks.call(executorService3, new OooO(z3, o0000ooo4, o00000o1));
                    return new OooOO0(o0000ooo4);
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e5);
                    return null;
                }
            }
        };
        OooO00o2.OooO0OO(2);
        return Arrays.asList(OooO00o2.OooO0O0(), o000O0Oo.OooO00o("fire-cls", "18.3.7"));
    }
}
