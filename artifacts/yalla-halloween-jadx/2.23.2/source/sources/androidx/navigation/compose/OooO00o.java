package androidx.navigation.compose;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavBackStackEntryProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryProvider.kt\nandroidx/navigation/compose/BackStackEntryIdViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public final class OooO00o extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final UUID f10098OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public WeakReference<SaveableStateHolder> f10099OooO0O0;

    public OooO00o(@NotNull SavedStateHandle savedStateHandle) {
        UUID uuidRandomUUID = (UUID) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
        }
        this.f10098OooO00o = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        WeakReference<SaveableStateHolder> weakReference = this.f10099OooO0O0;
        WeakReference<SaveableStateHolder> weakReference2 = null;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
            weakReference = null;
        }
        SaveableStateHolder saveableStateHolder = weakReference.get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.f10098OooO00o);
        }
        WeakReference<SaveableStateHolder> weakReference3 = this.f10099OooO0O0;
        if (weakReference3 != null) {
            weakReference2 = weakReference3;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("saveableStateHolderRef");
        }
        weakReference2.clear();
    }
}
