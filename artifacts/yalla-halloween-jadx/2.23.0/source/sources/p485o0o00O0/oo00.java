package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00 extends Lambda implements Function1<Function1<? super String, ? extends Unit>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f48216OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00(TopicSearchActivity topicSearchActivity) {
        super(1);
        this.f48216OooO0Oo = topicSearchActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super String, ? extends Unit> function1) {
        Function1<? super String, ? extends Unit> it = function1;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48216OooO0Oo.f26407OooOoOO = it;
        return Unit.INSTANCE;
    }
}
