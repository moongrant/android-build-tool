package p439o0OoOo0O;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p584o0oOooO0.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomFrameUIController f46101OooO0Oo;

    public o0O0O00(RoomFrameUIController roomFrameUIController) {
        this.f46101OooO0Oo = roomFrameUIController;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        boolean zBooleanValue = it.booleanValue();
        final RoomFrameUIController roomFrameUIController = this.f46101OooO0Oo;
        if (zBooleanValue) {
            o000OO00.OooOOOO(roomFrameUIController.f23549OooO0o0);
        } else {
            o000OO00.OooO0O0(roomFrameUIController.f23549OooO0o0);
        }
        boolean zBooleanValue2 = it.booleanValue();
        int i = oO00O0oO.cv;
        MixedRoomActivity mixedRoomActivity = roomFrameUIController.f23544OooO00o;
        View viewFindViewById = mixedRoomActivity.findViewById(i);
        final LinearLayout linearLayout = (LinearLayout) mixedRoomActivity.findViewById(oO00O0oO.v_room_content);
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -viewFindViewById.getBottom();
        if (!zBooleanValue2) {
            intRef.element = linearLayout.getPaddingTop();
            intRef2.element = 0;
        }
        int i2 = intRef.element;
        int i3 = intRef2.element;
        if (i2 == i3) {
            return;
        }
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(180L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOo0O.o0Oo0oo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it2) {
                Ref.IntRef start = intRef;
                Intrinsics.checkNotNullParameter(start, "$start");
                Ref.IntRef end = intRef2;
                Intrinsics.checkNotNullParameter(end, "$end");
                RoomFrameUIController this$0 = roomFrameUIController;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                Object animatedValue = valueAnimatorOfInt.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) animatedValue).intValue();
                LinearLayout contentView = linearLayout;
                Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
                o000OO00.OooOO0o(contentView, iIntValue);
                if (start.element > end.element) {
                    this$0.getClass();
                } else {
                    this$0.getClass();
                }
            }
        });
        valueAnimatorOfInt.start();
    }
}
