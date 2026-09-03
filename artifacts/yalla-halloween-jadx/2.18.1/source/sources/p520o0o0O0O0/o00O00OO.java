package p520o0o0O0O0;

import com.yalla.yalla.common.model.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<Boolean>, Unit> f42675OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o00O00OO(Function1<? super Response<Boolean>, Unit> function1) {
        this.f42675OooO00o = function1;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@Nullable String str, @Nullable String str2) {
        super.onError(str, str2);
        this.f42675OooO00o.invoke(new Response<>(false, Boolean.FALSE, false, null, 12, null));
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@Nullable String str) {
        super.onFinish(str);
        this.f42675OooO00o.invoke(new Response<>(true, Boolean.TRUE, false, null, 12, null));
    }
}
