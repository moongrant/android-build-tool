package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$clickVisitor$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$loadUserVisitorList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserVisitorModel;
import com.yalla.yalla.model.user.VisitorUserInfoModel;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p407o0Oo0Oo.o0O;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserVisitorVM;", "Lo0Oo0/OooOO0;", "", "have100", "", "vid", "", "visitorClick", "dataSort", "Ljava/lang/String;", "Lo00o00oO/o000;", "Lcom/yalla/yalla/model/user/VisitorUserInfoModel;", "userVisitorPager", "Lo00o00oO/o000;", "getUserVisitorPager", "()Lo00o00oO/o000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class UserVisitorVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private String dataSort = "";

    @NotNull
    private final o000<VisitorUserInfoModel> userVisitorPager = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserVisitorVM$userVisitorPager$1", f = "UserVisitorVM.kt", i = {0}, l = {17}, m = "invokeSuspend", n = {"it"}, s = {"I$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<VisitorUserInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32249OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f32251OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = UserVisitorVM.this.new OooO00o(continuation);
            oooO00o.f32251OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<VisitorUserInfoModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f32249OooO0Oo;
            UserVisitorVM userVisitorVM = UserVisitorVM.this;
            boolean z = false;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                int i3 = this.f32251OooO0o0;
                if (i3 == 1) {
                    userVisitorVM.dataSort = "";
                }
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                String str = userVisitorVM.dataSort;
                this.f32251OooO0o0 = i3;
                this.f32249OooO0Oo = 1;
                userInfoRepo.getClass();
                String url = oo000o.OooO0OO("/Webservers/Messages/UserVisitorlist");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 0);
                o0ooooo.OooO0O0(Boxing.boxInt(i3), "pageindex");
                o0ooooo.OooO0O0(str, "datesort");
                o0ooooo.OooO00o();
                Object objOooO0Oo = OooOOO.OooO0Oo(new UserInfoRepo$loadUserVisitorList$$inlined$call$1(o0ooooo, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
                obj = objOooO0Oo;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f32251OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && i == 1) {
                o0O o0oOooo000 = o00Oo0.OooO00o().Oooo000();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0oOooo000.OooO(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            }
            UserVisitorModel userVisitorModel = (UserVisitorModel) apiResult.getData();
            List<VisitorUserInfoModel> data = userVisitorModel != null ? userVisitorModel.getData() : null;
            if (!userVisitorVM.have100()) {
                UserVisitorModel userVisitorModel2 = (UserVisitorModel) apiResult.getData();
                List<VisitorUserInfoModel> data2 = userVisitorModel2 != null ? userVisitorModel2.getData() : null;
                if (!(data2 == null || data2.isEmpty())) {
                    z = true;
                }
            }
            return apiResult.toPagingLoadResource(data, z);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserVisitorVM$visitorClick$1", f = "UserVisitorVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nUserVisitorVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserVisitorVM.kt\ncom/yalla/yalla/ui/vm/user/UserVisitorVM$visitorClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32252OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ UserVisitorVM f32253OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f32254OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, UserVisitorVM userVisitorVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32254OooO0o0 = str;
            this.f32253OooO0o = userVisitorVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f32254OooO0o0, this.f32253OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32252OooO0Oo;
            Object obj2 = null;
            String str = this.f32254OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
                this.f32252OooO0Oo = 1;
                userInfoRepo.getClass();
                String url = oo000o.OooO0OO("/Webservers/Messages/VisitorLogClick");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 0);
                o0ooooo.OooO0O0(str, "vid");
                o0ooooo.OooO00o();
                obj = OooOOO.OooO0Oo(new UserInfoRepo$clickVisitor$$inlined$call$1(o0ooooo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((ApiResult) obj).isSuccess()) {
                for (Object obj3 : this.f32253OooO0o.getUserVisitorPager().f38497OooO0Oo) {
                    if (Intrinsics.areEqual(((VisitorUserInfoModel) obj3).getVid(), str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                VisitorUserInfoModel visitorUserInfoModel = (VisitorUserInfoModel) obj2;
                if (visitorUserInfoModel != null) {
                    visitorUserInfoModel.setIsnew(true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean have100() {
        return this.userVisitorPager.f38497OooO0Oo.size() >= 100;
    }

    @NotNull
    public final o000<VisitorUserInfoModel> getUserVisitorPager() {
        return this.userVisitorPager;
    }

    public final void visitorClick(@NotNull String vid) {
        Intrinsics.checkNotNullParameter(vid, "vid");
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0O0(vid, this, null));
    }
}
