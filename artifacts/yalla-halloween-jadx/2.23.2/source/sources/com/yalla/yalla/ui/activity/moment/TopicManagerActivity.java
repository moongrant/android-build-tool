package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.o000O0Oo;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oOO0;
import p405o0Oo0OOO.oOOO000o;
import p492o0o00OO0.oO;
import p492o0o00OO0.oOO0000;
import p492o0o00OO0.oOO00000;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicManagerActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicManagerActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicManagerActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,273:1\n22#2,2:274\n75#3,13:276\n*S KotlinDebug\n*F\n+ 1 TopicManagerActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicManagerActivity\n*L\n47#1:274,2\n67#1:276,13\n*E\n"})
public final class TopicManagerActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f25931OooOoO = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f25937OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ArrayList<UserInfo> f25938OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f25932OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oOO0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25935OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicManagerVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicManagerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.moment.TopicManagerActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.moment.TopicManagerActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25943OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25943OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25934OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f25936OooOo0O = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f25933OooOo = 5;

    public static final class OooO00o extends Lambda implements Function0<o000000> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000 invoke() {
            return new o000000(TopicManagerActivity.this, p562o0oOo000.oo0o0Oo.moment_layout_topic_manager_list);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oOOO000o> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOOO000o invoke() {
            oOOO000o oooo000oInflate = oOOO000o.inflate(TopicManagerActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(oooo000oInflate, "inflate(...)");
            return oooo000oInflate;
        }
    }

    public static void OooOoO0(TopicManagerActivity topicManagerActivity) {
        int size = topicManagerActivity.OooOo().f13189OooOOoo.size();
        Lazy lazy = topicManagerActivity.f25934OooOo0;
        if (size <= 0) {
            ((oOOO000o) lazy.getValue()).f45140OooO00o.setVisibility(8);
            return;
        }
        ((oOOO000o) lazy.getValue()).f45140OooO00o.setVisibility(0);
        ((oOOO000o) lazy.getValue()).f45141OooO0O0.setText(o0000.OooO0OO(p562o0oOo000.o000000.topic_info_manage_Topic_Admins_) + topicManagerActivity.OooOo().f13189OooOOoo.size() + "/" + topicManagerActivity.f25933OooOo);
    }

    public final o0000oo<UserInfo> OooOo() {
        return (o0000oo) this.f25936OooOo0O.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0 o000o0 = this.f25932OooOOoo;
        setContentView(((oOO0) o000o0.getValue()).f45009OooO00o);
        if (getIntent().hasExtra("TopicId")) {
            this.f25937OooOo0o = getIntent().getLongExtra("TopicId", 0L);
        }
        if (getIntent().hasExtra("Max_Admin_Count")) {
            this.f25933OooOo = getIntent().getIntExtra("Max_Admin_Count", 0);
        }
        if (getIntent().hasExtra("User_List")) {
            this.f25938OooOoO0 = (ArrayList) getIntent().getSerializableExtra("User_List");
        }
        if (this.f25937OooOo0o <= 0) {
            finish();
            return;
        }
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(p562o0oOo000.o000000.topic_info_manage_Topic_Admins);
        }
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo(p562o0oOo000.o0Oo0oo.ic_topic_manager_add, new oO(this));
        }
        Lazy lazy = this.f25934OooOo0;
        ((oOOO000o) lazy.getValue()).f45140OooO00o.setVisibility(8);
        ((oOO0) o000o0.getValue()).f45010OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().OooOo0o();
        OooOo().Oooo000(p562o0oOo000.o000000.topic_info_manage_No_admins);
        OooOo().OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_default);
        OooOo().f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: o0o00OO0.oO0OO0O
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
            public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                int i2 = TopicManagerActivity.f25931OooOoO;
                TopicManagerActivity this$0 = this.f49446OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
                this$0.getClass();
                UserInfoActivity.OooO00o.OooO0OO(oooO00o, this$0, String.valueOf(this$0.OooOo().f13189OooOOoo.get(i).getUserId()), false, 12);
            }
        };
        OooOo().f13179OooO0oo = new o000O0Oo(this);
        ((oOO0) o000o0.getValue()).f45010OooO0O0.setAdapter(OooOo());
        OooOo().OooOo(((oOOO000o) lazy.getValue()).f45140OooO00o);
        ArrayList<UserInfo> arrayList = this.f25938OooOoO0;
        ViewModelLazy viewModelLazy = this.f25935OooOo00;
        if (arrayList == null) {
            ((TopicManagerVM) viewModelLazy.getValue()).circleAdmin(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(this.f25937OooOo0o))).observe(this, new p384o0OOoo0O.o000oOoO(new oOO00000(this), null, new oOO0000(this), false, 10));
        } else {
            if (arrayList.isEmpty()) {
                ((TopicManagerVM) viewModelLazy.getValue()).circleAdmin(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(this.f25937OooOo0o))).observe(this, new p384o0OOoo0O.o000oOoO(new oOO00000(this), null, new oOO0000(this), false, 10));
            } else {
                OooOo().OooOoO0(this.f25938OooOoO0);
                OooOoO0(this);
                o0000oo<UserInfo> o0000ooVarOooOo = OooOo();
                Boolean bool = Boolean.TRUE;
                o0000ooVarOooOo.Oooo0(bool, bool, bool);
            }
        }
        ((TopicManagerVM) viewModelLazy.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicManagerVM) this.f25935OooOo00.getValue()).statisticalTime();
    }
}
