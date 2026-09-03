package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.o000O000;
import java.util.ArrayList;
import p063o0000oO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooO0o extends o000O000 {

    public class OooO00o implements Transition.OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f11256OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f11257OooO0o0;

        public OooO00o(View view, ArrayList arrayList) {
            this.f11256OooO0Oo = view;
            this.f11257OooO0o0 = arrayList;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO00o() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0O0() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            transition.OooOo(this);
            transition.OooO0O0(this);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0(@NonNull Transition transition) {
            transition.OooOo(this);
            this.f11256OooO0Oo.setVisibility(8);
            ArrayList arrayList = this.f11257OooO0o0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((View) arrayList.get(i)).setVisibility(0);
            }
        }
    }

    public class OooO0O0 extends Transition.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f11258OooO00o;

        public OooO0O0(Rect rect) {
            this.f11258OooO00o = rect;
        }

        @Override // androidx.transition.Transition.OooO0OO
        public final Rect OooO00o() {
            Rect rect = this.f11258OooO00o;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    public static boolean OooOOoo(Transition transition) {
        return (o000O000.OooO0oo(transition.f11305OooO0oo) && o000O000.OooO0oo(null) && o000O000.OooO0oo(null)) ? false : true;
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooO(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.Oooo0OO(transition);
            transitionSet.Oooo0OO(transition2);
            transitionSet.Oooo0oO(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.Oooo0OO(transition);
        }
        transitionSet2.Oooo0OO(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooO00o(View view, Object obj) {
        ((Transition) obj).OooO0Oo(view);
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooO0O0(ArrayList arrayList, Object obj) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f11327OooOoo0.size();
            while (i < size) {
                OooO0O0(arrayList, (i < 0 || i >= transitionSet.f11327OooOoo0.size()) ? null : transitionSet.f11327OooOoo0.get(i));
                i++;
            }
            return;
        }
        if (OooOOoo(transition) || !o000O000.OooO0oo(transition.f11300OooO)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            transition.OooO0Oo((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        OooOOO0.OooO00o(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooO0o(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.o000O000
    public final boolean OooO0o0(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooOO0(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.Oooo0OO((Transition) obj);
        }
        transitionSet.Oooo0OO((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOO0O(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).OooO0O0(new OooO00o(view, arrayList));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOO0o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).OooO0O0(new OooO(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOO(Object obj, Rect rect) {
        ((Transition) obj).OooOoo(new OooO0O0(rect));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOO0(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            o000O000.OooO0oO(view, rect);
            ((Transition) obj).OooOoo(new OooO0OO(rect));
        }
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOOO(@NonNull Object obj, @NonNull o0OoOo0 o0oooo1, @NonNull androidx.fragment.app.OooOO0 oooOO1) {
        Transition transition = (Transition) obj;
        o0oooo1.OooO0O0(new oOO00O.OooO0o(transition));
        transition.OooO0O0(new OooOO0(oooOO1));
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOOo(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f11300OooO;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o000O000.OooO0Oo(arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        OooO0O0(arrayList, transitionSet);
    }

    @Override // androidx.fragment.app.o000O000
    public final Object OooOOo(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Oooo0OO((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o000O000
    public final void OooOOo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList<View> arrayList3 = transitionSet.f11300OooO;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            OooOo00(transitionSet, arrayList, arrayList2);
        }
    }

    public final void OooOo00(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f11327OooOoo0.size();
            while (i < size) {
                OooOo00((i < 0 || i >= transitionSet.f11327OooOoo0.size()) ? null : transitionSet.f11327OooOoo0.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (OooOOoo(transition)) {
            return;
        }
        ArrayList<View> arrayList3 = transition.f11300OooO;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            transition.OooO0Oo(arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                transition.OooOoO0(arrayList.get(size3));
            }
        }
    }
}
