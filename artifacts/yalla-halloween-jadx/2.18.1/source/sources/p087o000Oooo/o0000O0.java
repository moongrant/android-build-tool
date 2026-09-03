package p087o000Oooo;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045OooooOo.o00O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final UUID f28540OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public o00O0O00 f28541OooO0O0;

    public o0000O0(@NotNull SavedStateHandle handle) {
        Intrinsics.checkNotNullParameter(handle, "handle");
        UUID uuidRandomUUID = (UUID) handle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            handle.set("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID().also { handle.set(IdKey, it) }");
        }
        this.f28540OooO00o = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        o00O0O00 o00o0o01 = this.f28541OooO0O0;
        if (o00o0o01 != null) {
            o00o0o01.OooO0O0(this.f28540OooO00o);
        }
    }
}
