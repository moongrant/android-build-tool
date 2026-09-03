package p498o0o00Oo0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public class o00O00O {
    @NotNull
    public final <T, R extends Response<T>> R OooO00o(@NotNull R response, @Nullable Integer num, @Nullable String str) {
        Intrinsics.checkNotNullParameter(response, "response");
        response.setError(new Error(num, str));
        return response;
    }

    @NotNull
    public final <T, R extends Response<T>> R OooO0O0(@NotNull R result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Object data = result.getData();
        List list = data instanceof List ? (List) data : null;
        result.setNoMoreData(list == null || list.size() < result.getPage().getPageSize());
        result.setSuccess(true);
        return result;
    }

    @NotNull
    public final <T> Response<T> OooO0OO(@Nullable String str, @Nullable String str2) {
        return new Response<>(false, null, false, new Error(str != null ? Integer.valueOf(o000Oo0.OooO0OO(str, 0)) : null, str2), 6, null);
    }

    @NotNull
    public final <T> Response<T> OooO0Oo(@Nullable Response<T> response) {
        boolean z;
        T data = response != null ? response.getData() : null;
        List list = data instanceof List ? (List) data : null;
        if (list != null) {
            z = list.size() < response.getPage().getPageSize();
        } else {
            z = true;
        }
        return new Response<>(true, response != null ? response.getData() : null, z, null, 8, null);
    }
}
