package p572o0oOoOO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.common.support.networkstate.NetworkStateUtil;
import com.yalla.yalla.data.db.model.RoomHistory;
import com.yalla.yalla.model.JSInfoModel;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.share.ShareActivityModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareToFriendModel;
import com.yalla.yalla.model.topic.TopicCreateCheckModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.topic.TopicState;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.message.ShareToFriendsActivity;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.TopicCreateCheckActivity;
import com.yalla.yalla.ui.activity.moment.TopicDetailActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AuthRequest;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;
import p402o0Oo0OOO.o00O000o;
import p403o0Oo0OOo.oO0O0OoO;
import p406o0Oo0Ooo.u;
import p417o0OoO0.o0000O0O;
import p429o0OoOOO.o00O0;
import p429o0OoOOO.oOO00O;
import p464o0Oooo.o000000O;
import p560o0oOo000.o0000OO0;
import p579o0oOoo.oO000O0O;
import p579o0oOoo.oOO0OO;
import p581o0oOoo00.o000OOo;
import p587o0oOooo.o0OO000;
import p602o0oo0O0O.o000OO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nBaseJSBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseJSBridge.kt\ncom/yalla/yalla/ui/view/webView/BaseJSBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,677:1\n1855#2,2:678\n1#3:680\n*S KotlinDebug\n*F\n+ 1 BaseJSBridge.kt\ncom/yalla/yalla/ui/view/webView/BaseJSBridge\n*L\n532#1:678,2\n*E\n"})
public abstract class oO000O0 {

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$downloadPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56268OooO0Oo;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ String f56269OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str) {
                super(1);
                this.f56269OooO0Oo = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    String str = this.f56269OooO0Oo;
                    if (!(str == null || StringsKt.isBlank(str))) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oO0Ooooo(str, null), 2, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f56268OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f56268OooO0Oo, continuation);
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
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                com.yalla.yalla.util.permission.OooO00o.OooO0OO(activityOooO0O0, PermissionGroupReveal.f32884OooO0o0, null, new OooO00o(this.f56268OooO0Oo));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$closePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return oO000O0.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oO000O0.this.onClosePage();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$confirmRecharge$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ApiError error = new ApiError(2003, null, null, 6, null);
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$createRoomPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = CreateRoomActivity.f26502OooOoo0;
                CreateRoomActivity.OooO00o.OooO00o(activityOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Response<TopicCreateCheckModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f56271OooO0Oo = new OooO0o();

        public OooO0o() {
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
                    Context context = o000O0.f10354OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = TopicCreateCheckActivity.f26295OooOo0;
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
                        TopicCreateCheckActivity.OooO00o.OooO00o(activityOooO0O0, boolValueOf, boolValueOf2, Boolean.valueOf(z));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$goToBuyRoomTheme$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = RoomThemeStoreActivity.f26679OooOo0o;
                Intent intent = new Intent(activityOooO0O0, (Class<?>) RoomThemeStoreActivity.class);
                intent.putExtra("IS_SHOW_RECHARGE", false);
                intent.putExtra("IsFromMyOutfit", false);
                activityOooO0O0.startActivity(intent);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$goToGooglePlay$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                p427o0OoOO00.oo000o.OooO00o(activityOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Activity f56272OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Activity activity) {
            super(0);
            this.f56272OooO0Oo = activity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = MomentSendActivity.f26175Oooo0OO;
            MomentSendActivity.OooO00o.OooO00o(this.f56272OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$goToRecharge$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = WalletActivity.f27054OooOoOO;
                WalletActivity.OooO00o.OooO00o(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$profilePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56273OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f56273OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f56273OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, activityOooO0O0, this.f56273OooO0Oo, false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f56274OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$quickRecharch$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOo00(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oOO0OO.OooO00o(true, false, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$shareActivity$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56275OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(String str, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f56275OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f56275OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            ShareActivityModel shareActivityModel;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            try {
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null && (str = this.f56275OooO0Oo) != null && (shareActivityModel = (ShareActivityModel) p140o00OOooo.OooOO0.OooO0O0(ShareActivityModel.class, str)) != null) {
                    ShareToFriendModel shareToFriendModel = new ShareToFriendModel(ShareContentType.Web);
                    shareToFriendModel.setShareActivityModel(shareActivityModel);
                    int i = ShareToFriendsActivity.f25730Oooo00o;
                    ShareToFriendsActivity.OooO00o.OooO00o(activityOooO0O0, shareToFriendModel);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f56276OooO0Oo;

        public Oooo000(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f56276OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f56276OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f56276OooO0Oo;
        }

        public final int hashCode() {
            return this.f56276OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56276OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$showMsg$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56277OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(String str, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f56277OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f56277OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000oOoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(activityOooO0O0);
                o0oo00o2.OooOo00(this.f56277OooO0Oo);
                o0oo00o2.OooOO0o();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$storePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public o00O0O(Continuation<? super o00O0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00O0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o00O0O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                StoreActivity.OooOo0(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$taskPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public o00Oo0(Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00Oo0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o00Oo0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = TaskActivity.f25537OooOooO;
                TaskActivity.OooO00o.OooO00o(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toAppMarketDownLoad$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56278OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(String str, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f56278OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00Ooo(this.f56278OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
            if (context2 != null) {
                Intrinsics.checkNotNullParameter(context2, "context");
                String packageName = this.f56278OooO0Oo;
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                if (oO000O0O.OooO00o(context2, "com.android.vending")) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                        intent.setPackage("com.android.vending");
                        context2.startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                        oO000O0O.OooO0O0(context2, packageName);
                    }
                } else {
                    oO000O0O.OooO0O0(context2, packageName);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toBadgePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00oO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f56279OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(int i, Continuation<? super o00oO0o> continuation) {
            super(2, continuation);
            this.f56279OooO0Oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00oO0o(this.f56279OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00oO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = BadgeActivity.f27070OooOo;
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Long lBoxLong = (Long) o000000O.OooOOo0().getValue();
                if (lBoxLong == null) {
                    lBoxLong = Boxing.boxLong(0L);
                }
                Intrinsics.checkNotNullExpressionValue(lBoxLong, "Account.userId.value ?: 0");
                BadgeActivity.OooO00o.OooO00o(activityOooO0O0, lBoxLong.longValue(), String.valueOf(o000000O.OooOOoo().getValue()), String.valueOf(o000000O.OooO().getValue()), String.valueOf(o000000O.OooOO0O().getValue()), this.f56279OooO0Oo == 1);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toYallaChatTrees$1$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nBaseJSBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseJSBridge.kt\ncom/yalla/yalla/ui/view/webView/BaseJSBridge$toYallaChatTrees$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,677:1\n1#2:678\n*E\n"})
    public static final class o0OO00O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56280OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f56281OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<String, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f56282OooO0Oo = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(String str) {
                String it = str;
                o000OO.OooO00o oooO00o = o000OO.f56890OooO0O0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                oooO00o.OooO0O0(it);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OO00O(String str, FragmentActivity fragmentActivity, Continuation<? super o0OO00O> continuation) {
            super(2, continuation);
            this.f56280OooO0Oo = str;
            this.f56281OooO0o0 = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OO00O(this.f56280OooO0Oo, this.f56281OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OO00O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = this.f56280OooO0Oo;
            if (o0000O0O.OooO0o(str)) {
                if (str != null) {
                    o000OO.f56890OooO0O0.OooO0O0(str);
                }
                return Unit.INSTANCE;
            }
            o00O000o.f44506OooOOo0.observe(this.f56281OooO0o0, new Oooo000(OooO00o.f56282OooO0Oo));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toHomePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f56283OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(int i, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f56283OooO0Oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OOO0o(this.f56283OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = MainActivity.f25394OooOoo;
                MainActivity.OooO00o.OooO00o(activityOooO0O0, this.f56283OooO0Oo, 4);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toPostDetailPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f56284OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(MomentDetailModel momentDetailModel, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f56284OooO0Oo = momentDetailModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f56284OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                MomentDetailModel momentDetailModel = this.f56284OooO0Oo;
                int i = MomentDetailActivity.f26057Oooo0;
                MomentDetailActivity.OooO00o.OooO00o(activityOooO0O0, momentDetailModel, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : -1, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : MomentAdapterTag.Web, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : true, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$showToastMsg$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56285OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(String str, Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
            this.f56285OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OoOo0(this.f56285OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str = this.f56285OooO0Oo;
            if (!(str == null || StringsKt.isBlank(str))) {
                o000Oo0 o000oo0OooO00o = o000O00.OooO00o(str, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$toEventPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public o0ooOOo(Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0ooOOo(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o0ooOOo(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            p560o0oOo000.o00000O0 o00000o1 = o0000OO0.f56183OooO0O0;
            if (o00000o1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("event");
                o00000o1 = null;
            }
            o00000o1.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo000o f56286OooO0Oo = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
                if (!StringsKt.isBlank(p408o0Oo0o0O.o00Oo0.OooO0o().OooOOO0())) {
                    YCSDKOpenKit.setApplicationId(p408o0Oo0o0O.o00Oo0.OooO0o().OooOOO0());
                    YCSDKOpenKit.setApplicationKey(p408o0Oo0o0O.o00Oo0.OooO0o().OooOOO());
                    YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
                    YCSDKOpenKit.INSTANCE.sdkInitialize(fragmentActivity);
                }
                oO0Oo0oo action = new oO0Oo0oo(fragmentActivity);
                Intrinsics.checkNotNullParameter(action, "action");
                YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, fragmentActivity, new AuthRequest("a671060faf538fcf28b5a2e12234fac8", (String[]) StringsKt__StringsKt.split$default("public_profile,user_gender,user_country,user_birthday,user_friends,user_phone", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0])), new o000OO.OooO0O0(action), null, 8, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.view.webView.BaseJSBridge$topicPageNew$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class oo0o0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f56287OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo0o0Oo(String str, Continuation<? super oo0o0Oo> continuation) {
            super(2, continuation);
            this.f56287OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new oo0o0Oo(this.f56287OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo0o0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                TopicInfoModel topicInfoModel = new TopicInfoModel();
                topicInfoModel.setId(com.code.android.util.o0OoOo0.OooO(0L, this.f56287OooO0Oo));
                int i = TopicDetailActivity.f26305OooOoOO;
                TopicDetailActivity.OooO00o.OooO00o(activityOooO0O0, topicInfoModel);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void OooO00o(oO000O0 oo000o0, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        oo000o0.roomPage(str, i, (i2 & 4) != 0 ? GiftPropTypeUser.Hot.getValue() : 0);
    }

    @JvmOverloads
    @JavascriptInterface
    public final void buriedPointEvent(@Nullable String str) {
        buriedPointEvent(str, null);
    }

    @JavascriptInterface
    public final void closePage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(null), 3, null);
    }

    @JavascriptInterface
    public final void coinNotEnough() {
        androidx.compose.animation.OooO.OooO0O0(oOO00O.Coin_NotEnough, null, 2, null, o00O0.f45732OooO00o);
    }

    @JavascriptInterface
    public final void coinNotEnoughQuick() {
        o0OO000.OooO0O0("202005", MapsKt.mapOf(new Pair("source", 4)));
        androidx.compose.animation.OooO.OooO0O0(oOO00O.Coin_NotEnough_QuickRecharge, null, 2, null, o00O0.f45732OooO00o);
    }

    @JavascriptInterface
    public final void confirmRecharge() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
    }

    @JavascriptInterface
    public void createRoomPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(null), 3, null);
    }

    @JavascriptInterface
    public final void createTopic() {
        OooO0o listener = OooO0o.f56271OooO0Oo;
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new u(listener, null), 3, null);
    }

    @JavascriptInterface
    public final boolean darkmode() {
        return false;
    }

    @JavascriptInterface
    public final void downloadPage(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(str, null), 3, null);
    }

    @JvmOverloads
    @JavascriptInterface
    public final void eventStatistic(@NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        eventStatistic(eventId, null);
    }

    @JavascriptInterface
    public final void fruitGameClose() {
        closePage();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @NotNull
    public final String getInfo(@NotNull String info) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(info, "info");
        JSInfoModel jSInfoModel = new JSInfoModel();
        for (String str : StringsKt__StringsKt.split$default(info, new String[]{"|"}, false, 0, 6, (Object) null)) {
            long jLongValue = 0;
            String str2 = "";
            switch (str.hashCode()) {
                case -1850780999:
                    if (str.equals("phoneBrand")) {
                        jSInfoModel.setPhoneBrand(p382o0OOoo0o.oo000o.OooO0O0());
                    }
                    break;
                case -1840709029:
                    if (str.equals("phoneModel")) {
                        jSInfoModel.setPhoneModel(p382o0OOoo0o.oo000o.OooO0OO());
                    }
                    break;
                case -1811743075:
                    if (str.equals("networkOperatorName")) {
                        jSInfoModel.setNetworkOperatorName(NetworkStateUtil.INSTANCE.networkOperatorName(o000O0.OooO00o()));
                    }
                    break;
                case -1540282147:
                    if (str.equals("kaVipLevel")) {
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        Pair pair = (Pair) o000000O.OooOO0().getValue();
                        jSInfoModel.setKaVipLevel(pair != null ? ((Number) pair.getSecond()).intValue() : 0);
                    }
                    break;
                case -934795532:
                    if (str.equals("region")) {
                        o000000O o000000o3 = o000000O.f46674OooO00o;
                        T value = o000000O.OooOOO0().getValue();
                        Intrinsics.checkNotNull(value);
                        jSInfoModel.setRegion(((Number) value).intValue());
                    }
                    break;
                case -925319370:
                    if (str.equals("roomID")) {
                        Long value2 = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
                        if (value2 != null) {
                            Intrinsics.checkNotNullExpressionValue(value2, "RoomDataSource.instance().roomId.value ?: 0");
                            jLongValue = value2.longValue();
                        }
                        jSInfoModel.setRoomID(jLongValue);
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        o000000O o000000o4 = o000000O.f46674OooO00o;
                        Long l = (Long) o000000O.OooOOo0().getValue();
                        if (l != null) {
                            Intrinsics.checkNotNullExpressionValue(l, "Account.userId.value ?: 0");
                            jLongValue = l.longValue();
                        }
                        jSInfoModel.setUserId(jLongValue);
                    }
                    break;
                case -662089212:
                    if (str.equals("appVersionCode")) {
                        jSInfoModel.setAppVersionCode(p382o0OOoo0o.o00Ooo.OooO0OO());
                    }
                    break;
                case -661774686:
                    if (str.equals("appVersionName")) {
                        jSInfoModel.setAppVersionName(p382o0OOoo0o.o00Ooo.OooO0Oo());
                    }
                    break;
                case -147154190:
                    if (str.equals("userIdx")) {
                        o000000O o000000o5 = o000000O.f46674OooO00o;
                        String str3 = (String) o000000O.OooOOo().getValue();
                        if (str3 != null) {
                            Intrinsics.checkNotNullExpressionValue(str3, "Account.userIdx.value ?: \"\"");
                            str2 = str3;
                        }
                        jSInfoModel.setUserIdx(str2);
                    }
                    break;
                case 3735305:
                    if (str.equals("zeus")) {
                        jSInfoModel.setZeus(p382o0OOoo0o.o00Ooo.OooO00o("").headers());
                    }
                    break;
                case 110541305:
                    if (str.equals("token")) {
                        o000000O o000000o6 = o000000O.f46674OooO00o;
                        String str4 = (String) ((MutableLiveData) o000000O.f46700OooOoo.getValue()).getValue();
                        if (str4 != null) {
                            Intrinsics.checkNotNullExpressionValue(str4, "Account.tokenActivity.value ?: \"\"");
                            str2 = str4;
                        }
                        jSInfoModel.setToken(str2);
                    }
                    break;
                case 321545849:
                    if (str.equals("userLevel")) {
                        o000000O o000000o7 = o000000O.f46674OooO00o;
                        Integer num = (Integer) ((MutableLiveData) o000000O.f46694OooOo00.getValue()).getValue();
                        if (num == null) {
                            iIntValue = 0;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(num, "Account.level.value ?: 0");
                            iIntValue = num.intValue();
                        }
                        jSInfoModel.setUserLevel(iIntValue);
                    }
                    break;
                case 329221358:
                    if (str.equals("userToken")) {
                        o000000O o000000o8 = o000000O.f46674OooO00o;
                        String str5 = (String) o000000O.OooOOOO().getValue();
                        if (str5 != null) {
                            Intrinsics.checkNotNullExpressionValue(str5, "Account.token.value ?: \"\"");
                            str2 = str5;
                        }
                        jSInfoModel.setUserToken(str2);
                    }
                    break;
                case 1343127921:
                    if (str.equals("recentRoomID")) {
                        oO0O0OoO oo0o0oooOooOoOO = o000OOo.OooO00o().OooOoOO();
                        o000000O o000000o9 = o000000O.f46674OooO00o;
                        RoomHistory roomHistoryOooO0O0 = oo0o0oooOooOoOO.OooO0O0(String.valueOf(o000000O.OooOOo0().getValue()));
                        jSInfoModel.setRecentRoomID(com.code.android.util.o0OoOo0.OooO(0L, roomHistoryOooO0O0 != null ? roomHistoryOooO0O0.barid : null));
                    }
                    break;
                case 1471573351:
                    if (str.equals("vipLevel")) {
                        o000000O o000000o10 = o000000O.f46674OooO00o;
                        Pair pair2 = (Pair) o000000O.OooOO0o().getValue();
                        jSInfoModel.setVipLevel(pair2 != null ? ((Number) pair2.getSecond()).intValue() : 0);
                    }
                    break;
                case 1609796993:
                    if (str.equals("chatToken")) {
                        o000000O o000000o11 = o000000O.f46674OooO00o;
                        String str6 = (String) o000000O.OooOOOo().getValue();
                        if (str6 != null) {
                            Intrinsics.checkNotNullExpressionValue(str6, "Account.tokenChat.value ?: \"\"");
                            str2 = str6;
                        }
                        jSInfoModel.setChatToken(str2);
                    }
                    break;
                case 1842452087:
                    if (str.equals("netType")) {
                        jSInfoModel.setNetType(NetworkStateUtil.INSTANCE.networkType(o000O0.OooO00o()).toString());
                    }
                    break;
                case 2098881846:
                    if (str.equals("systemVersionCode")) {
                        jSInfoModel.setSystemVersionCode(String.valueOf(((Number) p382o0OOoo0o.oo000o.f44306OooO00o.getValue()).intValue()));
                    }
                    break;
                case 2099196372:
                    if (str.equals("systemVersionName")) {
                        jSInfoModel.setSystemVersionName(p382o0OOoo0o.oo000o.OooO0Oo());
                    }
                    break;
            }
        }
        return p140o00OOooo.OooOO0.OooO00o(jSInfoModel);
    }

    @JavascriptInterface
    public void goBackLastPage() {
    }

    @JavascriptInterface
    public final void goToBuyRoomTheme() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(null), 3, null);
    }

    @JavascriptInterface
    public final void goToGooglePlay() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(null), 3, null);
    }

    @JavascriptInterface
    public void goToRecharge() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(null), 3, null);
    }

    @JvmOverloads
    @JavascriptInterface
    public final void isHideWealth() {
        isHideWealth(false);
    }

    @JavascriptInterface
    public final boolean isInstallYallaChat() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            return p427o0OoOO00.oo000o.OooO0OO(activityOooO0O0, "com.yallatech.yallachat");
        }
        return false;
    }

    public abstract void onClosePage();

    @JavascriptInterface
    public final void postPage() {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            OooOOO onLogin = new OooOOO(activityOooO0O0);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O1 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O1);
            }
        }
    }

    @JavascriptInterface
    public final void profilePage(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(str, null), 3, null);
    }

    @JavascriptInterface
    public final void quickRecharch() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo00(null), 3, null);
    }

    @Deprecated(message = "用上面那个，这个不能删，兼容旧版本活动")
    @JavascriptInterface
    public void rechargePage() {
        goToRecharge();
    }

    @JavascriptInterface
    public void refreshUrl() {
    }

    @JvmOverloads
    @JavascriptInterface
    public final void roomPage(@Nullable String str) {
        OooO00o(this, str, 0, 6);
    }

    @JavascriptInterface
    public final void shareActivity(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo0(str, null), 3, null);
    }

    @JavascriptInterface
    public final void showMsg(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000oOoO(message, null), 3, null);
    }

    @JavascriptInterface
    public final void showToastMsg(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OoOo0(message, null), 3, null);
    }

    @JavascriptInterface
    public final void storePage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00O0O(null), 3, null);
    }

    @JavascriptInterface
    public void taskPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00Oo0(null), 3, null);
    }

    @JavascriptInterface
    public final void toAppMarketDownLoad(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00Ooo(packageName, null), 3, null);
    }

    @JavascriptInterface
    public final void toAssociationYallaChat() {
        o000OO.OooO00o.OooO00o(o000OO.f56890OooO0O0, oo000o.f56286OooO0Oo);
    }

    @JavascriptInterface
    public final void toBadgePage(int i) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00oO0o(i, null), 3, null);
    }

    @JavascriptInterface
    public void toBlindboxRecord() {
    }

    @JavascriptInterface
    public final void toEventPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0ooOOo(null), 3, null);
    }

    @JavascriptInterface
    public final void toHomePage(int i) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OOO0o(i, null), 3, null);
    }

    @JavascriptInterface
    public final void toPostDetailPage(long j) {
        MomentDetailModel momentDetailModel = new MomentDetailModel();
        momentDetailModel.setId(j);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0Oo0oo(momentDetailModel, null), 3, null);
    }

    @JvmOverloads
    @JavascriptInterface
    public final void toPremiumPage() {
        toPremiumPage(0);
    }

    @JvmOverloads
    @JavascriptInterface
    public final void toVipPage() {
        toVipPage(0);
    }

    @JavascriptInterface
    public final void toYallaChatTrees(@Nullable String str) {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
        if (fragmentActivity != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0OO00O(str, fragmentActivity, null), 2, null);
        }
    }

    @JavascriptInterface
    public final void topicPageNew(@NotNull String topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo0o0Oo(topicId, null), 3, null);
    }

    @JavascriptInterface
    public final void updateCoin(long j) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(Long.valueOf(j));
    }

    @JavascriptInterface
    public void updateCrystal(int i) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0Oo().postValue(Long.valueOf(i));
    }

    @JavascriptInterface
    public final void updateGoldCoinBalance(long j) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(Long.valueOf(j));
        com.squareup.okhttp.OooOo.OooO0OO(57, null);
    }

    @JvmOverloads
    @JavascriptInterface
    public void webBgColor(@Nullable String str) {
    }

    @JavascriptInterface
    public void zoomOut() {
    }

    @JvmOverloads
    @JavascriptInterface
    public final void buriedPointEvent(@Nullable String str, @Nullable Map<String, String> map) {
        if (str != null) {
            o0OO000.OooO0O0(str, map);
        }
    }

    @JvmOverloads
    @JavascriptInterface
    public final void eventStatistic(@NotNull String eventId, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        o0OO000.OooO0O0(eventId, map);
    }

    @JvmOverloads
    @JavascriptInterface
    public void isHideWealth(boolean z) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo().postValue(Boolean.valueOf(!z));
    }

    @JvmOverloads
    @JavascriptInterface
    public final void roomPage(@Nullable String str, int i) {
        OooO00o(this, str, i, 4);
    }

    @JvmOverloads
    @JavascriptInterface
    public void toPremiumPage(int i) {
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(activityOooO0O0, PremiumLevel.INSTANCE.of(Integer.valueOf(i)));
        }
    }

    @JvmOverloads
    @JavascriptInterface
    public void toVipPage(int i) {
        Context context = o000O0.f10354OooO00o;
        if (com.code.android.util.OooO0O0.OooO0O0() != null) {
            VipScreen.navigate$default(VipScreen.INSTANCE, VipLevel.INSTANCE.of(i), false, 2, null);
        }
    }

    @JvmOverloads
    @JavascriptInterface
    public final void webBgColor() {
        webBgColor("00000000");
    }

    @JvmOverloads
    @JavascriptInterface
    public void roomPage(@Nullable String str, int i, int i2) {
        p592o0oo00O.OooOOO0.OooO0O0("BaseJSBridge roomPage roomId:" + str + " , giftid = " + i + " , giftUserType:" + i2);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oO0o0o(str, Integer.valueOf(i), OooOo.f56274OooO0Oo, GiftPropTypeUser.Hot.getValue(), null), 3, null);
    }
}
