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
import p405o0Oo0OOO.oO0O00oO;
import p406o0Oo0OOo.v3;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.i0;
import p590o0oOooo0.l0;
import p590o0oOooo0.oOOo0000;
import p643o0ooOOOO.i3;
import p650o0ooo.w3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/PrivateChatActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "Landroid/view/View$OnClickListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/view/View;", "v", "", "onClick", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPrivateChatActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,792:1\n22#2,2:793\n*S KotlinDebug\n*F\n+ 1 PrivateChatActivity.kt\ncom/yalla/yalla/ui/activity/message/PrivateChatActivity\n*L\n104#1:793,2\n*E\n"})
public final class PrivateChatActivity extends BaseFragmentActivity implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final /* synthetic */ int f25239Oooo000 = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f25240OooOOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public w3 f25248OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f25250OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public p434o0OoOOOO.o00O0OO f25253OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public MutableState<Oooo000> f25254OooOooo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f25241OooOOo0 = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oO0O00oO.class), this, null);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f25242OooOOoo = true;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f25245OooOo00 = LazyKt.lazy(new OooO());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25244OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25246OooOo0O = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f25247OooOo0o = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f25243OooOo = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f25249OooOoO0 = LazyKt.lazy(new OooOO0());

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final p434o0OoOOOO.o00OO f25252OooOoo0 = new p434o0OoOOOO.o00OO(this);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final p434o0OoOOOO.o0oOOo f25251OooOoo = new p434o0OoOOOO.o0oOOo(this);

    public static final class OooO extends Lambda implements Function0<p205o00o0o0o.o000O> {
        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p205o00o0o0o.o000O invoke() {
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(PrivateChatActivity.this);
            o000o.OooOo(true);
            return o000o;
        }
    }

    public static final class OooO00o {
        public static void OooO00o(@Nullable Context context, @Nullable Long l) {
            if (context == null || l == null) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) PrivateChatActivity.class);
            intent.putExtra(v3.f45737OooO00o, l.longValue());
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
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                int i = PrivateChatActivity.f25239Oooo000;
                PrivateChatActivity privateChatActivity = PrivateChatActivity.this;
                privateChatActivity.OooOo0().f44884OooO0o0.f44895OooO0O0.setVisibility(8);
                privateChatActivity.OooOo0().f44885OooO0oO.f45306OooO0O0.setVisibility(0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25261OooO0Oo;

        public OooOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25261OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25261OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25261OooO0Oo;
        }

        public final int hashCode() {
            return this.f25261OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25261OooO0Oo.invoke(obj);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.message.PrivateChatActivity$onResume$4", f = "PrivateChatActivity.kt", i = {}, l = {652}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f25262OooO0Oo;

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
            int i = this.f25262OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedGifFaceManager sharedGifFaceManager = SharedGifFaceManager.f22301OooO00o;
                this.f25262OooO0Oo = 1;
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
        return (PrivateChatVM) this.f25247OooOo0o.getValue();
    }

    public final oO0O00oO OooOo0() {
        return (oO0O00oO) this.f25241OooOOo0.getValue();
    }

    public final PrivateChatAdapter OooOo0O() {
        return (PrivateChatAdapter) this.f25244OooOo0.getValue();
    }

    public final BaseMomentDetailVM OooOo0o() {
        return (BaseMomentDetailVM) this.f25243OooOo.getValue();
    }

    public final void OooOoO0(Intent intent) {
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        long j = extras.getLong(v3.f45737OooO00o, 0L);
        if (j != OooOo().getTargetId()) {
            MutableState<Oooo000> mutableState = this.f25254OooOooo;
            if (mutableState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState = null;
            }
            mutableState.getValue().OooO00o().setText((CharSequence) null);
        }
        OooOo().setTargetId(j);
        if (OooOo().getChatMessage() != null) {
            PrivateChatAdapter privateChatAdapterOooOo0O = OooOo0O();
            p188o00o00oO.o000O0o<Integer, ChatMessage> pagerSource = OooOo().getChatMessage();
            Intrinsics.checkNotNull(pagerSource);
            privateChatAdapterOooOo0O.getClass();
            Intrinsics.checkNotNullParameter(pagerSource, "pagerSource");
            BuildersKt__Builders_commonKt.launch$default(pagerSource.f38510OooO00o, Dispatchers.getIO(), null, new i3(pagerSource, privateChatAdapterOooOo0O, null), 2, null);
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        MutableState<Oooo000> mutableState = this.f25254OooOooo;
        MutableState<Oooo000> mutableState2 = null;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        if (mutableState.getValue().f25223OooO.getValue() != null) {
            MutableState<Oooo000> mutableState3 = this.f25254OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            } else {
                mutableState2 = mutableState3;
            }
            p371o0OOo0oO.oo000o value = mutableState2.getValue().f25223OooO.getValue();
            Intrinsics.checkNotNull(value);
            p371o0OOo0oO.oo000o oo000oVar = value;
            if (oo000oVar.f43185OooO0o == 2) {
                oo000oVar.OooO0O0();
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
        if (id == p562o0oOo000.o0OO00O.btInRoom) {
            String strValueOf = String.valueOf(OooOo().getTargetId());
            o00000O0 o00000o1 = new o00000O0(this, true);
            LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("touserid", strValueOf);
            com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43390Oooooo0, linkedHashMapOooO00o, o00000o1);
            return;
        }
        if (id == p562o0oOo000.o0OO00O.ivInRoomClose) {
            this.f25240OooOOo = true;
            OooOo0().f44884OooO0o0.f44895OooO0O0.setVisibility(8);
        } else if (id == p562o0oOo000.o0OO00O.ivWarnClose) {
            OooOo().updateRiskFriend();
            OooOo0().f44885OooO0oO.f45306OooO0O0.setVisibility(8);
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
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        p379o0OOoOOO.oOO00O.OooO0OO(window, 0);
        setContentView(OooOo0().f44879OooO00o);
        com.code.android.util.o0000O0O.OooO0o(this, -1, false);
        androidx.core.view.o0 o0Var = new androidx.core.view.o0(getWindow().getDecorView(), getWindow());
        Intrinsics.checkNotNullExpressionValue(o0Var, "getInsetsController(...)");
        o0Var.OooO00o(true);
        o0oo0000.OooO00o.OooO0O0("204007");
        PrivateChatVM privateChatVMOooOo = OooOo();
        oO0O00oO oo0o00ooOooOo0 = OooOo0();
        final p434o0OoOOOO.o0oOOo o0oooo = this.f25251OooOoo;
        p434o0OoOOOO.o00O0OO o00o0oo2 = new p434o0OoOOOO.o00O0OO(this, o0oooo, privateChatVMOooOo, oo0o00ooOooOo0);
        BaseMomentDetailVM baseMomentDetailVMOooOo0o = OooOo0o();
        Intrinsics.checkNotNullParameter(baseMomentDetailVMOooOo0o, "<set-?>");
        o00o0oo2.f46929OooO0Oo = baseMomentDetailVMOooOo0o;
        this.f25253OooOooO = o00o0oo2;
        this.f25254OooOooo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Oooo000(this, o00o0oo2, o0oooo), null, 2, null);
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(-605407946, true, new o0000(this)));
        oO0O00oO mBinding = OooOo0();
        UserBlackVM userBlackVM = (UserBlackVM) this.f25249OooOoO0.getValue();
        PrivateChatVM privateChatVM = OooOo();
        PrivateChatAdapter chatAdapter = OooOo0O();
        MutableState<Oooo000> mutableState = this.f25254OooOooo;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            chatBottomState = null;
        } else {
            chatBottomState = mutableState;
        }
        final p434o0OoOOOO.o00OO o00oo2 = this.f25252OooOoo0;
        o00oo2.getClass();
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(userBlackVM, "userBlackVM");
        Intrinsics.checkNotNullParameter(privateChatVM, "privateChatVM");
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        Intrinsics.checkNotNullParameter(chatBottomState, "chatBottomState");
        HeaderLayout fitTopInset = mBinding.f44880OooO0O0.f44252OooO0O0;
        Intrinsics.checkNotNullExpressionValue(fitTopInset, "headerLayout");
        Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
        p379o0OOoOOO.o00O00O o00o00o2 = new p379o0OOoOOO.o00O00O(fitTopInset, true, true);
        WeakHashMap<View, androidx.core.view.o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInset, o00o00o2);
        fitTopInset.OooOo0O();
        fitTopInset.setNavigationOnClickListener(new View.OnClickListener() { // from class: o0OoOOOO.o00OO000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00OO this$0 = o00oo2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46935OooO00o.onBackPressed();
            }
        });
        privateChatVM.isFriendLiveData().observe(o00oo2.f46935OooO00o, new o0OoOOOO.o00OO.OooO0O0(new p434o0OoOOOO.oo0O(chatBottomState, o00oo2, chatAdapter, fitTopInset, userBlackVM, privateChatVM)));
        this.f22282OooOO0 = fitTopInset;
        OooOo0().f44884OooO0o0.f44895OooO0O0.setVisibility(8);
        Button button = (Button) findViewById(p562o0oOo000.o0OO00O.btInRoom);
        ImageView imageView = (ImageView) findViewById(p562o0oOo000.o0OO00O.ivInRoomClose);
        button.setOnClickListener(this);
        imageView.setOnClickListener(this);
        OooOo0().f44885OooO0oO.f45306OooO0O0.setVisibility(8);
        TextView textView = (TextView) findViewById(p562o0oOo000.o0OO00O.tvWarn);
        String string = getString(p562o0oOo000.o000000.private_chat_warning);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(p562o0oOo000.o000000.Report);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(androidx.camera.core.impl.OooOOOO.OooO00o(string, string2));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) androidx.camera.core.impl.OooOOOO.OooO00o(string, string2), string2, 0, false, 6, (Object) null);
        spannableStringBuilder.setSpan(new o000O0O0(this), iIndexOf$default, string2.length() + iIndexOf$default, 33);
        textView.setText(spannableStringBuilder);
        if (oOOo0000.f57237OooO0O0 == null) {
            oOOo0000.f57237OooO0O0 = new oOOo0000();
        }
        textView.setMovementMethod(oOOo0000.f57237OooO0O0);
        textView.setHighlightColor(getResources().getColor(R.color.transparent));
        ((ImageView) findViewById(p562o0oOo000.o0OO00O.ivWarnClose)).setOnClickListener(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(p562o0oOo000.o0OO00O.flChat);
        OooOo0().f44882OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o0OO00O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PrivateChatActivity.f25239Oooo000;
                PrivateChatActivity this$0 = this.f25519OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0oo0000.OooO00o.OooO0O0("104007");
                this$0.getClass();
                o0oo0o.o000oOoO.OooO00o.OooO00o(p614o0oo0o.o000oOoO.f57513OooO0O0, new o00(this$0));
            }
        });
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        fixLinearLayoutManager.setReverseLayout(true);
        OooOo0().f44878OooO.setLayoutManager(fixLinearLayoutManager);
        OooOo0O().f26971OooOo = new o0000O0O(this);
        OooOo0().f44878OooO.setAdapter(OooOo0O());
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.activity.message.oo0o0Oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i = PrivateChatActivity.f25239Oooo000;
                PrivateChatActivity this$0 = this.f25550OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                p434o0OoOOOO.o00O0OO o00o0oo3 = this$0.f25253OooOooO;
                MutableState<Oooo000> mutableState2 = null;
                if (o00o0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPrivateChatGiftSendManager");
                    o00o0oo3 = null;
                }
                MutableState<Oooo000> mutableState3 = this$0.f25254OooOooo;
                if (mutableState3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                    mutableState3 = null;
                }
                o00o0oo3.OooO00o(mutableState3.getValue());
                MutableState<Oooo000> mutableState4 = this$0.f25254OooOooo;
                if (mutableState4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                } else {
                    mutableState2 = mutableState4;
                }
                p371o0OOo0oO.oo000o value = mutableState2.getValue().f25223OooO.getValue();
                if (value == null) {
                    return false;
                }
                value.OooO00o();
                return false;
            }
        });
        RecyclerView rvChat = OooOo0().f44878OooO;
        Intrinsics.checkNotNullExpressionValue(rvChat, "rvChat");
        l0.OooO0O0(rvChat, 100L, 0L, 100L, 100L);
        OooOo0O().OooO0o0(new o000OO(this));
        OooOo0().f44878OooO.addOnScrollListener(new o0000O(this));
        PrivateChatAdapter privateChatAdapterOooOo0O = OooOo0O();
        o000O000 listener = new o000O000(this);
        privateChatAdapterOooOo0O.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        privateChatAdapterOooOo0O.f58006OooOO0o = listener;
        PrivateChatAdapter privateChatAdapterOooOo0O2 = OooOo0O();
        o000Oo0 listener2 = new o000Oo0(this);
        privateChatAdapterOooOo0O2.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        privateChatAdapterOooOo0O2.f58007OooOOO = listener2;
        PrivateChatAdapter privateChatAdapterOooOo0O3 = OooOo0O();
        o000O00 listener3 = new o000O00(this);
        privateChatAdapterOooOo0O3.getClass();
        Intrinsics.checkNotNullParameter(listener3, "listener");
        privateChatAdapterOooOo0O3.f26972OooOo0 = listener3;
        PrivateChatAdapter privateChatAdapterOooOo0O4 = OooOo0O();
        o000O00O listener4 = new o000O00O(this);
        privateChatAdapterOooOo0O4.getClass();
        Intrinsics.checkNotNullParameter(listener4, "listener");
        privateChatAdapterOooOo0O4.f26974OooOo0O = listener4;
        MutableState<Oooo000> mutableState2 = this.f25254OooOooo;
        if (mutableState2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState2 = null;
        }
        Oooo000 value = mutableState2.getValue();
        LinearLayout layoutYallaChat = OooOo0().f44882OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(layoutYallaChat, "layoutYallaChat");
        value.getClass();
        Intrinsics.checkNotNullParameter(layoutYallaChat, "<set-?>");
        value.f25237OooOOOO = layoutYallaChat;
        PrivateChatVM privateChatVMOooOo2 = OooOo();
        Intrinsics.checkNotNullParameter(privateChatVMOooOo2, "<set-?>");
        value.f25235OooOOO = privateChatVMOooOo2;
        Intrinsics.checkNotNullParameter(o0oooo, "<set-?>");
        value.f25236OooOOO0 = o0oooo;
        ComposeView privateChatBottomCompose = OooOo0().f44886OooO0oo;
        Intrinsics.checkNotNullExpressionValue(privateChatBottomCompose, "privateChatBottomCompose");
        p193o00o0O0O.o0000oo.OooO0Oo(privateChatBottomCompose, ComposableLambdaKt.composableLambdaInstance(-977081340, true, new o00000OO(this)));
        oO0O00oO binding = OooOo0();
        final PrivateChatVM privateChatVM2 = OooOo();
        o0oooo.getClass();
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(privateChatVM2, "privateChatVM");
        o0oooo.f46979OooO0O0 = binding;
        if (binding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            binding = null;
        }
        binding.f44883OooO0o.f45237OooO0o.setOnTouchListener(new View.OnTouchListener() { // from class: o0OoOOOO.o00OOOO0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                o0oOOo this$0 = o0oooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PrivateChatVM privateChatVM3 = privateChatVM2;
                Intrinsics.checkNotNullParameter(privateChatVM3, "$privateChatVM");
                Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                int action = motionEvent.getAction();
                oO0O00oO oo0o00oo = null;
                if (action == 0) {
                    oO0O00oO oo0o00oo2 = this$0.f46979OooO0O0;
                    if (oo0o00oo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o00oo2 = null;
                    }
                    oo0o00oo2.f44883OooO0o.f45239OooO0oO.setVisibility(0);
                    oO0O00oO oo0o00oo3 = this$0.f46979OooO0O0;
                    if (oo0o00oo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o00oo3 = null;
                    }
                    oo0o00oo3.f44883OooO0o.f45234OooO0O0.setVisibility(8);
                    oO0O00oO oo0o00oo4 = this$0.f46979OooO0O0;
                    if (oo0o00oo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o00oo4 = null;
                    }
                    oo0o00oo4.f44883OooO0o.f45237OooO0o.setImageResource(o0Oo0oo.icon_voice_recording);
                    oO0O00oO oo0o00oo5 = this$0.f46979OooO0O0;
                    if (oo0o00oo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o00oo5 = null;
                    }
                    oo0o00oo5.f44883OooO0o.f45241OooOO0.setText(o000000.OooO0Oo(Float.valueOf(30.0f)) + "\"");
                    o0O00o0 o0o00o1 = this$0.f46987OooOO0O;
                    if (o0o00o1 != null) {
                        Intrinsics.checkNotNull(o0o00o1);
                        o0o00o1.cancel();
                        this$0.f46987OooOO0O = null;
                    }
                    Timer timer = this$0.f46986OooOO0;
                    if (timer != null) {
                        Intrinsics.checkNotNull(timer);
                        timer.cancel();
                        Timer timer2 = this$0.f46986OooOO0;
                        Intrinsics.checkNotNull(timer2);
                        timer2.purge();
                        this$0.f46986OooOO0 = null;
                    }
                    this$0.f46986OooOO0 = new Timer();
                    this$0.f46987OooOO0O = new o0O00o0(this$0, motionEvent, privateChatVM3);
                    Timer timer3 = this$0.f46986OooOO0;
                    Intrinsics.checkNotNull(timer3);
                    timer3.schedule(this$0.f46987OooOO0O, 600L);
                } else if (action == 1) {
                    oO0O00oO oo0o00oo6 = this$0.f46979OooO0O0;
                    if (oo0o00oo6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        oo0o00oo = oo0o00oo6;
                    }
                    if (oo0o00oo.f44883OooO0o.f45239OooO0oO.getVisibility() == 0) {
                        this$0.f46978OooO00o.runOnUiThread(new o00OOOOo(this$0, motionEvent, privateChatVM3));
                    }
                } else if (action == 2) {
                    int[] iArr = new int[2];
                    oO0O00oO oo0o00oo7 = this$0.f46979OooO0O0;
                    if (oo0o00oo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        oo0o00oo7 = null;
                    }
                    oo0o00oo7.f44883OooO0o.f45241OooOO0.getLocationOnScreen(iArr);
                    this$0.f46983OooO0o0 = iArr[1];
                    if (motionEvent.getRawY() < this$0.f46983OooO0o0) {
                        oO0O00oO oo0o00oo8 = this$0.f46979OooO0O0;
                        if (oo0o00oo8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo8 = null;
                        }
                        oo0o00oo8.f44883OooO0o.f45232OooO.setText(o0000.OooO0OO(p562o0oOo000.o000000.release_to_cancel));
                        oO0O00oO oo0o00oo9 = this$0.f46979OooO0O0;
                        if (oo0o00oo9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo9 = null;
                        }
                        oo0o00oo9.f44883OooO0o.f45234OooO0O0.setVisibility(0);
                        oO0O00oO oo0o00oo10 = this$0.f46979OooO0O0;
                        if (oo0o00oo10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            oo0o00oo = oo0o00oo10;
                        }
                        oo0o00oo.f44883OooO0o.f45235OooO0OO.setVisibility(4);
                    } else {
                        oO0O00oO oo0o00oo11 = this$0.f46979OooO0O0;
                        if (oo0o00oo11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo11 = null;
                        }
                        oo0o00oo11.f44883OooO0o.f45232OooO.setText(o0000.OooO0OO(p562o0oOo000.o000000.slide_up_to_cancel));
                        oO0O00oO oo0o00oo12 = this$0.f46979OooO0O0;
                        if (oo0o00oo12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                            oo0o00oo12 = null;
                        }
                        oo0o00oo12.f44883OooO0o.f45234OooO0O0.setVisibility(8);
                        oO0O00oO oo0o00oo13 = this$0.f46979OooO0O0;
                        if (oo0o00oo13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            oo0o00oo = oo0o00oo13;
                        }
                        oo0o00oo.f44883OooO0o.f45235OooO0OO.setVisibility(0);
                    }
                }
                return true;
            }
        });
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        OooOoO0(intent);
        OooOo().getChatUserInfo().observe(this, new o000000O(0, this));
        OooOo().getFriendRemarkLiveData().observe(this, new OooOOO(new o0000O00(this)));
        OooOo().loadConversation().observe(this, new o00000(0, this));
        OooOo().isFriendLiveData().observe(this, new OooOOO(new o0000O0(this)));
        Class cls = Boolean.TYPE;
        LiveEventBus.get("GiftBackpackFrozen_IM", cls).observe(this, new p022Oooo00O.o0000OO0(this, 1));
        int i = 0;
        LiveEventBus.get("WealthLevelInsufficient_IM", cls).observe(this, new o0O0O00(this, i));
        LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT", String.class).observe(this, new o000OOo(this, i));
        LiveEventBus.get("EVENTMSG_PRIVATE_LUCKY_GIFT", MessageIM.SendGiftReply.class).observe(this, new o000000(i, this));
        OooOo().getRoomThemeGiveState().observe(this, new OooOOO(new o000O0Oo(this)));
        OooOo().getRoomThemeAccept().observe(this, new OooOOO(new o000OO0O(this)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        i0 i0Var = this.f25251OooOoo.f46981OooO0Oo;
        MediaPlayer mediaPlayer = i0Var.f57121OooO00o;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        i0Var.f57121OooO00o.stop();
        i0Var.f57121OooO00o.release();
        i0Var.f57121OooO00o = null;
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
        MutableState<Oooo000> mutableState = this.f25254OooOooo;
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
        MutableState mutableState = p429o0OoOO.o0Oo0oo.f46817OooO00o;
        if (p429o0OoOO.o0Oo0oo.OooO0oO() != RoomState.Close) {
            MutableState<Oooo000> mutableState2 = this.f25254OooOooo;
            if (mutableState2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState2 = null;
            }
            mutableState2.getValue().f25231OooO0oo.setValue(Boolean.FALSE);
            MutableState<Oooo000> mutableState3 = this.f25254OooOooo;
            if (mutableState3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState3 = null;
            }
            this.f25251OooOoo.OooO00o(mutableState3.getValue());
        } else {
            MutableState<Oooo000> mutableState4 = this.f25254OooOooo;
            if (mutableState4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
                mutableState4 = null;
            }
            mutableState4.getValue().f25231OooO0oo.setValue(Boolean.TRUE);
        }
        OooOo().checkUserRisk().observe(this, new OooOOO(new OooOO0O()));
        App.f22234OooO0oO.postDelayed(new o0Oo0oo(this, 0), 5000L);
        UserInfo userInfo2 = OooOo().userInfo();
        if (userInfo2 != null) {
            ((UserBlackVM) this.f25249OooOoO0.getValue()).checkIsFriendAndBlock(userInfo2.getUserId());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OooOOO0(null), 3, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        MutableState<Oooo000> mutableState = this.f25254OooOooo;
        MutableState<Oooo000> mutableState2 = null;
        if (mutableState == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState = null;
        }
        EmojiEditText view = mutableState.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        kotlin.collections.OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), p371o0OOo0oO.o0OOO0o.OooO00o(context), view.getWindowToken(), 0);
        MutableState<Oooo000> mutableState3 = this.f25254OooOooo;
        if (mutableState3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
            mutableState3 = null;
        }
        mutableState3.getValue().OooO00o().clearFocus();
        MutableState<Oooo000> mutableState4 = this.f25254OooOooo;
        if (mutableState4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatBottomState");
        } else {
            mutableState2 = mutableState4;
        }
        p371o0OOo0oO.oo000o value = mutableState2.getValue().f25223OooO.getValue();
        if (value != null) {
            value.OooO00o();
        }
        this.f25251OooOoo.f46981OooO0Oo.OooO0O0();
    }
}
