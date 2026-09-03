package p174o00OooOO;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.app.base.util.spannableStringUtils.SpannableStringModel;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O00OO<Model> extends ClickableSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Activity f32693Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public SpannableStringModel<Model> f32694Oooo0oO;

    public o0O00OO(Activity activity) {
        this.f32693Oooo0o = activity;
    }

    public abstract void OooO00o(View view, SpannableStringModel<Model> spannableStringModel);

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        OooO00o(view, this.f32694Oooo0oO);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        SpannableStringModel<Model> spannableStringModel = this.f32694Oooo0oO;
        if (spannableStringModel == null || textPaint == null || this.f32693Oooo0o == null) {
            return;
        }
        try {
            if (spannableStringModel.getColor() > 0) {
                textPaint.setColor(this.f32693Oooo0o.getResources().getColor(this.f32694Oooo0oO.getColor()));
            }
            textPaint.setUnderlineText(this.f32694Oooo0oO.isUnderlineText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
