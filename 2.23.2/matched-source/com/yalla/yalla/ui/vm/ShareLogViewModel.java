package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareLogType;
import com.yalla.yalla.repository.ShareLogRepository$shareEventLog$$inlined$call$1;
import com.yalla.yalla.repository.ShareLogRepository$shareRoomLog$$inlined$call$1;
import com.yalla.yalla.ui.fragment.ContributionFragment;
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
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/vm/ShareLogViewModel;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/model/share/ShareContentType;", "shareContentType", "", "id", "Lcom/yalla/yalla/model/share/ShareLogType;", "shareLogType", "", "toBuriedPoint", ContributionFragment.ARG_1, "type", "shareRoomLog", "eventId", "shareEventLog", "shareLog", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ShareLogViewModel extends OooOO0 {
    public static final int $stable = 0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ShareContentType.values().length];
            try {
                iArr[ShareContentType.Room.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareContentType.Events.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShareLogType.values().length];
            try {
                iArr2[ShareLogType.Moments.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShareLogType.Facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShareLogType.Twitter.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ShareLogType.Instagram.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ShareLogType.WhatsApp.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.ShareLogViewModel$shareEventLog$1", f = "ShareLogViewModel.kt", i = {}, l = {85, 86}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30964OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ShareLogType f30965OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f30966OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.ShareLogViewModel$shareEventLog$1$1", f = "ShareLogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ApiResult<String> f30967OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<String> apiResult, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f30967OooO0Oo = apiResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f30967OooO0Oo, continuation);
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
                this.f30967OooO0Oo.isSuccess();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, ShareLogType shareLogType, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30966OooO0o0 = str;
            this.f30965OooO0o = shareLogType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f30966OooO0o0, this.f30965OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30964OooO0Oo;
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
            this.f30964OooO0Oo = 1;
            String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/AddShareLog");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0O0, "url", strOooO0O0, 1);
            o0oooooOooO00o.OooO0O0(this.f30966OooO0o0, "eventId");
            o0oooooOooO00o.OooO0O0(o0OoOo0.OooOO0o(Boxing.boxInt(this.f30965OooO0o.getValue()), ""), "shareType");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(2), "shareDevice");
            obj = OooOOO.OooO0Oo(new ShareLogRepository$shareEventLog$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o((ApiResult) obj, null);
            this.f30964OooO0Oo = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.ShareLogViewModel$shareRoomLog$1", f = "ShareLogViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30968OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ShareLogType f30969OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f30970OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, ShareLogType shareLogType, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f30970OooO0o0 = str;
            this.f30969OooO0o = shareLogType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f30970OooO0o0, this.f30969OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30968OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f30968OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/RoomShareLog");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(this.f30970OooO0o0, "barid");
                o0oooooOooO00o.OooO0O0(o0OoOo0.OooOO0o(Boxing.boxInt(this.f30969OooO0o.getValue()), ""), "type");
                obj = OooOOO.OooO0Oo(new ShareLogRepository$shareRoomLog$$inlined$call$1(o0oooooOooO00o, null), this);
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

    private final void toBuriedPoint(ShareContentType shareContentType, String id, ShareLogType shareLogType) {
        String str;
        if (OooO00o.$EnumSwitchMapping$0[shareContentType.ordinal()] != 1) {
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
            o0oo0000.OooO00o.OooO0O0(id);
        }
    }

    public final void shareLog(@NotNull ShareContentType shareContentType, @NotNull String id, @NotNull ShareLogType shareLogType) {
        Intrinsics.checkNotNullParameter(shareContentType, "shareContentType");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shareLogType, "shareLogType");
        if (id.length() == 0) {
            return;
        }
        toBuriedPoint(shareContentType, id, shareLogType);
        int i = OooO00o.$EnumSwitchMapping$0[shareContentType.ordinal()];
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
