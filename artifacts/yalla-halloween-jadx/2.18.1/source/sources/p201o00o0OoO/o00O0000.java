package p201o00o0OoO;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import o000O000.OooO00o;
import p193o00o0O00.OooOo;
import p193o00o0O00.o0OoOo0;
import p199o00o0Oo.o00O00O;
import p200o00o0Oo0.o0000Ooo;
import p400o0Oo0O.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o00O0000 extends o00O00O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Activity f33221Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f33222OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f33223OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ConstraintLayout f33224OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f33225OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f33226OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public TextView f33227OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View f33228OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o0OoOo0 f33229OoooOo0 = OooOo.f33128OooO0Oo;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public o0000Ooo<View, Integer> f33230OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public TextView f33231o000oOoO;

    public o00O0000(Activity activity) {
        this.f33221Oooo = activity;
        this.f33224OoooO00 = (ConstraintLayout) activity.findViewById(OooOOO0.include_title_layout_title);
        this.f33223OoooO0 = (TextView) this.f33221Oooo.findViewById(OooOOO0.include_title_tv_left);
        this.f33225OoooO0O = (TextView) this.f33221Oooo.findViewById(OooOOO0.include_title_tv_right);
        this.f33222OoooO = (TextView) this.f33221Oooo.findViewById(OooOOO0.include_title_tv_name);
        this.f33226OoooOO0 = this.f33221Oooo.findViewById(OooOOO0.clMiddleTitleWrapper);
        this.f33231o000oOoO = (TextView) this.f33221Oooo.findViewById(OooOOO0.include_title_tv_middle_top);
        this.f33227OoooOOO = (TextView) this.f33221Oooo.findViewById(OooOOO0.include_title_tv_middle_bottom);
        this.f33228OoooOOo = this.f33221Oooo.findViewById(OooOOO0.include_title_view_line_bottom);
        this.f33223OoooO0.setOnClickListener(this);
        this.f33225OoooO0O.setOnClickListener(this);
        OooO0O0();
    }

    @Override // p199o00o0Oo.o00O00O
    public final void OooO00o(View view) {
        o0000Ooo<View, Integer> o0000ooo = this.f33230OoooOoO;
        if (o0000ooo == null) {
            return;
        }
        TextView textView = this.f33223OoooO0;
        if (view == textView) {
            o0000ooo.OooO0o0(textView, 1010);
            return;
        }
        TextView textView2 = this.f33225OoooO0O;
        if (view == textView2) {
            o0000ooo.OooO0o0(textView2, 1011);
            return;
        }
        View view2 = this.f33226OoooOO0;
        if (view == view2) {
            o0000ooo.OooO0o0(view2, 1012);
        } else if (view == this.f33222OoooO) {
            o0000ooo.OooO0o0(view2, 1013);
        }
    }

    public abstract void OooO0O0();

    public final void OooO0OO() {
        o0OoOo0 o0oooo1 = this.f33229OoooOo0;
        Drawable drawable = o0oooo1.f33145OooO0O0;
        int i = o0oooo1.f33144OooO00o;
        if (drawable != null) {
            this.f33224OoooO00.setBackground(drawable);
        } else if (i != -1) {
            this.f33224OoooO00.setBackgroundColor(i);
        } else {
            this.f33224OoooO00.setBackgroundColor(-1);
        }
    }

    public final void OooO0Oo(String str, int i) {
        this.f33223OoooO0.setText("");
        if (!TextUtils.isEmpty(str)) {
            this.f33223OoooO0.setText(str);
        }
        if (i == -1) {
            this.f33223OoooO0.setCompoundDrawables(null, null, null, null);
            return;
        }
        Activity activity = this.f33221Oooo;
        Object obj = OooO00o.f28085OooO00o;
        Drawable drawableOooO0O0 = OooO00o.OooO0OO.OooO0O0(activity, i);
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getMinimumWidth(), drawableOooO0O0.getMinimumHeight());
        }
        this.f33223OoooO0.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableOooO0O0, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public final void OooO0o(String str, int i) {
        this.f33225OoooO0O.setText("");
        if (!TextUtils.isEmpty(str)) {
            this.f33225OoooO0O.setText(str);
        }
        if (i == -1) {
            this.f33225OoooO0O.setCompoundDrawables(null, null, null, null);
            return;
        }
        Activity activity = this.f33221Oooo;
        Object obj = OooO00o.f28085OooO00o;
        Drawable drawableOooO0O0 = OooO00o.OooO0OO.OooO0O0(activity, i);
        if (drawableOooO0O0 != null) {
            drawableOooO0O0.setBounds(0, 0, drawableOooO0O0.getMinimumWidth(), drawableOooO0O0.getMinimumHeight());
        }
        this.f33225OoooO0O.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableOooO0O0, (Drawable) null);
    }

    public final void OooO0o0(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33222OoooO.setText(str);
    }
}
