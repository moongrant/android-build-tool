package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f48207OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(TopicSearchActivity topicSearchActivity) {
        super(1);
        this.f48207OooO0Oo = topicSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicSearchActivity topicSearchActivity = this.f48207OooO0Oo;
        topicSearchActivity.f26400OooOo.setValue(it);
        if (StringsKt.isBlank(TopicSearchActivity.OooOo(topicSearchActivity))) {
            topicSearchActivity.OooOooO();
        }
        return Unit.INSTANCE;
    }
}
