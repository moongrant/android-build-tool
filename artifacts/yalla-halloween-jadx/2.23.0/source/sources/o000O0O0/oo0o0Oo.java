package o000O0O0;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends OooOo.OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00<Object> f34826OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(String[] strArr, o0O0O00<Object> o0o0o00) {
        super(strArr);
        this.f34826OooO0O0 = o0o0o00;
    }

    @Override // o000O0O0.OooOo.OooO0OO
    public final void OooO00o(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        ArchTaskExecutor.getInstance().executeOnMainThread(this.f34826OooO0O0.f34802OooOO0);
    }
}
