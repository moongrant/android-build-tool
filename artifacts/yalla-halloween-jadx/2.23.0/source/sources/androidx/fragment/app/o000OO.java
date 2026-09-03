package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO implements Transition.TransitionListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Object f6008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6009OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f6010OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6011OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6012OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f6013OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f6014OooO0oO;

    public o000OO(o0000O0O o0000o0o2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f6014OooO0oO = o0000o0o2;
        this.f6008OooO00o = obj;
        this.f6009OooO0O0 = arrayList;
        this.f6013OooO0o0 = obj2;
        this.f6012OooO0o = arrayList2;
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
        o0000O0O o0000o0o2 = this.f6014OooO0oO;
        Object obj = this.f6008OooO00o;
        if (obj != null) {
            o0000o0o2.OooOo00(obj, this.f6009OooO0O0, null);
        }
        Object obj2 = this.f6010OooO0OO;
        if (obj2 != null) {
            o0000o0o2.OooOo00(obj2, this.f6011OooO0Oo, null);
        }
        Object obj3 = this.f6013OooO0o0;
        if (obj3 != null) {
            o0000o0o2.OooOo00(obj3, this.f6012OooO0o, null);
        }
    }
}
