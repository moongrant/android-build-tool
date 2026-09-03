package com.yalla.yalla.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.o000OO00;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010OooOOoo.Oooo0;
import p147o00Oo0Oo.o000OOo;
import p519o0o0O0oO.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseComposeActivity;", "Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@Deprecated(message = "直接使用Screen")
@SourceDebugExtension({"SMAP\nBaseComposeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseComposeActivity.kt\ncom/yalla/yalla/ui/activity/BaseComposeActivity\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,63:1\n81#2:64\n107#2,2:65\n*S KotlinDebug\n*F\n+ 1 BaseComposeActivity.kt\ncom/yalla/yalla/ui/activity/BaseComposeActivity\n*L\n25#1:64\n25#1:65,2\n*E\n"})
public abstract class BaseComposeActivity extends BaseAppCompatActivity {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f25140OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f25141OooO0oO;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            BaseComposeActivity.this.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oO00O0oO> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO00O0oO invoke() {
            return new oO00O0oO(BaseComposeActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {
        public OooO0OO() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-297643682, iIntValue, -1, "com.yalla.yalla.ui.activity.BaseComposeActivity.onCreate.<anonymous> (BaseComposeActivity.kt:30)");
                }
                o000OOo.OooO00o(true, ComposableLambdaKt.composableLambda(composer2, -2116732229, true, new com.yalla.yalla.ui.activity.OooO00o(BaseComposeActivity.this)), composer2, 54);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public BaseComposeActivity() {
        new OooO00o();
        this.f25140OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f25141OooO0oO = LazyKt.lazy(new OooO0O0());
    }

    @Composable
    public abstract void OooOOOO(@Nullable Composer composer, int i);

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000OO00.OooO00o(getWindow(), false);
        getWindow().setSoftInputMode(16);
        getWindow().setStatusBarColor(Color.argb(0, 0, 0, 0));
        Oooo0.OooO00o(this, ComposableLambdaKt.composableLambdaInstance(-297643682, true, new OooO0OO()));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f25140OooO0o.setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f25140OooO0o.setValue(Boolean.TRUE);
    }
}
