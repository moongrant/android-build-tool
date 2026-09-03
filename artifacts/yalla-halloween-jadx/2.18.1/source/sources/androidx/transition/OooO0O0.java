package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.o0000O0O;
import java.util.ArrayList;
import p101o000oOoo.oO000;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooO0O0 extends o0000O0O {

    public class OooO00o extends Transition.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f9506OooO00o;

        public OooO00o(Rect rect) {
            this.f9506OooO00o = rect;
        }

        @Override // androidx.transition.Transition.OooO0OO
        public final Rect OooO00o() {
            return this.f9506OooO00o;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public class C0065OooO0O0 implements Transition.OooO0o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f9507Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9508Oooo0oO;

        public C0065OooO0O0(View view, ArrayList arrayList) {
            this.f9507Oooo0o = view;
            this.f9508Oooo0oO = arrayList;
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO00o() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0O0(@NonNull Transition transition) {
            transition.OooOoO(this);
            transition.OooO0OO(this);
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0OO() {
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0Oo(@NonNull Transition transition) {
            transition.OooOoO(this);
            this.f9507Oooo0o.setVisibility(8);
            int size = this.f9508Oooo0oO.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f9508Oooo0oO.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.OooO0o
        public final void OooO0o0() {
        }
    }

    public class OooO0OO extends Transition.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Rect f9509OooO00o;

        public OooO0OO(Rect rect) {
            this.f9509OooO00o = rect;
        }

        @Override // androidx.transition.Transition.OooO0OO
        public final Rect OooO00o() {
            Rect rect = this.f9509OooO00o;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f9509OooO00o;
        }
    }

    public static boolean OooOOoo(Transition transition) {
        return (o0000O0O.OooO0oo(transition.f9564OoooO00) && o0000O0O.OooO0oo(null) && o0000O0O.OooO0oo(null)) ? false : true;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final Object OooO(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.Oooo0o0(transition);
            transitionSet.Oooo0o0(transition2);
            transitionSet.Oooo(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.Oooo0o0(transition);
        }
        transitionSet2.Oooo0o0(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooO00o(Object obj, View view) {
        ((Transition) obj).OooO0Oo(view);
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
            int size = transitionSet.f9587o0OoOo0.size();
            while (i < size) {
                OooO0O0(transitionSet.Oooo0o(i), arrayList);
                i++;
            }
            return;
        }
        if (OooOOoo(transition) || !o0000O0O.OooO0oo(transition.f9563OoooO0)) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            transition.OooO0Oo(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        OooOO0.OooO00o(viewGroup, (Transition) obj);
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
            transitionSet.Oooo0o0((Transition) obj);
        }
        transitionSet.Oooo0o0((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOO0O(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).OooO0OO(new C0065OooO0O0(view, arrayList));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOO0o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).OooO0OO(new androidx.transition.OooO0OO(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOO(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            OooO0oO(view, rect);
            ((Transition) obj).OooOooo(new OooO00o(rect));
        }
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOO0(Object obj, Rect rect) {
        ((Transition) obj).OooOooo(new OooO0OO(rect));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOOO(@NonNull Object obj, @NonNull o000O00O.OooO0o oooO0o, @NonNull Runnable runnable) {
        Transition transition = (Transition) obj;
        oooO0o.OooO0O0(new oO000(transition));
        transition.OooO0OO(new OooO0o(runnable));
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOOo(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f9563OoooO0;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o0000O0O.OooO0Oo(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        OooO0O0(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.o0000O0O
    public final Object OooOOo(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.Oooo0o0((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.o0000O0O
    public final void OooOOo0(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f9563OoooO0.clear();
            transitionSet.f9563OoooO0.addAll(arrayList2);
            OooOo00(transitionSet, arrayList, arrayList2);
        }
    }

    public final void OooOo00(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.f9587o0OoOo0.size();
            while (i < size) {
                OooOo00(transitionSet.Oooo0o(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (OooOOoo(transition)) {
            return;
        }
        ArrayList<View> arrayList3 = transition.f9563OoooO0;
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
                transition.OooOoOO(arrayList.get(size3));
            }
        }
    }
}
