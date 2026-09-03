package p377o0OOoOo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000OO0<T> implements Observer<ApiResult<T>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final Function1<? super T, Unit> f44211OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final Function1<? super ApiResult<T>, Unit> f44212OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Function1<? super ApiError, Unit> f44213OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f44214OooO0oO;

    public o0000OO0(@Nullable Function1<? super T, Unit> function1, @Nullable Function1<? super ApiError, Unit> function2, @Nullable Function1<? super ApiResult<T>, Unit> function3, boolean z) {
        this.f44211OooO0Oo = function1;
        this.f44213OooO0o0 = function2;
        this.f44212OooO0o = function3;
        this.f44214OooO0oO = z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ApiResult result = (ApiResult) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isSuccess()) {
            Function1<? super T, Unit> function1 = this.f44211OooO0Oo;
            if (function1 != null) {
                function1.invoke((Object) result.getData());
            }
        } else {
            Function1<? super ApiError, Unit> function2 = this.f44213OooO0o0;
            if (function2 != null) {
                function2.invoke(result.getError());
            }
            if (!this.f44214OooO0oO) {
                ApiError error = result.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            }
        }
        Function1<? super ApiResult<T>, Unit> function3 = this.f44212OooO0o;
        if (function3 != null) {
            function3.invoke(result);
        }
    }

    public /* synthetic */ o0000OO0(Function1 function1, Function1 function2, Function1 function3, boolean z, int i) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3, (i & 8) != 0 ? false : z);
    }
}
