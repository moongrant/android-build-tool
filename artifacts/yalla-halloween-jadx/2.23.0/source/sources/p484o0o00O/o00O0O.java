package p484o0o00O;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47744OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(MomentReplyHeaderView momentReplyHeaderView) {
        super(1);
        this.f47744OooO0Oo = momentReplyHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentReplyHeaderView momentReplyHeaderView = this.f47744OooO0Oo;
        momentReplyHeaderView.setSelectType(1);
        Function1<Integer, Unit> itemListener = momentReplyHeaderView.getItemListener();
        if (itemListener != null) {
            itemListener.invoke(1);
        }
        return Unit.INSTANCE;
    }
}
