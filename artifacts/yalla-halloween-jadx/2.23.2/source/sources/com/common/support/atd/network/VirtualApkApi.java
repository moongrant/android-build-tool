package com.common.support.atd.network;

import com.common.support.atd.base.LoggerKt;
import com.common.support.atd.network.convertor.SysServerConvertor;
import com.common.support.okhttpforsdk.BaseApi;
import com.common.support.okhttpforsdk.HttpService;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00O0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u001f\u0010\u0007\u001a\u001b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/common/support/atd/network/VirtualApkApi;", "Lcom/common/support/okhttpforsdk/BaseApi;", "()V", "requestPackageList", "", "localHash", "", "onSuccess", "Lkotlin/Function1;", "Lcom/common/support/atd/network/BaseServerResponse;", "Lcom/common/support/atd/network/PackageRespModel;", "Lkotlin/ExtensionFunctionType;", "Companion", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VirtualApkApi extends BaseApi {

    @NotNull
    public static final String REQUEST_PATH = "sailfish_globalservice/package/v1/getriskpkg";

    public VirtualApkApi() {
        super(HttpService.INSTANCE.createClient(), Domain.INSTANCE.getDomain(), new SysServerConvertor(), null, 8, null);
    }

    public final void requestPackageList(@NotNull String localHash, @NotNull Function1<? super BaseServerResponse<PackageRespModel>, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(localHash, "localHash");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        o0O00O0o o0o00o0oPost = post(REQUEST_PATH, new Pair<>("VersionHex", localHash));
        Type respType = new TypeToken<BaseServerResponse<PackageRespModel>>() { // from class: com.common.support.atd.network.VirtualApkApi$requestPackageList$respType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(respType, "respType");
        async(o0o00o0oPost, respType, new Function2<Integer, Throwable, Unit>() { // from class: com.common.support.atd.network.VirtualApkApi.requestPackageList.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Throwable th) {
                invoke(num.intValue(), th);
                return Unit.INSTANCE;
            }

            public final void invoke(int i, @Nullable Throwable th) {
                LoggerKt.logE$default("request package list fail", null, 2, null);
            }
        }, onSuccess);
    }
}
