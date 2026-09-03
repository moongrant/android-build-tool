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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p078o000Oo0O.o00000O;
import p078o000Oo0O.o00000O0;
import p078o000Oo0O.o0000O00;
import p078o000Oo0O.o000O0Oo;
import p078o000Oo0O.o000OO0O;
import p078o000Oo0O.o000Oo0;
import p078o000Oo0O.o0OO00O;
import p078o000Oo0O.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AutoTransition f8172OooO00o = new AutoTransition();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>>>> f8173OooO0O0 = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f8174OooO0OO = new ArrayList<>();

    public static class OooO00o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Transition f8175OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final ViewGroup f8176OooO0o0;

        /* JADX INFO: renamed from: androidx.transition.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0164OooO00o extends OooOO0O {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ p188o00o0O.OooOO0 f8177OooO0Oo;

            public C0164OooO00o(p188o00o0O.OooOO0 oooOO1) {
                this.f8177OooO0Oo = oooOO1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.Transition.OooO0o
            public final void OooO0o0(@NonNull Transition transition) {
                ((ArrayList) this.f8177OooO0Oo.getOrDefault(OooO00o.this.f8176OooO0o0, null)).remove(transition);
                transition.OooOoO0(this);
            }
        }

        public OooO00o(ViewGroup viewGroup, Transition transition) {
            this.f8175OooO0Oo = transition;
            this.f8176OooO0o0 = viewGroup;
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
            o00000O o00000o;
            o00000O o00000o2;
            p188o00o0O.OooOO0 oooOO1;
            p188o00o0O.OooOO0 oooOO2;
            int i2;
            int[] iArr;
            int i3;
            int i4;
            p188o00o0O.OooOO0<Animator, Transition.OooO0O0> oooOO0OooOOo;
            int i5;
            Animator animatorOooO0oo;
            Transition.OooO0O0 orDefault;
            View view;
            o00000O0 o00000o1;
            o00000O0 o00000o3;
            int i6;
            ViewGroup viewGroup;
            int i7;
            View view2;
            o00000O0 o00000o4;
            p188o00o0O.OooOO0<String, View> oooOO3;
            int i8;
            int i9;
            View viewOooOO0o;
            View orDefault2;
            SparseArray<View> sparseArray;
            int size;
            int i10;
            View viewValueAt;
            View view3;
            p188o00o0O.OooOo00<View> oooOo00;
            int iOooOO0O;
            int i11;
            View viewOooOO0o2;
            ViewGroup viewGroup2;
            Iterator it;
            ViewGroup viewGroup3 = this.f8176OooO0o0;
            viewGroup3.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup3.removeOnAttachStateChangeListener(this);
            int i12 = 1;
            if (!OooOOO0.f8174OooO0OO.remove(viewGroup3)) {
                return true;
            }
            p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>> oooOO0OooO0O0 = OooOOO0.OooO0O0();
            Long l = null;
            ArrayList<Transition> orDefault3 = oooOO0OooO0O0.getOrDefault(viewGroup3, null);
            if (orDefault3 != null) {
                arrayList = orDefault3.size() > 0 ? new ArrayList(orDefault3) : null;
                transition = this.f8175OooO0Oo;
                orDefault3.add(transition);
                transition.OooO0O0(new C0164OooO00o(oooOO0OooO0O0));
                i = 0;
                transition.OooOO0(viewGroup3, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).OooOoOO(viewGroup3);
                    }
                }
                transition.f8215OooOOO = new ArrayList<>();
                transition.f8217OooOOOO = new ArrayList<>();
                o00000o = transition.f8212OooOO0;
                o00000o2 = transition.f8213OooOO0O;
                oooOO1 = new p188o00o0O.OooOO0(o00000o.f34932OooO00o);
                oooOO2 = new p188o00o0O.OooOO0(o00000o2.f34932OooO00o);
                i2 = 0;
                while (true) {
                    iArr = transition.f8216OooOOO0;
                    if (i2 < iArr.length) {
                        break;
                    }
                    i6 = iArr[i2];
                    if (i6 != i12) {
                        viewGroup = viewGroup3;
                        i7 = oooOO1.f38816OooO0o;
                        while (true) {
                            i7--;
                            if (i7 >= 0) {
                                view2 = (View) oooOO1.OooO0oo(i7);
                                if (view2 == null && transition.OooOo0O(view2) && (o00000o4 = (o00000O0) oooOO2.remove(view2)) != null && transition.OooOo0O(o00000o4.f34937OooO0O0)) {
                                    transition.f8215OooOOO.add((o00000O0) oooOO1.OooOO0(i7));
                                    transition.f8217OooOOOO.add(o00000o4);
                                }
                            }
                        }
                    } else if (i6 != 2) {
                        viewGroup = viewGroup3;
                        oooOO3 = o00000o.f34935OooO0Oo;
                        p188o00o0O.OooOO0<String, View> oooOO4 = o00000o2.f34935OooO0Oo;
                        i8 = oooOO3.f38816OooO0o;
                        for (i9 = 0; i9 < i8; i9++) {
                            viewOooOO0o = oooOO3.OooOO0o(i9);
                            if (viewOooOO0o == null && transition.OooOo0O(viewOooOO0o) && (orDefault2 = oooOO4.getOrDefault(oooOO3.OooO0oo(i9), null)) != null && transition.OooOo0O(orDefault2)) {
                                o00000O0 o00000o5 = (o00000O0) oooOO1.getOrDefault(viewOooOO0o, null);
                                o00000O0 o00000o6 = (o00000O0) oooOO2.getOrDefault(orDefault2, null);
                                if (o00000o5 != null && o00000o6 != null) {
                                    transition.f8215OooOOO.add(o00000o5);
                                    transition.f8217OooOOOO.add(o00000o6);
                                    oooOO1.remove(viewOooOO0o);
                                    oooOO2.remove(orDefault2);
                                }
                            }
                        }
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            oooOo00 = o00000o.f34934OooO0OO;
                            iOooOO0O = oooOo00.OooOO0O();
                            i11 = i;
                            while (i11 < iOooOO0O) {
                                viewOooOO0o2 = oooOo00.OooOO0o(i11);
                                if (viewOooOO0o2 == null && transition.OooOo0O(viewOooOO0o2)) {
                                    viewGroup2 = viewGroup3;
                                    View view4 = (View) o00000o2.f34934OooO0OO.OooO0oO(oooOo00.OooO0oo(i11), l);
                                    if (view4 != null && transition.OooOo0O(view4)) {
                                        o00000O0 o00000o7 = (o00000O0) oooOO1.getOrDefault(viewOooOO0o2, l);
                                        o00000O0 o00000o8 = (o00000O0) oooOO2.getOrDefault(view4, l);
                                        if (o00000o7 != null && o00000o8 != null) {
                                            transition.f8215OooOOO.add(o00000o7);
                                            transition.f8217OooOOOO.add(o00000o8);
                                            oooOO1.remove(viewOooOO0o2);
                                            oooOO2.remove(view4);
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
                        sparseArray = o00000o.f34933OooO0O0;
                        SparseArray<View> sparseArray2 = o00000o2.f34933OooO0O0;
                        size = sparseArray.size();
                        for (i10 = 0; i10 < size; i10++) {
                            viewValueAt = sparseArray.valueAt(i10);
                            if (viewValueAt == null && transition.OooOo0O(viewValueAt) && (view3 = sparseArray2.get(sparseArray.keyAt(i10))) != null && transition.OooOo0O(view3)) {
                                o00000O0 o00000o9 = (o00000O0) oooOO1.getOrDefault(viewValueAt, null);
                                o00000O0 o00000o10 = (o00000O0) oooOO2.getOrDefault(view3, null);
                                if (o00000o9 != null && o00000o10 != null) {
                                    transition.f8215OooOOO.add(o00000o9);
                                    transition.f8217OooOOOO.add(o00000o10);
                                    oooOO1.remove(viewValueAt);
                                    oooOO2.remove(view3);
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
                for (i3 = 0; i3 < oooOO1.f38816OooO0o; i3++) {
                    o00000o3 = (o00000O0) oooOO1.OooOO0o(i3);
                    if (transition.OooOo0O(o00000o3.f34937OooO0O0)) {
                        transition.f8215OooOOO.add(o00000o3);
                        transition.f8217OooOOOO.add(null);
                    }
                }
                for (i4 = 0; i4 < oooOO2.f38816OooO0o; i4++) {
                    o00000o1 = (o00000O0) oooOO2.OooOO0o(i4);
                    if (transition.OooOo0O(o00000o1.f34937OooO0O0)) {
                        transition.f8217OooOOOO.add(o00000o1);
                        transition.f8215OooOOO.add(null);
                    }
                }
                oooOO0OooOOo = Transition.OooOOo();
                int i13 = oooOO0OooOOo.f38816OooO0o;
                o000Oo0 o000oo1 = o0000O00.f34939OooO00o;
                WindowId windowId = viewGroup4.getWindowId();
                for (i5 = i13 - 1; i5 >= 0; i5--) {
                    animatorOooO0oo = oooOO0OooOOo.OooO0oo(i5);
                    if (animatorOooO0oo == null && (orDefault = oooOO0OooOOo.getOrDefault(animatorOooO0oo, null)) != null && (view = orDefault.f8227OooO00o) != null) {
                        o000OO0O o000oo0o2 = orDefault.f8230OooO0Oo;
                        if ((o000oo0o2 instanceof o000O0Oo) && ((o000O0Oo) o000oo0o2).f34950OooO00o.equals(windowId)) {
                            o00000O0 o00000o0OooOo00 = transition.OooOo00(view, true);
                            o00000O0 o00000o0OooOOOo = transition.OooOOOo(view, true);
                            if (o00000o0OooOo00 == null && o00000o0OooOOOo == null) {
                                o00000o0OooOOOo = transition.f8213OooOO0O.f34932OooO00o.getOrDefault(view, null);
                            }
                            if (!(o00000o0OooOo00 == null && o00000o0OooOOOo == null) && orDefault.f8231OooO0o0.OooOo0(orDefault.f8229OooO0OO, o00000o0OooOOOo)) {
                                if (animatorOooO0oo.isRunning() || animatorOooO0oo.isStarted()) {
                                    animatorOooO0oo.cancel();
                                } else {
                                    oooOO0OooOOo.remove(animatorOooO0oo);
                                }
                            }
                        }
                    }
                }
                transition.OooOOO(viewGroup4, transition.f8212OooOO0, transition.f8213OooOO0O, transition.f8215OooOOO, transition.f8217OooOOOO);
                transition.OooOoo0();
                return true;
            }
            orDefault3 = new ArrayList<>();
            oooOO0OooO0O0.put(viewGroup3, orDefault3);
            transition = this.f8175OooO0Oo;
            orDefault3.add(transition);
            transition.OooO0O0(new C0164OooO00o(oooOO0OooO0O0));
            i = 0;
            transition.OooOO0(viewGroup3, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).OooOoOO(viewGroup3);
                }
            }
            transition.f8215OooOOO = new ArrayList<>();
            transition.f8217OooOOOO = new ArrayList<>();
            o00000o = transition.f8212OooOO0;
            o00000o2 = transition.f8213OooOO0O;
            oooOO1 = new p188o00o0O.OooOO0(o00000o.f34932OooO00o);
            oooOO2 = new p188o00o0O.OooOO0(o00000o2.f34932OooO00o);
            i2 = 0;
            while (true) {
                iArr = transition.f8216OooOOO0;
                if (i2 < iArr.length) {
                    break;
                    break;
                }
                i6 = iArr[i2];
                if (i6 != i12) {
                    viewGroup = viewGroup3;
                    i7 = oooOO1.f38816OooO0o;
                    while (true) {
                        i7--;
                        if (i7 >= 0) {
                            view2 = (View) oooOO1.OooO0oo(i7);
                            if (view2 == null) {
                            }
                        }
                    }
                } else if (i6 != 2) {
                    viewGroup = viewGroup3;
                    oooOO3 = o00000o.f34935OooO0Oo;
                    p188o00o0O.OooOO0<String, View> oooOO5 = o00000o2.f34935OooO0Oo;
                    i8 = oooOO3.f38816OooO0o;
                    while (i9 < i8) {
                        viewOooOO0o = oooOO3.OooOO0o(i9);
                        if (viewOooOO0o == null) {
                        }
                    }
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        oooOo00 = o00000o.f34934OooO0OO;
                        iOooOO0O = oooOo00.OooOO0O();
                        i11 = i;
                        while (i11 < iOooOO0O) {
                            viewOooOO0o2 = oooOo00.OooOO0o(i11);
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
                    sparseArray = o00000o.f34933OooO0O0;
                    SparseArray<View> sparseArray3 = o00000o2.f34933OooO0O0;
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
            while (i3 < oooOO1.f38816OooO0o) {
                o00000o3 = (o00000O0) oooOO1.OooOO0o(i3);
                if (transition.OooOo0O(o00000o3.f34937OooO0O0)) {
                    transition.f8215OooOOO.add(o00000o3);
                    transition.f8217OooOOOO.add(null);
                }
            }
            while (i4 < oooOO2.f38816OooO0o) {
                o00000o1 = (o00000O0) oooOO2.OooOO0o(i4);
                if (transition.OooOo0O(o00000o1.f34937OooO0O0)) {
                    transition.f8217OooOOOO.add(o00000o1);
                    transition.f8215OooOOO.add(null);
                }
            }
            oooOO0OooOOo = Transition.OooOOo();
            int i14 = oooOO0OooOOo.f38816OooO0o;
            o000Oo0 o000oo2 = o0000O00.f34939OooO00o;
            WindowId windowId2 = viewGroup5.getWindowId();
            while (i5 >= 0) {
                animatorOooO0oo = oooOO0OooOOo.OooO0oo(i5);
                if (animatorOooO0oo == null) {
                }
            }
            transition.OooOOO(viewGroup5, transition.f8212OooOO0, transition.f8213OooOO0O, transition.f8215OooOOO, transition.f8217OooOOOO);
            transition.OooOoo0();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f8176OooO0o0;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            OooOOO0.f8174OooO0OO.remove(viewGroup);
            ArrayList<Transition> orDefault = OooOOO0.OooO0O0().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().OooOoOO(viewGroup);
                }
            }
            this.f8175OooO0Oo.OooOO0O(true);
        }
    }

    public static void OooO00o(@NonNull ViewGroup viewGroup, @Nullable Transition transition) {
        ArrayList<ViewGroup> arrayList = f8174OooO0OO;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
            arrayList.add(viewGroup);
            if (transition == null) {
                transition = f8172OooO00o;
            }
            Transition transitionClone = transition.clone();
            ArrayList<Transition> orDefault = OooO0O0().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().OooOo(viewGroup);
                }
            }
            if (transitionClone != null) {
                transitionClone.OooOO0(viewGroup, true);
            }
            int i = o0OOO0o.transition_current_scene;
            if (((o0OO00O) viewGroup.getTag(i)) != null) {
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

    public static p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>> OooO0O0() {
        p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>> oooOO1;
        ThreadLocal<WeakReference<p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>>>> threadLocal = f8173OooO0O0;
        WeakReference<p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>>> weakReference = threadLocal.get();
        if (weakReference != null && (oooOO1 = weakReference.get()) != null) {
            return oooOO1;
        }
        p188o00o0O.OooOO0<ViewGroup, ArrayList<Transition>> oooOO2 = new p188o00o0O.OooOO0<>();
        threadLocal.set(new WeakReference<>(oooOO2));
        return oooOO2;
    }
}
