package com.app.base.app.appConfig.apiDataModela;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.CountryModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.common.model.ApiResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o0000O0;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007`\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/ApiCountryUtils;", "", "()V", "languageLast", "", "listModel", "Ljava/util/ArrayList;", "Lcom/app/base/model/CountryModel;", "Lkotlin/collections/ArrayList;", "getListModel", "()Ljava/util/ArrayList;", "setListModel", "(Ljava/util/ArrayList;)V", "mapModel", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getMapModel", "()Ljava/util/HashMap;", "getModelForId", "key", "getModelNameForId", "id", "init", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/app/base/app/appConfig/apiDataModela/ApiCountryUtils$OnLoadFinishListener;", "sort", "OnLoadFinishListener", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApiCountryUtils {
    private static int languageLast;

    @NotNull
    public static final ApiCountryUtils INSTANCE = new ApiCountryUtils();

    @NotNull
    private static final HashMap<String, CountryModel> mapModel = new HashMap<>();

    @NotNull
    private static ArrayList<CountryModel> listModel = new ArrayList<>();
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&¨\u0006\b"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/ApiCountryUtils$OnLoadFinishListener;", "", "onLoadFinish", "", "countryModelList", "Ljava/util/ArrayList;", "Lcom/app/base/model/CountryModel;", "Lkotlin/collections/ArrayList;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnLoadFinishListener {
        void onLoadFinish(@NotNull ArrayList<CountryModel> countryModelList);
    }

    /* JADX INFO: renamed from: com.app.base.app.appConfig.apiDataModela.ApiCountryUtils$init$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.app.base.app.appConfig.apiDataModela.ApiCountryUtils$init$1", f = "ApiCountryUtils.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ OnLoadFinishListener $listener;
        public final /* synthetic */ String $sort;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, OnLoadFinishListener onLoadFinishListener, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sort = str;
            this.$listener = onLoadFinishListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$sort, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                String str = o0ooOOo.f32334o0OOO0o;
                o00O000o o00o000oOooO0O0 = OooO00o.OooO0O0(str, "url", str, 0);
                o00o000oOooO0O0.OooO0O0("sort", this.$sort);
                ApiCountryUtils$init$1$invokeSuspend$$inlined$call$1 apiCountryUtils$init$1$invokeSuspend$$inlined$call$1 = new ApiCountryUtils$init$1$invokeSuspend$$inlined$call$1(o00o000oOooO0O0, null);
                this.label = 1;
                obj = o0000O0.OooO0OO(apiCountryUtils$init$1$invokeSuspend$$inlined$call$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.getData() != null && apiResult.isSuccess()) {
                ApiCountryUtils apiCountryUtils = ApiCountryUtils.INSTANCE;
                apiCountryUtils.getListModel().clear();
                apiCountryUtils.getMapModel().clear();
                List list = (List) apiResult.getData();
                if (list != null) {
                    Boxing.boxBoolean(apiCountryUtils.getListModel().addAll(list));
                }
                for (CountryModel dataBean : apiCountryUtils.getListModel()) {
                    HashMap<String, CountryModel> mapModel = ApiCountryUtils.INSTANCE.getMapModel();
                    String cid = dataBean.getCid();
                    Intrinsics.checkNotNullExpressionValue(cid, "dataBean.cid");
                    Intrinsics.checkNotNullExpressionValue(dataBean, "dataBean");
                    mapModel.put(cid, dataBean);
                }
                OnLoadFinishListener onLoadFinishListener = this.$listener;
                if (onLoadFinishListener != null) {
                    onLoadFinishListener.onLoadFinish(ApiCountryUtils.INSTANCE.getListModel());
                }
            }
            return Unit.INSTANCE;
        }
    }

    private ApiCountryUtils() {
    }

    @JvmStatic
    public static final void init() {
        INSTANCE.init("1", null);
    }

    @NotNull
    public final ArrayList<CountryModel> getListModel() {
        return listModel;
    }

    @NotNull
    public final HashMap<String, CountryModel> getMapModel() {
        return mapModel;
    }

    @Nullable
    public final CountryModel getModelForId(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, CountryModel> map = mapModel;
        if ((!map.isEmpty()) && map.containsKey(key)) {
            return map.get(key);
        }
        return null;
    }

    @NotNull
    public final String getModelNameForId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        CountryModel modelForId = getModelForId(id);
        if (modelForId == null) {
            return "";
        }
        String name = modelForId.getName();
        Intrinsics.checkNotNullExpressionValue(name, "countryModel.name");
        return name;
    }

    public final void setListModel(@NotNull ArrayList<CountryModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        listModel = arrayList;
    }

    public final void init(@NotNull OnLoadFinishListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        init("1", listener);
    }

    private final void init(String sort, OnLoadFinishListener listener) {
        if (languageLast == oo000o.OooO0O0() && (!listModel.isEmpty())) {
            return;
        }
        languageLast = oo000o.OooO0O0();
        o0000O0.OooO0O0(GlobalScope.INSTANCE, new AnonymousClass1(sort, listener, null));
    }
}
