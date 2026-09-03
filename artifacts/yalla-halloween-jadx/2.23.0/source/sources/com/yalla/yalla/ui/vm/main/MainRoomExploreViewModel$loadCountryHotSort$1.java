package com.yalla.yalla.ui.vm.main;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.CountryTagModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadCountryHotSort$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMainRoomExploreViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomExploreViewModel.kt\ncom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel$loadCountryHotSort$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,131:1\n62#2:132\n*S KotlinDebug\n*F\n+ 1 MainRoomExploreViewModel.kt\ncom/yalla/yalla/ui/vm/main/MainRoomExploreViewModel$loadCountryHotSort$1\n*L\n120#1:132\n*E\n"})
public final class MainRoomExploreViewModel$loadCountryHotSort$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f31758OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MainRoomExploreViewModel f31759OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomExploreViewModel$loadCountryHotSort$1(MainRoomExploreViewModel mainRoomExploreViewModel, Continuation<? super MainRoomExploreViewModel$loadCountryHotSort$1> continuation) {
        super(2, continuation);
        this.f31759OooO0o0 = mainRoomExploreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainRoomExploreViewModel$loadCountryHotSort$1(this.f31759OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainRoomExploreViewModel$loadCountryHotSort$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f31758OooO0Oo;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String url = o0000O.f44175o00oO0O;
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(FeedbackType.Suggestions, "sort");
            o0o0ooo.OooO00o();
            MainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$call$1 mainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$call$1 = new MainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$call$1(o0o0ooo, null);
            this.f31758OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(mainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$call$1, this);
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
        CountryTagModel countryTagModel = (CountryTagModel) apiResult.getData();
        List<CountryModel> list = countryTagModel != null ? countryTagModel.data : null;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (!z && apiResult.isSuccess()) {
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            Object data = apiResult.getData();
            Intrinsics.checkNotNull(data);
            arrayList.addAll(((CountryTagModel) data).data);
            MutableLiveData mutableLiveData = (MutableLiveData) this.f31759OooO0o0.f31747OooO0Oo.getValue();
            CountryTagModel countryTagModel2 = (CountryTagModel) apiResult.getData();
            mutableLiveData.setValue(new Pair(arrayList, Boxing.boxInt(countryTagModel2 != null ? countryTagModel2.showCount : 0)));
        }
        return Unit.INSTANCE;
    }
}
