package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.message.FriendRequestMessageVM;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p142o00OOooO.o000000;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p516o0o0O000.o00000;
import p536o0o0OOoo.f;
import p536o0o0OOoo.g;
import p536o0o0OOoo.h;
import p536o0o0OOoo.i;
import p536o0o0OOoo.j;
import p563o0oOo0.o000OOo;
import p649o0ooOOoo.ob;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/FriendRequestMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class FriendRequestMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22157OooooOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22158OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ob.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22159Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FriendRequestMessageVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22164Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22164Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public TextView f22160Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public o000OOo f22161OooooO0;

    public static final class OooO00o {
        public final void OooO00o(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) FriendRequestMessageActivity.class));
        }
    }

    public static final void OooOoo(FriendRequestMessageActivity friendRequestMessageActivity, boolean z, long j) {
        Objects.requireNonNull(friendRequestMessageActivity);
        BaseActivityK.OooOoo0(friendRequestMessageActivity, null, 0L, 3, null);
        friendRequestMessageActivity.OooOooo().applyFriendRequest(z, j).observe(friendRequestMessageActivity, new p142o00OOooO.o000OOo(friendRequestMessageActivity, 2));
    }

    public final ob OooOooO() {
        return (ob) this.f22158OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FriendRequestMessageVM OooOooo() {
        return (FriendRequestMessageVM) this.f22159Ooooo00.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f50178OooO00o);
        o0O00000.OooO0OO("Message_newFriends");
        OooOo(R.string.Friend_Requests_Title);
        HeaderLayout headerLayout = this.f11463OoooO;
        this.f22160Ooooo0o = headerLayout != null ? headerLayout.OooOoo0(R.string.clear, new f(this, 0)) : null;
        OooOooO().f50180OooO0OO.setEmptyText(o000O0O0.OooO0OO(R.string.no_friend_request));
        OooOooO().f50180OooO0OO.setEmptyImage(R.drawable.ic_empty_friends_add);
        OooOooO().f50180OooO0OO.OooO0oo();
        OooOooO().f50179OooO0O0.setLayoutManager(new FixLinearLayoutManager(this));
        o000OOo o000ooo2 = new o000OOo();
        this.f22161OooooO0 = o000ooo2;
        h listener = new h(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o000ooo2.f40456OooOO0O = listener;
        o000OOo o000ooo3 = this.f22161OooooO0;
        if (o000ooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000ooo3 = null;
        }
        i listener2 = new i(this);
        Objects.requireNonNull(o000ooo3);
        Intrinsics.checkNotNullParameter(listener2, "listener");
        o000ooo3.f40457OooOO0o = listener2;
        o000OOo o000ooo4 = this.f22161OooooO0;
        if (o000ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000ooo4 = null;
        }
        int i = 2;
        o000ooo4.OooO0OO(R.id.btAgree, R.id.btRefuse);
        o000OOo o000ooo5 = this.f22161OooooO0;
        if (o000ooo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000ooo5 = null;
        }
        j listener3 = new j(this);
        Objects.requireNonNull(o000ooo5);
        Intrinsics.checkNotNullParameter(listener3, "listener");
        o000ooo5.f40459OooOOO0 = listener3;
        RecyclerView recyclerView = OooOooO().f50179OooO0O0;
        o000OOo o000ooo6 = this.f22161OooooO0;
        if (o000ooo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000ooo6 = null;
        }
        recyclerView.setAdapter(o000ooo6);
        RecyclerView recyclerView2 = OooOooO().f50179OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rv");
        o00000.OooO0O0(recyclerView2, (11 & 1) != 0 ? 100L : 0L, 0L, (11 & 4) != 0 ? 100L : 0L, (11 & 8) != 0 ? 100L : 0L);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(this, null), 3, null);
        OooOooo().getMessageCount().observe(this, new o000000(this, i));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        OooOooo().updateAllMessageStateRead();
        Intrinsics.checkNotNullParameter("Yalla_Notice_FriendRequest", ViewHierarchyConstants.TAG_KEY);
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_FriendRequest", 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        OooOooo().updateAllMessageStateRead();
    }
}
