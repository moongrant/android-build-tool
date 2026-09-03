package com.booking.rtlviewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Locale;
import java.util.Map;
import o000O0Oo.OooO;
import p021OooOooo.Oooo0;
import p105o000oo0o.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public class RtlViewPager extends ViewPager {

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    @Nullable
    public OooO00o f12348o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public boolean f12349o00000oo;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    @NonNull
    public final Map<ViewPager.OooOOO0, OooO0OO> f12350o0000Ooo;

    public static class OooO00o extends DataSetObserver {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final OooO0O0 f12351OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f12351OooO00o = oooO0O0;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            OooO0O0.OooOOOo(this.f12351OooO00o);
        }
    }

    public class OooO0O0 extends p178o00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f12352OooO0Oo;

        public OooO0O0(o00Ooo o00ooo2) {
            super(o00ooo2);
            this.f12352OooO0Oo = o00ooo2.OooO0OO();
        }

        public static void OooOOOo(OooO0O0 oooO0O0) {
            int iOooO0OO = oooO0O0.OooO0OO();
            int i = oooO0O0.f12352OooO0Oo;
            if (iOooO0OO != i) {
                RtlViewPager.this.setCurrentItemWithoutNotification(Math.max(0, i - 1));
                oooO0O0.f12352OooO0Oo = iOooO0OO;
            }
        }

        @Override // p105o000oo0o.o00Ooo
        public final void OooO00o(ViewGroup viewGroup, int i, Object obj) {
            this.f32945OooO0OO.OooO00o(viewGroup, OooOOo0(i), obj);
        }

        @Override // p105o000oo0o.o00Ooo
        public final int OooO0Oo(Object obj) {
            int iOooO0Oo = this.f32945OooO0OO.OooO0Oo(obj);
            return iOooO0Oo < 0 ? iOooO0Oo : OooOOo0(iOooO0Oo);
        }

        @Override // p105o000oo0o.o00Ooo
        public final float OooO0o(int i) {
            return this.f32945OooO0OO.OooO0o(OooOOo0(i));
        }

        @Override // p105o000oo0o.o00Ooo
        public final CharSequence OooO0o0(int i) {
            return this.f32945OooO0OO.OooO0o0(OooOOo0(i));
        }

        @Override // p105o000oo0o.o00Ooo
        public final Object OooO0oO(ViewGroup viewGroup, int i) {
            return this.f32945OooO0OO.OooO0oO(viewGroup, OooOOo0(i));
        }

        @Override // p105o000oo0o.o00Ooo
        public final void OooOOO0(ViewGroup viewGroup, int i, Object obj) {
            this.f32945OooO0OO.OooOOO0(viewGroup, (this.f12352OooO0Oo - i) - 1, obj);
        }

        public final int OooOOo0(int i) {
            return (OooO0OO() - i) - 1;
        }
    }

    public class OooO0OO implements ViewPager.OooOOO0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NonNull
        public final ViewPager.OooOOO0 f12354Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f12355Oooo0oO = -1;

        public OooO0OO(ViewPager.OooOOO0 oooOOO0) {
            this.f12354Oooo0o = oooOOO0;
        }

        public final int OooO00o(int i) {
            o00Ooo adapter = RtlViewPager.this.getAdapter();
            return adapter == null ? i : (adapter.OooO0OO() - i) - 1;
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrollStateChanged(int i) {
            if (RtlViewPager.this.f12349o00000oo) {
                return;
            }
            this.f12354Oooo0o.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageScrolled(int i, float f, int i2) {
            if (RtlViewPager.this.f12349o00000oo) {
                return;
            }
            if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && i2 == 0) {
                this.f12355Oooo0oO = OooO00o(i);
            } else {
                this.f12355Oooo0oO = OooO00o(i + 1);
            }
            ViewPager.OooOOO0 oooOOO0 = this.f12354Oooo0o;
            int i3 = this.f12355Oooo0oO;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f = 1.0f - f;
            }
            oooOOO0.onPageScrolled(i3, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OooOOO0
        public final void onPageSelected(int i) {
            if (RtlViewPager.this.f12349o00000oo) {
                return;
            }
            this.f12354Oooo0o.onPageSelected(OooO00o(i));
        }
    }

    public RtlViewPager(Context context) {
        super(context);
        this.f12350o0000Ooo = new Oooo0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentItemWithoutNotification(int i) {
        this.f12349o00000oo = true;
        OooOoO(i, false);
        this.f12349o00000oo = false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [OooOooo.o00oO0o, java.util.Map<androidx.viewpager.widget.ViewPager$OooOOO0, com.booking.rtlviewpager.RtlViewPager$OooO0OO>] */
    @Override // androidx.viewpager.widget.ViewPager
    public final void OooO0O0(@NonNull ViewPager.OooOOO0 oooOOO0) {
        if (OooOooO()) {
            OooO0OO oooO0OO = new OooO0OO(oooOOO0);
            this.f12350o0000Ooo.put(oooOOO0, oooO0OO);
            oooOOO0 = oooO0OO;
        }
        super.OooO0O0(oooOOO0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [OooOooo.o00oO0o, java.util.Map<androidx.viewpager.widget.ViewPager$OooOOO0, com.booking.rtlviewpager.RtlViewPager$OooO0OO>] */
    @Override // androidx.viewpager.widget.ViewPager
    public final void OooOo0O(@NonNull ViewPager.OooOOO0 oooOOO0) {
        if (OooOooO()) {
            oooOOO0 = (ViewPager.OooOOO0) this.f12350o0000Ooo.remove(oooOOO0);
        }
        super.OooOo0O(oooOOO0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void OooOoO(int i, boolean z) {
        super.OooOoO(OooOoo(i), z);
    }

    public final int OooOoo(int i) {
        if (i < 0 || !OooOooO()) {
            return i;
        }
        if (getAdapter() == null) {
            return 0;
        }
        return (getAdapter().OooO0OO() - i) - 1;
    }

    public final boolean OooOooO() {
        Locale locale = getContext().getResources().getConfiguration().locale;
        int i = OooO.f28136OooO00o;
        return OooO.OooO00o.OooO00o(locale) == 1;
    }

    public final void OooOooo(o00Ooo o00ooo2) {
        if ((o00ooo2 instanceof OooO0O0) && this.f12348o00000oO == null) {
            OooO00o oooO00o = new OooO00o((OooO0O0) o00ooo2);
            this.f12348o00000oO = oooO00o;
            o00ooo2.OooOO0(oooO00o);
            OooO0O0.OooOOOo((OooO0O0) o00ooo2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    @Nullable
    public o00Ooo getAdapter() {
        o00Ooo adapter = super.getAdapter();
        return adapter instanceof OooO0O0 ? ((OooO0O0) adapter).f32945OooO0OO : adapter;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        return OooOoo(super.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOooo(super.getAdapter());
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OooO00o oooO00o;
        o00Ooo adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && (oooO00o = this.f12348o00000oO) != null) {
            adapter.OooOOOO(oooO00o);
            this.f12348o00000oO = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(@Nullable o00Ooo o00ooo2) {
        OooO00o oooO00o;
        o00Ooo adapter = super.getAdapter();
        if ((adapter instanceof OooO0O0) && (oooO00o = this.f12348o00000oO) != null) {
            adapter.OooOOOO(oooO00o);
            this.f12348o00000oO = null;
        }
        boolean z = o00ooo2 != null && OooOooO();
        if (z) {
            OooO0O0 oooO0O0 = new OooO0O0(o00ooo2);
            OooOooo(oooO0O0);
            o00ooo2 = oooO0O0;
        }
        super.setAdapter(o00ooo2);
        if (z) {
            setCurrentItemWithoutNotification(0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(OooOoo(i));
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12350o0000Ooo = new Oooo0(1);
    }
}
