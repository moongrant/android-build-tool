package p412o0Oo0o0O;

import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.ui.vm.moment.TopicEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function1<Response<Boolean>, Unit> f46345OooO0o0;

    public o0oOOo(TopicEditVM.OooO0O0 oooO0O0) {
        this.f46345OooO0o0 = oooO0O0;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(@Nullable String str, @Nullable String str2) {
        super.OooO0O0(str, str2);
        this.f46345OooO0o0.invoke(new Response<>(false, null, false, new Error(str != null ? Integer.valueOf(Integer.parseInt(str)) : null, str2), 6, null));
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@Nullable String str) {
        this.f46345OooO0o0.invoke(new Response<>(true, Boolean.TRUE, false, null, 12, null));
    }
}
