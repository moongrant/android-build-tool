package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.UserVisitorModel;
import com.yalla.yalla.model.VisitorUserInfoModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.oo0O;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserVisitorVM;", "Lo00OO/OooO00o;", "", "have100", "", "vid", "", "visitorClick", "dataSort", "Ljava/lang/String;", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/VisitorUserInfoModel;", "userVisitorPager", "Lo0ooO00/o000O0;", "getUserVisitorPager", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserVisitorVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private String dataSort = "";

    @NotNull
    private final o000O0<VisitorUserInfoModel> userVisitorPager = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserVisitorVM$userVisitorPager$1", f = "UserVisitorVM.kt", i = {0}, l = {20}, m = "invokeSuspend", n = {"it"}, s = {"I$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<VisitorUserInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26253Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f26254Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = UserVisitorVM.this.new OooO00o(continuation);
            oooO00o.f26254Oooo0oO = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<VisitorUserInfoModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0090  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f26253Oooo0o;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                int i3 = this.f26254Oooo0oO;
                if (i3 == 1) {
                    UserVisitorVM.this.dataSort = "";
                }
                oo0O oo0o = oo0O.f42896OooO00o;
                String str = UserVisitorVM.this.dataSort;
                this.f26254Oooo0oO = i3;
                this.f26253Oooo0o = 1;
                Object objOooOO0o = oo0o.OooOO0o(i3, str, this);
                if (objOooOO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
                obj = objOooOO0o;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f26254Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && i == 1) {
                OooO0OO.OooO00o().Oooo00O().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            }
            UserVisitorModel userVisitorModel = (UserVisitorModel) apiResult.getData();
            List<VisitorUserInfoModel> data = userVisitorModel != null ? userVisitorModel.getData() : null;
            if (!UserVisitorVM.this.have100()) {
                UserVisitorModel userVisitorModel2 = (UserVisitorModel) apiResult.getData();
                List<VisitorUserInfoModel> data2 = userVisitorModel2 != null ? userVisitorModel2.getData() : null;
                z = data2 == null || data2.isEmpty() ? false : true;
            }
            return apiResult.toPagingLoadResource(data, z);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserVisitorVM$visitorClick$1", f = "UserVisitorVM.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26256Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f26257Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ UserVisitorVM f26258Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, UserVisitorVM userVisitorVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26257Oooo0oO = str;
            this.f26258Oooo0oo = userVisitorVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f26257Oooo0oO, this.f26258Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList, java.util.List<T>] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26256Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oo0O oo0o = oo0O.f42896OooO00o;
                String str = this.f26257Oooo0oO;
                this.f26256Oooo0o = 1;
                obj = oo0o.OooO0o(str, this);
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
                ?? r5 = this.f26258Oooo0oo.getUserVisitorPager().f48682OooO0Oo;
                String str2 = this.f26257Oooo0oO;
                Iterator it = r5.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((VisitorUserInfoModel) next).getVid(), str2));
                VisitorUserInfoModel visitorUserInfoModel = (VisitorUserInfoModel) next;
                if (visitorUserInfoModel != null) {
                    visitorUserInfoModel.setIsnew(true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<T>] */
    public final boolean have100() {
        return this.userVisitorPager.f48682OooO0Oo.size() >= 100;
    }

    @NotNull
    public final o000O0<VisitorUserInfoModel> getUserVisitorPager() {
        return this.userVisitorPager;
    }

    public final void visitorClick(@NotNull String vid) {
        Intrinsics.checkNotNullParameter(vid, "vid");
        o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0O0(vid, this, null));
    }
}
