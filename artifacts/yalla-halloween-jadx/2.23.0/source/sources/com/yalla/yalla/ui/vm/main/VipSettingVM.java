package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.repository.VipRepo$changeKaVipShowState$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$changeShowPremiumFirst$$inlined$call$1;
import com.yalla.yalla.data.repository.VipRepo$changeVIPStealthVisit$$inlined$call$1;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.ApiResult;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/VipSettingVM;", "Lo0Oo00oO/o0O0O00;", "", "check", "Lo0OoO0OO/o0OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "changeVipShowState", "changeShowPremiumFirst", "changeInvisibleVisitor", "<set-?>", "hideVip$delegate", "Landroidx/compose/runtime/MutableState;", "getHideVip", "()Z", "setHideVip", "(Z)V", "hideVip", "showPremiumFirst$delegate", "getShowPremiumFirst", "setShowPremiumFirst", "showPremiumFirst", "invisibleVisitor$delegate", "getInvisibleVisitor", "setInvisibleVisitor", "invisibleVisitor", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVipSettingVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipSettingVM.kt\ncom/yalla/yalla/ui/vm/main/VipSettingVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,55:1\n81#2:56\n107#2,2:57\n81#2:59\n107#2,2:60\n81#2:62\n107#2,2:63\n*S KotlinDebug\n*F\n+ 1 VipSettingVM.kt\ncom/yalla/yalla/ui/vm/main/VipSettingVM\n*L\n16#1:56\n16#1:57,2\n17#1:59\n17#1:60,2\n18#1:62\n18#1:63,2\n*E\n"})
public final class VipSettingVM extends o0O0O00 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: hideVip$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState hideVip;

    /* JADX INFO: renamed from: invisibleVisitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState invisibleVisitor;

    /* JADX INFO: renamed from: showPremiumFirst$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState showPremiumFirst;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.VipSettingVM$changeInvisibleVisitor$1", f = "VipSettingVM.kt", i = {0}, l = {46}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OO00O<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31883OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31884OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31885OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f31886OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, VipSettingVM vipSettingVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31884OooO0o = z;
            this.f31886OooO0oO = vipSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31884OooO0o, this.f31886OooO0oO, continuation);
            oooO00o.f31885OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<String>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31883OooO0Oo;
            boolean z = this.f31884OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31885OooO0o0;
                this.f31885OooO0o0 = o0oo00o3;
                this.f31883OooO0Oo = 1;
                String strOooO0OO = o000OOo0.OooO0OO("/Webservers/User/ChangeKAVIPStealthVisit?");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 1);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(z ? 1 : 0), "changeType");
                Object objOooO0Oo = OooOOO.OooO0Oo(new VipRepo$changeVIPStealthVisit$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31885OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            VipSettingVM vipSettingVM = this.f31886OooO0oO;
            if (zIsSuccess) {
                vipSettingVM.setInvisibleVisitor(z);
                LiveEventBus.get("KA_VIP_INVISIBLE_ISITOR").post(Boxing.boxBoolean(vipSettingVM.getInvisibleVisitor()));
            } else {
                vipSettingVM.setInvisibleVisitor(!z);
            }
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.VipSettingVM$changeShowPremiumFirst$1", f = "VipSettingVM.kt", i = {0}, l = {35}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o0OO00O<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31887OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31888OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31889OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f31890OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, VipSettingVM vipSettingVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31888OooO0o = z;
            this.f31890OooO0oO = vipSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31888OooO0o, this.f31890OooO0oO, continuation);
            oooO0O0.f31889OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<String>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31887OooO0Oo;
            boolean z = this.f31888OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31889OooO0o0;
                this.f31889OooO0o0 = o0oo00o3;
                this.f31887OooO0Oo = 1;
                String strOooO0OO = o000OOo0.OooO0OO("/Webservers/User/ChangePremiumFirstState");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 1);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(z ? 1 : 0), "changeType");
                Object objOooO0Oo = OooOOO.OooO0Oo(new VipRepo$changeShowPremiumFirst$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31889OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            VipSettingVM vipSettingVM = this.f31890OooO0oO;
            if (zIsSuccess) {
                vipSettingVM.setShowPremiumFirst(z);
                LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST").post(Boxing.boxBoolean(vipSettingVM.getShowPremiumFirst()));
            } else {
                vipSettingVM.setShowPremiumFirst(!z);
            }
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.VipSettingVM$changeVipShowState$1", f = "VipSettingVM.kt", i = {0}, l = {22}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<o0OO00O<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31891OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31892OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31893OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ VipSettingVM f31894OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, VipSettingVM vipSettingVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31892OooO0o = z;
            this.f31894OooO0oO = vipSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31892OooO0o, this.f31894OooO0oO, continuation);
            oooO0OO.f31893OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<String>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
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
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31891OooO0Oo;
            boolean z = this.f31892OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31893OooO0o0;
                int i2 = !z ? 1 : 0;
                this.f31893OooO0o0 = o0oo00o3;
                this.f31891OooO0Oo = 1;
                String strOooO0OO = o000OOo0.OooO0OO("/Webservers/User/ChangeKAVIPShowState");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0OO, "url", strOooO0OO, 1);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "changeType");
                Object objOooO0Oo = OooOOO.OooO0Oo(new VipRepo$changeKaVipShowState$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31893OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            VipSettingVM vipSettingVM = this.f31894OooO0oO;
            if (zIsSuccess) {
                vipSettingVM.setHideVip(z);
                int value = (vipSettingVM.getHideVip() ? VipState.VipHide : VipState.Vip).getValue();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Pair pair = (Pair) o000000O.OooOO0().getValue();
                o000000O.OooOO0().postValue(new Pair(Boxing.boxInt(value), Boxing.boxInt(pair != null ? ((Number) pair.getSecond()).intValue() : VipLevel.Vip0.getValue())));
            } else {
                vipSettingVM.setHideVip(!z);
            }
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public VipSettingVM() {
        Boolean bool = Boolean.FALSE;
        this.hideVip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.showPremiumFirst = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.invisibleVisitor = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @NotNull
    public final o0OO00O<ApiResult<String>> changeInvisibleVisitor(boolean check) {
        return o0ooOOo.OooO00o(this, new OooO00o(check, this, null));
    }

    @NotNull
    public final o0OO00O<ApiResult<String>> changeShowPremiumFirst(boolean check) {
        return o0ooOOo.OooO00o(this, new OooO0O0(check, this, null));
    }

    @NotNull
    public final o0OO00O<ApiResult<String>> changeVipShowState(boolean check) {
        return o0ooOOo.OooO00o(this, new OooO0OO(check, this, null));
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
