package net.lucode.hackware.magicindicator.buildins.commonnavigator;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p653o0ooOooo.mj;
import p653o0ooOooo.nj;
import p653o0ooOooo.oj;
import p655o0ooo0.o00O0OO0;
import p656o0ooo000.Oooo0;
import p657o0ooo00o.oO0;
import p657o0ooo00o.oO0O000;
import p657o0ooo00o.oOo000o0;

/* JADX INFO: loaded from: classes3.dex */
public class CommonNavigator extends FrameLayout implements Oooo0, mj.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public oO0O000 f26434Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public HorizontalScrollView f26435Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public LinearLayout f26436Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public LinearLayout f26437Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f26438OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public mj f26439OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public oOo000o0 f26440OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f26441OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f26442OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f26443OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f26444OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f26445OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f26446OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f26447OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public List<o00O0OO0> f26448Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO00o f26449Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f26450o000oOoO;

    public class OooO00o extends DataSetObserver {
        public OooO00o() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            CommonNavigator commonNavigator = CommonNavigator.this;
            commonNavigator.f26439OoooO0.OooO0o0(commonNavigator.f26440OoooO00.OooO00o());
            CommonNavigator.this.OooO0OO();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
        }
    }

    public CommonNavigator(Context context) {
        super(context);
        this.f26442OoooOO0 = 0.5f;
        this.f26450o000oOoO = true;
        this.f26443OoooOOO = true;
        this.f26447OoooOoo = true;
        this.f26448Ooooo00 = new ArrayList();
        this.f26449Ooooo0o = new OooO00o();
        mj mjVar = new mj();
        this.f26439OoooO0 = mjVar;
        mjVar.f51159OooO = this;
    }

    @Override // p656o0ooo000.Oooo0
    public final void OooO00o() {
        OooO0OO();
    }

    @Override // p656o0ooo000.Oooo0
    public final void OooO0O0() {
    }

    public final void OooO0OO() {
        LinearLayout.LayoutParams layoutParams;
        removeAllViews();
        View viewInflate = this.f26441OoooO0O ? LayoutInflater.from(getContext()).inflate(oj.pager_navigator_layout_no_scroll, this) : LayoutInflater.from(getContext()).inflate(oj.pager_navigator_layout, this);
        this.f26435Oooo0o = (HorizontalScrollView) viewInflate.findViewById(nj.scroll_view);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(nj.title_container);
        this.f26436Oooo0oO = linearLayout;
        linearLayout.setPadding(this.f26445OoooOo0, 0, this.f26444OoooOOo, 0);
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(nj.indicator_container);
        this.f26437Oooo0oo = linearLayout2;
        if (this.f26446OoooOoO) {
            linearLayout2.getParent().bringChildToFront(this.f26437Oooo0oo);
        }
        int i = this.f26439OoooO0.f51162OooO0OO;
        for (int i2 = 0; i2 < i; i2++) {
            Object objOooO0OO = this.f26440OoooO00.OooO0OO(getContext(), i2);
            if (objOooO0OO instanceof View) {
                View view = (View) objOooO0OO;
                if (this.f26441OoooO0O) {
                    layoutParams = new LinearLayout.LayoutParams(0, -1);
                    oOo000o0 ooo000o0 = this.f26440OoooO00;
                    getContext();
                    ooo000o0.OooO0Oo();
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(-2, -1);
                }
                this.f26436Oooo0oO.addView(view, layoutParams);
            }
        }
        oOo000o0 ooo000o1 = this.f26440OoooO00;
        if (ooo000o1 != null) {
            oO0O000 oo0o000OooO0O0 = ooo000o1.OooO0O0(getContext());
            this.f26434Oooo = oo0o000OooO0O0;
            if (oo0o000OooO0O0 instanceof View) {
                this.f26437Oooo0oo.addView((View) this.f26434Oooo, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public oOo000o0 getAdapter() {
        return this.f26440OoooO00;
    }

    public int getLeftPadding() {
        return this.f26445OoooOo0;
    }

    public oO0O000 getPagerIndicator() {
        return this.f26434Oooo;
    }

    public int getRightPadding() {
        return this.f26444OoooOOo;
    }

    public float getScrollPivotX() {
        return this.f26442OoooOO0;
    }

    public LinearLayout getTitleContainer() {
        return this.f26436Oooo0oO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f26440OoooO00 != null) {
            this.f26448Ooooo00.clear();
            int i5 = this.f26439OoooO0.f51162OooO0OO;
            for (int i6 = 0; i6 < i5; i6++) {
                o00O0OO0 o00o0oo1 = new o00O0OO0();
                View childAt = this.f26436Oooo0oO.getChildAt(i6);
                if (childAt != 0) {
                    o00o0oo1.f51172OooO00o = childAt.getLeft();
                    o00o0oo1.f51173OooO0O0 = childAt.getTop();
                    o00o0oo1.f51174OooO0OO = childAt.getRight();
                    int bottom = childAt.getBottom();
                    o00o0oo1.f51175OooO0Oo = bottom;
                    if (childAt instanceof oO0) {
                        oO0 oo0 = (oO0) childAt;
                        o00o0oo1.f51177OooO0o0 = oo0.getContentLeft();
                        o00o0oo1.f51176OooO0o = oo0.getContentTop();
                        o00o0oo1.f51178OooO0oO = oo0.getContentRight();
                        o00o0oo1.f51179OooO0oo = oo0.getContentBottom();
                    } else {
                        o00o0oo1.f51177OooO0o0 = o00o0oo1.f51172OooO00o;
                        o00o0oo1.f51176OooO0o = o00o0oo1.f51173OooO0O0;
                        o00o0oo1.f51178OooO0oO = o00o0oo1.f51174OooO0OO;
                        o00o0oo1.f51179OooO0oo = bottom;
                    }
                }
                this.f26448Ooooo00.add(o00o0oo1);
            }
            oO0O000 oo0o000 = this.f26434Oooo;
            if (oo0o000 != null) {
                oo0o000.OooO0O0(this.f26448Ooooo00);
            }
            if (this.f26447OoooOoo) {
                mj mjVar = this.f26439OoooO0;
                if (mjVar.f51166OooO0oO == 0) {
                    onPageSelected(mjVar.f51163OooO0Oo);
                    onPageScrolled(this.f26439OoooO0.f51163OooO0Oo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0);
                }
            }
        }
    }

    @Override // p656o0ooo000.Oooo0
    public final void onPageScrollStateChanged(int i) {
        if (this.f26440OoooO00 != null) {
            this.f26439OoooO0.f51166OooO0oO = i;
            oO0O000 oo0o000 = this.f26434Oooo;
            if (oo0o000 != null) {
                oo0o000.OooO00o();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList, java.util.List<o0ooo0.o00O0OO0>] */
    @Override // p656o0ooo000.Oooo0
    public final void onPageScrolled(int i, float f, int i2) {
        oO0O000 oo0o000;
        boolean z;
        if (this.f26440OoooO00 != null) {
            mj mjVar = this.f26439OoooO0;
            float f2 = i + f;
            float f3 = mjVar.f51164OooO0o;
            boolean z2 = f3 <= f2;
            if (mjVar.f51166OooO0oO != 0) {
                if (f2 != f3) {
                    int i3 = i + 1;
                    if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && z2) {
                        i3 = i - 1;
                        z = false;
                    } else {
                        z = true;
                    }
                    for (int i4 = 0; i4 < mjVar.f51162OooO0OO; i4++) {
                        if (i4 != i && i4 != i3 && mjVar.f51161OooO0O0.get(i4, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)).floatValue() != 1.0f) {
                            mjVar.OooO0OO(i4, 1.0f, z2, true);
                        }
                    }
                    if (!z) {
                        float f4 = 1.0f - f;
                        mjVar.OooO0OO(i3, f4, true, false);
                        mjVar.OooO0O0(i, f4, true, false);
                    } else if (z2) {
                        mjVar.OooO0OO(i, f, true, false);
                        mjVar.OooO0O0(i3, f, true, false);
                    } else {
                        float f5 = 1.0f - f;
                        mjVar.OooO0OO(i3, f5, false, false);
                        mjVar.OooO0O0(i, f5, false, false);
                    }
                }
                oo0o000 = this.f26434Oooo;
                if (oo0o000 != null) {
                    oo0o000.OooO0OO(i, f);
                }
                if (this.f26435Oooo0o != null || this.f26448Ooooo00.size() <= 0 || i < 0 || i >= this.f26448Ooooo00.size() || !this.f26443OoooOOO) {
                    return;
                }
                int iMin = Math.min(this.f26448Ooooo00.size() - 1, i);
                int iMin2 = Math.min(this.f26448Ooooo00.size() - 1, i + 1);
                o00O0OO0 o00o0oo1 = (o00O0OO0) this.f26448Ooooo00.get(iMin);
                o00O0OO0 o00o0oo2 = (o00O0OO0) this.f26448Ooooo00.get(iMin2);
                float fOooO00o = o00o0oo1.OooO00o() - (this.f26435Oooo0o.getWidth() * this.f26442OoooOO0);
                this.f26435Oooo0o.scrollTo((int) Oooo000.OooO00o.OooO00o(o00o0oo2.OooO00o() - (this.f26435Oooo0o.getWidth() * this.f26442OoooOO0), fOooO00o, f, fOooO00o), 0);
                return;
            }
            for (int i5 = 0; i5 < mjVar.f51162OooO0OO; i5++) {
                if (i5 != mjVar.f51163OooO0Oo) {
                    if (!mjVar.f51160OooO00o.get(i5)) {
                        mjVar.OooO00o(i5);
                    }
                    if (mjVar.f51161OooO0O0.get(i5, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)).floatValue() != 1.0f) {
                        mjVar.OooO0OO(i5, 1.0f, false, true);
                    }
                }
            }
            mjVar.OooO0O0(mjVar.f51163OooO0Oo, 1.0f, false, true);
            mjVar.OooO0Oo(mjVar.f51163OooO0Oo);
            mjVar.f51164OooO0o = f2;
            oo0o000 = this.f26434Oooo;
            if (oo0o000 != null) {
                oo0o000.OooO0OO(i, f);
            }
            if (this.f26435Oooo0o != null) {
            }
        }
    }

    @Override // p656o0ooo000.Oooo0
    public final void onPageSelected(int i) {
        if (this.f26440OoooO00 != null) {
            mj mjVar = this.f26439OoooO0;
            mjVar.f51165OooO0o0 = mjVar.f51163OooO0Oo;
            mjVar.f51163OooO0Oo = i;
            mjVar.OooO0Oo(i);
            for (int i2 = 0; i2 < mjVar.f51162OooO0OO; i2++) {
                if (i2 != mjVar.f51163OooO0Oo && !mjVar.f51160OooO00o.get(i2)) {
                    mjVar.OooO00o(i2);
                }
            }
            oO0O000 oo0o000 = this.f26434Oooo;
            if (oo0o000 != null) {
                oo0o000.OooO0Oo();
            }
        }
    }

    public void setAdapter(oOo000o0 ooo000o0) {
        oOo000o0 ooo000o1 = this.f26440OoooO00;
        if (ooo000o1 == ooo000o0) {
            return;
        }
        if (ooo000o1 != null) {
            ooo000o1.f51180OooO00o.unregisterObserver(this.f26449Ooooo0o);
        }
        this.f26440OoooO00 = ooo000o0;
        if (ooo000o0 == null) {
            this.f26439OoooO0.OooO0o0(0);
            OooO0OO();
            return;
        }
        ooo000o0.f51180OooO00o.registerObserver(this.f26449Ooooo0o);
        this.f26439OoooO0.OooO0o0(this.f26440OoooO00.OooO00o());
        if (this.f26436Oooo0oO != null) {
            this.f26440OoooO00.f51180OooO00o.notifyChanged();
        }
    }

    public void setAdjustMode(boolean z) {
        this.f26441OoooO0O = z;
    }

    public void setEnablePivotScroll(boolean z) {
        this.f26438OoooO = z;
    }

    public void setFollowTouch(boolean z) {
        this.f26443OoooOOO = z;
    }

    public void setIndicatorOnTop(boolean z) {
        this.f26446OoooOoO = z;
    }

    public void setLeftPadding(int i) {
        this.f26445OoooOo0 = i;
    }

    public void setReselectWhenLayout(boolean z) {
        this.f26447OoooOoo = z;
    }

    public void setRightPadding(int i) {
        this.f26444OoooOOo = i;
    }

    public void setScrollPivotX(float f) {
        this.f26442OoooOO0 = f;
    }

    public void setSkimOver(boolean z) {
        this.f26439OoooO0.f51167OooO0oo = z;
    }

    public void setSmoothScroll(boolean z) {
        this.f26450o000oOoO = z;
    }
}
