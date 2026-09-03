package com.booking.rtlviewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;
import p150o00Oo0Oo.oo000o;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes2.dex */
public class RtlViewPager extends ViewPager {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NonNull
    public final OooO f12918OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public OooO00o f12919OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f12920OooooOo;

    public static class OooO00o extends DataSetObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooO0O0 f12921OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f12921OooO00o = oooO0O0;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            OooO0O0 oooO0O0 = this.f12921OooO00o;
            int iOooO0OO = oooO0O0.OooO0OO();
            int i = oooO0O0.f12922OooO0Oo;
            if (iOooO0OO != i) {
                RtlViewPager.this.setCurrentItemWithoutNotification(Math.max(0, i - 1));
                oooO0O0.f12922OooO0Oo = iOooO0OO;
            }
        }
    }

    public class OooO0O0 extends oo000o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f12922OooO0Oo;

        public OooO0O0(p114o00O00o.OooO0OO oooO0OO) {
            super(oooO0OO);
            this.f12922OooO0Oo = oooO0OO.OooO0OO();
        }

        @Override // p114o00O00o.OooO0OO
        public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
            this.f37760OooO0OO.OooO00o(viewGroup, (OooO0OO() - i) - 1, obj);
        }

        @Override // p114o00O00o.OooO0OO
        public final int OooO0Oo(Object obj) {
            int iOooO0Oo = this.f37760OooO0OO.OooO0Oo(obj);
            return iOooO0Oo < 0 ? iOooO0Oo : (OooO0OO() - iOooO0Oo) - 1;
        }

        @Override // p114o00O00o.OooO0OO
        public final float OooO0o(int i) {
            return this.f37760OooO0OO.OooO0o((OooO0OO() - i) - 1);
        }

        @Override // p114o00O00o.OooO0OO
        public final CharSequence OooO0o0(int i) {
            return this.f37760OooO0OO.OooO0o0((OooO0OO() - i) - 1);
        }

        @Override // p114o00O00o.OooO0OO
        public final Object OooO0oO(ViewGroup viewGroup, int i) {
            return this.f37760OooO0OO.OooO0oO(viewGroup, (OooO0OO() - i) - 1);
        }

        @Override // p114o00O00o.OooO0OO
        public final void OooOOO0(ViewGroup viewGroup, int i, Object obj) {
            this.f37760OooO0OO.OooOOO0(viewGroup, (this.f12922OooO0Oo - i) - 1, obj);
        }
    }

    public class OooO0OO implements ViewPager.OooOOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final ViewPager.OooOOO0 f12924OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f12926OooO0o0 = -1;

        public OooO0OO(ViewPager.OooOOO0 oooOOO0) {
            this.f12924OooO0Oo = oooOOO0;
        }

        public final int OooO00o(int i) {
            p114o00O00o.OooO0OO adapter = RtlViewPager.this.getAdapter();
            return adapter == null ? i : (adapter.OooO0OO() - i) - 1;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            if (RtlViewPager.this.f12920OooooOo) {
                return;
            }
            this.f12924OooO0Oo.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            if (RtlViewPager.this.f12920OooooOo) {
                return;
            }
            if (f == 0.0f && i2 == 0) {
                this.f12926OooO0o0 = OooO00o(i);
            } else {
                this.f12926OooO0o0 = OooO00o(i + 1);
            }
            int i3 = this.f12926OooO0o0;
            if (f > 0.0f) {
                f = 1.0f - f;
            }
            this.f12924OooO0Oo.onPageScrolled(i3, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (RtlViewPager.this.f12920OooooOo) {
                return;
            }
            this.f12924OooO0Oo.onPageSelected(OooO00o(i));
        }
    }

    public RtlViewPager(Context context) {
        super(context);
        this.f12918OooooO0 = new OooO(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentItemWithoutNotification(int i) {
        this.f12920OooooOo = true;
        OooOo(i, false);
        this.f12920OooooOo = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void OooO0O0(@NonNull ViewPager.OooOOO0 oooOOO0) {
        if (OooOoo0()) {
            OooO0OO oooO0OO = new OooO0OO(oooOOO0);
            this.f12918OooooO0.put(oooOOO0, oooO0OO);
            oooOOO0 = oooO0OO;
        }
        super.OooO0O0(oooOOO0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void OooOo(int i, boolean z) {
        super.OooOo(OooOoOO(i), z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void OooOo0(@NonNull ViewPager.OooOOO0 oooOOO0) {
        if (OooOoo0()) {
            oooOOO0 = (ViewPager.OooOOO0) this.f12918OooooO0.remove(oooOOO0);
        }
        super.OooOo0(oooOOO0);
    }

    public final int OooOoOO(int i) {
        if (i < 0 || !OooOoo0()) {
            return i;
        }
        if (getAdapter() == null) {
            return 0;
        }
        return (getAdapter().OooO0OO() - i) - 1;
    }

    public final boolean OooOoo0() {
        Locale locale = getContext().getResources().getConfiguration().locale;
        int i = o0000O0O.oo000o.f33601OooO00o;
        return o0000O0O.oo000o.OooO00o.OooO00o(locale) == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Nullable
    public p114o00O00o.OooO0OO getAdapter() {
        p114o00O00o.OooO0OO adapter = super.getAdapter();
        return adapter instanceof OooO0O0 ? ((OooO0O0) adapter).f37760OooO0OO : adapter;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        return OooOoOO(super.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p114o00O00o.OooO0OO adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && this.f12919OooooOO == null) {
            OooO00o oooO00o = new OooO00o((OooO0O0) adapter);
            this.f12919OooooOO = oooO00o;
            adapter.OooOO0(oooO00o);
            OooO0O0 oooO0O0 = (OooO0O0) adapter;
            int iOooO0OO = oooO0O0.OooO0OO();
            int i = oooO0O0.f12922OooO0Oo;
            if (iOooO0OO != i) {
                RtlViewPager.this.setCurrentItemWithoutNotification(Math.max(0, i - 1));
                oooO0O0.f12922OooO0Oo = iOooO0OO;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OooO00o oooO00o;
        p114o00O00o.OooO0OO adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && (oooO00o = this.f12919OooooOO) != null) {
            adapter.OooOOOo(oooO00o);
            this.f12919OooooOO = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(@Nullable p114o00O00o.OooO0OO oooO0OO) {
        DataSetObserver dataSetObserver;
        p114o00O00o.OooO0OO adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && (dataSetObserver = this.f12919OooooOO) != null) {
            adapter.OooOOOo(dataSetObserver);
            this.f12919OooooOO = null;
        }
        boolean z = oooO0OO != null && OooOoo0();
        if (z) {
            OooO0O0 oooO0O0 = new OooO0O0(oooO0OO);
            if (this.f12919OooooOO == null) {
                OooO00o oooO00o = new OooO00o(oooO0O0);
                this.f12919OooooOO = oooO00o;
                oooO0O0.OooOO0(oooO00o);
                int iOooO0OO = oooO0O0.OooO0OO();
                int i = oooO0O0.f12922OooO0Oo;
                if (iOooO0OO != i) {
                    setCurrentItemWithoutNotification(Math.max(0, i - 1));
                    oooO0O0.f12922OooO0Oo = iOooO0OO;
                }
            }
            oooO0OO = oooO0O0;
        }
        super.setAdapter(oooO0OO);
        if (z) {
            setCurrentItemWithoutNotification(0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(OooOoOO(i));
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12918OooooO0 = new OooO(1);
    }
}
