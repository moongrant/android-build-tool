package o00Oo00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTaskDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskDispatcher.kt\ncom/code/android/startup/TaskDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1855#2,2:208\n1855#2,2:210\n1855#2,2:212\n*S KotlinDebug\n*F\n+ 1 TaskDispatcher.kt\ncom/code/android/startup/TaskDispatcher\n*L\n71#1:208,2\n96#1:210,2\n178#1:212,2\n*E\n"})
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static CountDownLatch f37644OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f37645OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f37646OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static long f37647OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f37648OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static ArrayList<o000oOoO> f37649OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f37650OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ArrayList<Class<? extends o000oOoO>> f37651OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static volatile ArrayList<o000oOoO> f37652OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f37653OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final ArrayList<o000oOoO> f37654OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static volatile ArrayList<Class<? extends o000oOoO>> f37655OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final HashMap<Class<? extends o000oOoO>, ArrayList<o000oOoO>> f37656OooOOO0;

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f37645OooO00o = oooO0O0;
        f37646OooO0O0 = oooO0O0.getClass().getSimpleName();
        f37649OooO0o = new ArrayList<>();
        f37651OooO0oO = new ArrayList<>();
        f37652OooO0oo = new ArrayList<>();
        f37653OooOO0 = new AtomicInteger();
        f37654OooOO0O = new ArrayList<>();
        f37655OooOO0o = new ArrayList<>(40);
        f37656OooOOO0 = new HashMap<>();
    }

    public static void OooO0O0(@NotNull o000oOoO task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.OooO0OO() && task.OooO0O0()) {
            f37655OooOO0o.add((Class<? extends o000oOoO>) task.getClass());
            f37654OooOO0O.remove(task);
            CountDownLatch countDownLatch = f37644OooO;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.countDown();
            f37653OooOO0.getAndDecrement();
        }
    }

    @NotNull
    public final void OooO00o(@NotNull o000oOoO task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ArrayList<Class<? extends o000oOoO>> arrayList = task.f37685OooO0O0;
        if (arrayList != null) {
            for (Class<? extends o000oOoO> cls : arrayList) {
                HashMap<Class<? extends o000oOoO>, ArrayList<o000oOoO>> map = f37656OooOOO0;
                if (map.get(cls) == null) {
                    map.put(cls, new ArrayList<>());
                }
                ArrayList<o000oOoO> arrayList2 = map.get(cls);
                Intrinsics.checkNotNull(arrayList2);
                arrayList2.add(task);
                if (f37655OooOO0o.contains(cls)) {
                    ((CountDownLatch) task.f37686OooO0OO.getValue()).countDown();
                }
            }
        }
        f37649OooO0o.add(task);
        f37651OooO0oO.add((Class<? extends o000oOoO>) task.getClass());
        if (!task.OooO0OO() && task.OooO0O0()) {
            f37654OooOO0O.add(task);
            f37653OooOO0.getAndIncrement();
        }
    }
}
