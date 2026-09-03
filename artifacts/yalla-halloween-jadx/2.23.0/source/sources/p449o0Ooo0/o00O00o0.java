package p449o0Ooo0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.media.music.MusicScreen;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O00o0 implements Observer, FunctionAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1 f46424OooO0Oo;

    public o00O00o0(MusicScreen.o0OOO0o function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f46424OooO0Oo = function;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
            return false;
        }
        return Intrinsics.areEqual(this.f46424OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    public final Function<?> getFunctionDelegate() {
        return this.f46424OooO0Oo;
    }

    public final int hashCode() {
        return this.f46424OooO0Oo.hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.f46424OooO0Oo.invoke(obj);
    }
}
