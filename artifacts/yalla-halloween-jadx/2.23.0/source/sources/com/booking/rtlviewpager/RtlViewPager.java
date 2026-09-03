package com.booking.rtlviewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;
import o0000O0O.oo000o;
import p082o000OoOo.OooOO0O;
import p123o00O0o0o.OooO0o;
import p188o00o0O.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public class RtlViewPager extends ViewPager {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NonNull
    public final OooOO0 f9827OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public OooO00o f9828OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f9829OooooOo;

    public static class OooO00o extends DataSetObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooO0O0 f9830OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f9830OooO00o = oooO0O0;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            OooO0O0 oooO0O0 = this.f9830OooO00o;
            int iOooO0OO = oooO0O0.OooO0OO();
            int i = oooO0O0.f9831OooO0Oo;
            if (iOooO0OO != i) {
                RtlViewPager.this.setCurrentItemWithoutNotification(Math.max(0, i - 1));
                oooO0O0.f9831OooO0Oo = iOooO0OO;
            }
        }
    }

    public class OooO0O0 extends OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f9831OooO0Oo;

        public OooO0O0(OooOO0O oooOO0O) {
            super(oooOO0O);
            this.f9831OooO0Oo = oooOO0O.OooO0OO();
        }

        @Override // p082o000OoOo.OooOO0O
        public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
            this.f36690OooO0OO.OooO00o(viewGroup, (OooO0OO() - i) - 1, obj);
        }

        @Override // p082o000OoOo.OooOO0O
        public final int OooO0Oo(Object obj) {
            int iOooO0Oo = this.f36690OooO0OO.OooO0Oo(obj);
            return iOooO0Oo < 0 ? iOooO0Oo : (OooO0OO() - iOooO0Oo) - 1;
        }

        @Override // p082o000OoOo.OooOO0O
        public final float OooO0o(int i) {
            return this.f36690OooO0OO.OooO0o((OooO0OO() - i) - 1);
        }

        @Override // p082o000OoOo.OooOO0O
        public final CharSequence OooO0o0(int i) {
            return this.f36690OooO0OO.OooO0o0((OooO0OO() - i) - 1);
        }

        @Override // p082o000OoOo.OooOO0O
        public final Object OooO0oO(ViewGroup viewGroup, int i) {
            return this.f36690OooO0OO.OooO0oO(viewGroup, (OooO0OO() - i) - 1);
        }

        @Override // p082o000OoOo.OooOO0O
        public final void OooOOO0(ViewGroup viewGroup, int i, Object obj) {
            this.f36690OooO0OO.OooOOO0(viewGroup, (this.f9831OooO0Oo - i) - 1, obj);
        }
    }

    public class OooO0OO implements ViewPager.OooOOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final ViewPager.OooOOO0 f9833OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f9835OooO0o0 = -1;

        public OooO0OO(ViewPager.OooOOO0 oooOOO0) {
            this.f9833OooO0Oo = oooOOO0;
        }

        public final int OooO00o(int i) {
            OooOO0O adapter = RtlViewPager.this.getAdapter();
            return adapter == null ? i : (adapter.OooO0OO() - i) - 1;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            if (RtlViewPager.this.f9829OooooOo) {
                return;
            }
            this.f9833OooO0Oo.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            if (RtlViewPager.this.f9829OooooOo) {
                return;
            }
            if (f == 0.0f && i2 == 0) {
                this.f9835OooO0o0 = OooO00o(i);
            } else {
                this.f9835OooO0o0 = OooO00o(i + 1);
            }
            int i3 = this.f9835OooO0o0;
            if (f > 0.0f) {
                f = 1.0f - f;
            }
            this.f9833OooO0Oo.onPageScrolled(i3, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (RtlViewPager.this.f9829OooooOo) {
                return;
            }
            this.f9833OooO0Oo.onPageSelected(OooO00o(i));
        }
    }

    public RtlViewPager(Context context) {
        super(context);
        this.f9827OooooO0 = new OooOO0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentItemWithoutNotification(int i) {
        this.f9829OooooOo = true;
        OooOo(i, false);
        this.f9829OooooOo = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void OooO0O0(@NonNull ViewPager.OooOOO0 oooOOO0) {
        if (OooOoo0()) {
            OooO0OO oooO0OO = new OooO0OO(oooOOO0);
            this.f9827OooooO0.put(oooOOO0, oooO0OO);
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
            oooOOO0 = (ViewPager.OooOOO0) this.f9827OooooO0.remove(oooOOO0);
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
        int i = oo000o.f34114OooO00o;
        return oo000o.OooO00o.OooO00o(locale) == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Nullable
    public OooOO0O getAdapter() {
        OooOO0O adapter = super.getAdapter();
        return adapter instanceof OooO0O0 ? ((OooO0O0) adapter).f36690OooO0OO : adapter;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        return OooOoOO(super.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOO0O adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && this.f9828OooooOO == null) {
            OooO00o oooO00o = new OooO00o((OooO0O0) adapter);
            this.f9828OooooOO = oooO00o;
            adapter.OooOO0(oooO00o);
            OooO0O0 oooO0O0 = (OooO0O0) adapter;
            int iOooO0OO = oooO0O0.OooO0OO();
            int i = oooO0O0.f9831OooO0Oo;
            if (iOooO0OO != i) {
                RtlViewPager.this.setCurrentItemWithoutNotification(Math.max(0, i - 1));
                oooO0O0.f9831OooO0Oo = iOooO0OO;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OooO00o oooO00o;
        OooOO0O adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && (oooO00o = this.f9828OooooOO) != null) {
            adapter.OooOOOo(oooO00o);
            this.f9828OooooOO = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(@Nullable OooOO0O oooOO0O) {
        DataSetObserver dataSetObserver;
        OooOO0O adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && (dataSetObserver = this.f9828OooooOO) != null) {
            adapter.OooOOOo(dataSetObserver);
            this.f9828OooooOO = null;
        }
        boolean z = oooOO0O != null && OooOoo0();
        if (z) {
            OooO0O0 oooO0O0 = new OooO0O0(oooOO0O);
            if (this.f9828OooooOO == null) {
                OooO00o oooO00o = new OooO00o(oooO0O0);
                this.f9828OooooOO = oooO00o;
                oooO0O0.OooOO0(oooO00o);
                int iOooO0OO = oooO0O0.OooO0OO();
                int i = oooO0O0.f9831OooO0Oo;
                if (iOooO0OO != i) {
                    setCurrentItemWithoutNotification(Math.max(0, i - 1));
                    oooO0O0.f9831OooO0Oo = iOooO0OO;
                }
            }
            oooOO0O = oooO0O0;
        }
        super.setAdapter(oooOO0O);
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
        this.f9827OooooO0 = new OooOO0(1);
    }
}
