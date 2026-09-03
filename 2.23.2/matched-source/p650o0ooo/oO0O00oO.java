package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.common.support.networkstate.NetworkStateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.room.o0O0oo0o;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.main.SignTaskVM;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000O0o;
import p384o0OOoo0O.o000oOoO;
import p405o0Oo0OOO.o0O000O;
import p405o0Oo0OOO.oO000OOo;
import p405o0Oo0OOO.oO0OOo0o;
import p405o0Oo0OOO.oO0Oo0oo;
import p405o0Oo0OOO.ooOOOOoo;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p583o0oOoo00.o00000OO;
import p595o0oo00O.OooOo00;
import p614o0oo0o.Oooo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oO0O00oO extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Context f58860OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final SignTaskVM f58861OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f58862OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f58863OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f58864OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f58865OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f58866OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f58867OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooOOOO f58868OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f58869OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f58870OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f58871OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final TaskViewModel f58872OooOo0o;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0oo0000.OooO00o.OooO0O0("101074");
            oO0O00oO.this.OooOO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oO0O00oO.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {
        public OooO0O0() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
            String accessToken = str;
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            Intrinsics.checkNotNullParameter(authType, "<anonymous parameter 1>");
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oo0o00oo.f58872OooOo0o.yallaChatBindTask(accessToken).observe(oo0o00oo.f58509OooO0o0, new o000oOoO(new oO0O0O00(oo0o00oo), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oO0Oo0oo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0Oo0oo invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oO0Oo0oo oo0oo0ooInflate = oO0Oo0oo.inflate(LayoutInflater.from(oo0o00oo.f58860OooOO0O), oo0o00oo.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(oo0oo0ooInflate, "inflate(...)");
            return oo0oo0ooInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<oO000OOo> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO000OOo invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oO000OOo oo000oooInflate = oO000OOo.inflate(LayoutInflater.from(oo0o00oo.f58860OooOO0O), oo0o00oo.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(oo000oooInflate, "inflate(...)");
            return oo000oooInflate;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OpenAuthManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            Context context = oO0O00oO.this.f58860OooOO0O;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return new OpenAuthManager((FragmentActivity) context);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<o0O000O> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O000O invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            o0O000O o0o000oInflate = o0O000O.inflate(LayoutInflater.from(oo0o00oo.f58860OooOO0O), oo0o00oo.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(o0o000oInflate, "inflate(...)");
            return o0o000oInflate;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.MainDialogClock$show$1$1", f = "MainDialogClock.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f58880OooO0Oo;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f58880OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f58880OooO0Oo = 1;
                if (DelayKt.delay(1200L, this) == coroutine_suspended) {
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

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f58881OooO0Oo;

        public OooOOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f58881OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f58881OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f58881OooO0Oo;
        }

        public final int hashCode() {
            return this.f58881OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58881OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOOO extends o0000oo<SignTaskModel> {
        public OooOOOO(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            final ViewHolder helper = (ViewHolder) baseViewHolder;
            final SignTaskModel item = (SignTaskModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setImageResource(o0OO00O.iv_icon_task, item.getIcon());
            if (item.getRewardMultiple() > 1) {
                helper.setText(o0OO00O.ivDoubleReward, "x" + item.getRewardMultiple());
            }
            String strOooO0OO = o0000.OooO0OO(item.getName());
            if (item.getMaxNum() > 0 && item.getState() == 0) {
                strOooO0OO = strOooO0OO + "(" + item.getNum() + "/" + item.getMaxNum() + ")";
            }
            helper.setText(o0OO00O.tv_name_task, strOooO0OO);
            if (p595o0oo00O.OooOo00.OooO0o0()) {
                helper.setText(o0OO00O.tv_bonus_task, item.getRewardCoin() + "+");
            } else {
                helper.setText(o0OO00O.tv_bonus_task, "+" + item.getRewardCoin());
            }
            if (item.getRewardType() == 1) {
                helper.setImageResource(o0OO00O.ivReward, o0Oo0oo.icon_coin_main_slide);
                helper.setTextColor(o0OO00O.tv_bonus_task, o0000.OooO00o(o0OOO0o.color_coin));
            } else {
                helper.setImageResource(o0OO00O.ivReward, o0Oo0oo.icon_crystal_task_item_min);
                helper.setTextColor(o0OO00O.tv_bonus_task, o0000.OooO00o(o0OOO0o.color_crystal));
            }
            helper.setGone(o0OO00O.tv_bonus_task, item.getTakeId() != 37);
            helper.setGone(o0OO00O.ivDoubleReward, item.getTakeId() != 37);
            Button button = (Button) helper.getView(o0OO00O.bt_go);
            int state = item.getState();
            final oO0O00oO oo0o00oo = oO0O00oO.this;
            if (state == 0) {
                button.setEnabled(true);
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0o().getValue(), Boolean.TRUE)) {
                    int i = o000000.go_room_do_task;
                    String strOooO0OO2 = o0000.OooO0OO(i);
                    int i2 = o000000.Go;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO2, o0000.OooO0OO(i2), 0, false, 6, (Object) null);
                    SpannableString spannableString = new SpannableString(o0000.OooO0OO(i));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#00D8C9"));
                    if (iIndexOf$default >= 0) {
                        spannableString.setSpan(foregroundColorSpan, iIndexOf$default, o0000.OooO0OO(i2).length() + iIndexOf$default, 18);
                    }
                    oo0o00oo.OooOOO0().f44409OooO0Oo.setText(spannableString);
                } else {
                    oo0o00oo.OooOOO0().f44409OooO0Oo.setText(o0000.OooO0OO(o000000.go_favorite_rooms));
                }
                button.setEnabled(true);
                button.setBackgroundResource(o0Oo0oo.selector_btn_bg_green_line_gray_r360);
                button.setTextColor(o0000.OooO00o(o0OOO0o.color_00d8c9));
                button.setText(o0000.OooO0OO(o000000.Go));
                TextView tvContent = oo0o00oo.OooOOO0().f44409OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
                o000O.OooOOOO(tvContent);
            } else if (state != 1) {
                button.setEnabled(false);
                button.setBackgroundResource(o0Oo0oo.bgs_button_fff2f3f5_r360);
                button.setTextColor(o0000.OooO00o(o0OOO0o.color_999999));
                button.setText(o000000.task_Done);
            } else {
                button.setEnabled(true);
                button.setBackgroundResource(o0Oo0oo.selector_btn_bg_green_gray_r360);
                button.setTextColor(o0000.OooO00o(o0OOO0o.white));
                button.setText(o000000.Get);
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.oO0o0000
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SignTaskModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    oO0O00oO.OooOOOO this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    final oO0O00oO this$1 = oo0o00oo;
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    ViewHolder helper2 = helper;
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    int state2 = item2.getState();
                    boolean z = false;
                    if (state2 != 0) {
                        if (state2 != 1) {
                            return;
                        }
                        if (item2.getTakeId() == 35) {
                            OooO00o.OooO0OO("101077", MapsKt.mapOf(new Pair("type", 2)));
                        } else {
                            OooO00o.OooO0OO("101076", MapsKt.mapOf(new Pair("type", 2)));
                        }
                        int takeId = item2.getTakeId();
                        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.Button");
                        final Button button2 = (Button) view;
                        final String strValueOf = String.valueOf(item2.getRewardMultiple() * o0OoOo0.OooO0o(0, item2.getGetcrystal()));
                        final int layoutPosition = helper2.getLayoutPosition();
                        o00OO0O0<ApiResult<Long>> rewardCrystal = this$1.f58861OooOO0o.getRewardCrystal(takeId);
                        Context context = this$1.f58860OooOO0O;
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        rewardCrystal.observe((FragmentActivity) context, new Observer() { // from class: o0ooo.oO0O00O
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                StringBuilder sbOooO0O0;
                                ApiResult apiResult = (ApiResult) obj2;
                                Button view2 = button2;
                                Intrinsics.checkNotNullParameter(view2, "$view");
                                oO0O00oO this$2 = this$1;
                                Intrinsics.checkNotNullParameter(this$2, "this$0");
                                String crystal = strValueOf;
                                Intrinsics.checkNotNullParameter(crystal, "$crystal");
                                if (!apiResult.isSuccess() || apiResult.getData() == null) {
                                    this$2.OooOOOo();
                                    return;
                                }
                                view2.setEnabled(false);
                                view2.setText(o0000.OooO0OO(o000000.task_Done));
                                view2.setTextColor(o0000.OooO00o(o0OOO0o.white));
                                RecyclerView recyclerView = this$2.OooOOOO().f44923OooO0O0;
                                int i3 = layoutPosition;
                                if (recyclerView.getChildAt(i3) == null) {
                                    return;
                                }
                                TextView textView = (TextView) this$2.OooOOOO().f44923OooO0O0.getChildAt(i3).findViewById(o0OO00O.tv_anim_num_dialog);
                                if (OooOo00.OooO0o0()) {
                                    sbOooO0O0 = o000O0o.OooO0O0(crystal, "+");
                                } else {
                                    StringBuilder sb = new StringBuilder("+");
                                    sb.append(crystal);
                                    sbOooO0O0 = sb;
                                }
                                textView.setText(sbOooO0O0.toString());
                                LinearLayout linearLayout = (LinearLayout) this$2.OooOOOO().f44923OooO0O0.getChildAt(i3).findViewById(o0OO00O.ll_get_crystal_anim);
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setDuration(1200L);
                                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -2.0f);
                                translateAnimation.setDuration(1200L);
                                animationSet.addAnimation(alphaAnimation);
                                animationSet.addAnimation(translateAnimation);
                                animationSet.setAnimationListener(new oO0O0O0o(linearLayout));
                                linearLayout.startAnimation(animationSet);
                                linearLayout.setVisibility(0);
                                this$2.f58861OooOO0o.loadTaskListData(1, true);
                            }
                        });
                        return;
                    }
                    if (item2.getTakeId() == 35) {
                        OooO00o.OooO0OO("101077", MapsKt.mapOf(new Pair("type", 2)));
                        oO0oO000 notInstall = new oO0oO000(this$1);
                        oOo00o00 action = new oOo00o00(this$1);
                        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                        Intrinsics.checkNotNullParameter(action, "action");
                        Context context2 = o000O00O.f13421OooO00o;
                        Activity context3 = OooO0O0.OooO0O0();
                        if (context3 != null) {
                            Intrinsics.checkNotNullParameter(context3, "context");
                            try {
                                List<PackageInfo> installedPackages = context3.getPackageManager().getInstalledPackages(0);
                                Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
                                Iterator<T> it = installedPackages.iterator();
                                while (it.hasNext()) {
                                    String packageName = ((PackageInfo) it.next()).packageName;
                                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                                    if (StringsKt__StringsKt.contains(packageName, "com.yallatech.yallachat", true)) {
                                        z = true;
                                    }
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        if (z) {
                            action.invoke();
                            return;
                        } else {
                            notInstall.invoke();
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new Oooo0(null), 2, null);
                            return;
                        }
                    }
                    if (item2.getTakeId() == 37) {
                        o00000OO.o0Oo0oo o0oo0oo2 = o00000OO.f56675OooOOo0;
                        Context context4 = this$0.f13186OooOOOo;
                        Intrinsics.checkNotNull(context4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        o0oo0oo2.observe((FragmentActivity) context4, new oO0O00oO.OooOOO0(oO.f58765OooO0Oo));
                        this$1.OooO0O0();
                        return;
                    }
                    if (item2.getTakeId() == 38) {
                        int i3 = MomentSendActivity.f25726Oooo0OO;
                        Context context5 = this$0.f13186OooOOOo;
                        Intrinsics.checkNotNull(context5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        MomentSendActivity.OooO00o.OooO00o((FragmentActivity) context5);
                        this$1.OooO0O0();
                        return;
                    }
                    OooO00o.OooO0OO("101075", MapsKt.mapOf(new Pair("type", 2)));
                    this$1.getClass();
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    T value = o0O00oO0.OooOo0o().getValue();
                    Intrinsics.checkNotNull(value);
                    if (((Boolean) value).booleanValue()) {
                        o00OO0O0<ApiResult<RandomRoomModel>> randomRoomData = this$1.f58861OooOO0o.getRandomRoomData();
                        Context context6 = this$1.f58860OooOO0O;
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        randomRoomData.observe((FragmentActivity) context6, new oO0O00o0());
                    }
                    this$1.OooO0O0();
                    LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                }
            });
        }
    }

    public static final class OooOo extends Lambda implements Function0<ooOOOOoo> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ooOOOOoo invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            ooOOOOoo ooooooooInflate = ooOOOOoo.inflate(LayoutInflater.from(oo0o00oo.f58860OooOO0O), oo0o00oo.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(ooooooooInflate, "inflate(...)");
            return ooooooooInflate;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<View, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0oo0000.OooO00o.OooO0O0("101042");
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oo0o00oo.f58860OooOO0O.startActivity(new Intent(oo0o00oo.f58860OooOO0O, (Class<?>) TaskActivity.class));
            oo0o00oo.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<oO0OOo0o> {
        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0OOo0o invoke() {
            oO0O00oO oo0o00oo = oO0O00oO.this;
            oO0OOo0o oo0ooo0oInflate = oO0OOo0o.inflate(LayoutInflater.from(oo0o00oo.f58860OooOO0O), oo0o00oo.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(oo0ooo0oInflate, "inflate(...)");
            return oo0ooo0oInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O00oO(@NotNull Context mContext) {
        super(mContext, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f58860OooOO0O = mContext;
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) mContext;
        this.f58861OooOO0o = (SignTaskVM) new ViewModelProvider(fragmentActivity).get(SignTaskVM.class);
        this.f58863OooOOO0 = LazyKt.lazy(new OooOO0O());
        this.f58862OooOOO = LazyKt.lazy(new OooOo());
        this.f58864OooOOOO = LazyKt.lazy(new Oooo000());
        this.f58865OooOOOo = LazyKt.lazy(new OooO0o());
        this.f58867OooOOo0 = LazyKt.lazy(new OooO0OO());
        this.f58866OooOOo = mContext instanceof MainActivity;
        this.f58870OooOo00 = -1;
        Lazy lazy = LazyKt.lazy(new OooOO0());
        this.f58871OooOo0O = lazy;
        ConstraintLayout constraintLayout = OooOOO0().f44406OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f58872OooOo0o = (TaskViewModel) new ViewModelProvider(fragmentActivity).get(TaskViewModel.class);
        ImageView ivDismiss = OooOOO0().f44408OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooO0oo(ivDismiss, new OooO00o());
        ((OpenAuthManager) lazy.getValue()).f24267OooO0O0 = new OooO0O0();
    }

    public static final void OooOO0(oO0O00oO oo0o00oo, int i) {
        if (oo0o00oo.f58866OooOOo) {
            o0oo0000.OooO00o.OooO0O0("101038");
        } else {
            o0oo0000.OooO00o.OooO0O0("105061");
        }
        int i2 = oo0o00oo.f58870OooOo00;
        if (i2 != -1) {
            int i3 = 1;
            if (i == 0 || i2 + 1 == i) {
                SignTaskVM signTaskVM = oo0o00oo.f58861OooOO0o;
                if (signTaskVM.getHasSignInToday()) {
                    return;
                }
                oo0o00oo.OooOOO().f45336OooOooO.setEnabled(false);
                o00OO0O0<ApiResult<SignInModel>> o00oo0o0SignIn = signTaskVM.signIn();
                Context context = oo0o00oo.f58860OooOO0O;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                o00oo0o0SignIn.observe((FragmentActivity) context, new o0O0oo0o(i3, oo0o00oo));
            }
        }
    }

    public static final void OooOO0O(oO0O00oO oo0o00oo, int i) {
        oo0o00oo.f58870OooOo00 = i;
        ooOOOOoo ooooooooOooOOO = oo0o00oo.OooOOO();
        int i2 = oo0o00oo.f58869OooOo0;
        if (i2 > 1) {
            ooooooooOooOOO.f45307OooO.setText("x" + i2);
            ooooooooOooOOO.f45316OooOO0.setText(android.support.v4.media.OooO00o.OooO00o("x", oo0o00oo.f58869OooOo0));
            ooooooooOooOOO.f45317OooOO0O.setText(android.support.v4.media.OooO00o.OooO00o("x", oo0o00oo.f58869OooOo0));
            ooooooooOooOOO.f45318OooOO0o.setText(android.support.v4.media.OooO00o.OooO00o("x", oo0o00oo.f58869OooOo0));
            ooooooooOooOOO.f45320OooOOO0.setText(android.support.v4.media.OooO00o.OooO00o("x", oo0o00oo.f58869OooOo0));
            ooooooooOooOOO.f45319OooOOO.setText(android.support.v4.media.OooO00o.OooO00o("x", oo0o00oo.f58869OooOo0));
            ooooooooOooOOO.f45321OooOOOO.setText(android.support.v4.media.OooO00o.OooO00o("x", oo0o00oo.f58869OooOo0));
        }
        SignTaskVM signTaskVM = oo0o00oo.f58861OooOO0o;
        if (!signTaskVM.getHasSignInToday()) {
            switch (i) {
                case 0:
                    ImageView ivGet1 = ooooooooOooOOO.f45322OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet1, "ivGet1");
                    o000O.OooOOOO(ivGet1);
                    ooooooooOooOOO.f45307OooO.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
                case 1:
                    ImageView ivGet2 = ooooooooOooOOO.f45324OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet2, "ivGet2");
                    o000O.OooOOOO(ivGet2);
                    ooooooooOooOOO.f45316OooOO0.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
                case 2:
                    ImageView ivGet3 = ooooooooOooOOO.f45323OooOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet3, "ivGet3");
                    o000O.OooOOOO(ivGet3);
                    ooooooooOooOOO.f45317OooOO0O.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
                case 3:
                    ImageView ivGet4 = ooooooooOooOOO.f45325OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(ivGet4, "ivGet4");
                    o000O.OooOOOO(ivGet4);
                    ooooooooOooOOO.f45318OooOO0o.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
                case 4:
                    ImageView ivGet5 = ooooooooOooOOO.f45328OooOo00;
                    Intrinsics.checkNotNullExpressionValue(ivGet5, "ivGet5");
                    o000O.OooOOOO(ivGet5);
                    ooooooooOooOOO.f45320OooOOO0.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
                case 5:
                    ImageView ivGet6 = ooooooooOooOOO.f45327OooOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet6, "ivGet6");
                    o000O.OooOOOO(ivGet6);
                    ooooooooOooOOO.f45319OooOOO.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
                case 6:
                    ImageView ivGet7 = ooooooooOooOOO.f45329OooOo0O;
                    Intrinsics.checkNotNullExpressionValue(ivGet7, "ivGet7");
                    o000O.OooOOOO(ivGet7);
                    ooooooooOooOOO.f45321OooOOOO.setTextColor(o0000.OooO00o(o0OOO0o.white));
                    break;
            }
        }
        if (i > 0) {
            ImageView ivSigned1 = ooooooooOooOOO.f45330OooOo0o;
            Intrinsics.checkNotNullExpressionValue(ivSigned1, "ivSigned1");
            o000O.OooOOOO(ivSigned1);
        }
        if (i > 1) {
            ImageView ivSigned2 = ooooooooOooOOO.f45326OooOo;
            Intrinsics.checkNotNullExpressionValue(ivSigned2, "ivSigned2");
            o000O.OooOOOO(ivSigned2);
        }
        if (i > 2) {
            ImageView ivSigned3 = ooooooooOooOOO.f45332OooOoO0;
            Intrinsics.checkNotNullExpressionValue(ivSigned3, "ivSigned3");
            o000O.OooOOOO(ivSigned3);
        }
        if (i > 3) {
            ImageView ivSigned4 = ooooooooOooOOO.f45331OooOoO;
            Intrinsics.checkNotNullExpressionValue(ivSigned4, "ivSigned4");
            o000O.OooOOOO(ivSigned4);
        }
        if (i > 4) {
            ImageView ivSigned5 = ooooooooOooOOO.f45333OooOoOO;
            Intrinsics.checkNotNullExpressionValue(ivSigned5, "ivSigned5");
            o000O.OooOOOO(ivSigned5);
        }
        if (i > 5) {
            ImageView ivSigned6 = ooooooooOooOOO.f45335OooOoo0;
            Intrinsics.checkNotNullExpressionValue(ivSigned6, "ivSigned6");
            o000O.OooOOOO(ivSigned6);
        }
        if (i > 6) {
            ImageView ivSigned7 = ooooooooOooOOO.f45334OooOoo;
            Intrinsics.checkNotNullExpressionValue(ivSigned7, "ivSigned7");
            o000O.OooOOOO(ivSigned7);
        }
        ooooooooOooOOO.f45337OooOooo.setText(signTaskVM.getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(o000000.clock_in_tips), String.valueOf(i)), String.valueOf(i)));
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO() {
        super.OooO();
        OooOO0o();
        Observable<Object> observable = LiveEventBus.get("DISMISS_CLOCK_ICON");
        Context context = this.f58860OooOO0O;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        observable.observe((FragmentActivity) context, new oO0O000o(0, this));
    }

    @Override // p650o0ooo.o000OO00
    public final void OooO0O0() {
        super.OooO0O0();
        this.f58861OooOO0o.getHasSignInToday();
        if (this.f58866OooOOo) {
            o0oo0000.OooO00o.OooO0O0("101039");
        } else {
            o0oo0000.OooO00o.OooO0O0("105060");
        }
    }

    public final void OooOO0o() {
        NetworkStateUtil networkStateUtil = NetworkStateUtil.INSTANCE;
        Context applicationContext = this.f58507OooO0Oo.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (!networkStateUtil.isConnected(applicationContext)) {
            OooOOOo();
            return;
        }
        SignTaskVM signTaskVM = this.f58861OooOO0o;
        boolean z = this.f58866OooOOo;
        if (z && signTaskVM.getHasSignInToday()) {
            OooOOo0();
            return;
        }
        o0O000O o0o000oOooOOO0 = OooOOO0();
        ImageView ivDismiss = o0o000oOooOOO0.f44408OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooOOOO(ivDismiss);
        TextView tvContent = o0o000oOooOOO0.f44409OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000O.OooOOOO(tvContent);
        o0o000oOooOOO0.f44410OooO0o0.setText(o0000.OooO0OO(o000000.clock_in_title));
        tvContent.setText(o0000.OooO0OO(o000000.Sign_7_days_tips));
        LinearLayout linearLayout = o0o000oOooOOO0.f44407OooO0O0;
        linearLayout.removeAllViews();
        linearLayout.addView(OooOOO().f45308OooO00o);
        o00OO0O0<ApiResult<CheckInAddUpWeekModel>> o00oo0o0LoadSignDayData = signTaskVM.loadSignDayData();
        Context context = this.f58860OooOO0O;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        o00oo0o0LoadSignDayData.observe((FragmentActivity) context, new OooOOO0(new oOo0oooO(this)));
        ooOOOOoo ooooooooOooOOO = OooOOO();
        ooooooooOooOOO.f45336OooOooO.setText(signTaskVM.getHasSignInToday() ? o0000.OooO0OO(o000000.sign_in_today) : o0000.OooO0OO(o000000.clock_in_sign));
        boolean z2 = !signTaskVM.getHasSignInToday();
        StateButton signIn = ooooooooOooOOO.f45336OooOooO;
        signIn.setEnabled(z2);
        signIn.setPressed(!signTaskVM.getHasSignInToday());
        CardView flSignIn1 = ooooooooOooOOO.f45309OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flSignIn1, "flSignIn1");
        o000O.OooO0oo(flSignIn1, new oO0O0Oo0(this));
        CardView flSignIn2 = ooooooooOooOOO.f45310OooO0OO;
        Intrinsics.checkNotNullExpressionValue(flSignIn2, "flSignIn2");
        o000O.OooO0oo(flSignIn2, new oOo0o0oO(this));
        CardView flSignIn3 = ooooooooOooOOO.f45311OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn3, "flSignIn3");
        o000O.OooO0oo(flSignIn3, new ooOOO0Oo(this));
        CardView flSignIn4 = ooooooooOooOOO.f45313OooO0o0;
        Intrinsics.checkNotNullExpressionValue(flSignIn4, "flSignIn4");
        o000O.OooO0oo(flSignIn4, new ooOOO00O(this));
        CardView flSignIn5 = ooooooooOooOOO.f45312OooO0o;
        Intrinsics.checkNotNullExpressionValue(flSignIn5, "flSignIn5");
        o000O.OooO0oo(flSignIn5, new ooo0o(this));
        CardView flSignIn6 = ooooooooOooOOO.f45314OooO0oO;
        Intrinsics.checkNotNullExpressionValue(flSignIn6, "flSignIn6");
        o000O.OooO0oo(flSignIn6, new oO0OO00(this));
        CardView flSignIn7 = ooooooooOooOOO.f45315OooO0oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn7, "flSignIn7");
        o000O.OooO0oo(flSignIn7, new oO0OO0O(this));
        Intrinsics.checkNotNullExpressionValue(signIn, "signIn");
        o000O.OooO0oo(signIn, new oO0Oo0o0(this));
        if (!z || signTaskVM.getHasSignInToday()) {
            return;
        }
        o0oo0000.OooO00o.OooO0O0("301003");
    }

    public final ooOOOOoo OooOOO() {
        return (ooOOOOoo) this.f58862OooOOO.getValue();
    }

    public final o0O000O OooOOO0() {
        return (o0O000O) this.f58863OooOOO0.getValue();
    }

    public final oO0OOo0o OooOOOO() {
        return (oO0OOo0o) this.f58864OooOOOO.getValue();
    }

    public final void OooOOOo() {
        int i = o000000.not_network;
        String strOooO0OO = o0000.OooO0OO(i);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        ImageView ivDismiss = OooOOO0().f44408OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooO0OO(ivDismiss);
        TextView tvContent = OooOOO0().f44409OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000O.OooO0OO(tvContent);
        OooOOO0().f44410OooO0o0.setText(o0000.OooO0OO(i));
        OooOOO0().f44407OooO0O0.removeAllViews();
        LinearLayout linearLayout = OooOOO0().f44407OooO0O0;
        Lazy lazy = this.f58865OooOOOo;
        linearLayout.addView(((oO000OOo) lazy.getValue()).f44772OooO00o);
        StateButton tvTryAgain = ((oO000OOo) lazy.getValue()).f44773OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tvTryAgain, "tvTryAgain");
        o000O.OooO0oo(tvTryAgain, new OooO());
    }

    public final void OooOOo0() {
        ImageView ivDismiss = OooOOO0().f44408OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooOOOO(ivDismiss);
        OooOOO0().f44407OooO0O0.removeAllViews();
        OooOOO0().f44407OooO0O0.addView(OooOOOO().f44922OooO00o);
        OooOOO0().f44410OooO0o0.setText(o0000.OooO0OO(o000000.dialog_task));
        TextView tvContent = OooOOO0().f44409OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000O.OooO0OO(tvContent);
        RecyclerView recyclerView = OooOOOO().f44923OooO0O0;
        Context context = this.f58860OooOO0O;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(context));
        this.f58868OooOOoo = new OooOOOO(context, oo0o0Oo.main_clock_dialog_task_item);
        RecyclerView recyclerView2 = OooOOOO().f44923OooO0O0;
        OooOOOO oooOOOO = this.f58868OooOOoo;
        if (oooOOOO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooOOOO = null;
        }
        recyclerView2.setAdapter(oooOOOO);
        TextView tvMoraTask = OooOOOO().f44924OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tvMoraTask, "tvMoraTask");
        o000O.OooO0oo(tvMoraTask, new OooOo00());
        o00OO0O0 o00oo0o0LoadTaskListData$default = SignTaskVM.loadTaskListData$default(this.f58861OooOO0o, 1, false, 2, null);
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        o00oo0o0LoadTaskListData$default.observe((FragmentActivity) context, new oO0O00(this));
    }
}
