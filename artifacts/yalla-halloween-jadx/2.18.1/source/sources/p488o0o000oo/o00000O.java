package p488o0o000oo;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.ShareToFriendModel;
import com.yalla.yalla.common.model.ShareType;
import com.yalla.yalla.model.ShareActivityModel;
import com.yalla.yalla.model.TopicCreateCheckModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.model.TopicState;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p254o00ooO0O.o00O000;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o0Oo0oo;
import p516o0o0O000.oo0o0Oo;
import p520o0o0O0O0.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o00000O extends o0OO00O {

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.WebJsBridge$topicPageNew$1", f = "WebJsBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f40967Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f40967Oooo0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f40967Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                String str = this.f40967Oooo0o;
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                topicInfoModel.setId(com.yalla.support.common.util.OooO.OooO0o(str));
                TopicDetailActivity.f22567o0OoOo0.OooO00o(activityOooO0O0, topicInfoModel);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Response<TopicCreateCheckModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f40968Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicCreateCheckModel> response) {
            Response<TopicCreateCheckModel> response2 = response;
            Intrinsics.checkNotNullParameter(response2, "response");
            if (response2.getIsSuccess() && response2.getData() != null) {
                TopicCreateCheckModel data = response2.getData();
                Intrinsics.checkNotNull(data);
                if (data.getTopicState() != TopicState.NULL) {
                    o00O000 o00o001 = o00O000.f34346OooO00o;
                    Activity activityOooO0O0 = o00O000.OooO0O0();
                    if (activityOooO0O0 != null) {
                        TopicCreateCheckActivity.OooO00o oooO00o = TopicCreateCheckActivity.f22557Ooooo0o;
                        TopicCreateCheckModel data2 = response2.getData();
                        Intrinsics.checkNotNull(data2);
                        Integer userLevel = data2.getUserLevel();
                        boolean z = false;
                        Boolean boolValueOf = Boolean.valueOf(userLevel != null && userLevel.intValue() == 1);
                        TopicCreateCheckModel data3 = response2.getData();
                        Intrinsics.checkNotNull(data3);
                        Integer regTime = data3.getRegTime();
                        Boolean boolValueOf2 = Boolean.valueOf(regTime != null && regTime.intValue() == 1);
                        TopicCreateCheckModel data4 = response2.getData();
                        Intrinsics.checkNotNull(data4);
                        Integer keepLaw = data4.getKeepLaw();
                        if (keepLaw != null && keepLaw.intValue() == 1) {
                            z = true;
                        }
                        oooO00o.OooO00o(activityOooO0O0, boolValueOf, boolValueOf2, Boolean.valueOf(z));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Activity f40969Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Activity activity) {
            super(0);
            this.f40969Oooo0o = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentSendActivity.f22367o00oO0o.OooO00o(this.f40969Oooo0o);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.WebJsBridge$shareActivity$1", f = "WebJsBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f40970Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f40970Oooo0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f40970Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            ShareActivityModel shareActivityModel;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            try {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                Activity activityOooO0O0 = o00O000.OooO0O0();
                if (activityOooO0O0 != null && (str = this.f40970Oooo0o) != null && (shareActivityModel = (ShareActivityModel) o0Oo0oo.OooO0OO(str, ShareActivityModel.class)) != null) {
                    ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareType.Web);
                    shareToFriendModel.setShareActivityModel(shareActivityModel);
                    ShareToFriendsActivity.f22209o00o0O.OooO00o(activityOooO0O0, shareToFriendModel);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.WebJsBridge$storePage$1", f = "WebJsBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                StoreActivity.OooOoO(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @JavascriptInterface
    public abstract void CreateRoom();

    @JavascriptInterface
    public abstract void buySuccess();

    @JavascriptInterface
    public final void createTopic() {
        OooO00o listener = OooO00o.f40968Oooo0o;
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.checkCreateTopicState(new o00O00O(listener));
    }

    @JavascriptInterface
    public abstract void onBackPress(boolean z);

    @JavascriptInterface
    public final void postPage() {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        if (activityOooO0O0 != null) {
            oo0o0Oo.f42125OooO00o.OooO00o((FragmentActivity) activityOooO0O0, new OooO0O0(activityOooO0O0));
        }
    }

    @JavascriptInterface
    public final void shareActivity(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(str, null), 3, null);
    }

    @JavascriptInterface
    public abstract void showClose(@NotNull String str);

    @JavascriptInterface
    public abstract void showOpenInBrowser(@NotNull String str);

    @JavascriptInterface
    public abstract void showShare(@NotNull String str);

    @JavascriptInterface
    public final void storePage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(null), 3, null);
    }

    @JavascriptInterface
    public final void topicPageNew(@NotNull String topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(topicId, null), 3, null);
    }

    @JavascriptInterface
    public final void updateGoldCoinBalance(long j) {
        OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(j));
        p034OoooO0O.o0Oo0oo.OooO0o0(57, null);
    }
}
