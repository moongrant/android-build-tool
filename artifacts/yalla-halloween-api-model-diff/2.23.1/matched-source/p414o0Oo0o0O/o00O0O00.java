package p414o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p480o0o000.o000oOoO;
import p640o0ooO0oo.o0oo0000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendShareEventRoomMsg$1$1", f = "ImMessageRepo.kt", i = {}, l = {570}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nImMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo$sendShareEventRoomMsg$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1855#2,2:825\n*S KotlinDebug\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo$sendShareEventRoomMsg$1$1\n*L\n583#1:825,2\n*E\n"})
public final class o00O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46122OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f46123OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f46124OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List<Long> f46125OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ List<String> f46126OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, List<Long> list, List<String> list2, Continuation<? super o00O0O00> continuation) {
        super(2, continuation);
        this.f46124OooO0o0 = chatMessage;
        this.f46123OooO0o = mutableLiveData;
        this.f46125OooO0oO = list;
        this.f46126OooO0oo = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O00(this.f46124OooO0o0, this.f46123OooO0o, this.f46125OooO0oO, this.f46126OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0O0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46122OooO0Oo;
        MutableLiveData<Boolean> mutableLiveData = this.f46123OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f46124OooO0o0;
            if (chatMessage.getShareEventRoomInfo() == null) {
                mutableLiveData.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.ShareEventRoomInfo shareEventRoomInfo = chatMessage.getShareEventRoomInfo();
            Intrinsics.checkNotNull(shareEventRoomInfo);
            long eventId = shareEventRoomInfo.getEventId();
            String eventName = shareEventRoomInfo.getEventName();
            String eventImageUrl = shareEventRoomInfo.getEventImageUrl();
            int eventTagId = shareEventRoomInfo.getEventTagId();
            long eventStartTime = shareEventRoomInfo.getEventStartTime();
            long eventEndTime = shareEventRoomInfo.getEventEndTime();
            long roomId = shareEventRoomInfo.getRoomId();
            String roomName = shareEventRoomInfo.getRoomName();
            String roomIp = shareEventRoomInfo.getRoomIp();
            this.f46122OooO0Oo = 1;
            MessageIM.ShareEventIn.Builder builderNewBuilder = MessageIM.ShareEventIn.newBuilder();
            builderNewBuilder.setEventId(eventId);
            builderNewBuilder.setEventName(eventName);
            builderNewBuilder.setPic(eventImageUrl);
            builderNewBuilder.setKeyWord(eventTagId);
            builderNewBuilder.setStartTime(eventStartTime);
            builderNewBuilder.setEndTime(eventEndTime);
            builderNewBuilder.setRoomId(roomId);
            builderNewBuilder.setRoomName(roomName);
            builderNewBuilder.setRoomIp(roomIp);
            Iterator<T> it = this.f46125OooO0oO.iterator();
            while (it.hasNext()) {
                builderNewBuilder.addTargets(((Number) it.next()).longValue());
            }
            o0oo0000 o0oo0000Var = o000oOoO.f48363OooO00o;
            String str = p386o0OOoo0O.o000oOoO.f43356OooOoO;
            Intrinsics.checkNotNull(builderNewBuilder);
            objOooO0O0 = o000oOoO.OooO0O0(str, builderNewBuilder, this);
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
        ImResult error = (ImResult) objOooO0O0;
        boolean zIsSuccess = error.isSuccess();
        Iterator<T> it2 = this.f46126OooO0oo.iterator();
        while (it2.hasNext()) {
            o00O0000.OooOO0((String) it2.next(), zIsSuccess);
        }
        if (!zIsSuccess) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(error, null), 3, null);
        }
        mutableLiveData.postValue(Boxing.boxBoolean(zIsSuccess));
        return Unit.INSTANCE;
    }
}
