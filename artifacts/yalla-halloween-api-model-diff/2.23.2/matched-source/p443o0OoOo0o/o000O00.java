package p443o0OoOo0o;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.roomcenter.RoomFrameUIController;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import com.yalla.yalla.ui.vm.moment.BaseMomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o0oo0000.OooO00o;
import p562o0oOo000.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47280OooO0o0;

    public /* synthetic */ o000O00(Object obj, int i) {
        this.f47279OooO0Oo = i;
        this.f47280OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47279OooO0Oo;
        Object obj2 = this.f47280OooO0o0;
        switch (i) {
            case 0:
                final RoomFrameUIController this$0 = (RoomFrameUIController) obj2;
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(bool);
                if (bool.booleanValue()) {
                    o000O.OooOOOO(this$0.f23089OooO0o0);
                } else {
                    o000O.OooO0O0(this$0.f23089OooO0o0);
                }
                boolean zBooleanValue = bool.booleanValue();
                int i2 = o0OO00O.cv;
                MixedRoomActivity mixedRoomActivity = this$0.f23084OooO00o;
                View viewFindViewById = mixedRoomActivity.findViewById(i2);
                final LinearLayout linearLayout = (LinearLayout) mixedRoomActivity.findViewById(o0OO00O.v_room_content);
                final Ref.IntRef intRef = new Ref.IntRef();
                final Ref.IntRef intRef2 = new Ref.IntRef();
                intRef2.element = -viewFindViewById.getBottom();
                if (!zBooleanValue) {
                    intRef.element = linearLayout.getPaddingTop();
                    intRef2.element = 0;
                }
                int i3 = intRef.element;
                int i4 = intRef2.element;
                if (i3 != i4) {
                    final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i3, i4);
                    valueAnimatorOfInt.setDuration(180L);
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OoOo0o.o000OO0O
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator it) {
                            Ref.IntRef start = intRef;
                            Intrinsics.checkNotNullParameter(start, "$start");
                            Ref.IntRef end = intRef2;
                            Intrinsics.checkNotNullParameter(end, "$end");
                            RoomFrameUIController this$1 = this$0;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            Object animatedValue = valueAnimatorOfInt.getAnimatedValue();
                            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                            int iIntValue = ((Integer) animatedValue).intValue();
                            LinearLayout linearLayout2 = linearLayout;
                            Intrinsics.checkNotNull(linearLayout2);
                            o000O.OooOO0o(linearLayout2, iIntValue);
                            if (start.element > end.element) {
                                this$1.getClass();
                            } else {
                                this$1.getClass();
                            }
                        }
                    });
                    valueAnimatorOfInt.start();
                    break;
                }
                break;
            case 1:
                MainSearchActivity this$1 = (MainSearchActivity) obj2;
                String str = (String) obj;
                int i5 = MainSearchActivity.f24960OooOoO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function1<? super String, Unit> function1 = this$1.f24967OooOoO0;
                if (function1 != null) {
                    Intrinsics.checkNotNull(str);
                    function1.invoke(str);
                }
                OooO00o.OooO0O0("101032");
                this$1.OooOoO(this$1.OooOoO0().getSearchText());
                break;
            default:
                BaseMomentVM newMomentVM = (BaseMomentVM) obj2;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(newMomentVM, "$newMomentVM");
                newMomentVM.removeMoment(jLongValue);
                break;
        }
    }
}
