package androidx.lifecycle.viewmodel.compose;

import androidx.lifecycle.SavedStateHandle;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045OooooOo.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$saveState$1$1 implements o00OO00O, FunctionAdapter {
    public final /* synthetic */ SavedStateHandle.Companion $tmp0;

    public SavedStateHandleSaverKt$saveable$1$saveState$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // p045OooooOo.o00OO00O
    public final boolean canBeSaved(@Nullable Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof o00OO00O) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
