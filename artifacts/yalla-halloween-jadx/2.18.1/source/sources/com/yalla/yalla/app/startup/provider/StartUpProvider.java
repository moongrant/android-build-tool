package com.yalla.yalla.app.startup.provider;

import OooO00o.OooO00o;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o0O0o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p252o00ooO0.o000000O;
import p483o0o000O0.OooO;
import p483o0o000O0.OooOO0;
import p483o0o000O0.OooOO0O;
import p483o0o000O0.OooOOO;
import p483o0o000O0.OooOOO0;
import p483o0o000O0.OooOOOO;
import p483o0o000O0.OooOo;
import p483o0o000O0.OooOo00;
import p483o0o000O0.Oooo0;
import p483o0o000O0.Oooo000;
import p483o0o000O0.o000oOoO;
import p483o0o000O0.o00O0O;
import p483o0o000O0.o00Oo0;
import p483o0o000O0.o00Ooo;
import p483o0o000O0.o00oO0o;
import p483o0o000O0.o0OOO0o;
import p483o0o000O0.o0Oo0oo;
import p483o0o000O0.o0OoOo0;
import p483o0o000O0.o0ooOOo;
import p483o0o000O0.oo000o;
import p516o0o0O000.o000000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/app/startup/provider/StartUpProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StartUpProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x041a  */
    /* JADX WARN: Code duplicated, block: B:102:0x041d A[Catch: all -> 0x056a, LOOP:4: B:86:0x03cd->B:102:0x041d, LOOP_END, TryCatch #2 {, blocks: (B:76:0x037e, B:78:0x03a1, B:80:0x03ad, B:82:0x03b3, B:85:0x03c2, B:86:0x03cd, B:88:0x03d3, B:102:0x041d, B:103:0x0437, B:104:0x0465, B:92:0x03e4, B:94:0x03ef, B:106:0x0471), top: B:135:0x037e }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0437 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0418  */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        String string;
        String str;
        ArrayList<o000000O> arrayListOooO00o;
        ArrayList<Class<? extends o000000O>> arrayList;
        int i;
        boolean z;
        if (getContext() == null) {
            return false;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        if (!o000000.OooO00o(context)) {
            return false;
        }
        OooO0O0 oooO0O0 = OooO0O0.f36054OooO00o;
        Context context2 = getContext();
        Intrinsics.checkNotNull(context2);
        Context applicationContext = context2.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) applicationContext;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(application, "application");
        String packageName = application.getPackageName();
        String str2 = "";
        Intrinsics.checkNotNullParameter(application, "application");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cmdline")));
            String line = bufferedReader.readLine();
            Intrinsics.checkNotNullExpressionValue(line, "mBufferedReader.readLine()");
            int length = line.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.compare((int) line.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            string = line.subSequence(i2, length + 1).toString();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            try {
                Object systemService = application.getSystemService("activity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
                    int iMyPid = Process.myPid();
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            string = "";
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == iMyPid && (str = next.processName) != null) {
                            Intrinsics.checkNotNullExpressionValue(str, "aInfo.processName");
                            string = str;
                            break;
                        }
                    }
                } else {
                    string = "";
                    break;
                }
                if (TextUtils.isEmpty(string)) {
                    try {
                        Field field = application.getClass().getField("mLoadedApk");
                        field.setAccessible(true);
                        Object obj = field.get(application);
                        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        Object objInvoke = obj2.getClass().getDeclaredMethod("getProcessName", new Class[0]).invoke(obj2, new Object[0]);
                        if (objInvoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        str2 = (String) objInvoke;
                        string = str2;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Exception unused) {
            }
        }
        OooO0O0.f36057OooO0Oo = Intrinsics.areEqual(packageName, string);
        OooO0O0.f36059OooO0o0 = false;
        OooO0O0.f36058OooO0o.clear();
        OooO0O0.f36060OooO0oO.clear();
        OooO0O0.f36061OooO0oo.clear();
        AtomicInteger atomicInteger = OooO0O0.f36062OooOO0;
        atomicInteger.set(0);
        OooO0O0.f36063OooOO0O.clear();
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3);
        oooO0O0.OooO00o(new OooOO0(context3));
        Context context4 = getContext();
        Intrinsics.checkNotNull(context4);
        oooO0O0.OooO00o(new OooOOO0(context4));
        Context context5 = getContext();
        Intrinsics.checkNotNull(context5);
        oooO0O0.OooO00o(new OooOo(context5));
        oooO0O0.OooO00o(new o00O0O());
        Context context6 = getContext();
        Intrinsics.checkNotNull(context6);
        oooO0O0.OooO00o(new o0OOO0o(context6));
        Context context7 = getContext();
        Intrinsics.checkNotNull(context7);
        oooO0O0.OooO00o(new Oooo000(context7));
        Context context8 = getContext();
        Intrinsics.checkNotNull(context8);
        oooO0O0.OooO00o(new o0ooOOo(context8));
        oooO0O0.OooO00o(new OooOOO());
        oooO0O0.OooO00o(new o000oOoO());
        oooO0O0.OooO00o(new OooOO0O());
        Context context9 = getContext();
        Intrinsics.checkNotNull(context9);
        oooO0O0.OooO00o(new o00Ooo(context9));
        Context context10 = getContext();
        Intrinsics.checkNotNull(context10);
        oooO0O0.OooO00o(new o00Oo0(context10));
        Context context11 = getContext();
        Intrinsics.checkNotNull(context11);
        oooO0O0.OooO00o(new Oooo0(context11));
        Context context12 = getContext();
        Intrinsics.checkNotNull(context12);
        oooO0O0.OooO00o(new o0Oo0oo(context12));
        oooO0O0.OooO00o(new oo000o());
        oooO0O0.OooO00o(new o00oO0o());
        oooO0O0.OooO00o(new o0OoOo0());
        Context context13 = getContext();
        Intrinsics.checkNotNull(context13);
        oooO0O0.OooO00o(new OooOOOO(context13));
        Context context14 = getContext();
        Intrinsics.checkNotNull(context14);
        oooO0O0.OooO00o(new OooOOOO(context14));
        oooO0O0.OooO00o(new OooOo00());
        Context context15 = getContext();
        Intrinsics.checkNotNull(context15);
        oooO0O0.OooO00o(new OooO(context15));
        Context context16 = getContext();
        Intrinsics.checkNotNull(context16);
        oooO0O0.OooO00o(new p482o0o000O.OooOo(context16));
        oooO0O0.OooO00o(new p482o0o000O.OooOOO());
        Context context17 = getContext();
        Intrinsics.checkNotNull(context17);
        oooO0O0.OooO00o(new p482o0o000O.o000oOoO(context17));
        Context context18 = getContext();
        Intrinsics.checkNotNull(context18);
        oooO0O0.OooO00o(new p482o0o000O.OooOo00(context18));
        Context context19 = getContext();
        Intrinsics.checkNotNull(context19);
        oooO0O0.OooO00o(new p482o0o000O.Oooo0(context19));
        Context context20 = getContext();
        Intrinsics.checkNotNull(context20);
        oooO0O0.OooO00o(new p482o0o000O.o0OoOo0(context20));
        oooO0O0.OooO00o(new p482o0o000O.Oooo000());
        Context context21 = getContext();
        Intrinsics.checkNotNull(context21);
        oooO0O0.OooO00o(new p482o0o000O.OooOOOO(context21));
        OooO0O0.f36056OooO0OO = System.currentTimeMillis();
        if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new RuntimeException("must be called from UiThread");
        }
        if (OooO0O0.f36058OooO0o.size() <= 0) {
            return true;
        }
        Log.i(OooO0O0.f36055OooO0O0, Intrinsics.stringPlus("needWait size : ", Integer.valueOf(atomicInteger.get())));
        if (OooO0O0.f36059OooO0o0) {
            for (Class<? extends o000000O> cls : OooO0O0.f36065OooOOO0.keySet()) {
                String str3 = OooO0O0.f36055OooO0O0;
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("cls ");
                sbOooO0o0.append((Object) cls.getSimpleName());
                sbOooO0o0.append("   ");
                HashMap<Class<? extends o000000O>, ArrayList<o000000O>> map = OooO0O0.f36065OooOOO0;
                ArrayList<o000000O> arrayList2 = map.get(cls);
                Intrinsics.checkNotNull(arrayList2);
                sbOooO0o0.append(arrayList2.size());
                Log.i(str3, sbOooO0o0.toString());
                ArrayList<o000000O> arrayList3 = map.get(cls);
                Intrinsics.checkNotNull(arrayList3);
                Iterator<o000000O> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Log.i(OooO0O0.f36055OooO0O0, Intrinsics.stringPlus("cls       ", it2.next().getClass().getSimpleName()));
                }
            }
        }
        p240o00oo.OooOO0O oooOO0O = p240o00oo.OooOO0O.f34115OooO00o;
        ArrayList<o000000O> originTasks = OooO0O0.f36058OooO0o;
        ArrayList<Class<? extends o000000O>> clsLaunchTasks = OooO0O0.f36060OooO0oO;
        synchronized (oooOO0O) {
            Intrinsics.checkNotNullParameter(originTasks, "originTasks");
            Intrinsics.checkNotNullParameter(clsLaunchTasks, "clsLaunchTasks");
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet();
            p240o00oo.OooOO0 oooOO1 = new p240o00oo.OooOO0(originTasks.size());
            int size = originTasks.size();
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3 + 1;
                o000000O o000000o2 = originTasks.get(i3);
                if (!o000000o2.f34227OooO00o && o000000o2.OooO00o() != null) {
                    List<Class<? extends o000000O>> listOooO00o = o000000o2.OooO00o();
                    Intrinsics.checkNotNull(listOooO00o);
                    if (!listOooO00o.isEmpty()) {
                        List<Class<? extends o000000O>> listOooO00o2 = o000000o2.OooO00o();
                        Intrinsics.checkNotNull(listOooO00o2);
                        for (Class<? extends o000000O> cls2 : listOooO00o2) {
                            int iIndexOf = CollectionsKt.indexOf((List<? extends Class<? extends o000000O>>) clsLaunchTasks, cls2);
                            if (iIndexOf >= 0) {
                                arrayList = clsLaunchTasks;
                            } else {
                                int size2 = originTasks.size();
                                arrayList = clsLaunchTasks;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        int i6 = i5 + 1;
                                        Intrinsics.checkNotNull(cls2);
                                        i = size;
                                        int i7 = i5;
                                        if (Intrinsics.areEqual(cls2.getSimpleName(), originTasks.get(i5).getClass().getSimpleName())) {
                                            iIndexOf = i7;
                                            break;
                                        }
                                        i5 = i6;
                                        size = i;
                                    }
                                }
                                if (iIndexOf >= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    throw new IllegalStateException((o000000o2.getClass().getSimpleName() + " depends on " + ((Object) cls2.getSimpleName()) + " can not be found in task list ").toString());
                                }
                                hashSet.add(Integer.valueOf(iIndexOf));
                                List<Integer> list = oooOO1.f34114OooO0O0[iIndexOf];
                                Intrinsics.checkNotNull(list);
                                list.add(Integer.valueOf(i3));
                                clsLaunchTasks = arrayList;
                                size = i;
                            }
                            i = size;
                            if (iIndexOf >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                throw new IllegalStateException((o000000o2.getClass().getSimpleName() + " depends on " + ((Object) cls2.getSimpleName()) + " can not be found in task list ").toString());
                            }
                            hashSet.add(Integer.valueOf(iIndexOf));
                            List<Integer> list2 = oooOO1.f34114OooO0O0[iIndexOf];
                            Intrinsics.checkNotNull(list2);
                            list2.add(Integer.valueOf(i3));
                            clsLaunchTasks = arrayList;
                            size = i;
                        }
                    }
                }
                i3 = i4;
                clsLaunchTasks = clsLaunchTasks;
                size = size;
            }
            arrayListOooO00o = oooOO0O.OooO00o(originTasks, hashSet, oooOO1.OooO00o());
            Log.i("TaskSortUtil", Intrinsics.stringPlus("task analyse cost makeTime ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        }
        OooO0O0.f36058OooO0o = arrayListOooO00o;
        OooO0O0.f36053OooO = new CountDownLatch(OooO0O0.f36062OooOO0.get());
        for (o000000O task : OooO0O0.f36058OooO0o) {
            Objects.requireNonNull(task);
            if (OooO0O0.f36057OooO0Oo) {
                Intrinsics.checkNotNullExpressionValue(task, "task");
                if (task.OooO0Oo()) {
                    OooO0O0.f36061OooO0oo.add(task);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0O0o.OooO00o(task, oooO0O0, null), 2, null);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(task, "task");
                oooO0O0.OooO0O0(task);
            }
            task.f34227OooO00o = true;
        }
        String str4 = OooO0O0.f36055OooO0O0;
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("task analyse cost ");
        sbOooO0o1.append(System.currentTimeMillis() - OooO0O0.f36056OooO0OO);
        sbOooO0o1.append("  begin main ");
        Log.i(str4, sbOooO0o1.toString());
        OooO0O0.f36056OooO0OO = System.currentTimeMillis();
        for (o000000O task2 : OooO0O0.f36061OooO0oo) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue(task2, "task");
            new p252o00ooO0.o000000(task2, oooO0O0).run();
            String str5 = OooO0O0.f36055OooO0O0;
            StringBuilder sbOooO0o2 = OooO00o.OooO0o0("real main ");
            sbOooO0o2.append((Object) task2.getClass().getSimpleName());
            sbOooO0o2.append(" cost   ");
            sbOooO0o2.append(System.currentTimeMillis() - jCurrentTimeMillis2);
            Log.i(str5, sbOooO0o2.toString());
        }
        Log.i(OooO0O0.f36055OooO0O0, Intrinsics.stringPlus("maintask cost ", Long.valueOf(System.currentTimeMillis() - OooO0O0.f36056OooO0OO)));
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }
}
