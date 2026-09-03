package com.yalla.yalla.ui.view;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0014\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/view/TextViewFixTouchConsume;", "Lcom/yalla/yalla/ui/view/FixTextView;", "", "html", "", "setTextViewHTML", "", "OooOO0o", "Z", "getDoNotConsumeNonUrlClicks", "()Z", "setDoNotConsumeNonUrlClicks", "(Z)V", "doNotConsumeNonUrlClicks", "OooOOO0", "getLinkHit", "setLinkHit", "linkHit", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TextViewFixTouchConsume extends FixTextView {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name and from kotlin metadata */
    public boolean doNotConsumeNonUrlClicks;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name and from kotlin metadata */
    public boolean linkHit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewFixTouchConsume(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.doNotConsumeNonUrlClicks = true;
    }

    public final boolean getDoNotConsumeNonUrlClicks() {
        return this.doNotConsumeNonUrlClicks;
    }

    public final boolean getLinkHit() {
        return this.linkHit;
    }

    @Override // android.view.View
    public final boolean hasFocusable() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.linkHit = false;
        return this.doNotConsumeNonUrlClicks ? this.linkHit : super.onTouchEvent(event);
    }

    public final void setDoNotConsumeNonUrlClicks(boolean z) {
        this.doNotConsumeNonUrlClicks = z;
    }

    public final void setLinkHit(boolean z) {
        this.linkHit = z;
    }

    public final void setTextViewHTML(@Nullable String html) {
        Spanned spannedFromHtml = Html.fromHtml(html);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(...)");
        setText(new SpannableStringBuilder(spannedFromHtml));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewFixTouchConsume(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.doNotConsumeNonUrlClicks = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewFixTouchConsume(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.doNotConsumeNonUrlClicks = true;
    }
}
