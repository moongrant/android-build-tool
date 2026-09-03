package com.yalla.yalla.common.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ShareLogType;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.common.repository.ShareLogRepository$shareEventLog$$inlined$call$1;
import com.yalla.yalla.common.repository.ShareLogRepository$shareRoomLog$$inlined$call$1;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p486o0o000o0.o000000;
import p547o0o0o00O.o00O000o;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/vm/ShareLogViewModel;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/common/model/ShareType;", "shareType", "", "id", "Lcom/yalla/yalla/common/model/ShareLogType;", "shareLogType", "", "toBuriedPoint", ContributionFragment.ARG_1, "type", "shareRoomLog", "eventId", "shareEventLog", "shareLog", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ShareLogViewModel extends o00OO.OooO00o {
    public static final int $stable = 0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShareType.values().length];
            iArr[ShareType.Room.ordinal()] = 1;
            iArr[ShareType.Events.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShareLogType.values().length];
            iArr2[ShareLogType.Moments.ordinal()] = 1;
            iArr2[ShareLogType.Facebook.ordinal()] = 2;
            iArr2[ShareLogType.Twitter.ordinal()] = 3;
            iArr2[ShareLogType.Instagram.ordinal()] = 4;
            iArr2[ShareLogType.WhatsApp.ordinal()] = 5;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ShareLogViewModel$shareEventLog$1", f = "ShareLogViewModel.kt", i = {}, l = {85, 86}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21336Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f21337Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ShareLogType f21338Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.common.vm.ShareLogViewModel$shareEventLog$1$1", f = "ShareLogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ ApiResult<String> f21339Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<String> apiResult, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f21339Oooo0o = apiResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f21339Oooo0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f21339Oooo0o.isSuccess();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, ShareLogType shareLogType, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21337Oooo0oO = str;
            this.f21338Oooo0oo = shareLogType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f21337Oooo0oO, this.f21338Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21336Oooo0o;
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
            String str = this.f21337Oooo0oO;
            ShareLogType shareLogType = this.f21338Oooo0oo;
            this.f21336Oooo0o = 1;
            o000000 o000000Var = o000000.f40906OooO00o;
            String url = o000000.f40908OooO0OO;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 1);
            o00o000o2.OooO0O0("eventId", str);
            o00o000o2.OooO0O0("shareType", OooO.OooO0oo(Boxing.boxInt(shareLogType.getValue()), ""));
            o00o000o2.OooO0O0("shareDevice", Boxing.boxInt(2));
            obj = o0000O0.OooO0OO(new ShareLogRepository$shareEventLog$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o((ApiResult) obj, null);
            this.f21336Oooo0o = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ShareLogViewModel$shareRoomLog$1", f = "ShareLogViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21340Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f21341Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ShareLogType f21342Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, ShareLogType shareLogType, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21341Oooo0oO = str;
            this.f21342Oooo0oo = shareLogType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f21341Oooo0oO, this.f21342Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21340Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f21341Oooo0oO;
                ShareLogType shareLogType = this.f21342Oooo0oo;
                this.f21340Oooo0o = 1;
                o000000 o000000Var = o000000.f40906OooO00o;
                String url = o000000.f40907OooO0O0;
                Intrinsics.checkNotNullParameter(url, "url");
                o00O000o o00o000o2 = new o00O000o(url, 0);
                o00o000o2.OooO0O0("barid", str);
                o00o000o2.OooO0O0("type", OooO.OooO0oo(Boxing.boxInt(shareLogType.getValue()), ""));
                obj = o0000O0.OooO0OO(new ShareLogRepository$shareRoomLog$$inlined$call$1(o00o000o2, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void shareEventLog(String eventId, ShareLogType type) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(eventId, type, null), 2, null);
    }

    private final void shareRoomLog(String roomId, ShareLogType type) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0OO(roomId, type, null), 2, null);
    }

    private final void toBuriedPoint(ShareType shareType, String id, ShareLogType shareLogType) {
        String str;
        if (OooO00o.$EnumSwitchMapping$0[shareType.ordinal()] != 1) {
            return;
        }
        int i = OooO00o.$EnumSwitchMapping$1[shareLogType.ordinal()];
        if (i == 1) {
            str = "202027";
        } else if (i == 2) {
            str = "202028";
        } else if (i == 3) {
            str = "202029";
        } else if (i != 4) {
            str = i != 5 ? null : "202031";
        } else {
            str = "202030";
        }
        if (str != null) {
            OooOo.OooO0O0(id);
        }
    }

    public final void shareLog(@NotNull ShareType shareType, @NotNull String id, @NotNull ShareLogType shareLogType) {
        Intrinsics.checkNotNullParameter(shareType, "shareType");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shareLogType, "shareLogType");
        if (id.length() == 0) {
            return;
        }
        toBuriedPoint(shareType, id, shareLogType);
        int i = OooO00o.$EnumSwitchMapping$0[shareType.ordinal()];
        if (i == 1) {
            shareRoomLog(id, shareLogType);
        } else {
            if (i != 2) {
                return;
            }
            shareEventLog(id, shareLogType);
        }
    }
}
