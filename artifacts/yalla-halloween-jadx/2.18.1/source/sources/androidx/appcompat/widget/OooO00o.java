package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO00o extends ViewGroup {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ActionMenuPresenter f5062Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final C0032OooO00o f5063Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f5064Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ActionMenuView f5065Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f5066OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o000O0O0.o00000O f5067OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f5068OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f5069OoooO0O;

    /* JADX INFO: renamed from: androidx.appcompat.widget.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0032OooO00o implements o000O0O0.o00000OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5070OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f5071OooO0O0;

        public C0032OooO00o() {
        }

        @Override // o000O0O0.o00000OO
        public final void OooO00o() {
            if (this.f5070OooO00o) {
                return;
            }
            OooO00o oooO00o = OooO00o.this;
            oooO00o.f5067OoooO0 = null;
            OooO00o.super.setVisibility(this.f5071OooO0O0);
        }

        @Override // o000O0O0.o00000OO
        public final void OooO0O0() {
            OooO00o.super.setVisibility(0);
            this.f5070OooO00o = false;
        }

        @Override // o000O0O0.o00000OO
        public final void OooO0OO(View view) {
            this.f5070OooO00o = true;
        }
    }

    public OooO00o(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int OooO0OO(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public final int OooO0Oo(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final o000O0O0.o00000O OooO0o0(int i, long j) {
        o000O0O0.o00000O o00000o = this.f5067OoooO0;
        if (o00000o != null) {
            o00000o.OooO0O0();
        }
        if (i != 0) {
            o000O0O0.o00000O o00000oOooO0O0 = ViewCompat.OooO0O0(this);
            o00000oOooO0O0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o00000oOooO0O0.OooO0OO(j);
            C0032OooO00o c0032OooO00o = this.f5063Oooo0o;
            OooO00o.this.f5067OoooO0 = o00000oOooO0O0;
            c0032OooO00o.f5071OooO0O0 = i;
            o00000oOooO0O0.OooO0Oo(c0032OooO00o);
            return o00000oOooO0O0;
        }
        if (getVisibility() != 0) {
            setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        o000O0O0.o00000O o00000oOooO0O1 = ViewCompat.OooO0O0(this);
        o00000oOooO0O1.OooO00o(1.0f);
        o00000oOooO0O1.OooO0OO(j);
        C0032OooO00o c0032OooO00o2 = this.f5063Oooo0o;
        OooO00o.this.f5067OoooO0 = o00000oOooO0O1;
        c0032OooO00o2.f5071OooO0O0 = i;
        o00000oOooO0O1.OooO0Oo(c0032OooO00o2);
        return o00000oOooO0O1;
    }

    public int getAnimatedVisibility() {
        return this.f5067OoooO0 != null ? this.f5063Oooo0o.f5071OooO0O0 : getVisibility();
    }

    public int getContentHeight() {
        return this.f5068OoooO00;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, OooOo00.OooOOOO.ActionBar, OooOo00.OooO00o.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(OooOo00.OooOOOO.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f5062Oooo;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f4682Oooo0oO.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            actionMenuPresenter.f4857Ooooo0o = i;
            androidx.appcompat.view.menu.OooO0o oooO0o = actionMenuPresenter.f4683Oooo0oo;
            if (oooO0o != null) {
                oooO0o.OooOOo(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5066OoooO = false;
        }
        if (!this.f5066OoooO) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5066OoooO = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5066OoooO = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5069OoooO0O = false;
        }
        if (!this.f5069OoooO0O) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5069OoooO0O = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5069OoooO0O = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f5068OoooO00 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            o000O0O0.o00000O o00000o = this.f5067OoooO0;
            if (o00000o != null) {
                o00000o.OooO0O0();
            }
            super.setVisibility(i);
        }
    }

    public OooO00o(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5063Oooo0o = new C0032OooO00o();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(OooOo00.OooO00o.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f5064Oooo0oO = context;
        } else {
            this.f5064Oooo0oO = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
