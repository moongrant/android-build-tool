package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends o00000 {

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static TimeInterpolator f8894OooOOoo;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ArrayList<RecyclerView.oo0o0Oo> f8896OooO0oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList<RecyclerView.oo0o0Oo> f8895OooO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ArrayList<OooO> f8897OooOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList<OooO0o> f8898OooOO0O = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.oo0o0Oo>> f8899OooOO0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList<ArrayList<OooO>> f8901OooOOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList<ArrayList<OooO0o>> f8900OooOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ArrayList<RecyclerView.oo0o0Oo> f8902OooOOOO = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public ArrayList<RecyclerView.oo0o0Oo> f8903OooOOOo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList<RecyclerView.oo0o0Oo> f8905OooOOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ArrayList<RecyclerView.oo0o0Oo> f8904OooOOo = new ArrayList<>();

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RecyclerView.oo0o0Oo f8906OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8907OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8908OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8909OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8910OooO0o0;

        public OooO(RecyclerView.oo0o0Oo oo0o0oo, int i, int i2, int i3, int i4) {
            this.f8906OooO00o = oo0o0oo;
            this.f8907OooO0O0 = i;
            this.f8908OooO0OO = i2;
            this.f8909OooO0Oo = i3;
            this.f8910OooO0o0 = i4;
        }
    }

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8911Oooo0o;

        public OooO00o(ArrayList arrayList) {
            this.f8911Oooo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (OooO oooO : this.f8911Oooo0o) {
                OooOO0 oooOO1 = OooOO0.this;
                RecyclerView.oo0o0Oo oo0o0oo = oooO.f8906OooO00o;
                int i = oooO.f8907OooO0O0;
                int i2 = oooO.f8908OooO0OO;
                int i3 = oooO.f8909OooO0Oo;
                int i4 = oooO.f8910OooO0o0;
                Objects.requireNonNull(oooOO1);
                View view = oo0o0oo.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                if (i6 != 0) {
                    view.animate().translationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                oooOO1.f8903OooOOOo.add(oo0o0oo);
                viewPropertyAnimatorAnimate.setDuration(oooOO1.f9013OooO0o0).setListener(new OooOOO(oooOO1, oo0o0oo, i5, view, i6, viewPropertyAnimatorAnimate)).start();
            }
            this.f8911Oooo0o.clear();
            OooOO0.this.f8901OooOOO0.remove(this.f8911Oooo0o);
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8913Oooo0o;

        public OooO0O0(ArrayList arrayList) {
            this.f8913Oooo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (OooO0o oooO0o : this.f8913Oooo0o) {
                OooOO0 oooOO1 = OooOO0.this;
                Objects.requireNonNull(oooOO1);
                RecyclerView.oo0o0Oo oo0o0oo = oooO0o.f8917OooO00o;
                View view = oo0o0oo == null ? null : oo0o0oo.itemView;
                RecyclerView.oo0o0Oo oo0o0oo2 = oooO0o.f8918OooO0O0;
                View view2 = oo0o0oo2 != null ? oo0o0oo2.itemView : null;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(oooOO1.f9012OooO0o);
                    oooOO1.f8904OooOOo.add(oooO0o.f8917OooO00o);
                    duration.translationX(oooO0o.f8922OooO0o0 - oooO0o.f8919OooO0OO);
                    duration.translationY(oooO0o.f8921OooO0o - oooO0o.f8920OooO0Oo);
                    duration.alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setListener(new OooOOOO(oooOO1, oooO0o, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    oooOO1.f8904OooOOo.add(oooO0o.f8918OooO0O0);
                    viewPropertyAnimatorAnimate.translationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).translationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(oooOO1.f9012OooO0o).alpha(1.0f).setListener(new OooOo00(oooOO1, oooO0o, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
            this.f8913Oooo0o.clear();
            OooOO0.this.f8900OooOOO.remove(this.f8913Oooo0o);
        }
    }

    public class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f8915Oooo0o;

        public OooO0OO(ArrayList arrayList) {
            this.f8915Oooo0o = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (RecyclerView.oo0o0Oo oo0o0oo : this.f8915Oooo0o) {
                OooOO0 oooOO1 = OooOO0.this;
                Objects.requireNonNull(oooOO1);
                View view = oo0o0oo.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                oooOO1.f8902OooOOOO.add(oo0o0oo);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(oooOO1.f9010OooO0OO).setListener(new OooOOO0(oooOO1, oo0o0oo, view, viewPropertyAnimatorAnimate)).start();
            }
            this.f8915Oooo0o.clear();
            OooOO0.this.f8899OooOO0o.remove(this.f8915Oooo0o);
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public RecyclerView.oo0o0Oo f8917OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public RecyclerView.oo0o0Oo f8918OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8919OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8920OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f8921OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f8922OooO0o0;

        public OooO0o(RecyclerView.oo0o0Oo oo0o0oo, RecyclerView.oo0o0Oo oo0o0oo2, int i, int i2, int i3, int i4) {
            this.f8917OooO00o = oo0o0oo;
            this.f8918OooO0O0 = oo0o0oo2;
            this.f8919OooO0OO = i;
            this.f8920OooO0Oo = i2;
            this.f8922OooO0o0 = i3;
            this.f8921OooO0o = i4;
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ChangeInfo{oldHolder=");
            sbOooO0o0.append(this.f8917OooO00o);
            sbOooO0o0.append(", newHolder=");
            sbOooO0o0.append(this.f8918OooO0O0);
            sbOooO0o0.append(", fromX=");
            sbOooO0o0.append(this.f8919OooO0OO);
            sbOooO0o0.append(", fromY=");
            sbOooO0o0.append(this.f8920OooO0Oo);
            sbOooO0o0.append(", toX=");
            sbOooO0o0.append(this.f8922OooO0o0);
            sbOooO0o0.append(", toY=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.f8921OooO0o, '}');
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooO0oO(@NonNull RecyclerView.oo0o0Oo oo0o0oo, @NonNull List<Object> list) {
        return !list.isEmpty() || OooO0o(oo0o0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void OooOO0(RecyclerView.oo0o0Oo oo0o0oo) {
        View view = oo0o0oo.itemView;
        view.animate().cancel();
        int size = this.f8897OooOO0.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f8897OooOO0.get(size).f8906OooO00o == oo0o0oo) {
                view.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                view.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                OooO0oo(oo0o0oo);
                this.f8897OooOO0.remove(size);
            }
        }
        OooOo00(this.f8898OooOO0O, oo0o0oo);
        if (this.f8896OooO0oo.remove(oo0o0oo)) {
            view.setAlpha(1.0f);
            OooO0oo(oo0o0oo);
        }
        if (this.f8895OooO.remove(oo0o0oo)) {
            view.setAlpha(1.0f);
            OooO0oo(oo0o0oo);
        }
        for (int size2 = this.f8900OooOOO.size() - 1; size2 >= 0; size2--) {
            ArrayList<OooO0o> arrayList = this.f8900OooOOO.get(size2);
            OooOo00(arrayList, oo0o0oo);
            if (arrayList.isEmpty()) {
                this.f8900OooOOO.remove(size2);
            }
        }
        for (int size3 = this.f8901OooOOO0.size() - 1; size3 >= 0; size3--) {
            ArrayList<OooO> arrayList2 = this.f8901OooOOO0.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f8906OooO00o == oo0o0oo) {
                    view.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    view.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    OooO0oo(oo0o0oo);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f8901OooOOO0.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f8899OooOO0o.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.oo0o0Oo> arrayList3 = this.f8899OooOO0o.get(size5);
            if (arrayList3.remove(oo0o0oo)) {
                view.setAlpha(1.0f);
                OooO0oo(oo0o0oo);
                if (arrayList3.isEmpty()) {
                    this.f8899OooOO0o.remove(size5);
                }
            }
        }
        this.f8905OooOOo0.remove(oo0o0oo);
        this.f8902OooOOOO.remove(oo0o0oo);
        this.f8904OooOOo.remove(oo0o0oo);
        this.f8903OooOOOo.remove(oo0o0oo);
        OooOOoo();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void OooOO0O() {
        int size = this.f8897OooOO0.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            OooO oooO = this.f8897OooOO0.get(size);
            View view = oooO.f8906OooO00o.itemView;
            view.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            view.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            OooO0oo(oooO.f8906OooO00o);
            this.f8897OooOO0.remove(size);
        }
        int size2 = this.f8896OooO0oo.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            OooO0oo(this.f8896OooO0oo.get(size2));
            this.f8896OooO0oo.remove(size2);
        }
        int size3 = this.f8895OooO.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.oo0o0Oo oo0o0oo = this.f8895OooO.get(size3);
            oo0o0oo.itemView.setAlpha(1.0f);
            OooO0oo(oo0o0oo);
            this.f8895OooO.remove(size3);
        }
        int size4 = this.f8898OooOO0O.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            OooO0o oooO0o = this.f8898OooOO0O.get(size4);
            RecyclerView.oo0o0Oo oo0o0oo2 = oooO0o.f8917OooO00o;
            if (oo0o0oo2 != null) {
                OooOo0(oooO0o, oo0o0oo2);
            }
            RecyclerView.oo0o0Oo oo0o0oo3 = oooO0o.f8918OooO0O0;
            if (oo0o0oo3 != null) {
                OooOo0(oooO0o, oo0o0oo3);
            }
        }
        this.f8898OooOO0O.clear();
        if (!OooOO0o()) {
            return;
        }
        int size5 = this.f8901OooOOO0.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<OooO> arrayList = this.f8901OooOOO0.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    OooO oooO2 = arrayList.get(size6);
                    View view2 = oooO2.f8906OooO00o.itemView;
                    view2.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    view2.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    OooO0oo(oooO2.f8906OooO00o);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f8901OooOOO0.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f8899OooOO0o.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.oo0o0Oo> arrayList2 = this.f8899OooOO0o.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.oo0o0Oo oo0o0oo4 = arrayList2.get(size8);
                    oo0o0oo4.itemView.setAlpha(1.0f);
                    OooO0oo(oo0o0oo4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f8899OooOO0o.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f8900OooOOO.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                OooOOo(this.f8905OooOOo0);
                OooOOo(this.f8903OooOOOo);
                OooOOo(this.f8902OooOOOO);
                OooOOo(this.f8904OooOOo);
                OooO();
                return;
            }
            ArrayList<OooO0o> arrayList3 = this.f8900OooOOO.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    OooO0o oooO0o2 = arrayList3.get(size10);
                    RecyclerView.oo0o0Oo oo0o0oo5 = oooO0o2.f8917OooO00o;
                    if (oo0o0oo5 != null) {
                        OooOo0(oooO0o2, oo0o0oo5);
                    }
                    RecyclerView.oo0o0Oo oo0o0oo6 = oooO0o2.f8918OooO0O0;
                    if (oo0o0oo6 != null) {
                        OooOo0(oooO0o2, oo0o0oo6);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f8900OooOOO.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean OooOO0o() {
        return (this.f8895OooO.isEmpty() && this.f8898OooOO0O.isEmpty() && this.f8897OooOO0.isEmpty() && this.f8896OooO0oo.isEmpty() && this.f8903OooOOOo.isEmpty() && this.f8905OooOOo0.isEmpty() && this.f8902OooOOOO.isEmpty() && this.f8904OooOOo.isEmpty() && this.f8901OooOOO0.isEmpty() && this.f8899OooOO0o.isEmpty() && this.f8900OooOOO.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.o00000
    public final void OooOOO(RecyclerView.oo0o0Oo oo0o0oo) {
        OooOo0O(oo0o0oo);
        oo0o0oo.itemView.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f8895OooO.add(oo0o0oo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void OooOOO0() {
        boolean z = !this.f8896OooO0oo.isEmpty();
        boolean z2 = !this.f8897OooOO0.isEmpty();
        boolean z3 = !this.f8898OooOO0O.isEmpty();
        boolean z4 = !this.f8895OooO.isEmpty();
        if (z || z2 || z4 || z3) {
            for (RecyclerView.oo0o0Oo oo0o0oo : this.f8896OooO0oo) {
                View view = oo0o0oo.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                this.f8905OooOOo0.add(oo0o0oo);
                viewPropertyAnimatorAnimate.setDuration(this.f9011OooO0Oo).alpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setListener(new OooOO0O(this, oo0o0oo, viewPropertyAnimatorAnimate, view)).start();
            }
            this.f8896OooO0oo.clear();
            if (z2) {
                ArrayList<OooO> arrayList = new ArrayList<>();
                arrayList.addAll(this.f8897OooOO0);
                this.f8901OooOOO0.add(arrayList);
                this.f8897OooOO0.clear();
                OooO00o oooO00o = new OooO00o(arrayList);
                if (z) {
                    View view2 = arrayList.get(0).f8906OooO00o.itemView;
                    long j = this.f9011OooO0Oo;
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOOO(view2, oooO00o, j);
                } else {
                    oooO00o.run();
                }
            }
            if (z3) {
                ArrayList<OooO0o> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f8898OooOO0O);
                this.f8900OooOOO.add(arrayList2);
                this.f8898OooOO0O.clear();
                OooO0O0 oooO0O0 = new OooO0O0(arrayList2);
                if (z) {
                    View view3 = arrayList2.get(0).f8917OooO00o.itemView;
                    long j2 = this.f9011OooO0Oo;
                    WeakHashMap<View, o000O0O0.o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                    ViewCompat.OooO0o.OooOOO(view3, oooO0O0, j2);
                } else {
                    oooO0O0.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.oo0o0Oo> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f8895OooO);
                this.f8899OooOO0o.add(arrayList3);
                this.f8895OooO.clear();
                OooO0OO oooO0OO = new OooO0OO(arrayList3);
                if (!z && !z2 && !z3) {
                    oooO0OO.run();
                    return;
                }
                long jMax = Math.max(z2 ? this.f9013OooO0o0 : 0L, z3 ? this.f9012OooO0o : 0L) + (z ? this.f9011OooO0Oo : 0L);
                View view4 = arrayList3.get(0).itemView;
                WeakHashMap<View, o000O0O0.o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                ViewCompat.OooO0o.OooOOO(view4, oooO0OO, jMax);
            }
        }
    }

    @Override // androidx.recyclerview.widget.o00000
    public final boolean OooOOOO(RecyclerView.oo0o0Oo oo0o0oo, RecyclerView.oo0o0Oo oo0o0oo2, int i, int i2, int i3, int i4) {
        if (oo0o0oo == oo0o0oo2) {
            return OooOOOo(oo0o0oo, i, i2, i3, i4);
        }
        float translationX = oo0o0oo.itemView.getTranslationX();
        float translationY = oo0o0oo.itemView.getTranslationY();
        float alpha = oo0o0oo.itemView.getAlpha();
        OooOo0O(oo0o0oo);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        oo0o0oo.itemView.setTranslationX(translationX);
        oo0o0oo.itemView.setTranslationY(translationY);
        oo0o0oo.itemView.setAlpha(alpha);
        if (oo0o0oo2 != null) {
            OooOo0O(oo0o0oo2);
            oo0o0oo2.itemView.setTranslationX(-i5);
            oo0o0oo2.itemView.setTranslationY(-i6);
            oo0o0oo2.itemView.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        this.f8898OooOO0O.add(new OooO0o(oo0o0oo, oo0o0oo2, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.o00000
    public final boolean OooOOOo(RecyclerView.oo0o0Oo oo0o0oo, int i, int i2, int i3, int i4) {
        View view = oo0o0oo.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) oo0o0oo.itemView.getTranslationY());
        OooOo0O(oo0o0oo);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            OooO0oo(oo0o0oo);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f8897OooOO0.add(new OooO(oo0o0oo, translationX, translationY, i3, i4));
        return true;
    }

    public final void OooOOo(List<RecyclerView.oo0o0Oo> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.o00000
    public final void OooOOo0(RecyclerView.oo0o0Oo oo0o0oo) {
        OooOo0O(oo0o0oo);
        this.f8896OooO0oo.add(oo0o0oo);
    }

    public final void OooOOoo() {
        if (OooOO0o()) {
            return;
        }
        OooO();
    }

    public final boolean OooOo0(OooO0o oooO0o, RecyclerView.oo0o0Oo oo0o0oo) {
        if (oooO0o.f8918OooO0O0 == oo0o0oo) {
            oooO0o.f8918OooO0O0 = null;
        } else {
            if (oooO0o.f8917OooO00o != oo0o0oo) {
                return false;
            }
            oooO0o.f8917OooO00o = null;
        }
        oo0o0oo.itemView.setAlpha(1.0f);
        oo0o0oo.itemView.setTranslationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        oo0o0oo.itemView.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        OooO0oo(oo0o0oo);
        return true;
    }

    public final void OooOo00(List<OooO0o> list, RecyclerView.oo0o0Oo oo0o0oo) {
        for (int size = list.size() - 1; size >= 0; size--) {
            OooO0o oooO0o = list.get(size);
            if (OooOo0(oooO0o, oo0o0oo) && oooO0o.f8917OooO00o == null && oooO0o.f8918OooO0O0 == null) {
                list.remove(oooO0o);
            }
        }
    }

    public final void OooOo0O(RecyclerView.oo0o0Oo oo0o0oo) {
        if (f8894OooOOoo == null) {
            f8894OooOOoo = new ValueAnimator().getInterpolator();
        }
        oo0o0oo.itemView.animate().setInterpolator(f8894OooOOoo);
        OooOO0(oo0o0oo);
    }
}
