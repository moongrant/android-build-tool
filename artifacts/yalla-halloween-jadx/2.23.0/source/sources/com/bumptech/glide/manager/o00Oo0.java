package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements Handler.Callback {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f10028OooOOO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile com.bumptech.glide.OooOo00 f10030OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Handler f10033OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f10034OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOo00 f10037OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Oooo0 f10038OooOOO0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @VisibleForTesting
    public final HashMap f10032OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public final HashMap f10031OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p188o00o0O.OooOO0<View, Fragment> f10029OooO = new p188o00o0O.OooOO0<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p188o00o0O.OooOO0<View, android.app.Fragment> f10035OooOO0 = new p188o00o0O.OooOO0<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Bundle f10036OooOO0O = new Bundle();

    public class OooO00o implements OooO0O0 {
        @Override // com.bumptech.glide.manager.o00Oo0.OooO0O0
        @NonNull
        public final com.bumptech.glide.OooOo00 OooO00o(@NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull OooOo oooOo, @NonNull o00Ooo o00ooo2, @NonNull Context context) {
            return new com.bumptech.glide.OooOo00(oooO0OO, oooOo, o00ooo2, context);
        }
    }

    public interface OooO0O0 {
        @NonNull
        com.bumptech.glide.OooOo00 OooO00o(@NonNull com.bumptech.glide.OooO0OO oooO0OO, @NonNull OooOo oooOo, @NonNull o00Ooo o00ooo2, @NonNull Context context);
    }

    public o00Oo0(@Nullable OooO0O0 oooO0O0, com.bumptech.glide.OooOO0 oooOO1) {
        oooO0O0 = oooO0O0 == null ? f10028OooOOO : oooO0O0;
        this.f10034OooO0oo = oooO0O0;
        this.f10033OooO0oO = new Handler(Looper.getMainLooper(), this);
        this.f10038OooOOO0 = new Oooo0(oooO0O0);
        this.f10037OooOO0o = (o00OO0O0.o00Oo0.f37228OooO0oo && o00OO0O0.o00Oo0.f37227OooO0oO) ? oooOO1.f9874OooO00o.containsKey(com.bumptech.glide.OooO0o.C0173OooO0o.class) ? new OooOOO() : new OooOOOO() : new OooOO0O();
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

    public static void OooO0OO(@Nullable List list, @NonNull p188o00o0O.OooOO0 oooOO1) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                oooOO1.put(fragment.getView(), fragment);
                OooO0OO(fragment.getChildFragmentManager().Oooo00O(), oooOO1);
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    public final void OooO0O0(@NonNull FragmentManager fragmentManager, @NonNull p188o00o0O.OooOO0<View, android.app.Fragment> oooOO1) {
        android.app.Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    oooOO1.put(fragment2.getView(), fragment2);
                    OooO0O0(fragment2.getChildFragmentManager(), oooOO1);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Bundle bundle = this.f10036OooOO0O;
            bundle.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                oooOO1.put(fragment.getView(), fragment);
                OooO0O0(fragment.getChildFragmentManager(), oooOO1);
            }
            i = i2;
        }
    }

    @NonNull
    @Deprecated
    public final com.bumptech.glide.OooOo00 OooO0Oo(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        o0OoOo0 o0oooo0OooO0oo = OooO0oo(fragmentManager, fragment);
        com.bumptech.glide.OooOo00 oooOo00OooO00o = o0oooo0OooO0oo.f10070OooO0oO;
        if (oooOo00OooO00o == null) {
            oooOo00OooO00o = this.f10034OooO0oo.OooO00o(com.bumptech.glide.OooO0OO.OooO0O0(context), o0oooo0OooO0oo.f10067OooO0Oo, o0oooo0OooO0oo.f10069OooO0o0, context);
            if (z) {
                oooOo00OooO00o.onStart();
            }
            o0oooo0OooO0oo.f10070OooO0oO = oooOo00OooO00o;
        }
        return oooOo00OooO00o;
    }

    @NonNull
    public final com.bumptech.glide.OooOo00 OooO0o(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = o0000oo.f54571OooO00o;
        if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return OooO0oO((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                return OooO0o0((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return OooO0o(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f10030OooO0Oo == null) {
            synchronized (this) {
                if (this.f10030OooO0Oo == null) {
                    this.f10030OooO0Oo = this.f10034OooO0oo.OooO00o(com.bumptech.glide.OooO0OO.OooO0O0(context.getApplicationContext()), new com.bumptech.glide.manager.OooO0O0(), new OooOOO0(), context.getApplicationContext());
                }
            }
        }
        return this.f10030OooO0Oo;
    }

    @NonNull
    @Deprecated
    public final com.bumptech.glide.OooOo00 OooO0o0(@NonNull Activity activity) {
        if (o0000oo.OooO0oo()) {
            return OooO0o(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return OooO0oO((FragmentActivity) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f10037OooOO0o.OooO00o();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity activityOooO00o = OooO00o(activity);
        return OooO0Oo(activity, fragmentManager, null, activityOooO00o == null || !activityOooO00o.isFinishing());
    }

    @NonNull
    public final com.bumptech.glide.OooOo00 OooO0oO(@NonNull FragmentActivity fragmentActivity) {
        if (o0000oo.OooO0oo()) {
            return OooO0o(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f10037OooOO0o.OooO00o();
        Activity activityOooO00o = OooO00o(fragmentActivity);
        return this.f10038OooOOO0.OooO00o(fragmentActivity, com.bumptech.glide.OooO0OO.OooO0O0(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityOooO00o == null || !activityOooO00o.isFinishing());
    }

    @NonNull
    public final o0OoOo0 OooO0oo(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment) {
        HashMap map = this.f10032OooO0o0;
        o0OoOo0 o0oooo0 = (o0OoOo0) map.get(fragmentManager);
        if (o0oooo0 != null) {
            return o0oooo0;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (o0oooo1 == null) {
            o0oooo1 = new o0OoOo0();
            o0oooo1.f10066OooO = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                o0oooo1.OooO00o(fragment.getActivity());
            }
            map.put(fragmentManager, o0oooo1);
            fragmentManager.beginTransaction().add(o0oooo1, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f10033OooO0oO.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return o0oooo1;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z;
        Object objRemove;
        Object obj;
        Object obj2;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = message.arg1 == 1;
        int i = message.what;
        Handler handler = this.f10033OooO0oO;
        Object obj3 = null;
        if (i == 1) {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            HashMap map = this.f10032OooO0o0;
            o0OoOo0 o0oooo0 = (o0OoOo0) map.get(fragmentManager);
            o0OoOo0 o0oooo1 = (o0OoOo0) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (o0oooo1 == o0oooo0) {
                z = true;
            } else {
                if (o0oooo1 != null && o0oooo1.f10070OooO0oO != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + o0oooo1 + " New: " + o0oooo0);
                }
                if (z5 || fragmentManager.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager.isDestroyed()) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                        } else {
                            Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                        }
                    }
                    o0oooo0.f10067OooO0Oo.OooO0OO();
                    z = true;
                } else {
                    FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(o0oooo0, "com.bumptech.glide.manager");
                    if (o0oooo1 != null) {
                        fragmentTransactionAdd.remove(o0oooo1);
                    }
                    fragmentTransactionAdd.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
                    if (Log.isLoggable("RMRetriever", 3)) {
                        Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                    }
                    z = false;
                }
            }
            if (z) {
                objRemove = map.remove(fragmentManager);
                obj2 = fragmentManager;
                obj3 = objRemove;
                z4 = true;
                obj = obj2;
            } else {
                obj = null;
                z4 = true;
                z3 = false;
            }
        } else if (i != 2) {
            z3 = false;
            obj = null;
        } else {
            androidx.fragment.app.FragmentManager fragmentManager2 = (androidx.fragment.app.FragmentManager) message.obj;
            HashMap map2 = this.f10031OooO0o;
            oo0o0Oo oo0o0oo = (oo0o0Oo) map2.get(fragmentManager2);
            oo0o0Oo oo0o0oo2 = (oo0o0Oo) fragmentManager2.OooOoo("com.bumptech.glide.manager");
            if (oo0o0oo2 == oo0o0oo) {
                z2 = true;
            } else if (z5 || fragmentManager2.f5836Oooo00o) {
                if (fragmentManager2.f5836Oooo00o) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                    }
                } else if (Log.isLoggable("RMRetriever", 6)) {
                    Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                }
                oo0o0oo.f10076OooO0Oo.OooO0OO();
                z2 = true;
            } else {
                androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager2);
                oooO00o.OooO0OO(0, oo0o0oo, "com.bumptech.glide.manager", 1);
                if (oo0o0oo2 != null) {
                    oooO00o.OooOOO0(oo0o0oo2);
                }
                oooO00o.OooO();
                handler.obtainMessage(2, 1, 0, fragmentManager2).sendToTarget();
                if (Log.isLoggable("RMRetriever", 3)) {
                    Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                }
                z2 = false;
            }
            if (z2) {
                objRemove = map2.remove(fragmentManager2);
                obj2 = fragmentManager2;
                obj3 = objRemove;
                z4 = true;
                obj = obj2;
            } else {
                obj = null;
                z4 = true;
                z3 = false;
            }
        }
        if (Log.isLoggable("RMRetriever", 5) && z3 && obj3 == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z4;
    }
}
