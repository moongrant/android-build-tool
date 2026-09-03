package p598o0oo00oO;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.yalla.yalla.util.spannableStringUtils.SpannableStringModel;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f56857OooO00o;

    public o0000oo(TextView textView, o0000O00 o0000o00) {
        this.f56857OooO00o = textView;
        if (textView != null) {
            try {
                textView.setCursorVisible(false);
                textView.setFocusable(false);
                textView.setInputType(0);
                textView.setSingleLine(false);
                textView.setMovementMethod(o0000o00);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void OooO00o(o0000 o0000Var) {
        TextView textView;
        SpannableString spannableString;
        SpannableStringModel<Model> spannableStringModel = o0000Var.f56854OooO0o0;
        if (spannableStringModel == 0 || TextUtils.isEmpty(spannableStringModel.getContent()) || (textView = this.f56857OooO00o) == null || textView.getEditableText() == null) {
            return;
        }
        Editable editableText = textView.getEditableText();
        SpannableStringModel<Model> spannableStringModel2 = o0000Var.f56854OooO0o0;
        if (spannableStringModel2 == 0 || TextUtils.isEmpty(spannableStringModel2.getContent())) {
            spannableString = null;
        } else {
            SpannableStringModel<Model> spannableStringModel3 = o0000Var.f56854OooO0o0;
            spannableString = new SpannableString(spannableStringModel3.getContent());
            try {
                spannableString.setSpan(o0000Var, spannableStringModel3.getStart(), spannableStringModel3.getEnd(), 17);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        editableText.append((CharSequence) spannableString);
    }
}
