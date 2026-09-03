package p406o0Oo0Ooo;

import androidx.compose.animation.OooO;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00OO;
import p472o0Ooooo0.oO0000o0;
import p542o0o0o00O.o000oOoO;
import p581o0oOoo00.o000OOo;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiveRoomTheme$1$1", f = "ImMessageRepo.kt", i = {0}, l = {522}, m = "invokeSuspend", n = {"mid"}, s = {"L$0"})
public final class oo000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45048OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f45049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f45050OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f45051OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f45052OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f45053OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f45054OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ String f45055OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ String f45056OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000000(long j, long j2, String str, MutableLiveData<Boolean> mutableLiveData, String str2, String str3, String str4, Continuation<? super oo000000> continuation) {
        super(2, continuation);
        this.f45050OooO0o = j;
        this.f45052OooO0oO = j2;
        this.f45053OooO0oo = str;
        this.f45048OooO = mutableLiveData;
        this.f45054OooOO0 = str2;
        this.f45055OooOO0O = str3;
        this.f45056OooOO0o = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo000000(this.f45050OooO0o, this.f45052OooO0oO, this.f45053OooO0oo, this.f45048OooO, this.f45054OooOO0, this.f45055OooOO0O, this.f45056OooOO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo000000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object objOooO0O0;
        String mid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45051OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oO0000o0 oo0000o0 = oO0000o0.f47205OooO00o;
            long j = this.f45050OooO0o;
            String strOooO00o = oo0000o0.OooO00o(Boxing.boxLong(j));
            this.f45049OooO0Oo = strOooO00o;
            this.f45051OooO0o0 = 1;
            MessageIM.GiveRoomBackgroundIn.Builder mRequestBuilder = MessageIM.GiveRoomBackgroundIn.newBuilder();
            mRequestBuilder.setTarget(j);
            mRequestBuilder.setMsg(this.f45053OooO0oo);
            mRequestBuilder.setShopId((int) this.f45052OooO0oO);
            mRequestBuilder.setMid(strOooO00o);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44098OooOoO0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o000oOoO.OooO0O0(str, mRequestBuilder, this);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            mid = strOooO00o;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f45049OooO0Oo;
            ResultKt.throwOnFailure(obj);
            objOooO0O0 = obj;
            mid = str2;
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.getBody() != null) {
            MessageIM.GiveRoomBackgroundOut from = MessageIM.GiveRoomBackgroundOut.parseFrom(error.getBody());
            long j2 = this.f45050OooO0o;
            String str3 = this.f45053OooO0oo;
            int dayLimit = from.getDayLimit();
            long expireTm = from.getExpireTm();
            long giveId = from.getGiveId();
            String themeBgName = this.f45054OooOO0;
            Intrinsics.checkNotNullParameter(themeBgName, "themeBgName");
            String themeBgImgUrl = this.f45055OooOO0O;
            Intrinsics.checkNotNullParameter(themeBgImgUrl, "themeBgImgUrl");
            String themeVideoUrl = this.f45056OooOO0o;
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
            ChatMessage chatMessageOooO0O0 = oOO0O000.OooO0O0(j2, 0L, mid, false);
            chatMessageOooO0O0.setGiveRoomThemeInfo(giveRoomThemeInfo);
            chatMessageOooO0O0.setContentType(11);
            o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessageOooO0O0);
            oOO0O000.OooO0oO(chatMessageOooO0O0);
            oOOO00Oo.OooOO0(chatMessageOooO0O0.getMid(), true);
            if (!StringsKt.isBlank(str3)) {
                ChatMessage chatMessageOooOo = oOO0O000.OooOo(j2, str3, null, 0L, false, 60);
                oOO0O000.OooO0oO(chatMessageOooOo);
                oOOO00Oo.OooOO0(chatMessageOooOo.getMid(), true);
            }
            if (from.getBalance() > 0) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
            }
        } else if (error.getCode() == 601) {
            OooO.OooO0O0(oOO00O.He_Is_Not_Your_Friend, null, 2, null, o00O0.f45732OooO00o);
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        this.f45048OooO.postValue(Boxing.boxBoolean(error.isSuccess()));
        return Unit.INSTANCE;
    }
}
