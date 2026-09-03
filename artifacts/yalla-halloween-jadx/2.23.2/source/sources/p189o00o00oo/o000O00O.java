package p189o00o00oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTaskDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskDispatcher.kt\ncom/code/android/startup/TaskDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1855#2,2:208\n1855#2,2:210\n1855#2,2:212\n*S KotlinDebug\n*F\n+ 1 TaskDispatcher.kt\ncom/code/android/startup/TaskDispatcher\n*L\n71#1:208,2\n96#1:210,2\n178#1:212,2\n*E\n"})
public final class o000O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static CountDownLatch f38517OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O00O f38518OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f38519OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static long f38520OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f38521OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static ArrayList<o00Oo0> f38522OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f38523OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ArrayList<Class<? extends o00Oo0>> f38524OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static volatile ArrayList<o00Oo0> f38525OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f38526OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final ArrayList<o00Oo0> f38527OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static volatile ArrayList<Class<? extends o00Oo0>> f38528OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final HashMap<Class<? extends o00Oo0>, ArrayList<o00Oo0>> f38529OooOOO0;

    static {
        o000O00O o000o00o2 = new o000O00O();
        f38518OooO00o = o000o00o2;
        f38519OooO0O0 = o000o00o2.getClass().getSimpleName();
        f38522OooO0o = new ArrayList<>();
        f38524OooO0oO = new ArrayList<>();
        f38525OooO0oo = new ArrayList<>();
        f38526OooOO0 = new AtomicInteger();
        f38527OooOO0O = new ArrayList<>();
        f38528OooOO0o = new ArrayList<>(40);
        f38529OooOOO0 = new HashMap<>();
    }

    public static void OooO0O0(@NotNull o00Oo0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.OooO0OO() && task.OooO0O0()) {
            f38528OooOO0o.add((Class<? extends o00Oo0>) task.getClass());
            f38527OooOO0O.remove(task);
            CountDownLatch countDownLatch = f38517OooO;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.countDown();
            f38526OooOO0.getAndDecrement();
        }
    }

    @NotNull
    public final void OooO00o(@NotNull o00Oo0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList<Class<? extends o00Oo0>> arrayList = task.f38586OooO0O0;
        if (arrayList != null) {
            for (Class<? extends o00Oo0> cls : arrayList) {
                HashMap<Class<? extends o00Oo0>, ArrayList<o00Oo0>> map = f38529OooOOO0;
                if (map.get(cls) == null) {
                    map.put(cls, new ArrayList<>());
                }
                ArrayList<o00Oo0> arrayList2 = map.get(cls);
                Intrinsics.checkNotNull(arrayList2);
                arrayList2.add(task);
                if (f38528OooOO0o.contains(cls)) {
                    ((CountDownLatch) task.f38587OooO0OO.getValue()).countDown();
                }
            }
        }
        f38522OooO0o.add(task);
        f38524OooO0oO.add((Class<? extends o00Oo0>) task.getClass());
        if (!task.OooO0OO() && task.OooO0O0()) {
            f38527OooOO0O.add(task);
            f38526OooOO0.getAndIncrement();
        }
    }
}
