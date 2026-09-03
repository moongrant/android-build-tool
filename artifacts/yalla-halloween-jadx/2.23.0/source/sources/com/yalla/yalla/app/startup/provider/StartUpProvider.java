package com.yalla.yalla.app.startup.provider;

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
import com.common.support.apollo.Apollo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import o00Oo00.OooO00o;
import o00Oo00.OooO0O0;
import o0O0OOO.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0O.Oooo000;
import p145o00Oo0O.o000oOoO;
import p382o0OOoo0o.o00Ooo;
import p387o0OOooo.o00O00;
import p387o0OOooo.o00O000;
import p387o0OOooo.o00O000o;
import p387o0OOooo.o00O00O;
import p387o0OOooo.o00oOoo;
import p387o0OOooo.o0O0ooO;
import p388o0OOooo0.o000;
import p388o0OOooo0.o0000;
import p388o0OOooo0.o00000;
import p388o0OOooo0.o000000;
import p388o0OOooo0.o000000O;
import p388o0OOooo0.o00000O;
import p388o0OOooo0.o00000O0;
import p388o0OOooo0.o00000OO;
import p388o0OOooo0.o0000O;
import p388o0OOooo0.o0000O0;
import p388o0OOooo0.o0000O00;
import p388o0OOooo0.o0000O0O;
import p388o0OOooo0.o0000OO0;
import p388o0OOooo0.o0000Ooo;
import p388o0OOooo0.o0000oo;
import p388o0OOooo0.o000O000;
import p388o0OOooo0.o000OO;
import p388o0OOooo0.o000OOo;
import p388o0OOooo0.o0O0O00;
import p388o0OOooo0.o0OO00O;
import p388o0OOooo0.o0OOO0o;
import p388o0OOooo0.o0Oo0oo;
import p388o0OOooo0.o0ooOOo;
import p388o0OOooo0.oo0o0Oo;
import p392o0Oo00o.OooOO0O;
import p579o0oOoo.o0oo0000;
import p579o0oOoo.oOO0OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/app/startup/provider/StartUpProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
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

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z;
        String string;
        String str;
        ArrayList<o000oOoO> arrayListOooO00o;
        ArrayList<Class<? extends o000oOoO>> arrayList;
        ArrayList<Class<? extends o000oOoO>> arrayList2;
        if (getContext() == null) {
            return false;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        if (!oOO0OO0O.OooO00o(context) || !o0oo0000.OooO00o()) {
            return false;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNull(context2);
        Intrinsics.checkNotNullParameter(context2, "context");
        try {
            Apollo.INSTANCE.init(context2, o00Ooo.OooO0o() ? "ic_yalla.png" : "ic_yalla_t.png");
            z = true;
        } catch (Throwable th) {
            OooOO0.OooO00o().OooO0O0(th);
            z = false;
        }
        if (!z) {
            o0oo0000.f56520OooO00o = false;
            return false;
        }
        OooO0O0 oooO0O0 = OooO0O0.f37645OooO00o;
        Context context3 = getContext();
        Intrinsics.checkNotNull(context3);
        Context applicationContext = context3.getApplicationContext();
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
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = Intrinsics.compare((int) line.charAt(!z2 ? i : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            string = line.subSequence(i, length + 1).toString();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            string = "";
        }
        if (TextUtils.isEmpty(string)) {
            try {
                Object systemService = application.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
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
                        string = "";
                        break;
                    }
                }
                string = "";
                break;
            } catch (Exception unused) {
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
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.String");
                    str2 = (String) objInvoke;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                string = str2;
            }
        }
        OooO0O0.f37648OooO0Oo = Intrinsics.areEqual(packageName, string);
        OooO0O0.f37650OooO0o0 = false;
        OooO0O0.f37649OooO0o.clear();
        OooO0O0.f37651OooO0oO.clear();
        OooO0O0.f37652OooO0oo.clear();
        OooO0O0.f37653OooOO0.set(0);
        OooO0O0.f37654OooOO0O.clear();
        Context context4 = getContext();
        Intrinsics.checkNotNull(context4);
        oooO0O0.OooO00o(new o0000OO0(context4));
        Context context5 = getContext();
        Intrinsics.checkNotNull(context5);
        oooO0O0.OooO00o(new o0OOO0o(context5));
        Context context6 = getContext();
        Intrinsics.checkNotNull(context6);
        oooO0O0.OooO00o(new OooOO0O(context6));
        Context context7 = getContext();
        Intrinsics.checkNotNull(context7);
        oooO0O0.OooO00o(new o0000O(context7));
        Context context8 = getContext();
        Intrinsics.checkNotNull(context8);
        oooO0O0.OooO00o(new oo0o0Oo(context8));
        Context context9 = getContext();
        Intrinsics.checkNotNull(context9);
        oooO0O0.OooO00o(new o00000O0(context9));
        oooO0O0.OooO00o(new o0000O00());
        Context context10 = getContext();
        Intrinsics.checkNotNull(context10);
        oooO0O0.OooO00o(new o000(context10));
        Context context11 = getContext();
        Intrinsics.checkNotNull(context11);
        oooO0O0.OooO00o(new o00000O(context11));
        Context context12 = getContext();
        Intrinsics.checkNotNull(context12);
        o0O0O00 o0o0o00 = new o0O0O00(context12);
        o0o0o00.OooO00o(o0Oo0oo.class);
        oooO0O0.OooO00o(o0o0o00);
        oooO0O0.OooO00o(new o0000Ooo());
        oooO0O0.OooO00o(new o0Oo0oo());
        Context context13 = getContext();
        Intrinsics.checkNotNull(context13);
        oooO0O0.OooO00o(new o0000O0(context13));
        Context context14 = getContext();
        Intrinsics.checkNotNull(context14);
        o0000oo o0000ooVar = new o0000oo(context14);
        o0000ooVar.OooO00o(o0OOO0o.class);
        oooO0O0.OooO00o(o0000ooVar);
        Context context15 = getContext();
        Intrinsics.checkNotNull(context15);
        oooO0O0.OooO00o(new o00000OO(context15));
        Context context16 = getContext();
        Intrinsics.checkNotNull(context16);
        oooO0O0.OooO00o(new o000O000(context16));
        o0000O0O o0000o0o2 = new o0000O0O();
        o0000o0o2.OooO00o(o0OOO0o.class);
        oooO0O0.OooO00o(o0000o0o2);
        o000OO o000oo2 = new o000OO();
        o000oo2.OooO00o(o0OOO0o.class);
        oooO0O0.OooO00o(o000oo2);
        oooO0O0.OooO00o(new o0000());
        Context context17 = getContext();
        Intrinsics.checkNotNull(context17);
        oooO0O0.OooO00o(new o000OOo(context17));
        Context context18 = getContext();
        Intrinsics.checkNotNull(context18);
        oooO0O0.OooO00o(new o00000(context18));
        Context context19 = getContext();
        Intrinsics.checkNotNull(context19);
        o000000O o000000o2 = new o000000O(context19);
        o000000o2.OooO00o(o00000.class);
        oooO0O0.OooO00o(o000000o2);
        oooO0O0.OooO00o(new o000000());
        Context context20 = getContext();
        Intrinsics.checkNotNull(context20);
        oooO0O0.OooO00o(new o0OO00O(context20));
        Context context21 = getContext();
        Intrinsics.checkNotNull(context21);
        o0ooOOo o0ooooo = new o0ooOOo(context21);
        o0ooooo.OooO00o(o0000oo.class);
        oooO0O0.OooO00o(o0ooooo);
        Context context22 = getContext();
        Intrinsics.checkNotNull(context22);
        o00O000o o00o000o2 = new o00O000o(context22);
        o00o000o2.OooO00o(o0OOO0o.class);
        oooO0O0.OooO00o(o00o000o2);
        oooO0O0.OooO00o(new o0O0ooO());
        Context context23 = getContext();
        Intrinsics.checkNotNull(context23);
        oooO0O0.OooO00o(new o00O00O(context23));
        Context context24 = getContext();
        Intrinsics.checkNotNull(context24);
        oooO0O0.OooO00o(new o00O000(context24));
        oooO0O0.OooO00o(new o00O00());
        Context context25 = getContext();
        Intrinsics.checkNotNull(context25);
        oooO0O0.OooO00o(new o00oOoo(context25));
        p393o0Oo00o0.OooO0O0 endExecuteTask = new p393o0Oo00o0.OooO0O0();
        Intrinsics.checkNotNullParameter(endExecuteTask, "endExecuteTask");
        ArrayList task = new ArrayList();
        Iterator<o000oOoO> it2 = OooO0O0.f37649OooO0o.iterator();
        while (it2.hasNext()) {
            task.add(it2.next().getClass());
        }
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList<Class<? extends o000oOoO>> arrayList3 = endExecuteTask.f37685OooO0O0;
        arrayList3.clear();
        arrayList3.addAll(CollectionsKt.toList(task));
        oooO0O0.OooO00o(endExecuteTask);
        OooO0O0.f37647OooO0OO = System.currentTimeMillis();
        if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new RuntimeException("must be called from UiThread");
        }
        if (OooO0O0.f37649OooO0o.size() <= 0) {
            return true;
        }
        String str3 = OooO0O0.f37646OooO0O0;
        Log.i(str3, "needWait size : " + OooO0O0.f37653OooOO0.get());
        if (OooO0O0.f37650OooO0o0) {
            HashMap<Class<? extends o000oOoO>, ArrayList<o000oOoO>> map = OooO0O0.f37656OooOOO0;
            for (Class<? extends o000oOoO> cls : map.keySet()) {
                StringBuilder sb = new StringBuilder("cls ");
                sb.append(cls.getSimpleName());
                sb.append("   ");
                ArrayList<o000oOoO> arrayList4 = map.get(cls);
                Intrinsics.checkNotNull(arrayList4);
                sb.append(arrayList4.size());
                Log.i(str3, sb.toString());
                ArrayList<o000oOoO> arrayList5 = map.get(cls);
                Intrinsics.checkNotNull(arrayList5);
                Iterator<o000oOoO> it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Log.i(str3, "cls       ".concat(it3.next().getClass().getSimpleName()));
                }
            }
        }
        p144o00Oo00o.o00000OO o00000oo2 = p144o00Oo00o.o00000OO.f37680OooO00o;
        ArrayList<o000oOoO> originTasks = OooO0O0.f37649OooO0o;
        ArrayList<Class<? extends o000oOoO>> clsLaunchTasks = OooO0O0.f37651OooO0oO;
        synchronized (o00000oo2) {
            Intrinsics.checkNotNullParameter(originTasks, "originTasks");
            Intrinsics.checkNotNullParameter(clsLaunchTasks, "clsLaunchTasks");
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet();
            p144o00Oo00o.o00000O o00000o = new p144o00Oo00o.o00000O(originTasks.size());
            int size = originTasks.size();
            int i2 = 0;
            while (i2 < size) {
                o000oOoO o000oooo2 = originTasks.get(i2);
                if (!o000oooo2.f37684OooO00o && (arrayList = o000oooo2.f37685OooO0O0) != null) {
                    Intrinsics.checkNotNull(arrayList);
                    if (!arrayList.isEmpty()) {
                        ArrayList<Class<? extends o000oOoO>> arrayList6 = o000oooo2.f37685OooO0O0;
                        Intrinsics.checkNotNull(arrayList6);
                        for (Class<? extends o000oOoO> cls2 : arrayList6) {
                            int iIndexOf = CollectionsKt.indexOf((List<? extends Class<? extends o000oOoO>>) clsLaunchTasks, cls2);
                            if (iIndexOf >= 0) {
                                arrayList2 = clsLaunchTasks;
                                break;
                            }
                            int size2 = originTasks.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    arrayList2 = clsLaunchTasks;
                                    break;
                                }
                                Intrinsics.checkNotNull(cls2);
                                int i4 = size2;
                                arrayList2 = clsLaunchTasks;
                                if (Intrinsics.areEqual(cls2.getSimpleName(), originTasks.get(i3).getClass().getSimpleName())) {
                                    iIndexOf = i3;
                                    break;
                                }
                                i3++;
                                size2 = i4;
                                clsLaunchTasks = arrayList2;
                            }
                            if (!(iIndexOf >= 0)) {
                                throw new IllegalStateException((o000oooo2.getClass().getSimpleName() + " depends on " + cls2.getSimpleName() + " can not be found in task list ").toString());
                            }
                            hashSet.add(Integer.valueOf(iIndexOf));
                            List<Integer> list = o00000o.f37679OooO0O0[iIndexOf];
                            Intrinsics.checkNotNull(list);
                            list.add(Integer.valueOf(i2));
                            clsLaunchTasks = arrayList2;
                        }
                    }
                }
                i2++;
                clsLaunchTasks = clsLaunchTasks;
            }
            arrayListOooO00o = p144o00Oo00o.o00000OO.OooO00o(originTasks, o00000o.OooO00o(), hashSet);
            Log.i("TaskSortUtil", "task analyse cost makeTime " + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
        OooO0O0.f37649OooO0o = arrayListOooO00o;
        OooO0O0.f37644OooO = new CountDownLatch(OooO0O0.f37653OooOO0.get());
        for (o000oOoO task2 : OooO0O0.f37649OooO0o) {
            task2.getClass();
            if (OooO0O0.f37648OooO0Oo) {
                Intrinsics.checkNotNullExpressionValue(task2, "task");
                if (task2.OooO0OO()) {
                    OooO0O0.f37652OooO0oo.add(task2);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooO00o(task2, oooO0O0, null), 2, null);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(task2, "task");
                OooO0O0.OooO0O0(task2);
            }
            task2.f37684OooO00o = true;
        }
        Log.i(OooO0O0.f37646OooO0O0, "task analyse cost " + (System.currentTimeMillis() - OooO0O0.f37647OooO0OO) + "  begin main ");
        OooO0O0.f37647OooO0OO = System.currentTimeMillis();
        Iterator<o000oOoO> it4 = OooO0O0.f37652OooO0oo.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            String str4 = OooO0O0.f37646OooO0O0;
            if (!zHasNext) {
                Log.i(str4, "maintask cost " + (System.currentTimeMillis() - OooO0O0.f37647OooO0OO));
                return true;
            }
            o000oOoO task3 = it4.next();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue(task3, "task");
            new Oooo000(task3, oooO0O0).run();
            Log.i(str4, "real main " + task3.getClass().getSimpleName() + " cost   " + (System.currentTimeMillis() - jCurrentTimeMillis2));
        }
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
