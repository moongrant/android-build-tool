package p406o0Oo0Ooo;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendShareMomentMsg$1$1", f = "ImMessageRepo.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nImMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo$sendShareMomentMsg$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,824:1\n1855#2,2:825\n*S KotlinDebug\n*F\n+ 1 ImMessageRepo.kt\ncom/yalla/yalla/data/repository/ImMessageRepo$sendShareMomentMsg$1$1\n*L\n404#1:825,2\n*E\n"})
public final class O0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f44722OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f44723OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List<Long> f44724OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ List<Pair<String, String>> f44725OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0O0(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, List<Long> list, List<Pair<String, String>> list2, Continuation<? super O0O0> continuation) {
        super(2, continuation);
        this.f44723OooO0o0 = chatMessage;
        this.f44722OooO0o = mutableLiveData;
        this.f44724OooO0oO = list;
        this.f44725OooO0oo = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new O0O0(this.f44723OooO0o0, this.f44722OooO0o, this.f44724OooO0oO, this.f44725OooO0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((O0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44721OooO0Oo;
        MutableLiveData<Boolean> mutableLiveData = this.f44722OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f44723OooO0o0;
            if (chatMessage.getShareMomentInfo() == null) {
                mutableLiveData.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.ShareMomentInfo shareMomentInfo = chatMessage.getShareMomentInfo();
            Intrinsics.checkNotNull(shareMomentInfo);
            long momentId = shareMomentInfo.getMomentId();
            String momentImage = shareMomentInfo.getMomentImage();
            String momentText = shareMomentInfo.getMomentText();
            int momentType = shareMomentInfo.getMomentType();
            String message = chatMessage.getMessage();
            this.f44721OooO0Oo = 1;
            MessageIM.ShareMomentIn.Builder mRequestBuilder = MessageIM.ShareMomentIn.newBuilder();
            mRequestBuilder.setImage(momentImage);
            mRequestBuilder.setText(momentText);
            mRequestBuilder.setType(momentType);
            mRequestBuilder.setMsg(message);
            mRequestBuilder.setMomentId64(momentId);
            Iterator<T> it = this.f44724OooO0oO.iterator();
            while (it.hasNext()) {
                mRequestBuilder.addTargets(((Number) it.next()).longValue());
            }
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44093OooOo0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o000oOoO.OooO0O0(str, mRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ImResult error = (ImResult) obj;
        boolean zIsSuccess = error.isSuccess();
        Iterator<T> it2 = this.f44725OooO0oo.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            oOOO00Oo.OooOO0((String) pair.getFirst(), zIsSuccess);
            oOOO00Oo.OooOO0((String) pair.getSecond(), zIsSuccess);
        }
        if (!zIsSuccess) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        mutableLiveData.postValue(Boxing.boxBoolean(zIsSuccess));
        return Unit.INSTANCE;
    }
}
