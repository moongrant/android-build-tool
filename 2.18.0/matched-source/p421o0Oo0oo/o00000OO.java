package p421o0Oo0oo;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO extends Lambda implements Function1<MotionEvent, Boolean> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f39701Oooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(AndroidViewHolder androidViewHolder) {
        super(1);
        this.f39701Oooo = androidViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent2 = motionEvent;
        Intrinsics.checkNotNullParameter(motionEvent2, "motionEvent");
        switch (motionEvent2.getActionMasked()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = this.f39701Oooo.dispatchTouchEvent(motionEvent2);
                break;
            default:
                zDispatchTouchEvent = this.f39701Oooo.dispatchGenericMotionEvent(motionEvent2);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
