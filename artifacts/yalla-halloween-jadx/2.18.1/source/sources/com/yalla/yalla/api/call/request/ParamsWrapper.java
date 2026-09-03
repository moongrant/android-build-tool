package com.yalla.yalla.api.call.request;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.HeaderMap;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/api/call/request/ParamsWrapper;", "", "", "", "formParams", "json", "headers", "<init>", "(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ParamsWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Map<String, Object> f20567OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Object f20568OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Map<String, String> f20569OooO0OO;

    public ParamsWrapper() {
        this(null, null, null);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, Object> map = this.f20567OooO00o;
        if (map != null) {
            sb.append("formParams:" + map + "  ");
        }
        Object obj = this.f20568OooO0O0;
        if (obj != null) {
            sb.append("json:" + obj + "  ");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }

    public ParamsWrapper(@Nullable Map<String, ? extends Object> map, @Nullable Object obj, @HeaderMap @Nullable Map<String, String> map2) {
        this.f20567OooO00o = map;
        this.f20568OooO0O0 = obj;
        this.f20569OooO0OO = map2;
    }
}
