package com.yalla.yalla.ui.adapter;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends androidx.recyclerview.widget.o00000O0 {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static TimeInterpolator f27170OooOOoo;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.o0O0O00>> f27172OooO0oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayList<ArrayList<OooO>> f27171OooO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<ArrayList<OooO0o>> f27173OooOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<RecyclerView.o0O0O00> f27174OooOO0O = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList<RecyclerView.o0O0O00> f27175OooOO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<RecyclerView.o0O0O00> f27177OooOOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final ArrayList<RecyclerView.o0O0O00> f27176OooOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final ArrayList<RecyclerView.o0O0O00> f27178OooOOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ArrayList<RecyclerView.o0O0O00> f27179OooOOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ArrayList<OooO> f27181OooOOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final ArrayList<OooO0o> f27180OooOOo = new ArrayList<>();

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RecyclerView.o0O0O00 f27182OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f27183OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f27184OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f27185OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f27186OooO0o0;

        public OooO(RecyclerView.o0O0O00 o0o0o00, int i, int i2, int i3, int i4) {
            this.f27182OooO00o = o0o0o00;
            this.f27183OooO0O0 = i;
            this.f27184OooO0OO = i2;
            this.f27185OooO0Oo = i3;
            this.f27186OooO0o0 = i4;
        }
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27187OooO0Oo;

        public OooO00o(ArrayList arrayList) {
            this.f27187OooO0Oo = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f27187OooO0Oo;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                o0O0ooO o0o0ooo = o0O0ooO.this;
                if (!zHasNext) {
                    arrayList.clear();
                    o0o0ooo.f27171OooO.remove(arrayList);
                    return;
                }
                OooO oooO = (OooO) it.next();
                RecyclerView.o0O0O00 o0o0o00 = oooO.f27182OooO00o;
                o0o0ooo.getClass();
                View view = o0o0o00.itemView;
                int i = oooO.f27185OooO0Oo - oooO.f27183OooO0O0;
                int i2 = oooO.f27186OooO0o0 - oooO.f27184OooO0OO;
                if (i != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i2 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                o0o0ooo.f27175OooOO0o.add(o0o0o00);
                viewPropertyAnimatorAnimate.setDuration(o0o0ooo.f10689OooO0o0).setListener(new o00O000o(o0o0ooo, o0o0o00, i, view, i2, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27189OooO0Oo;

        public OooO0O0(ArrayList arrayList) {
            this.f27189OooO0Oo = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f27189OooO0Oo;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                o0O0ooO o0o0ooo = o0O0ooO.this;
                if (!zHasNext) {
                    arrayList.clear();
                    o0o0ooo.f27173OooOO0.remove(arrayList);
                    return;
                }
                OooO0o oooO0o = (OooO0o) it.next();
                o0o0ooo.getClass();
                RecyclerView.o0O0O00 o0o0o00 = oooO0o.f27193OooO00o;
                View view = o0o0o00 == null ? null : o0o0o00.itemView;
                RecyclerView.o0O0O00 o0o0o01 = oooO0o.f27194OooO0O0;
                View view2 = o0o0o01 != null ? o0o0o01.itemView : null;
                ArrayList<RecyclerView.o0O0O00> arrayList2 = o0o0ooo.f27176OooOOO;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(o0o0ooo.f10688OooO0o);
                    arrayList2.add(oooO0o.f27193OooO00o);
                    duration.translationX(oooO0o.f27198OooO0o0 - oooO0o.f27195OooO0OO);
                    duration.translationY(oooO0o.f27197OooO0o - oooO0o.f27196OooO0Oo);
                    duration.alpha(0.0f).setListener(new o00O00(o0o0ooo, oooO0o, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(oooO0o.f27194OooO0O0);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(o0o0ooo.f10688OooO0o).alpha(1.0f).setListener(new o00O00O(o0o0ooo, oooO0o, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ ArrayList f27191OooO0Oo;

        public OooO0OO(ArrayList arrayList) {
            this.f27191OooO0Oo = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f27191OooO0Oo;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                o0O0ooO o0o0ooo = o0O0ooO.this;
                if (!zHasNext) {
                    arrayList.clear();
                    o0o0ooo.f27172OooO0oo.remove(arrayList);
                    return;
                }
                RecyclerView.o0O0O00 o0o0o00 = (RecyclerView.o0O0O00) it.next();
                o0o0ooo.getClass();
                View view = o0o0o00.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                o0o0ooo.f27174OooOO0O.add(o0o0o00);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(o0o0ooo.f10686OooO0OO).setListener(new o00O000(view, viewPropertyAnimatorAnimate, o0o0o00, o0o0ooo)).start();
            }
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RecyclerView.o0O0O00 f27193OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public RecyclerView.o0O0O00 f27194OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f27195OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f27196OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f27197OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f27198OooO0o0;

        public OooO0o(RecyclerView.o0O0O00 o0o0o00, RecyclerView.o0O0O00 o0o0o01, int i, int i2, int i3, int i4) {
            this.f27193OooO00o = o0o0o00;
            this.f27194OooO0O0 = o0o0o01;
            this.f27195OooO0OO = i;
            this.f27196OooO0Oo = i2;
            this.f27198OooO0o0 = i3;
            this.f27197OooO0o = i4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f27193OooO00o);
            sb.append(", newHolder=");
            sb.append(this.f27194OooO0O0);
            sb.append(", fromX=");
            sb.append(this.f27195OooO0OO);
            sb.append(", fromY=");
            sb.append(this.f27196OooO0Oo);
            sb.append(", toX=");
            sb.append(this.f27198OooO0o0);
            sb.append(", toY=");
            return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f27197OooO0o, '}');
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0oO(@NonNull RecyclerView.o0O0O00 o0o0o00, @NonNull List<Object> list) {
        return !list.isEmpty() || OooO0o(o0o0o00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void OooOO0(RecyclerView.o0O0O00 o0o0o00) {
        View view = o0o0o00.itemView;
        view.animate().cancel();
        ArrayList<OooO> arrayList = this.f27181OooOOo0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f27182OooO00o == o0o0o00) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                OooO0oo(o0o0o00);
                arrayList.remove(size);
            }
        }
        OooOo00(o0o0o00, this.f27180OooOOo);
        if (this.f27178OooOOOO.remove(o0o0o00)) {
            view.setAlpha(1.0f);
            OooO0oo(o0o0o00);
        }
        if (this.f27179OooOOOo.remove(o0o0o00)) {
            view.setAlpha(1.0f);
            OooO0oo(o0o0o00);
        }
        ArrayList<ArrayList<OooO0o>> arrayList2 = this.f27173OooOO0;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<OooO0o> arrayList3 = arrayList2.get(size2);
            OooOo00(o0o0o00, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<OooO>> arrayList4 = this.f27171OooO;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<OooO> arrayList5 = arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (arrayList5.get(size4).f27182OooO00o == o0o0o00) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    OooO0oo(o0o0o00);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.o0O0O00>> arrayList6 = this.f27172OooO0oo;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f27177OooOOO0.remove(o0o0o00);
                this.f27174OooOO0O.remove(o0o0o00);
                this.f27176OooOOO.remove(o0o0o00);
                this.f27175OooOO0o.remove(o0o0o00);
                OooOOoo();
                return;
            }
            ArrayList<RecyclerView.o0O0O00> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(o0o0o00)) {
                view.setAlpha(1.0f);
                OooO0oo(o0o0o00);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void OooOO0O() {
        ArrayList<OooO> arrayList = this.f27181OooOOo0;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            OooO oooO = arrayList.get(size);
            View view = oooO.f27182OooO00o.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            OooO0oo(oooO.f27182OooO00o);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.o0O0O00> arrayList2 = this.f27178OooOOOO;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            OooO0oo(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.o0O0O00> arrayList3 = this.f27179OooOOOo;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.o0O0O00 o0o0o00 = arrayList3.get(size3);
            o0o0o00.itemView.setAlpha(1.0f);
            OooO0oo(o0o0o00);
            arrayList3.remove(size3);
        }
        ArrayList<OooO0o> arrayList4 = this.f27180OooOOo;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            OooO0o oooO0o = arrayList4.get(size4);
            RecyclerView.o0O0O00 o0o0o01 = oooO0o.f27193OooO00o;
            if (o0o0o01 != null) {
                OooOo0(oooO0o, o0o0o01);
            }
            RecyclerView.o0O0O00 o0o0o02 = oooO0o.f27194OooO0O0;
            if (o0o0o02 != null) {
                OooOo0(oooO0o, o0o0o02);
            }
        }
        arrayList4.clear();
        if (!OooOO0o()) {
            return;
        }
        ArrayList<ArrayList<OooO>> arrayList5 = this.f27171OooO;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<OooO> arrayList6 = arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    OooO oooO2 = arrayList6.get(size6);
                    View view2 = oooO2.f27182OooO00o.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    OooO0oo(oooO2.f27182OooO00o);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.o0O0O00>> arrayList7 = this.f27172OooO0oo;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.o0O0O00> arrayList8 = arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.o0O0O00 o0o0o03 = arrayList8.get(size8);
                    o0o0o03.itemView.setAlpha(1.0f);
                    OooO0oo(o0o0o03);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList<ArrayList<OooO0o>> arrayList9 = this.f27173OooOO0;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                OooOOo(this.f27177OooOOO0);
                OooOOo(this.f27175OooOO0o);
                OooOOo(this.f27174OooOO0O);
                OooOOo(this.f27176OooOOO);
                OooO();
                return;
            }
            ArrayList<OooO0o> arrayList10 = arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    OooO0o oooO0o2 = arrayList10.get(size10);
                    RecyclerView.o0O0O00 o0o0o04 = oooO0o2.f27193OooO00o;
                    if (o0o0o04 != null) {
                        OooOo0(oooO0o2, o0o0o04);
                    }
                    RecyclerView.o0O0O00 o0o0o05 = oooO0o2.f27194OooO0O0;
                    if (o0o0o05 != null) {
                        OooOo0(oooO0o2, o0o0o05);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooOO0o() {
        return (this.f27179OooOOOo.isEmpty() && this.f27180OooOOo.isEmpty() && this.f27181OooOOo0.isEmpty() && this.f27178OooOOOO.isEmpty() && this.f27175OooOO0o.isEmpty() && this.f27177OooOOO0.isEmpty() && this.f27174OooOO0O.isEmpty() && this.f27176OooOOO.isEmpty() && this.f27171OooO.isEmpty() && this.f27172OooO0oo.isEmpty() && this.f27173OooOO0.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.o00000O0
    public final void OooOOO(RecyclerView.o0O0O00 o0o0o00) {
        OooOo0O(o0o0o00);
        o0o0o00.itemView.setAlpha(0.0f);
        this.f27179OooOOOo.add(o0o0o00);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void OooOOO0() {
        ArrayList<RecyclerView.o0O0O00> arrayList = this.f27178OooOOOO;
        boolean z = !arrayList.isEmpty();
        ArrayList<OooO> arrayList2 = this.f27181OooOOo0;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList<OooO0o> arrayList3 = this.f27180OooOOo;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList<RecyclerView.o0O0O00> arrayList4 = this.f27179OooOOOo;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.o0O0O00 o0o0o00 : arrayList) {
                View view = o0o0o00.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f27177OooOOO0.add(o0o0o00);
                viewPropertyAnimatorAnimate.setDuration(this.f10687OooO0Oo).alpha(0.0f).setListener(new o00oOoo(view, viewPropertyAnimatorAnimate, o0o0o00, this)).start();
            }
            arrayList.clear();
            if (z2) {
                ArrayList<OooO> arrayList5 = new ArrayList<>();
                arrayList5.addAll(arrayList2);
                this.f27171OooO.add(arrayList5);
                arrayList2.clear();
                OooO00o oooO00o = new OooO00o(arrayList5);
                if (z) {
                    View view2 = arrayList5.get(0).f27182OooO00o.itemView;
                    long j = this.f10687OooO0Oo;
                    WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOOO(view2, oooO00o, j);
                } else {
                    oooO00o.run();
                }
            }
            if (z3) {
                ArrayList<OooO0o> arrayList6 = new ArrayList<>();
                arrayList6.addAll(arrayList3);
                this.f27173OooOO0.add(arrayList6);
                arrayList3.clear();
                OooO0O0 oooO0O0 = new OooO0O0(arrayList6);
                if (z) {
                    View view3 = arrayList6.get(0).f27193OooO00o.itemView;
                    long j2 = this.f10687OooO0Oo;
                    WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
                    ViewCompat.OooO0o.OooOOO(view3, oooO0O0, j2);
                } else {
                    oooO0O0.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.o0O0O00> arrayList7 = new ArrayList<>();
                arrayList7.addAll(arrayList4);
                this.f27172OooO0oo.add(arrayList7);
                arrayList4.clear();
                OooO0OO oooO0OO = new OooO0OO(arrayList7);
                if (!z && !z2 && !z3) {
                    oooO0OO.run();
                    return;
                }
                long jMax = Math.max(z2 ? this.f10689OooO0o0 : 0L, z3 ? this.f10688OooO0o : 0L) + (z ? this.f10687OooO0Oo : 0L);
                View view4 = arrayList7.get(0).itemView;
                WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap3 = ViewCompat.f5341OooO00o;
                ViewCompat.OooO0o.OooOOO(view4, oooO0OO, jMax);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o00000O0
    public final boolean OooOOOO(RecyclerView.o0O0O00 o0o0o00, RecyclerView.o0O0O00 o0o0o01, int i, int i2, int i3, int i4) {
        if (o0o0o00 == o0o0o01) {
            return OooOOOo(o0o0o00, i, i2, i3, i4);
        }
        float translationX = o0o0o00.itemView.getTranslationX();
        float translationY = o0o0o00.itemView.getTranslationY();
        o0o0o00.itemView.getAlpha();
        OooOo0O(o0o0o00);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        o0o0o00.itemView.setTranslationX(translationX);
        o0o0o00.itemView.setTranslationY(translationY);
        o0o0o00.itemView.setAlpha(1.0f);
        if (o0o0o01 != null) {
            OooOo0O(o0o0o01);
            o0o0o01.itemView.setTranslationX(-i5);
            o0o0o01.itemView.setTranslationY(-i6);
            o0o0o01.itemView.setAlpha(1.0f);
        }
        this.f27180OooOOo.add(new OooO0o(o0o0o00, o0o0o01, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.o00000O0
    public final boolean OooOOOo(RecyclerView.o0O0O00 o0o0o00, int i, int i2, int i3, int i4) {
        View view = o0o0o00.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) o0o0o00.itemView.getTranslationY());
        OooOo0O(o0o0o00);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0oo(o0o0o00);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f27181OooOOo0.add(new OooO(o0o0o00, translationX, translationY, i3, i4));
        return true;
    }

    public final void OooOOo(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((RecyclerView.o0O0O00) arrayList.get(size)).itemView.animate().cancel();
            }
        }
    }

    @Override // androidx.recyclerview.widget.o00000O0
    public final void OooOOo0(RecyclerView.o0O0O00 o0o0o00) {
        OooOo0O(o0o0o00);
        this.f27178OooOOOO.add(o0o0o00);
    }

    public final void OooOOoo() {
        if (OooOO0o()) {
            return;
        }
        OooO();
    }

    public final boolean OooOo0(OooO0o oooO0o, RecyclerView.o0O0O00 o0o0o00) {
        if (oooO0o.f27194OooO0O0 == o0o0o00) {
            oooO0o.f27194OooO0O0 = null;
        } else {
            if (oooO0o.f27193OooO00o != o0o0o00) {
                return false;
            }
            oooO0o.f27193OooO00o = null;
        }
        o0o0o00.itemView.setAlpha(1.0f);
        o0o0o00.itemView.setTranslationX(0.0f);
        o0o0o00.itemView.setTranslationY(0.0f);
        OooO0oo(o0o0o00);
        return true;
    }

    public final void OooOo00(RecyclerView.o0O0O00 o0o0o00, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            OooO0o oooO0o = (OooO0o) arrayList.get(size);
            if (OooOo0(oooO0o, o0o0o00) && oooO0o.f27193OooO00o == null && oooO0o.f27194OooO0O0 == null) {
                arrayList.remove(oooO0o);
            }
        }
    }

    public final void OooOo0O(RecyclerView.o0O0O00 o0o0o00) {
        if (f27170OooOOoo == null) {
            f27170OooOOoo = new ValueAnimator().getInterpolator();
        }
        o0o0o00.itemView.animate().setInterpolator(f27170OooOOoo);
        OooOO0(o0o0o00);
    }
}
