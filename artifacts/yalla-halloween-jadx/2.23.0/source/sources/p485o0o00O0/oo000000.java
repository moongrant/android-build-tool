package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f48217OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000000(TopicSearchActivity topicSearchActivity) {
        super(1);
        this.f48217OooO0Oo = topicSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicSearchActivity topicSearchActivity = this.f48217OooO0Oo;
        TopicSearchActivity.OooOoO0(topicSearchActivity, TopicSearchActivity.OooOo(topicSearchActivity));
        return Unit.INSTANCE;
    }
}
