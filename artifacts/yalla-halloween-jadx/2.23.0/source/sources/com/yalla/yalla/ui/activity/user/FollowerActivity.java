package com.yalla.yalla.ui.activity.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p377o0OOoOo.o0000O;
import p403o0Oo0OOo.oOo00ooO;
import p420o0OoO0OO.o0ooOOo;
import p464o0Oooo.o000000O;
import p496o0o00o.o00;
import p496o0o00o.o000O;
import p496o0o00o.o000O0O0;
import p496o0o00o.o000OO00;
import p496o0o00o.o00O0000;
import p496o0o00o.o00oOoo;
import p496o0o00o.o0O0ooO;
import p539o0o0OoOO.q1;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/FollowerActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class FollowerActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f27105OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f27106OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f27107OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public o00 f27109OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f27111OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public String f27108OooOOoo = "";

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f27110OooOo00 = 1;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27112OooO0Oo;

        public OooO00o(o00oOoo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27112OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27112OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27112OooO0Oo;
        }

        public final int hashCode() {
            return this.f27112OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27112OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo0(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        followerActivity.getClass();
        String strOooO00o = oo0ooO.OooO00o(userInfoModel.getUserId());
        String str = userInfoModel.getIsFollow() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        o000O o000o = new o000O(userInfoModel, followerActivity);
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("fuserid", strOooO00o);
        linkedHashMapOooO00o.put("type", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44173o00Ooo, linkedHashMapOooO00o, o000o);
    }

    public final void OooOo0O() {
        oOo00ooO ooo00oooOooOooo = o000OOo.OooO00o().OooOooo();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        ooo00oooOooOooo.OooO00o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        this.f27110OooOo00 = 1;
        o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new o0O0ooO(this, null)).observe(this, new OooO00o(new o00oOoo(this, true)));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1022 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("userid");
        boolean booleanExtra = intent.getBooleanExtra("follow", false);
        if (com.code.android.util.OooOo00.OooO0O0(stringExtra)) {
            o00 o00Var = this.f27109OooOo0;
            o00 o00Var2 = null;
            if (o00Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00Var = null;
            }
            List<T> list = o00Var.f10111OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "adapter.data");
            o00 o00Var3 = this.f27109OooOo0;
            if (o00Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00Var3 = null;
            }
            int size = o00Var3.f10111OooOOoo.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                Intrinsics.checkNotNull(obj);
                if (Intrinsics.areEqual(String.valueOf(((UserInfoModel) obj).getUserId()), stringExtra)) {
                    Object obj2 = list.get(i3);
                    Intrinsics.checkNotNull(obj2);
                    ((UserInfoModel) obj2).setFollow(booleanExtra);
                    o00 o00Var4 = this.f27109OooOo0;
                    if (o00Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        o00Var2 = o00Var4;
                    }
                    o00Var2.notifyItemChanged(i3);
                    return;
                }
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_fans);
        int i = 0;
        this.f27111OooOo0O = getIntent().getIntExtra("fans", 0);
        OooOOoo(oO00OOo0.Followers);
        View viewFindViewById = findViewById(oO00O0oO.rec_fans);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.rec_fans)");
        this.f27107OooOOo0 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.srl_fans);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.srl_fans)");
        this.f27106OooOOo = (XRefreshLayout) viewFindViewById2;
        RecyclerView recyclerView = this.f27107OooOOo0;
        o00 o00Var = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView = null;
        }
        recyclerView.addItemDecoration(new q1(this));
        RecyclerView recyclerView2 = this.f27107OooOOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        this.f27109OooOo0 = new o00(this, oO00OO0O.item_rec_follower);
        RecyclerView recyclerView3 = this.f27107OooOOo0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView3 = null;
        }
        o00 o00Var2 = this.f27109OooOo0;
        if (o00Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var2 = null;
        }
        recyclerView3.setAdapter(o00Var2);
        o00 o00Var3 = this.f27109OooOo0;
        if (o00Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var3 = null;
        }
        o00Var3.OooOooo(oOo00OO0.ic_empty_fans);
        o00 o00Var4 = this.f27109OooOo0;
        if (o00Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var4 = null;
        }
        o00Var4.Oooo000(oO00OOo0.blank_no_fans);
        o00 o00Var5 = this.f27109OooOo0;
        if (o00Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var5 = null;
        }
        o00Var5.Oooo0OO(new o00O0000(this));
        XRefreshLayout xRefreshLayout = this.f27106OooOOo;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srlFans");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new androidx.compose.ui.graphics.colorspace.OooOOO0(this));
        XRefreshLayout xRefreshLayout2 = this.f27106OooOOo;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srlFans");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new o000O0O0(this, i));
        RecyclerView recyclerView4 = this.f27107OooOOo0;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView4 = null;
        }
        o00 o00Var6 = this.f27109OooOo0;
        if (o00Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o00Var = o00Var6;
        }
        recyclerView4.setAdapter(o00Var);
        OooOo0O();
        LiveEventBus.get("USER_ADD_BLACKLISTED", Long.TYPE).observe(this, new o000OO00(this));
    }
}
