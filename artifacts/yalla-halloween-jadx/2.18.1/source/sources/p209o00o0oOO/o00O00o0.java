package p209o00o0oOO;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import com.billy.android.swipe.SmartSwipeWrapper;
import com.billy.android.swipe.internal.ScrimView;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.KotlinVersion;
import p210o00o0oOo.oo00o;
import p211o00o0oo.o00O0O00;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O00o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33350OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SmartSwipeWrapper f33351OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f33352OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33353OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33354OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33356OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33357OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33358OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f33359OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33360OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o00O0O00 f33361OooOO0o;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f33365OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public oo00o f33367OooOOo0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f33363OooOOO0 = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f33362OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final List<p213o00o0ooo.o00O0O00> f33364OooOOOO = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f33366OooOOo = KotlinVersion.MAX_COMPONENT_VALUE;

    /* JADX WARN: Code duplicated, block: B:13:0x001c  */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (((r4.f33362OooOOO & 8) != 0) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO(float f) {
        if (this.f33355OooO0o == 0) {
            if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || !OooOOOO()) {
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOO0()) {
                }
                return 0;
            }
            if ((this.f33362OooOOO & 4) != 0) {
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                }
                return 0;
            }
        }
        return OooO0oo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public final o00O00o0 OooO00o(p213o00o0ooo.o00O0O00 o00o0o01) {
        if (!this.f33364OooOOOO.contains(o00o0o01)) {
            this.f33364OooOOOO.add(o00o0o01);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    public final int OooO0O0(int i, float f, float f2, float f3, float f4) {
        boolean z;
        int i2;
        if (this.f33352OooO0O0 == 0 && ((i == -2 && (this.f33366OooOOo & 15) == 0) || (i == -3 && ((this.f33366OooOOo >> 4) & 15) == 0))) {
            return 0;
        }
        float fAbs = Math.abs(f3);
        float fAbs2 = Math.abs(f4);
        if (this.f33356OooO0o0 != 0 || this.f33355OooO0o != 0) {
            if (f3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return 0;
            }
            int i3 = this.f33352OooO0O0;
            if ((((i3 & 3) <= 0 || fAbs <= fAbs2) && ((i3 & 12) <= 0 || fAbs >= fAbs2)) || OooOO0O(i3) || OooOOO0(i, this.f33352OooO0O0) || OooO0OO(this.f33351OooO00o, this.f33352OooO0O0, i, f, f2, f3, f4)) {
                return 0;
            }
            return this.f33352OooO0O0;
        }
        if (fAbs == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && fAbs2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            z = false;
            i2 = 0;
        } else {
            if (fAbs > fAbs2) {
                if (f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOO0o()) {
                    z = true;
                    i2 = 1;
                } else if (f3 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || !OooOOO()) {
                    z = false;
                    i2 = 0;
                } else {
                    z = true;
                    i2 = 2;
                }
            } else if (f4 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOOOO()) {
                z = true;
                i2 = 4;
            } else if (f4 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || !OooOO0()) {
                z = false;
                i2 = 0;
            } else {
                z = true;
                i2 = 8;
            }
            if (z) {
                z = !OooO0OO(this.f33351OooO00o, i2, i, f, f2, f3, f4);
            }
        }
        if (!z) {
            return 0;
        }
        if (i == -3) {
            if (((this.f33366OooOOo >> 4) & i2) == i2) {
                return i2;
            }
        }
        if (OooOO0O(i2) || OooOOO0(i, i2)) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00e8 A[EDGE_INSN: B:71:0x00e8->B:77:0x00f4 BREAK  A[LOOP:1: B:34:0x007b->B:96:0x007b]] */
    public final boolean OooO0OO(ViewGroup viewGroup, int i, int i2, float f, float f2, float f3, float f4) {
        View childAt;
        o00O00o0 o00o00o1;
        int i3 = (int) f;
        int i4 = (int) f2;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                childAt = null;
                break;
            }
            childAt = viewGroup.getChildAt(childCount);
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom() && childAt.getVisibility() == 0 && (!(childAt instanceof ScrimView) || childAt.isFocusable() || childAt.isClickable())) {
                break;
            }
            childCount--;
        }
        View view = childAt;
        boolean zCanScrollHorizontally = false;
        if (view instanceof SmartSwipeWrapper) {
            SmartSwipeWrapper smartSwipeWrapper = (SmartSwipeWrapper) view;
            o00O0O00 o00o0o01 = smartSwipeWrapper.mHelper;
            if (o00o0o01 != null && (o00o00o1 = o00o0o01.f33382OooOOO) != null) {
                if (o00o00o1.OooO0O0(i2, f, f2, f3, f4) != 0 && o00o00o1.f33360OooOO0O < 1.0f) {
                    zCanScrollHorizontally = true;
                    break;
                }
            } else {
                for (o00O00o0 o00o00o2 : smartSwipeWrapper.getAllConsumers()) {
                    if (o00o00o2 != null && o00o00o2.OooO0O0(i2, f, f2, f3, f4) != 0) {
                        zCanScrollHorizontally = true;
                        break;
                    }
                }
            }
        } else if (view != null) {
            if (i == 1 || i == 2) {
                if (view instanceof AbsSeekBar) {
                    AbsSeekBar absSeekBar = (AbsSeekBar) view;
                    int progress = absSeekBar.getProgress();
                    int min = Build.VERSION.SDK_INT >= 26 ? absSeekBar.getMin() : 0;
                    int max = absSeekBar.getMax();
                    if ((f3 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && progress < max) || (f3 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && progress > min)) {
                        zCanScrollHorizontally = true;
                        break;
                    }
                } else {
                    zCanScrollHorizontally = view.canScrollHorizontally(f3 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : -1);
                }
            } else if (i == 4 || i == 8) {
                int i5 = f4 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? 1 : -1;
                zCanScrollHorizontally = view instanceof AbsListView ? ((AbsListView) view).canScrollList(i5) : view.canScrollVertically(i5);
            }
        }
        return (zCanScrollHorizontally || !(view instanceof ViewGroup)) ? zCanScrollHorizontally : OooO0OO((ViewGroup) view, i, i2, f - view.getLeft(), f2 - view.getTop(), f3, f4);
    }

    public final int OooO0Oo(int i) {
        int i2 = this.f33353OooO0OO;
        if (i2 != 0) {
            i += i2;
            this.f33353OooO0OO = 0;
        }
        if ((this.f33352OooO0O0 & 1) > 0 && OooOO0o()) {
            return oOO00O.OooO0O0(i, 0, this.f33358OooO0oo);
        }
        if ((this.f33352OooO0O0 & 2) <= 0 || !OooOOO()) {
            return 0;
        }
        return oOO00O.OooO0O0(i, -this.f33358OooO0oo, 0);
    }

    public final o00O00o0 OooO0o() {
        if (this.f33352OooO0O0 != 0 && this.f33360OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            OooOOoo();
            this.f33353OooO0OO = 0;
            this.f33354OooO0Oo = 0;
            if (!OooOO0O(this.f33352OooO0O0)) {
                this.f33362OooOOO = this.f33352OooO0O0 | this.f33362OooOOO;
                OooO00o(new o00O00OO(this));
            }
            OooOo0O(0, 0, 0, 0);
        }
        return this;
    }

    public final int OooO0o0(int i) {
        int i2 = this.f33354OooO0Oo;
        if (i2 != 0) {
            i += i2;
            this.f33354OooO0Oo = 0;
        }
        if ((this.f33352OooO0O0 & 4) > 0 && OooOOOO()) {
            return oOO00O.OooO0O0(i, 0, this.f33358OooO0oo);
        }
        if ((this.f33352OooO0O0 & 8) <= 0 || !OooOO0()) {
            return 0;
        }
        return oOO00O.OooO0O0(i, -this.f33358OooO0oo, 0);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (((r4.f33362OooOOO & 2) != 0) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO0oO(float f) {
        if (this.f33356OooO0o0 == 0) {
            if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || !OooOO0o()) {
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && OooOOO()) {
                }
                return 0;
            }
            if ((this.f33362OooOOO & 1) != 0) {
                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                }
                return 0;
            }
        }
        return OooO0oo();
    }

    public final int OooO0oo() {
        oo00o oo00oVar = this.f33367OooOOo0;
        if (oo00oVar == null) {
            return this.f33365OooOOOo;
        }
        float f = this.f33365OooOOOo;
        Objects.requireNonNull(oo00oVar);
        return (int) (f / 0.5f);
    }

    public final boolean OooOO0() {
        return (this.f33363OooOOO0 & 8) != 0;
    }

    public final boolean OooOO0O(int i) {
        return i != 0 && (this.f33362OooOOO & i) == i;
    }

    public final boolean OooOO0o() {
        return (this.f33363OooOOO0 & 1) != 0;
    }

    public final boolean OooOOO() {
        return (this.f33363OooOOO0 & 2) != 0;
    }

    public final boolean OooOOO0(int i, int i2) {
        if (i == -2) {
            if (!((this.f33366OooOOo & i2) == i2)) {
                return true;
            }
        }
        if (i == -3) {
            if (!(((this.f33366OooOOo >> 4) & i2) == i2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooOOOO() {
        return (this.f33363OooOOO0 & 4) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public void OooOOOo() {
        for (p213o00o0ooo.o00O0O00 o00o0o01 : this.f33364OooOOOO) {
            if (o00o0o01 != null) {
                o00o0o01.OooO0o0();
            }
        }
        this.f33352OooO0O0 = 0;
        this.f33360OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f33350OooO = 0;
        this.f33356OooO0o0 = 0;
        this.f33353OooO0OO = 0;
        this.f33359OooOO0 = 0;
        this.f33355OooO0o = 0;
        this.f33354OooO0Oo = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void OooOOo() {
        for (p213o00o0ooo.o00O0O00 o00o0o01 : this.f33364OooOOOO) {
            if (o00o0o01 != null) {
                o00o0o01.OooO0O0();
            }
        }
    }

    public abstract void OooOOo0(int i, int i2);

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void OooOOoo() {
        ViewParent parent = this.f33351OooO00o.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        int i = this.f33356OooO0o0;
        if (i != 0 || this.f33355OooO0o != 0) {
            this.f33353OooO0OO = i;
            this.f33354OooO0Oo = this.f33355OooO0o;
        }
        int iOooO0oo = OooO0oo();
        this.f33357OooO0oO = iOooO0oo;
        this.f33358OooO0oo = iOooO0oo;
        for (p213o00o0ooo.o00O0O00 o00o0o01 : this.f33364OooOOOO) {
            if (o00o0o01 != null) {
                o00o0o01.OooO0OO();
            }
        }
    }

    public final o00O00o0 OooOo0(float f) {
        oOO00O.OooO00o oooO00o = oOO00O.f33368OooO00o;
        int iMax = (int) (this.f33357OooO0oO * Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(f, 1.0f)));
        int i = this.f33352OooO0O0;
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    iMax = i != 8 ? 0 : -iMax;
                }
                i2 = iMax;
                iMax = 0;
            } else {
                iMax = -iMax;
            }
        }
        o00O0O00 o00o0o01 = this.f33361OooOO0o;
        if (o00o0o01 != null && this.f33351OooO00o != null) {
            o00o0o01.OooOOo0(iMax, i2);
            this.f33351OooO00o.postInvalidateOnAnimation();
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List<o00o0ooo.o00O0O00>, java.util.concurrent.CopyOnWriteArrayList] */
    public final void OooOo00(int i, int i2, int i3, int i4) {
        if (this.f33365OooOOOo <= 0) {
            return;
        }
        float f = this.f33360OooOO0O;
        if (i != this.f33356OooO0o0 || i2 != this.f33355OooO0o) {
            this.f33356OooO0o0 = i;
            this.f33355OooO0o = i2;
            int i5 = this.f33357OooO0oO;
            if (i5 <= 0) {
                this.f33360OooOO0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                int i6 = this.f33352OooO0O0;
                if (i6 == 1 || i6 == 2) {
                    this.f33360OooOO0O = Math.abs(i / i5);
                } else if (i6 == 4 || i6 == 8) {
                    this.f33360OooOO0O = Math.abs(i2 / i5);
                }
            }
            int i7 = this.f33352OooO0O0;
            if ((i7 & 3) > 0) {
                if (this.f33367OooOOo0 != null) {
                    i = (int) (i * 0.5f);
                }
                this.f33350OooO = i;
            } else if ((i7 & 12) > 0) {
                if (this.f33367OooOOo0 != null) {
                    i2 = (int) (i2 * 0.5f);
                }
                this.f33359OooOO0 = i2;
            }
            OooOOo0(this.f33350OooO, this.f33359OooOO0);
        }
        if (this.f33360OooOO0O != f) {
            int i8 = this.f33361OooOO0o.f33372OooO0O0;
            for (p213o00o0ooo.o00O0O00 o00o0o01 : this.f33364OooOOOO) {
                if (o00o0o01 != null) {
                    o00o0o01.OooO0o(this.f33351OooO00o, this.f33360OooOO0O);
                }
            }
        }
    }

    public final void OooOo0O(int i, int i2, int i3, int i4) {
        o00O0O00 o00o0o01 = this.f33361OooOO0o;
        if (o00o0o01 == null || this.f33351OooO00o == null) {
            return;
        }
        o00o0o01.f33385OooOOOo = i;
        o00o0o01.f33386OooOOo0 = i2;
        o00o0o01.OooOOo0(i3, i4);
        this.f33351OooO00o.postInvalidateOnAnimation();
    }
}
