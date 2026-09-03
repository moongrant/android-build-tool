package p581o0oOoOOo;

import android.content.Context;
import android.content.Intent;
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
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.support.statebutton.StateButton;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.TaskModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.SignTaskVM;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import p143o00OOooO.o00oO0o;
import p143o00OOooO.o0OOO0o;
import p143o00OOooO.o0ooOOo;
import p143o00OOooO.oo0o0Oo;
import p169o00Ooo0.oo000o;
import p189o00o00o0.OooO0o;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p497o0o00OOO.Oooo0;
import p504o0o00o0.o00000O;
import p520o0o0O00o.o000O00;
import p520o0o0O00o.o000Oo0;
import p625o0oo0oO0.o0000O0;
import p651o0ooOOoo.oa;
import p651o0ooOOoo.pa;
import p651o0ooOOoo.qa;
import p651o0ooOOoo.ra;
import p651o0ooOOoo.sa;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOo0o0oO extends o00000O {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Context f46205OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final SignTaskVM f46206OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f46207OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f46208OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f46209OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final Lazy f46210Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f46211Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final boolean f46212OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public p189o00o00o0.OooO0OO<TaskModel> f46213OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f46214OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f46215Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f46216Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public TaskViewModel f46217OoooooO;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            oOo0o0oO.this.OooOO0o();
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
            oOo0o0oO.this.OooO0O0();
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
            LiveData<ApiResult<String>> liveDataYallaChatBindTask = oOo0o0oO.this.f46217OoooooO.yallaChatBindTask(accessToken);
            oOo0o0oO ooo0o0oo = oOo0o0oO.this;
            liveDataYallaChatBindTask.observe(ooo0o0oo.f41564OoooO00, new OooOo(new ooOOO00O(ooo0o0oo), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<oa> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oa invoke() {
            oa oaVarInflate = oa.inflate(LayoutInflater.from(oOo0o0oO.this.f46205OoooOOO), oOo0o0oO.this.f41563OoooO0, false);
            Intrinsics.checkNotNullExpressionValue(oaVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return oaVarInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<pa> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final pa invoke() {
            pa paVarInflate = pa.inflate(LayoutInflater.from(oOo0o0oO.this.f46205OoooOOO), oOo0o0oO.this.f41563OoooO0, false);
            Intrinsics.checkNotNullExpressionValue(paVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return paVarInflate;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OpenAuthManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            Context context = oOo0o0oO.this.f46205OoooOOO;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return new OpenAuthManager((FragmentActivity) context);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<qa> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final qa invoke() {
            qa qaVarInflate = qa.inflate(LayoutInflater.from(oOo0o0oO.this.f46205OoooOOO), oOo0o0oO.this.f41563OoooO0, false);
            Intrinsics.checkNotNullExpressionValue(qaVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return qaVarInflate;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0O00000.OooO0OO("Sign_in_more");
            oOo0o0oO.this.f46205OoooOOO.startActivity(new Intent(oOo0o0oO.this.f46205OoooOOO, (Class<?>) TaskActivity.class));
            oOo0o0oO.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends p189o00o00o0.OooO0OO<TaskModel> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f46226OooO0O0 = 0;

        public OooOOO0(Context context) {
            super(context, R.layout.main_clock_dialog_task_item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            final p189o00o00o0.OooO0o helper = (p189o00o00o0.OooO0o) oooO00o;
            final TaskModel item = (TaskModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.OooO0oo(R.id.iv_icon_task, item.getIcon());
            if (item.getRewardMultiple() > 1) {
                StringBuilder sbOooO0O0 = OooO00o.OooO0OO.OooO0O0('x');
                sbOooO0O0.append(item.getRewardMultiple());
                helper.OooOO0(R.id.ivDoubleReward, sbOooO0O0.toString());
            }
            String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(item.getName());
            if (item.getMaxNum() > 0 && item.getState() == 0) {
                strOooO0OO = strOooO0OO + '(' + item.getNum() + '/' + item.getMaxNum() + ')';
            }
            helper.OooOO0(R.id.tv_name_task, strOooO0OO);
            if (oo000o.OooO0o0()) {
                StringBuilder sb = new StringBuilder();
                sb.append(item.getRewardCoin());
                sb.append('+');
                helper.OooOO0(R.id.tv_bonus_task, sb.toString());
            } else {
                StringBuilder sbOooO0O1 = OooO00o.OooO0OO.OooO0O0('+');
                sbOooO0O1.append(item.getRewardCoin());
                helper.OooOO0(R.id.tv_bonus_task, sbOooO0O1.toString());
            }
            if (item.getRewardType() == 1) {
                helper.OooO0oo(R.id.ivReward, R.drawable.icon_coin_main_slide);
                helper.OooOO0O(R.id.tv_bonus_task, o000O0O0.OooO00o(R.color.color_coin));
            } else {
                helper.OooO0oo(R.id.ivReward, R.drawable.icon_crystal_task_item_min);
                helper.OooOO0O(R.id.tv_bonus_task, o000O0O0.OooO00o(R.color.color_crystal));
            }
            helper.OooO0oO(R.id.tv_bonus_task, item.getTakeId() != 37);
            helper.OooO0oO(R.id.ivDoubleReward, item.getTakeId() != 37);
            Button button = (Button) helper.OooO0Oo(R.id.bt_go);
            int state = item.getState();
            if (state == 0) {
                button.setEnabled(true);
                if (Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooo().getValue(), Boolean.TRUE)) {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) com.yalla.support.common.util.OooOOO.OooO0OO(R.string.go_room_do_task), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Go), 0, false, 6, (Object) null);
                    SpannableString spannableString = new SpannableString(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.go_room_do_task));
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00D8C9")), iIndexOf$default, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Go).length() + iIndexOf$default, 18);
                    oOo0o0oO.this.OooOOO().f50373OooO0Oo.setText(spannableString);
                } else {
                    oOo0o0oO.this.OooOOO().f50373OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.go_favorite_rooms));
                }
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.selector_btn_bg_green_line_gray_r360);
                button.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
                button.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Go));
                TextView textView = oOo0o0oO.this.OooOOO().f50373OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
                o00O0O.OooO(textView);
            } else if (state != 1) {
                button.setEnabled(false);
                button.setBackgroundResource(R.drawable.bgs_button_fff2f3f5_r360);
                button.setTextColor(o000O0O0.OooO00o(R.color.color_999999));
                button.setText(R.string.task_Done);
            } else {
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.selector_btn_bg_green_gray_r360);
                button.setTextColor(o000O0O0.OooO00o(R.color.white));
                button.setText(R.string.Get);
            }
            final oOo0o0oO ooo0o0oo = oOo0o0oO.this;
            button.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOOo.oOO000
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final oOo0o0oO this$0 = ooo0o0oo;
                    TaskModel item2 = item;
                    oOo0o0oO.OooOOO0 this$1 = this;
                    OooO0o helper2 = helper;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    if (this$0.f46212OooooO0 && item2.getState() == 0) {
                        o0O00000.OooO0OO("Sign_in_go");
                    }
                    if (this$0.f46212OooooO0 && item2.getState() == 1) {
                        o0O00000.OooO0OO("Sign_in_get");
                    }
                    if (this$0.f46212OooooO0 && item2.getTakeId() == 35) {
                        if (item2.getState() == 0) {
                            o0O00000.OooO0OO("Room_sign_daily_yallachat_go");
                        }
                        if (item2.getState() == 1) {
                            o0O00000.OooO0OO("Room_sign_daily_yallachat_get");
                        }
                    }
                    int state2 = item2.getState();
                    if (state2 != 0) {
                        if (state2 != 1) {
                            return;
                        }
                        int takeId = item2.getTakeId();
                        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.Button");
                        final Button button2 = (Button) view;
                        final String strValueOf = String.valueOf(item2.getRewardMultiple() * OooO.OooO0o0(item2.getGetcrystal()));
                        final int layoutPosition = helper2.getLayoutPosition();
                        Oooo0<Long> rewardCrystal = this$0.f46206OoooOOo.getRewardCrystal(takeId);
                        Context context = this$0.f46205OoooOOO;
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        rewardCrystal.observe((FragmentActivity) context, new Observer() { // from class: o0oOoOOo.oO0O0Oo0
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                StringBuilder sb2;
                                Button view2 = button2;
                                oOo0o0oO this$2 = this$0;
                                int i = layoutPosition;
                                String crystal = strValueOf;
                                Response response = (Response) obj2;
                                Intrinsics.checkNotNullParameter(view2, "$view");
                                Intrinsics.checkNotNullParameter(this$2, "this$0");
                                Intrinsics.checkNotNullParameter(crystal, "$crystal");
                                if (!response.getIsSuccess() || response.getData() == null) {
                                    this$2.OooOOo();
                                    return;
                                }
                                view2.setEnabled(false);
                                view2.setText(OooOOO.OooO0OO(R.string.task_Done));
                                view2.setTextColor(o000O0O0.OooO00o(R.color.white));
                                if (this$2.OooOOOo().f50579OooO0O0.getChildAt(i) == null) {
                                    return;
                                }
                                TextView textView2 = (TextView) this$2.OooOOOo().f50579OooO0O0.getChildAt(i).findViewById(R.id.tv_anim_num_dialog);
                                if (oo000o.OooO0o0()) {
                                    sb2 = new StringBuilder();
                                    sb2.append(crystal);
                                    sb2.append('+');
                                } else {
                                    sb2 = new StringBuilder();
                                    sb2.append('+');
                                    sb2.append(crystal);
                                }
                                textView2.setText(sb2.toString());
                                LinearLayout linearLayout = (LinearLayout) this$2.OooOOOo().f50579OooO0O0.getChildAt(i).findViewById(R.id.ll_get_crystal_anim);
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                alphaAnimation.setDuration(1200L);
                                TranslateAnimation translateAnimation = new TranslateAnimation(1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, -2.0f);
                                translateAnimation.setDuration(1200L);
                                animationSet.addAnimation(alphaAnimation);
                                animationSet.addAnimation(translateAnimation);
                                animationSet.setAnimationListener(new ooo0o(linearLayout));
                                linearLayout.startAnimation(animationSet);
                                linearLayout.setVisibility(0);
                                this$2.f46206OoooOOo.loadTaskListData(1, true);
                            }
                        });
                        return;
                    }
                    if (item2.getTakeId() == 35) {
                        oOO000o notInstall = new oOO000o(this$0);
                        oOO00 action = new oOO00(this$0);
                        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (PackManager.INSTANCE.isInstalledYallaChat()) {
                            action.invoke();
                            return;
                        } else {
                            notInstall.invoke();
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0418OooO00o(null), 2, null);
                            return;
                        }
                    }
                    if (item2.getTakeId() == 37) {
                        MutableLiveData<String> yallachatTreeUrl = SharedUrlManager.INSTANCE.getYallachatTreeUrl();
                        Context context2 = this$1.mContext;
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        yallachatTreeUrl.observe((FragmentActivity) context2, o000O00.f42203OooO0OO);
                        this$0.OooO0O0();
                        return;
                    }
                    Boolean value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOooo().getValue();
                    Intrinsics.checkNotNull(value);
                    if (value.booleanValue()) {
                        Oooo0<RandomRoomModel> randomRoomData = this$0.f46206OoooOOo.getRandomRoomData();
                        Context context3 = this$0.f46205OoooOOO;
                        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        randomRoomData.observe((FragmentActivity) context3, o000Oo0.f42219OooO0OO);
                    }
                    this$0.OooO0O0();
                    LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                }
            });
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<ra> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ra invoke() {
            ra raVarInflate = ra.inflate(LayoutInflater.from(oOo0o0oO.this.f46205OoooOOO), oOo0o0oO.this.f41563OoooO0, false);
            Intrinsics.checkNotNullExpressionValue(raVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return raVarInflate;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<sa> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final sa invoke() {
            sa saVarInflate = sa.inflate(LayoutInflater.from(oOo0o0oO.this.f46205OoooOOO), oOo0o0oO.this.f41563OoooO0, false);
            Intrinsics.checkNotNullExpressionValue(saVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return saVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o0oO(@NotNull Context mContext) {
        super(mContext, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f46205OoooOOO = mContext;
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) mContext;
        this.f46206OoooOOo = (SignTaskVM) new ViewModelProvider(fragmentActivity).get(SignTaskVM.class);
        this.f46207OoooOo0 = LazyKt.lazy(new OooOO0O());
        this.f46208OoooOoO = LazyKt.lazy(new OooOOOO());
        this.f46209OoooOoo = LazyKt.lazy(new OooOo00());
        this.f46210Ooooo00 = LazyKt.lazy(new OooO0o());
        this.f46211Ooooo0o = LazyKt.lazy(new OooO0OO());
        this.f46212OooooO0 = mContext instanceof MainActivity;
        this.f46214OooooOo = -1;
        Lazy lazy = LazyKt.lazy(new OooOO0());
        this.f46215Oooooo = lazy;
        ConstraintLayout constraintLayout = OooOOO().f50370OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "rootBinding.root");
        OooO0oO(constraintLayout);
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f46217OoooooO = (TaskViewModel) new ViewModelProvider(fragmentActivity).get(TaskViewModel.class);
        ImageView imageView = OooOOO().f50372OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o00O0O.OooO0Oo(imageView, new OooO00o());
        ((OpenAuthManager) lazy.getValue()).f21667OooO0O0 = new OooO0O0();
    }

    public static final void OooOO0O(oOo0o0oO ooo0o0oo, int i) {
        if (ooo0o0oo.f46212OooooO0) {
            o0O00000.OooO0OO("Sign_in_Click");
        } else {
            o0O00000.OooO0OO("Me_tasks_sign_cilck");
        }
        int i2 = ooo0o0oo.f46214OooooOo;
        if (i2 != -1) {
            if ((i == 0 || i2 + 1 == i) && !ooo0o0oo.f46206OoooOOo.getHasSignInToday()) {
                ooo0o0oo.OooOOOO().f50496OooOooO.setEnabled(false);
                Oooo0<SignInModel> oooo0SignIn = ooo0o0oo.f46206OoooOOo.signIn();
                Context context = ooo0o0oo.f46205OoooOOO;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                oooo0SignIn.observe((FragmentActivity) context, new o0ooOOo(ooo0o0oo, 4));
            }
        }
    }

    @Override // p504o0o00o0.o00000O
    public final void OooO0O0() {
        super.OooO0O0();
        String str = this.f46206OoooOOo.getHasSignInToday() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (this.f46212OooooO0) {
            o0O00000.OooO0o0("Sign_in_window_close", str);
        } else {
            o0O00000.OooO0o0("Me_tasks_sign_close", str);
        }
    }

    @Override // p504o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        OooOO0o();
        Observable<Object> observable = LiveEventBus.get("DISMISS_CLOCK_ICON");
        Context context = this.f46205OoooOOO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        observable.observe((FragmentActivity) context, new o00oO0o(this, 5));
    }

    public final void OooOO0o() {
        if (!NetworkUtil.f20518OooO00o.OooO0O0()) {
            OooOOo();
            return;
        }
        if (this.f46212OooooO0 && this.f46206OoooOOo.getHasSignInToday()) {
            OooOo00();
            return;
        }
        qa qaVarOooOOO = OooOOO();
        ImageView ivDismiss = qaVarOooOOO.f50372OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o00O0O.OooO(ivDismiss);
        TextView tvContent = qaVarOooOOO.f50373OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o00O0O.OooO(tvContent);
        qaVarOooOOO.f50374OooO0o0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.clock_in_title));
        qaVarOooOOO.f50373OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Sign_7_days_tips));
        qaVarOooOOO.f50371OooO0O0.removeAllViews();
        qaVarOooOOO.f50371OooO0O0.addView(OooOOOO().f50468OooO00o);
        Oooo0<CheckInAddUpWeekModel> oooo0LoadSignDayData = this.f46206OoooOOo.loadSignDayData();
        Context context = this.f46205OoooOOO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        oooo0LoadSignDayData.observe((FragmentActivity) context, new oo0o0Oo(this, 3));
        ra raVarOooOOOO = OooOOOO();
        raVarOooOOOO.f50496OooOooO.setText(this.f46206OoooOOo.getHasSignInToday() ? com.yalla.support.common.util.OooOOO.OooO0OO(R.string.sign_in_today) : com.yalla.support.common.util.OooOOO.OooO0OO(R.string.clock_in_sign));
        raVarOooOOOO.f50496OooOooO.setEnabled(!this.f46206OoooOOo.getHasSignInToday());
        raVarOooOOOO.f50496OooOooO.setPressed(!this.f46206OoooOOo.getHasSignInToday());
        CardView flSignIn1 = raVarOooOOOO.f50469OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flSignIn1, "flSignIn1");
        o00O0O.OooO0Oo(flSignIn1, new oO0OO0O(this));
        CardView flSignIn2 = raVarOooOOOO.f50470OooO0OO;
        Intrinsics.checkNotNullExpressionValue(flSignIn2, "flSignIn2");
        o00O0O.OooO0Oo(flSignIn2, new oO0Oo0o0(this));
        CardView flSignIn3 = raVarOooOOOO.f50471OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn3, "flSignIn3");
        o00O0O.OooO0Oo(flSignIn3, new oO0o0000(this));
        CardView flSignIn4 = raVarOooOOOO.f50473OooO0o0;
        Intrinsics.checkNotNullExpressionValue(flSignIn4, "flSignIn4");
        o00O0O.OooO0Oo(flSignIn4, new oO0oO000(this));
        CardView flSignIn5 = raVarOooOOOO.f50472OooO0o;
        Intrinsics.checkNotNullExpressionValue(flSignIn5, "flSignIn5");
        o00O0O.OooO0Oo(flSignIn5, new oOo00o00(this));
        CardView flSignIn6 = raVarOooOOOO.f50474OooO0oO;
        Intrinsics.checkNotNullExpressionValue(flSignIn6, "flSignIn6");
        o00O0O.OooO0Oo(flSignIn6, new oO(this));
        CardView flSignIn7 = raVarOooOOOO.f50475OooO0oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn7, "flSignIn7");
        o00O0O.OooO0Oo(flSignIn7, new oOO00000(this));
        StateButton signIn = raVarOooOOOO.f50496OooOooO;
        Intrinsics.checkNotNullExpressionValue(signIn, "signIn");
        o00O0O.OooO0Oo(signIn, new oOO0000(this));
        if (!this.f46212OooooO0 || this.f46206OoooOOo.getHasSignInToday()) {
            return;
        }
        o0O00000.OooO0OO("Sign_in_window");
    }

    public final qa OooOOO() {
        return (qa) this.f46207OoooOo0.getValue();
    }

    public final oa OooOOO0() {
        return (oa) this.f46211Ooooo0o.getValue();
    }

    public final ra OooOOOO() {
        return (ra) this.f46208OoooOoO.getValue();
    }

    public final sa OooOOOo() {
        return (sa) this.f46209OoooOoo.getValue();
    }

    public final void OooOOo() {
        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.not_network);
        ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34368OooO00o;
                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        ImageView imageView = OooOOO().f50372OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o00O0O.OooO0O0(imageView);
        TextView textView = OooOOO().f50373OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
        o00O0O.OooO0O0(textView);
        OooOOO().f50374OooO0o0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.not_network));
        OooOOO().f50371OooO0O0.removeAllViews();
        OooOOO().f50371OooO0O0.addView(((pa) this.f46210Ooooo00.getValue()).f50301OooO00o);
        StateButton stateButton = ((pa) this.f46210Ooooo00.getValue()).f50302OooO0O0;
        Intrinsics.checkNotNullExpressionValue(stateButton, "netFailedBinding.tvTryAgain");
        o00O0O.OooO0Oo(stateButton, new OooO());
    }

    public final void OooOOo0() {
        Oooo0 oooo0LoadTaskListData$default = SignTaskVM.loadTaskListData$default(this.f46206OoooOOo, 1, false, 2, null);
        Context context = this.f46205OoooOOO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        oooo0LoadTaskListData$default.observe((FragmentActivity) context, new o0OOO0o(this, 9));
    }

    public final void OooOOoo(int i) {
        this.f46214OooooOo = i;
        ra raVarOooOOOO = OooOOOO();
        if (this.f46216Oooooo0 > 1) {
            TextView textView = raVarOooOOOO.f50467OooO;
            StringBuilder sbOooO0O0 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O0.append(this.f46216Oooooo0);
            textView.setText(sbOooO0O0.toString());
            TextView textView2 = raVarOooOOOO.f50476OooOO0;
            StringBuilder sbOooO0O1 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O1.append(this.f46216Oooooo0);
            textView2.setText(sbOooO0O1.toString());
            TextView textView3 = raVarOooOOOO.f50477OooOO0O;
            StringBuilder sbOooO0O2 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O2.append(this.f46216Oooooo0);
            textView3.setText(sbOooO0O2.toString());
            TextView textView4 = raVarOooOOOO.f50478OooOO0o;
            StringBuilder sbOooO0O3 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O3.append(this.f46216Oooooo0);
            textView4.setText(sbOooO0O3.toString());
            TextView textView5 = raVarOooOOOO.f50480OooOOO0;
            StringBuilder sbOooO0O4 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O4.append(this.f46216Oooooo0);
            textView5.setText(sbOooO0O4.toString());
            TextView textView6 = raVarOooOOOO.f50479OooOOO;
            StringBuilder sbOooO0O5 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O5.append(this.f46216Oooooo0);
            textView6.setText(sbOooO0O5.toString());
            TextView textView7 = raVarOooOOOO.f50481OooOOOO;
            StringBuilder sbOooO0O6 = OooO00o.OooO0OO.OooO0O0('x');
            sbOooO0O6.append(this.f46216Oooooo0);
            textView7.setText(sbOooO0O6.toString());
        }
        if (!this.f46206OoooOOo.getHasSignInToday()) {
            switch (i) {
                case 0:
                    ImageView ivGet1 = raVarOooOOOO.f50482OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet1, "ivGet1");
                    o00O0O.OooO(ivGet1);
                    raVarOooOOOO.f50467OooO.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 1:
                    ImageView ivGet2 = raVarOooOOOO.f50484OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet2, "ivGet2");
                    o00O0O.OooO(ivGet2);
                    raVarOooOOOO.f50476OooOO0.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 2:
                    ImageView ivGet3 = raVarOooOOOO.f50483OooOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet3, "ivGet3");
                    o00O0O.OooO(ivGet3);
                    raVarOooOOOO.f50477OooOO0O.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 3:
                    ImageView ivGet4 = raVarOooOOOO.f50485OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(ivGet4, "ivGet4");
                    o00O0O.OooO(ivGet4);
                    raVarOooOOOO.f50478OooOO0o.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 4:
                    ImageView ivGet5 = raVarOooOOOO.f50488OooOo00;
                    Intrinsics.checkNotNullExpressionValue(ivGet5, "ivGet5");
                    o00O0O.OooO(ivGet5);
                    raVarOooOOOO.f50480OooOOO0.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 5:
                    ImageView ivGet6 = raVarOooOOOO.f50487OooOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet6, "ivGet6");
                    o00O0O.OooO(ivGet6);
                    raVarOooOOOO.f50479OooOOO.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 6:
                    ImageView ivGet7 = raVarOooOOOO.f50489OooOo0O;
                    Intrinsics.checkNotNullExpressionValue(ivGet7, "ivGet7");
                    o00O0O.OooO(ivGet7);
                    raVarOooOOOO.f50481OooOOOO.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
            }
        }
        if (i > 0) {
            ImageView ivSigned1 = raVarOooOOOO.f50490OooOo0o;
            Intrinsics.checkNotNullExpressionValue(ivSigned1, "ivSigned1");
            o00O0O.OooO(ivSigned1);
        }
        if (i > 1) {
            ImageView ivSigned2 = raVarOooOOOO.f50486OooOo;
            Intrinsics.checkNotNullExpressionValue(ivSigned2, "ivSigned2");
            o00O0O.OooO(ivSigned2);
        }
        if (i > 2) {
            ImageView ivSigned3 = raVarOooOOOO.f50492OooOoO0;
            Intrinsics.checkNotNullExpressionValue(ivSigned3, "ivSigned3");
            o00O0O.OooO(ivSigned3);
        }
        if (i > 3) {
            ImageView ivSigned4 = raVarOooOOOO.f50491OooOoO;
            Intrinsics.checkNotNullExpressionValue(ivSigned4, "ivSigned4");
            o00O0O.OooO(ivSigned4);
        }
        if (i > 4) {
            ImageView ivSigned5 = raVarOooOOOO.f50493OooOoOO;
            Intrinsics.checkNotNullExpressionValue(ivSigned5, "ivSigned5");
            o00O0O.OooO(ivSigned5);
        }
        if (i > 5) {
            ImageView ivSigned6 = raVarOooOOOO.f50495OooOoo0;
            Intrinsics.checkNotNullExpressionValue(ivSigned6, "ivSigned6");
            o00O0O.OooO(ivSigned6);
        }
        if (i > 6) {
            ImageView ivSigned7 = raVarOooOOOO.f50494OooOoo;
            Intrinsics.checkNotNullExpressionValue(ivSigned7, "ivSigned7");
            o00O0O.OooO(ivSigned7);
        }
        raVarOooOOOO.f50497OooOooo.setText(this.f46206OoooOOo.getSpannableStringBuilder(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.clock_in_tips), String.valueOf(i)), String.valueOf(i)));
    }

    public final void OooOo00() {
        ImageView imageView = OooOOO().f50372OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o00O0O.OooO(imageView);
        OooOOO().f50371OooO0O0.removeAllViews();
        OooOOO().f50371OooO0O0.addView(OooOOOo().f50578OooO00o);
        OooOOO().f50374OooO0o0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.dialog_task));
        TextView textView = OooOOO().f50373OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
        o00O0O.OooO0O0(textView);
        OooOOOo().f50579OooO0O0.setLayoutManager(new FixLinearLayoutManager(this.f46205OoooOOO));
        this.f46213OooooOO = new OooOOO0(this.f46205OoooOOO);
        RecyclerView recyclerView = OooOOOo().f50579OooO0O0;
        p189o00o00o0.OooO0OO<TaskModel> oooO0OO = this.f46213OooooOO;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        TextView textView2 = OooOOOo().f50580OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "taskListBinding.tvMoraTask");
        o00O0O.OooO0Oo(textView2, new OooOOO());
        OooOOo0();
    }
}
