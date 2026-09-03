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
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p177o00Ooooo.oOo0000O;
import p351o0OOOOo.OooOOO;
import p354o0OOOo.OooOO0;
import p354o0OOOo.OooOOO0;
import p356o0OOOo00.OooO0O0;
import p357o0OOOo0O.o00000;
import p357o0OOOo0O.o0000O0;
import p357o0OOOo0O.o00oO0o;
import p357o0OOOo0O.o0OOO0o;
import p357o0OOOo0O.oo000o;
import p358o0OOOo0o.o000O0o;
import p361o0OOOoOo.OooOOOO;
import p361o0OOOoOo.Oooo0;
import p361o0OOOoOo.Oooo000;
import p361o0OOOoOo.o0000;
import p361o0OOOoOo.o00000O0;
import p361o0OOOoOo.o0000O00;
import p361o0OOOoOo.o0000O0O;
import p361o0OOOoOo.o000O000;
import p361o0OOOoOo.o000OO;
import p361o0OOOoOo.o000Oo0;
import p361o0OOOoOo.o00Ooo;
import p361o0OOOoOo.o0O0O00;
import p361o0OOOoOo.o0OO00O;
import p363o0OOOoo0.o000oOoO;
import p366o0OOo00O.OooO;
import p366o0OOo00O.OooO0o;
import p366o0OOo00O.OooOO0O;
import p366o0OOo00O.OooOo00;
import p375o0OOo0oo.o0ooOOo;
import p382o0OOoOo.o000000O;
import p466o0OooO0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<oo000o<?>> getComponents() {
        oo000o.OooO0O0 oooO0O0OooO00o = oo000o.OooO00o(o000O0o.class);
        oooO0O0OooO00o.OooO00o(new o00000(OooOOO.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new o00000(p377o0OOoO00.OooOOO.class, 1, 0));
        oooO0O0OooO00o.OooO00o(new o00000(OooOO0.class, 0, 2));
        oooO0O0OooO00o.OooO00o(new o00000(OooO0O0.class, 0, 2));
        oooO0O0OooO00o.f38378OooO0o0 = new o0OOO0o() { // from class: o0OOOo0o.o0000OO0
            /* JADX WARN: Code duplicated, block: B:51:0x028e  */
            /* JADX WARN: Code duplicated, block: B:62:0x0301  */
            /* JADX WARN: Code duplicated, block: B:68:0x03c5 A[Catch: Exception -> 0x040e, TryCatch #0 {Exception -> 0x040e, blocks: (B:63:0x030a, B:65:0x039d, B:66:0x03a2, B:68:0x03c5, B:73:0x03d4, B:75:0x03e2, B:81:0x03ee, B:83:0x03f7, B:84:0x03fb), top: B:103:0x030a }] */
            /* JADX WARN: Code duplicated, block: B:70:0x03cf  */
            /* JADX WARN: Code duplicated, block: B:71:0x03d1  */
            /* JADX WARN: Code duplicated, block: B:79:0x03eb  */
            /* JADX WARN: Code duplicated, block: B:81:0x03ee A[Catch: Exception -> 0x040e, TryCatch #0 {Exception -> 0x040e, blocks: (B:63:0x030a, B:65:0x039d, B:66:0x03a2, B:68:0x03c5, B:73:0x03d4, B:75:0x03e2, B:81:0x03ee, B:83:0x03f7, B:84:0x03fb), top: B:103:0x030a }] */
            /* JADX WARN: Code duplicated, block: B:83:0x03f7 A[Catch: Exception -> 0x040e, TryCatch #0 {Exception -> 0x040e, blocks: (B:63:0x030a, B:65:0x039d, B:66:0x03a2, B:68:0x03c5, B:73:0x03d4, B:75:0x03e2, B:81:0x03ee, B:83:0x03f7, B:84:0x03fb), top: B:103:0x030a }] */
            /* JADX WARN: Code duplicated, block: B:88:0x0406  */
            /* JADX WARN: Code duplicated, block: B:94:0x0426  */
            @Override // p357o0OOOo0O.o0OOO0o
            public final Object OooO00o(o00oO0o o00oo0o2) throws Throwable {
                Task<Void> task;
                Task taskOnSuccessTask;
                boolean z;
                boolean z2;
                boolean z3;
                boolean zExists;
                Context context;
                boolean z4;
                boolean z5;
                NetworkInfo activeNetworkInfo;
                Resources resources;
                OooO oooOOooO00o;
                Objects.requireNonNull(this.f38384OooO00o);
                o0000O0 o0000o1 = (o0000O0) o00oo0o2;
                OooOOO oooOOO = (OooOOO) o0000o1.OooO00o(OooOOO.class);
                o0ooOOo o0oooooOooO0o0 = o0000o1.OooO0o0(OooOO0.class);
                o0ooOOo o0oooooOooO0o1 = o0000o1.OooO0o0(OooO0O0.class);
                p377o0OOoO00.OooOOO oooOOO2 = (p377o0OOoO00.OooOOO) o0000o1.OooO00o(p377o0OOoO00.OooOOO.class);
                oooOOO.OooO00o();
                Context context2 = oooOOO.f38263OooO00o;
                String packageName = context2.getPackageName();
                p228o00oOo.o0000OO0 o0000oo1 = p228o00oOo.o0000OO0.f33887OooO00o;
                String str = "Initializing Firebase Crashlytics 18.2.13 for " + packageName;
                if (o0000oo1.OooO0OO(4)) {
                    Log.i("FirebaseCrashlytics", str, null);
                }
                o0OOo000.OooOO0 oooOO1 = new o0OOo000.OooOO0(context2);
                o0000O00 o0000o00 = new o0000O00(oooOOO);
                o000OO o000oo2 = new o000OO(context2, packageName, oooOOO2, o0000o00);
                OooOOO0 oooOOO0 = new OooOOO0(o0oooooOooO0o0);
                o000OO o000oo3 = new o000OO(o0oooooOooO0o1);
                p361o0OOOoOo.o00000 o00000Var = new p361o0OOOoOo.o00000(oooOOO, o000oo2, oooOOO0, o0000o00, new oOo0000O(o000oo3), new o0000O0O(o000oo3), oooOO1, o0000O0O.OooO00o("Crashlytics Exception Handler"));
                oooOOO.OooO00o();
                String str2 = oooOOO.f38265OooO0OO.f38283OooO0O0;
                String strOooO0o0 = Oooo0.OooO0o0(context2);
                o0000oo1.OooO0Oo("Mapping file ID is: " + strOooO0o0);
                p354o0OOOo.OooOOO oooOOO3 = new p354o0OOOo.OooOOO(context2);
                try {
                    String packageName2 = context2.getPackageName();
                    String strOooO0Oo = o000oo2.OooO0Oo();
                    PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(packageName2, 0);
                    String string = Integer.toString(packageInfo.versionCode);
                    String str3 = packageInfo.versionName;
                    if (str3 == null) {
                        str3 = "0.0";
                    }
                    String str4 = str3;
                    OooOOOO oooOOOO = new OooOOOO(str2, strOooO0o0, strOooO0Oo, packageName2, string, str4, oooOOO3);
                    o0000oo1.OooOO0o("Installer package name is: " + strOooO0Oo);
                    ExecutorService executorServiceOooO00o = o0000O0O.OooO00o("com.google.firebase.crashlytics.startup");
                    p335o0OO00oo.OooOOO oooOOO4 = new p335o0OO00oo.OooOOO();
                    String strOooO0Oo2 = o000oo2.OooO0Oo();
                    p139o00OOOo0.o0ooOOo o0ooooo2 = new p139o00OOOo0.o0ooOOo();
                    p366o0OOo00O.OooOOO0 oooOOO1 = new p366o0OOo00O.OooOOO0(o0ooooo2);
                    p366o0OOo00O.OooO0O0 oooO0O0 = new p366o0OOo00O.OooO0O0(oooOO1);
                    Locale locale = Locale.US;
                    OooO0o oooO0o = new OooO0o(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str2), oooOOO4);
                    String str5 = String.format(locale, "%s/%s", o000oo2.OooO0o0(Build.MANUFACTURER), o000oo2.OooO0o0(Build.MODEL));
                    String strOooO0o1 = o000oo2.OooO0o0(Build.VERSION.INCREMENTAL);
                    String strOooO0o2 = o000oo2.OooO0o0(Build.VERSION.RELEASE);
                    String[] strArr = {Oooo0.OooO0o0(context2), str2, str4, string};
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    for (int i2 = 4; i < i2; i2 = 4) {
                        String str6 = strArr[i];
                        if (str6 != null) {
                            arrayList.add(str6.replace("-", "").toLowerCase(Locale.US));
                        }
                        i++;
                    }
                    Collections.sort(arrayList);
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                    String string2 = sb.toString();
                    OooOO0O oooOO0O = new OooOO0O(context2, new OooOo00(str2, str5, strOooO0o1, strOooO0o2, o000oo2, string2.length() > 0 ? Oooo0.OooOO0o(string2) : null, str4, string, (strOooO0Oo2 != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).OooO00o()), o0ooooo2, oooOOO1, oooO0O0, oooO0o, o0000o00);
                    if ((!Oooo0.OooO0oO(oooOO0O.f38636OooO00o).getString("existing_instance_identifier", "").equals(oooOO0O.f38637OooO0O0.f38650OooO0o)) || (oooOOooO00o = oooOO0O.OooO00o(1)) == null) {
                        OooO oooOOooO00o2 = oooOO0O.OooO00o(3);
                        if (oooOOooO00o2 != null) {
                            oooOO0O.f38643OooO0oo.set(oooOOooO00o2);
                            oooOO0O.f38635OooO.get().trySetResult(oooOOooO00o2);
                        }
                        o0000O00 o0000o01 = oooOO0O.f38642OooO0oO;
                        Task<Void> task2 = o0000o01.f38453OooO0o.getTask();
                        synchronized (o0000o01.f38450OooO0O0) {
                            task = o0000o01.f38451OooO0OO.getTask();
                        }
                        ExecutorService executorService = o000Oo0.f38478OooO00o;
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        o00000O o00000o = new o00000O(taskCompletionSource);
                        task2.continueWith(executorServiceOooO00o, o00000o);
                        task.continueWith(executorServiceOooO00o, o00000o);
                        taskOnSuccessTask = taskCompletionSource.getTask().onSuccessTask(executorServiceOooO00o, new p366o0OOo00O.OooOO0(oooOO0O));
                    } else {
                        oooOO0O.f38643OooO0oo.set(oooOOooO00o);
                        oooOO0O.f38635OooO.get().trySetResult(oooOOooO00o);
                        taskOnSuccessTask = Tasks.forResult(null);
                    }
                    taskOnSuccessTask.continueWith(executorServiceOooO00o, new o000());
                    Context context3 = o00000Var.f38417OooO00o;
                    if (context3 == null || (resources = context3.getResources()) == null) {
                        z = true;
                    } else {
                        int iOooO0o = Oooo0.OooO0o(context3, "com.crashlytics.RequireBuildId", "bool");
                        if (iOooO0o > 0) {
                            z = resources.getBoolean(iOooO0o);
                        } else {
                            int iOooO0o2 = Oooo0.OooO0o(context3, "com.crashlytics.RequireBuildId", "string");
                            if (iOooO0o2 > 0) {
                                z = Boolean.parseBoolean(context3.getString(iOooO0o2));
                            } else {
                                z = true;
                            }
                        }
                    }
                    String str7 = r39.f38397OooO0O0;
                    if (z) {
                        if (TextUtils.isEmpty(str7)) {
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".     |  | ");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                            Log.e("FirebaseCrashlytics", ".    \\    /");
                            Log.e("FirebaseCrashlytics", ".     \\  /");
                            Log.e("FirebaseCrashlytics", ".      \\/");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                            Log.e("FirebaseCrashlytics", ".");
                            Log.e("FirebaseCrashlytics", ".      /\\");
                            Log.e("FirebaseCrashlytics", ".     /  \\");
                            Log.e("FirebaseCrashlytics", ".    /    \\");
                            Log.e("FirebaseCrashlytics", ".   / |  | \\");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".     |  |");
                            Log.e("FirebaseCrashlytics", ".");
                            z2 = false;
                        }
                        if (z2) {
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                        }
                        new Oooo000(o00000Var.f38424OooO0oo);
                        String str8 = Oooo000.f38409OooO0O0;
                        try {
                            o0OOo000.OooOO0 oooOO2 = o00000Var.f38416OooO;
                            o00000Var.f38421OooO0o = new p361o0OOOoOo.o00000O("crash_marker", oooOO2);
                            o00000Var.f38422OooO0o0 = new p361o0OOOoOo.o00000O("initialization_marker", oooOO2);
                            o000oOoO o000oooo2 = new o000oOoO();
                            p363o0OOOoo0.OooOOOO oooOOOO2 = new p363o0OOOoo0.OooOOOO(o00000Var.f38416OooO);
                            o00000Var.f38423OooO0oO = new o0OO00O(o00000Var.f38417OooO00o, o00000Var.f38429OooOOO0, o00000Var.f38424OooO0oo, o00000Var.f38418OooO0O0, o00000Var.f38416OooO, o00000Var.f38421OooO0o, oooOOOO, oooOOOO2, o000O000.OooO0O0(o00000Var.f38417OooO00o, o00000Var.f38424OooO0oo, o00000Var.f38416OooO, r39, oooOOOO2, o000oooo2, new p367o0OOo00o.Oooo000(new p367o0OOo00o.o000oOoO()), oooOO0O, o00000Var.f38419OooO0OO), o00000Var.f38428OooOOO, o00000Var.f38426OooOO0O);
                            zExists = o00000Var.f38422OooO0o0.OooO0O0().exists();
                            try {
                                Boolean.TRUE.equals((Boolean) o000Oo0.OooO00o(o00000Var.f38429OooOOO0.OooO0O0(new o00000O0(o00000Var))));
                            } catch (Exception unused) {
                            }
                            o0OO00O o0oo00o2 = o00000Var.f38423OooO0oO;
                            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                            o0oo00o2.f38498OooO0Oo.OooO0O0(new o0O0O00(o0oo00o2, str8));
                            o0000 o0000Var = new o0000(new o00Ooo(o0oo00o2), oooOO0O, defaultUncaughtExceptionHandler, o0oo00o2.f38494OooO);
                            o0oo00o2.f38505OooOO0o = o0000Var;
                            Thread.setDefaultUncaughtExceptionHandler(o0000Var);
                            if (zExists) {
                                context = o00000Var.f38417OooO00o;
                                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4 || ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting())) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                    }
                                    o00000Var.OooO0O0(oooOO0O);
                                    z3 = false;
                                }
                                Tasks.call(executorServiceOooO00o, new o000O000(z3, o00000Var, oooOO0O));
                                return new o000O0o();
                            }
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            z3 = true;
                        } catch (Exception e) {
                            Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                            o00000Var.f38423OooO0oO = null;
                        }
                        Tasks.call(executorServiceOooO00o, new o000O000(z3, o00000Var, oooOO0O));
                        return new o000O0o();
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                    }
                    z2 = true;
                    if (z2) {
                        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                    }
                    new Oooo000(o00000Var.f38424OooO0oo);
                    String str9 = Oooo000.f38409OooO0O0;
                    o0OOo000.OooOO0 oooOO3 = o00000Var.f38416OooO;
                    o00000Var.f38421OooO0o = new p361o0OOOoOo.o00000O("crash_marker", oooOO3);
                    o00000Var.f38422OooO0o0 = new p361o0OOOoOo.o00000O("initialization_marker", oooOO3);
                    o000oOoO o000oooo3 = new o000oOoO();
                    p363o0OOOoo0.OooOOOO oooOOOO3 = new p363o0OOOoo0.OooOOOO(o00000Var.f38416OooO);
                    o00000Var.f38423OooO0oO = new o0OO00O(o00000Var.f38417OooO00o, o00000Var.f38429OooOOO0, o00000Var.f38424OooO0oo, o00000Var.f38418OooO0O0, o00000Var.f38416OooO, o00000Var.f38421OooO0o, oooOOOO, oooOOOO3, o000O000.OooO0O0(o00000Var.f38417OooO00o, o00000Var.f38424OooO0oo, o00000Var.f38416OooO, r39, oooOOOO3, o000oooo3, new p367o0OOo00o.Oooo000(new p367o0OOo00o.o000oOoO()), oooOO0O, o00000Var.f38419OooO0OO), o00000Var.f38428OooOOO, o00000Var.f38426OooOO0O);
                    zExists = o00000Var.f38422OooO0o0.OooO0O0().exists();
                    Boolean.TRUE.equals((Boolean) o000Oo0.OooO00o(o00000Var.f38429OooOOO0.OooO0O0(new o00000O0(o00000Var))));
                    o0OO00O o0oo00o3 = o00000Var.f38423OooO0oO;
                    Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                    o0oo00o3.f38498OooO0Oo.OooO0O0(new o0O0O00(o0oo00o3, str9));
                    o0000 o0000Var2 = new o0000(new o00Ooo(o0oo00o3), oooOO0O, defaultUncaughtExceptionHandler2, o0oo00o3.f38494OooO);
                    o0oo00o3.f38505OooOO0o = o0000Var2;
                    Thread.setDefaultUncaughtExceptionHandler(o0000Var2);
                    if (zExists) {
                        context = o00000Var.f38417OooO00o;
                        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
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
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            o00000Var.OooO0O0(oooOO0O);
                            z3 = false;
                        }
                        Tasks.call(executorServiceOooO00o, new o000O000(z3, o00000Var, oooOO0O));
                        return new o000O0o();
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                    }
                    z3 = true;
                    Tasks.call(executorServiceOooO00o, new o000O000(z3, o00000Var, oooOO0O));
                    return new o000O0o();
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e2);
                    return null;
                }
            }
        };
        oooO0O0OooO00o.OooO0OO();
        return Arrays.asList(oooO0O0OooO00o.OooO0O0(), o000000O.OooO00o("fire-cls", "18.2.13"));
    }
}
