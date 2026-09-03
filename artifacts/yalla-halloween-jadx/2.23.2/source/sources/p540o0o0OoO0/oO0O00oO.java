package p540o0o0OoO0;

import android.app.Dialog;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p483o0o000Oo.o0000O0;
import p525o0o0OO0.o0o0Oo;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomOnlineListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomOnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomOnlineListDialog\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,43:1\n76#2:44\n25#3:45\n1097#4,6:46\n81#5:52\n107#5,2:53\n*S KotlinDebug\n*F\n+ 1 LiveRoomOnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomOnlineListDialog\n*L\n21#1:44\n22#1:45\n22#1:46,6\n22#1:52\n22#1:53,2\n*E\n"})
public final class oO0O00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0O00oO f54964OooO00o = new oO0O00oO();

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomOnlineListDialog$OnDialog$1", f = "LiveRoomOnlineListDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f54965OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<o0o0Oo> f54966OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MutableState<o0o0Oo> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54965OooO0Oo = context;
            this.f54966OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54965OooO0Oo, this.f54966OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            o0o0Oo value;
            o0o0Oo value2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0000O0 o0000o1 = com.yalla.yalla.service.room.OooO00o.f24519OooOO0;
            boolean zBooleanValue = o0000o1.f48493OooO00o.getValue().booleanValue();
            MutableState<o0o0Oo> mutableState = this.f54966OooO0o0;
            if (zBooleanValue) {
                if (mutableState.getValue() == null) {
                    mutableState.setValue(new o0o0Oo());
                    o0o0Oo value3 = mutableState.getValue();
                    if (value3 != null) {
                        value3.f53257OooOo00 = new oO0O00o0();
                    }
                }
                Context context = this.f54965OooO0Oo;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null && (value2 = mutableState.getValue()) != null) {
                    value2.show(fragmentActivity.getSupportFragmentManager(), o0000.OooO0OO(o000000.Online_Users) + ": " + o0000o1.f48494OooO0O0.getValue());
                }
            } else {
                o0o0Oo value4 = mutableState.getValue();
                if (value4 != null) {
                    Dialog dialog = value4.getDialog();
                    if (dialog != null) {
                        z = dialog.isShowing();
                    }
                    if (z && (value = mutableState.getValue()) != null) {
                        value.dismiss();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54968OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f54968OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54968OooO0o0 | 1);
            oO0O00oO.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(161514577);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(161514577, i, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomOnlineListDialog.OnDialog (LiveRoomOnlineListDialog.kt:19)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48493OooO00o, null, composerStartRestartGroup, 8, 1).getValue(), new OooO00o(context, (MutableState) objRememberedValue, null), composerStartRestartGroup, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(i));
    }
}
