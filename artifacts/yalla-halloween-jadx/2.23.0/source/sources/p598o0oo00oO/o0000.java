package p598o0oo00oO;

import android.app.Activity;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.yalla.yalla.util.spannableStringUtils.SpannableStringModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o0000<Model> extends ClickableSpan {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Activity f56853OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public SpannableStringModel<Model> f56854OooO0o0;

    public o0000(Activity activity) {
        this.f56853OooO0Oo = activity;
    }

    public abstract void OooO00o(SpannableStringModel spannableStringModel);

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        OooO00o(this.f56854OooO0o0);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Activity activity;
        SpannableStringModel<Model> spannableStringModel = this.f56854OooO0o0;
        if (spannableStringModel == null || textPaint == null || (activity = this.f56853OooO0Oo) == null) {
            return;
        }
        try {
            if (spannableStringModel.getColor() > 0) {
                textPaint.setColor(activity.getResources().getColor(this.f56854OooO0o0.getColor()));
            }
            textPaint.setUnderlineText(this.f56854OooO0o0.isUnderlineText());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
