package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.o000oOoO;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import o0O0OOO0.o00O0O;
import o0O0OOO0.o00Oo0;
import o0O0OOO0.o00Ooo;
import o0O0OOO0.o00oO0o;
import o0O0OOO0.o0OOO0o;
import o0O0OOO0.o0ooOOo;
import o0O0OOO0.oo000o;
import p203o00o0o0o.o0O00oO0;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000oOoO<ScheduledExecutorService> f19854OooO00o = new o000oOoO<>(new o00O0O());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000oOoO<ScheduledExecutorService> f19855OooO0O0 = new o000oOoO<>(new o00Oo0());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000oOoO<ScheduledExecutorService> f19856OooO0OO = new o000oOoO<>(new o00Ooo());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000oOoO<ScheduledExecutorService> f19857OooO0Oo = new o000oOoO<>(new oo000o());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<OooO0O0<?>> getComponents() {
        OooO0O0[] oooO0O0Arr = new OooO0O0[4];
        Qualified qualified = new Qualified(Background.class, ScheduledExecutorService.class);
        Qualified[] qualifiedArr = {new Qualified(Background.class, ExecutorService.class), new Qualified(Background.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qualified);
        for (Qualified qualified2 : qualifiedArr) {
            if (qualified2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, qualifiedArr);
        oooO0O0Arr[0] = new OooO0O0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new o0O00oO0(), hashSet3);
        Qualified qualified3 = new Qualified(Blocking.class, ScheduledExecutorService.class);
        Qualified[] qualifiedArr2 = {new Qualified(Blocking.class, ExecutorService.class), new Qualified(Blocking.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qualified3);
        for (Qualified qualified4 : qualifiedArr2) {
            if (qualified4 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet4, qualifiedArr2);
        oooO0O0Arr[1] = new OooO0O0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new o00oO0o(), hashSet6);
        Qualified qualified5 = new Qualified(Lightweight.class, ScheduledExecutorService.class);
        Qualified[] qualifiedArr3 = {new Qualified(Lightweight.class, ExecutorService.class), new Qualified(Lightweight.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qualified5);
        for (Qualified qualified6 : qualifiedArr3) {
            if (qualified6 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet7, qualifiedArr3);
        oooO0O0Arr[2] = new OooO0O0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new o0ooOOo(), hashSet9);
        Qualified qualified7 = new Qualified(UiThread.class, Executor.class);
        Qualified[] qualifiedArr4 = new Qualified[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(qualified7);
        for (Qualified qualified8 : qualifiedArr4) {
            if (qualified8 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet10, qualifiedArr4);
        oooO0O0Arr[3] = new OooO0O0(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new o0OOO0o(), hashSet12);
        return Arrays.asList(oooO0O0Arr);
    }
}
