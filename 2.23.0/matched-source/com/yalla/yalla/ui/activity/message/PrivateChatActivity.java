package com.yalla.yalla.ui.activity.message;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.cache.SharedGifFaceManager;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.UserBlackVM;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519o0o0O0oO.x3;
import p579o0oOoo.oOO0O0O;
import p579o0oOoo.oOO0OOO;
import p579o0oOoo.oOOoOOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.j5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/PrivateChatActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View$OnClickListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/view/View;", "v", "", "onClick", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,792:1\n22#2,2:793\n*S KotlinDebug\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity\n*L\n104#1:793,2\n*E\n"})
public final class PrivateChatActivity extends BaseFragmentActivity implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ int f25694Oooo000 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f25695OooOOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public x3 f25703OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f25705OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public p430o0OoOOO0.o000O0o f25708OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public MutableState<Oooo000> f25709OooOooo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f25696OooOOo0 = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(j5.class), this, null);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f25697OooOOoo = true;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25700OooOo00 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25699OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25701OooOo0O = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25702OooOo0o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25698OooOo = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f25704OooOoO0 = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final p430o0OoOOO0.o000OO00 f25707OooOoo0 = new p430o0OoOOO0.o000OO00(this);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final p430o0OoOOO0.o00O00OO f25706OooOoo = new p430o0OoOOO0.o00O00OO(this);

    public static final class OooO extends Lambda implements Function0<p157o00OoOO0.o0OO00O> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p157o00OoOO0.o0OO00O invoke() {
            p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(PrivateChatActivity.this);
            o0oo00o2.OooOo(true);
            return o0oo00o2;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@Nullable Context context, @Nullable Long l) {
            if (context == null || l == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PrivateChatActivity.class);
            intent.putExtra(p567o0oOo0o0.o00000O.f56211OooO00o, l.longValue());
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<PrivateChatAdapter> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivateChatAdapter invoke() {
            return new PrivateChatAdapter(PrivateChatActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<BaseMomentDetailVM> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseMomentDetailVM invoke() {
            return (BaseMomentDetailVM) new ViewModelProvider(PrivateChatActivity.this).get(BaseMomentDetailVM.class);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<PrivateChatVM> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PrivateChatVM invoke() {
            return (PrivateChatVM) new ViewModelProvider(PrivateChatActivity.this).get(PrivateChatVM.class);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<UserBlackVM> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserBlackVM invoke() {
            return (UserBlackVM) new ViewModelProvider(PrivateChatActivity.this).get(UserBlackVM.class);
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean aBoolean = bool;
            Intrinsics.checkNotNullExpressionValue(aBoolean, "aBoolean");
            if (aBoolean.booleanValue()) {
                int i = PrivateChatActivity.f25694Oooo000;
                PrivateChatActivity privateChatActivity = PrivateChatActivity.this;
                privateChatActivity.OooOo0().f58172OooO0o0.f58517OooO0O0.setVisibility(8);
                privateChatActivity.OooOo0().f58173OooO0oO.f58666OooO0O0.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25716OooO0Oo;

        public OooOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25716OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25716OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25716OooO0Oo;
        }

        public final int hashCode() {
            return this.f25716OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25716OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.PrivateChatActivity$onResume$4", f = "PrivateChatActivity.kt", i = {}, l = {652}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25717OooO0Oo;

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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25717OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedGifFaceManager sharedGifFaceManager = SharedGifFaceManager.f22774OooO00o;
                this.f25717OooO0Oo = 1;
                if (sharedGifFaceManager.OooO00o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<YallaChatVM> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YallaChatVM invoke() {
            return (YallaChatVM) new ViewModelProvider(PrivateChatActivity.this).get(YallaChatVM.class);
        }
    }

    public final PrivateChatVM OooOo() {
        return (PrivateChatVM) this.f25702OooOo0o.getValue();
    }

    public final j5 OooOo0() {
        return (j5) this.f25696OooOOo0.getValue();
    }

    public final PrivateChatAdapter OooOo0O() {
        return (PrivateChatAdapter) this.f25699OooOo0.getValue();
    }

    public final BaseMomentDetailVM OooOo0o() {
        return (BaseMomentDetailVM) this.f25698OooOo.getValue();
    }

    public final void OooOoO0(Intent intent) {
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        long j = extras.getLong(p567o0oOo0o0.o00000O.f56211OooO00o, 0L);
        if (j != OooOo().getTargetId()) {
            MutableState<Oooo000> mutableState = this.f25709OooOooo;
            if (mutableState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState = null;
            }
            mutableState.getValue().OooO00o().setText((CharSequence) null);
        }
        OooOo().setTargetId(j);
        if (OooOo().getChatMessage() != null) {
            PrivateChatAdapter privateChatAdapterOooOo0O = OooOo0O();
            p143o00Oo000.OooO0o<Integer, ChatMessage> pagerSource = OooOo().getChatMessage();
            Intrinsics.checkNotNull(pagerSource);
            privateChatAdapterOooOo0O.getClass();
            Intrinsics.checkNotNullParameter(pagerSource, "pagerSource");
            BuildersKt__Builders_commonKt.launch$default(pagerSource.f37676OooO00o, Dispatchers.getIO(), null, new p400o0Oo0OO.OooOOO0(pagerSource, privateChatAdapterOooOo0O, null), 2, null);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        MutableState<Oooo000> mutableState = this.f25709OooOooo;
        MutableState<Oooo000> mutableState2 = null;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        if (mutableState.getValue().f25678OooO.getValue() != null) {
            MutableState<Oooo000> mutableState3 = this.f25709OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState2 = mutableState3;
            }
            p367o0OOo0o0.OooOOOO value = mutableState2.getValue().f25678OooO.getValue();
            Intrinsics.checkNotNull(value);
            p367o0OOo0o0.OooOOOO oooOOOO = value;
            if (oooOOOO.f43973OooO0o == 2) {
                oooOOOO.OooO0O0();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        int id = v.getId();
        if (id == oO00O0oO.btInRoom) {
            String strValueOf = String.valueOf(OooOo().getTargetId());
            oo0o0Oo oo0o0oo = new oo0o0Oo(this, true);
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("touserid", strValueOf);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44131Oooooo0, linkedHashMapOooO00o, oo0o0oo);
            return;
        }
        if (id == oO00O0oO.ivInRoomClose) {
            this.f25695OooOOo = true;
            OooOo0().f58172OooO0o0.f58517OooO0O0.setVisibility(8);
        } else if (id == oO00O0oO.ivWarnClose) {
            OooOo().updateRiskFriend();
            OooOo0().f58173OooO0oO.f58666OooO0O0.setVisibility(8);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        OooOo0O().OooOOOO();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        MutableState<Oooo000> chatBottomState;
        super.onCreate(bundle);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        setContentView(OooOo0().f58167OooO00o);
        com.code.android.util.o0000O0O.OooO0o(this, -1, false);
        androidx.core.view.o0oOOo o0oooo = new androidx.core.view.o0oOOo(getWindow().getDecorView(), getWindow());
        Intrinsics.checkNotNullExpressionValue(o0oooo, "getInsetsController(window, window.decorView)");
        o0oooo.OooO00o(true);
        p587o0oOooo.o0OO000.OooO00o("204007");
        PrivateChatVM privateChatVMOooOo = OooOo();
        j5 j5VarOooOo0 = OooOo0();
        final p430o0OoOOO0.o00O00OO o00o00oo2 = this.f25706OooOoo;
        p430o0OoOOO0.o000O0o o000o0o2 = new p430o0OoOOO0.o000O0o(this, o00o00oo2, privateChatVMOooOo, j5VarOooOo0);
        BaseMomentDetailVM baseMomentDetailVMOooOo0o = OooOo0o();
        Intrinsics.checkNotNullParameter(baseMomentDetailVMOooOo0o, "<set-?>");
        o000o0o2.f45776OooO0Oo = baseMomentDetailVMOooOo0o;
        this.f25708OooOooO = o000o0o2;
        this.f25709OooOooo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Oooo000(this, o000o0o2, o00o00oo2), null, 2, null);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-605407946, true, new o000000O(this)));
        j5 mBinding = OooOo0();
        UserBlackVM userBlackVM = (UserBlackVM) this.f25704OooOoO0.getValue();
        PrivateChatVM privateChatVM = OooOo();
        PrivateChatAdapter chatAdapter = OooOo0O();
        MutableState<Oooo000> mutableState = this.f25709OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            chatBottomState = null;
        } else {
            chatBottomState = mutableState;
        }
        final p430o0OoOOO0.o000OO00 o000oo01 = this.f25707OooOoo0;
        o000oo01.getClass();
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(userBlackVM, "userBlackVM");
        Intrinsics.checkNotNullParameter(privateChatVM, "privateChatVM");
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        HeaderLayout fitTopInset = mBinding.f58168OooO0O0.f58773OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fitTopInset, "mBinding.baseHeaderLayout.headerLayout");
        Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
        p370o0OOoO.OooOO0O oooOO0O = new p370o0OOoO.OooOO0O(fitTopInset, true, true);
        WeakHashMap<View, androidx.core.view.o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInset, oooOO0O);
        fitTopInset.OooOo0O();
        fitTopInset.setNavigationOnClickListener(new View.OnClickListener() { // from class: o0OoOOO0.o000O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o000OO00 this$0 = o000oo01;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f45779OooO00o.onBackPressed();
            }
        });
        privateChatVM.isFriendLiveData().observe(o000oo01.f45779OooO00o, new o0OoOOO0.o000OO00.OooO0O0(new p430o0OoOOO0.o000O(chatBottomState, o000oo01, chatAdapter, fitTopInset, userBlackVM, privateChatVM)));
        this.f22755OooOO0 = fitTopInset;
        OooOo0().f58172OooO0o0.f58517OooO0O0.setVisibility(8);
        Button button = (Button) findViewById(oO00O0oO.btInRoom);
        ImageView imageView = (ImageView) findViewById(oO00O0oO.ivInRoomClose);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
        OooOo0().f58173OooO0oO.f58666OooO0O0.setVisibility(8);
        TextView textView = (TextView) findViewById(oO00O0oO.tvWarn);
        String string = getString(oO00OOo0.private_chat_warning);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.private_chat_warning)");
        String string2 = getString(oO00OOo0.Report);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Report)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(androidx.camera.core.impl.OooOOOO.OooO00o(string, string2));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) androidx.camera.core.impl.OooOOOO.OooO00o(string, string2), string2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new o000O0O0(this), iIndexOf$default, string2.length() + iIndexOf$default, 33);
        textView.setText(spannableStringBuilder);
        if (oOOoOOO0.f56695OooO0O0 == null) {
            oOOoOOO0.f56695OooO0O0 = new oOOoOOO0();
        }
        textView.setMovementMethod(oOOoOOO0.f56695OooO0O0);
        textView.setHighlightColor(getResources().getColor(R.color.transparent));
        ((ImageView) findViewById(oO00O0oO.ivWarnClose)).setOnClickListener(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(oO00O0oO.flChat);
        OooOo0().f58170OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o0Oo0oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PrivateChatActivity.f25694Oooo000;
                PrivateChatActivity this$0 = this.f25964OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p587o0oOooo.o0OO000.OooO00o("104007");
                this$0.getClass();
                o0oo0O0O.o000OO.OooO00o.OooO00o(p602o0oo0O0O.o000OO.f56890OooO0O0, new o00(this$0));
            }
        });
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        fixLinearLayoutManager.setReverseLayout(true);
        OooOo0().f58166OooO.setLayoutManager(fixLinearLayoutManager);
        OooOo0O().f27436OooOo = new o0000(this);
        OooOo0().f58166OooO.setAdapter(OooOo0O());
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.o0OO00O
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = PrivateChatActivity.f25694Oooo000;
                PrivateChatActivity this$0 = this.f25961OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p430o0OoOOO0.o000O0o o000o0o3 = this$0.f25708OooOooO;
                MutableState<Oooo000> mutableState2 = null;
                if (o000o0o3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatGiftSendManager");
                    o000o0o3 = null;
                }
                MutableState<Oooo000> mutableState3 = this$0.f25709OooOooo;
                if (mutableState3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                    mutableState3 = null;
                }
                o000o0o3.OooO00o(mutableState3.getValue());
                MutableState<Oooo000> mutableState4 = this$0.f25709OooOooo;
                if (mutableState4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                } else {
                    mutableState2 = mutableState4;
                }
                p367o0OOo0o0.OooOOOO value = mutableState2.getValue().f25678OooO.getValue();
                if (value == null) {
                    return false;
                }
                value.OooO00o();
                return false;
            }
        });
        RecyclerView recyclerView = OooOo0().f58166OooO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "mBinding.rvChat");
        oOO0OOO.OooO0O0(recyclerView, 100L, 0L, 100L, 100L);
        OooOo0O().OooO0o0(new o0000O00(this));
        OooOo0().f58166OooO.addOnScrollListener(new o0000oo(this));
        PrivateChatAdapter privateChatAdapterOooOo0O = OooOo0O();
        o000OO listener = new o000OO(this);
        privateChatAdapterOooOo0O.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        privateChatAdapterOooOo0O.f44447OooOO0o = listener;
        PrivateChatAdapter privateChatAdapterOooOo0O2 = OooOo0O();
        o0000OO0 listener2 = new o0000OO0(this);
        privateChatAdapterOooOo0O2.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        privateChatAdapterOooOo0O2.f44448OooOOO = listener2;
        PrivateChatAdapter privateChatAdapterOooOo0O3 = OooOo0O();
        o000 listener3 = new o000(this);
        privateChatAdapterOooOo0O3.getClass();
        Intrinsics.checkNotNullParameter(listener3, "listener");
        privateChatAdapterOooOo0O3.f27437OooOo0 = listener3;
        PrivateChatAdapter privateChatAdapterOooOo0O4 = OooOo0O();
        o000O000 listener4 = new o000O000(this);
        privateChatAdapterOooOo0O4.getClass();
        Intrinsics.checkNotNullParameter(listener4, "listener");
        privateChatAdapterOooOo0O4.f27439OooOo0O = listener4;
        MutableState<Oooo000> mutableState2 = this.f25709OooOooo;
        if (mutableState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState2 = null;
        }
        Oooo000 value = mutableState2.getValue();
        LinearLayout linearLayout = OooOo0().f58170OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "mBinding.layoutYallaChat");
        value.getClass();
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        value.f25692OooOOOO = linearLayout;
        PrivateChatVM privateChatVMOooOo2 = OooOo();
        Intrinsics.checkNotNullParameter(privateChatVMOooOo2, "<set-?>");
        value.f25690OooOOO = privateChatVMOooOo2;
        Intrinsics.checkNotNullParameter(o00o00oo2, "<set-?>");
        value.f25691OooOOO0 = o00o00oo2;
        ComposeView composeView = OooOo0().f58174OooO0oo;
        Intrinsics.checkNotNullExpressionValue(composeView, "mBinding.privateChatBottomCompose");
        p147o00Oo0Oo.o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(-977081340, true, new o000OOo(this)));
        j5 binding = OooOo0();
        final PrivateChatVM privateChatVM2 = OooOo();
        o00o00oo2.getClass();
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(privateChatVM2, "privateChatVM");
        o00o00oo2.f45813OooO0O0 = binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            binding = null;
        }
        binding.f58171OooO0o.f58595OooO0o.setOnTouchListener(new View.OnTouchListener() { // from class: o0OoOOO0.o00oOoo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o00O00OO this$0 = o00o00oo2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PrivateChatVM privateChatVM3 = privateChatVM2;
                Intrinsics.checkNotNullParameter(privateChatVM3, "$privateChatVM");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int action = motionEvent.getAction();
                j5 j5Var = null;
                if (action == 0) {
                    j5 j5Var2 = this$0.f45813OooO0O0;
                    if (j5Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j5Var2 = null;
                    }
                    j5Var2.f58171OooO0o.f58597OooO0oO.setVisibility(0);
                    j5 j5Var3 = this$0.f45813OooO0O0;
                    if (j5Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j5Var3 = null;
                    }
                    j5Var3.f58171OooO0o.f58592OooO0O0.setVisibility(8);
                    j5 j5Var4 = this$0.f45813OooO0O0;
                    if (j5Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j5Var4 = null;
                    }
                    j5Var4.f58171OooO0o.f58595OooO0o.setImageResource(oOo00OO0.icon_voice_recording);
                    j5 j5Var5 = this$0.f45813OooO0O0;
                    if (j5Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j5Var5 = null;
                    }
                    j5Var5.f58171OooO0o.f58599OooOO0.setText(o000000.OooO0Oo(Float.valueOf(30.0f)) + "\"");
                    o00O00O o00o00o2 = this$0.f45821OooOO0O;
                    if (o00o00o2 != null) {
                        Intrinsics.checkNotNull(o00o00o2);
                        o00o00o2.cancel();
                        this$0.f45821OooOO0O = null;
                    }
                    Timer timer = this$0.f45820OooOO0;
                    if (timer != null) {
                        Intrinsics.checkNotNull(timer);
                        timer.cancel();
                        Timer timer2 = this$0.f45820OooOO0;
                        Intrinsics.checkNotNull(timer2);
                        timer2.purge();
                        this$0.f45820OooOO0 = null;
                    }
                    this$0.f45820OooOO0 = new Timer();
                    this$0.f45821OooOO0O = new o00O00O(this$0, motionEvent, privateChatVM3);
                    Timer timer3 = this$0.f45820OooOO0;
                    Intrinsics.checkNotNull(timer3);
                    timer3.schedule(this$0.f45821OooOO0O, 600L);
                } else if (action == 1) {
                    j5 j5Var6 = this$0.f45813OooO0O0;
                    if (j5Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        j5Var = j5Var6;
                    }
                    if (j5Var.f58171OooO0o.f58597OooO0oO.getVisibility() == 0) {
                        this$0.f45812OooO00o.runOnUiThread(new o00O000(this$0, motionEvent, privateChatVM3));
                    }
                } else if (action == 2) {
                    int[] iArr = new int[2];
                    j5 j5Var7 = this$0.f45813OooO0O0;
                    if (j5Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        j5Var7 = null;
                    }
                    j5Var7.f58171OooO0o.f58599OooOO0.getLocationOnScreen(iArr);
                    this$0.f45817OooO0o0 = iArr[1];
                    if (motionEvent.getRawY() < this$0.f45817OooO0o0) {
                        j5 j5Var8 = this$0.f45813OooO0O0;
                        if (j5Var8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var8 = null;
                        }
                        j5Var8.f58171OooO0o.f58590OooO.setText(o0000.OooO0OO(oO00OOo0.release_to_cancel));
                        j5 j5Var9 = this$0.f45813OooO0O0;
                        if (j5Var9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var9 = null;
                        }
                        j5Var9.f58171OooO0o.f58592OooO0O0.setVisibility(0);
                        j5 j5Var10 = this$0.f45813OooO0O0;
                        if (j5Var10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            j5Var = j5Var10;
                        }
                        j5Var.f58171OooO0o.f58593OooO0OO.setVisibility(4);
                    } else {
                        j5 j5Var11 = this$0.f45813OooO0O0;
                        if (j5Var11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var11 = null;
                        }
                        j5Var11.f58171OooO0o.f58590OooO.setText(o0000.OooO0OO(oO00OOo0.slide_up_to_cancel));
                        j5 j5Var12 = this$0.f45813OooO0O0;
                        if (j5Var12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            j5Var12 = null;
                        }
                        j5Var12.f58171OooO0o.f58592OooO0O0.setVisibility(8);
                        j5 j5Var13 = this$0.f45813OooO0O0;
                        if (j5Var13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            j5Var = j5Var13;
                        }
                        j5Var.f58171OooO0o.f58593OooO0OO.setVisibility(0);
                    }
                }
                return true;
            }
        });
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        OooOoO0(intent);
        OooOo().getChatUserInfo().observe(this, new o00000(this));
        OooOo().getFriendRemarkLiveData().observe(this, new OooOOO(new o00000O0(this)));
        OooOo().loadConversation().observe(this, new o00000O(this));
        OooOo().isFriendLiveData().observe(this, new OooOOO(new o0000Ooo(this)));
        Class cls = Boolean.TYPE;
        LiveEventBus.get("GiftBackpackFrozen_IM", cls).observe(this, new o000O0o(this));
        LiveEventBus.get("WealthLevelInsufficient_IM", cls).observe(this, new o000O00(this));
        LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT", String.class).observe(this, new o000O00O(this));
        LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT", MessageIM.SendGiftReply.class).observe(this, new o000O0(this));
        OooOo().getRoomThemeGiveState().observe(this, new OooOOO(new o000O0Oo(this)));
        OooOo().getRoomThemeAccept().observe(this, new OooOOO(new o000OO0O(this)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        oOO0O0O ooo0o0o = this.f25706OooOoo.f45815OooO0Oo;
        MediaPlayer mediaPlayer = ooo0o0o.f56656OooO00o;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        ooo0o0o.f56656OooO00o.stop();
        ooo0o0o.f56656OooO00o.release();
        ooo0o0o.f56656OooO00o = null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        OooOoO0(intent);
        if (com.code.android.util.OooOo00.OooO00o(OooOo().userInfo()) && com.code.android.util.OooOo00.OooO0O0(this)) {
            finish();
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        PrivateChatVM privateChatVMOooOo = OooOo();
        MutableState<Oooo000> mutableState = this.f25709OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        privateChatVMOooOo.saveDraftMessage(String.valueOf(mutableState.getValue().OooO00o().getText()));
        if (OooOo().userInfo() != null) {
            PrivateChatVM privateChatVMOooOo2 = OooOo();
            UserInfo userInfo = OooOo().userInfo();
            Intrinsics.checkNotNull(userInfo);
            privateChatVMOooOo2.updateConversationCount(userInfo.getUserId());
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (OooOo().userInfo() != null) {
            PrivateChatVM privateChatVMOooOo = OooOo();
            UserInfo userInfo = OooOo().userInfo();
            Intrinsics.checkNotNull(userInfo);
            privateChatVMOooOo.updateConversationCount(userInfo.getUserId());
        }
        MutableState mutableState = p427o0OoOO00.o0OOO0o.f45698OooO00o;
        if (p427o0OoOO00.o0OOO0o.OooO0oO() != RoomState.Close) {
            MutableState<Oooo000> mutableState2 = this.f25709OooOooo;
            if (mutableState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState2 = null;
            }
            mutableState2.getValue().f25686OooO0oo.setValue(Boolean.FALSE);
            MutableState<Oooo000> mutableState3 = this.f25709OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState3 = null;
            }
            this.f25706OooOoo.OooO00o(mutableState3.getValue());
        } else {
            MutableState<Oooo000> mutableState4 = this.f25709OooOooo;
            if (mutableState4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState4 = null;
            }
            mutableState4.getValue().f25686OooO0oo.setValue(Boolean.TRUE);
        }
        OooOo().checkUserRisk().observe(this, new OooOOO(new OooOO0O()));
        App.f22704OooO0oO.postDelayed(new p045Oooooo.o0ooOOo(this, 2), 5000L);
        UserInfo userInfo2 = OooOo().userInfo();
        if (userInfo2 != null) {
            ((UserBlackVM) this.f25704OooOoO0.getValue()).checkIsFriendAndBlock(userInfo2.getUserId());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOOO0(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        MutableState<Oooo000> mutableState = this.f25709OooOooo;
        MutableState<Oooo000> mutableState2 = null;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        EmojiEditText view = mutableState.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        p367o0OOo0o0.OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), p367o0OOo0o0.Oooo000.OooO00o(context), view.getWindowToken(), 0);
        MutableState<Oooo000> mutableState3 = this.f25709OooOooo;
        if (mutableState3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState3 = null;
        }
        mutableState3.getValue().OooO00o().clearFocus();
        MutableState<Oooo000> mutableState4 = this.f25709OooOooo;
        if (mutableState4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
        } else {
            mutableState2 = mutableState4;
        }
        p367o0OOo0o0.OooOOOO value = mutableState2.getValue().f25678OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        this.f25706OooOoo.f45815OooO0Oo.OooO0O0();
    }
}
