package p174o00OooOO;

import android.text.TextUtils;
import android.widget.TextView;
import com.app.base.util.spannableStringUtils.SpannableStringModel;

/* JADX INFO: loaded from: classes.dex */
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public TextView f32697OooO00o;

    public o0oO0Ooo(TextView textView, o0O00OOO o0o00ooo2) {
        this.f32697OooO00o = textView;
        if (textView != null) {
            try {
                textView.setCursorVisible(false);
                this.f32697OooO00o.setFocusable(false);
                this.f32697OooO00o.setInputType(0);
                this.f32697OooO00o.setSingleLine(false);
                this.f32697OooO00o.setMovementMethod(o0o00ooo2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final o0oO0Ooo OooO00o(o0O00OO o0o00oo2) {
        TextView textView;
        SpannableStringModel<Model> spannableStringModel = o0o00oo2.f32694Oooo0oO;
        if (spannableStringModel != 0 && !TextUtils.isEmpty(spannableStringModel.getContent()) && (textView = this.f32697OooO00o) != null && textView.getEditableText() != null) {
            this.f32697OooO00o.getEditableText().append((CharSequence) o0O00O.OooO0O0(o0o00oo2));
        }
        return this;
    }

    public final o0oO0Ooo OooO0O0(o0O00OO o0o00oo2) {
        TextView textView;
        SpannableStringModel<Model> spannableStringModel = o0o00oo2.f32694Oooo0oO;
        if (spannableStringModel != 0 && !TextUtils.isEmpty(spannableStringModel.getContent()) && (textView = this.f32697OooO00o) != null && textView.getEditableText() != null) {
            this.f32697OooO00o.getEditableText().insert(0, o0O00O.OooO0O0(o0o00oo2));
        }
        return this;
    }
}
