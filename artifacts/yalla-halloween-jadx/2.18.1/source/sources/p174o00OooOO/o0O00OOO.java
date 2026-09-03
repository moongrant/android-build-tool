package p174o00OooOO;

import android.text.Layout;
import android.text.NoCopySpan;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00OOO extends ScrollingMovementMethod {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static NoCopySpan.Concrete f32695OooO0O0 = new NoCopySpan.Concrete();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public OooO00o f32696OooO00o = null;

    public interface OooO00o {
        void OooO00o();
    }

    public final boolean OooO00o(int i, TextView textView, Spannable spannable) {
        Layout layout = textView.getLayout();
        int totalPaddingBottom = textView.getTotalPaddingBottom() + textView.getTotalPaddingTop();
        int scrollY = textView.getScrollY();
        int height = (textView.getHeight() + scrollY) - totalPaddingBottom;
        int lineForVertical = layout.getLineForVertical(scrollY);
        int lineForVertical2 = layout.getLineForVertical(height);
        int lineStart = layout.getLineStart(lineForVertical);
        int lineEnd = layout.getLineEnd(lineForVertical2);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, ClickableSpan.class);
        int selectionStart = Selection.getSelectionStart(spannable);
        int selectionEnd = Selection.getSelectionEnd(spannable);
        int iMin = Math.min(selectionStart, selectionEnd);
        int iMax = Math.max(selectionStart, selectionEnd);
        if (iMin < 0 && spannable.getSpanStart(f32695OooO0O0) >= 0) {
            iMin = spannable.length();
            iMax = iMin;
        }
        if (iMin > lineEnd) {
            iMax = Integer.MAX_VALUE;
            iMin = Integer.MAX_VALUE;
        }
        int spanStart = -1;
        if (iMax < lineStart) {
            iMax = -1;
            iMin = -1;
        }
        if (i == 1) {
            if (iMin == iMax) {
                return false;
            }
            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable.getSpans(iMin, iMax, ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            clickableSpanArr2[0].onClick(textView);
        } else if (i == 2) {
            int i2 = -1;
            for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
                int spanEnd = spannable.getSpanEnd(clickableSpanArr[i3]);
                if ((spanEnd < iMax || iMin == iMax) && spanEnd > i2) {
                    spanStart = spannable.getSpanStart(clickableSpanArr[i3]);
                    i2 = spanEnd;
                }
            }
            if (spanStart >= 0) {
                Selection.setSelection(spannable, i2, spanStart);
                return true;
            }
        } else if (i == 3) {
            int spanEnd2 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < clickableSpanArr.length; i5++) {
                int spanStart2 = spannable.getSpanStart(clickableSpanArr[i5]);
                if ((spanStart2 > iMin || iMin == iMax) && spanStart2 < i4) {
                    spanEnd2 = spannable.getSpanEnd(clickableSpanArr[i5]);
                    i4 = spanStart2;
                }
            }
            if (spanEnd2 < Integer.MAX_VALUE) {
                Selection.setSelection(spannable, i4, spanEnd2);
                return true;
            }
        }
        return false;
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public final boolean down(TextView textView, Spannable spannable) {
        if (OooO00o(3, textView, spannable)) {
            return true;
        }
        return super.down(textView, spannable);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void initialize(TextView textView, Spannable spannable) {
        Selection.removeSelection(spannable);
        spannable.removeSpan(f32695OooO0O0);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public final boolean left(TextView textView, Spannable spannable) {
        if (OooO00o(2, textView, spannable)) {
            return true;
        }
        return super.left(textView, spannable);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onKeyDown(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        if ((i == 23 || i == 66) && keyEvent.getRepeatCount() == 0 && OooO00o(1, textView, spannable)) {
            return true;
        }
        return super.onKeyDown(textView, spannable, i, keyEvent);
    }

    @Override // android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onKeyUp(TextView textView, Spannable spannable, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final void onTakeFocus(TextView textView, Spannable spannable, int i) {
        Selection.removeSelection(spannable);
        if ((i & 1) != 0) {
            spannable.setSpan(f32695OooO0O0, 0, 0, 34);
        } else {
            spannable.removeSpan(f32695OooO0O0);
        }
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        try {
            if (action == 0 || action == 1) {
                o00O00.OooO0O0("action = " + (action == 1 ? "MotionEvent_ACTION_UP" : "MotionEvent_ACTION_DOWN"));
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                int totalPaddingTop = y - textView.getTotalPaddingTop();
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = totalPaddingTop + textView.getScrollY();
                if (scrollX < 0) {
                    scrollX = 0;
                }
                if (scrollY < 0) {
                    scrollY = 0;
                }
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (action == 1) {
                    if (clickableSpanArr.length != 0) {
                        clickableSpanArr[0].onClick(textView);
                    } else {
                        OooO00o oooO00o = this.f32696OooO00o;
                        if (oooO00o != null) {
                            oooO00o.OooO00o();
                        }
                    }
                }
            } else if (action == 2) {
                o00O00.OooO0O0("MotionEvent_ACTION_MOVE ");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public final boolean right(TextView textView, Spannable spannable) {
        if (OooO00o(3, textView, spannable)) {
            return true;
        }
        return super.right(textView, spannable);
    }

    @Override // android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod
    public final boolean up(TextView textView, Spannable spannable) {
        if (OooO00o(2, textView, spannable)) {
            return true;
        }
        return super.up(textView, spannable);
    }
}
