package p675oO0Oo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
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
import com.common.support.networkstate.NetworkStateUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.main.SignTaskVM;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import com.yalla.yalla.util.Function.OooO00o;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOo0.o000O0o;
import p386o0OOoo0O.o0OoOo0;
import p407o0Oo0OOO.o0O000O;
import p407o0Oo0OOO.oO000OOo;
import p407o0Oo0OOO.oO000Oo0;
import p407o0Oo0OOO.oO0OOo0o;
import p407o0Oo0OOO.ooOOOOoo;
import p426o0OoO0Oo.o00OO00O;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0Oo0oo;
import p565o0oOo000.o0ooOOo;
import p565o0oOo000.oo000o;
import p570o0oOo0o.o000O0;
import p585o0oOoo00.o00000OO;
import p593o0oOoooO.h0;
import p596o0oo000O.OooO0o;
import p607o0oo0O0O.o0O0OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class O0OO00 extends o0oO0Ooo {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Context f58989OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final SignTaskVM f58990OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f58991OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f58992OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f58993OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f58994OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f58995OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f58996OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooOOOO f58997OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f58998OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f58999OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f59000OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final TaskViewModel f59001OooOo0o;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            h0.OooO0O0("101074");
            O0OO00.this.OooOO0o();
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
            O0OO00.this.OooO0O0();
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
            O0OO00 o0oo00 = O0OO00.this;
            o0oo00.f59001OooOo0o.yallaChatBindTask(accessToken).observe(o0oo00.f59574OooO0o0, new o0OoOo0(new a(o0oo00), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oO000OOo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO000OOo invoke() {
            O0OO00 o0oo00 = O0OO00.this;
            oO000OOo oo000oooInflate = oO000OOo.inflate(LayoutInflater.from(o0oo00.f58989OooOO0O), o0oo00.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(oo000oooInflate, "inflate(...)");
            return oo000oooInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<ooOOOOoo> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ooOOOOoo invoke() {
            O0OO00 o0oo00 = O0OO00.this;
            ooOOOOoo ooooooooInflate = ooOOOOoo.inflate(LayoutInflater.from(o0oo00.f58989OooOO0O), o0oo00.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(ooooooooInflate, "inflate(...)");
            return ooooooooInflate;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OpenAuthManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            Context context = O0OO00.this.f58989OooOO0O;
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
            O0OO00 o0oo00 = O0OO00.this;
            o0O000O o0o000oInflate = o0O000O.inflate(LayoutInflater.from(o0oo00.f58989OooOO0O), o0oo00.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(o0o000oInflate, "inflate(...)");
            return o0o000oInflate;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.dialog.MainDialogClock$show$1$1", f = "MainDialogClock.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f59009OooO0Oo;

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
            int i = this.f59009OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f59009OooO0Oo = 1;
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
        public final /* synthetic */ Function1 f59010OooO0Oo;

        public OooOOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f59010OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f59010OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f59010OooO0Oo;
        }

        public final int hashCode() {
            return this.f59010OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59010OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOOO extends o000O0<SignTaskModel> {
        public OooOOOO(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            final ViewHolder helper = (ViewHolder) baseViewHolder;
            final SignTaskModel item = (SignTaskModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setImageResource(o0Oo0oo.iv_icon_task, item.getIcon());
            if (item.getRewardMultiple() > 1) {
                helper.setText(o0Oo0oo.ivDoubleReward, "x" + item.getRewardMultiple());
            }
            String strOooO0OO = o0000.OooO0OO(item.getName());
            if (item.getMaxNum() > 0 && item.getState() == 0) {
                strOooO0OO = strOooO0OO + "(" + item.getNum() + "/" + item.getMaxNum() + ")";
            }
            helper.setText(o0Oo0oo.tv_name_task, strOooO0OO);
            if (p596o0oo000O.OooO0o.OooO0o0()) {
                helper.setText(o0Oo0oo.tv_bonus_task, item.getRewardCoin() + "+");
            } else {
                helper.setText(o0Oo0oo.tv_bonus_task, "+" + item.getRewardCoin());
            }
            if (item.getRewardType() == 1) {
                helper.setImageResource(o0Oo0oo.ivReward, o0OOO0o.icon_coin_main_slide);
                helper.setTextColor(o0Oo0oo.tv_bonus_task, o0000.OooO00o(o0ooOOo.color_coin));
            } else {
                helper.setImageResource(o0Oo0oo.ivReward, o0OOO0o.icon_crystal_task_item_min);
                helper.setTextColor(o0Oo0oo.tv_bonus_task, o0000.OooO00o(o0ooOOo.color_crystal));
            }
            helper.setGone(o0Oo0oo.tv_bonus_task, item.getTakeId() != 37);
            helper.setGone(o0Oo0oo.ivDoubleReward, item.getTakeId() != 37);
            Button button = (Button) helper.getView(o0Oo0oo.bt_go);
            int state = item.getState();
            final O0OO00 o0oo00 = O0OO00.this;
            if (state == 0) {
                button.setEnabled(true);
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                if (Intrinsics.areEqual(oo0oO0.OooOo0o().getValue(), Boolean.TRUE)) {
                    int i = o000OOo.go_room_do_task;
                    String strOooO0OO2 = o0000.OooO0OO(i);
                    int i2 = o000OOo.Go;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO2, o0000.OooO0OO(i2), 0, false, 6, (Object) null);
                    SpannableString spannableString = new SpannableString(o0000.OooO0OO(i));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#00D8C9"));
                    if (iIndexOf$default >= 0) {
                        spannableString.setSpan(foregroundColorSpan, iIndexOf$default, o0000.OooO0OO(i2).length() + iIndexOf$default, 18);
                    }
                    o0oo00.OooOOO0().f44416OooO0Oo.setText(spannableString);
                } else {
                    o0oo00.OooOOO0().f44416OooO0Oo.setText(o0000.OooO0OO(o000OOo.go_favorite_rooms));
                }
                button.setEnabled(true);
                button.setBackgroundResource(o0OOO0o.selector_btn_bg_green_line_gray_r360);
                button.setTextColor(o0000.OooO00o(o0ooOOo.color_00d8c9));
                button.setText(o0000.OooO0OO(o000OOo.Go));
                TextView tvContent = o0oo00.OooOOO0().f44416OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
                o000O.OooOOOO(tvContent);
            } else if (state != 1) {
                button.setEnabled(false);
                button.setBackgroundResource(o0OOO0o.bgs_button_fff2f3f5_r360);
                button.setTextColor(o0000.OooO00o(o0ooOOo.color_999999));
                button.setText(o000OOo.task_Done);
            } else {
                button.setEnabled(true);
                button.setBackgroundResource(o0OOO0o.selector_btn_bg_green_gray_r360);
                button.setTextColor(o0000.OooO00o(o0ooOOo.white));
                button.setText(o000OOo.Get);
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: oO0Oo.l
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SignTaskModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    O0OO00.OooOOOO this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    final O0OO00 this$1 = o0oo00;
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
                            h0.OooO0OO("101077", MapsKt.mapOf(new Pair("type", 2)));
                        } else {
                            h0.OooO0OO("101076", MapsKt.mapOf(new Pair("type", 2)));
                        }
                        int takeId = item2.getTakeId();
                        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.Button");
                        final Button button2 = (Button) view;
                        final String strValueOf = String.valueOf(item2.getRewardMultiple() * com.code.android.util.o0OoOo0.OooO0o(0, item2.getGetcrystal()));
                        final int layoutPosition = helper2.getLayoutPosition();
                        o00OO00O<ApiResult<Long>> rewardCrystal = this$1.f58990OooOO0o.getRewardCrystal(takeId);
                        Context context = this$1.f58989OooOO0O;
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        rewardCrystal.observe((FragmentActivity) context, new Observer() { // from class: oO0Oo.O0000000
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                StringBuilder sbOooO0O0;
                                ApiResult apiResult = (ApiResult) obj2;
                                Button view2 = button2;
                                Intrinsics.checkNotNullParameter(view2, "$view");
                                O0OO00 this$2 = this$1;
                                Intrinsics.checkNotNullParameter(this$2, "this$0");
                                String crystal = strValueOf;
                                Intrinsics.checkNotNullParameter(crystal, "$crystal");
                                if (!apiResult.isSuccess() || apiResult.getData() == null) {
                                    this$2.OooOOOo();
                                    return;
                                }
                                view2.setEnabled(false);
                                view2.setText(o0000.OooO0OO(o000OOo.task_Done));
                                view2.setTextColor(o0000.OooO00o(o0ooOOo.white));
                                RecyclerView recyclerView = this$2.OooOOOO().f44778OooO0O0;
                                int i3 = layoutPosition;
                                if (recyclerView.getChildAt(i3) == null) {
                                    return;
                                }
                                TextView textView = (TextView) this$2.OooOOOO().f44778OooO0O0.getChildAt(i3).findViewById(o0Oo0oo.tv_anim_num_dialog);
                                if (OooO0o.OooO0o0()) {
                                    sbOooO0O0 = o000O0o.OooO0O0(crystal, "+");
                                } else {
                                    StringBuilder sb = new StringBuilder("+");
                                    sb.append(crystal);
                                    sbOooO0O0 = sb;
                                }
                                textView.setText(sbOooO0O0.toString());
                                LinearLayout linearLayout = (LinearLayout) this$2.OooOOOO().f44778OooO0O0.getChildAt(i3).findViewById(o0Oo0oo.ll_get_crystal_anim);
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setDuration(1200L);
                                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -2.0f);
                                translateAnimation.setDuration(1200L);
                                animationSet.addAnimation(alphaAnimation);
                                animationSet.addAnimation(translateAnimation);
                                animationSet.setAnimationListener(new b(linearLayout));
                                linearLayout.startAnimation(animationSet);
                                linearLayout.setVisibility(0);
                                this$2.f58990OooOO0o.loadTaskListData(1, true);
                            }
                        });
                        return;
                    }
                    if (item2.getTakeId() == 35) {
                        h0.OooO0OO("101077", MapsKt.mapOf(new Pair("type", 2)));
                        m notInstall = new m(this$1);
                        n action = new n(this$1);
                        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                        Intrinsics.checkNotNullParameter(action, "action");
                        Context context2 = o000O00O.f13430OooO00o;
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
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0O0OO0(null), 2, null);
                            return;
                        }
                    }
                    if (item2.getTakeId() == 37) {
                        o00000OO.o0Oo0oo o0oo0oo2 = o00000OO.f56632OooOOo0;
                        Context context4 = this$0.f13197OooOOOo;
                        Intrinsics.checkNotNull(context4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        o0oo0oo2.observe((FragmentActivity) context4, new O0OO00.OooOOO0(p.f59890OooO0Oo));
                        this$1.OooO0O0();
                        return;
                    }
                    if (item2.getTakeId() == 38) {
                        int i3 = MomentSendActivity.f25728Oooo0OO;
                        Context context5 = this$0.f13197OooOOOo;
                        Intrinsics.checkNotNull(context5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        MomentSendActivity.OooO00o.OooO00o((FragmentActivity) context5);
                        this$1.OooO0O0();
                        return;
                    }
                    h0.OooO0OO("101075", MapsKt.mapOf(new Pair("type", 2)));
                    this$1.getClass();
                    oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                    T value = oo0oO0.OooOo0o().getValue();
                    Intrinsics.checkNotNull(value);
                    if (((Boolean) value).booleanValue()) {
                        o00OO00O<ApiResult<RandomRoomModel>> randomRoomData = this$1.f58990OooOO0o.getRandomRoomData();
                        Context context6 = this$1.f58989OooOO0O;
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        randomRoomData.observe((FragmentActivity) context6, new O0O0());
                    }
                    this$1.OooO0O0();
                    LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                }
            });
        }
    }

    public static final class OooOo extends Lambda implements Function0<oO0OOo0o> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0OOo0o invoke() {
            O0OO00 o0oo00 = O0OO00.this;
            oO0OOo0o oo0ooo0oInflate = oO0OOo0o.inflate(LayoutInflater.from(o0oo00.f58989OooOO0O), o0oo00.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(oo0ooo0oInflate, "inflate(...)");
            return oo0ooo0oInflate;
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
            h0.OooO0O0("101042");
            O0OO00 o0oo00 = O0OO00.this;
            o0oo00.f58989OooOO0O.startActivity(new Intent(o0oo00.f58989OooOO0O, (Class<?>) TaskActivity.class));
            o0oo00.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<oO000Oo0> {
        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO000Oo0 invoke() {
            O0OO00 o0oo00 = O0OO00.this;
            oO000Oo0 oo000oo0Inflate = oO000Oo0.inflate(LayoutInflater.from(o0oo00.f58989OooOO0O), o0oo00.f59573OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(oo000oo0Inflate, "inflate(...)");
            return oo000oo0Inflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0OO00(@NotNull Context mContext) {
        super(mContext, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f58989OooOO0O = mContext;
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) mContext;
        this.f58990OooOO0o = (SignTaskVM) new ViewModelProvider(fragmentActivity).get(SignTaskVM.class);
        this.f58992OooOOO0 = LazyKt.lazy(new OooOO0O());
        this.f58991OooOOO = LazyKt.lazy(new OooOo());
        this.f58993OooOOOO = LazyKt.lazy(new Oooo000());
        this.f58994OooOOOo = LazyKt.lazy(new OooO0o());
        this.f58996OooOOo0 = LazyKt.lazy(new OooO0OO());
        this.f58995OooOOo = mContext instanceof MainActivity;
        this.f58999OooOo00 = -1;
        Lazy lazy = LazyKt.lazy(new OooOO0());
        this.f59000OooOo0O = lazy;
        ConstraintLayout constraintLayout = OooOOO0().f44413OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f59001OooOo0o = (TaskViewModel) new ViewModelProvider(fragmentActivity).get(TaskViewModel.class);
        ImageView ivDismiss = OooOOO0().f44415OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooO0oo(ivDismiss, new OooO00o());
        ((OpenAuthManager) lazy.getValue()).f24277OooO0O0 = new OooO0O0();
    }

    public static final void OooOO0(final O0OO00 o0oo00, int i) {
        if (o0oo00.f58995OooOOo) {
            h0.OooO0O0("101038");
        } else {
            h0.OooO0O0("105061");
        }
        int i2 = o0oo00.f58999OooOo00;
        if (i2 != -1) {
            if (i == 0 || i2 + 1 == i) {
                SignTaskVM signTaskVM = o0oo00.f58990OooOO0o;
                if (signTaskVM.getHasSignInToday()) {
                    return;
                }
                o0oo00.OooOOO().f44943OooOooO.setEnabled(false);
                o00OO00O<ApiResult<SignInModel>> o00oo00oSignIn = signTaskVM.signIn();
                Context context = o0oo00.f58989OooOO0O;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                o00oo00oSignIn.observe((FragmentActivity) context, new Observer() { // from class: oO0Oo.oo00
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        ApiResult apiResult = (ApiResult) obj;
                        O0OO00 this$0 = this.f59849OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        if (!apiResult.isSuccess() || apiResult.getData() == null) {
                            if (this$0.f58995OooOOo) {
                                h0.OooO0O0("201018");
                            } else {
                                h0.OooO0O0("205008");
                            }
                            ApiError error = apiResult.getError();
                            if (error != null && 1090 == error.getCode()) {
                                this$0.OooOOo0();
                                return;
                            } else {
                                if (((FragmentActivity) this$0.f58989OooOO0O).isFinishing()) {
                                    return;
                                }
                                this$0.OooOOOo();
                                return;
                            }
                        }
                        if (this$0.f58995OooOOo) {
                            h0.OooO0O0("201017");
                        } else {
                            h0.OooO0O0("205006");
                        }
                        Object data = apiResult.getData();
                        Intrinsics.checkNotNull(data);
                        SignInModel signInModel = (SignInModel) data;
                        ConstraintLayout constraintLayout = this$0.OooOOO().f44915OooO00o;
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                        o000O.OooO0OO(constraintLayout);
                        this$0.OooOOO0().f44414OooO0O0.removeAllViews();
                        LinearLayout linearLayout = this$0.OooOOO0().f44414OooO0O0;
                        Lazy lazy = this$0.f58996OooOOo0;
                        linearLayout.addView(((oO000OOo) lazy.getValue()).f44768OooO00o);
                        oO000OOo oo000ooo = (oO000OOo) lazy.getValue();
                        SignTaskVM signTaskVM2 = this$0.f58990OooOO0o;
                        if (signInModel != null) {
                            if (signInModel.getChangeCoin() == 0) {
                                ImageView ivCoin = oo000ooo.f44770OooO0OO;
                                Intrinsics.checkNotNullExpressionValue(ivCoin, "ivCoin");
                                o000O.OooO0O0(ivCoin);
                            } else {
                                ImageView ivCoin2 = oo000ooo.f44770OooO0OO;
                                Intrinsics.checkNotNullExpressionValue(ivCoin2, "ivCoin");
                                o000O.OooOOOO(ivCoin2);
                            }
                            if (signInModel.getChangeCrystal() == 0) {
                                ImageView ivCrystal = oo000ooo.f44771OooO0Oo;
                                Intrinsics.checkNotNullExpressionValue(ivCrystal, "ivCrystal");
                                o000O.OooO0O0(ivCrystal);
                            } else {
                                ImageView ivCrystal2 = oo000ooo.f44771OooO0Oo;
                                Intrinsics.checkNotNullExpressionValue(ivCrystal2, "ivCrystal");
                                o000O.OooOOOO(ivCrystal2);
                            }
                            oo000ooo.f44772OooO0o0.setText(signTaskVM2.getGoldCrystalTips(signInModel));
                        }
                        new OooO00o(oo000o.sign_caizhi, 32, this$0.f58989OooOO0O, oo000ooo.f44769OooO0O0, false).f32268OooO0O0 = new q(oo000ooo, this$0);
                        SignTaskVM.loadTaskListData$default(signTaskVM2, 1, false, 2, null);
                        Object data2 = apiResult.getData();
                        Intrinsics.checkNotNull(data2);
                        if (Intrinsics.areEqual(((SignInModel) data2).isPopup(), "1")) {
                            g2 g2Var = new g2(this$0.f58989OooOO0O);
                            String strOooO0OO = o0000.OooO0OO(o000OOo.enjoying_yalla);
                            TextView textView = g2Var.f59159OooOO0O;
                            if (textView != null) {
                                textView.setText("");
                                g2Var.f59159OooOO0O.setVisibility(8);
                                if (!TextUtils.isEmpty(strOooO0OO)) {
                                    g2Var.f59159OooOO0O.setText(strOooO0OO);
                                    g2Var.f59159OooOO0O.setVisibility(0);
                                }
                            }
                            String strOooO0OO2 = o0000.OooO0OO(o000OOo.tap_a_star_to_rate_it);
                            TextView textView2 = g2Var.f59160OooOO0o;
                            if (textView2 != null) {
                                textView2.setText("");
                                g2Var.f59160OooOO0o.setVisibility(8);
                                if (!TextUtils.isEmpty(strOooO0OO2)) {
                                    g2Var.f59160OooOO0o.setText(strOooO0OO2);
                                    g2Var.f59160OooOO0o.setVisibility(0);
                                }
                            }
                            g2Var.show();
                        }
                    }
                });
            }
        }
    }

    public static final void OooOO0O(O0OO00 o0oo00, int i) {
        o0oo00.f58999OooOo00 = i;
        oO0OOo0o oo0ooo0oOooOOO = o0oo00.OooOOO();
        int i2 = o0oo00.f58998OooOo0;
        if (i2 > 1) {
            oo0ooo0oOooOOO.f44914OooO.setText("x" + i2);
            oo0ooo0oOooOOO.f44923OooOO0.setText(android.support.v4.media.OooO00o.OooO00o("x", o0oo00.f58998OooOo0));
            oo0ooo0oOooOOO.f44924OooOO0O.setText(android.support.v4.media.OooO00o.OooO00o("x", o0oo00.f58998OooOo0));
            oo0ooo0oOooOOO.f44925OooOO0o.setText(android.support.v4.media.OooO00o.OooO00o("x", o0oo00.f58998OooOo0));
            oo0ooo0oOooOOO.f44927OooOOO0.setText(android.support.v4.media.OooO00o.OooO00o("x", o0oo00.f58998OooOo0));
            oo0ooo0oOooOOO.f44926OooOOO.setText(android.support.v4.media.OooO00o.OooO00o("x", o0oo00.f58998OooOo0));
            oo0ooo0oOooOOO.f44928OooOOOO.setText(android.support.v4.media.OooO00o.OooO00o("x", o0oo00.f58998OooOo0));
        }
        SignTaskVM signTaskVM = o0oo00.f58990OooOO0o;
        if (!signTaskVM.getHasSignInToday()) {
            switch (i) {
                case 0:
                    ImageView ivGet1 = oo0ooo0oOooOOO.f44929OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet1, "ivGet1");
                    o000O.OooOOOO(ivGet1);
                    oo0ooo0oOooOOO.f44914OooO.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
                case 1:
                    ImageView ivGet2 = oo0ooo0oOooOOO.f44931OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet2, "ivGet2");
                    o000O.OooOOOO(ivGet2);
                    oo0ooo0oOooOOO.f44923OooOO0.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
                case 2:
                    ImageView ivGet3 = oo0ooo0oOooOOO.f44930OooOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet3, "ivGet3");
                    o000O.OooOOOO(ivGet3);
                    oo0ooo0oOooOOO.f44924OooOO0O.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
                case 3:
                    ImageView ivGet4 = oo0ooo0oOooOOO.f44932OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(ivGet4, "ivGet4");
                    o000O.OooOOOO(ivGet4);
                    oo0ooo0oOooOOO.f44925OooOO0o.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
                case 4:
                    ImageView ivGet5 = oo0ooo0oOooOOO.f44935OooOo00;
                    Intrinsics.checkNotNullExpressionValue(ivGet5, "ivGet5");
                    o000O.OooOOOO(ivGet5);
                    oo0ooo0oOooOOO.f44927OooOOO0.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
                case 5:
                    ImageView ivGet6 = oo0ooo0oOooOOO.f44934OooOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet6, "ivGet6");
                    o000O.OooOOOO(ivGet6);
                    oo0ooo0oOooOOO.f44926OooOOO.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
                case 6:
                    ImageView ivGet7 = oo0ooo0oOooOOO.f44936OooOo0O;
                    Intrinsics.checkNotNullExpressionValue(ivGet7, "ivGet7");
                    o000O.OooOOOO(ivGet7);
                    oo0ooo0oOooOOO.f44928OooOOOO.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    break;
            }
        }
        if (i > 0) {
            ImageView ivSigned1 = oo0ooo0oOooOOO.f44937OooOo0o;
            Intrinsics.checkNotNullExpressionValue(ivSigned1, "ivSigned1");
            o000O.OooOOOO(ivSigned1);
        }
        if (i > 1) {
            ImageView ivSigned2 = oo0ooo0oOooOOO.f44933OooOo;
            Intrinsics.checkNotNullExpressionValue(ivSigned2, "ivSigned2");
            o000O.OooOOOO(ivSigned2);
        }
        if (i > 2) {
            ImageView ivSigned3 = oo0ooo0oOooOOO.f44939OooOoO0;
            Intrinsics.checkNotNullExpressionValue(ivSigned3, "ivSigned3");
            o000O.OooOOOO(ivSigned3);
        }
        if (i > 3) {
            ImageView ivSigned4 = oo0ooo0oOooOOO.f44938OooOoO;
            Intrinsics.checkNotNullExpressionValue(ivSigned4, "ivSigned4");
            o000O.OooOOOO(ivSigned4);
        }
        if (i > 4) {
            ImageView ivSigned5 = oo0ooo0oOooOOO.f44940OooOoOO;
            Intrinsics.checkNotNullExpressionValue(ivSigned5, "ivSigned5");
            o000O.OooOOOO(ivSigned5);
        }
        if (i > 5) {
            ImageView ivSigned6 = oo0ooo0oOooOOO.f44942OooOoo0;
            Intrinsics.checkNotNullExpressionValue(ivSigned6, "ivSigned6");
            o000O.OooOOOO(ivSigned6);
        }
        if (i > 6) {
            ImageView ivSigned7 = oo0ooo0oOooOOO.f44941OooOoo;
            Intrinsics.checkNotNullExpressionValue(ivSigned7, "ivSigned7");
            o000O.OooOOOO(ivSigned7);
        }
        oo0ooo0oOooOOO.f44944OooOooo.setText(signTaskVM.getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(o000OOo.clock_in_tips), String.valueOf(i)), String.valueOf(i)));
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO() {
        super.OooO();
        OooOO0o();
        Observable<Object> observable = LiveEventBus.get("DISMISS_CLOCK_ICON");
        Context context = this.f58989OooOO0O;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        observable.observe((FragmentActivity) context, new oOo0o00(0, this));
    }

    @Override // p675oO0Oo.o0oO0Ooo
    public final void OooO0O0() {
        super.OooO0O0();
        this.f58990OooOO0o.getHasSignInToday();
        if (this.f58995OooOOo) {
            h0.OooO0O0("101039");
        } else {
            h0.OooO0O0("105060");
        }
    }

    public final void OooOO0o() {
        NetworkStateUtil networkStateUtil = NetworkStateUtil.INSTANCE;
        Context applicationContext = this.f59572OooO0Oo.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (!networkStateUtil.isConnected(applicationContext)) {
            OooOOOo();
            return;
        }
        SignTaskVM signTaskVM = this.f58990OooOO0o;
        boolean z = this.f58995OooOOo;
        if (z && signTaskVM.getHasSignInToday()) {
            OooOOo0();
            return;
        }
        o0O000O o0o000oOooOOO0 = OooOOO0();
        ImageView ivDismiss = o0o000oOooOOO0.f44415OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooOOOO(ivDismiss);
        TextView tvContent = o0o000oOooOOO0.f44416OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000O.OooOOOO(tvContent);
        o0o000oOooOOO0.f44417OooO0o0.setText(o0000.OooO0OO(o000OOo.clock_in_title));
        tvContent.setText(o0000.OooO0OO(o000OOo.Sign_7_days_tips));
        LinearLayout linearLayout = o0o000oOooOOO0.f44414OooO0O0;
        linearLayout.removeAllViews();
        linearLayout.addView(OooOOO().f44915OooO00o);
        o00OO00O<ApiResult<CheckInAddUpWeekModel>> o00oo00oLoadSignDayData = signTaskVM.loadSignDayData();
        Context context = this.f58989OooOO0O;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        o00oo00oLoadSignDayData.observe((FragmentActivity) context, new OooOOO0(new c(this)));
        oO0OOo0o oo0ooo0oOooOOO = OooOOO();
        oo0ooo0oOooOOO.f44943OooOooO.setText(signTaskVM.getHasSignInToday() ? o0000.OooO0OO(o000OOo.sign_in_today) : o0000.OooO0OO(o000OOo.clock_in_sign));
        boolean z2 = !signTaskVM.getHasSignInToday();
        StateButton signIn = oo0ooo0oOooOOO.f44943OooOooO;
        signIn.setEnabled(z2);
        signIn.setPressed(!signTaskVM.getHasSignInToday());
        CardView flSignIn1 = oo0ooo0oOooOOO.f44916OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flSignIn1, "flSignIn1");
        o000O.OooO0oo(flSignIn1, new d(this));
        CardView flSignIn2 = oo0ooo0oOooOOO.f44917OooO0OO;
        Intrinsics.checkNotNullExpressionValue(flSignIn2, "flSignIn2");
        o000O.OooO0oo(flSignIn2, new e(this));
        CardView flSignIn3 = oo0ooo0oOooOOO.f44918OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn3, "flSignIn3");
        o000O.OooO0oo(flSignIn3, new f(this));
        CardView flSignIn4 = oo0ooo0oOooOOO.f44920OooO0o0;
        Intrinsics.checkNotNullExpressionValue(flSignIn4, "flSignIn4");
        o000O.OooO0oo(flSignIn4, new g(this));
        CardView flSignIn5 = oo0ooo0oOooOOO.f44919OooO0o;
        Intrinsics.checkNotNullExpressionValue(flSignIn5, "flSignIn5");
        o000O.OooO0oo(flSignIn5, new h(this));
        CardView flSignIn6 = oo0ooo0oOooOOO.f44921OooO0oO;
        Intrinsics.checkNotNullExpressionValue(flSignIn6, "flSignIn6");
        o000O.OooO0oo(flSignIn6, new i(this));
        CardView flSignIn7 = oo0ooo0oOooOOO.f44922OooO0oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn7, "flSignIn7");
        o000O.OooO0oo(flSignIn7, new j(this));
        Intrinsics.checkNotNullExpressionValue(signIn, "signIn");
        o000O.OooO0oo(signIn, new k(this));
        if (!z || signTaskVM.getHasSignInToday()) {
            return;
        }
        h0.OooO0O0("301003");
    }

    public final oO0OOo0o OooOOO() {
        return (oO0OOo0o) this.f58991OooOOO.getValue();
    }

    public final o0O000O OooOOO0() {
        return (o0O000O) this.f58992OooOOO0.getValue();
    }

    public final oO000Oo0 OooOOOO() {
        return (oO000Oo0) this.f58993OooOOOO.getValue();
    }

    public final void OooOOOo() {
        int i = o000OOo.not_network;
        String strOooO0OO = o0000.OooO0OO(i);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
            }
        }
        ImageView ivDismiss = OooOOO0().f44415OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooO0OO(ivDismiss);
        TextView tvContent = OooOOO0().f44416OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000O.OooO0OO(tvContent);
        OooOOO0().f44417OooO0o0.setText(o0000.OooO0OO(i));
        OooOOO0().f44414OooO0O0.removeAllViews();
        LinearLayout linearLayout = OooOOO0().f44414OooO0O0;
        Lazy lazy = this.f58994OooOOOo;
        linearLayout.addView(((ooOOOOoo) lazy.getValue()).f45318OooO00o);
        StateButton tvTryAgain = ((ooOOOOoo) lazy.getValue()).f45319OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tvTryAgain, "tvTryAgain");
        o000O.OooO0oo(tvTryAgain, new OooO());
    }

    public final void OooOOo0() {
        ImageView ivDismiss = OooOOO0().f44415OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000O.OooOOOO(ivDismiss);
        OooOOO0().f44414OooO0O0.removeAllViews();
        OooOOO0().f44414OooO0O0.addView(OooOOOO().f44777OooO00o);
        OooOOO0().f44417OooO0o0.setText(o0000.OooO0OO(o000OOo.dialog_task));
        TextView tvContent = OooOOO0().f44416OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000O.OooO0OO(tvContent);
        RecyclerView recyclerView = OooOOOO().f44778OooO0O0;
        Context context = this.f58989OooOO0O;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(context));
        this.f58997OooOOoo = new OooOOOO(context, o0OO00O.main_clock_dialog_task_item);
        RecyclerView recyclerView2 = OooOOOO().f44778OooO0O0;
        OooOOOO oooOOOO = this.f58997OooOOoo;
        if (oooOOOO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooOOOO = null;
        }
        recyclerView2.setAdapter(oooOOOO);
        TextView tvMoraTask = OooOOOO().f44779OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tvMoraTask, "tvMoraTask");
        o000O.OooO0oo(tvMoraTask, new OooOo00());
        o00OO00O o00oo00oLoadTaskListData$default = SignTaskVM.loadTaskListData$default(this.f58990OooOO0o, 1, false, 2, null);
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        o00oo00oLoadTaskListData$default.observe((FragmentActivity) context, new oo000000(this));
    }
}
