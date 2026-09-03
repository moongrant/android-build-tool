package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.Oooo000;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00000OO;
import p142o00OOooO.oo000o;
import p192o00o0O0.o00000O0;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p254o00ooO0O.oOO00O;
import p534o0o0OOo0.o0OoOoOo;
import p536o0o0OOoo.p;
import p538o0o0Oo0.o0OO0;
import p538o0o0Oo0.o0OO00o0;
import p538o0o0Oo0.o0OO0O0;
import p538o0o0Oo0.o0OO0o00;
import p538o0o0Oo0.o0OOooO0;
import p649o0ooOOoo.cd;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicInfoActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicInfoActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22623OoooooO = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public TopicInfoModel f22625Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public TextView f22626Ooooo0o;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f22629OooooOo;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22624OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(cd.class), this, null);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22627OooooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicManagerVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicInfoActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22636Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22636Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final List<UserInfo> f22628OooooOO = new ArrayList();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22631Oooooo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public final Lazy f22630Oooooo = LazyKt.lazy(new OooO0OO());

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends Lambda implements Function0<Oooo000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Oooo000 invoke() {
            final Oooo000 oooo000 = new Oooo000(TopicInfoActivity.this);
            final TopicInfoActivity topicInfoActivity = TopicInfoActivity.this;
            oooo000.setEmptyText(R.string.no_data);
            oooo000.setLoadEndHint(o000O0O0.OooO0OO(R.string.topic_info_Display_up_to_200_users));
            oooo000.setEmptyImageRes(R.drawable.ic_empty_delete);
            oooo000.setLoadErrorClickListener(new Oooo0(topicInfoActivity));
            oooo000.setOnItemClickListener(new BaseQuickAdapter.OooOOOO() { // from class: o0o0Oo0.o0OO0o
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    TopicInfoActivity this$0 = topicInfoActivity;
                    Oooo000 this_apply = oooo000;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, this$0, String.valueOf(this_apply.getData().get(i).getUserId()), false, 12);
                }
            });
            o00000O0 o00000o1 = new o00000O0(topicInfoActivity);
            OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
            oooo000.setOnLoadMoreListener(o00000o1, topicInfoActivity.OooOooO().f49102OooO0O0);
            return oooo000;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<TopicInfoHeadView> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TopicInfoHeadView invoke() {
            return new TopicInfoHeadView(TopicInfoActivity.this, null, 0, 6, null);
        }
    }

    public static final void OooOoo(TopicInfoActivity topicInfoActivity, boolean z) {
        TopicManagerVM topicManagerVMOooo00O = topicInfoActivity.Oooo00O();
        TopicInfoModel topicInfoModel = topicInfoActivity.f22625Ooooo00;
        if (topicInfoModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel = null;
        }
        topicManagerVMOooo00O.circleMemberList(String.valueOf(topicInfoModel.getId()), z).observe(topicInfoActivity, new o0o0000.OooOo(new o0OOooO0(z, topicInfoActivity), null, new o0OO0o00(topicInfoActivity, z), false, 10));
    }

    public final cd OooOooO() {
        return (cd) this.f22624OoooOoo.getValue();
    }

    public final p188o00o00o0.OooO0OO<UserInfo> OooOooo() {
        return (p188o00o00o0.OooO0OO) this.f22631Oooooo0.getValue();
    }

    public final TopicInfoHeadView Oooo000() {
        return (TopicInfoHeadView) this.f22630Oooooo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicManagerVM Oooo00O() {
        return (TopicManagerVM) this.f22627OooooO0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.common.db.table.UserInfo>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TopicInfoModel topicInfoModel;
        TextView textView;
        super.onCreate(bundle);
        setContentView(OooOooO().f49101OooO00o);
        TopicInfoModel topicInfoModel2 = null;
        if (getIntent().hasExtra("info")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("info");
            if (serializableExtra instanceof TopicInfoModel) {
                topicInfoModel = (TopicInfoModel) serializableExtra;
            } else {
                topicInfoModel = null;
            }
        } else {
            topicInfoModel = null;
        }
        if (topicInfoModel == null || topicInfoModel.getId() <= 0) {
            finish();
        } else {
            this.f22625Ooooo00 = topicInfoModel;
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.Topic_Profile);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        TextView textViewOooOoo0 = headerLayout2 != null ? headerLayout2.OooOoo0(R.string.room_profile_settings, new o0OO00o0(this)) : null;
        this.f22626Ooooo0o = textViewOooOoo0;
        if (textViewOooOoo0 != null) {
            oOO00O.OooO00o(textViewOooOoo0);
        }
        TopicInfoModel topicInfoModel3 = this.f22625Ooooo00;
        if (topicInfoModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel3 = null;
        }
        if (topicInfoModel3.isOwner() && (textView = this.f22626Ooooo0o) != null) {
            oOO00O.OooO(textView);
        }
        OooOooO().f49102OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOooO().f49102OooO0O0.setAdapter(OooOooo());
        OooOooo().setHeaderView(Oooo000());
        TopicInfoHeadView topicInfoHeadViewOooo000 = Oooo000();
        TopicInfoModel topicInfoModel4 = this.f22625Ooooo00;
        if (topicInfoModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
            topicInfoModel4 = null;
        }
        topicInfoHeadViewOooo000.setTopicInfo(topicInfoModel4);
        this.f22628OooooOO.clear();
        TopicManagerVM topicManagerVMOooo00O = Oooo00O();
        TopicInfoModel topicInfoModel5 = this.f22625Ooooo00;
        if (topicInfoModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topicInfo");
        } else {
            topicInfoModel2 = topicInfoModel5;
        }
        topicManagerVMOooo00O.circleAdmin(String.valueOf(topicInfoModel2.getId())).observe(this, new o0o0000.OooOo(new o0OO0(this), null, new o0OO0O0(this), false, 10));
        LiveEventBus.get("TOPIC_HEADER", String.class).observe(this, new o00000OO(this, 4));
        int i = 2;
        LiveEventBus.get("TOPIC_DESC", String.class).observe(this, new oo000o(this, i));
        int i2 = 1;
        LiveEventBus.get("TOPIC_RULE", String.class).observe(this, new p142o00OOooO.o00000O0(this, i2));
        LiveEventBus.get("TOPIC_MANAGER_ADD", UserInfo.class).observe(this, new o0OoOoOo(this, i));
        LiveEventBus.get("TOPIC_MANAGER_DEL", String.class).observe(this, new p(this, i2));
        Oooo00O().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo00O().statisticalTime();
    }
}
