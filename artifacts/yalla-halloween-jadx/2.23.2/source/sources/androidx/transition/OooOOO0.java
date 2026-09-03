package androidx.transition;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import oOO00O.OooOo;
import oOO00O.Oooo0;
import oOO00O.o0000;
import oOO00O.o0000O0O;
import oOO00O.o000OO;
import oOO00O.o00oO0o;
import oOO00O.o0ooOOo;
import oOO00O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AutoTransition f11266OooO00o = new AutoTransition();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<p190o00o0O.OooO<ViewGroup, ArrayList<Transition>>>> f11267OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f11268OooO0OO = new ArrayList<>();

    public static class OooO00o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Transition f11269OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ViewGroup f11270OooO0o0;

        /* JADX INFO: renamed from: androidx.transition.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0183OooO00o extends OooOO0O {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p190o00o0O.OooO f11271OooO0Oo;

            public C0183OooO00o(p190o00o0O.OooO oooO) {
                this.f11271OooO0Oo = oooO;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.Transition.OooO0o
            public final void OooO0o0(@NonNull Transition transition) {
                ((ArrayList) this.f11271OooO0Oo.getOrDefault(OooO00o.this.f11270OooO0o0, null)).remove(transition);
                transition.OooOo(this);
            }
        }

        public OooO00o(ViewGroup viewGroup, Transition transition) {
            this.f11269OooO0Oo = transition;
            this.f11270OooO0o0 = viewGroup;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0204  */
        /* JADX WARN: Code duplicated, block: B:105:0x0222  */
        /* JADX WARN: Code duplicated, block: B:137:0x028f  */
        /* JADX WARN: Code duplicated, block: B:142:0x01cf A[EDGE_INSN: B:142:0x01cf->B:89:0x01cf BREAK  A[LOOP:1: B:19:0x0083->B:88:0x01c5], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:180:0x01ee A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:183:0x020f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x0098  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:61:0x0141  */
        /* JADX WARN: Code duplicated, block: B:63:0x014b  */
        /* JADX WARN: Code duplicated, block: B:76:0x018f  */
        /* JADX WARN: Code duplicated, block: B:79:0x0196  */
        /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:94:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            Transition transition;
            int i;
            o0ooOOo o0ooooo;
            o0ooOOo o0ooooo2;
            p190o00o0O.OooO oooO;
            p190o00o0O.OooO oooO2;
            int i2;
            int[] iArr;
            int i3;
            int i4;
            p190o00o0O.OooO<Animator, Transition.OooO0O0> oooOOooOOo0;
            int i5;
            Animator animatorOooO0oo;
            Transition.OooO0O0 orDefault;
            View view;
            o00oO0o o00oo0o2;
            o00oO0o o00oo0o3;
            int i6;
            ViewGroup viewGroup;
            int i7;
            View view2;
            o00oO0o o00oo0o4;
            p190o00o0O.OooO<String, View> oooO3;
            int i8;
            int i9;
            View viewOooOO0o;
            View orDefault2;
            SparseArray<View> sparseArray;
            int size;
            int i10;
            View viewValueAt;
            View view3;
            p190o00o0O.OooOOOO<View> oooOOOO;
            int iOooOO0O;
            int i11;
            View viewOooOO0o2;
            ViewGroup viewGroup2;
            Iterator it;
            ViewGroup viewGroup3 = this.f11270OooO0o0;
            viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup3.removeOnAttachStateChangeListener(this);
            int i12 = 1;
            if (!OooOOO0.f11268OooO0OO.remove(viewGroup3)) {
                return true;
            }
            p190o00o0O.OooO<ViewGroup, ArrayList<Transition>> oooOOooO0O0 = OooOOO0.OooO0O0();
            Long l = null;
            ArrayList<Transition> orDefault3 = oooOOooO0O0.getOrDefault(viewGroup3, null);
            if (orDefault3 != null) {
                arrayList = orDefault3.size() > 0 ? new ArrayList(orDefault3) : null;
                transition = this.f11269OooO0Oo;
                orDefault3.add(transition);
                transition.OooO0O0(new C0183OooO00o(oooOOooO0O0));
                i = 0;
                transition.OooOO0(viewGroup3, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).OooOoO(viewGroup3);
                    }
                }
                transition.f11309OooOOO = new ArrayList<>();
                transition.f11311OooOOOO = new ArrayList<>();
                o0ooooo = transition.f11306OooOO0;
                o0ooooo2 = transition.f11307OooOO0O;
                oooO = new p190o00o0O.OooO(o0ooooo.f60172OooO00o);
                oooO2 = new p190o00o0O.OooO(o0ooooo2.f60172OooO00o);
                i2 = 0;
                while (true) {
                    iArr = transition.f11310OooOOO0;
                    if (i2 < iArr.length) {
                        break;
                    }
                    i6 = iArr[i2];
                    if (i6 != i12) {
                        viewGroup = viewGroup3;
                        i7 = oooO.f38568OooO0o;
                        while (true) {
                            i7--;
                            if (i7 >= 0) {
                                view2 = (View) oooO.OooO0oo(i7);
                                if (view2 == null && transition.OooOo0(view2) && (o00oo0o4 = (o00oO0o) oooO2.remove(view2)) != null && transition.OooOo0(o00oo0o4.f60158OooO0O0)) {
                                    transition.f11309OooOOO.add((o00oO0o) oooO.OooOO0(i7));
                                    transition.f11311OooOOOO.add(o00oo0o4);
                                }
                            }
                        }
                    } else if (i6 != 2) {
                        viewGroup = viewGroup3;
                        oooO3 = o0ooooo.f60175OooO0Oo;
                        p190o00o0O.OooO<String, View> oooO4 = o0ooooo2.f60175OooO0Oo;
                        i8 = oooO3.f38568OooO0o;
                        for (i9 = 0; i9 < i8; i9++) {
                            viewOooOO0o = oooO3.OooOO0o(i9);
                            if (viewOooOO0o == null && transition.OooOo0(viewOooOO0o) && (orDefault2 = oooO4.getOrDefault(oooO3.OooO0oo(i9), null)) != null && transition.OooOo0(orDefault2)) {
                                o00oO0o o00oo0o5 = (o00oO0o) oooO.getOrDefault(viewOooOO0o, null);
                                o00oO0o o00oo0o6 = (o00oO0o) oooO2.getOrDefault(orDefault2, null);
                                if (o00oo0o5 != null && o00oo0o6 != null) {
                                    transition.f11309OooOOO.add(o00oo0o5);
                                    transition.f11311OooOOOO.add(o00oo0o6);
                                    oooO.remove(viewOooOO0o);
                                    oooO2.remove(orDefault2);
                                }
                            }
                        }
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            oooOOOO = o0ooooo.f60174OooO0OO;
                            iOooOO0O = oooOOOO.OooOO0O();
                            i11 = i;
                            while (i11 < iOooOO0O) {
                                viewOooOO0o2 = oooOOOO.OooOO0o(i11);
                                if (viewOooOO0o2 == null && transition.OooOo0(viewOooOO0o2)) {
                                    viewGroup2 = viewGroup3;
                                    View view4 = (View) o0ooooo2.f60174OooO0OO.OooO0oO(oooOOOO.OooO0oo(i11), l);
                                    if (view4 != null && transition.OooOo0(view4)) {
                                        o00oO0o o00oo0o7 = (o00oO0o) oooO.getOrDefault(viewOooOO0o2, l);
                                        o00oO0o o00oo0o8 = (o00oO0o) oooO2.getOrDefault(view4, l);
                                        if (o00oo0o7 != null && o00oo0o8 != null) {
                                            transition.f11309OooOOO.add(o00oo0o7);
                                            transition.f11311OooOOOO.add(o00oo0o8);
                                            oooO.remove(viewOooOO0o2);
                                            oooO2.remove(view4);
                                        }
                                    }
                                } else {
                                    viewGroup2 = viewGroup3;
                                }
                                i11++;
                                viewGroup3 = viewGroup2;
                                l = null;
                            }
                        }
                        viewGroup = viewGroup3;
                    } else {
                        viewGroup = viewGroup3;
                        sparseArray = o0ooooo.f60173OooO0O0;
                        SparseArray<View> sparseArray2 = o0ooooo2.f60173OooO0O0;
                        size = sparseArray.size();
                        for (i10 = 0; i10 < size; i10++) {
                            viewValueAt = sparseArray.valueAt(i10);
                            if (viewValueAt == null && transition.OooOo0(viewValueAt) && (view3 = sparseArray2.get(sparseArray.keyAt(i10))) != null && transition.OooOo0(view3)) {
                                o00oO0o o00oo0o9 = (o00oO0o) oooO.getOrDefault(viewValueAt, null);
                                o00oO0o o00oo0o10 = (o00oO0o) oooO2.getOrDefault(view3, null);
                                if (o00oo0o9 != null && o00oo0o10 != null) {
                                    transition.f11309OooOOO.add(o00oo0o9);
                                    transition.f11311OooOOOO.add(o00oo0o10);
                                    oooO.remove(viewValueAt);
                                    oooO2.remove(view3);
                                }
                            }
                        }
                    }
                    i2++;
                    viewGroup3 = viewGroup;
                    i = 0;
                    l = null;
                    i12 = 1;
                }
                ViewGroup viewGroup4 = viewGroup3;
                for (i3 = 0; i3 < oooO.f38568OooO0o; i3++) {
                    o00oo0o3 = (o00oO0o) oooO.OooOO0o(i3);
                    if (transition.OooOo0(o00oo0o3.f60158OooO0O0)) {
                        transition.f11309OooOOO.add(o00oo0o3);
                        transition.f11311OooOOOO.add(null);
                    }
                }
                for (i4 = 0; i4 < oooO2.f38568OooO0o; i4++) {
                    o00oo0o2 = (o00oO0o) oooO2.OooOO0o(i4);
                    if (transition.OooOo0(o00oo0o2.f60158OooO0O0)) {
                        transition.f11311OooOOOO.add(o00oo0o2);
                        transition.f11309OooOOO.add(null);
                    }
                }
                oooOOooOOo0 = Transition.OooOOo0();
                int i13 = oooOOooOOo0.f38568OooO0o;
                o0000 o0000Var = oo0o0Oo.f60176OooO00o;
                WindowId windowId = viewGroup4.getWindowId();
                for (i5 = i13 - 1; i5 >= 0; i5--) {
                    animatorOooO0oo = oooOOooOOo0.OooO0oo(i5);
                    if (animatorOooO0oo == null && (orDefault = oooOOooOOo0.getOrDefault(animatorOooO0oo, null)) != null && (view = orDefault.f11321OooO00o) != null) {
                        o000OO o000oo2 = orDefault.f11324OooO0Oo;
                        if ((o000oo2 instanceof o0000O0O) && ((o0000O0O) o000oo2).f60150OooO00o.equals(windowId)) {
                            o00oO0o o00oo0oOooOOoo = transition.OooOOoo(view, true);
                            o00oO0o o00oo0oOooOOOo = transition.OooOOOo(view, true);
                            if (o00oo0oOooOOoo == null && o00oo0oOooOOOo == null) {
                                o00oo0oOooOOOo = transition.f11307OooOO0O.f60172OooO00o.getOrDefault(view, null);
                            }
                            if (!(o00oo0oOooOOoo == null && o00oo0oOooOOOo == null) && orDefault.f11325OooO0o0.OooOo00(orDefault.f11323OooO0OO, o00oo0oOooOOOo)) {
                                if (animatorOooO0oo.isRunning() || animatorOooO0oo.isStarted()) {
                                    animatorOooO0oo.cancel();
                                } else {
                                    oooOOooOOo0.remove(animatorOooO0oo);
                                }
                            }
                        }
                    }
                }
                transition.OooOOO(viewGroup4, transition.f11306OooOO0, transition.f11307OooOO0O, transition.f11309OooOOO, transition.f11311OooOOOO);
                transition.OooOoOO();
                return true;
            }
            orDefault3 = new ArrayList<>();
            oooOOooO0O0.put(viewGroup3, orDefault3);
            transition = this.f11269OooO0Oo;
            orDefault3.add(transition);
            transition.OooO0O0(new C0183OooO00o(oooOOooO0O0));
            i = 0;
            transition.OooOO0(viewGroup3, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).OooOoO(viewGroup3);
                }
            }
            transition.f11309OooOOO = new ArrayList<>();
            transition.f11311OooOOOO = new ArrayList<>();
            o0ooooo = transition.f11306OooOO0;
            o0ooooo2 = transition.f11307OooOO0O;
            oooO = new p190o00o0O.OooO(o0ooooo.f60172OooO00o);
            oooO2 = new p190o00o0O.OooO(o0ooooo2.f60172OooO00o);
            i2 = 0;
            while (true) {
                iArr = transition.f11310OooOOO0;
                if (i2 < iArr.length) {
                    break;
                    break;
                }
                i6 = iArr[i2];
                if (i6 != i12) {
                    viewGroup = viewGroup3;
                    i7 = oooO.f38568OooO0o;
                    while (true) {
                        i7--;
                        if (i7 >= 0) {
                            view2 = (View) oooO.OooO0oo(i7);
                            if (view2 == null) {
                            }
                        }
                    }
                } else if (i6 != 2) {
                    viewGroup = viewGroup3;
                    oooO3 = o0ooooo.f60175OooO0Oo;
                    p190o00o0O.OooO<String, View> oooO5 = o0ooooo2.f60175OooO0Oo;
                    i8 = oooO3.f38568OooO0o;
                    while (i9 < i8) {
                        viewOooOO0o = oooO3.OooOO0o(i9);
                        if (viewOooOO0o == null) {
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        oooOOOO = o0ooooo.f60174OooO0OO;
                        iOooOO0O = oooOOOO.OooOO0O();
                        i11 = i;
                        while (i11 < iOooOO0O) {
                            viewOooOO0o2 = oooOOOO.OooOO0o(i11);
                            if (viewOooOO0o2 == null) {
                                viewGroup2 = viewGroup3;
                            } else {
                                viewGroup2 = viewGroup3;
                            }
                            i11++;
                            viewGroup3 = viewGroup2;
                            l = null;
                        }
                    }
                    viewGroup = viewGroup3;
                } else {
                    viewGroup = viewGroup3;
                    sparseArray = o0ooooo.f60173OooO0O0;
                    SparseArray<View> sparseArray3 = o0ooooo2.f60173OooO0O0;
                    size = sparseArray.size();
                    while (i10 < size) {
                        viewValueAt = sparseArray.valueAt(i10);
                        if (viewValueAt == null) {
                        }
                    }
                }
                i2++;
                viewGroup3 = viewGroup;
                i = 0;
                l = null;
                i12 = 1;
            }
            ViewGroup viewGroup5 = viewGroup3;
            while (i3 < oooO.f38568OooO0o) {
                o00oo0o3 = (o00oO0o) oooO.OooOO0o(i3);
                if (transition.OooOo0(o00oo0o3.f60158OooO0O0)) {
                    transition.f11309OooOOO.add(o00oo0o3);
                    transition.f11311OooOOOO.add(null);
                }
            }
            while (i4 < oooO2.f38568OooO0o) {
                o00oo0o2 = (o00oO0o) oooO2.OooOO0o(i4);
                if (transition.OooOo0(o00oo0o2.f60158OooO0O0)) {
                    transition.f11311OooOOOO.add(o00oo0o2);
                    transition.f11309OooOOO.add(null);
                }
            }
            oooOOooOOo0 = Transition.OooOOo0();
            int i14 = oooOOooOOo0.f38568OooO0o;
            o0000 o0000Var2 = oo0o0Oo.f60176OooO00o;
            WindowId windowId2 = viewGroup5.getWindowId();
            while (i5 >= 0) {
                animatorOooO0oo = oooOOooOOo0.OooO0oo(i5);
                if (animatorOooO0oo == null) {
                }
            }
            transition.OooOOO(viewGroup5, transition.f11306OooOO0, transition.f11307OooOO0O, transition.f11309OooOOO, transition.f11311OooOOOO);
            transition.OooOoOO();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f11270OooO0o0;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            OooOOO0.f11268OooO0OO.remove(viewGroup);
            ArrayList<Transition> orDefault = OooOOO0.OooO0O0().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().OooOoO(viewGroup);
                }
            }
            this.f11269OooO0Oo.OooOO0O(true);
        }
    }

    public static void OooO00o(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        ArrayList<ViewGroup> arrayList = f11268OooO0OO;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
            arrayList.add(viewGroup);
            if (transition == null) {
                transition = f11266OooO00o;
            }
            Transition transitionClone = transition.clone();
            ArrayList<Transition> orDefault = OooO0O0().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().OooOo0o(viewGroup);
                }
            }
            if (transitionClone != null) {
                transitionClone.OooOO0(viewGroup, true);
            }
            int i = OooOo.transition_current_scene;
            if (((Oooo0) viewGroup.getTag(i)) != null) {
                throw null;
            }
            viewGroup.setTag(i, null);
            if (transitionClone != null) {
                OooO00o oooO00o = new OooO00o(viewGroup, transitionClone);
                viewGroup.addOnAttachStateChangeListener(oooO00o);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(oooO00o);
            }
        }
    }

    public static p190o00o0O.OooO<ViewGroup, ArrayList<Transition>> OooO0O0() {
        p190o00o0O.OooO<ViewGroup, ArrayList<Transition>> oooO;
        ThreadLocal<WeakReference<p190o00o0O.OooO<ViewGroup, ArrayList<Transition>>>> threadLocal = f11267OooO0O0;
        WeakReference<p190o00o0O.OooO<ViewGroup, ArrayList<Transition>>> weakReference = threadLocal.get();
        if (weakReference != null && (oooO = weakReference.get()) != null) {
            return oooO;
        }
        p190o00o0O.OooO<ViewGroup, ArrayList<Transition>> oooO2 = new p190o00o0O.OooO<>();
        threadLocal.set(new WeakReference<>(oooO2));
        return oooO2;
    }
}
