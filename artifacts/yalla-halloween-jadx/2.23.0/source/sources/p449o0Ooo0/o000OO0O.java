package p449o0Ooo0;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000;
import com.facebook.internal.FacebookRequestErrorClassification;
import io.agora.rtc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p150o00Oo0oO.o0000Ooo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f46415OooO00o = ComposableLambdaKt.composableLambdaInstance(301908392, false, OooO00o.f46416OooO0Oo);

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/ComposableSingletons$MusicScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,669:1\n154#2:670\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/ComposableSingletons$MusicScreenKt$lambda-1$1\n*L\n620#1:670\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f46416OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(301908392, iIntValue, -1, "com.yalla.yalla.module.media.music.ComposableSingletons$MusicScreenKt.lambda-1.<anonymous> (MusicScreen.kt:612)");
                }
                o0000Ooo.OooO00o(o0000.OooO0OO(oO00OOo0.No_music_available), oOo00OO0.icon_request_error_green, 0.0f, null, null, false, PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m3765constructorimpl(Constants.ERR_PUBLISH_STREAM_NOT_FOUND), 0.0f, 0.0f, 13, null), null, null, composer2, 1769472, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
