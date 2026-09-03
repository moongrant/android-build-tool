package p520o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.model.ImResult;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.Pair;
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
import p153o00Oo0oO.o0ooOOo;
import p498o0o00Oo0.OooOOO;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendShareRoomMsg$1$1", f = "ImMessageRepo.kt", i = {}, l = {296}, m = "invokeSuspend", n = {}, s = {})
public final class o0000Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ List<Long> f42433Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42434Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42435Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42436Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ List<Pair<String, String>> f42437OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, List<Long> list, List<Pair<String, String>> list2, Continuation<? super o0000Ooo> continuation) {
        super(2, continuation);
        this.f42435Oooo0oO = chatMessage;
        this.f42436Oooo0oo = mutableLiveData;
        this.f42433Oooo = list;
        this.f42437OoooO00 = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000Ooo(this.f42435Oooo0oO, this.f42436Oooo0oo, this.f42433Oooo, this.f42437OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42434Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f42435Oooo0oO.getShareRoomInfo() == null) {
                this.f42436Oooo0oo.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.ShareRoomInfo shareRoomInfo = this.f42435Oooo0oO.getShareRoomInfo();
            Intrinsics.checkNotNull(shareRoomInfo);
            List<Long> list = this.f42433Oooo;
            long roomId = shareRoomInfo.getRoomId();
            String message = this.f42435Oooo0oO.getMessage();
            this.f42434Oooo0o = 1;
            MessageIM.ShareRoomIn.Builder mRequestBuilder = MessageIM.ShareRoomIn.newBuilder();
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            mRequestBuilder.setFromId(value == null ? 0L : value.longValue());
            mRequestBuilder.setMsg(message);
            mRequestBuilder.setI64RoomId(roomId);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mRequestBuilder.addTargets(((Number) it.next()).longValue());
            }
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32235OooOOoo;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o00o001.OooO0O0(str, mRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ImResult imResult = (ImResult) obj;
        boolean z = imResult.getBody() != null;
        Iterator<T> it2 = this.f42437OoooO00.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42810OooO00o;
            o0ooo0o2.OooO0oO((String) pair.getFirst(), z);
            o0ooo0o2.OooO0oO((String) pair.getSecond(), z);
        }
        if (z) {
            OooOo.OooO0O0("202026");
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        this.f42436Oooo0oo.postValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
