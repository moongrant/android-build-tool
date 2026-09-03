package p593o0oo0;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.TextView;
import com.yalla.yalla.util.spannableStringUtils.SpannableStringModel;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TextView f57327OooO00o;

    public OooOo00(TextView textView, OooOOOO oooOOOO) {
        this.f57327OooO00o = textView;
        if (textView != null) {
            try {
                textView.setCursorVisible(false);
                textView.setFocusable(false);
                textView.setInputType(0);
                textView.setSingleLine(false);
                textView.setMovementMethod(oooOOOO);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void OooO00o(OooOOO oooOOO) {
        TextView textView;
        SpannableString spannableString;
        SpannableStringModel<Model> spannableStringModel = oooOOO.f57324OooO0o0;
        if (spannableStringModel == 0 || TextUtils.isEmpty(spannableStringModel.getContent()) || (textView = this.f57327OooO00o) == null || textView.getEditableText() == null) {
            return;
        }
        Editable editableText = textView.getEditableText();
        SpannableStringModel<Model> spannableStringModel2 = oooOOO.f57324OooO0o0;
        if (spannableStringModel2 == 0 || TextUtils.isEmpty(spannableStringModel2.getContent())) {
            spannableString = null;
        } else {
            SpannableStringModel<Model> spannableStringModel3 = oooOOO.f57324OooO0o0;
            spannableString = new SpannableString(spannableStringModel3.getContent());
            try {
                spannableString.setSpan(oooOOO, spannableStringModel3.getStart(), spannableStringModel3.getEnd(), 17);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        editableText.append((CharSequence) spannableString);
    }
}
