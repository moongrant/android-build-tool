package com.yalla.yalla.ui.activity.moment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
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
import p377o0OOoOo.o0000OO0;
import p485o0o00O0.oOO;
import p485o0o00O0.oOO0OO;
import p485o0o00O0.oOO0OO0O;
import p485o0o00O0.oOOO00;
import p485o0o00O0.oOOO000o;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.i6;
import p641o0ooOOOO.v6;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicManagerActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopicManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicManagerActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicManagerActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,273:1\n22#2,2:274\n75#3,13:276\n*S KotlinDebug\n*F\n+ 1 TopicManagerActivity.kt\ncom/yalla/yalla/ui/activity/moment/TopicManagerActivity\n*L\n47#1:274,2\n67#1:276,13\n*E\n"})
public final class TopicManagerActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f26382OooOoO = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f26388OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public ArrayList<UserInfo> f26389OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f26383OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(i6.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26386OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicManagerVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicManagerActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26394OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26394OooO0Oo;
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
    public final Lazy f26385OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f26387OooOo0O = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f26384OooOo = 5;

    public static final class OooO00o extends Lambda implements Function0<o000000> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000 invoke() {
            return new o000000(TopicManagerActivity.this, oO00OO0O.moment_layout_topic_manager_list);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<v6> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v6 invoke() {
            v6 v6VarInflate = v6.inflate(TopicManagerActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(v6VarInflate, "inflate(layoutInflater)");
            return v6VarInflate;
        }
    }

    public static void OooOoO0(TopicManagerActivity topicManagerActivity) {
        int size = topicManagerActivity.OooOo().f10111OooOOoo.size();
        Lazy lazy = topicManagerActivity.f26385OooOo0;
        if (size <= 0) {
            ((v6) lazy.getValue()).f59057OooO00o.setVisibility(8);
            return;
        }
        ((v6) lazy.getValue()).f59057OooO00o.setVisibility(0);
        ((v6) lazy.getValue()).f59058OooO0O0.setText(o0000.OooO0OO(oO00OOo0.topic_info_manage_Topic_Admins_) + topicManagerActivity.OooOo().f10111OooOOoo.size() + "/" + topicManagerActivity.f26384OooOo);
    }

    public final o000O<UserInfo> OooOo() {
        return (o000O) this.f26387OooOo0O.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        o000O0Oo o000o0oo2 = this.f26383OooOOoo;
        setContentView(((i6) o000o0oo2.getValue()).f58120OooO00o);
        if (getIntent().hasExtra("TopicId")) {
            this.f26388OooOo0o = getIntent().getLongExtra("TopicId", 0L);
        }
        if (getIntent().hasExtra("Max_Admin_Count")) {
            this.f26384OooOo = getIntent().getIntExtra("Max_Admin_Count", 0);
        }
        if (getIntent().hasExtra("User_List")) {
            this.f26389OooOoO0 = (ArrayList) getIntent().getSerializableExtra("User_List");
        }
        if (this.f26388OooOo0o <= 0) {
            finish();
            return;
        }
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setTitle(oO00OOo0.topic_info_manage_Topic_Admins);
        }
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo(oOo00OO0.ic_topic_manager_add, new oOO(this));
        }
        Lazy lazy = this.f26385OooOo0;
        ((v6) lazy.getValue()).f59057OooO00o.setVisibility(8);
        ((i6) o000o0oo2.getValue()).f58121OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOo().OooOo0o();
        OooOo().Oooo000(oO00OOo0.topic_info_manage_No_admins);
        OooOo().OooOooo(oOo00OO0.ic_empty_default);
        OooOo().f10098OooO0o = new oOO0OO0O(this);
        OooOo().f10101OooO0oo = new oOO0OO(this);
        ((i6) o000o0oo2.getValue()).f58121OooO0O0.setAdapter(OooOo());
        OooOo().OooOo(((v6) lazy.getValue()).f59057OooO00o);
        ArrayList<UserInfo> arrayList = this.f26389OooOoO0;
        ViewModelLazy viewModelLazy = this.f26386OooOo00;
        if (arrayList == null) {
            ((TopicManagerVM) viewModelLazy.getValue()).circleAdmin(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(this.f26388OooOo0o))).observe(this, new o0000OO0(new oOOO000o(this), null, new oOOO00(this), false, 10));
        } else {
            if (arrayList.isEmpty()) {
                ((TopicManagerVM) viewModelLazy.getValue()).circleAdmin(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(this.f26388OooOo0o))).observe(this, new o0000OO0(new oOOO000o(this), null, new oOOO00(this), false, 10));
            } else {
                OooOo().OooOoO0(this.f26389OooOoO0);
                OooOoO0(this);
                o000O<UserInfo> o000oOooOo = OooOo();
                Boolean bool = Boolean.TRUE;
                o000oOooOo.Oooo0(bool, bool, bool);
            }
        }
        ((TopicManagerVM) viewModelLazy.getValue()).statisticalTime();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ((TopicManagerVM) this.f26386OooOo00.getValue()).statisticalTime();
    }
}
