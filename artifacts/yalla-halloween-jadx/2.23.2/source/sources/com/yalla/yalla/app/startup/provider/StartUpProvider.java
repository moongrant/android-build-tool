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
import com.common.support.apollo.InitResult;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189o00o00oo.o000O00;
import p189o00o00oo.o000O00O;
import p191o00o0O0.o00Oo0;
import p386o0OOooO.oo0o0Oo;
import p395o0Oo00o.OooO;
import p395o0Oo00o.OooO0o;
import p395o0Oo00o.OooOO0;
import p396o0Oo00o0.OooOO0O;
import p396o0Oo00o0.OooOOO;
import p396o0Oo00o0.OooOOO0;
import p396o0Oo00o0.OooOOOO;
import p396o0Oo00o0.OooOo;
import p396o0Oo00o0.OooOo00;
import p396o0Oo00o0.Oooo0;
import p396o0Oo00o0.Oooo000;
import p396o0Oo00o0.o000000;
import p396o0Oo00o0.o000000O;
import p396o0Oo00o0.o000OOo;
import p396o0Oo00o0.o000oOoO;
import p396o0Oo00o0.o00O0O;
import p396o0Oo00o0.o00Ooo;
import p396o0Oo00o0.o00oO0o;
import p396o0Oo00o0.o0O0O00;
import p396o0Oo00o0.o0OO00O;
import p396o0Oo00o0.o0OOO0o;
import p396o0Oo00o0.o0Oo0oo;
import p396o0Oo00o0.o0OoOo0;
import p396o0Oo00o0.o0ooOOo;
import p396o0Oo00o0.oo000o;
import p397o0Oo00oO.o00000;
import p398o0Oo00oo.o00000O0;
import p590o0oOooo0.j0;
import p590o0oOooo0.oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/app/startup/provider/StartUpProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
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
        String string;
        String str;
        ArrayList<o00Oo0> arrayListOooO00o;
        ArrayList<Class<? extends o00Oo0>> arrayList;
        if (getContext() == null) {
            return false;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        if (!j0.OooO00o(context) || !oO.OooO00o()) {
            return false;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNull(context2);
        Intrinsics.checkNotNullParameter(context2, "context");
        InitResult initResult = new InitResult(0, null, 3, null);
        Apollo.INSTANCE.init(context2, oo0o0Oo.OooO0o() ? "ic_yalla.png" : "ic_yalla_t.png", initResult);
        if (!(initResult.getCode() == 0)) {
            oO.f57153OooO00o = false;
            return false;
        }
        o000O00O o000o00o2 = o000O00O.f38518OooO00o;
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
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) line.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
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
        o000O00O.f38521OooO0Oo = Intrinsics.areEqual(packageName, string);
        o000O00O.f38523OooO0o0 = false;
        o000O00O.f38522OooO0o.clear();
        o000O00O.f38524OooO0oO.clear();
        o000O00O.f38525OooO0oo.clear();
        o000O00O.f38526OooOO0.set(0);
        o000O00O.f38527OooOO0O.clear();
        Context context4 = getContext();
        Intrinsics.checkNotNull(context4);
        o000o00o2.OooO00o(new o000OOo(context4));
        Context context5 = getContext();
        Intrinsics.checkNotNull(context5);
        o000o00o2.OooO00o(new OooOOO0(context5));
        Context context6 = getContext();
        Intrinsics.checkNotNull(context6);
        o000o00o2.OooO00o(new o00000O0(context6));
        Context context7 = getContext();
        Intrinsics.checkNotNull(context7);
        o000o00o2.OooO00o(new o0O0O00(context7));
        Context context8 = getContext();
        Intrinsics.checkNotNull(context8);
        o000o00o2.OooO00o(new OooOo00(context8));
        Context context9 = getContext();
        Intrinsics.checkNotNull(context9);
        o000o00o2.OooO00o(new o00O0O(context9));
        o000o00o2.OooO00o(new o0ooOOo());
        Context context10 = getContext();
        Intrinsics.checkNotNull(context10);
        o000o00o2.OooO00o(new o000000(context10));
        Context context11 = getContext();
        Intrinsics.checkNotNull(context11);
        o000o00o2.OooO00o(new p396o0Oo00o0.o00Oo0(context11));
        Context context12 = getContext();
        Intrinsics.checkNotNull(context12);
        OooOo oooOo = new OooOo(context12);
        oooOo.OooO00o(OooOOO.class);
        o000o00o2.OooO00o(oooOo);
        o000o00o2.OooO00o(new oo000o());
        o000o00o2.OooO00o(new OooOOO());
        Context context13 = getContext();
        Intrinsics.checkNotNull(context13);
        o000o00o2.OooO00o(new o0Oo0oo(context13));
        Context context14 = getContext();
        Intrinsics.checkNotNull(context14);
        o0OOO0o o0ooo0o2 = new o0OOO0o(context14);
        o0ooo0o2.OooO00o(OooOOO0.class);
        o000o00o2.OooO00o(o0ooo0o2);
        Context context15 = getContext();
        Intrinsics.checkNotNull(context15);
        o000o00o2.OooO00o(new o00Ooo(context15));
        Context context16 = getContext();
        Intrinsics.checkNotNull(context16);
        o000o00o2.OooO00o(new o000000O(context16));
        o0OO00O o0oo00o2 = new o0OO00O();
        o0oo00o2.OooO00o(OooOOO0.class);
        o000o00o2.OooO00o(o0oo00o2);
        p396o0Oo00o0.oo0o0Oo oo0o0oo = new p396o0Oo00o0.oo0o0Oo();
        oo0o0oo.OooO00o(OooOOO0.class);
        o000o00o2.OooO00o(oo0o0oo);
        o000o00o2.OooO00o(new o00oO0o());
        Context context17 = getContext();
        Intrinsics.checkNotNull(context17);
        o000o00o2.OooO00o(new Oooo000(context17));
        Context context18 = getContext();
        Intrinsics.checkNotNull(context18);
        o000o00o2.OooO00o(new o0OoOo0(context18));
        Context context19 = getContext();
        Intrinsics.checkNotNull(context19);
        o000oOoO o000oooo2 = new o000oOoO(context19);
        o000oooo2.OooO00o(o0OoOo0.class);
        o000o00o2.OooO00o(o000oooo2);
        o000o00o2.OooO00o(new Oooo0());
        Context context20 = getContext();
        Intrinsics.checkNotNull(context20);
        o000o00o2.OooO00o(new OooOOOO(context20));
        Context context21 = getContext();
        Intrinsics.checkNotNull(context21);
        OooOO0O oooOO0O = new OooOO0O(context21);
        oooOO0O.OooO00o(o0OOO0o.class);
        o000o00o2.OooO00o(oooOO0O);
        Context context22 = getContext();
        Intrinsics.checkNotNull(context22);
        p395o0Oo00o.OooOO0O oooOO0O2 = new p395o0Oo00o.OooOO0O(context22);
        oooOO0O2.OooO00o(OooOOO0.class);
        o000o00o2.OooO00o(oooOO0O2);
        o000o00o2.OooO00o(new OooO0o());
        Context context23 = getContext();
        Intrinsics.checkNotNull(context23);
        o000o00o2.OooO00o(new p395o0Oo00o.OooOOO(context23));
        Context context24 = getContext();
        Intrinsics.checkNotNull(context24);
        o000o00o2.OooO00o(new OooOO0(context24));
        o000o00o2.OooO00o(new p395o0Oo00o.OooOOO0());
        Context context25 = getContext();
        Intrinsics.checkNotNull(context25);
        o000o00o2.OooO00o(new OooO(context25));
        o00000 endExecuteTask = new o00000();
        Intrinsics.checkNotNullParameter(endExecuteTask, "endExecuteTask");
        ArrayList task = new ArrayList();
        Iterator<o00Oo0> it2 = o000O00O.f38522OooO0o.iterator();
        while (it2.hasNext()) {
            task.add(it2.next().getClass());
        }
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList<Class<? extends o00Oo0>> arrayList2 = endExecuteTask.f38586OooO0O0;
        arrayList2.clear();
        arrayList2.addAll(CollectionsKt.toList(task));
        o000o00o2.OooO00o(endExecuteTask);
        o000O00O.f38520OooO0OO = System.currentTimeMillis();
        if (!Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            throw new RuntimeException("must be called from UiThread");
        }
        if (o000O00O.f38522OooO0o.size() <= 0) {
            return true;
        }
        String str3 = o000O00O.f38519OooO0O0;
        Log.i(str3, "needWait size : " + o000O00O.f38526OooOO0.get());
        if (o000O00O.f38523OooO0o0) {
            HashMap<Class<? extends o00Oo0>, ArrayList<o00Oo0>> map = o000O00O.f38529OooOOO0;
            for (Class<? extends o00Oo0> cls : map.keySet()) {
                StringBuilder sb = new StringBuilder("cls ");
                sb.append(cls.getSimpleName());
                sb.append("   ");
                ArrayList<o00Oo0> arrayList3 = map.get(cls);
                Intrinsics.checkNotNull(arrayList3);
                sb.append(arrayList3.size());
                Log.i(str3, sb.toString());
                ArrayList<o00Oo0> arrayList4 = map.get(cls);
                Intrinsics.checkNotNull(arrayList4);
                Iterator<o00Oo0> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Log.i(str3, "cls       ".concat(it3.next().getClass().getSimpleName()));
                }
            }
        }
        p178o00o0.OooO oooO = p178o00o0.OooO.f38362OooO00o;
        ArrayList<o00Oo0> originTasks = o000O00O.f38522OooO0o;
        ArrayList<Class<? extends o00Oo0>> clsLaunchTasks = o000O00O.f38524OooO0oO;
        synchronized (oooO) {
            Intrinsics.checkNotNullParameter(originTasks, "originTasks");
            Intrinsics.checkNotNullParameter(clsLaunchTasks, "clsLaunchTasks");
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashSet hashSet = new HashSet();
            p178o00o0.OooO0o oooO0o = new p178o00o0.OooO0o(originTasks.size());
            int size = originTasks.size();
            for (int i2 = 0; i2 < size; i2++) {
                o00Oo0 o00oo1 = originTasks.get(i2);
                if (!o00oo1.f38585OooO00o && (arrayList = o00oo1.f38586OooO0O0) != null) {
                    Intrinsics.checkNotNull(arrayList);
                    if (!arrayList.isEmpty()) {
                        ArrayList<Class<? extends o00Oo0>> arrayList5 = o00oo1.f38586OooO0O0;
                        Intrinsics.checkNotNull(arrayList5);
                        for (Class<? extends o00Oo0> cls2 : arrayList5) {
                            int iIndexOf = CollectionsKt.indexOf((List<? extends Class<? extends o00Oo0>>) clsLaunchTasks, cls2);
                            if (iIndexOf < 0) {
                                int size2 = originTasks.size();
                                int i3 = 0;
                                while (i3 < size2) {
                                    Intrinsics.checkNotNull(cls2);
                                    int i4 = size2;
                                    if (Intrinsics.areEqual(cls2.getSimpleName(), originTasks.get(i3).getClass().getSimpleName())) {
                                        iIndexOf = i3;
                                        break;
                                    }
                                    i3++;
                                    size2 = i4;
                                }
                            }
                            if (!(iIndexOf >= 0)) {
                                throw new IllegalStateException((o00oo1.getClass().getSimpleName() + " depends on " + cls2.getSimpleName() + " can not be found in task list ").toString());
                            }
                            hashSet.add(Integer.valueOf(iIndexOf));
                            List<Integer> list = oooO0o.f38365OooO0O0[iIndexOf];
                            Intrinsics.checkNotNull(list);
                            list.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
            arrayListOooO00o = p178o00o0.OooO.OooO00o(originTasks, oooO0o.OooO00o(), hashSet);
            Log.i("TaskSortUtil", "task analyse cost makeTime " + (System.currentTimeMillis() - jCurrentTimeMillis));
        }
        o000O00O.f38522OooO0o = arrayListOooO00o;
        o000O00O.f38517OooO = new CountDownLatch(o000O00O.f38526OooOO0.get());
        for (o00Oo0 task2 : o000O00O.f38522OooO0o) {
            task2.getClass();
            if (o000O00O.f38521OooO0Oo) {
                Intrinsics.checkNotNullExpressionValue(task2, "task");
                if (task2.OooO0OO()) {
                    o000O00O.f38525OooO0oo.add(task2);
                } else {
                    BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000O00(task2, o000o00o2, null), 2, null);
                }
                task2.f38585OooO00o = true;
            } else {
                Intrinsics.checkNotNullExpressionValue(task2, "task");
                o000O00O.OooO0O0(task2);
            }
            task2.f38585OooO00o = true;
        }
        Log.i(o000O00O.f38519OooO0O0, "task analyse cost " + (System.currentTimeMillis() - o000O00O.f38520OooO0OO) + "  begin main ");
        o000O00O.f38520OooO0OO = System.currentTimeMillis();
        Iterator<o00Oo0> it4 = o000O00O.f38525OooO0oo.iterator();
        while (true) {
            boolean zHasNext = it4.hasNext();
            String str4 = o000O00O.f38519OooO0O0;
            if (!zHasNext) {
                Log.i(str4, "maintask cost " + (System.currentTimeMillis() - o000O00O.f38520OooO0OO));
                return true;
            }
            o00Oo0 task3 = it4.next();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Intrinsics.checkNotNullExpressionValue(task3, "task");
            new p191o00o0O0.o0OoOo0(task3, o000o00o2).run();
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
