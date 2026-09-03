package p032OoooO0;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034OoooO0O.o0000oo;
import p034OoooO0O.o000O000;
import p054o00000oo.o000O;
import p054o00000oo.o000OOo0;
import p054o00000oo.o00O0O00;
import p054o00000oo.o0O0ooO;
import p054o00000oo.oo0oOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o000 f3177OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O0000O f3178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000oo f3179OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oo0oOO0 f3180OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f3181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O000 f3182OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f3183OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f3184OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o0OoOoOo f3185OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Function1<oo0oOO0, Unit> f3186OooOO0;

    public o00OO(o0O0000O state, o0000oo selectionManager, oo0oOO0 value, boolean z, boolean z2, o000O000 preparedSelectionState, o00O0O00 offsetMapping, o0OoOoOo o0oooooo2, Function1 onValueChange) {
        o000O0o.OooO0O0 keyMapping = o000Oo0.f3093OooO00o;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(preparedSelectionState, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(keyMapping, "keyMapping");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.f3178OooO00o = state;
        this.f3179OooO0O0 = selectionManager;
        this.f3180OooO0OO = value;
        this.f3181OooO0Oo = z;
        this.f3183OooO0o0 = z2;
        this.f3182OooO0o = preparedSelectionState;
        this.f3184OooO0oO = offsetMapping;
        this.f3185OooO0oo = o0oooooo2;
        this.f3177OooO = keyMapping;
        this.f3186OooOO0 = onValueChange;
    }

    public final void OooO00o(List<? extends o000O> list) {
        o000OOo0 o000ooo1 = this.f3178OooO00o.f3321OooO0OO;
        List<? extends o000O> mutableList = CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new o0O0ooO());
        this.f3186OooOO0.invoke(o000ooo1.OooO00o(mutableList));
    }
}
