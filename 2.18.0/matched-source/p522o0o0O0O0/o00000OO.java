package p522o0o0O0O0;

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
import p154o00Oo0oO.o0ooOOo;
import p530o0o0OO0O.o000O;
import p530o0o0OO0O.o000O0O0;
import p533o0o0OOO0.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendShareActivityMsg$1$1", f = "ImMessageRepo.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
public final class o00000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f42379Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ List<Pair<String, String>> f42380OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42381OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42382OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ List<Long> f42383OoooO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000OO(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, List<Long> list, List<Pair<String, String>> list2, Continuation<? super o00000OO> continuation) {
        super(2, continuation);
        this.f42382OoooO00 = chatMessage;
        this.f42381OoooO0 = mutableLiveData;
        this.f42383OoooO0O = list;
        this.f42380OoooO = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00000OO(this.f42382OoooO00, this.f42381OoooO0, this.f42383OoooO0O, this.f42380OoooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42379Oooo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f42382OoooO00.getShareActivityInfo() == null) {
                this.f42381OoooO0.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.ShareActivityInfo shareActivityInfo = this.f42382OoooO00.getShareActivityInfo();
            Intrinsics.checkNotNull(shareActivityInfo);
            List<Long> list = this.f42383OoooO0O;
            String activityImage = shareActivityInfo.getActivityImage();
            String activityText1 = shareActivityInfo.getActivityText1();
            String activityText2 = shareActivityInfo.getActivityText2();
            String activityUrl = shareActivityInfo.getActivityUrl();
            String message = this.f42382OoooO00.getMessage();
            int activity = shareActivityInfo.getActivity();
            this.f42379Oooo = 1;
            MessageIM.ShareActivity2127.Builder mRequestBuilder = MessageIM.ShareActivity2127.newBuilder();
            mRequestBuilder.setImage(activityImage);
            mRequestBuilder.setTxt1(activityText1);
            mRequestBuilder.setTxt2(activityText2);
            mRequestBuilder.setUrl(activityUrl);
            mRequestBuilder.setMsg(message);
            mRequestBuilder.setActivity(activity);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                mRequestBuilder.addTargets(((Number) it.next()).longValue());
            }
            o00oOoo o00oooo2 = o00oOoo.f43437OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32239OooO00o;
            String str = o0ooOOo.f32257OooOo;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o00oooo2.OooO0O0(str, mRequestBuilder, this);
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
        Iterator<T> it2 = this.f42380OoooO.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            o0OO00O o0oo00o2 = o0OO00O.f42813OooO00o;
            o0oo00o2.OooO0oO((String) pair.getFirst(), z);
            o0oo00o2.OooO0oO((String) pair.getSecond(), z);
        }
        if (!z) {
            o000O0O0 error = new o000O0O0(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O(error, null), 3, null);
        }
        this.f42381OoooO0.postValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
