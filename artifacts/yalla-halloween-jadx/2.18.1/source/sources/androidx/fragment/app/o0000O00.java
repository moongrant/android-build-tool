package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f8471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8472OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f8473OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8474OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8475OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f8476OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0000 f8477OooO0oO;

    public o0000O00(o0000 o0000Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f8477OooO0oO = o0000Var;
        this.f8471OooO00o = obj;
        this.f8472OooO0O0 = arrayList;
        this.f8476OooO0o0 = obj2;
        this.f8475OooO0o = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.f8471OooO00o;
        if (obj != null) {
            this.f8477OooO0oO.OooOo00(obj, this.f8472OooO0O0, null);
        }
        Object obj2 = this.f8473OooO0OO;
        if (obj2 != null) {
            this.f8477OooO0oO.OooOo00(obj2, this.f8474OooO0Oo, null);
        }
        Object obj3 = this.f8476OooO0o0;
        if (obj3 != null) {
            this.f8477OooO0oO.OooOo00(obj3, this.f8475OooO0o, null);
        }
    }
}
