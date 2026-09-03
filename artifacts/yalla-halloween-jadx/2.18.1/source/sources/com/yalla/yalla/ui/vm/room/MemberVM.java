package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.RoomMemberConveneListModel;
import com.app.base.model.RoomMemberListModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomUserInfoModel;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p516o0o0O000.o000oOoO;
import p520o0o0O0O0.o000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J.\u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J>\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J(\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ(\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lcom/yalla/yalla/ui/vm/room/MemberVM;", "Lo00OO/OooO00o;", "", ContributionFragment.ARG_1, "", "refresh", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/app/base/model/RoomMemberListModel;", "", "Lcom/yalla/yalla/model/RoomUserInfoModel;", "getMemberList", "", "getBatchRoomMemberList", "", "search", "isConvening", "getSingleBarSearch", "remUserIds", "", "deleteMemberList", "conveneBarMember", "Lcom/app/base/model/RoomMemberConveneListModel;", "getConveneBarMemberlist", "", "pageIndexMemberList", "I", "pageIndexBatchRoomMemberList", "pageIndexGetSingleBarSearch", "pageIndexConveneBarMemberlist", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MemberVM extends o00OO.OooO00o {
    public static final int $stable = 8;
    private int pageIndexMemberList = 1;
    private int pageIndexBatchRoomMemberList = 1;
    private int pageIndexGetSingleBarSearch = 1;
    private int pageIndexConveneBarMemberlist = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.MemberVM$getMemberList$1", f = "MemberVM.kt", i = {}, l = {24, 24}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<? extends RoomUserInfoModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MemberVM f26059Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26060Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26061Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26062Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f26063OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, MemberVM memberVM, long j, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f26062Oooo0oo = z;
            this.f26059Oooo = memberVM;
            this.f26063OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f26062Oooo0oo, this.f26059Oooo, this.f26063OoooO00, continuation);
            oooO.f26061Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<? extends RoomUserInfoModel>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26060Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26061Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26061Oooo0oO;
            if (this.f26062Oooo0oo) {
                this.f26059Oooo.pageIndexMemberList = 1;
            }
            o000 o000Var = o000.f42311OooO00o;
            long j = this.f26063OoooO00;
            MemberVM memberVM = this.f26059Oooo;
            int i2 = memberVM.pageIndexMemberList;
            memberVM.pageIndexMemberList = i2 + 1;
            this.f26061Oooo0oO = liveDataScope;
            this.f26060Oooo0o = 1;
            obj = o000Var.OooO0o0(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26061Oooo0oO = null;
            this.f26060Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.MemberVM$conveneBarMember$1", f = "MemberVM.kt", i = {}, l = {69, 69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ List<Long> f26064Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26065Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26066Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26067Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, List<Long> list, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26067Oooo0oo = j;
            this.f26064Oooo = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f26067Oooo0oo, this.f26064Oooo, continuation);
            oooO00o.f26066Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26065Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26066Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26066Oooo0oO;
            o000 o000Var = o000.f42311OooO00o;
            long j = this.f26067Oooo0oo;
            List<Long> list = this.f26064Oooo;
            this.f26066Oooo0oO = liveDataScope;
            this.f26065Oooo0o = 1;
            obj = o000Var.OooO00o(j, list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26066Oooo0oO = null;
            this.f26065Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.MemberVM$deleteMemberList$1", f = "MemberVM.kt", i = {}, l = {62, 62}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ List<Long> f26068Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26069Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26070Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26071Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, List<Long> list, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26071Oooo0oo = j;
            this.f26068Oooo = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f26071Oooo0oo, this.f26068Oooo, continuation);
            oooO0O0.f26070Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26069Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26070Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26070Oooo0oO;
            o000 o000Var = o000.f42311OooO00o;
            long j = this.f26071Oooo0oo;
            List<Long> list = this.f26068Oooo;
            this.f26070Oooo0oO = liveDataScope;
            this.f26069Oooo0o = 1;
            obj = o000Var.OooO0OO(j, list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26070Oooo0oO = null;
            this.f26069Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.MemberVM$getBatchRoomMemberList$1", f = "MemberVM.kt", i = {}, l = {36, 36}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MemberVM f26072Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26073Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26074Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26075Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f26076OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MemberVM memberVM, long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f26075Oooo0oo = z;
            this.f26072Oooo = memberVM;
            this.f26076OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f26075Oooo0oo, this.f26072Oooo, this.f26076OoooO00, continuation);
            oooO0OO.f26074Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26073Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26074Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26074Oooo0oO;
            if (this.f26075Oooo0oo) {
                this.f26072Oooo.pageIndexBatchRoomMemberList = 1;
            }
            o000 o000Var = o000.f42311OooO00o;
            long j = this.f26076OoooO00;
            MemberVM memberVM = this.f26072Oooo;
            int i2 = memberVM.pageIndexBatchRoomMemberList;
            memberVM.pageIndexBatchRoomMemberList = i2 + 1;
            this.f26074Oooo0oO = liveDataScope;
            this.f26073Oooo0o = 1;
            obj = o000Var.OooO0Oo(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26074Oooo0oO = null;
            this.f26073Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.MemberVM$getConveneBarMemberlist$1", f = "MemberVM.kt", i = {}, l = {81, 81}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberConveneListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MemberVM f26077Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26078Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26079Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26080Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f26081OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, MemberVM memberVM, long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f26080Oooo0oo = z;
            this.f26077Oooo = memberVM;
            this.f26081OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f26080Oooo0oo, this.f26077Oooo, this.f26081OoooO00, continuation);
            oooO0o.f26079Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberConveneListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26078Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26079Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26079Oooo0oO;
            if (this.f26080Oooo0oo) {
                this.f26077Oooo.pageIndexConveneBarMemberlist = 1;
            }
            o000 o000Var = o000.f42311OooO00o;
            long j = this.f26081OoooO00;
            MemberVM memberVM = this.f26077Oooo;
            int i2 = memberVM.pageIndexConveneBarMemberlist;
            memberVM.pageIndexConveneBarMemberlist = i2 + 1;
            this.f26079Oooo0oO = liveDataScope;
            this.f26078Oooo0o = 1;
            obj = o000Var.OooO0O0(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26079Oooo0oO = null;
            this.f26078Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.MemberVM$getSingleBarSearch$1", f = "MemberVM.kt", i = {}, l = {49, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MemberVM f26082Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26083Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26084Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26085Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f26086OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f26087OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f26088OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, MemberVM memberVM, long j, String str, boolean z2, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f26085Oooo0oo = z;
            this.f26082Oooo = memberVM;
            this.f26087OoooO00 = j;
            this.f26086OoooO0 = str;
            this.f26088OoooO0O = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f26085Oooo0oo, this.f26082Oooo, this.f26087OoooO00, this.f26086OoooO0, this.f26088OoooO0O, continuation);
            oooOO1.f26084Oooo0oO = obj;
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
            int i = this.f26083Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26084Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26084Oooo0oO;
            if (this.f26085Oooo0oo) {
                this.f26082Oooo.pageIndexGetSingleBarSearch = 1;
            }
            o000 o000Var = o000.f42311OooO00o;
            long j = this.f26087OoooO00;
            String strOooO0O0 = o000oOoO.OooO0O0(this.f26086OoooO0);
            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(search)");
            MemberVM memberVM = this.f26082Oooo;
            int i2 = memberVM.pageIndexGetSingleBarSearch;
            memberVM.pageIndexGetSingleBarSearch = i2 + 1;
            this.f26084Oooo0oO = liveDataScope;
            this.f26083Oooo0o = 1;
            obj = o000Var.OooO0o(j, strOooO0O0, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26084Oooo0oO = null;
            this.f26083Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ LiveData getMemberList$default(MemberVM memberVM, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return memberVM.getMemberList(j, z);
    }

    @NotNull
    public final LiveData<ApiResult<Object>> conveneBarMember(long roomId, @NotNull List<Long> remUserIds) {
        Intrinsics.checkNotNullParameter(remUserIds, "remUserIds");
        return o0000O0O.OooO00o(new OooO00o(roomId, remUserIds, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> deleteMemberList(long roomId, @NotNull List<Long> remUserIds) {
        Intrinsics.checkNotNullParameter(remUserIds, "remUserIds");
        return o0000O0O.OooO00o(new OooO0O0(roomId, remUserIds, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> getBatchRoomMemberList(long roomId, boolean refresh) {
        return o0000O0O.OooO00o(new OooO0OO(refresh, this, roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberConveneListModel>> getConveneBarMemberlist(long roomId, boolean refresh) {
        return o0000O0O.OooO00o(new OooO0o(refresh, this, roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> getMemberList(long roomId, boolean refresh) {
        return o0000O0O.OooO00o(new OooO(refresh, this, roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomUserInfoModel>>>> getSingleBarSearch(long roomId, @NotNull String search, boolean isConvening, boolean refresh) {
        Intrinsics.checkNotNullParameter(search, "search");
        return o0000O0O.OooO00o(new OooOO0(refresh, this, roomId, search, isConvening, null));
    }
}
