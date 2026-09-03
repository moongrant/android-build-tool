package com.yalla.yalla.ui.activity.message;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o00000;
import p536o0o0OOoo.a2;
import p536o0o0OOoo.u1;
import p536o0o0OOoo.v1;
import p536o0o0OOoo.x1;
import p563o0oOo0.o00oOoo;
import p596o0oo0.OooOo;
import p596o0oo0.OooOo00;
import p649o0ooOOoo.qb;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/message/SystemMessageActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SystemMessageActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22242OooooOO = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public o00oOoo f22244Ooooo00;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public TextView f22246OooooO0;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22243OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(qb.class), this, null);

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f22245Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(OooOo00.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.message.SystemMessageActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.message.SystemMessageActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.message.SystemMessageActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f22249Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f22249Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
    }

    public static final void OooOoo(SystemMessageActivity context, boolean z) {
        Objects.requireNonNull(context);
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        Long value = oooOOO.OooOo().getValue();
        if (value == null) {
            value = 0L;
        }
        long jLongValue = value.longValue();
        String userName = oooOOO.OooOoO().getValue();
        if (userName == null) {
            userName = "";
        }
        String userImageUrl = oooOOO.OooO0oo().getValue();
        if (userImageUrl == null) {
            userImageUrl = "";
        }
        String value2 = oooOOO.OooOO0O().getValue();
        String medal = value2 != null ? value2 : "";
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
        Intrinsics.checkNotNullParameter(medal, "medal");
        Intent intent = new Intent(context, (Class<?>) BadgeActivity.class);
        intent.putExtra("USER_ID", jLongValue);
        intent.putExtra("USER_NAME", userName);
        intent.putExtra("USER_IMAGE_URL", userImageUrl);
        intent.putExtra("USER_MEDAL", medal);
        intent.putExtra("IS_HONOR", z);
        context.startActivity(intent);
    }

    public final qb OooOooO() {
        return (qb) this.f22243OoooOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final OooOo00 OooOooo() {
        return (OooOo00) this.f22245Ooooo0o.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        TextView textViewOooOoo0;
        super.onCreate(bundle);
        setContentView(OooOooO().f50366OooO00o);
        o0O00000.OooO0OO("Message_system");
        OooOo(R.string.subscription_service);
        HeaderLayout headerLayout = this.f11463OoooO;
        o00oOoo o00oooo2 = null;
        if (headerLayout == null || (textViewOooOoo0 = headerLayout.OooOoo0(R.string.clear, new x1(this))) == null) {
            textViewOooOoo0 = null;
        } else {
            o00O0O.OooO00o(textViewOooOoo0);
        }
        this.f22246OooooO0 = textViewOooOoo0;
        OooOooO().f50368OooO0OO.setEmptyText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.blank_no_system_msg));
        OooOooO().f50368OooO0OO.setEmptyImage(R.drawable.ic_empty_message_system);
        this.f22244Ooooo00 = new o00oOoo(this);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(this);
        fixLinearLayoutManager.setReverseLayout(true);
        OooOooO().f50367OooO0O0.setLayoutManager(fixLinearLayoutManager);
        RecyclerView recyclerView = OooOooO().f50367OooO0O0;
        o00oOoo o00oooo3 = this.f22244Ooooo00;
        if (o00oooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00oooo3 = null;
        }
        recyclerView.setAdapter(o00oooo3);
        RecyclerView recyclerView2 = OooOooO().f50367OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvSystemMessage");
        o00000.OooO00o(recyclerView2);
        o00oOoo o00oooo4 = this.f22244Ooooo00;
        if (o00oooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o00oooo2 = o00oooo4;
        }
        a2 listener = new a2(this);
        Objects.requireNonNull(o00oooo2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00oooo2.f40456OooOO0O = listener;
        OooOooo().f47629OooO00o.observe(this, new u1(this));
        OooOooo().f47630OooO0O0.observe(this, new v1(this));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        OooOo00 oooOo00OooOooo = OooOooo();
        Objects.requireNonNull(oooOo00OooOooo);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(oooOo00OooOooo), Dispatchers.getIO(), null, new OooOo(null), 2, null);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Intrinsics.checkNotNullParameter("Yalla_Notice_Syatem", ViewHierarchyConstants.TAG_KEY);
        Context context = o0000O.f2657OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel("Yalla_Notice_Syatem", 0);
    }
}
