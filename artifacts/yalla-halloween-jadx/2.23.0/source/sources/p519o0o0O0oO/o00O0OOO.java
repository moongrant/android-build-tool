package p519o0o0O0oO;

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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000OO0;
import p402o0Oo0OOO.o00O000o;
import p420o0OoO0OO.o0OO00O;
import p464o0Oooo.o000000O;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p602o0oo0O0O.o0000O0O;
import p641o0ooOOOO.a4;
import p641o0ooOOOO.b4;
import p641o0ooOOOO.c4;
import p641o0ooOOOO.y3;
import p641o0ooOOOO.z3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0OOO extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Context f52566OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final SignTaskVM f52567OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f52568OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f52569OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final Lazy f52570OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f52571OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final boolean f52572OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f52573OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public OooOOOO f52574OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f52575OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f52576OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f52577OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final TaskViewModel f52578OooOo0o;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            o0OO000.OooO00o("101074");
            o00O0OOO.this.OooOO0o();
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
            o00O0OOO.this.OooO0O0();
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
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            o00o0ooo2.f52578OooOo0o.yallaChatBindTask(accessToken).observe(o00o0ooo2.f52534OooO0o0, new o0000OO0(new o00O(o00o0ooo2), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<y3> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final y3 invoke() {
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            y3 y3VarInflate = y3.inflate(LayoutInflater.from(o00o0ooo2.f52566OooOO0O), o00o0ooo2.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(y3VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return y3VarInflate;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<z3> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final z3 invoke() {
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            z3 z3VarInflate = z3.inflate(LayoutInflater.from(o00o0ooo2.f52566OooOO0O), o00o0ooo2.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(z3VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return z3VarInflate;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<OpenAuthManager> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OpenAuthManager invoke() {
            Context context = o00O0OOO.this.f52566OooOO0O;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return new OpenAuthManager((FragmentActivity) context);
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<a4> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final a4 invoke() {
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            a4 a4VarInflate = a4.inflate(LayoutInflater.from(o00o0ooo2.f52566OooOO0O), o00o0ooo2.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(a4VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return a4VarInflate;
        }
    }

    public static final class OooOOO implements Observer<Object> {

        @DebugMetadata(c = "com.yalla.yalla.ui.dialog.ClockDialog$show$1$onChanged$1", f = "ClockDialog.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f52587OooO0Oo;

            public OooO00o(Continuation<? super OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f52587OooO0Oo;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f52587OooO0Oo = 1;
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

        public OooOOO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            if (Intrinsics.areEqual(obj, Boolean.TRUE)) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(null), 3, null);
            }
            o00O0OOO.this.OooO0O0();
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f52588OooO0Oo;

        public OooOOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52588OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f52588OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f52588OooO0Oo;
        }

        public final int hashCode() {
            return this.f52588OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52588OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOOO extends o000O<SignTaskModel> {
        public OooOOOO(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            final ViewHolder helper = (ViewHolder) baseViewHolder;
            final SignTaskModel item = (SignTaskModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setImageResource(oO00O0oO.iv_icon_task, item.getIcon());
            if (item.getRewardMultiple() > 1) {
                helper.setText(oO00O0oO.ivDoubleReward, "x" + item.getRewardMultiple());
            }
            String strOooO0OO = o0000.OooO0OO(item.getName());
            if (item.getMaxNum() > 0 && item.getState() == 0) {
                strOooO0OO = strOooO0OO + "(" + item.getNum() + "/" + item.getMaxNum() + ")";
            }
            helper.setText(oO00O0oO.tv_name_task, strOooO0OO);
            if (p591o0oo000O.OooO.OooO0o0()) {
                helper.setText(oO00O0oO.tv_bonus_task, item.getRewardCoin() + "+");
            } else {
                helper.setText(oO00O0oO.tv_bonus_task, "+" + item.getRewardCoin());
            }
            if (item.getRewardType() == 1) {
                helper.setImageResource(oO00O0oO.ivReward, oOo00OO0.icon_coin_main_slide);
                helper.setTextColor(oO00O0oO.tv_bonus_task, o0000.OooO00o(oO00O0o.color_coin));
            } else {
                helper.setImageResource(oO00O0oO.ivReward, oOo00OO0.icon_crystal_task_item_min);
                helper.setTextColor(oO00O0oO.tv_bonus_task, o0000.OooO00o(oO00O0o.color_crystal));
            }
            helper.setGone(oO00O0oO.tv_bonus_task, item.getTakeId() != 37);
            helper.setGone(oO00O0oO.ivDoubleReward, item.getTakeId() != 37);
            Button button = (Button) helper.getView(oO00O0oO.bt_go);
            int state = item.getState();
            final o00O0OOO o00o0ooo2 = o00O0OOO.this;
            if (state == 0) {
                button.setEnabled(true);
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0o().getValue(), Boolean.TRUE)) {
                    int i = oO00OOo0.go_room_do_task;
                    String strOooO0OO2 = o0000.OooO0OO(i);
                    int i2 = oO00OOo0.Go;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) strOooO0OO2, o0000.OooO0OO(i2), 0, false, 6, (Object) null);
                    SpannableString spannableString = new SpannableString(o0000.OooO0OO(i));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#00D8C9"));
                    if (iIndexOf$default >= 0) {
                        spannableString.setSpan(foregroundColorSpan, iIndexOf$default, o0000.OooO0OO(i2).length() + iIndexOf$default, 18);
                    }
                    o00o0ooo2.OooOOO0().f57476OooO0Oo.setText(spannableString);
                } else {
                    o00o0ooo2.OooOOO0().f57476OooO0Oo.setText(o0000.OooO0OO(oO00OOo0.go_favorite_rooms));
                }
                button.setEnabled(true);
                button.setBackgroundResource(oOo00OO0.selector_btn_bg_green_line_gray_r360);
                button.setTextColor(o0000.OooO00o(oO00O0o.color_00d8c9));
                button.setText(o0000.OooO0OO(oO00OOo0.Go));
                TextView textView = o00o0ooo2.OooOOO0().f57476OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
                o000OO00.OooOOOO(textView);
            } else if (state != 1) {
                button.setEnabled(false);
                button.setBackgroundResource(oOo00OO0.bgs_button_fff2f3f5_r360);
                button.setTextColor(o0000.OooO00o(oO00O0o.color_999999));
                button.setText(oO00OOo0.task_Done);
            } else {
                button.setEnabled(true);
                button.setBackgroundResource(oOo00OO0.selector_btn_bg_green_gray_r360);
                button.setTextColor(o0000.OooO00o(oO00O0o.white));
                button.setText(oO00OOo0.Get);
            }
            button.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.o0oOO
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SignTaskModel item2 = item;
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    o00O0OOO.OooOOOO this$0 = this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    o00O0OOO this$1 = o00o0ooo2;
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
                            o0OO000.OooO0O0("101077", MapsKt.mapOf(new Pair("type", 2)));
                        } else {
                            o0OO000.OooO0O0("101076", MapsKt.mapOf(new Pair("type", 2)));
                        }
                        int takeId = item2.getTakeId();
                        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.Button");
                        String strValueOf = String.valueOf(item2.getRewardMultiple() * o0OoOo0.OooO0o(0, item2.getGetcrystal()));
                        int layoutPosition = helper2.getLayoutPosition();
                        o0OO00O<ApiResult<Long>> rewardCrystal = this$1.f52567OooOO0o.getRewardCrystal(takeId);
                        Context context = this$1.f52566OooOO0O;
                        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        rewardCrystal.observe((FragmentActivity) context, new o00OO0O0((Button) view, this$1, layoutPosition, strValueOf));
                        return;
                    }
                    if (item2.getTakeId() == 35) {
                        o0OO000.OooO0O0("101077", MapsKt.mapOf(new Pair("type", 2)));
                        o0O00o0 notInstall = new o0O00o0(this$1);
                        oo00oO action = new oo00oO(this$1);
                        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
                        Intrinsics.checkNotNullParameter(action, "action");
                        Context context2 = o000O0.f10354OooO00o;
                        Activity context3 = OooO0O0.OooO0O0();
                        if (context3 != null) {
                            Intrinsics.checkNotNullParameter(context3, "context");
                            try {
                                List<PackageInfo> installedPackages = context3.getPackageManager().getInstalledPackages(0);
                                Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
                                Iterator<T> it = installedPackages.iterator();
                                while (it.hasNext()) {
                                    String str = ((PackageInfo) it.next()).packageName;
                                    Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
                                    if (StringsKt__StringsKt.contains(str, "com.yallatech.yallachat", true)) {
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
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0O(null), 2, null);
                            return;
                        }
                    }
                    if (item2.getTakeId() == 37) {
                        o00O000o.o0Oo0oo o0oo0oo2 = o00O000o.f44506OooOOo0;
                        Context context4 = this$0.f10108OooOOOo;
                        Intrinsics.checkNotNull(context4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        o0oo0oo2.observe((FragmentActivity) context4, new o00O0OOO.OooOOO0(o0oOOo.f52778OooO0Oo));
                        this$1.OooO0O0();
                        return;
                    }
                    if (item2.getTakeId() == 38) {
                        int i3 = MomentSendActivity.f26175Oooo0OO;
                        Context context5 = this$0.f10108OooOOOo;
                        Intrinsics.checkNotNull(context5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        MomentSendActivity.OooO00o.OooO00o((FragmentActivity) context5);
                        this$1.OooO0O0();
                        return;
                    }
                    o0OO000.OooO0O0("101075", MapsKt.mapOf(new Pair("type", 2)));
                    this$1.getClass();
                    o000000O o000000o3 = o000000O.f46674OooO00o;
                    T value = o000000O.OooOo0o().getValue();
                    Intrinsics.checkNotNull(value);
                    if (((Boolean) value).booleanValue()) {
                        o0OO00O<ApiResult<RandomRoomModel>> randomRoomData = this$1.f52567OooOO0o.getRandomRoomData();
                        Context context6 = this$1.f52566OooOO0O;
                        Intrinsics.checkNotNull(context6, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                        randomRoomData.observe((FragmentActivity) context6, o0.f52446OooO0Oo);
                    }
                    this$1.OooO0O0();
                    LiveEventBus.get("EVENTMSG_TASK_TO_MAIN").post(0);
                }
            });
        }
    }

    public static final class OooOo extends Lambda implements Function0<b4> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b4 invoke() {
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            b4 b4VarInflate = b4.inflate(LayoutInflater.from(o00o0ooo2.f52566OooOO0O), o00o0ooo2.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(b4VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return b4VarInflate;
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
            o0OO000.OooO00o("101042");
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            o00o0ooo2.f52566OooOO0O.startActivity(new Intent(o00o0ooo2.f52566OooOO0O, (Class<?>) TaskActivity.class));
            o00o0ooo2.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<c4> {
        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c4 invoke() {
            o00O0OOO o00o0ooo2 = o00O0OOO.this;
            c4 c4VarInflate = c4.inflate(LayoutInflater.from(o00o0ooo2.f52566OooOO0O), o00o0ooo2.f52533OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(c4VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
            return c4VarInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(@NotNull Context mContext) {
        super(mContext, 0);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f52566OooOO0O = mContext;
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentActivity fragmentActivity = (FragmentActivity) mContext;
        this.f52567OooOO0o = (SignTaskVM) new ViewModelProvider(fragmentActivity).get(SignTaskVM.class);
        this.f52569OooOOO0 = LazyKt.lazy(new OooOO0O());
        this.f52568OooOOO = LazyKt.lazy(new OooOo());
        this.f52570OooOOOO = LazyKt.lazy(new Oooo000());
        this.f52571OooOOOo = LazyKt.lazy(new OooO0o());
        this.f52573OooOOo0 = LazyKt.lazy(new OooO0OO());
        this.f52572OooOOo = mContext instanceof MainActivity;
        this.f52576OooOo00 = -1;
        Lazy lazy = LazyKt.lazy(new OooOO0());
        this.f52577OooOo0O = lazy;
        ConstraintLayout constraintLayout = OooOOO0().f57473OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "rootBinding.root");
        OooO0oO(constraintLayout);
        Intrinsics.checkNotNull(mContext, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f52578OooOo0o = (TaskViewModel) new ViewModelProvider(fragmentActivity).get(TaskViewModel.class);
        ImageView imageView = OooOOO0().f57475OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o000OO00.OooO0oo(imageView, new OooO00o());
        ((OpenAuthManager) lazy.getValue()).f24730OooO0O0 = new OooO0O0();
    }

    public static final void OooOO0(o00O0OOO o00o0ooo2, int i) {
        if (o00o0ooo2.f52572OooOOo) {
            o0OO000.OooO00o("101038");
        } else {
            o0OO000.OooO00o("105061");
        }
        int i2 = o00o0ooo2.f52576OooOo00;
        if (i2 != -1) {
            if (i == 0 || i2 + 1 == i) {
                SignTaskVM signTaskVM = o00o0ooo2.f52567OooOO0o;
                if (signTaskVM.getHasSignInToday()) {
                    return;
                }
                o00o0ooo2.OooOOO().f57576OooOooO.setEnabled(false);
                o0OO00O<ApiResult<SignInModel>> o0oo00oSignIn = signTaskVM.signIn();
                Context context = o00o0ooo2.f52566OooOO0O;
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                o0oo00oSignIn.observe((FragmentActivity) context, new o00OO000(o00o0ooo2));
            }
        }
    }

    public static final void OooOO0O(o00O0OOO o00o0ooo2, int i) {
        o00o0ooo2.f52576OooOo00 = i;
        b4 b4VarOooOOO = o00o0ooo2.OooOOO();
        int i2 = o00o0ooo2.f52575OooOo0;
        if (i2 > 1) {
            b4VarOooOOO.f57547OooO.setText("x" + i2);
            b4VarOooOOO.f57556OooOO0.setText(android.support.v4.media.OooO00o.OooO00o("x", o00o0ooo2.f52575OooOo0));
            b4VarOooOOO.f57557OooOO0O.setText(android.support.v4.media.OooO00o.OooO00o("x", o00o0ooo2.f52575OooOo0));
            b4VarOooOOO.f57558OooOO0o.setText(android.support.v4.media.OooO00o.OooO00o("x", o00o0ooo2.f52575OooOo0));
            b4VarOooOOO.f57560OooOOO0.setText(android.support.v4.media.OooO00o.OooO00o("x", o00o0ooo2.f52575OooOo0));
            b4VarOooOOO.f57559OooOOO.setText(android.support.v4.media.OooO00o.OooO00o("x", o00o0ooo2.f52575OooOo0));
            b4VarOooOOO.f57561OooOOOO.setText(android.support.v4.media.OooO00o.OooO00o("x", o00o0ooo2.f52575OooOo0));
        }
        SignTaskVM signTaskVM = o00o0ooo2.f52567OooOO0o;
        if (!signTaskVM.getHasSignInToday()) {
            switch (i) {
                case 0:
                    ImageView ivGet1 = b4VarOooOOO.f57562OooOOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet1, "ivGet1");
                    o000OO00.OooOOOO(ivGet1);
                    b4VarOooOOO.f57547OooO.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
                case 1:
                    ImageView ivGet2 = b4VarOooOOO.f57564OooOOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet2, "ivGet2");
                    o000OO00.OooOOOO(ivGet2);
                    b4VarOooOOO.f57556OooOO0.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
                case 2:
                    ImageView ivGet3 = b4VarOooOOO.f57563OooOOo;
                    Intrinsics.checkNotNullExpressionValue(ivGet3, "ivGet3");
                    o000OO00.OooOOOO(ivGet3);
                    b4VarOooOOO.f57557OooOO0O.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
                case 3:
                    ImageView ivGet4 = b4VarOooOOO.f57565OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(ivGet4, "ivGet4");
                    o000OO00.OooOOOO(ivGet4);
                    b4VarOooOOO.f57558OooOO0o.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
                case 4:
                    ImageView ivGet5 = b4VarOooOOO.f57568OooOo00;
                    Intrinsics.checkNotNullExpressionValue(ivGet5, "ivGet5");
                    o000OO00.OooOOOO(ivGet5);
                    b4VarOooOOO.f57560OooOOO0.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
                case 5:
                    ImageView ivGet6 = b4VarOooOOO.f57567OooOo0;
                    Intrinsics.checkNotNullExpressionValue(ivGet6, "ivGet6");
                    o000OO00.OooOOOO(ivGet6);
                    b4VarOooOOO.f57559OooOOO.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
                case 6:
                    ImageView ivGet7 = b4VarOooOOO.f57569OooOo0O;
                    Intrinsics.checkNotNullExpressionValue(ivGet7, "ivGet7");
                    o000OO00.OooOOOO(ivGet7);
                    b4VarOooOOO.f57561OooOOOO.setTextColor(o0000.OooO00o(oO00O0o.white));
                    break;
            }
        }
        if (i > 0) {
            ImageView ivSigned1 = b4VarOooOOO.f57570OooOo0o;
            Intrinsics.checkNotNullExpressionValue(ivSigned1, "ivSigned1");
            o000OO00.OooOOOO(ivSigned1);
        }
        if (i > 1) {
            ImageView ivSigned2 = b4VarOooOOO.f57566OooOo;
            Intrinsics.checkNotNullExpressionValue(ivSigned2, "ivSigned2");
            o000OO00.OooOOOO(ivSigned2);
        }
        if (i > 2) {
            ImageView ivSigned3 = b4VarOooOOO.f57572OooOoO0;
            Intrinsics.checkNotNullExpressionValue(ivSigned3, "ivSigned3");
            o000OO00.OooOOOO(ivSigned3);
        }
        if (i > 3) {
            ImageView ivSigned4 = b4VarOooOOO.f57571OooOoO;
            Intrinsics.checkNotNullExpressionValue(ivSigned4, "ivSigned4");
            o000OO00.OooOOOO(ivSigned4);
        }
        if (i > 4) {
            ImageView ivSigned5 = b4VarOooOOO.f57573OooOoOO;
            Intrinsics.checkNotNullExpressionValue(ivSigned5, "ivSigned5");
            o000OO00.OooOOOO(ivSigned5);
        }
        if (i > 5) {
            ImageView ivSigned6 = b4VarOooOOO.f57575OooOoo0;
            Intrinsics.checkNotNullExpressionValue(ivSigned6, "ivSigned6");
            o000OO00.OooOOOO(ivSigned6);
        }
        if (i > 6) {
            ImageView ivSigned7 = b4VarOooOOO.f57574OooOoo;
            Intrinsics.checkNotNullExpressionValue(ivSigned7, "ivSigned7");
            o000OO00.OooOOOO(ivSigned7);
        }
        b4VarOooOOO.f57577OooOooo.setText(signTaskVM.getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.clock_in_tips), String.valueOf(i)), String.valueOf(i)));
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO() {
        super.OooO();
        OooOO0o();
        Observable<Object> observable = LiveEventBus.get("DISMISS_CLOCK_ICON");
        Context context = this.f52566OooOO0O;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        observable.observe((FragmentActivity) context, new OooOOO());
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0O0() {
        super.OooO0O0();
        this.f52567OooOO0o.getHasSignInToday();
        if (this.f52572OooOOo) {
            o0OO000.OooO00o("101039");
        } else {
            o0OO000.OooO00o("105060");
        }
    }

    public final void OooOO0o() {
        NetworkStateUtil networkStateUtil = NetworkStateUtil.INSTANCE;
        Context applicationContext = this.f52532OooO0Oo.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        if (!networkStateUtil.isConnected(applicationContext)) {
            OooOOOo();
            return;
        }
        SignTaskVM signTaskVM = this.f52567OooOO0o;
        boolean z = this.f52572OooOOo;
        if (z && signTaskVM.getHasSignInToday()) {
            OooOOo0();
            return;
        }
        a4 a4VarOooOOO0 = OooOOO0();
        ImageView ivDismiss = a4VarOooOOO0.f57475OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivDismiss, "ivDismiss");
        o000OO00.OooOOOO(ivDismiss);
        TextView tvContent = a4VarOooOOO0.f57476OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
        o000OO00.OooOOOO(tvContent);
        a4VarOooOOO0.f57477OooO0o0.setText(o0000.OooO0OO(oO00OOo0.clock_in_title));
        tvContent.setText(o0000.OooO0OO(oO00OOo0.Sign_7_days_tips));
        LinearLayout linearLayout = a4VarOooOOO0.f57474OooO0O0;
        linearLayout.removeAllViews();
        linearLayout.addView(OooOOO().f57548OooO00o);
        o0OO00O<ApiResult<CheckInAddUpWeekModel>> o0oo00oLoadSignDayData = signTaskVM.loadSignDayData();
        Context context = this.f52566OooOO0O;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        o0oo00oLoadSignDayData.observe((FragmentActivity) context, new OooOOO0(new oo0O(this)));
        b4 b4VarOooOOO = OooOOO();
        b4VarOooOOO.f57576OooOooO.setText(signTaskVM.getHasSignInToday() ? o0000.OooO0OO(oO00OOo0.sign_in_today) : o0000.OooO0OO(oO00OOo0.clock_in_sign));
        boolean z2 = !signTaskVM.getHasSignInToday();
        StateButton signIn = b4VarOooOOO.f57576OooOooO;
        signIn.setEnabled(z2);
        signIn.setPressed(!signTaskVM.getHasSignInToday());
        CardView flSignIn1 = b4VarOooOOO.f57549OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flSignIn1, "flSignIn1");
        o000OO00.OooO0oo(flSignIn1, new o00OO(this));
        CardView flSignIn2 = b4VarOooOOO.f57550OooO0OO;
        Intrinsics.checkNotNullExpressionValue(flSignIn2, "flSignIn2");
        o000OO00.OooO0oo(flSignIn2, new o00OOO00(this));
        CardView flSignIn3 = b4VarOooOOO.f57551OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn3, "flSignIn3");
        o000OO00.OooO0oo(flSignIn3, new o00OOO0(this));
        CardView flSignIn4 = b4VarOooOOO.f57553OooO0o0;
        Intrinsics.checkNotNullExpressionValue(flSignIn4, "flSignIn4");
        o000OO00.OooO0oo(flSignIn4, new o00OOO0O(this));
        CardView flSignIn5 = b4VarOooOOO.f57552OooO0o;
        Intrinsics.checkNotNullExpressionValue(flSignIn5, "flSignIn5");
        o000OO00.OooO0oo(flSignIn5, new o0o0Oo(this));
        CardView flSignIn6 = b4VarOooOOO.f57554OooO0oO;
        Intrinsics.checkNotNullExpressionValue(flSignIn6, "flSignIn6");
        o000OO00.OooO0oo(flSignIn6, new o00OOOO0(this));
        CardView flSignIn7 = b4VarOooOOO.f57555OooO0oo;
        Intrinsics.checkNotNullExpressionValue(flSignIn7, "flSignIn7");
        o000OO00.OooO0oo(flSignIn7, new o00OOOOo(this));
        Intrinsics.checkNotNullExpressionValue(signIn, "signIn");
        o000OO00.OooO0oo(signIn, new o00Oo00(this));
        if (!z || signTaskVM.getHasSignInToday()) {
            return;
        }
        o0OO000.OooO00o("301003");
    }

    public final b4 OooOOO() {
        return (b4) this.f52568OooOOO.getValue();
    }

    public final a4 OooOOO0() {
        return (a4) this.f52569OooOOO0.getValue();
    }

    public final c4 OooOOOO() {
        return (c4) this.f52570OooOOOO.getValue();
    }

    public final void OooOOOo() {
        int i = oO00OOo0.not_network;
        String strOooO0OO = o0000.OooO0OO(i);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        ImageView imageView = OooOOO0().f57475OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o000OO00.OooO0OO(imageView);
        TextView textView = OooOOO0().f57476OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
        o000OO00.OooO0OO(textView);
        OooOOO0().f57477OooO0o0.setText(o0000.OooO0OO(i));
        OooOOO0().f57474OooO0O0.removeAllViews();
        LinearLayout linearLayout = OooOOO0().f57474OooO0O0;
        Lazy lazy = this.f52571OooOOOo;
        linearLayout.addView(((z3) lazy.getValue()).f59438OooO00o);
        StateButton stateButton = ((z3) lazy.getValue()).f59439OooO0O0;
        Intrinsics.checkNotNullExpressionValue(stateButton, "netFailedBinding.tvTryAgain");
        o000OO00.OooO0oo(stateButton, new OooO());
    }

    public final void OooOOo0() {
        ImageView imageView = OooOOO0().f57475OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "rootBinding.ivDismiss");
        o000OO00.OooOOOO(imageView);
        OooOOO0().f57474OooO0O0.removeAllViews();
        OooOOO0().f57474OooO0O0.addView(OooOOOO().f57650OooO00o);
        OooOOO0().f57477OooO0o0.setText(o0000.OooO0OO(oO00OOo0.dialog_task));
        TextView textView = OooOOO0().f57476OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "rootBinding.tvContent");
        o000OO00.OooO0OO(textView);
        RecyclerView recyclerView = OooOOOO().f57651OooO0O0;
        Context context = this.f52566OooOO0O;
        recyclerView.setLayoutManager(new FixLinearLayoutManager(context));
        this.f52574OooOOoo = new OooOOOO(context, oO00OO0O.main_clock_dialog_task_item);
        RecyclerView recyclerView2 = OooOOOO().f57651OooO0O0;
        OooOOOO oooOOOO = this.f52574OooOOoo;
        if (oooOOOO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooOOOO = null;
        }
        recyclerView2.setAdapter(oooOOOO);
        TextView textView2 = OooOOOO().f57652OooO0OO;
        Intrinsics.checkNotNullExpressionValue(textView2, "taskListBinding.tvMoraTask");
        o000OO00.OooO0oo(textView2, new OooOo00());
        o0OO00O o0oo00oLoadTaskListData$default = SignTaskVM.loadTaskListData$default(this.f52567OooOO0o, 1, false, 2, null);
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        o0oo00oLoadTaskListData$default.observe((FragmentActivity) context, new o00OO0OO(this));
    }
}
