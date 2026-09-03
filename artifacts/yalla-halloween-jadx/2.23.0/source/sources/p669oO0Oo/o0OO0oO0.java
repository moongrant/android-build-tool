package p669oO0Oo;

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
import oO0OO.OooOO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0O00o0;
import p475o0o000.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomOnlineListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomOnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomOnlineListDialog\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,43:1\n76#2:44\n25#3:45\n1097#4,6:46\n81#5:52\n107#5,2:53\n*S KotlinDebug\n*F\n+ 1 LiveRoomOnlineListDialog.kt\ncom/yalla/yalla/ui/dialog/room/LiveRoomOnlineListDialog\n*L\n21#1:44\n22#1:45\n22#1:46,6\n22#1:52\n22#1:53,2\n*E\n"})
public final class o0OO0oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO0oO0 f60705OooO00o = new o0OO0oO0();

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomOnlineListDialog$OnDialog$1", f = "LiveRoomOnlineListDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f60706OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<OooOO0O> f60707OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MutableState<OooOO0O> mutableState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f60706OooO0Oo = context;
            this.f60707OooO0o0 = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f60706OooO0Oo, this.f60707OooO0o0, continuation);
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
            OooOO0O value;
            OooOO0O value2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = com.yalla.yalla.service.room.OooO00o.f24981OooOO0;
            boolean zBooleanValue = o000000o2.f47412OooO00o.getValue().booleanValue();
            MutableState<OooOO0O> mutableState = this.f60707OooO0o0;
            if (zBooleanValue) {
                if (mutableState.getValue() == null) {
                    mutableState.setValue(new OooOO0O());
                    OooOO0O value3 = mutableState.getValue();
                    if (value3 != null) {
                        value3.f60392OooOo00 = new o0O00o0();
                    }
                }
                Context context = this.f60706OooO0Oo;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null && (value2 = mutableState.getValue()) != null) {
                    value2.show(fragmentActivity.getSupportFragmentManager(), o0000.OooO0OO(oO00OOo0.Online_Users) + ": " + o000000o2.f47413OooO0O0.getValue());
                }
            } else {
                OooOO0O value4 = mutableState.getValue();
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
        public final /* synthetic */ int f60709OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f60709OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f60709OooO0o0 | 1);
            o0OO0oO0.this.OooO00o(composer, iUpdateChangedFlags);
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
            EffectsKt.LaunchedEffect(SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47412OooO00o, null, composerStartRestartGroup, 8, 1).getValue(), new OooO00o(context, (MutableState) objRememberedValue, null), composerStartRestartGroup, 64);
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
