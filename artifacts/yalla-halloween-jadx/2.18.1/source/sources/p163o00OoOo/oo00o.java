package p163o00OoOo;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.app.base.view.tips.TipsBubbleView;
import com.weieyu.yalla.R;
import java.util.Objects;
import p189o00o00oO.o000OOo;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class oo00o implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f32537Oooo0o;

    public static final class OooO00o implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f32538Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f32539Oooo0oO;

        public OooO00o(View view, o00O00OO o00o00oo2) {
            this.f32538Oooo0o = view;
            this.f32539Oooo0oO = o00o00oo2;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            int i;
            TipsBubbleView tipsBubbleViewOooO00o;
            this.f32538Oooo0o.getViewTreeObserver().removeOnPreDrawListener(this);
            o00O00OO o00o00oo2 = this.f32539Oooo0oO;
            View view = this.f32538Oooo0o;
            int i2 = o00o00oo2.f32530OooOO0o;
            Objects.requireNonNull(o00o00oo2);
            if (view == null) {
                return false;
            }
            FrameLayout frameLayout = o00o00oo2.f32524OooO0o;
            if (frameLayout.findViewWithTag("microphone_tips") != null) {
                tipsBubbleViewOooO00o = null;
            } else {
                if (i2 >= 5) {
                    i2 -= 5;
                }
                if (i2 < 1) {
                    i = 8388691;
                } else {
                    i = i2 <= 3 ? 81 : 8388693;
                }
                tipsBubbleViewOooO00o = o000OOo.OooO00o(view, frameLayout, i, false, "microphone_tips", o000O0O0.OooO0OO(R.string.tips_pick_up_mic));
            }
            o00o00oo2.f32527OooO0oo = tipsBubbleViewOooO00o;
            if (tipsBubbleViewOooO00o == null) {
                return false;
            }
            tipsBubbleViewOooO00o.setDismissListener(new o00O00o0(o00o00oo2));
            return false;
        }
    }

    public oo00o(o00O00OO o00o00oo2) {
        this.f32537Oooo0o = o00o00oo2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f32537Oooo0o.f32525OooO0o0.getViewTreeObserver().removeOnPreDrawListener(this);
        o00O00OO o00o00oo2 = this.f32537Oooo0o;
        View childAt = o00o00oo2.f32525OooO0o0.getChildAt(o00o00oo2.f32530OooOO0o);
        if (!(childAt == null)) {
            childAt.getViewTreeObserver().addOnPreDrawListener(new OooO00o(childAt, this.f32537Oooo0o));
        }
        return false;
    }
}
