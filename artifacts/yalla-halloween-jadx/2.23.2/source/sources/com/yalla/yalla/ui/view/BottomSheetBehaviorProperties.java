package com.yalla.yalla.ui.view;

import androidx.compose.animation.o0OoOo0;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
public final class BottomSheetBehaviorProperties {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f29806OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final State f29807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f29808OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f29809OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f29810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f29811OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f29812OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f29813OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f29814OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f29815OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f29816OooOO0O;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.ui.view.BottomSheetBehaviorProperties$State[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.ui.view.BottomSheetBehaviorProperties$State[]) from 0x0029: INVOKE (r5v2 com.yalla.yalla.ui.view.BottomSheetBehaviorProperties$State[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/view/BottomSheetBehaviorProperties$State;", "", "Expanded", "HalfExpanded", "Collapsed", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    @Immutable
    public static final class State {
        Expanded,
        HalfExpanded,
        Collapsed;

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

    public BottomSheetBehaviorProperties(State state, boolean z, int i) {
        state = (i & 1) != 0 ? State.Collapsed : state;
        int i2 = (i & 2) != 0 ? -1 : 0;
        int i3 = (i & 4) != 0 ? -1 : 0;
        boolean z2 = (i & 8) != 0;
        float f = (i & 32) != 0 ? 0.5f : 0.0f;
        boolean z3 = (i & 64) != 0;
        int i4 = (i & 128) == 0 ? 0 : -1;
        boolean z4 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        z = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f29807OooO00o = state;
        this.f29808OooO0O0 = i2;
        this.f29809OooO0OO = i3;
        this.f29810OooO0Oo = z2;
        this.f29812OooO0o0 = 0;
        this.f29811OooO0o = f;
        this.f29813OooO0oO = z3;
        this.f29814OooO0oo = i4;
        this.f29806OooO = z4;
        this.f29815OooOO0 = z;
        this.f29816OooOO0O = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetBehaviorProperties)) {
            return false;
        }
        BottomSheetBehaviorProperties bottomSheetBehaviorProperties = (BottomSheetBehaviorProperties) obj;
        if (this.f29807OooO00o != bottomSheetBehaviorProperties.f29807OooO00o) {
            return false;
        }
        if (!(this.f29808OooO0O0 == bottomSheetBehaviorProperties.f29808OooO0O0)) {
            return false;
        }
        if (!(this.f29809OooO0OO == bottomSheetBehaviorProperties.f29809OooO0OO) || this.f29810OooO0Oo != bottomSheetBehaviorProperties.f29810OooO0Oo || this.f29812OooO0o0 != bottomSheetBehaviorProperties.f29812OooO0o0) {
            return false;
        }
        if ((this.f29811OooO0o == bottomSheetBehaviorProperties.f29811OooO0o) && this.f29813OooO0oO == bottomSheetBehaviorProperties.f29813OooO0oO) {
            return (this.f29814OooO0oo == bottomSheetBehaviorProperties.f29814OooO0oo) && this.f29806OooO == bottomSheetBehaviorProperties.f29806OooO && this.f29815OooOO0 == bottomSheetBehaviorProperties.f29815OooOO0 && this.f29816OooOO0O == bottomSheetBehaviorProperties.f29816OooOO0O;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((o0OoOo0.OooO00o(this.f29811OooO0o, ((((((((this.f29807OooO00o.hashCode() * 31) + this.f29808OooO0O0) * 31) + this.f29809OooO0OO) * 31) + (this.f29810OooO0Oo ? 1231 : 1237)) * 31) + this.f29812OooO0o0) * 31, 31) + (this.f29813OooO0oO ? 1231 : 1237)) * 31) + this.f29814OooO0oo) * 31) + (this.f29806OooO ? 1231 : 1237)) * 31) + (this.f29815OooOO0 ? 1231 : 1237)) * 31) + (this.f29816OooOO0O ? 1231 : 1237);
    }
}
