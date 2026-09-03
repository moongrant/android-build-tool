package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oOO0OOO;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.v4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/FriendRequestMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFriendRequestMessageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FriendRequestMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/FriendRequestMessageActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,139:1\n22#2,2:140\n75#3,13:142\n*S KotlinDebug\n*F\n+ 1 FriendRequestMessageActivity.kt\ncom/yalla/yalla/ui/activity/message/FriendRequestMessageActivity\n*L\n29#1:140,2\n30#1:142,13\n*E\n"})
public final class FriendRequestMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f25650OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public TextView f25652OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public com.yalla.yalla.ui.adapter.o00O0O f25654OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0Oo f25651OooOOoo = new com.code.android.util.o000O0Oo(Reflection.getOrCreateKotlinClass(v4.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f25653OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FriendRequestMessageVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f25658OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25658OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f25655OooO0Oo;

        public OooO00o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f25655OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f25655OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f25655OooO0Oo;
        }

        public final int hashCode() {
            return this.f25655OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f25655OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo(FriendRequestMessageActivity friendRequestMessageActivity, boolean z, long j) {
        friendRequestMessageActivity.getClass();
        BaseActivityK.OooOo0o(friendRequestMessageActivity, null, 0L, 3);
        friendRequestMessageActivity.OooOoO().applyFriendRequest(z, j).observe(friendRequestMessageActivity, new OooO00o(new o0OoOo0(friendRequestMessageActivity)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FriendRequestMessageVM OooOoO() {
        return (FriendRequestMessageVM) this.f25653OooOo00.getValue();
    }

    public final v4 OooOoO0() {
        return (v4) this.f25651OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f59044OooO00o);
        p587o0oOooo.o0OO000.OooO00o("204001");
        OooOOoo(oO00OOo0.Friend_Requests);
        HeaderLayout headerLayout = this.f22755OooOO0;
        this.f25652OooOo0 = headerLayout != null ? headerLayout.OooOoO0(oO00OOo0.Clear, new View.OnClickListener() { // from class: com.yalla.yalla.ui.activity.message.o000oOoO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = FriendRequestMessageActivity.f25650OooOo0o;
                FriendRequestMessageActivity this$0 = this.f25825OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                p157o00OoOO0.o0OO00O o0oo00o2 = new p157o00OoOO0.o0OO00O(this$0);
                o0oo00o2.OooOOoo(oO00OOo0.message_clear_friend_request);
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOo0(new o0ooOOo(this$0));
                o0oo00o2.OooOO0o();
            }
        }) : null;
        OooOoO0().f59046OooO0OO.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.no_friend_request));
        OooOoO0().f59046OooO0OO.setEmptyImage(oOo00OO0.ic_empty_friends_add);
        OooOoO0().f59046OooO0OO.OooO0oo();
        OooOoO0().f59045OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        com.yalla.yalla.ui.adapter.o00O0O o00o0o2 = new com.yalla.yalla.ui.adapter.o00O0O(this);
        this.f25654OooOo0O = o00o0o2;
        o00Ooo listener = new o00Ooo(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00o0o2.f44446OooOO0O = listener;
        com.yalla.yalla.ui.adapter.o00O0O o00o0o3 = this.f25654OooOo0O;
        if (o00o0o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00o0o3 = null;
        }
        oo000o listener2 = new oo000o(this);
        o00o0o3.getClass();
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o00o0o3.f44447OooOO0o = listener2;
        com.yalla.yalla.ui.adapter.o00O0O o00o0o4 = this.f25654OooOo0O;
        if (o00o0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00o0o4 = null;
        }
        o00o0o4.OooO0Oo(oO00O0oO.btAgree, oO00O0oO.btRefuse);
        com.yalla.yalla.ui.adapter.o00O0O o00o0o5 = this.f25654OooOo0O;
        if (o00o0o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00o0o5 = null;
        }
        o00oO0o listener3 = new o00oO0o(this);
        o00o0o5.getClass();
        Intrinsics.checkNotNullParameter(listener3, "listener");
        o00o0o5.f44449OooOOO0 = listener3;
        RecyclerView recyclerView = OooOoO0().f59045OooO0O0;
        com.yalla.yalla.ui.adapter.o00O0O o00o0o6 = this.f25654OooOo0O;
        if (o00o0o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00o0o6 = null;
        }
        recyclerView.setAdapter(o00o0o6);
        RecyclerView recyclerView2 = OooOoO0().f59045OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rv");
        oOO0OOO.OooO0O0(recyclerView2, (15 & 1) != 0 ? 100L : 0L, 0L, (15 & 4) != 0 ? 100L : 0L, (15 & 8) != 0 ? 100L : 0L);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new o00O0O(this, null), 3, null);
        OooOoO().getMessageCount().observe(this, new OooO00o(new o00Oo0(this)));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        OooOoO().updateAllMessageStateRead();
        Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
        Object systemService = com.code.android.util.o000O0.OooO00o().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        OooOoO().updateAllMessageStateRead();
    }
}
