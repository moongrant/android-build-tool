package oo0O;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.AppConfigRepo$loadGiftList$$inlined$call$1;
import com.yalla.yalla.model.GiftPropAll;
import com.yalla.yalla.model.GiftPropModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.app.base.application.data.GiftPropManager$loadData$2", f = "GiftPropManager.kt", i = {}, l = {107, 124}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f53339Oooo0o;

    @DebugMetadata(c = "com.app.base.application.data.GiftPropManager$loadData$2$2", f = "GiftPropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            OooO0OO oooO0OO = OooO0OO.f53327OooO00o;
            OooO0OO.f53330OooO0Oo = false;
            return Unit.INSTANCE;
        }
    }

    public OooO0o(Continuation<? super OooO0o> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0o(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f53339Oooo0o;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.f53339Oooo0o = 1;
        p480o0o000.OooO0O0 oooO0O0 = p480o0o000.OooO0O0.f40748OooO00o;
        String str = p480o0o000.OooO0O0.f40750OooO0OO;
        obj = o0000O0.OooO0OO(new AppConfigRepo$loadGiftList$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.isSuccess()) {
            Collection collection = (Collection) apiResult.getData();
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (!z) {
                Map<Integer, GiftPropModel> value = OooO0OO.f53328OooO0O0.getValue();
                if (value != null) {
                    value.clear();
                }
                List<GiftPropAll> value2 = OooO0OO.f53329OooO0OO.getValue();
                if (value2 != null) {
                    value2.clear();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList();
                List<GiftPropAll> list = (List) apiResult.getData();
                if (list != null) {
                    for (GiftPropAll giftPropAll : list) {
                        giftPropAll.initTitleNamesAndShowArea();
                        arrayList.add(giftPropAll);
                        List<GiftPropModel> listAll = giftPropAll.getListAll();
                        if (listAll != null) {
                            int i2 = 0;
                            for (Object obj2 : listAll) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                GiftPropModel giftPropModel = (GiftPropModel) obj2;
                                linkedHashMap.put(Boxing.boxInt(giftPropModel.getGiftId()), giftPropModel);
                                i2 = i3;
                            }
                        }
                    }
                }
                OooO0OO.f53328OooO0O0.postValue(linkedHashMap);
                OooO0OO.f53329OooO0OO.postValue(arrayList);
            }
        }
        OooO00o oooO00o = new OooO00o(null);
        this.f53339Oooo0o = 2;
        if (o0000O0.OooO0Oo(oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
