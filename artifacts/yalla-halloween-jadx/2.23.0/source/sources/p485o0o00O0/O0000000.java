package p485o0o00O0;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p507o0o00ooo.j1;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class O0000000 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f47756OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0000000(TopicSearchActivity topicSearchActivity) {
        super(3);
        this.f47756OooO0Oo = topicSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        RowScope Toolbar = rowScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(640141901, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicSearchActivity.initView.<anonymous>.<anonymous> (TopicSearchActivity.kt:140)");
            }
            j1 j1Var = j1.f49943OooO00o;
            String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Search_topics, composer2, 0);
            TopicSearchActivity topicSearchActivity = this.f47756OooO0Oo;
            j1Var.OooO00o(null, new oOo0o00(topicSearchActivity), new oo000000(topicSearchActivity), new oo00(topicSearchActivity), strStringResource, 0L, true, 0L, null, 0, null, null, null, 0L, 0L, 0, composer2, 1572864, 2097152, 65441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
