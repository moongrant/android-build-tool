package p518o0o0O00o;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O00O;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p514o0o0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nFacePanelController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FacePanelController.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelController\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,87:1\n154#2:88\n154#2:89\n174#2:90\n81#3:91\n107#3,2:92\n81#3:94\n107#3,2:95\n81#3:97\n107#3,2:98\n81#3:100\n107#3,2:101\n81#3:103\n107#3,2:104\n*S KotlinDebug\n*F\n+ 1 FacePanelController.kt\ncom/yalla/yalla/ui/composable/face_panel/FacePanelController\n*L\n35#1:88\n38#1:89\n26#1:90\n32#1:91\n32#1:92,2\n35#1:94\n35#1:95,2\n38#1:97\n38#1:98,2\n41#1:100\n41#1:101,2\n44#1:103\n44#1:104,2\n*E\n"})
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Boolean, Unit> f51743OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f51744OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public Function1<? super Boolean, Unit> f51745OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f51746OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f51747OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f51748OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f51749OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f51750OooO0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.composable.face_panel.FacePanelController", f = "FacePanelController.kt", i = {0}, l = {82}, m = "hidePanel", n = {"this"}, s = {"L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0ooOOo f51751OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f51753OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f51754OooO0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f51753OooO0o0 = obj;
            this.f51754OooO0oO |= Integer.MIN_VALUE;
            return o0ooOOo.this.OooO0oO(this);
        }
    }

    public o0ooOOo(@NotNull OooO0OO.o00Oo0 onRequestSwitchKeyboard) {
        Intrinsics.checkNotNullParameter(onRequestSwitchKeyboard, "onRequestSwitchKeyboard");
        this.f51743OooO00o = onRequestSwitchKeyboard;
        this.f51744OooO0O0 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.f51745OooO0OO = o0OOO0o.f51741OooO0Oo;
        Boolean bool = Boolean.FALSE;
        this.f51746OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        p373o0OOo0oO.o0ooOOo o0ooooo = p373o0OOo0oO.o0ooOOo.f43183OooO00o;
        Context contextOooO00o = o000O00O.OooO00o();
        int iOooO00o = o0000O0.OooO00o(300);
        o0ooooo.getClass();
        this.f51748OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(o0000O0.OooO0O0(p373o0OOo0oO.o0ooOOo.OooO00o(iOooO00o, contextOooO00o)))), null, 2, null);
        this.f51747OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m3773boximpl(Dp.m3775constructorimpl(0)), null, 2, null);
        this.f51749OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f51750OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public final void OooO(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f51745OooO0OO = function1;
    }

    @Nullable
    public final Object OooO00o(float f, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.f51744OooO0O0, Boxing.boxFloat(f), AnimationSpecKt.tween$default(400, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, continuation, 12, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final float OooO0O0() {
        return Dp.m3775constructorimpl(this.f51744OooO0O0.getValue().floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0OO() {
        return ((Boolean) this.f51750OooO0oo.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO0Oo() {
        return ((Dp) this.f51747OooO0o.getValue()).m3789unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0o() {
        return ((Boolean) this.f51749OooO0oO.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO0o0() {
        return ((Dp) this.f51748OooO0o0.getValue()).m3789unboximpl();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(@NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        o0ooOOo o0ooooo;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f51754OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f51754OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object obj = oooO00o.f51753OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f51754OooO0oO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (OooO0o()) {
                this.f51743OooO00o.invoke(Boxing.boxBoolean(false));
            } else if (OooO0OO()) {
                this.f51750OooO0oo.setValue(Boolean.FALSE);
                oooO00o.f51751OooO0Oo = this;
                oooO00o.f51754OooO0oO = 1;
                if (OooO00o(0.0f, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0ooooo = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o0ooooo = oooO00o.f51751OooO0Oo;
        ResultKt.throwOnFailure(obj);
        o0ooooo.getClass();
        o0ooooo.f51745OooO0OO.invoke(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }

    public final void OooO0oo(boolean z) {
        this.f51746OooO0Oo.setValue(Boolean.valueOf(z));
    }

    @Nullable
    public final Object OooOO0(@NotNull Continuation<? super Unit> continuation) {
        boolean zOooO0o = OooO0o();
        MutableState mutableState = this.f51750OooO0oo;
        Function1<Boolean, Unit> function1 = this.f51743OooO00o;
        if (zOooO0o) {
            mutableState.setValue(Boolean.TRUE);
            function1.invoke(Boxing.boxBoolean(false));
        } else {
            if (!OooO0OO()) {
                OooO0oo(false);
                mutableState.setValue(Boolean.TRUE);
                this.f51745OooO0OO.invoke(Boxing.boxBoolean(true));
                Object objOooO00o = OooO00o(OooO0o0(), continuation);
                return objOooO00o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO00o : Unit.INSTANCE;
            }
            function1.invoke(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }
}
