package p522o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ImResult;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154o00Oo0oO.o0ooOOo;
import p190o00o00oO.oo0o0Oo;
import p493o0o00O00.OooO0OO;
import p500o0o00Oo0.OooOOO;
import p529o0o0OO0.o0OoOo0;
import p530o0o0OO0O.o000O;
import p530o0o0OO0O.o000O0O0;
import p533o0o0OOO0.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiveRoomTheme$1$1", f = "ImMessageRepo.kt", i = {0, 1}, l = {453, 480}, m = "invokeSuspend", n = {"mid", "isSuccess"}, s = {"L$0", "Z$0"})
public final class o00000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public String f42365Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ long f42366OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f42367OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f42368OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ long f42369OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ String f42370OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ String f42371OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final /* synthetic */ String f42372OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final /* synthetic */ String f42373OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42374o000oOoO;

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiveRoomTheme$1$1$2", f = "ImMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0o0Oo.OooO0O0(CommonError.He_Is_Not_Your_Friend, null, 2, null, CommonErrorHandler.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(long j, long j2, String str, MutableLiveData<Boolean> mutableLiveData, String str2, String str3, String str4, Continuation<? super o00000O> continuation) {
        super(2, continuation);
        this.f42369OoooO0O = j;
        this.f42366OoooO = j2;
        this.f42370OoooOO0 = str;
        this.f42374o000oOoO = mutableLiveData;
        this.f42371OoooOOO = str2;
        this.f42372OoooOOo = str3;
        this.f42373OoooOo0 = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000O(this.f42369OoooO0O, this.f42366OoooO, this.f42370OoooOO0, this.f42374o000oOoO, this.f42371OoooOOO, this.f42372OoooOOo, this.f42373OoooOo0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        String strOooO00o;
        Object objOooO0O0;
        boolean z;
        boolean z2;
        boolean z3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42367OoooO0;
        if (i != 0) {
            if (i == 1) {
                strOooO00o = this.f42365Oooo;
                ResultKt.throwOnFailure(obj);
                objOooO0O0 = obj;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.f42368OoooO00;
                ResultKt.throwOnFailure(obj);
            }
            z3 = z2;
            this.f42374o000oOoO.postValue(Boxing.boxBoolean(z3));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        strOooO00o = o0OoOo0.f43152OooO00o.OooO00o(Boxing.boxLong(this.f42369OoooO0O));
        long j = this.f42369OoooO0O;
        long j2 = this.f42366OoooO;
        String str = this.f42370OoooOO0;
        this.f42365Oooo = strOooO00o;
        this.f42367OoooO0 = 1;
        MessageIM.GiveRoomBackgroundIn.Builder mRequestBuilder = MessageIM.GiveRoomBackgroundIn.newBuilder();
        mRequestBuilder.setTarget(j);
        mRequestBuilder.setMsg(str);
        mRequestBuilder.setShopId((int) j2);
        mRequestBuilder.setMid(strOooO00o);
        o00oOoo o00oooo2 = o00oOoo.f43437OooO00o;
        o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
        String str2 = o0ooOOo.f32263OooOoO0;
        Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
        objOooO0O0 = o00oooo2.OooO0O0(str2, mRequestBuilder, this);
        if (objOooO0O0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        String mid = strOooO00o;
        ImResult imResult = (ImResult) objOooO0O0;
        boolean z4 = imResult.getBody() != null;
        if (z4) {
            MessageIM.GiveRoomBackgroundOut from = MessageIM.GiveRoomBackgroundOut.parseFrom(imResult.getBody());
            String themeBgName = this.f42371OoooOOO;
            String themeBgImgUrl = this.f42372OoooOOo;
            String themeVideoUrl = this.f42373OoooOo0;
            long j3 = this.f42369OoooO0O;
            String str3 = this.f42370OoooOO0;
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            int dayLimit = from.getDayLimit();
            long expireTm = from.getExpireTm();
            boolean z5 = z4;
            long giveId = from.getGiveId();
            Intrinsics.checkNotNullParameter(themeBgName, "themeBgName");
            Intrinsics.checkNotNullParameter(themeBgImgUrl, "themeBgImgUrl");
            Intrinsics.checkNotNullParameter(themeVideoUrl, "themeVideoUrl");
            Intrinsics.checkNotNullParameter(mid, "mid");
            ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = new ChatMessage.GiveRoomThemeInfo();
            giveRoomThemeInfo.setThemeBgName(themeBgName);
            giveRoomThemeInfo.setThemeBgImgUrl(themeBgImgUrl);
            giveRoomThemeInfo.setThemeVideoUrl(themeVideoUrl);
            giveRoomThemeInfo.setThemeDayLimit(dayLimit);
            giveRoomThemeInfo.setThemeExpireTime(expireTm);
            giveRoomThemeInfo.setThemeGiveId(giveId);
            giveRoomThemeInfo.setThemeState(ChatMessage.GiveRoomThemeInfo.ThemeState.ThemeNotReceive.getValue());
            ChatMessage chatMessageOooO0O0 = oooOo00.OooO0O0(mid, j3, 0L, false);
            chatMessageOooO0O0.setGiveRoomThemeInfo(giveRoomThemeInfo);
            chatMessageOooO0O0.setContentType(11);
            OooO0OO.OooO00o().OooOOo().OooOO0(chatMessageOooO0O0);
            oooOo00.OooO0oO(chatMessageOooO0O0);
            o0OO00O o0oo00o2 = o0OO00O.f42813OooO00o;
            o0oo00o2.OooO0oO(chatMessageOooO0O0.getMid(), true);
            if (!StringsKt.isBlank(str3)) {
                ChatMessage chatMessageOooOo0o = OooOo00.f42259OooO00o.OooOo0o(j3, str3, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
                oooOo00.OooO0oO(chatMessageOooOo0o);
                o0oo00o2.OooO0oO(chatMessageOooOo0o.getMid(), true);
            }
            if (from.getBalance() > 0) {
                OooOOO.f41235OooO00o.OooO0OO().postValue(Boxing.boxLong(from.getBalance()));
            }
            z = z5;
        } else {
            boolean z6 = z4;
            if (imResult.getCode() == 601) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO00o oooO00o = new OooO00o(null);
                this.f42365Oooo = null;
                this.f42368OoooO00 = z6;
                this.f42367OoooO0 = 2;
                if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z2 = z6;
                z3 = z2;
                this.f42374o000oOoO.postValue(Boxing.boxBoolean(z3));
                return Unit.INSTANCE;
            }
            z = z6;
            o000O0O0 error = new o000O0O0(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O(error, null), 3, null);
        }
        z3 = z;
        this.f42374o000oOoO.postValue(Boxing.boxBoolean(z3));
        return Unit.INSTANCE;
    }
}
