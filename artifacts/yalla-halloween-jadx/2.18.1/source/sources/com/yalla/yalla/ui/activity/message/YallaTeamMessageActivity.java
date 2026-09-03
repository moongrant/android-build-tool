package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.ml.OooO;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.model.YallaTeamFeedbackType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.vm.message.YallaTeamVM;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import o0o0000.OooOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p031OoooO.o0000O;
import p143o00OOooo.o00O0O00;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.o0O0ooO;
import p391o0OOooOo.o0O00000;
import p516o0o0O000.o00000;
import p536o0o0OOoo.f2;
import p536o0o0OOoo.g2;
import p536o0o0OOoo.h2;
import p536o0o0OOoo.i2;
import p536o0o0OOoo.j2;
import p536o0o0OOoo.k2;
import p536o0o0OOoo.l2;
import p536o0o0OOoo.n2;
import p536o0o0OOoo.o2;
import p536o0o0OOoo.q2;
import p536o0o0OOoo.r2;
import p536o0o0OOoo.s2;
import p563o0oOo0.o00O0O0O;
import p563o0oOo0.oOO00O;
import p649o0ooOOoo.rb;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/YallaTeamMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class YallaTeamMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22251OoooooO = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f22254Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public TextView f22255OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public oOO00O f22256OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Nullable
    public o00O0O0O f22257OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f22258Oooooo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22252OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(rb.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22253Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(YallaTeamVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22262Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22262Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f22259Oooooo0 = true;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
        }
    }

    public final void OooOoo() {
        if (OooOooO().f50439OooO0O0.getText().toString().length() > 0) {
            OooOooO().f50440OooO0OO.setImageResource(R.drawable.yalla_team_send_active);
        } else {
            OooOooO().f50440OooO0OO.setImageResource(R.drawable.yalla_team_send_default);
        }
    }

    public final rb OooOooO() {
        return (rb) this.f22252OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final YallaTeamVM OooOooo() {
        return (YallaTeamVM) this.f22253Ooooo00.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooO().f50440OooO0OO)) {
            String string = OooOooO().f50439OooO0O0.getText().toString();
            if (StringsKt.isBlank(string) || this.f22254Ooooo0o || this.f22257OooooOo == null) {
                return;
            }
            boolean z = true;
            if (StringsKt.trim((CharSequence) string).toString().length() >= 10) {
                this.f22254Ooooo0o = true;
                YallaTeamVM yallaTeamVMOooOooo = OooOooo();
                String string2 = StringsKt.trim((CharSequence) string).toString();
                o00O0O0O o00o0o0o2 = this.f22257OooooOo;
                Intrinsics.checkNotNull(o00o0o0o2);
                o00O0O0O o00o0o0o3 = this.f22257OooooOo;
                Intrinsics.checkNotNull(o00o0o0o3);
                YallaTeamFeedbackType item = o00o0o0o2.getItem(o00o0o0o3.f45086OooO00o);
                Intrinsics.checkNotNull(item);
                yallaTeamVMOooOooo.sendFeedback(string2, item.getTypeId()).observe(this, new OooOo(new r2(this), null, new s2(this), false, 10));
                return;
            }
            String strOooO0OO = OooOOO.OooO0OO(R.string.message_yalla_team_send_tips);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50438OooO00o);
        o0O00000.OooO0OO("Message_team");
        OooOo(R.string.YallaTeamActivity_item_YallaTeam);
        HeaderLayout headerLayout = this.f11463OoooO;
        this.f22255OooooO0 = headerLayout != null ? headerLayout.OooOoo0(R.string.clear, new h2(this)) : null;
        OooOooo().getMessageCount().observe(this, new o00O0O00(this, 3));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setReverseLayout(true);
        OooOooO().f50441OooO0Oo.setLayoutManager(linearLayoutManager);
        oOO00O ooo00o = new oOO00O();
        this.f22256OooooOO = ooo00o;
        ooo00o.OooO0oO(OooOooo().getYallaTeamMessage());
        oOO00O ooo00o2 = this.f22256OooooOO;
        if (ooo00o2 != null) {
            ooo00o2.f45109OooOOo0 = new i2(this);
        }
        oOO00O ooo00o3 = this.f22256OooooOO;
        if (ooo00o3 != null) {
            ooo00o3.f45108OooOOo = new j2(this);
        }
        oOO00O ooo00o4 = this.f22256OooooOO;
        if (ooo00o4 != null) {
            ooo00o4.f45110OooOOoo = new k2(this);
        }
        oOO00O ooo00o5 = this.f22256OooooOO;
        if (ooo00o5 != null) {
            ooo00o5.OooO0o0(new l2(this));
        }
        oOO00O ooo00o6 = this.f22256OooooOO;
        if (ooo00o6 != null) {
            ooo00o6.f45111OooOo00 = new n2(this);
        }
        oOO00O ooo00o7 = this.f22256OooooOO;
        if (ooo00o7 != null) {
            o2 listener = new o2(this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            ooo00o7.f40457OooOO0o = listener;
        }
        oOO00O ooo00o8 = this.f22256OooooOO;
        if (ooo00o8 != null) {
            ooo00o8.OooO0OO(R.id.ivHeader);
        }
        oOO00O ooo00o9 = this.f22256OooooOO;
        if (ooo00o9 != null) {
            q2 listener2 = new q2(this);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            ooo00o9.f40458OooOOO = listener2;
        }
        oOO00O ooo00o10 = this.f22256OooooOO;
        if (ooo00o10 != null) {
            ooo00o10.OooO0Oo(R.id.tvContent);
        }
        OooOooO().f50441OooO0Oo.addOnScrollListener(new g2(this));
        OooOooO().f50441OooO0Oo.setAdapter(this.f22256OooooOO);
        RecyclerView recyclerView = OooOooO().f50441OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMessage");
        o00000.OooO0O0(recyclerView, (11 & 1) != 0 ? 100L : 0L, 0L, (11 & 4) != 0 ? 100L : 0L, (11 & 8) != 0 ? 100L : 0L);
        ArrayList arrayList = new ArrayList();
        String strOooO0OO = OooOOO.OooO0OO(R.string.app_problems);
        YallaTeamFeedbackType.Companion companion = YallaTeamFeedbackType.INSTANCE;
        arrayList.add(new YallaTeamFeedbackType(strOooO0OO, companion.getAppProblems()));
        arrayList.add(new YallaTeamFeedbackType(OooOOO.OooO0OO(R.string.suggest_new_features), companion.getSuggestions()));
        arrayList.add(new YallaTeamFeedbackType(OooOOO.OooO0OO(R.string.contribute_crazy_words), companion.getRecharge()));
        arrayList.add(new YallaTeamFeedbackType(OooOOO.OooO0OO(R.string.Others), companion.getOthers()));
        OooOooO().f50442OooO0o0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        o00O0O0O o00o0o0o2 = new o00O0O0O(this, arrayList);
        this.f22257OooooOo = o00o0o0o2;
        o00o0o0o2.setOnItemClickListener(new OooO(this, 3));
        OooOooO().f50442OooO0o0.setAdapter(this.f22257OooooOo);
        OooOooO().f50439OooO0O0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(ShopVehicleListModel.VehicleTagType_Vip300)});
        EditText editText = OooOooO().f50439OooO0O0;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etMessage");
        editText.addTextChangedListener(new f2(this));
        OooOooO().f50441OooO0Oo.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOoo.b2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                YallaTeamMessageActivity this$0 = this.f43757Oooo0o;
                YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (motionEvent.getAction() == 0) {
                    EditText view2 = this$0.OooOooO().f50439OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(view2, "binding.etMessage");
                    Intrinsics.checkNotNullParameter(view2, "view");
                    Context context = view2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "view.context");
                    p470o0Oooo0.o00O000.OooO00o(context).hideSoftInputFromWindow(view2.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(view2, "view.context"), new Handler()));
                    this$0.OooOoo();
                }
                return false;
            }
        });
        OooOooO().f50440OooO0OO.setOnClickListener(this);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Yalla_Notice_YallaTeam", ViewHierarchyConstants.TAG_KEY);
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_YallaTeam", 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        OooOooo().updateAllMessageStateRead();
    }
}
