package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b6\u00107J*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005\"\u0004\b\u0001\u0010\u00032\u0014\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00050\u0004J,\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\b\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u000e8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, d2 = {"Lcom/yalla/yalla/common/model/ApiResult;", "T", "", "D", "Lkotlin/Function0;", "", "pagingData", "pagingDataOrThrow", "", "data", "", "haveMore", "Lo0ooO00/o000OO0O;", "toPagingLoadResource", "", "toString", "", "code", "I", "getCode", "()I", "setCode", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "", "dateSort", "J", "getDateSort", "()J", "setDateSort", "(J)V", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Lcom/yalla/yalla/common/model/ApiPage;", "page", "Lcom/yalla/yalla/common/model/ApiPage;", "getPage", "()Lcom/yalla/yalla/common/model/ApiPage;", "setPage", "(Lcom/yalla/yalla/common/model/ApiPage;)V", "isSuccess", "()Z", "Lcom/yalla/yalla/common/model/ApiError;", "getError", "()Lcom/yalla/yalla/common/model/ApiError;", "error", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class ApiResult<T> {
    public static final int $stable = 8;
    private int code;

    @Nullable
    private T data;

    @SerializedName("datesort")
    private long dateSort;

    @NotNull
    private String message = "";

    @NotNull
    private ApiPage page = new ApiPage(0, 0, null, 7, null);

    public static /* synthetic */ o000OO0O toPagingLoadResource$default(ApiResult apiResult, List list, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPagingLoadResource");
        }
        if ((i & 2) != 0) {
            z = true ^ (list == null || list.isEmpty());
        }
        return apiResult.toPagingLoadResource(list, z);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    public final long getDateSort() {
        return this.dateSort;
    }

    @NotNull
    public final ApiError getError() {
        return new ApiError(this.code, getMessage());
    }

    @NotNull
    public final String getMessage() {
        String str = this.message;
        return (str.length() > 2 && StringsKt.OooOoOO(str, "\"{") && StringsKt__StringsJVMKt.endsWith$default(str, "}\"", false, 2, null)) ? StringsKt.removeSuffix(StringsKt.removePrefix(str, (CharSequence) "\""), (CharSequence) "\"") : str;
    }

    @NotNull
    public final ApiPage getPage() {
        return this.page;
    }

    public final boolean isSuccess() {
        return this.code == 1000;
    }

    @Nullable
    public final <D> List<D> pagingDataOrThrow(@NotNull Function0<? extends List<D>> pagingData) throws ApiException {
        Intrinsics.checkNotNullParameter(pagingData, "pagingData");
        if (isSuccess()) {
            return pagingData.invoke();
        }
        throw new ApiException(getError());
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable T t) {
        this.data = t;
    }

    public final void setDateSort(long j) {
        this.dateSort = j;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setPage(@NotNull ApiPage apiPage) {
        Intrinsics.checkNotNullParameter(apiPage, "<set-?>");
        this.page = apiPage;
    }

    @NotNull
    public final <D> o000OO0O<D> toPagingLoadResource(@Nullable List<? extends D> data, boolean haveMore) {
        o000OO0O<D> o000oo0o2 = new o000OO0O<>(isSuccess(), data, haveMore);
        if (!isSuccess()) {
            ApiError error = getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
        }
        return o000oo0o2;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ApiResult(code=");
        sbOooO0o0.append(this.code);
        sbOooO0o0.append(", message='");
        sbOooO0o0.append(getMessage());
        sbOooO0o0.append("', dateSort=");
        sbOooO0o0.append(this.dateSort);
        sbOooO0o0.append(", data=");
        sbOooO0o0.append(this.data);
        sbOooO0o0.append(", isSuccess=");
        sbOooO0o0.append(isSuccess());
        sbOooO0o0.append(", error=");
        sbOooO0o0.append(getError());
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
