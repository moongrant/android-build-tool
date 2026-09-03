package p471o0OoooO0;

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
import p196o00o0OOO.oOO00O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f47895OooO00o = ComposableLambdaKt.composableLambdaInstance(301908392, false, OooO00o.f47896OooO0Oo);

    @SourceDebugExtension({"SMAP\nMusicScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/ComposableSingletons$MusicScreenKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,667:1\n154#2:668\n*S KotlinDebug\n*F\n+ 1 MusicScreen.kt\ncom/yalla/yalla/module/media/music/ComposableSingletons$MusicScreenKt$lambda-1$1\n*L\n618#1:668\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47896OooO0Oo = new OooO00o();

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
                    ComposerKt.traceEventStart(301908392, iIntValue, -1, "com.yalla.yalla.module.media.music.ComposableSingletons$MusicScreenKt.lambda-1.<anonymous> (MusicScreen.kt:611)");
                }
                oOO00O.OooO00o(o0000.OooO0OO(o000000.No_music_available), o0Oo0oo.icon_request_error_green, 0.0f, null, null, false, PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(Constants.ERR_PUBLISH_STREAM_NOT_FOUND), 0.0f, 0.0f, 13, null), null, null, composer2, 1769472, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
