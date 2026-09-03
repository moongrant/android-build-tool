package p414o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.unsigned.OooO0O0;
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
import o0o0000.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p410o0Oo0Oo0.o00O0O;
import p437o0OoOOOo.o0O00000;
import p437o0OoOOOo.o0OoOoOo;
import p474o0OoooOO.oo0oO0;
import p478o0OooooO.oOO0O0O;
import p480o0o000.o000oOoO;
import p640o0ooO0oo.o0oo0000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiveRoomTheme$1$1", f = "ImMessageRepo.kt", i = {0}, l = {522}, m = "invokeSuspend", n = {"mid"}, s = {"L$0"})
public final class oo00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f46354OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f46355OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f46356OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46357OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f46358OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ String f46359OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ String f46360OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ String f46361OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ String f46362OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(long j, long j2, String str, MutableLiveData<Boolean> mutableLiveData, String str2, String str3, String str4, Continuation<? super oo00o> continuation) {
        super(2, continuation);
        this.f46356OooO0o = j;
        this.f46358OooO0oO = j2;
        this.f46359OooO0oo = str;
        this.f46354OooO = mutableLiveData;
        this.f46360OooOO0 = str2;
        this.f46361OooOO0O = str3;
        this.f46362OooOO0o = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo00o(this.f46356OooO0o, this.f46358OooO0oO, this.f46359OooO0oo, this.f46354OooO, this.f46360OooOO0, this.f46361OooOO0O, this.f46362OooOO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object objOooO0O0;
        String mid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46357OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oOO0O0O ooo0o0o = oOO0O0O.f48350OooO00o;
            long j = this.f46356OooO0o;
            String strOooO00o = ooo0o0o.OooO00o(Boxing.boxLong(j));
            this.f46355OooO0Oo = strOooO00o;
            this.f46357OooO0o0 = 1;
            MessageIM.GiveRoomBackgroundIn.Builder builderNewBuilder = MessageIM.GiveRoomBackgroundIn.newBuilder();
            builderNewBuilder.setTarget(j);
            builderNewBuilder.setMsg(this.f46359OooO0oo);
            builderNewBuilder.setShopId((int) this.f46358OooO0oO);
            builderNewBuilder.setMid(strOooO00o);
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43357OooOoO0;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, this);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            mid = strOooO00o;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = this.f46355OooO0Oo;
            ResultKt.throwOnFailure(obj);
            objOooO0O0 = obj;
            mid = str2;
        }
        ImResult error = (ImResult) objOooO0O0;
        if (error.getBody() != null) {
            MessageIM.GiveRoomBackgroundOut from = MessageIM.GiveRoomBackgroundOut.parseFrom(error.getBody());
            long j2 = this.f46356OooO0o;
            String str3 = this.f46359OooO0oo;
            int dayLimit = from.getDayLimit();
            long expireTm = from.getExpireTm();
            long giveId = from.getGiveId();
            String themeBgName = this.f46360OooOO0;
            Intrinsics.checkNotNullParameter(themeBgName, "themeBgName");
            String themeBgImgUrl = this.f46361OooOO0O;
            Intrinsics.checkNotNullParameter(themeBgImgUrl, "themeBgImgUrl");
            String themeVideoUrl = this.f46362OooOO0o;
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
            ChatMessage chatMessageOooO0O0 = o000.OooO0O0(j2, 0L, mid, false);
            chatMessageOooO0O0.setGiveRoomThemeInfo(giveRoomThemeInfo);
            chatMessageOooO0O0.setContentType(11);
            o00O0O.OooO00o().OooOOo0().OooO0oo(chatMessageOooO0O0);
            o000.OooO0oO(chatMessageOooO0O0);
            o00O0000.OooOO0(chatMessageOooO0O0.getMid(), true);
            if (!StringsKt.isBlank(str3)) {
                ChatMessage chatMessageOooOo = o000.OooOo(j2, str3, null, 0L, false, 60);
                o000.OooO0oO(chatMessageOooOo);
                o00O0000.OooOO0(chatMessageOooOo.getMid(), true);
            }
            if (from.getBalance() > 0) {
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                oo0oO0.OooO0O0().postValue(Boxing.boxLong(from.getBalance()));
            }
        } else if (error.getCode() == 601) {
            OooO0O0.OooO0O0(o0O00000.He_Is_Not_Your_Friend, null, 2, null, o0OoOoOo.f47016OooO00o);
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(error, null), 3, null);
        }
        this.f46354OooO.postValue(Boxing.boxBoolean(error.isSuccess()));
        return Unit.INSTANCE;
    }
}
