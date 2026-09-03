package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/VipSettingVM;", "Lo00OO/OooO00o;", "", "check", "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "changeVipShowState", "changeShowPremiumFirst", "changeInvisibleVisitor", "<set-?>", "hideVip$delegate", "Lo000oOoO/o0O00OO;", "getHideVip", "()Z", "setHideVip", "(Z)V", "hideVip", "showPremiumFirst$delegate", "getShowPremiumFirst", "setShowPremiumFirst", "showPremiumFirst", "invisibleVisitor$delegate", "getInvisibleVisitor", "setInvisibleVisitor", "invisibleVisitor", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VipSettingVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: hideVip$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO hideVip;

    /* JADX INFO: renamed from: invisibleVisitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO invisibleVisitor;

    /* JADX INFO: renamed from: showPremiumFirst$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO showPremiumFirst;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.VipSettingVM$changeInvisibleVisitor$1", f = "VipSettingVM.kt", i = {0}, l = {46}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<OooOOOO<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f25574Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25575Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25576Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25577Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, VipSettingVM vipSettingVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25577Oooo0oo = z;
            this.f25574Oooo = vipSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25577Oooo0oo, this.f25574Oooo, continuation);
            oooO00o.f25576Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<String>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25575Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f25576Oooo0oO;
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                boolean z = this.f25577Oooo0oo;
                this.f25576Oooo0oO = oooOOOO2;
                this.f25575Oooo0o = 1;
                Object objOooO0OO = o0o0oo.OooO0OO(z ? 1 : 0, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f25576Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f25574Oooo.setInvisibleVisitor(this.f25577Oooo0oo);
                LiveEventBus.get("KA_VIP_INVISIBLE_ISITOR").post(Boxing.boxBoolean(this.f25574Oooo.getInvisibleVisitor()));
            } else {
                this.f25574Oooo.setInvisibleVisitor(true ^ this.f25577Oooo0oo);
            }
            oooOOOO.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.VipSettingVM$changeShowPremiumFirst$1", f = "VipSettingVM.kt", i = {0}, l = {35}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<OooOOOO<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f25578Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25579Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25580Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25581Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, VipSettingVM vipSettingVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25581Oooo0oo = z;
            this.f25578Oooo = vipSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f25581Oooo0oo, this.f25578Oooo, continuation);
            oooO0O0.f25580Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<String>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25579Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f25580Oooo0oO;
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                boolean z = this.f25581Oooo0oo;
                this.f25580Oooo0oO = oooOOOO2;
                this.f25579Oooo0o = 1;
                Object objOooO0O0 = o0o0oo.OooO0O0(z ? 1 : 0, this);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0O0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f25580Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f25578Oooo.setShowPremiumFirst(this.f25581Oooo0oo);
                LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST").post(Boxing.boxBoolean(this.f25578Oooo.getShowPremiumFirst()));
            } else {
                this.f25578Oooo.setShowPremiumFirst(true ^ this.f25581Oooo0oo);
            }
            oooOOOO.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.VipSettingVM$changeVipShowState$1", f = "VipSettingVM.kt", i = {0}, l = {22}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<OooOOOO<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f25582Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25583Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25584Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25585Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, VipSettingVM vipSettingVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25585Oooo0oo = z;
            this.f25582Oooo = vipSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25585Oooo0oo, this.f25582Oooo, continuation);
            oooO0OO.f25584Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<String>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25583Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f25584Oooo0oO;
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                int i2 = !this.f25585Oooo0oo ? 1 : 0;
                this.f25584Oooo0oO = oooOOOO2;
                this.f25583Oooo0o = 1;
                Object objOooO00o = o0o0oo.OooO00o(i2, this);
                if (objOooO00o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO00o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f25584Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f25582Oooo.setHideVip(this.f25585Oooo0oo);
                int value = (this.f25582Oooo.getHideVip() ? VipState.VipHide : VipState.Vip).getValue();
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
                oooOOO.OooO().postValue(new Pair<>(Boxing.boxInt(value), Boxing.boxInt(value2 != null ? value2.getSecond().intValue() : VipLevel.Vip0.getValue())));
            } else {
                this.f25582Oooo.setHideVip(true ^ this.f25585Oooo0oo);
            }
            oooOOOO.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public VipSettingVM() {
        Boolean bool = Boolean.FALSE;
        this.hideVip = o0OOO00.OooO0Oo(bool);
        this.showPremiumFirst = o0OOO00.OooO0Oo(bool);
        this.invisibleVisitor = o0OOO00.OooO0Oo(bool);
    }

    @NotNull
    public final OooOOOO<ApiResult<String>> changeInvisibleVisitor(boolean check) {
        return OooOOO0.OooO00o(this, new OooO00o(check, this, null));
    }

    @NotNull
    public final OooOOOO<ApiResult<String>> changeShowPremiumFirst(boolean check) {
        return OooOOO0.OooO00o(this, new OooO0O0(check, this, null));
    }

    @NotNull
    public final OooOOOO<ApiResult<String>> changeVipShowState(boolean check) {
        return OooOOO0.OooO00o(this, new OooO0OO(check, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHideVip() {
        return ((Boolean) this.hideVip.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getInvisibleVisitor() {
        return ((Boolean) this.invisibleVisitor.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowPremiumFirst() {
        return ((Boolean) this.showPremiumFirst.getValue()).booleanValue();
    }

    public final void setHideVip(boolean z) {
        this.hideVip.setValue(Boolean.valueOf(z));
    }

    public final void setInvisibleVisitor(boolean z) {
        this.invisibleVisitor.setValue(Boolean.valueOf(z));
    }

    public final void setShowPremiumFirst(boolean z) {
        this.showPremiumFirst.setValue(Boolean.valueOf(z));
    }
}
