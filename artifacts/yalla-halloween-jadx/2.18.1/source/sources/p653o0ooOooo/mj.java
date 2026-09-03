package p653o0ooOooo;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import p655o0ooo0.o00O0OO0;
import p657o0ooo00o.oO0O000o;

/* JADX INFO: loaded from: classes3.dex */
public final class mj {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO00o f51159OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SparseBooleanArray f51160OooO00o = new SparseBooleanArray();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public SparseArray<Float> f51161OooO0O0 = new SparseArray<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f51162OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f51163OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f51164OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f51165OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f51166OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f51167OooO0oo;

    public interface OooO00o {
    }

    public final void OooO00o(int i) {
        OooO00o oooO00o = this.f51159OooO;
        if (oooO00o != null) {
            int i2 = this.f51162OooO0OO;
            LinearLayout linearLayout = ((CommonNavigator) oooO00o).f26436Oooo0oO;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof oO0O000o) {
                    ((oO0O000o) childAt).OooO00o(i, i2);
                }
            }
        }
        this.f51160OooO00o.put(i, true);
    }

    public final void OooO0O0(int i, float f, boolean z, boolean z2) {
        if (this.f51167OooO0oo || i == this.f51163OooO0Oo || this.f51166OooO0oO == 1 || z2) {
            OooO00o oooO00o = this.f51159OooO;
            if (oooO00o != null) {
                int i2 = this.f51162OooO0OO;
                LinearLayout linearLayout = ((CommonNavigator) oooO00o).f26436Oooo0oO;
                if (linearLayout != null) {
                    KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof oO0O000o) {
                        ((oO0O000o) childAt).OooO0O0(i, i2, f, z);
                    }
                }
            }
            this.f51161OooO0O0.put(i, Float.valueOf(1.0f - f));
        }
    }

    public final void OooO0OO(int i, float f, boolean z, boolean z2) {
        if (!this.f51167OooO0oo && i != this.f51165OooO0o0 && this.f51166OooO0oO != 1) {
            int i2 = this.f51163OooO0Oo;
            if (((i != i2 - 1 && i != i2 + 1) || this.f51161OooO0O0.get(i, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)).floatValue() == 1.0f) && !z2) {
                return;
            }
        }
        OooO00o oooO00o = this.f51159OooO;
        if (oooO00o != null) {
            int i3 = this.f51162OooO0OO;
            LinearLayout linearLayout = ((CommonNavigator) oooO00o).f26436Oooo0oO;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof oO0O000o) {
                    ((oO0O000o) childAt).OooO0Oo(i, i3, f, z);
                }
            }
        }
        this.f51161OooO0O0.put(i, Float.valueOf(f));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    public final void OooO0Oo(int i) {
        OooO00o oooO00o = this.f51159OooO;
        if (oooO00o != null) {
            int i2 = this.f51162OooO0OO;
            CommonNavigator commonNavigator = (CommonNavigator) oooO00o;
            LinearLayout linearLayout = commonNavigator.f26436Oooo0oO;
            if (linearLayout != null) {
                KeyEvent.Callback childAt = linearLayout.getChildAt(i);
                if (childAt instanceof oO0O000o) {
                    ((oO0O000o) childAt).OooO0OO(i, i2);
                }
                if (!commonNavigator.f26441OoooO0O && !commonNavigator.f26443OoooOOO && commonNavigator.f26435Oooo0o != null && commonNavigator.f26448Ooooo00.size() > 0) {
                    o00O0OO0 o00o0oo1 = (o00O0OO0) commonNavigator.f26448Ooooo00.get(Math.min(commonNavigator.f26448Ooooo00.size() - 1, i));
                    if (commonNavigator.f26438OoooO) {
                        float fOooO00o = o00o0oo1.OooO00o() - (commonNavigator.f26435Oooo0o.getWidth() * commonNavigator.f26442OoooOO0);
                        if (commonNavigator.f26450o000oOoO) {
                            commonNavigator.f26435Oooo0o.smoothScrollTo((int) fOooO00o, 0);
                        } else {
                            commonNavigator.f26435Oooo0o.scrollTo((int) fOooO00o, 0);
                        }
                    } else {
                        int scrollX = commonNavigator.f26435Oooo0o.getScrollX();
                        int i3 = o00o0oo1.f51172OooO00o;
                        if (scrollX <= i3) {
                            int width = commonNavigator.getWidth() + commonNavigator.f26435Oooo0o.getScrollX();
                            int i4 = o00o0oo1.f51174OooO0OO;
                            if (width < i4) {
                                if (commonNavigator.f26450o000oOoO) {
                                    commonNavigator.f26435Oooo0o.smoothScrollTo(i4 - commonNavigator.getWidth(), 0);
                                } else {
                                    commonNavigator.f26435Oooo0o.scrollTo(i4 - commonNavigator.getWidth(), 0);
                                }
                            }
                        } else if (commonNavigator.f26450o000oOoO) {
                            commonNavigator.f26435Oooo0o.smoothScrollTo(i3, 0);
                        } else {
                            commonNavigator.f26435Oooo0o.scrollTo(i3, 0);
                        }
                    }
                }
            }
        }
        this.f51160OooO00o.put(i, false);
    }

    public final void OooO0o0(int i) {
        this.f51162OooO0OO = i;
        this.f51160OooO00o.clear();
        this.f51161OooO0O0.clear();
    }
}
