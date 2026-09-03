package p485o0o00O0;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p147o00Oo0Oo.o000OOo;
import p507o0o00ooo.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class Oo0000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f47759OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oo0000(TopicSearchActivity topicSearchActivity) {
        super(2);
        this.f47759OooO0Oo = topicSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-62190353, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicSearchActivity.initView.<anonymous> (TopicSearchActivity.kt:136)");
            }
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
            TopicSearchActivity topicSearchActivity = this.f47759OooO0Oo;
            topicSearchActivity.f26406OooOoO0 = current;
            topicSearchActivity.f26405OooOoO = WindowInsets_androidKt.isImeVisible(WindowInsets.INSTANCE, composer2, 8);
            t1.OooO00o(null, 0.0f, 0L, null, null, null, ComposableLambdaKt.composableLambda(composer2, 640141901, true, new O0000000(topicSearchActivity)), ComposableLambdaKt.composableLambda(composer2, 1439716430, true, new O0OO00(topicSearchActivity)), BackgroundKt.m169backgroundbw27NRU$default(Modifier.INSTANCE, o000OOo.OooO0OO(composer2).f37703OooO0O0, null, 2, null), composer2, 14155776, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
