package o0o0000;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOo<T> implements Observer<ApiResult<T>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function1<? super T, Unit> f40807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function1<? super ApiError, Unit> f40808OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function1<? super ApiResult<T>, Unit> f40809OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f40810OooO0Oo;

    public OooOo(@Nullable Function1<? super T, Unit> function1, @Nullable Function1<? super ApiError, Unit> function2, @Nullable Function1<? super ApiResult<T>, Unit> function3, boolean z) {
        this.f40807OooO00o = function1;
        this.f40808OooO0O0 = function2;
        this.f40809OooO0OO = function3;
        this.f40810OooO0Oo = z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ApiResult result = (ApiResult) obj;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.isSuccess()) {
            Function1<? super T, Unit> function1 = this.f40807OooO00o;
            if (function1 != null) {
                function1.invoke((Object) result.getData());
            }
        } else {
            Function1<? super ApiError, Unit> function2 = this.f40808OooO0O0;
            if (function2 != null) {
                function2.invoke(result.getError());
            }
            if (!this.f40810OooO0Oo) {
                ApiError error = result.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
            }
        }
        Function1<? super ApiResult<T>, Unit> function3 = this.f40809OooO0OO;
        if (function3 != null) {
            function3.invoke(result);
        }
    }

    public /* synthetic */ OooOo(Function1 function1, Function1 function2, Function1 function3, boolean z, int i) {
        this((i & 1) != 0 ? null : function1, (i & 2) != 0 ? null : function2, (i & 4) != 0 ? null : function3, (i & 8) != 0 ? false : z);
    }
}
