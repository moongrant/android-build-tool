package p579o0oOoo;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.view.TextViewFixTouchConsume;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oOOoOOO0 extends LinkMovementMethod {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static oOOoOOO0 f56695OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f56696OooO00o;

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(@NotNull TextView widget, @NotNull Spannable buffer, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0 || action == 1) {
            try {
                int x = (int) event.getX();
                int y = (int) event.getY();
                int totalPaddingLeft = x - widget.getTotalPaddingLeft();
                int totalPaddingTop = y - widget.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + widget.getScrollX();
                int scrollY = totalPaddingTop + widget.getScrollY();
                Layout layout = widget.getLayout();
                Intrinsics.checkNotNullExpressionValue(layout, "widget.layout");
                int lineForVertical = layout.getLineForVertical(scrollY);
                if (scrollX >= 0) {
                    float f = scrollX;
                    if (f < layout.getLineWidth(lineForVertical)) {
                        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
                        ClickableSpan[] link = (ClickableSpan[]) buffer.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        Intrinsics.checkNotNullExpressionValue(link, "link");
                        if (!(link.length == 0)) {
                            if (action == 0) {
                                this.f56696OooO00o = System.currentTimeMillis();
                                Selection.setSelection(buffer, buffer.getSpanStart(link[0]), buffer.getSpanEnd(link[0]));
                            } else if (action == 1 && System.currentTimeMillis() - this.f56696OooO00o < 500) {
                                link[0].onClick(widget);
                            }
                            if (widget instanceof TextViewFixTouchConsume) {
                                ((TextViewFixTouchConsume) widget).setLinkHit(true);
                            }
                            return true;
                        }
                    }
                }
                Selection.removeSelection(buffer);
                Touch.onTouchEvent(widget, buffer, event);
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Touch.onTouchEvent(widget, buffer, event);
    }
}
