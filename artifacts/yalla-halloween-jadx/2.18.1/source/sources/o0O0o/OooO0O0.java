package o0O0o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static CountDownLatch f36053OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f36054OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f36055OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static long f36056OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f36057OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static ArrayList<o000000O> f36058OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f36059OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ArrayList<Class<? extends o000000O>> f36060OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static volatile ArrayList<o000000O> f36061OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final AtomicInteger f36062OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final ArrayList<o000000O> f36063OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static volatile ArrayList<Class<? extends o000000O>> f36064OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final HashMap<Class<? extends o000000O>, ArrayList<o000000O>> f36065OooOOO0;

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        f36054OooO00o = oooO0O0;
        f36055OooO0O0 = oooO0O0.getClass().getSimpleName();
        f36058OooO0o = new ArrayList<>();
        f36060OooO0oO = new ArrayList<>();
        f36061OooO0oo = new ArrayList<>();
        f36062OooOO0 = new AtomicInteger();
        f36063OooOO0O = new ArrayList<>();
        f36064OooOO0o = new ArrayList<>(40);
        f36065OooOOO0 = new HashMap<>();
    }

    @NotNull
    public final OooO0O0 OooO00o(@NotNull o000000O task) {
        Intrinsics.checkNotNullParameter(task, "task");
        List<Class<? extends o000000O>> listOooO00o = task.OooO00o();
        if (listOooO00o != null) {
            for (Class<? extends o000000O> cls : listOooO00o) {
                HashMap<Class<? extends o000000O>, ArrayList<o000000O>> map = f36065OooOOO0;
                if (map.get(cls) == null) {
                    map.put(cls, new ArrayList<>());
                }
                ArrayList<o000000O> arrayList = map.get(cls);
                Intrinsics.checkNotNull(arrayList);
                arrayList.add(task);
                if (f36064OooOO0o.contains(cls)) {
                    task.f34228OooO0O0.countDown();
                }
            }
        }
        f36058OooO0o.add(task);
        f36060OooO0oO.add((Class<? extends o000000O>) task.getClass());
        if (!task.OooO0Oo() && task.OooO0O0()) {
            f36063OooOO0O.add(task);
            f36062OooOO0.getAndIncrement();
        }
        return this;
    }

    public final void OooO0O0(@NotNull o000000O task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.OooO0Oo() && task.OooO0O0()) {
            f36064OooOO0o.add((Class<? extends o000000O>) task.getClass());
            f36063OooOO0O.remove(task);
            CountDownLatch countDownLatch = f36053OooO;
            Intrinsics.checkNotNull(countDownLatch);
            countDownLatch.countDown();
            f36062OooOO0.getAndDecrement();
        }
    }
}
