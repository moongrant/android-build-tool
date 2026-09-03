package p412o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.unsigned.OooO0OO;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p408o0Oo0Oo0.o00Oo0;
import p435o0OoOOOo.o0O000;
import p435o0OoOOOo.o0O0o;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000O000;
import p480o0o000O.OooOO0;
import p544o0o0o00O.o0O0o00O;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiveRoomTheme$1$1", f = "ImMessageRepo.kt", i = {0}, l = {522}, m = "invokeSuspend", n = {"mid"}, s = {"L$0"})
public final class oOO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f46346OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f46347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f46348OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46349OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f46350OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f46351OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f46352OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ String f46353OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ String f46354OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(long j, long j2, String str, MutableLiveData<Boolean> mutableLiveData, String str2, String str3, String str4, Continuation<? super oOO00O> continuation) {
        super(2, continuation);
        this.f46348OooO0o = j;
        this.f46350OooO0oO = j2;
        this.f46351OooO0oo = str;
        this.f46346OooO = mutableLiveData;
        this.f46352OooOO0 = str2;
        this.f46353OooOO0O = str3;
        this.f46354OooOO0o = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOO00O(this.f46348OooO0o, this.f46350OooO0oO, this.f46351OooO0oo, this.f46346OooO, this.f46352OooOO0, this.f46353OooOO0O, this.f46354OooOO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object objOooO0O0;
        String mid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46349OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0O0o00O o0o0o00o = o0O0o00O.f55755OooO00o;
            long j = this.f46348OooO0o;
            String strOooO00o = o0o0o00o.OooO00o(Boxing.boxLong(j));
            this.f46347OooO0Oo = strOooO00o;
            this.f46349OooO0o0 = 1;
            MessageIM.GiveRoomBackgroundIn.Builder builderNewBuilder = MessageIM.GiveRoomBackgroundIn.newBuilder();
            builderNewBuilder.setTarget(j);
            builderNewBuilder.setMsg(this.f46351OooO0oo);
            builderNewBuilder.setShopId((int) this.f46350OooO0oO);
            builderNewBuilder.setMid(strOooO00o);
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43357OooOoO0;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = OooOO0.OooO0O0(str, builderNewBuilder, this);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            mid = strOooO00o;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f46347OooO0Oo;
            ResultKt.throwOnFailure(obj);
            objOooO0O0 = obj;
            mid = str2;
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.getBody() != null) {
            MessageIM.GiveRoomBackgroundOut from = MessageIM.GiveRoomBackgroundOut.parseFrom(error.getBody());
            long j2 = this.f46348OooO0o;
            String str3 = this.f46351OooO0oo;
            int dayLimit = from.getDayLimit();
            long expireTm = from.getExpireTm();
            long giveId = from.getGiveId();
            String themeBgName = this.f46352OooOO0;
            Intrinsics.checkNotNullParameter(themeBgName, "themeBgName");
            String themeBgImgUrl = this.f46353OooOO0O;
            Intrinsics.checkNotNullParameter(themeBgImgUrl, "themeBgImgUrl");
            String themeVideoUrl = this.f46354OooOO0o;
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
            ChatMessage chatMessageOooO0O0 = o000OO.OooO0O0(j2, 0L, mid, false);
            chatMessageOooO0O0.setGiveRoomThemeInfo(giveRoomThemeInfo);
            chatMessageOooO0O0.setContentType(11);
            o00Oo0.OooO00o().OooOOo0().OooO0oo(chatMessageOooO0O0);
            o000OO.OooO0oO(chatMessageOooO0O0);
            o000OO00.OooOO0(chatMessageOooO0O0.getMid(), true);
            if (!StringsKt.isBlank(str3)) {
                ChatMessage chatMessageOooOo = o000OO.OooOo(j2, str3, null, 0L, false, 60);
                o000OO.OooO0oO(chatMessageOooOo);
                o000OO00.OooOO0(chatMessageOooOo.getMid(), true);
            }
            if (from.getBalance() > 0) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
            }
        } else if (error.getCode() == 601) {
            OooO0OO.OooO0O0(o0O0o.He_Is_Not_Your_Friend, null, 2, null, o0O000.f47005OooO00o);
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        this.f46346OooO.postValue(Boxing.boxBoolean(error.isSuccess()));
        return Unit.INSTANCE;
    }
}
