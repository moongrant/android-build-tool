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
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendShareMomentMsg$1$1", f = "ImMessageRepo.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
public final class o00000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ List<Long> f42360Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42361Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42362Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42363Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ List<Pair<String, String>> f42364OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, List<Long> list, List<Pair<String, String>> list2, Continuation<? super o00000OO> continuation) {
        super(2, continuation);
        this.f42362Oooo0oO = chatMessage;
        this.f42363Oooo0oo = mutableLiveData;
        this.f42360Oooo = list;
        this.f42364OoooO00 = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000OO(this.f42362Oooo0oO, this.f42363Oooo0oo, this.f42360Oooo, this.f42364OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42361Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f42362Oooo0oO.getShareMomentInfo() == null) {
                this.f42363Oooo0oo.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.ShareMomentInfo shareMomentInfo = this.f42362Oooo0oO.getShareMomentInfo();
            Intrinsics.checkNotNull(shareMomentInfo);
            List<Long> list = this.f42360Oooo;
            int momentId = (int) shareMomentInfo.getMomentId();
            String momentImage = shareMomentInfo.getMomentImage();
            String momentText = shareMomentInfo.getMomentText();
            int momentType = shareMomentInfo.getMomentType();
            String message = this.f42362Oooo0oO.getMessage();
            this.f42361Oooo0o = 1;
            MessageIM.ShareMomentIn.Builder mRequestBuilder = MessageIM.ShareMomentIn.newBuilder();
            mRequestBuilder.setMomentId(momentId);
            mRequestBuilder.setImage(momentImage);
            mRequestBuilder.setText(momentText);
            mRequestBuilder.setType(momentType);
            mRequestBuilder.setMsg(message);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mRequestBuilder.addTargets(((Number) it.next()).longValue());
            }
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32237OooOo0;
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
        Iterator<T> it2 = this.f42364OoooO00.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42810OooO00o;
            o0ooo0o2.OooO0oO((String) pair.getFirst(), z);
            o0ooo0o2.OooO0oO((String) pair.getSecond(), z);
        }
        if (!z) {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        this.f42363Oooo0oo.postValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
