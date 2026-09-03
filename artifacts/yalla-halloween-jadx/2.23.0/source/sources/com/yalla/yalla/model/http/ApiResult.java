package com.yalla.yalla.model.http;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b5\u00106J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\n8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R\u0011\u0010/\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/yalla/yalla/model/http/ApiResult;", "T", "", "D", "", "data", "", "haveMore", "Lo00Oo000/OooO;", "toPagingLoadResource", "", "toString", "", "code", "I", "getCode", "()I", "setCode", "(I)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "", "dateSort", "J", "getDateSort", "()J", "setDateSort", "(J)V", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Lcom/yalla/yalla/model/http/ApiPage;", "page", "Lcom/yalla/yalla/model/http/ApiPage;", "getPage", "()Lcom/yalla/yalla/model/http/ApiPage;", "setPage", "(Lcom/yalla/yalla/model/http/ApiPage;)V", "url", "getUrl", "setUrl", "isSuccess", "()Z", "Lcom/yalla/yalla/model/http/ApiError;", "getError", "()Lcom/yalla/yalla/model/http/ApiError;", "error", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
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

    @NotNull
    private String url = "";

    public static /* synthetic */ OooO toPagingLoadResource$default(ApiResult apiResult, List list, boolean z, int i, Object obj) {
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
        return new ApiError(this.code, getMessage(), this.url);
    }

    @NotNull
    public final String getMessage() {
        String str = this.message;
        return (str.length() > 2 && StringsKt.Oooo00o(str, "\"{") && StringsKt.OooOO0O(str, "}\"")) ? StringsKt__StringsKt.removeSuffix(StringsKt.removePrefix(str, (CharSequence) "\""), (CharSequence) "\"") : str;
    }

    @NotNull
    public final ApiPage getPage() {
        return this.page;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final boolean isSuccess() {
        return this.code == 1000;
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

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public final <D> OooO<D> toPagingLoadResource(@Nullable List<? extends D> data, boolean haveMore) {
        OooO<D> oooO = new OooO<>(data, isSuccess(), haveMore);
        if (!isSuccess()) {
            ApiError error = getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return oooO;
    }

    @NotNull
    public String toString() {
        return "ApiResult(code=" + this.code + ", message='" + getMessage() + "', dateSort=" + this.dateSort + ", data=" + this.data + ", isSuccess=" + isSuccess() + ", error=" + getError() + ")";
    }
}
