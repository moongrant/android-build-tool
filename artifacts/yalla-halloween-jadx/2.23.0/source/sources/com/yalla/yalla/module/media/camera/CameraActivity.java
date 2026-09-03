package com.yalla.yalla.module.media.camera;

import android.os.Bundle;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.o000OO00;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.Oooo0;
import p063o0000oO.o00Ooo;
import p147o00Oo0Oo.o000OOo;
import p382o0OOoo0o.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/module/media/camera/CameraActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Media_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class CameraActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f24134OooOOo = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f24135OooOOo0 = new OooO0O0();

    @SourceDebugExtension({"SMAP\nCameraActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraActivity.kt\ncom/yalla/yalla/module/media/camera/CameraActivity$onCreate$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,166:1\n36#2:167\n1097#3,6:168\n*S KotlinDebug\n*F\n+ 1 CameraActivity.kt\ncom/yalla/yalla/module/media/camera/CameraActivity$onCreate$1\n*L\n145#1:167\n145#1:168,6\n*E\n"})
    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Bundle f24137OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Bundle bundle) {
            super(2);
            this.f24137OooO0o0 = bundle;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1021955354, iIntValue, -1, "com.yalla.yalla.module.media.camera.CameraActivity.onCreate.<anonymous> (CameraActivity.kt:96)");
                }
                DarkThemeKt.isSystemInDarkTheme(composer2, 0);
                boolean zOooO00o = o0OoOo0.OooO00o(composer2, o0OoOo0.f44304OooO0o0);
                Bundle bundle = this.f24137OooO0o0;
                CameraActivity cameraActivity = CameraActivity.this;
                o000OOo.OooO00o(zOooO00o, ComposableLambdaKt.composableLambda(composer2, -98709629, true, new OooOO0(cameraActivity, bundle)), composer2, 48);
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(cameraActivity);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooOO0O(cameraActivity, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            CameraActivity cameraActivity = CameraActivity.this;
            Intrinsics.checkNotNull(cameraActivity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
            cameraActivity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(2060472183, true, new OooOOO(cameraActivity)));
            return Unit.INSTANCE;
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000OO00.OooO00o(getWindow(), false);
        getWindow().setStatusBarColor(0);
        Bundle bundleExtra = getIntent().getBundleExtra("compose_params");
        if (bundleExtra == null) {
            bundleExtra = o00Ooo.OooO00o();
        }
        Intrinsics.checkNotNullExpressionValue(bundleExtra, "intent.getBundleExtra(Sc…ter.Params) ?: bundleOf()");
        Oooo0.OooO00o(this, ComposableLambdaKt.composableLambdaInstance(-1021955354, true, new OooO00o(bundleExtra)));
    }
}
