package p579o0oOoOOo;

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
import p028Oooo0o0.o00O0O0O;
import p142o00OOooO.o00oO0o;
import p142o00OOooO.o0OOO0o;
import p142o00OOooO.o0ooOOo;
import p142o00OOooO.oo0o0Oo;
import p168o00Ooo0.oo000o;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p495o0o00OOO.Oooo0;
import p502o0o00o0.o00000O;
import p518o0o0O00o.o000O00;
import p518o0o0O00o.o000O00O;
import p623o0oo0oO0.o0000O0;
import p649o0ooOOoo.pa;
import p649o0ooOOoo.qa;
import p649o0ooOOoo.ra;
import p649o0ooOOoo.sa;
import p649o0ooOOoo.ta;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class ooOOO0Oo extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Context f46207OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final SignTaskVM f46208OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f46209OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f46210OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f46211OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f46212OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final boolean f46213OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<TaskModel> f46214Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f46215Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f46216OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f46217OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public TaskViewModel f46218OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final Lazy f46219o000oOoO;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            ooOOO0Oo.this.OooOO0o();
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
            ooOOO0Oo.this.OooO0O0();
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
            LiveData<ApiResult<String>> liveDataYallaChatBindTask = ooOOO0Oo.this.f46218OooooOo.yallaChatBindTask(accessToken);
            ooOOO0Oo ooooo0oo = ooOOO0Oo.this;
            liveDataYallaChatBindTask.observe(ooooo0oo.f41544Oooo0oO, new OooOo(new ooo0o(ooooo0oo), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<pa> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final pa invoke() {
            pa paVarInflate = pa.inflate(LayoutInflater.from(ooOOO0Oo.this.f46207OoooO), ooOOO0Oo.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(paVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return paVarInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<qa> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final qa invoke() {
            qa qaVarInflate = qa.inflate(LayoutInflater.from(ooOOO0Oo.this.f46207OoooO), ooOOO0Oo.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(qaVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return qaVarInflate;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OpenAuthManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            Context context = ooOOO0Oo.this.f46207OoooO;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return new OpenAuthManager((FragmentActivity) context);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<ra> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ra invoke() {
            ra raVarInflate = ra.inflate(LayoutInflater.from(ooOOO0Oo.this.f46207OoooO), ooOOO0Oo.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(raVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return raVarInflate;
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
            ooOOO0Oo.this.f46207OoooO.startActivity(new Intent(ooOOO0Oo.this.f46207OoooO, (Class<?>) TaskActivity.class));
            ooOOO0Oo.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends p188o00o00o0.OooO0OO<TaskModel> {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int f46228OooO0O0 = 0;

        public OooOOO0(Context context) {
            super(context, R.layout.main_clock_dialog_task_item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            final p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            final TaskModel item = (TaskModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.OooO0oo(R.id.iv_icon_task, item.getIcon());
            if (item.getRewardMultiple() > 1) {
                StringBuilder sbOooO00o = o00O0O0O.OooO00o('x');
                sbOooO00o.append(item.getRewardMultiple());
                helper.OooOO0(R.id.ivDoubleReward, sbOooO00o.toString());
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
                StringBuilder sbOooO00o2 = o00O0O0O.OooO00o('+');
                sbOooO00o2.append(item.getRewardCoin());
                helper.OooOO0(R.id.tv_bonus_task, sbOooO00o2.toString());
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
                if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooo().getValue(), Boolean.TRUE)) {
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) com.yalla.support.common.util.OooOOO.OooO0OO(R.string.go_room_do_task), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Go), 0, false, 6, (Object) null);
                    SpannableString spannableString = new SpannableString(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.go_room_do_task));
                    spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#00D8C9")), iIndexOf$default, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Go).length() + iIndexOf$default, 18);
                    ooOOO0Oo.this.OooOOO().f50436OooO0Oo.setText(spannableString);
                } else {
                    ooOOO0Oo.this.OooOOO().f50436OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.go_favorite_rooms));
                }
                button.setEnabled(true);
                button.setBackgroundResource(R.drawable.selector_btn_bg_green_line_gray_r360);
                button.setTextColor(o000O0O0.OooO00o(R.color.color_00d8c9));
                button.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Go));
                TextView textView = ooOOO0Oo.this.OooOOO().f50436OooO0Oo;
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
            final ooOOO0Oo ooooo0oo = ooOOO0Oo.this;
            button.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOOo.oOO000o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final ooOOO0Oo this$0 = ooooo0oo;
                    TaskModel item2 = item;
                    ooOOO0Oo.OooOOO0 this$1 = this;
                    OooO0o helper2 = helper;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    Intrinsics.checkNotNullParameter(helper2, "$helper");
                    if (this$0.f46213OoooOoo && item2.getState() == 0) {
                        o0O00000.OooO0OO("Sign_in_go");
                    }
                    if (this$0.f46213OoooOoo && item2.getState() == 1) {
                        o0O00000.OooO0OO("Sign_in_get");
                    }
                    if (this$0.f46213OoooOoo && item2.getTakeId() == 35) {
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
                        Oooo0<Long> rewardCrystal = this$0.f46208OoooOO0.getRewardCrystal(takeId);
                        Context context = this$0.f46207OoooO;
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        rewardCrystal.observe((FragmentActivity) context, new Observer() { // from class: o0oOoOOo.oOo0o0oO
                            @Override // androidx.lifecycle.Observer
                            public final void onChanged(Object obj2) {
                                StringBuilder sb2;
                                Button view2 = button2;
                                ooOOO0Oo this$2 = this$0;
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
                                if (this$2.OooOOOo().f50642OooO0O0.getChildAt(i) == null) {
                                    return;
                                }
                                TextView textView2 = (TextView) this$2.OooOOOo().f50642OooO0O0.getChildAt(i).findViewById(R.id.tv_anim_num_dialog);
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
                                LinearLayout linearLayout = (LinearLayout) this$2.OooOOOo().f50642OooO0O0.getChildAt(i).findViewById(R.id.ll_get_crystal_anim);
                                AnimationSet animationSet = new AnimationSet(false);
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                alphaAnimation.setDuration(1200L);
                                TranslateAnimation translateAnimation = new TranslateAnimation(1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1, -2.0f);
                                translateAnimation.setDuration(1200L);
                                animationSet.addAnimation(alphaAnimation);
                                animationSet.addAnimation(translateAnimation);
                                animationSet.setAnimationListener(new oO0OO00(linearLayout));
                                linearLayout.startAnimation(animationSet);
                                linearLayout.setVisibility(0);
                                this$2.f46208OoooOO0.loadTaskListData(1, true);
                            }
                        });
                        return;
                    }
                    if (item2.getTakeId() == 35) {
                        oOO00 notInstall = new oOO00(this$0);
                        oOO00O0 action = new oOO00O0(this$0);
                        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (PackManager.INSTANCE.isInstalledYallaChat()) {
                            action.invoke();
                            return;
                        } else {
                            notInstall.invoke();
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0419OooO00o(null), 2, null);
                            return;
                        }
                    }
                    if (item2.getTakeId() == 37) {
                        MutableLiveData<String> yallachatTreeUrl = SharedUrlManager.INSTANCE.getYallachatTreeUrl();
                        Context context2 = this$1.mContext;
                        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        yallachatTreeUrl.observe((FragmentActivity) context2, o000O00O.f42188OooO0OO);
                        this$0.OooO0O0();
                        return;
                    }
                    Boolean value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooo().getValue();
                    Intrinsics.checkNotNull(value);
                    if (value.booleanValue()) {
                        Oooo0<RandomRoomModel> randomRoomData = this$0.f46208OoooOO0.getRandomRoomData();
                        Context context3 = this$0.f46207OoooO;
                        Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        randomRoomData.observe((FragmentActivity) context3, o000O00.f42183OooO0OO);
                    }
                    this$0.OooO0O0();
                    LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                }
            });
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<sa> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final sa invoke() {
            sa saVarInflate = sa.inflate(LayoutInflater.from(ooOOO0Oo.this.f46207OoooO), ooOOO0Oo.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(saVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return saVarInflate;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<ta> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ta invoke() {
            ta taVarInflate = ta.inflate(LayoutInflater.from(ooOOO0Oo.this.f46207OoooO), ooOOO0Oo.this.f41545Oooo0oo, false);
            Intrinsics.checkNotNullExpressionValue(taVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return taVarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO0Oo(@NotNull Context mContext) {
        super(mContext, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f46207OoooO = mContext;
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) mContext;
        this.f46208OoooOO0 = (SignTaskVM) new ViewModelProvider(fragmentActivity).get(SignTaskVM.class);
        this.f46219o000oOoO = LazyKt.lazy(new OooOO0O());
        this.f46209OoooOOO = LazyKt.lazy(new OooOOOO());
        this.f46210OoooOOo = LazyKt.lazy(new OooOo00());
        this.f46211OoooOo0 = LazyKt.lazy(new OooO0o());
        this.f46212OoooOoO = LazyKt.lazy(new OooO0OO());
        this.f46213OoooOoo = mContext instanceof MainActivity;
        this.f46215Ooooo0o = -1;
        Lazy lazy = LazyKt.lazy(new OooOO0());
        this.f46217OooooOO = lazy;
        ConstraintLayout constraintLayout = OooOOO().f50433OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "rootBinding.root");
        OooO0oO(constraintLayout);
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f46218OooooOo = (TaskViewModel) new ViewModelProvider(fragmentActivity).get(TaskViewModel.class);
        ImageView imageView = OooOOO().f50435OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o00O0O.OooO0Oo(imageView, new OooO00o());
        ((OpenAuthManager) lazy.getValue()).f21648OooO0O0 = new OooO0O0();
    }

    public static final void OooOO0O(ooOOO0Oo ooooo0oo, int i) {
        if (ooooo0oo.f46213OoooOoo) {
            o0O00000.OooO0OO("Sign_in_Click");
        } else {
            o0O00000.OooO0OO("Me_tasks_sign_cilck");
        }
        int i2 = ooooo0oo.f46215Ooooo0o;
        if (i2 != -1) {
            if ((i == 0 || i2 + 1 == i) && !ooooo0oo.f46208OoooOO0.getHasSignInToday()) {
                ooooo0oo.OooOOOO().f50559OooOooO.setEnabled(false);
                Oooo0<SignInModel> oooo0SignIn = ooooo0oo.f46208OoooOO0.signIn();
                Context context = ooooo0oo.f46207OoooO;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                oooo0SignIn.observe((FragmentActivity) context, new o0ooOOo(ooooo0oo, 4));
            }
        }
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0O0() {
        super.OooO0O0();
        String str = this.f46208OoooOO0.getHasSignInToday() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (this.f46213OoooOoo) {
            o0O00000.OooO0o0("Sign_in_window_close", str);
        } else {
            o0O00000.OooO0o0("Me_tasks_sign_close", str);
        }
    }

    @Override // p502o0o00o0.o00000O
    public final void OooOO0() {
        super.OooOO0();
        OooOO0o();
        Observable<Object> observable = LiveEventBus.get("DISMISS_CLOCK_ICON");
        Context context = this.f46207OoooO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        observable.observe((FragmentActivity) context, new o00oO0o(this, 5));
    }

    public final void OooOO0o() {
        if (!NetworkUtil.f20498OooO00o.OooO0O0()) {
            OooOOo();
            return;
        }
        if (this.f46213OoooOoo && this.f46208OoooOO0.getHasSignInToday()) {
            OooOo00();
            return;
        }
        ra raVarOooOOO = OooOOO();
        ImageView ivDismiss = raVarOooOOO.f50435OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o00O0O.OooO(ivDismiss);
        TextView tvContent = raVarOooOOO.f50436OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o00O0O.OooO(tvContent);
        raVarOooOOO.f50437OooO0o0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.clock_in_title));
        raVarOooOOO.f50436OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Sign_7_days_tips));
        raVarOooOOO.f50434OooO0O0.removeAllViews();
        raVarOooOOO.f50434OooO0O0.addView(OooOOOO().f50531OooO00o);
        Oooo0<CheckInAddUpWeekModel> oooo0LoadSignDayData = this.f46208OoooOO0.loadSignDayData();
        Context context = this.f46207OoooO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        oooo0LoadSignDayData.observe((FragmentActivity) context, new oo0o0Oo(this, 3));
        sa saVarOooOOOO = OooOOOO();
        saVarOooOOOO.f50559OooOooO.setText(this.f46208OoooOO0.getHasSignInToday() ? com.yalla.support.common.util.OooOOO.OooO0OO(R.string.sign_in_today) : com.yalla.support.common.util.OooOOO.OooO0OO(R.string.clock_in_sign));
        saVarOooOOOO.f50559OooOooO.setEnabled(!this.f46208OoooOO0.getHasSignInToday());
        saVarOooOOOO.f50559OooOooO.setPressed(!this.f46208OoooOO0.getHasSignInToday());
        CardView flSignIn1 = saVarOooOOOO.f50532OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flSignIn1, "flSignIn1");
        o00O0O.OooO0Oo(flSignIn1, new oO0Oo0o0(this));
        CardView flSignIn2 = saVarOooOOOO.f50533OooO0OO;
        Intrinsics.checkNotNullExpressionValue(flSignIn2, "flSignIn2");
        o00O0O.OooO0Oo(flSignIn2, new oO0o0000(this));
        CardView flSignIn3 = saVarOooOOOO.f50534OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn3, "flSignIn3");
        o00O0O.OooO0Oo(flSignIn3, new oO0oO000(this));
        CardView flSignIn4 = saVarOooOOOO.f50536OooO0o0;
        Intrinsics.checkNotNullExpressionValue(flSignIn4, "flSignIn4");
        o00O0O.OooO0Oo(flSignIn4, new oOo00o00(this));
        CardView flSignIn5 = saVarOooOOOO.f50535OooO0o;
        Intrinsics.checkNotNullExpressionValue(flSignIn5, "flSignIn5");
        o00O0O.OooO0Oo(flSignIn5, new oO(this));
        CardView flSignIn6 = saVarOooOOOO.f50537OooO0oO;
        Intrinsics.checkNotNullExpressionValue(flSignIn6, "flSignIn6");
        o00O0O.OooO0Oo(flSignIn6, new oOO00000(this));
        CardView flSignIn7 = saVarOooOOOO.f50538OooO0oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn7, "flSignIn7");
        o00O0O.OooO0Oo(flSignIn7, new oOO0000(this));
        StateButton signIn = saVarOooOOOO.f50559OooOooO;
        Intrinsics.checkNotNullExpressionValue(signIn, "signIn");
        o00O0O.OooO0Oo(signIn, new oOO000(this));
        if (!this.f46213OoooOoo || this.f46208OoooOO0.getHasSignInToday()) {
            return;
        }
        o0O00000.OooO0OO("Sign_in_window");
    }

    public final ra OooOOO() {
        return (ra) this.f46219o000oOoO.getValue();
    }

    public final pa OooOOO0() {
        return (pa) this.f46212OoooOoO.getValue();
    }

    public final sa OooOOOO() {
        return (sa) this.f46209OoooOOO.getValue();
    }

    public final ta OooOOOo() {
        return (ta) this.f46210OoooOOo.getValue();
    }

    public final void OooOOo() {
        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.not_network);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        ImageView imageView = OooOOO().f50435OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o00O0O.OooO0O0(imageView);
        TextView textView = OooOOO().f50436OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
        o00O0O.OooO0O0(textView);
        OooOOO().f50437OooO0o0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.not_network));
        OooOOO().f50434OooO0O0.removeAllViews();
        OooOOO().f50434OooO0O0.addView(((qa) this.f46211OoooOo0.getValue()).f50364OooO00o);
        StateButton stateButton = ((qa) this.f46211OoooOo0.getValue()).f50365OooO0O0;
        Intrinsics.checkNotNullExpressionValue(stateButton, "netFailedBinding.tvTryAgain");
        o00O0O.OooO0Oo(stateButton, new OooO());
    }

    public final void OooOOo0() {
        Oooo0 oooo0LoadTaskListData$default = SignTaskVM.loadTaskListData$default(this.f46208OoooOO0, 1, false, 2, null);
        Context context = this.f46207OoooO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        oooo0LoadTaskListData$default.observe((FragmentActivity) context, new o0OOO0o(this, 9));
    }

    public final void OooOOoo(int i) {
        this.f46215Ooooo0o = i;
        sa saVarOooOOOO = OooOOOO();
        if (this.f46216OooooO0 > 1) {
            TextView textView = saVarOooOOOO.f50530OooO;
            StringBuilder sbOooO00o = o00O0O0O.OooO00o('x');
            sbOooO00o.append(this.f46216OooooO0);
            textView.setText(sbOooO00o.toString());
            TextView textView2 = saVarOooOOOO.f50539OooOO0;
            StringBuilder sbOooO00o2 = o00O0O0O.OooO00o('x');
            sbOooO00o2.append(this.f46216OooooO0);
            textView2.setText(sbOooO00o2.toString());
            TextView textView3 = saVarOooOOOO.f50540OooOO0O;
            StringBuilder sbOooO00o3 = o00O0O0O.OooO00o('x');
            sbOooO00o3.append(this.f46216OooooO0);
            textView3.setText(sbOooO00o3.toString());
            TextView textView4 = saVarOooOOOO.f50541OooOO0o;
            StringBuilder sbOooO00o4 = o00O0O0O.OooO00o('x');
            sbOooO00o4.append(this.f46216OooooO0);
            textView4.setText(sbOooO00o4.toString());
            TextView textView5 = saVarOooOOOO.f50543OooOOO0;
            StringBuilder sbOooO00o5 = o00O0O0O.OooO00o('x');
            sbOooO00o5.append(this.f46216OooooO0);
            textView5.setText(sbOooO00o5.toString());
            TextView textView6 = saVarOooOOOO.f50542OooOOO;
            StringBuilder sbOooO00o6 = o00O0O0O.OooO00o('x');
            sbOooO00o6.append(this.f46216OooooO0);
            textView6.setText(sbOooO00o6.toString());
            TextView textView7 = saVarOooOOOO.f50544OooOOOO;
            StringBuilder sbOooO00o7 = o00O0O0O.OooO00o('x');
            sbOooO00o7.append(this.f46216OooooO0);
            textView7.setText(sbOooO00o7.toString());
        }
        if (!this.f46208OoooOO0.getHasSignInToday()) {
            switch (i) {
                case 0:
                    ImageView ivGet1 = saVarOooOOOO.f50545OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet1, "ivGet1");
                    o00O0O.OooO(ivGet1);
                    saVarOooOOOO.f50530OooO.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 1:
                    ImageView ivGet2 = saVarOooOOOO.f50547OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet2, "ivGet2");
                    o00O0O.OooO(ivGet2);
                    saVarOooOOOO.f50539OooOO0.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 2:
                    ImageView ivGet3 = saVarOooOOOO.f50546OooOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet3, "ivGet3");
                    o00O0O.OooO(ivGet3);
                    saVarOooOOOO.f50540OooOO0O.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 3:
                    ImageView ivGet4 = saVarOooOOOO.f50548OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(ivGet4, "ivGet4");
                    o00O0O.OooO(ivGet4);
                    saVarOooOOOO.f50541OooOO0o.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 4:
                    ImageView ivGet5 = saVarOooOOOO.f50551OooOo00;
                    Intrinsics.checkNotNullExpressionValue(ivGet5, "ivGet5");
                    o00O0O.OooO(ivGet5);
                    saVarOooOOOO.f50543OooOOO0.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 5:
                    ImageView ivGet6 = saVarOooOOOO.f50550OooOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet6, "ivGet6");
                    o00O0O.OooO(ivGet6);
                    saVarOooOOOO.f50542OooOOO.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
                case 6:
                    ImageView ivGet7 = saVarOooOOOO.f50552OooOo0O;
                    Intrinsics.checkNotNullExpressionValue(ivGet7, "ivGet7");
                    o00O0O.OooO(ivGet7);
                    saVarOooOOOO.f50544OooOOOO.setTextColor(o000O0O0.OooO00o(R.color.white));
                    break;
            }
        }
        if (i > 0) {
            ImageView ivSigned1 = saVarOooOOOO.f50553OooOo0o;
            Intrinsics.checkNotNullExpressionValue(ivSigned1, "ivSigned1");
            o00O0O.OooO(ivSigned1);
        }
        if (i > 1) {
            ImageView ivSigned2 = saVarOooOOOO.f50549OooOo;
            Intrinsics.checkNotNullExpressionValue(ivSigned2, "ivSigned2");
            o00O0O.OooO(ivSigned2);
        }
        if (i > 2) {
            ImageView ivSigned3 = saVarOooOOOO.f50555OooOoO0;
            Intrinsics.checkNotNullExpressionValue(ivSigned3, "ivSigned3");
            o00O0O.OooO(ivSigned3);
        }
        if (i > 3) {
            ImageView ivSigned4 = saVarOooOOOO.f50554OooOoO;
            Intrinsics.checkNotNullExpressionValue(ivSigned4, "ivSigned4");
            o00O0O.OooO(ivSigned4);
        }
        if (i > 4) {
            ImageView ivSigned5 = saVarOooOOOO.f50556OooOoOO;
            Intrinsics.checkNotNullExpressionValue(ivSigned5, "ivSigned5");
            o00O0O.OooO(ivSigned5);
        }
        if (i > 5) {
            ImageView ivSigned6 = saVarOooOOOO.f50558OooOoo0;
            Intrinsics.checkNotNullExpressionValue(ivSigned6, "ivSigned6");
            o00O0O.OooO(ivSigned6);
        }
        if (i > 6) {
            ImageView ivSigned7 = saVarOooOOOO.f50557OooOoo;
            Intrinsics.checkNotNullExpressionValue(ivSigned7, "ivSigned7");
            o00O0O.OooO(ivSigned7);
        }
        saVarOooOOOO.f50560OooOooo.setText(this.f46208OoooOO0.getSpannableStringBuilder(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.clock_in_tips), String.valueOf(i)), String.valueOf(i)));
    }

    public final void OooOo00() {
        ImageView imageView = OooOOO().f50435OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o00O0O.OooO(imageView);
        OooOOO().f50434OooO0O0.removeAllViews();
        OooOOO().f50434OooO0O0.addView(OooOOOo().f50641OooO00o);
        OooOOO().f50437OooO0o0.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.dialog_task));
        TextView textView = OooOOO().f50436OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
        o00O0O.OooO0O0(textView);
        OooOOOo().f50642OooO0O0.setLayoutManager(new FixLinearLayoutManager(this.f46207OoooO));
        this.f46214Ooooo00 = new OooOOO0(this.f46207OoooO);
        RecyclerView recyclerView = OooOOOo().f50642OooO0O0;
        p188o00o00o0.OooO0OO<TaskModel> oooO0OO = this.f46214Ooooo00;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        TextView textView2 = OooOOOo().f50643OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "taskListBinding.tvMoraTask");
        o00O0O.OooO0Oo(textView2, new OooOOO());
        OooOOo0();
    }
}
