package p485o0o00O0;

import android.view.View;
import com.yalla.yalla.ui.activity.moment.TopicReviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO0OOO extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicReviewActivity f48173OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OOO(TopicReviewActivity topicReviewActivity) {
        super(1);
        this.f48173OooO0Oo = topicReviewActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48173OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
