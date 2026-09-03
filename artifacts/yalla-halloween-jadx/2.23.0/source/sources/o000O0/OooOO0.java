package o000O0;

import androidx.paging.o0OOO0o;
import androidx.paging.o0Oo0oo;
import androidx.paging.o0ooOOo;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends o0Oo0oo<Object> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<Object> f34336OooOOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooO0O0 oooO0O0, OooO oooO, MainCoroutineDispatcher mainCoroutineDispatcher, o0OOO0o o0ooo0o2) {
        super(oooO, mainCoroutineDispatcher, o0ooo0o2);
        this.f34336OooOOO = oooO0O0;
    }

    @Override // androidx.paging.o0Oo0oo
    @Nullable
    public final Object OooO0Oo(@NotNull o0ooOOo o0ooooo, @NotNull o0ooOOo o0ooooo2, int i, @NotNull o000O0O0 o000o0o1, @NotNull Continuation continuation) {
        o000o0o1.invoke();
        OooO0O0<Object> oooO0O0 = this.f34336OooOOO;
        oooO0O0.f34330OooO0OO.setValue(oooO0O0.f34329OooO0O0.OooO0o0());
        return null;
    }
}
