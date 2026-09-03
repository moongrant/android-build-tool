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
import androidx.media3.session.o000O00;
import androidx.media3.session.o000O00O;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.Oooo000;
import com.google.firebase.components.o00oO0o;
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
import o0O0OOO0.OooO00o;
import p022Oooo00O.o00O00OO;
import p285o0O0OOo.OooOo;
import p286o0O0OOoO.o00Ooo;
import p286o0O0OOoO.o0ooOOo;
import p289o0O0Oo0.OooOO0;
import p289o0O0Oo0.OooOO0O;
import p289o0O0Oo0.OooOOO0;
import p289o0O0Oo0.o0000;
import p289o0O0Oo0.o00000O0;
import p289o0O0Oo0.o0000Ooo;
import p289o0O0Oo0.o000O0Oo;
import p289o0O0Oo0.o000OO00;
import p289o0O0Oo0.o000OOo;
import p289o0O0Oo0.o0O0O00;
import p292o0O0OoO.o000oOoO;
import p292o0O0OoO.o00O0O;
import p292o0O0OoO.o00Oo0;
import p292o0O0OoO.o0OoOo0;
import p292o0O0OoO.oo000o;
import p293o0O0OoO0.OooOo00;
import p294o0O0OoOo.o00000;
import p294o0O0OoOo.o00000O;
import p298o0O0Oooo.o0000OO0;
import p301o0O0o0O.OooO0OO;
import p302o0O0o0OO.o0000O0O;
import p315o0O0oOo.o000OO;
import p626o0ooO.o0OOO0o;
import p664o0oooOO.oO00OO0O;

/* JADX INFO: loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<OooO0O0<?>> getComponents() {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(OooOo.class);
        OooO00o2.f19327OooO00o = "fire-cls";
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0OOO0o.class));
        OooO00o2.OooO00o(Oooo000.OooO0O0(o0000O0O.class));
        OooO00o2.OooO00o(new Oooo000(0, 2, o00Ooo.class));
        OooO00o2.OooO00o(new Oooo000(0, 2, OooO00o.class));
        OooO00o2.f19331OooO0o = new OooO() { // from class: o0O0OOo.OooOOO
            /* JADX WARN: Code duplicated, block: B:106:0x04bc A[Catch: Exception -> 0x050b, TryCatch #3 {Exception -> 0x050b, blocks: (B:101:0x0447, B:103:0x0491, B:104:0x0496, B:106:0x04bc, B:111:0x04cb, B:113:0x04d9), top: B:156:0x0447 }] */
            /* JADX WARN: Code duplicated, block: B:108:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:109:0x04c8  */
            /* JADX WARN: Code duplicated, block: B:117:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:119:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:123:0x04f0 A[Catch: Exception -> 0x04f8, TryCatch #4 {Exception -> 0x04f8, blocks: (B:121:0x04ea, B:123:0x04f0, B:124:0x04f4), top: B:158:0x04ea }] */
            /* JADX WARN: Code duplicated, block: B:130:0x0503  */
            /* JADX WARN: Code duplicated, block: B:141:0x052f  */
            /* JADX WARN: Code duplicated, block: B:84:0x036b  */
            /* JADX WARN: Code duplicated, block: B:96:0x03e2  */
            @Override // com.google.firebase.components.OooO
            public final Object OooO00o(o00oO0o o00oo0o2) throws Throwable {
                o0O0O00 o0o0o00;
                int i;
                Throwable th;
                ExecutorService executorService;
                Task<Void> task;
                ExecutorService executorService2;
                Task taskOnSuccessTask;
                boolean z;
                p289o0O0Oo0.OooO0O0 oooO0O0;
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
                o0OoOo0 o0oooo0OooO00o;
                this.f41426OooO0Oo.getClass();
                o0OOO0o o0ooo0o2 = (o0OOO0o) o00oo0o2.OooO00o(o0OOO0o.class);
                OooO0OO OooO0oO2 = o00oo0o2.OooO0oO(o00Ooo.class);
                OooO0OO OooO0oO3 = o00oo0o2.OooO0oO(OooO00o.class);
                o0000O0O o0000o0o2 = (o0000O0O) o00oo0o2.OooO00o(o0000O0O.class);
                o0ooo0o2.OooO00o();
                Context context = o0ooo0o2.f57662OooO00o;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.3.7 for " + packageName, null);
                OooOo00 oooOo00 = new OooOo00(context);
                o00000O0 o00000o1 = new o00000O0(o0ooo0o2);
                o0000 o0000Var = new o0000(context, packageName, o0000o0o2, o00000o1);
                p286o0O0OOoO.o00oO0o o00oo0o3 = new p286o0O0OOoO.o00oO0o(OooO0oO2);
                OooOO0O oooOO0O = new OooOO0O(OooO0oO3);
                o0O0O00 o0o0o01 = o0o0o00;
                o0O0O00 o0o0o02 = new o0O0O00(o0ooo0o2, o0000Var, o00oo0o3, o00000o1, new o000O00(oooOO0O), new o000O00O(oooOO0O), oooOo00, o0000Ooo.OooO00o("Crashlytics Exception Handler"));
                o0ooo0o2.OooO00o();
                String str4 = o0ooo0o2.f57664OooO0OO.f57675OooO0O0;
                String strOooO0o0 = OooOO0O.OooO0o0(context);
                ArrayList<p289o0O0Oo0.OooO> arrayList = new ArrayList();
                int iOooO0o = OooOO0O.OooO0o(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iOooO0o2 = OooOO0O.OooO0o(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iOooO0o3 = OooOO0O.OooO0o(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (iOooO0o == 0 || iOooO0o2 == 0 || iOooO0o3 == 0) {
                    o0o0o00 = o0o0o01;
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
                            arrayList.add(new p289o0O0Oo0.OooO(stringArray[i2], stringArray2[i2], stringArray3[i2]));
                            i2++;
                            o0o0o01 = o0o0o01;
                        }
                        o0o0o00 = o0o0o01;
                        th = null;
                        i = 3;
                    } else {
                        o0o0o00 = o0o0o01;
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
                for (p289o0O0Oo0.OooO oooO : arrayList) {
                    Object[] objArr = new Object[i];
                    objArr[0] = oooO.f41452OooO00o;
                    objArr[1] = oooO.f41453OooO0O0;
                    objArr[2] = oooO.f41454OooO0OO;
                    String str7 = String.format("Build id for %s on %s: %s", objArr);
                    if (Log.isLoggable("FirebaseCrashlytics", i)) {
                        Log.d("FirebaseCrashlytics", str7, null);
                    }
                }
                o0ooOOo o0ooooo = new o0ooOOo(context);
                try {
                    String packageName2 = context.getPackageName();
                    String strOooO0Oo = o0000Var.OooO0Oo();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    String string = Integer.toString(packageInfo.versionCode);
                    String str8 = packageInfo.versionName;
                    if (str8 == null) {
                        str8 = "0.0";
                    }
                    String str9 = str8;
                    p289o0O0Oo0.OooO0O0 oooO0O1 = new p289o0O0Oo0.OooO0O0(str4, strOooO0o0, arrayList, strOooO0Oo, packageName2, string, str9, o0ooooo);
                    String strOooO00o2 = o00O00OO.OooO00o("Installer package name is: ", strOooO0Oo);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strOooO00o2, null);
                    }
                    ExecutorService executorServiceOooO00o = o0000Ooo.OooO00o("com.google.firebase.crashlytics.startup");
                    o0000OO0 o0000oo1 = new o0000OO0();
                    String strOooO0Oo2 = o0000Var.OooO0Oo();
                    p289o0O0Oo0.o000O00O o000o00o2 = new p289o0O0Oo0.o000O00O();
                    oo000o oo000oVar = new oo000o(o000o00o2);
                    p292o0O0OoO.Oooo000 oooo000 = new p292o0O0OoO.Oooo000(oooOo00);
                    Locale locale = Locale.US;
                    o000oOoO o000oooo2 = new o000oOoO(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str4), o0000oo1);
                    String str10 = Build.MANUFACTURER;
                    String str11 = o0000.f41482OooO0oo;
                    String str12 = String.format(locale, "%s/%s", str10.replaceAll(str11, ""), Build.MODEL.replaceAll(str11, ""));
                    String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str11, "");
                    String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str11, "");
                    String[] strArr = {OooOO0O.OooO0o0(context), str4, str9, string};
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
                    p292o0O0OoO.o00Ooo o00ooo2 = new p292o0O0OoO.o00Ooo(context, new p292o0O0OoO.o0OOO0o(str4, str12, strReplaceAll, strReplaceAll2, o0000Var, string2.length() > 0 ? OooOO0O.OooOO0O(string2) : null, str9, string, (strOooO0Oo2 != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).OooO00o()), o000o00o2, oo000oVar, oooo000, o000oooo2, o00000o1);
                    o00O0O o00o0o2 = o00O0O.USE_CACHE;
                    boolean z6 = !o00ooo2.f41658OooO00o.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(o00ooo2.f41659OooO0O0.f41671OooO0o);
                    AtomicReference<TaskCompletionSource<o0OoOo0>> atomicReference = o00ooo2.f41657OooO;
                    AtomicReference<o0OoOo0> atomicReference2 = o00ooo2.f41665OooO0oo;
                    if (z6 || (o0oooo0OooO00o = o00ooo2.OooO00o(o00o0o2)) == null) {
                        o0OoOo0 o0oooo0OooO00o2 = o00ooo2.OooO00o(o00O0O.IGNORE_CACHE_EXPIRATION);
                        if (o0oooo0OooO00o2 != null) {
                            atomicReference2.set(o0oooo0OooO00o2);
                            atomicReference.get().trySetResult(o0oooo0OooO00o2);
                        }
                        o00000O0 o00000o2 = o00ooo2.f41664OooO0oO;
                        Task<Void> task2 = o00000o2.f41508OooO0o.getTask();
                        synchronized (o00000o2.f41505OooO0O0) {
                            task = o00000o2.f41506OooO0OO.getTask();
                        }
                        ExecutorService executorService4 = o000OO00.f41525OooO00o;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        o000O0Oo o000o0oo2 = new o000O0Oo(taskCompletionSource);
                        executorService2 = executorService;
                        task2.continueWith(executorService2, o000o0oo2);
                        task.continueWith(executorService2, o000o0oo2);
                        taskOnSuccessTask = taskCompletionSource.getTask().onSuccessTask(executorService2, new o00Oo0(o00ooo2));
                    } else {
                        atomicReference2.set(o0oooo0OooO00o);
                        atomicReference.get().trySetResult(o0oooo0OooO00o);
                        taskOnSuccessTask = Tasks.forResult(null);
                        executorService2 = executorService;
                    }
                    taskOnSuccessTask.continueWith(executorService2, new OooOOOO());
                    o0O0O00 o0o0o03 = o0o0o00;
                    OooOOO0 oooOOO0 = o0o0o03.f41578OooOOO0;
                    OooOo00 oooOo01 = o0o0o03.f41565OooO;
                    Context context2 = o0o0o03.f41566OooO00o;
                    if (context2 == null || (resources = context2.getResources()) == null) {
                        z = true;
                    } else {
                        int iOooO0o4 = OooOO0O.OooO0o(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (iOooO0o4 > 0) {
                            z = resources.getBoolean(iOooO0o4);
                        } else {
                            int iOooO0o5 = OooOO0O.OooO0o(context2, "com.crashlytics.RequireBuildId", "string");
                            if (iOooO0o5 > 0) {
                                z = Boolean.parseBoolean(context2.getString(iOooO0o5));
                            } else {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        oooO0O0 = oooO0O1;
                        str = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(oooO0O0.f41456OooO0O0)) {
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
                        new OooOO0(o0o0o03.f41573OooO0oo);
                        String str14 = OooOO0.f41467OooO0O0;
                        try {
                            o0o0o03.f41570OooO0o = new oO00OO0O("crash_marker", oooOo01);
                            o0o0o03.f41571OooO0o0 = new oO00OO0O("initialization_marker", oooOo01);
                            p290o0O0Oo0O.OooOo oooOo = new p290o0O0Oo0O.OooOo(str14, oooOo01, oooOOO0);
                            p290o0O0Oo0O.OooO oooO2 = new p290o0O0Oo0O.OooO(oooOo01);
                            executorService3 = executorService2;
                            try {
                                str3 = str;
                                try {
                                    o0o0o03.f41572OooO0oO = new p289o0O0Oo0.o00Ooo(o0o0o03.f41566OooO00o, o0o0o03.f41578OooOOO0, o0o0o03.f41573OooO0oo, o0o0o03.f41567OooO0O0, o0o0o03.f41565OooO, o0o0o03.f41570OooO0o, oooO0O0, oooOo, oooO2, p289o0O0Oo0.o000O00.OooO0O0(o0o0o03.f41566OooO00o, o0o0o03.f41573OooO0oo, o0o0o03.f41565OooO, oooO0O0, oooO2, oooOo, new o00000(new o00000O()), o00ooo2, o0o0o03.f41568OooO0OO), o0o0o03.f41577OooOOO, o0o0o03.f41575OooOO0O);
                                    oO00OO0O oo00oo0o = o0o0o03.f41571OooO0o0;
                                    OooOo00 oooOo02 = (OooOo00) oo00oo0o.f59868OooO0O0;
                                    String str15 = (String) oo00oo0o.f59867OooO00o;
                                    oooOo02.getClass();
                                    zExists = new File(oooOo02.f41695OooO0O0, str15).exists();
                                    try {
                                        Boolean.TRUE.equals((Boolean) o000OO00.OooO00o(oooOOO0.OooO00o(new o000OOo(o0o0o03))));
                                    } catch (Exception unused) {
                                    }
                                    p289o0O0Oo0.o00Ooo o00ooo3 = o0o0o03.f41572OooO0oO;
                                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                    o00ooo3.getClass();
                                    o00ooo3.f41549OooO0o0.OooO00o(new p289o0O0Oo0.o0ooOOo(o00ooo3, str14));
                                    p289o0O0Oo0.o00000 o00000Var = new p289o0O0Oo0.o00000(new p289o0O0Oo0.Oooo000(o00ooo3), o00ooo2, defaultUncaughtExceptionHandler, o00ooo3.f41552OooOO0);
                                    o00ooo3.f41556OooOOO0 = o00000Var;
                                    Thread.setDefaultUncaughtExceptionHandler(o00000Var);
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
                                                o0o0o03.OooO0O0(o00ooo2);
                                            } catch (Exception e) {
                                                e = e;
                                                Log.e(str2, "Crashlytics was not started due to an exception during initialization", e);
                                                o0o0o03.f41572OooO0oO = null;
                                            }
                                            z3 = false;
                                        }
                                        Tasks.call(executorService3, new OooOo00(z3, o0o0o03, o00ooo2));
                                        return new OooOo(o0o0o03);
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
                                o0o0o03.f41572OooO0oO = null;
                                z3 = false;
                                Tasks.call(executorService3, new OooOo00(z3, o0o0o03, o00ooo2));
                                return new OooOo(o0o0o03);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            executorService3 = executorService2;
                        }
                        Tasks.call(executorService3, new OooOo00(z3, o0o0o03, o00ooo2));
                        return new OooOo(o0o0o03);
                    }
                    str = "FirebaseCrashlytics";
                    if (Log.isLoggable(str, 2)) {
                        Log.v(str, "Configured not to require a build ID.", null);
                    }
                    oooO0O0 = oooO0O1;
                    z2 = true;
                    if (z2) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                    }
                    new OooOO0(o0o0o03.f41573OooO0oo);
                    String str16 = OooOO0.f41467OooO0O0;
                    o0o0o03.f41570OooO0o = new oO00OO0O("crash_marker", oooOo01);
                    o0o0o03.f41571OooO0o0 = new oO00OO0O("initialization_marker", oooOo01);
                    p290o0O0Oo0O.OooOo oooOo2 = new p290o0O0Oo0O.OooOo(str16, oooOo01, oooOOO0);
                    p290o0O0Oo0O.OooO oooO3 = new p290o0O0Oo0O.OooO(oooOo01);
                    executorService3 = executorService2;
                    str3 = str;
                    o0o0o03.f41572OooO0oO = new p289o0O0Oo0.o00Ooo(o0o0o03.f41566OooO00o, o0o0o03.f41578OooOOO0, o0o0o03.f41573OooO0oo, o0o0o03.f41567OooO0O0, o0o0o03.f41565OooO, o0o0o03.f41570OooO0o, oooO0O0, oooOo2, oooO3, p289o0O0Oo0.o000O00.OooO0O0(o0o0o03.f41566OooO00o, o0o0o03.f41573OooO0oo, o0o0o03.f41565OooO, oooO0O0, oooO3, oooOo2, new o00000(new o00000O()), o00ooo2, o0o0o03.f41568OooO0OO), o0o0o03.f41577OooOOO, o0o0o03.f41575OooOO0O);
                    oO00OO0O oo00oo0o2 = o0o0o03.f41571OooO0o0;
                    OooOo00 oooOo03 = (OooOo00) oo00oo0o2.f59868OooO0O0;
                    String str17 = (String) oo00oo0o2.f59867OooO00o;
                    oooOo03.getClass();
                    zExists = new File(oooOo03.f41695OooO0O0, str17).exists();
                    Boolean.TRUE.equals((Boolean) o000OO00.OooO00o(oooOOO0.OooO00o(new o000OOo(o0o0o03))));
                    p289o0O0Oo0.o00Ooo o00ooo4 = o0o0o03.f41572OooO0oO;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    o00ooo4.getClass();
                    o00ooo4.f41549OooO0o0.OooO00o(new p289o0O0Oo0.o0ooOOo(o00ooo4, str16));
                    p289o0O0Oo0.o00000 o00000Var2 = new p289o0O0Oo0.o00000(new p289o0O0Oo0.Oooo000(o00ooo4), o00ooo2, defaultUncaughtExceptionHandler2, o00ooo4.f41552OooOO0);
                    o00ooo4.f41556OooOOO0 = o00000Var2;
                    Thread.setDefaultUncaughtExceptionHandler(o00000Var2);
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
                            o0o0o03.OooO0O0(o00ooo2);
                            z3 = false;
                        }
                        Tasks.call(executorService3, new OooOo00(z3, o0o0o03, o00ooo2));
                        return new OooOo(o0o0o03);
                    }
                    if (Log.isLoggable(str3, 3)) {
                        Log.d(str3, "Successfully configured exception handler.", null);
                    }
                    z3 = true;
                    Tasks.call(executorService3, new OooOo00(z3, o0o0o03, o00ooo2));
                    return new OooOo(o0o0o03);
                } catch (PackageManager.NameNotFoundException e5) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e5);
                    return null;
                }
            }
        };
        OooO00o2.OooO0OO(2);
        return Arrays.asList(OooO00o2.OooO0O0(), o000OO.OooO00o("fire-cls", "18.3.7"));
    }
}
