package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O implements Transition.TransitionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f5981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5982OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f5983OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5984OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f5985OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f5986OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000OO f5987OooO0oO;

    public o0000O(o000OO o000oo2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f5987OooO0oO = o000oo2;
        this.f5981OooO00o = obj;
        this.f5982OooO0O0 = arrayList;
        this.f5986OooO0o0 = obj2;
        this.f5985OooO0o = arrayList2;
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
        o000OO o000oo2 = this.f5987OooO0oO;
        Object obj = this.f5981OooO00o;
        if (obj != null) {
            o000oo2.OooOo00(obj, this.f5982OooO0O0, null);
        }
        Object obj2 = this.f5983OooO0OO;
        if (obj2 != null) {
            o000oo2.OooOo00(obj2, this.f5984OooO0Oo, null);
        }
        Object obj3 = this.f5986OooO0o0;
        if (obj3 != null) {
            o000oo2.OooOo00(obj3, this.f5985OooO0o, null);
        }
    }
}
