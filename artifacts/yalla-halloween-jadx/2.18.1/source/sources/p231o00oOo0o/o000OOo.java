package p231o00oOo0o;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooO0o;
import com.bumptech.glide.OooOO0;
import com.bumptech.glide.OooOOO;
import java.util.HashMap;
import java.util.Map;
import p134o00OO0o.o00O0O;
import p224o00oOOOo.oO0o0000;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo implements Handler.Callback {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final OooO00o f33922OoooO0O = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Handler f33923Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public volatile OooOOO f33924Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @VisibleForTesting
    public final Map<FragmentManager, o0O0O00> f33925Oooo0oO = new HashMap();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @VisibleForTesting
    public final Map<androidx.fragment.app.FragmentManager, o00000> f33926Oooo0oo = new HashMap();

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final o0OOO0o f33927OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final OooO0O0 f33928OoooO00;

    public class OooO00o implements OooO0O0 {
        @Override // o00oOo0o.o000OOo.OooO0O0
        @NonNull
        public final OooOOO OooO00o(@NonNull OooO0OO oooO0OO, @NonNull o0Oo0oo o0oo0oo2, @NonNull o000000 o000000Var, @NonNull Context context) {
            return new OooOOO(oooO0OO, o0oo0oo2, o000000Var, context);
        }
    }

    public interface OooO0O0 {
        @NonNull
        OooOOO OooO00o(@NonNull OooO0OO oooO0OO, @NonNull o0Oo0oo o0oo0oo2, @NonNull o000000 o000000Var, @NonNull Context context);
    }

    public o000OOo(@Nullable OooO0O0 oooO0O0, OooOO0 oooOO1) {
        new Bundle();
        this.f33928OoooO00 = oooO0O0 == null ? f33922OoooO0O : oooO0O0;
        this.f33923Oooo = new Handler(Looper.getMainLooper(), this);
        this.f33927OoooO0 = (oO0o0000.f33817OooO0oo && oO0o0000.f33816OooO0oO) ? oooOO1.OooO00o(OooO0o.C0079OooO0o.class) ? new o00oO0o() : new o0ooOOo() : new oo000o();
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

    @NonNull
    public final OooOOO OooO0O0(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (o000O000.OooO() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return OooO0OO((FragmentActivity) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (o000O000.OooO0oo()) {
                    return OooO0O0(activity.getApplicationContext());
                }
                if (activity instanceof FragmentActivity) {
                    return OooO0OO((FragmentActivity) activity);
                }
                if (activity.isDestroyed()) {
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                }
                this.f33927OoooO0.OooO00o();
                FragmentManager fragmentManager = activity.getFragmentManager();
                Activity activityOooO00o = OooO00o(activity);
                boolean z = activityOooO00o == null || !activityOooO00o.isFinishing();
                o0O0O00 o0o0o00OooO0Oo = OooO0Oo(fragmentManager);
                OooOOO oooOOO = o0o0o00OooO0Oo.f33935Oooo;
                if (oooOOO != null) {
                    return oooOOO;
                }
                OooOOO oooOOOOooO00o = this.f33928OoooO00.OooO00o(OooO0OO.OooO0O0(activity), o0o0o00OooO0Oo.f33936Oooo0o, o0o0o00OooO0Oo.f33937Oooo0oO, activity);
                if (z) {
                    oooOOOOooO00o.onStart();
                }
                o0o0o00OooO0Oo.f33935Oooo = oooOOOOooO00o;
                return oooOOOOooO00o;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return OooO0O0(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f33924Oooo0o == null) {
            synchronized (this) {
                if (this.f33924Oooo0o == null) {
                    this.f33924Oooo0o = this.f33928OoooO00.OooO00o(OooO0OO.OooO0O0(context.getApplicationContext()), new o000oOoO(), new o00O0O(), context.getApplicationContext());
                }
            }
        }
        return this.f33924Oooo0o;
    }

    @NonNull
    public final OooOOO OooO0OO(@NonNull FragmentActivity fragmentActivity) {
        if (o000O000.OooO0oo()) {
            return OooO0O0(fragmentActivity.getApplicationContext());
        }
        if (fragmentActivity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f33927OoooO0.OooO00o();
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Activity activityOooO00o = OooO00o(fragmentActivity);
        boolean z = activityOooO00o == null || !activityOooO00o.isFinishing();
        o00000 o00000VarOooO0o0 = OooO0o0(supportFragmentManager);
        OooOOO oooOOOOooO00o = o00000VarOooO0o0.f33916OoooO00;
        if (oooOOOOooO00o == null) {
            oooOOOOooO00o = this.f33928OoooO00.OooO00o(OooO0OO.OooO0O0(fragmentActivity), o00000VarOooO0o0.f33912Oooo0o, o00000VarOooO0o0.f33913Oooo0oO, fragmentActivity);
            if (z) {
                oooOOOOooO00o.onStart();
            }
            o00000VarOooO0o0.f33916OoooO00 = oooOOOOooO00o;
        }
        return oooOOOOooO00o;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<android.app.FragmentManager, o00oOo0o.o0O0O00>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<android.app.FragmentManager, o00oOo0o.o0O0O00>] */
    @NonNull
    public final o0O0O00 OooO0Oo(@NonNull FragmentManager fragmentManager) {
        o0O0O00 o0o0o00 = (o0O0O00) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (o0o0o00 != null) {
            return o0o0o00;
        }
        o0O0O00 o0o0o01 = (o0O0O00) this.f33925Oooo0oO.get(fragmentManager);
        if (o0o0o01 != null) {
            return o0o0o01;
        }
        o0O0O00 o0o0o02 = new o0O0O00();
        o0o0o02.f33939OoooO0 = null;
        this.f33925Oooo0oO.put(fragmentManager, o0o0o02);
        fragmentManager.beginTransaction().add(o0o0o02, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f33923Oooo.obtainMessage(1, fragmentManager).sendToTarget();
        return o0o0o02;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.FragmentManager, o00oOo0o.o00000>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.FragmentManager, o00oOo0o.o00000>] */
    @NonNull
    public final o00000 OooO0o0(@NonNull androidx.fragment.app.FragmentManager fragmentManager) {
        o00000 o00000Var = (o00000) fragmentManager.Oooo00O("com.bumptech.glide.manager");
        if (o00000Var != null) {
            return o00000Var;
        }
        o00000 o00000Var2 = (o00000) this.f33926Oooo0oo.get(fragmentManager);
        if (o00000Var2 != null) {
            return o00000Var2;
        }
        o00000 o00000Var3 = new o00000();
        o00000Var3.f33915OoooO0 = null;
        this.f33926Oooo0oo.put(fragmentManager, o00000Var3);
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(fragmentManager);
        oooO00o.OooO0Oo(0, o00000Var3, "com.bumptech.glide.manager", 1);
        oooO00o.OooO0oo();
        this.f33923Oooo.obtainMessage(2, fragmentManager).sendToTarget();
        return o00000Var3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<android.app.FragmentManager, o00oOo0o.o0O0O00>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashMap, java.util.Map<androidx.fragment.app.FragmentManager, o00oOo0o.o00000>] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object objRemove;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
                obj2 = null;
            } else {
                obj = (androidx.fragment.app.FragmentManager) message.obj;
                objRemove = this.f33926Oooo0oo.remove(obj);
            }
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        }
        obj = (FragmentManager) message.obj;
        objRemove = this.f33925Oooo0oO.remove(obj);
        obj2 = obj;
        obj3 = objRemove;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }
}
