package p492o0o00OO0;

import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f49481OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O000(TopicSearchActivity topicSearchActivity) {
        super(1);
        this.f49481OooO0Oo = topicSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicSearchActivity topicSearchActivity = this.f49481OooO0Oo;
        TopicSearchActivity.OooOoO0(topicSearchActivity, TopicSearchActivity.OooOo(topicSearchActivity));
        return Unit.INSTANCE;
    }
}
