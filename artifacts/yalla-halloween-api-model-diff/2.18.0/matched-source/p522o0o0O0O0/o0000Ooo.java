package p522o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.model.ImResult;
import java.util.Iterator;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154o00Oo0oO.o0ooOOo;
import p530o0o0OO0O.o000O;
import p530o0o0OO0O.o000O0O0;
import p533o0o0OOO0.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendShareEventRoomMsg$1$1", f = "ImMessageRepo.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
public final class o0000Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f42414Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ List<String> f42415OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42416OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42417OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ List<Long> f42418OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, List<Long> list, List<String> list2, Continuation<? super o0000Ooo> continuation) {
        super(2, continuation);
        this.f42417OoooO00 = chatMessage;
        this.f42416OoooO0 = mutableLiveData;
        this.f42418OoooO0O = list;
        this.f42415OoooO = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000Ooo(this.f42417OoooO00, this.f42416OoooO0, this.f42418OoooO0O, this.f42415OoooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        Object objOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42414Oooo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f42417OoooO00.getShareEventRoomInfo() == null) {
                this.f42416OoooO0.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = this.f42417OoooO00.getShareEventRoomInfo();
            Intrinsics.checkNotNull(shareEventRoomInfo);
            List<Long> list = this.f42418OoooO0O;
            long eventId = shareEventRoomInfo.getEventId();
            String eventName = shareEventRoomInfo.getEventName();
            String eventImageUrl = shareEventRoomInfo.getEventImageUrl();
            int eventTagId = shareEventRoomInfo.getEventTagId();
            long eventStartTime = shareEventRoomInfo.getEventStartTime();
            long eventEndTime = shareEventRoomInfo.getEventEndTime();
            long roomId = shareEventRoomInfo.getRoomId();
            String roomName = shareEventRoomInfo.getRoomName();
            String roomIp = shareEventRoomInfo.getRoomIp();
            this.f42414Oooo = 1;
            MessageIM.ShareEventIn.Builder mRequestBuilder = MessageIM.ShareEventIn.newBuilder();
            mRequestBuilder.setEventId(eventId);
            mRequestBuilder.setEventName(eventName);
            mRequestBuilder.setPic(eventImageUrl);
            mRequestBuilder.setKeyWord(eventTagId);
            mRequestBuilder.setStartTime(eventStartTime);
            mRequestBuilder.setEndTime(eventEndTime);
            mRequestBuilder.setRoomId(roomId);
            mRequestBuilder.setRoomName(roomName);
            mRequestBuilder.setRoomIp(roomIp);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mRequestBuilder.addTargets(((Number) it.next()).longValue());
            }
            o00oOoo o00oooo2 = o00oOoo.f43437OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
            String str = o0ooOOo.f32262OooOoO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            objOooO0O0 = o00oooo2.OooO0O0(str, mRequestBuilder, this);
            if (objOooO0O0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objOooO0O0 = obj;
        }
        ImResult imResult = (ImResult) objOooO0O0;
        boolean z = imResult.getBody() != null;
        Iterator<T> it2 = this.f42415OoooO.iterator();
        while (it2.hasNext()) {
            o0OO00O.f42813OooO00o.OooO0oO((String) it2.next(), z);
        }
        if (!z) {
            o000O0O0 error = new o000O0O0(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O(error, null), 3, null);
        }
        this.f42416OoooO0.postValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
