package p593o0oo0;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yalla.yalla.util.spannableStringUtils.SpannableStringModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooOOO<Model> extends ClickableSpan {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Activity f57323OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public SpannableStringModel<Model> f57324OooO0o0;

    public OooOOO(Activity activity) {
        this.f57323OooO0Oo = activity;
    }

    public abstract void OooO00o(SpannableStringModel spannableStringModel);

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        OooO00o(this.f57324OooO0o0);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Activity activity;
        SpannableStringModel<Model> spannableStringModel = this.f57324OooO0o0;
        if (spannableStringModel == null || textPaint == null || (activity = this.f57323OooO0Oo) == null) {
            return;
        }
        try {
            if (spannableStringModel.getColor() > 0) {
                textPaint.setColor(activity.getResources().getColor(this.f57324OooO0o0.getColor()));
            }
            textPaint.setUnderlineText(this.f57324OooO0o0.isUnderlineText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
