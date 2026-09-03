package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OO extends o000O000 {

    public class OooO00o implements Transition.TransitionListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ View f6038OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f6039OooO0O0;

        public OooO00o(View view, ArrayList arrayList) {
            this.f6038OooO00o = view;
            this.f6039OooO0O0 = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f6038OooO00o.setVisibility(8);
            ArrayList arrayList = this.f6039OooO0O0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
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

    public class OooO0O0 extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f6040OooO00o;

        public OooO0O0(Rect rect) {
            this.f6040OooO00o = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f6040OooO00o;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean OooOOoo(Transition transition) {
        return (o000O000.OooO0oo(transition.getTargetIds()) && o000O000.OooO0oo(transition.getTargetNames()) && o000O000.OooO0oo(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooO(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
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

    @Override // androidx.fragment.app.o000O000
    public final void OooO00o(@NonNull View view, @NonNull Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooO0O0(@NonNull ArrayList arrayList, @NonNull Object obj) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooO0O0(arrayList, transitionSet.getTransitionAt(i));
                i++;
            }
            return;
        }
        if (OooOOoo(transition) || !o000O000.OooO0oo(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooO0OO(@NonNull ViewGroup viewGroup, @Nullable Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooO0o(@Nullable Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o000O000
    public final boolean OooO0o0(@NonNull Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooOO0(@Nullable Object obj, @Nullable Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOO0O(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new OooO00o(view, arrayList));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOO0o(@NonNull Object obj, @Nullable Object obj2, @Nullable ArrayList arrayList, @Nullable Object obj3, @Nullable ArrayList arrayList2) {
        ((Transition) obj).addListener(new o0000O(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOO(@NonNull Object obj, @NonNull Rect rect) {
        ((Transition) obj).setEpicenterCallback(new OooO0O0(rect));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOO0(@Nullable View view, @NonNull Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            o000O000.OooO0oO(view, rect);
            ((Transition) obj).setEpicenterCallback(new o0000O0O(rect));
        }
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOOO(@NonNull Object obj, @NonNull p063o0000oO.o0OoOo0 o0oooo1, @NonNull OooOO0 oooOO1) {
        ((Transition) obj).addListener(new o0000OO0(oooOO1));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOOo(@NonNull Object obj, @NonNull View view, @NonNull ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o000O000.OooO0Oo(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        OooO0O0(arrayList, transitionSet);
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooOOo(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOo0(@Nullable Object obj, @Nullable ArrayList<View> arrayList, @Nullable ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            OooOo00(transitionSet, arrayList, arrayList2);
        }
    }

    public final void OooOo00(@NonNull Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
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
