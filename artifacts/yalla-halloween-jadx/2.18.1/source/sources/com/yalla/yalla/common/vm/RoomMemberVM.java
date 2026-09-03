package com.yalla.yalla.common.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.RoomMemberConveneListModel;
import com.app.base.model.RoomMemberConveneResultModel;
import com.app.base.model.RoomMemberListModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.common.repository.RoomMemberRepo$checkConveneMemberStatus$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomMemberRepo$conveneBarMember$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomMemberRepo$conveneBarMemberlist$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomMemberRepo$getCallingMemberList$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomMemberRepo$getConveneMemberState$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomMemberRepo$roomMemberList$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomMemberRepo$singleBarSearchRoomMemberConveneList$$inlined$call$1;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p486o0o000o0.o000OOo;
import p516o0o0O000.o000oOoO;
import p522o0o0O0o.oOO00O;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p547o0o0o00O.o00O000o;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b0\u00101J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006J\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ>\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u00180\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u0004J.\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00100\u00180\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R%\u0010%\u001a\u0010\u0012\f\u0012\n $*\u0004\u0018\u00010\u001c0\u001c0#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/yalla/yalla/common/vm/RoomMemberVM;", "Lo00OO/OooO00o;", "", ContributionFragment.ARG_1, "", "getConveneMemberState", "Lkotlin/Function1;", "Lcom/yalla/yalla/common/model/CheckConveneMemberStatusModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "checkConveneMemberStatus", "", "refresh", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/app/base/model/RoomMemberConveneListModel;", "getConveneBarMemberlist", "", "conveneIds", "Lcom/app/base/model/RoomMemberConveneResultModel;", "conveneBarMember", "isConvening", "getMemberList", "", "search", "Lcom/app/base/model/RoomMemberListModel;", "Lcom/yalla/yalla/model/RoomUserInfoModel;", "getSingleBarSearch", "clear", "", "index", "roomMemberList", "getConveneBarMemberlistPageIndex", "I", "getMemberListPageIndex", "getSingleBarSearchPageIndex", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "memberCount", "Landroidx/lifecycle/MutableLiveData;", "getMemberCount", "()Landroidx/lifecycle/MutableLiveData;", "lastNodeTime", "Ljava/lang/String;", "Lo0ooO00/o000O0;", "memberListPager", "Lo0ooO00/o000O0;", "getMemberListPager", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomMemberVM extends o00OO.OooO00o {
    public static final int $stable = 8;
    private int getConveneBarMemberlistPageIndex = 1;
    private int getMemberListPageIndex = 1;
    private int getSingleBarSearchPageIndex = 1;

    @NotNull
    private final MutableLiveData<Integer> memberCount = new MutableLiveData<>(0);

    @NotNull
    private String lastNodeTime = "";

    @NotNull
    private final o000O0<RoomUserInfoModel> memberListPager = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooOO0O(null));

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$getMemberList$1", f = "RoomMemberVM.kt", i = {}, l = {102, 102, 104, 104}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomMemberVM f21303Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21304Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21305Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21306Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f21307OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f21308OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, RoomMemberVM roomMemberVM, boolean z2, long j, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f21306Oooo0oo = z;
            this.f21303Oooo = roomMemberVM;
            this.f21308OoooO00 = z2;
            this.f21307OoooO0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f21306Oooo0oo, this.f21303Oooo, this.f21308OoooO00, this.f21307OoooO0, continuation);
            oooO.f21305Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberConveneListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0098 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:34:0x00e5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21304Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f21305Oooo0oO;
                if (this.f21306Oooo0oo) {
                    this.f21303Oooo.getMemberListPageIndex = 1;
                }
                if (this.f21308OoooO00) {
                    long j = this.f21307OoooO0;
                    RoomMemberVM roomMemberVM = this.f21303Oooo;
                    int i2 = roomMemberVM.getMemberListPageIndex;
                    roomMemberVM.getMemberListPageIndex = i2 + 1;
                    this.f21305Oooo0oO = liveDataScope;
                    this.f21304Oooo0o = 1;
                    o000OOo o000ooo2 = o000OOo.f40912OooO00o;
                    String str = o000OOo.f40922OooOO0o;
                    o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
                    o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
                    o00o000oOooO0O0.OooO0O0("pageindex", Boxing.boxInt(i2));
                    o00o000oOooO0O0.OooO0O0("pagesize", "50");
                    o00o000oOooO0O0.OooO00o();
                    obj = o0000O0.OooO0OO(new RoomMemberRepo$getCallingMemberList$$inlined$call$1(o00o000oOooO0O0, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f21305Oooo0oO = null;
                    this.f21304Oooo0o = 2;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    long j2 = this.f21307OoooO0;
                    RoomMemberVM roomMemberVM2 = this.f21303Oooo;
                    int i3 = roomMemberVM2.getMemberListPageIndex;
                    roomMemberVM2.getMemberListPageIndex = i3 + 1;
                    this.f21305Oooo0oO = liveDataScope;
                    this.f21304Oooo0o = 3;
                    int i4 = (4 & 4) != 0 ? 50 : 0;
                    o000OOo o000ooo3 = o000OOo.f40912OooO00o;
                    String str2 = o000OOo.f40920OooOO0;
                    o00O000o o00o000oOooO0O1 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str2, "url", str2, 0);
                    o00o000oOooO0O1.OooO0O0("barid", Boxing.boxLong(j2));
                    o00o000oOooO0O1.OooO0O0("pageindex", Boxing.boxInt(i3));
                    o00o000oOooO0O1.OooO0O0("pagesize", Boxing.boxInt(i4));
                    obj = o0000O0.OooO0OO(new RoomMemberRepo$conveneBarMemberlist$$inlined$call$1(o00o000oOooO0O1, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f21305Oooo0oO = null;
                    this.f21304Oooo0o = 4;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        liveDataScope = (LiveDataScope) this.f21305Oooo0oO;
                        ResultKt.throwOnFailure(obj);
                        this.f21305Oooo0oO = null;
                        this.f21304Oooo0o = 4;
                        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                liveDataScope = (LiveDataScope) this.f21305Oooo0oO;
                ResultKt.throwOnFailure(obj);
                this.f21305Oooo0oO = null;
                this.f21304Oooo0o = 2;
                if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$checkConveneMemberStatus$1", f = "RoomMemberVM.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21309Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f21310Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function1<CheckConveneMemberStatusModel, Unit> f21311Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(long j, Function1<? super CheckConveneMemberStatusModel, Unit> function1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21310Oooo0oO = j;
            this.f21311Oooo0oo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f21310Oooo0oO, this.f21311Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21309Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f21310Oooo0oO;
                this.f21309Oooo0o = 1;
                o000OOo o000ooo2 = o000OOo.f40912OooO00o;
                String str = o000OOo.f40911OooO;
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 1);
                o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
                obj = o0000O0.OooO0OO(new RoomMemberRepo$checkConveneMemberStatus$$inlined$call$1(o00o000oOooO0O0, null), this);
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
            o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
            o00O.OooO0OO.f43211OooO0Oo.postValue((CheckConveneMemberStatusModel) apiResult.getData());
            Function1<CheckConveneMemberStatusModel, Unit> function1 = this.f21311Oooo0oo;
            if (function1 != null) {
                function1.invoke((CheckConveneMemberStatusModel) apiResult.getData());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$conveneBarMember$1", f = "RoomMemberVM.kt", i = {0}, l = {69, 88}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f21312Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21313Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21314Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ List<Long> f21315Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<Long> list, long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21315Oooo0oo = list;
            this.f21312Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f21315Oooo0oo, this.f21312Oooo, continuation);
            oooO0O0.f21314Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberConveneResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21313Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21314Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21314Oooo0oO;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<T> it = this.f21315Oooo0oo.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(String.valueOf(jLongValue));
            }
            long j = this.f21312Oooo;
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "userIds.toString()");
            this.f21314Oooo0oO = liveDataScope;
            this.f21313Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String str = o000OOo.f40921OooOO0O;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 1);
            o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
            o00o000oOooO0O0.OooO0O0("conveneIds", string);
            obj = o0000O0.OooO0OO(new RoomMemberRepo$conveneBarMember$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            RoomMemberConveneResultModel roomMemberConveneResultModel = (RoomMemberConveneResultModel) apiResult.getData();
            if (roomMemberConveneResultModel != null) {
                o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
                CheckConveneMemberStatusModel checkConveneMemberStatusModelClone = CheckConveneMemberStatusModel.INSTANCE.clone(o00O.OooO0OO.f43211OooO0Oo.getValue());
                checkConveneMemberStatusModelClone.setCanConvene(false);
                checkConveneMemberStatusModelClone.setState(1);
                checkConveneMemberStatusModelClone.setEndTime(oOO00O.OooO0o(Boxing.boxLong(roomMemberConveneResultModel.getEndTime())));
                checkConveneMemberStatusModelClone.setLastConveneTime(String.valueOf(System.currentTimeMillis()));
                o00O.OooO0OO.f43211OooO0Oo.postValue(checkConveneMemberStatusModelClone);
                GetConveneMemberStateModel getConveneMemberStateModelClone = GetConveneMemberStateModel.INSTANCE.clone(o00O.OooO0OO.f43210OooO0OO.getValue());
                getConveneMemberStateModelClone.setState(1);
                getConveneMemberStateModelClone.setEndTime(oOO00O.OooO0o(Boxing.boxLong(roomMemberConveneResultModel.getEndTime())));
                o00O.OooO0OO.f43210OooO0OO.postValue(getConveneMemberStateModelClone);
            }
            this.f21314Oooo0oO = null;
            this.f21313Oooo0o = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$getConveneBarMemberlist$1", f = "RoomMemberVM.kt", i = {}, l = {57, 57}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomMemberVM f21316Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21317Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21318Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21319Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f21320OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, RoomMemberVM roomMemberVM, long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21319Oooo0oo = z;
            this.f21316Oooo = roomMemberVM;
            this.f21320OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f21319Oooo0oo, this.f21316Oooo, this.f21320OoooO00, continuation);
            oooO0OO.f21318Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberConveneListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21317Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21318Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21318Oooo0oO;
            if (this.f21319Oooo0oo) {
                this.f21316Oooo.getConveneBarMemberlistPageIndex = 1;
            }
            long j = this.f21320OoooO00;
            RoomMemberVM roomMemberVM = this.f21316Oooo;
            int i2 = roomMemberVM.getConveneBarMemberlistPageIndex;
            roomMemberVM.getConveneBarMemberlistPageIndex = i2 + 1;
            this.f21318Oooo0oO = liveDataScope;
            this.f21317Oooo0o = 1;
            int i3 = (4 & 4) != 0 ? 50 : 0;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String str = o000OOo.f40920OooOO0;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
            o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
            o00o000oOooO0O0.OooO0O0("pageindex", Boxing.boxInt(i2));
            o00o000oOooO0O0.OooO0O0("pagesize", Boxing.boxInt(i3));
            obj = o0000O0.OooO0OO(new RoomMemberRepo$conveneBarMemberlist$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21318Oooo0oO = null;
            this.f21317Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$getConveneMemberState$1", f = "RoomMemberVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21321Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f21322Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f21322Oooo0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f21322Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21321Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f21322Oooo0oO;
                this.f21321Oooo0o = 1;
                o000OOo o000ooo2 = o000OOo.f40912OooO00o;
                String str = o000OOo.f40919OooO0oo;
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
                o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
                obj = o0000O0.OooO0OO(new RoomMemberRepo$getConveneMemberState$$inlined$call$1(o00o000oOooO0O0, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o00O.OooO0OO oooO0OO = o00O.OooO0OO.f43208OooO00o;
            o00O.OooO0OO.f43210OooO0OO.postValue((GetConveneMemberStateModel) ((ApiResult) obj).getData());
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$getSingleBarSearch$1", f = "RoomMemberVM.kt", i = {}, l = {123, 123}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomMemberVM f21323Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21324Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21325Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21326Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f21327OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f21328OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, RoomMemberVM roomMemberVM, long j, String str, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f21326Oooo0oo = z;
            this.f21323Oooo = roomMemberVM;
            this.f21328OoooO00 = j;
            this.f21327OoooO0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f21326Oooo0oo, this.f21323Oooo, this.f21328OoooO00, this.f21327OoooO0, continuation);
            oooOO1.f21325Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21324Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21325Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21325Oooo0oO;
            if (this.f21326Oooo0oo) {
                this.f21323Oooo.getSingleBarSearchPageIndex = 1;
            }
            long j = this.f21328OoooO00;
            String str = this.f21327OoooO0;
            RoomMemberVM roomMemberVM = this.f21323Oooo;
            int i2 = roomMemberVM.getSingleBarSearchPageIndex;
            roomMemberVM.getSingleBarSearchPageIndex = i2 + 1;
            this.f21325Oooo0oO = liveDataScope;
            this.f21324Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String str2 = o000OOo.f40924OooOOO0;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str2, "url", str2, 0);
            o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
            o00o000oOooO0O0.OooO0O0("search", o000oOoO.OooO0O0(str));
            o00o000oOooO0O0.OooO0O0("source", Boxing.boxInt(1));
            o00o000oOooO0O0.OooO0O0("pageindex", Boxing.boxInt(i2));
            o00o000oOooO0O0.OooO0O0("pagesize", "50");
            o00o000oOooO0O0.OooO00o();
            obj = o0000O0.OooO0OO(new RoomMemberRepo$singleBarSearchRoomMemberConveneList$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21325Oooo0oO = null;
            this.f21324Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$memberListPager$1", f = "RoomMemberVM.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<RoomUserInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21329Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f21330Oooo0oO;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = RoomMemberVM.this.new OooOO0O(continuation);
            oooOO0O.f21330Oooo0oO = ((Number) obj).intValue();
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<RoomUserInfoModel>> continuation) {
            return ((OooOO0O) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21329Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f21330Oooo0oO;
                if (i2 == 1) {
                    RoomMemberVM.this.lastNodeTime = "";
                }
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f21329Oooo0o = 1;
                o000OOo o000ooo2 = o000OOo.f40912OooO00o;
                String str = o000OOo.f40913OooO0O0;
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
                o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(jLongValue));
                o00o000oOooO0O0.OooO0O0("pageindex", Boxing.boxInt(i2));
                o00o000oOooO0O0.OooO00o();
                obj = o0000O0.OooO0OO(new RoomMemberRepo$roomMemberList$$inlined$call$1(o00o000oOooO0O0, null), this);
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
            RoomMemberListModel roomMemberListModel = (RoomMemberListModel) apiResult.getData();
            return ApiResult.toPagingLoadResource$default(apiResult, roomMemberListModel != null ? (List) roomMemberListModel.data : null, false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomMemberVM$roomMemberList$1", f = "RoomMemberVM.kt", i = {}, l = {143, 143}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f21332Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21333Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21334Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f21335Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(long j, int i, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f21335Oooo0oo = j;
            this.f21332Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f21335Oooo0oo, this.f21332Oooo, continuation);
            oooOOO0.f21334Oooo0oO = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21333Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21334Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21334Oooo0oO;
            long j = this.f21335Oooo0oo;
            int i2 = this.f21332Oooo;
            this.f21334Oooo0oO = liveDataScope;
            this.f21333Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String str = o000OOo.f40913OooO0O0;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
            o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(j));
            o00o000oOooO0O0.OooO0O0("pageindex", Boxing.boxInt(i2));
            o00o000oOooO0O0.OooO00o();
            obj = o0000O0.OooO0OO(new RoomMemberRepo$roomMemberList$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21334Oooo0oO = null;
            this.f21333Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkConveneMemberStatus$default(RoomMemberVM roomMemberVM, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        roomMemberVM.checkConveneMemberStatus(j, function1);
    }

    public final void checkConveneMemberStatus(long roomId, @Nullable Function1<? super CheckConveneMemberStatusModel, Unit> listener) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(roomId, listener, null), 2, null);
    }

    public final void clear() {
        this.memberListPager.OooO00o();
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberConveneResultModel>> conveneBarMember(long roomId, @NotNull List<Long> conveneIds) {
        Intrinsics.checkNotNullParameter(conveneIds, "conveneIds");
        return o0000O0O.OooO00o(new OooO0O0(conveneIds, roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberConveneListModel>> getConveneBarMemberlist(long roomId, boolean refresh) {
        return o0000O0O.OooO00o(new OooO0OO(refresh, this, roomId, null));
    }

    public final void getConveneMemberState(long roomId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(roomId, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Integer> getMemberCount() {
        return this.memberCount;
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberConveneListModel>> getMemberList(long roomId, boolean isConvening, boolean refresh) {
        return o0000O0O.OooO00o(new OooO(refresh, this, isConvening, roomId, null));
    }

    @NotNull
    public final o000O0<RoomUserInfoModel> getMemberListPager() {
        return this.memberListPager;
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> getSingleBarSearch(long roomId, @NotNull String search, boolean isConvening, boolean refresh) {
        Intrinsics.checkNotNullParameter(search, "search");
        return o0000O0O.OooO00o(new OooOO0(refresh, this, roomId, search, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> roomMemberList(long roomId, int index) {
        return o0000O0O.OooO00o(new OooOOO0(roomId, index, null));
    }
}
