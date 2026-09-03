package com.yalla.yalla.ui.activity.moment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.app.selectPicture.view.FixLinearLayoutManager;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.vm.moment.TopicManagerVM;
import java.util.ArrayList;
import java.util.Iterator;
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
import p192o00o0O0.o0000;
import p192o00o0O0.o0000Ooo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p538o0o0Oo0.o0OOO0OO;
import p538o0o0Oo0.o0OOOO00;
import p538o0o0Oo0.o0OOOO0o;
import p649o0ooOOoo.dd;
import p649o0ooOOoo.yd;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/moment/TopicManagerActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicManagerActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22638Oooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public long f22643OooooOO;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public ArrayList<UserInfo> f22645Oooooo0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22639OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(dd.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22640Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TopicManagerVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.moment.TopicManagerActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22650Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22650Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f22641Ooooo0o = LazyKt.lazy(new OooO0OO());

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f22642OooooO0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f22644OooooOo = 5;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context, long j, int i, @Nullable List<UserInfo> list) {
            Intrinsics.checkNotNullParameter(context, "context");
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((UserInfo) it.next());
                }
            }
            Intent intent = new Intent(context, (Class<?>) TopicManagerActivity.class);
            intent.putExtra("TopicId", j);
            intent.putExtra("Max_Admin_Count", i);
            intent.putExtra("User_List", arrayList);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0OoOo0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0OoOo0 invoke() {
            return new o0OoOo0(TopicManagerActivity.this);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<yd> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final yd invoke() {
            yd ydVarInflate = yd.inflate(TopicManagerActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(ydVarInflate, "inflate(layoutInflater)");
            return ydVarInflate;
        }
    }

    public static void Oooo00O(TopicManagerActivity topicManagerActivity) {
        if (topicManagerActivity.OooOoo().getData().size() <= 0) {
            topicManagerActivity.OooOooo().f51025OooO00o.setVisibility(8);
            return;
        }
        topicManagerActivity.OooOooo().f51025OooO00o.setVisibility(0);
        topicManagerActivity.OooOooo().f51026OooO0O0.setText(o000O0O0.OooO0OO(R.string.topic_info_manage_Topic_Admins_) + topicManagerActivity.OooOoo().getData().size() + '/' + topicManagerActivity.f22644OooooOo);
    }

    public final p188o00o00o0.OooO0OO<UserInfo> OooOoo() {
        return (p188o00o00o0.OooO0OO) this.f22642OooooO0.getValue();
    }

    public final dd OooOooO() {
        return (dd) this.f22639OoooOoo.getValue();
    }

    public final yd OooOooo() {
        return (yd) this.f22641Ooooo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TopicManagerVM Oooo000() {
        return (TopicManagerVM) this.f22640Ooooo00.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49177OooO00o);
        if (getIntent().hasExtra("TopicId")) {
            this.f22643OooooOO = getIntent().getLongExtra("TopicId", 0L);
        }
        if (getIntent().hasExtra("Max_Admin_Count")) {
            this.f22644OooooOo = getIntent().getIntExtra("Max_Admin_Count", 0);
        }
        if (getIntent().hasExtra("User_List")) {
            this.f22645Oooooo0 = (ArrayList) getIntent().getSerializableExtra("User_List");
        }
        if (this.f22643OooooOO <= 0) {
            finish();
            return;
        }
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.topic_info_manage_Topic_Admins);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoOO(R.drawable.ic_topic_manager_add, new o0OOO0OO(this));
        }
        OooOooo().f51025OooO00o.setVisibility(8);
        OooOooO().f49178OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        OooOoo().setHeaderAndEmpty(true);
        OooOoo().setEmptyText(R.string.topic_info_manage_No_admins);
        OooOoo().setEmptyImageRes(R.drawable.ic_empty_default);
        OooOoo().setOnItemClickListener(new o0000Ooo(this));
        OooOoo().setOnItemChildClickListener(new o0000(this));
        OooOooO().f49178OooO0O0.setAdapter(OooOoo());
        OooOoo().setHeaderView(OooOooo().f51025OooO00o);
        ArrayList<UserInfo> arrayList = this.f22645Oooooo0;
        if (arrayList == null) {
            Oooo000().circleAdmin(com.yalla.support.common.util.OooO.OooO(Long.valueOf(this.f22643OooooOO), "")).observe(this, new o0o0000.OooOo(new o0OOOO00(this), null, new o0OOOO0o(this), false, 10));
        } else {
            if (arrayList.isEmpty()) {
                Oooo000().circleAdmin(com.yalla.support.common.util.OooO.OooO(Long.valueOf(this.f22643OooooOO), "")).observe(this, new o0o0000.OooOo(new o0OOOO00(this), null, new o0OOOO0o(this), false, 10));
            } else {
                OooOoo().setNewData(this.f22645Oooooo0);
                Oooo00O(this);
                p188o00o00o0.OooO0OO<UserInfo> oooO0OOOooOoo = OooOoo();
                Boolean bool = Boolean.TRUE;
                oooO0OOOooOoo.setLoadComplete(bool, bool, bool);
            }
        }
        Oooo000().statisticalTime();
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Oooo000().statisticalTime();
    }
}
