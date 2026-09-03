package p492o0o00OO0;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p516o0o0O00o.o0OoO00O;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f49480OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0(TopicSearchActivity topicSearchActivity) {
        super(3);
        this.f49480OooO0Oo = topicSearchActivity;
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
                ComposerKt.traceEventStart(640141901, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicSearchActivity.initView.<anonymous>.<anonymous> (TopicSearchActivity.kt:141)");
            }
            o0OoO00O o0ooo00o2 = o0OoO00O.f51610OooO00o;
            String strStringResource = StringResources_androidKt.stringResource(o000000.Search_topics, composer2, 0);
            TopicSearchActivity topicSearchActivity = this.f49480OooO0Oo;
            o0ooo00o2.OooO00o(null, new oOO0(topicSearchActivity), new oOO0O000(topicSearchActivity), new oOO0O00O(topicSearchActivity), strStringResource, 0L, true, 0L, null, 0, null, null, null, 0L, 0L, 0, composer2, 1572864, 2097152, 65441);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
