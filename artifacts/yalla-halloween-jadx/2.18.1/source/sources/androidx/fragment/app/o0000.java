package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0000 extends o0000O0O {

    public class OooO00o extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f8415OooO00o;

        public OooO00o(Rect rect) {
            this.f8415OooO00o = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            return this.f8415OooO00o;
        }
    }

    public class OooO0O0 implements Transition.TransitionListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ View f8416OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8417OooO0O0;

        public OooO0O0(View view, ArrayList arrayList) {
            this.f8416OooO00o = view;
            this.f8417OooO0O0 = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f8416OooO00o.setVisibility(8);
            int size = this.f8417OooO0O0.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f8417OooO0O0.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    public class OooO0OO extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f8418OooO00o;

        public OooO0OO(Rect rect) {
            this.f8418OooO00o = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f8418OooO00o;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f8418OooO00o;
        }
    }

    public static boolean OooOOoo(Transition transition) {
        return (o0000O0O.OooO0oo(transition.getTargetIds()) && o0000O0O.OooO0oo(transition.getTargetNames()) && o0000O0O.OooO0oo(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final Object OooO(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooO00o(Object obj, View view) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooO0O0(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooO0O0(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (OooOOoo(transition) || !o0000O0O.OooO0oo(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.o0000O0O
    public final Object OooO0o(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final boolean OooO0o0(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final Object OooOO0(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOO0O(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new OooO0O0(view, arrayList));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOO0o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new o0000O00(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOO(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            OooO0oO(view, rect);
            ((Transition) obj).setEpicenterCallback(new OooO00o(rect));
        }
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOO0(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new OooO0OO(rect));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOOO(@NonNull Object obj, @NonNull o000O00O.OooO0o oooO0o, @NonNull Runnable runnable) {
        ((Transition) obj).addListener(new o0000oo(runnable));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOOo(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0000O0O.OooO0Oo(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        OooO0O0(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.o0000O0O
    public final Object OooOOo(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            OooOo00(transitionSet, arrayList, arrayList2);
        }
    }

    public final void OooOo00(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooOo00(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (OooOOoo(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}
