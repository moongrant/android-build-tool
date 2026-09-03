package com.yalla.yalla.ui.vm.main;

import androidx.lifecycle.MutableLiveData;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.model.CountryModel;
import com.app.base.model.CountryTagModel;
import com.yalla.yalla.common.model.ApiResult;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o0000O0;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadCountryHotSort$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
public final class MainRoomExploreViewModel$loadCountryHotSort$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f25479Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MainRoomExploreViewModel f25480Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRoomExploreViewModel$loadCountryHotSort$1(MainRoomExploreViewModel mainRoomExploreViewModel, Continuation<? super MainRoomExploreViewModel$loadCountryHotSort$1> continuation) {
        super(2, continuation);
        this.f25480Oooo0oO = mainRoomExploreViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainRoomExploreViewModel$loadCountryHotSort$1(this.f25480Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainRoomExploreViewModel$loadCountryHotSort$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25479Oooo0o;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String url = o0ooOOo.f32334o0OOO0o;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO0O0("sort", FeedbackType.Suggestions);
            MainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$callByOldModel$1 mainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$callByOldModel$1 = new MainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$callByOldModel$1(o00o000o2, null);
            this.f25479Oooo0o = 1;
            obj = o0000O0.OooO0OO(mainRoomExploreViewModel$loadCountryHotSort$1$invokeSuspend$$inlined$callByOldModel$1, this);
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
            MutableLiveData mutableLiveData = (MutableLiveData) this.f25480Oooo0oO.f25468OooO0Oo.getValue();
            CountryTagModel countryTagModel2 = (CountryTagModel) apiResult.getData();
            mutableLiveData.setValue(new Pair(arrayList, Boxing.boxInt(countryTagModel2 != null ? countryTagModel2.showCount : 0)));
        }
        return Unit.INSTANCE;
    }
}
