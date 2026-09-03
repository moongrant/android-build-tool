package p110o000ooo0;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 extends o000000O.OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000O000<Object> f35827OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(String[] strArr, o000O000<Object> o000o001) {
        super(strArr);
        this.f35827OooO0O0 = o000o001;
    }

    @Override // o000ooo0.o000000O.OooO0OO
    public final void OooO00o(@NotNull Set<String> tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        ArchTaskExecutor.getInstance().executeOnMainThread(this.f35827OooO0O0.f35909OooOO0);
    }
}
