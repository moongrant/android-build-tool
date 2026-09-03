package p492o0o00OO0;

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
import p193o00o0O0O.o0000oo;
import p516o0o0O00o.o0O0oo0o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f49487OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OO0O(TopicSearchActivity topicSearchActivity) {
        super(2);
        this.f49487OooO0Oo = topicSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-62190353, iIntValue, -1, "com.yalla.yalla.ui.activity.moment.TopicSearchActivity.initView.<anonymous> (TopicSearchActivity.kt:137)");
            }
            SoftwareKeyboardController current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
            TopicSearchActivity topicSearchActivity = this.f49487OooO0Oo;
            topicSearchActivity.f25955OooOoO0 = current;
            topicSearchActivity.f25954OooOoO = WindowInsets_androidKt.isImeVisible(WindowInsets.INSTANCE, composer2, 8);
            o0O0oo0o.OooO00o(null, 0.0f, 0L, null, null, null, ComposableLambdaKt.composableLambda(composer2, 640141901, true, new oOO0O0(topicSearchActivity)), ComposableLambdaKt.composableLambda(composer2, 1439716430, true, new oOO0O0O(topicSearchActivity)), BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0000oo.OooO0OO(composer2).f38618OooO0O0, null, 2, null), composer2, 14155776, 63);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
