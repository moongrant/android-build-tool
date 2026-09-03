package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o00oO0o;
import com.code.android.util.o0OoOo0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberConveneListModel;
import com.yalla.yalla.model.room.RoomMemberConveneResultModel;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.repository.RoomMemberRepo$checkConveneMemberStatus$$inlined$call$1;
import com.yalla.yalla.repository.RoomMemberRepo$conveneBarMember$$inlined$call$1;
import com.yalla.yalla.repository.RoomMemberRepo$getCallingMemberList$$inlined$call$1;
import com.yalla.yalla.repository.RoomMemberRepo$roomMemberList$$inlined$call$1;
import com.yalla.yalla.repository.RoomMemberRepo$singleBarSearchRoomMemberConveneList$$inlined$call$1;
import com.yalla.yalla.ui.fragment.ContributionFragment;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p380o0OOoOo.o0ooOOo;
import p382o0OOoo.OooOOO;
import p391o0OOooo0.oo000o;
import p475o0Ooooo0.oO0O0O00;
import p483o0o000Oo.o00000OO;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J(\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ(\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fJ*\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ>\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u00170\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\u0006J.\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000f0\u00170\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0016\u0010!\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR%\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\u001b0\u001b0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/yalla/yalla/ui/vm/RoomMemberVM;", "Lo0Oo0/OooOO0;", "", ContributionFragment.ARG_1, "Lkotlin/Function1;", "Lcom/yalla/yalla/model/CheckConveneMemberStatusModel;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "checkConveneMemberStatus", "", "refresh", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/room/RoomMemberConveneListModel;", "getConveneBarMemberlist", "", "conveneIds", "Lcom/yalla/yalla/model/room/RoomMemberConveneResultModel;", "conveneBarMember", "isConvening", "getMemberList", "", "search", "Lcom/yalla/yalla/model/room/RoomMemberListModel;", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "getSingleBarSearch", "clear", "", "index", "roomMemberList", "getConveneBarMemberlistPageIndex", "I", "getMemberListPageIndex", "getSingleBarSearchPageIndex", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "memberCount", "Landroidx/lifecycle/MutableLiveData;", "getMemberCount", "()Landroidx/lifecycle/MutableLiveData;", "lastNodeTime", "Ljava/lang/String;", "Lo00o00oO/o000;", "memberListPager", "Lo00o00oO/o000;", "getMemberListPager", "()Lo00o00oO/o000;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomMemberVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 8;
    private int getConveneBarMemberlistPageIndex = 1;
    private int getMemberListPageIndex = 1;
    private int getSingleBarSearchPageIndex = 1;

    @NotNull
    private final MutableLiveData<Integer> memberCount = new MutableLiveData<>(0);

    @NotNull
    private String lastNodeTime = "";

    @NotNull
    private final o000<RoomUserInfoDTO> memberListPager = new o000<>(ViewModelKt.getViewModelScope(this), new OooOO0(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$getSingleBarSearch$1", f = "RoomMemberVM.kt", i = {}, l = {113, 113}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f30933OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30934OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30935OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30936OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomMemberVM f30937OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f30938OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, RoomMemberVM roomMemberVM, long j, String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f30935OooO0o = z;
            this.f30937OooO0oO = roomMemberVM;
            this.f30938OooO0oo = j;
            this.f30933OooO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f30935OooO0o, this.f30937OooO0oO, this.f30938OooO0oo, this.f30933OooO, continuation);
            oooO.f30936OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30934OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30936OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30936OooO0o0;
            boolean z = this.f30935OooO0o;
            RoomMemberVM roomMemberVM = this.f30937OooO0oO;
            if (z) {
                roomMemberVM.getSingleBarSearchPageIndex = 1;
            }
            int i2 = roomMemberVM.getSingleBarSearchPageIndex;
            roomMemberVM.getSingleBarSearchPageIndex = i2 + 1;
            this.f30936OooO0o0 = liveDataScope;
            this.f30934OooO0Oo = 1;
            String str = OooOOO.f43285OooOO0o;
            o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f30938OooO0oo), "barid");
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(this.f30933OooO), "search");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(1), "source");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
            o0oooooOooO00o.OooO0O0("50", "pagesize");
            o0oooooOooO00o.OooO00o();
            obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$singleBarSearchRoomMemberConveneList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30936OooO0o0 = null;
            this.f30934OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$checkConveneMemberStatus$1", f = "RoomMemberVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30939OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Function1<CheckConveneMemberStatusModel, Unit> f30940OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f30941OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(long j, Function1<? super CheckConveneMemberStatusModel, Unit> function1, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30941OooO0o0 = j;
            this.f30940OooO0o = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f30941OooO0o0, this.f30940OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30939OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f30939OooO0Oo = 1;
                String str = OooOOO.f43282OooO0oo;
                o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f30941OooO0o0), "barid");
                obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$checkConveneMemberStatus$$inlined$call$1(o0oooooOooO00o, null), this);
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
            com.yalla.yalla.service.room.OooO00o.f24518OooO0oo.f48487OooO0OO.postValue((CheckConveneMemberStatusModel) apiResult.getData());
            Function1<CheckConveneMemberStatusModel, Unit> function1 = this.f30940OooO0o;
            if (function1 != null) {
                function1.invoke((CheckConveneMemberStatusModel) apiResult.getData());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$conveneBarMember$1", f = "RoomMemberVM.kt", i = {0}, l = {59, 78}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nRoomMemberVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberVM.kt\ncom/yalla/yalla/ui/vm/RoomMemberVM$conveneBarMember$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,136:1\n1855#2,2:137\n*S KotlinDebug\n*F\n+ 1 RoomMemberVM.kt\ncom/yalla/yalla/ui/vm/RoomMemberVM$conveneBarMember$1\n*L\n55#1:137,2\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30942OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<Long> f30943OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30944OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f30945OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, List list, Continuation continuation) {
            super(2, continuation);
            this.f30943OooO0o = list;
            this.f30945OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f30945OooO0oO, this.f30943OooO0o, continuation);
            oooO0O0.f30944OooO0o0 = obj;
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
            int i = this.f30942OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30944OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30944OooO0o0;
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<T> it = this.f30943OooO0o.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                if (stringBuffer.length() > 0) {
                    stringBuffer.append(",");
                }
                stringBuffer.append(String.valueOf(jLongValue));
            }
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.f30944OooO0o0 = liveDataScope;
            this.f30942OooO0Oo = 1;
            String str = OooOOO.f43283OooOO0;
            o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 1);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f30945OooO0oO), "barid");
            o0oooooOooO00o.OooO0O0(string, "conveneIds");
            obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$conveneBarMember$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            RoomMemberConveneResultModel roomMemberConveneResultModel = (RoomMemberConveneResultModel) apiResult.getData();
            if (roomMemberConveneResultModel != null) {
                o00000OO o00000oo2 = com.yalla.yalla.service.room.OooO00o.f24518OooO0oo;
                CheckConveneMemberStatusModel checkConveneMemberStatusModelClone = CheckConveneMemberStatusModel.INSTANCE.clone(o00000oo2.f48487OooO0OO.getValue());
                checkConveneMemberStatusModelClone.setCanConvene(false);
                checkConveneMemberStatusModelClone.setState(1);
                checkConveneMemberStatusModelClone.setEndTime(o0OoOo0.OooOO0(Boxing.boxLong(roomMemberConveneResultModel.getEndTime())));
                checkConveneMemberStatusModelClone.setLastConveneTime(String.valueOf(System.currentTimeMillis()));
                o00000oo2.f48487OooO0OO.postValue(checkConveneMemberStatusModelClone);
                MutableLiveData<GetConveneMemberStateModel> mutableLiveData = o00000oo2.f48486OooO0O0;
                GetConveneMemberStateModel getConveneMemberStateModelClone = GetConveneMemberStateModel.INSTANCE.clone(mutableLiveData.getValue());
                getConveneMemberStateModelClone.setState(1);
                getConveneMemberStateModelClone.setEndTime(o0OoOo0.OooOO0(Boxing.boxLong(roomMemberConveneResultModel.getEndTime())));
                mutableLiveData.postValue(getConveneMemberStateModelClone);
            }
            this.f30944OooO0o0 = null;
            this.f30942OooO0Oo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$getConveneBarMemberlist$1", f = "RoomMemberVM.kt", i = {}, l = {47, 47}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30946OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30947OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30948OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomMemberVM f30949OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f30950OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, RoomMemberVM roomMemberVM, long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f30947OooO0o = z;
            this.f30949OooO0oO = roomMemberVM;
            this.f30950OooO0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f30947OooO0o, this.f30949OooO0oO, this.f30950OooO0oo, continuation);
            oooO0OO.f30948OooO0o0 = obj;
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
            int i = this.f30946OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30948OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30948OooO0o0;
            boolean z = this.f30947OooO0o;
            RoomMemberVM roomMemberVM = this.f30949OooO0oO;
            if (z) {
                roomMemberVM.getConveneBarMemberlistPageIndex = 1;
            }
            int i2 = roomMemberVM.getConveneBarMemberlistPageIndex;
            roomMemberVM.getConveneBarMemberlistPageIndex = i2 + 1;
            this.f30948OooO0o0 = liveDataScope;
            this.f30946OooO0Oo = 1;
            obj = oO0O0O00.OooO00o(this.f30950OooO0oo, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30948OooO0o0 = null;
            this.f30946OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$getMemberList$1", f = "RoomMemberVM.kt", i = {}, l = {92, 92, 94, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f30951OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30953OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30954OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomMemberVM f30955OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f30956OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, RoomMemberVM roomMemberVM, boolean z2, long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f30953OooO0o = z;
            this.f30955OooO0oO = roomMemberVM;
            this.f30956OooO0oo = z2;
            this.f30951OooO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f30953OooO0o, this.f30955OooO0oO, this.f30956OooO0oo, this.f30951OooO, continuation);
            oooO0o.f30954OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberConveneListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b2 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30952OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f30954OooO0o0;
                boolean z = this.f30953OooO0o;
                RoomMemberVM roomMemberVM = this.f30955OooO0oO;
                if (z) {
                    roomMemberVM.getMemberListPageIndex = 1;
                }
                boolean z2 = this.f30956OooO0oo;
                long j = this.f30951OooO;
                if (z2) {
                    int i2 = roomMemberVM.getMemberListPageIndex;
                    roomMemberVM.getMemberListPageIndex = i2 + 1;
                    this.f30954OooO0o0 = liveDataScope;
                    this.f30952OooO0Oo = 1;
                    String str = OooOOO.f43284OooOO0O;
                    o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 0);
                    o0oooooOooO00o.OooO0O0(Boxing.boxLong(j), "barid");
                    o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
                    o0oooooOooO00o.OooO0O0("50", "pagesize");
                    o0oooooOooO00o.OooO00o();
                    obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$getCallingMemberList$$inlined$call$1(o0oooooOooO00o, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f30954OooO0o0 = null;
                    this.f30952OooO0Oo = 2;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    int i3 = roomMemberVM.getMemberListPageIndex;
                    roomMemberVM.getMemberListPageIndex = i3 + 1;
                    this.f30954OooO0o0 = liveDataScope;
                    this.f30952OooO0Oo = 3;
                    obj = oO0O0O00.OooO00o(j, i3, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f30954OooO0o0 = null;
                    this.f30952OooO0Oo = 4;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        liveDataScope = (LiveDataScope) this.f30954OooO0o0;
                        ResultKt.throwOnFailure(obj);
                        this.f30954OooO0o0 = null;
                        this.f30952OooO0Oo = 4;
                        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                liveDataScope = (LiveDataScope) this.f30954OooO0o0;
                ResultKt.throwOnFailure(obj);
                this.f30954OooO0o0 = null;
                this.f30952OooO0Oo = 2;
                if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$memberListPager$1", f = "RoomMemberVM.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<RoomUserInfoDTO>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30957OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f30959OooO0o0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = RoomMemberVM.this.new OooOO0(continuation);
            oooOO1.f30959OooO0o0 = ((Number) obj).intValue();
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<RoomUserInfoDTO>> continuation) {
            return ((OooOO0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30957OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f30959OooO0o0;
                if (i2 == 1) {
                    RoomMemberVM.this.lastNodeTime = "";
                }
                Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f30957OooO0Oo = 1;
                String str = OooOOO.f43275OooO00o;
                o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(jLongValue), "barid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
                o0oooooOooO00o.OooO00o();
                obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$roomMemberList$$inlined$call$1(o0oooooOooO00o, null), this);
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomMemberVM$roomMemberList$1", f = "RoomMemberVM.kt", i = {}, l = {133, 133}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30960OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f30961OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30962OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30963OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, int i, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f30961OooO0o = j;
            this.f30963OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f30961OooO0o, this.f30963OooO0oO, continuation);
            oooOO0O.f30962OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30960OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30962OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30962OooO0o0;
            this.f30962OooO0o0 = liveDataScope;
            this.f30960OooO0Oo = 1;
            String str = OooOOO.f43275OooO00o;
            o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f30961OooO0o), "barid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f30963OooO0oO), "pageindex");
            o0oooooOooO00o.OooO00o();
            obj = com.code.android.util.OooOOO.OooO0Oo(new RoomMemberRepo$roomMemberList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30962OooO0o0 = null;
            this.f30960OooO0Oo = 2;
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
        return o00oO0o.OooO00o(new OooO0O0(roomId, conveneIds, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberConveneListModel>> getConveneBarMemberlist(long roomId, boolean refresh) {
        return o00oO0o.OooO00o(new OooO0OO(refresh, this, roomId, null));
    }

    @NotNull
    public final MutableLiveData<Integer> getMemberCount() {
        return this.memberCount;
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberConveneListModel>> getMemberList(long roomId, boolean isConvening, boolean refresh) {
        return o00oO0o.OooO00o(new OooO0o(refresh, this, isConvening, roomId, null));
    }

    @NotNull
    public final o000<RoomUserInfoDTO> getMemberListPager() {
        return this.memberListPager;
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>> getSingleBarSearch(long roomId, @NotNull String search, boolean isConvening, boolean refresh) {
        Intrinsics.checkNotNullParameter(search, "search");
        return o00oO0o.OooO00o(new OooO(refresh, this, roomId, search, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoDTO>>>> roomMemberList(long roomId, int index) {
        return o00oO0o.OooO00o(new OooOO0O(roomId, index, null));
    }
}
