package p492o0o00OO0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00OO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicReviewActivity f49479OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00OO(TopicReviewActivity topicReviewActivity) {
        super(1);
        this.f49479OooO0Oo = topicReviewActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49479OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
