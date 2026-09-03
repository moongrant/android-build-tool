package p524o0o0OO0o;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.service.room.OooO0O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p150o00Oo0oO.o0000Ooo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ComposableLambda f53519OooO00o = ComposableLambdaKt.composableLambdaInstance(16000150, false, OooO00o.f53520OooO0Oo);

    public static final class OooO00o extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53520OooO0Oo = new OooO00o();

        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            int i;
            LazyItemScope item = lazyItemScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((iIntValue & 14) == 0) {
                i = (composer2.changed(item) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((i & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(16000150, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.ComposableSingletons$RoomInfoMomentFragmentKt.lambda-1.<anonymous> (RoomInfoMomentFragment.kt:141)");
                }
                Integer value = OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue();
                if (value != null && value.intValue() == 0) {
                    composer2.startReplaceableGroup(-1261967850);
                    o0000Ooo.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Only_room_members_can_view_each_others_posts, composer2, 0), oOo00OO0.ic_empty_follow, 0.0f, StringResources_androidKt.stringResource(oO00OOo0.Join, composer2, 0), null, false, androidx.compose.foundation.lazy.OooO00o.OooO0OO(item, Modifier.INSTANCE, 0.0f, 1, null), o00Oo00.f53463OooO0Oo, null, composer2, 12779520, 276);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-1261968355);
                    o0000Ooo.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.moments_none, composer2, 0), oOo00OO0.ic_empty_fans, 0.0f, null, null, false, androidx.compose.foundation.lazy.OooO00o.OooO0OO(item, Modifier.INSTANCE, 0.0f, 1, null), null, null, composer2, 196608, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
