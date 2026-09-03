package com.app.base.app.appConfig.apiDataModela;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.CategoryModel;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eJ\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/ApiTagUtils;", "", "()V", "languageLast", "", "listModel", "", "Lcom/app/base/model/CategoryModel;", "getListModel", "()Ljava/util/List;", "setListModel", "(Ljava/util/List;)V", "mapModel", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getModelForId", "key", "getModelNameForId", "id", "init", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApiTagUtils {
    private static int languageLast;

    @NotNull
    public static final ApiTagUtils INSTANCE = new ApiTagUtils();

    @NotNull
    private static HashMap<String, CategoryModel> mapModel = new HashMap<>();

    @NotNull
    private static List<CategoryModel> listModel = new ArrayList();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.app.base.app.appConfig.apiDataModela.ApiTagUtils$init$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.app.base.app.appConfig.apiDataModela.ApiTagUtils$init$1", f = "ApiTagUtils.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
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
                String str = o0ooOOo.f32333o0OO00O;
                ApiTagUtils$init$1$invokeSuspend$$inlined$call$1 apiTagUtils$init$1$invokeSuspend$$inlined$call$1 = new ApiTagUtils$init$1$invokeSuspend$$inlined$call$1(OooO00o.OooO0O0(str, "url", str, 0), null);
                this.label = 1;
                obj = o0000O0.OooO0OO(apiTagUtils$init$1$invokeSuspend$$inlined$call$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiTagUtils apiTagUtils = ApiTagUtils.INSTANCE;
            apiTagUtils.getListModel().clear();
            List list = (List) ((ApiResult) obj).getData();
            if (list != null) {
                Boxing.boxBoolean(apiTagUtils.getListModel().addAll(list));
            }
            ApiTagUtils.mapModel.clear();
            for (CategoryModel categoryModel : apiTagUtils.getListModel()) {
                HashMap map = ApiTagUtils.mapModel;
                String id = categoryModel.getId();
                Intrinsics.checkNotNullExpressionValue(id, "dataBean.getId()");
                map.put(id, categoryModel);
            }
            return Unit.INSTANCE;
        }
    }

    private ApiTagUtils() {
    }

    @NotNull
    public final List<CategoryModel> getListModel() {
        return listModel;
    }

    @Nullable
    public final CategoryModel getModelForId(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if ((!mapModel.isEmpty()) && mapModel.containsKey(key)) {
            return mapModel.get(key);
        }
        return null;
    }

    @NotNull
    public final String getModelNameForId(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (getModelForId(id) == null) {
            return "";
        }
        CategoryModel modelForId = getModelForId(id);
        Intrinsics.checkNotNull(modelForId);
        String labelname = modelForId.getLabelname();
        Intrinsics.checkNotNullExpressionValue(labelname, "getModelForId(id)!!.getLabelname()");
        return labelname;
    }

    public final void init() {
        if (languageLast == oo000o.OooO0O0() && (!listModel.isEmpty())) {
            return;
        }
        languageLast = oo000o.OooO0O0();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setListModel(@NotNull List<CategoryModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        listModel = list;
    }
}
