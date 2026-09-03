package p091o000o00o;

import androidx.annotation.NonNull;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends o00000O0.OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0000O0O f29211OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o0000O0O o0000o0o2, String[] strArr) {
        super(strArr);
        this.f29211OooO0O0 = o0000o0o2;
    }

    @Override // o000o00o.o00000O0.OooO0OO
    public final void OooO00o(@NonNull Set<String> set) {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.f29211OooO0O0.f29186OooOO0);
    }
}
