package com.code.android.uikit.swiprefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefreshState.kt\ncom/code/android/uikit/swiprefresh/RefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,54:1\n81#2:55\n107#2,2:56\n*S KotlinDebug\n*F\n+ 1 RefreshState.kt\ncom/code/android/uikit/swiprefresh/RefreshState\n*L\n23#1:55\n23#1:56,2\n*E\n"})
public final class RefreshState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Animatable<Float, AnimationVector1D> f13306OooO00o = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f13307OooO0O0 = new MutatorMutex();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f13308OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(State.Null, null, 2, null);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v2 com.code.android.uikit.swiprefresh.RefreshState$State[], still in use, count: 1, list:
      (r9v2 com.code.android.uikit.swiprefresh.RefreshState$State[]) from 0x0041: INVOKE (r9v2 com.code.android.uikit.swiprefresh.RefreshState$State[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:66)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/code/android/uikit/swiprefresh/RefreshState$State;", "", "Null", "Pull", "Refresh", "Finish", "Close", "YLUIKit_release"}, k = 1, mv = {1, 9, 0})
    public static final class State {
        Null,
        Pull,
        Refresh,
        Finish,
        Close;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr);
        }

        public State() {
            super(str, i);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @Nullable
    public final Object OooO00o(float f, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.f13306OooO00o, Boxing.boxFloat(f), new TweenSpec((int) j, 0, null, 6, null), null, null, continuation, 12, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final float OooO0O0() {
        return this.f13306OooO00o.getValue().floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final State OooO0OO() {
        return (State) this.f13308OooO0OO.getValue();
    }

    public final void OooO0Oo(boolean z) {
        OooO0o0(z ? State.Refresh : State.Finish);
    }

    public final void OooO0o0(@NotNull State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.f13308OooO0OO.setValue(state);
    }
}
