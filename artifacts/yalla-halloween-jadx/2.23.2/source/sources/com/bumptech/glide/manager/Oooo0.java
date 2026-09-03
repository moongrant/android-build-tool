package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Iterator;
import java.util.List;
import p160o00OoOOO.o000000;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements Handler.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f13122OooO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile com.bumptech.glide.OooOo00 f13123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p190o00o0O.OooO<View, Fragment> f13124OooO0o = new p190o00o0O.OooO<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f13125OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOO f13126OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo f13127OooO0oo;

    public class OooO00o implements OooO0O0 {
        @Override // com.bumptech.glide.manager.Oooo0.OooO0O0
        @NonNull
        public final com.bumptech.glide.OooOo00 OooO00o(@NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull OooOOOO oooOOOO, @NonNull o000oOoO o000oooo2, @NonNull Context context) {
            return new com.bumptech.glide.OooOo00(oooO0OO, oooOOOO, o000oooo2, context);
        }
    }

    public interface OooO0O0 {
        @NonNull
        com.bumptech.glide.OooOo00 OooO00o(@NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull OooOOOO oooOOOO, @NonNull o000oOoO o000oooo2, @NonNull Context context);
    }

    public Oooo0(@Nullable OooO0O0 oooO0O0) {
        oooO0O0 = oooO0O0 == null ? f13122OooO : oooO0O0;
        this.f13125OooO0o0 = oooO0O0;
        this.f13127OooO0oo = new OooOo(oooO0O0);
        this.f13126OooO0oO = (o000000.f38054OooO0o && o000000.f38055OooO0o0) ? new OooOOO0() : new OooOO0();
    }

    @Nullable
    public static Activity OooO00o(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return OooO00o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void OooO0O0(@Nullable List list, @NonNull p190o00o0O.OooO oooO) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                oooO.put(fragment.getView(), fragment);
                OooO0O0(fragment.getChildFragmentManager().Oooo00O(), oooO);
            }
        }
    }

    @NonNull
    public final com.bumptech.glide.OooOo00 OooO0OO(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = o00OO0O0.f38351OooO00o;
        if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return OooO0Oo((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return OooO0OO(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f13123OooO0Oo == null) {
            synchronized (this) {
                if (this.f13123OooO0Oo == null) {
                    this.f13123OooO0Oo = this.f13125OooO0o0.OooO00o(com.bumptech.glide.OooO0OO.OooO0O0(context.getApplicationContext()), new com.bumptech.glide.manager.OooO00o(), new OooOO0O(), context.getApplicationContext());
                }
            }
        }
        return this.f13123OooO0Oo;
    }

    @NonNull
    public final com.bumptech.glide.OooOo00 OooO0Oo(@NonNull FragmentActivity fragmentActivity) {
        char[] cArr = o00OO0O0.f38351OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return OooO0OO(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f13126OooO0oO.OooO00o(fragmentActivity);
        Activity activityOooO00o = OooO00o(fragmentActivity);
        return this.f13127OooO0oo.OooO00o(fragmentActivity, com.bumptech.glide.OooO0OO.OooO0O0(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityOooO00o == null || !activityOooO00o.isFinishing());
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public final boolean handleMessage(Message message) {
        return false;
    }
}
