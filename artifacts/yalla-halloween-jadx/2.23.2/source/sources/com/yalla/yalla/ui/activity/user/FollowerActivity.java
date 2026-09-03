package com.yalla.yalla.ui.activity.user;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.media3.session.o0000O00;
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
import o000O00O.o0000Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0OO.o000O000;
import p407o0Oo0Oo.o0O;
import p423o0OoO0OO.o00;
import p424o0OoO0Oo.o00O;
import p475o0Ooooo0.o0O00oO0;
import p506o0o00oOo.oO000OOo;
import p506o0o00oOo.oO000Oo0;
import p506o0o00oOo.oO0OOo0o;
import p506o0o00oOo.oO0OoOO0;
import p506o0o00oOo.ooOOOOoo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p587o0oOooOO.n0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/FollowerActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class FollowerActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f26638OooOo0o = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f26639OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26640OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oO000OOo f26642OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f26644OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public String f26641OooOOoo = "";

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f26643OooOo00 = 1;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26645OooO0Oo;

        public OooO00o(oO000Oo0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26645OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26645OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26645OooO0Oo;
        }

        public final int hashCode() {
            return this.f26645OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26645OooO0Oo.invoke(obj);
        }
    }

    public static final void OooOo0(UserInfoModel userInfoModel, FollowerActivity followerActivity) {
        followerActivity.getClass();
        String strOooO00o = o0000O00.OooO00o(userInfoModel.getUserId());
        String str = userInfoModel.getIsFollow() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        oO0OoOO0 oo0oooo0 = new oO0OoOO0(userInfoModel, followerActivity);
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("fuserid", strOooO00o);
        linkedHashMapOooO00o.put("type", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43432o00Ooo, linkedHashMapOooO00o, oo0oooo0);
    }

    public final void OooOo0O() {
        o0O o0oOooo000 = p408o0Oo0Oo0.o00Oo0.OooO00o().Oooo000();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0oOooo000.OooO00o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        this.f26643OooOo00 = 1;
        o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(this), new oO0OOo0o(this, null)).observe(this, new OooO00o(new oO000Oo0(this, true)));
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
            oO000OOo oo000ooo = this.f26642OooOo0;
            oO000OOo oo000ooo2 = null;
            if (oo000ooo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo000ooo = null;
            }
            List<T> list = oo000ooo.f13189OooOOoo;
            Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
            oO000OOo oo000ooo3 = this.f26642OooOo0;
            if (oo000ooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oo000ooo3 = null;
            }
            int size = oo000ooo3.f13189OooOOoo.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                Intrinsics.checkNotNull(obj);
                if (Intrinsics.areEqual(String.valueOf(((UserInfoModel) obj).getUserId()), stringExtra)) {
                    Object obj2 = list.get(i3);
                    Intrinsics.checkNotNull(obj2);
                    ((UserInfoModel) obj2).setFollow(booleanExtra);
                    oO000OOo oo000ooo4 = this.f26642OooOo0;
                    if (oo000ooo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oo000ooo2 = oo000ooo4;
                    }
                    oo000ooo2.notifyItemChanged(i3);
                    return;
                }
            }
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_fans);
        this.f26644OooOo0O = getIntent().getIntExtra("fans", 0);
        OooOOoo(o000000.Followers);
        View viewFindViewById = findViewById(o0OO00O.rec_fans);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f26640OooOOo0 = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(o0OO00O.srl_fans);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f26639OooOOo = (XRefreshLayout) viewFindViewById2;
        RecyclerView recyclerView = this.f26640OooOOo0;
        oO000OOo oo000ooo = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView = null;
        }
        recyclerView.addItemDecoration(new n0(this));
        RecyclerView recyclerView2 = this.f26640OooOOo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26642OooOo0 = new oO000OOo(this, oo0o0Oo.item_rec_follower);
        RecyclerView recyclerView3 = this.f26640OooOOo0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView3 = null;
        }
        oO000OOo oo000ooo2 = this.f26642OooOo0;
        if (oo000ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo000ooo2 = null;
        }
        recyclerView3.setAdapter(oo000ooo2);
        oO000OOo oo000ooo3 = this.f26642OooOo0;
        if (oo000ooo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo000ooo3 = null;
        }
        oo000ooo3.OooOooo(o0Oo0oo.ic_empty_fans);
        oO000OOo oo000ooo4 = this.f26642OooOo0;
        if (oo000ooo4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo000ooo4 = null;
        }
        oo000ooo4.Oooo000(o000000.blank_no_fans);
        oO000OOo oo000ooo5 = this.f26642OooOo0;
        if (oo000ooo5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo000ooo5 = null;
        }
        oo000ooo5.Oooo0OO(new ooOOOOoo(this));
        XRefreshLayout xRefreshLayout = this.f26639OooOOo;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srlFans");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new o0000Ooo(this, 4));
        XRefreshLayout xRefreshLayout2 = this.f26639OooOOo;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srlFans");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new o000O000(this));
        RecyclerView recyclerView4 = this.f26640OooOOo0;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recFans");
            recyclerView4 = null;
        }
        oO000OOo oo000ooo6 = this.f26642OooOo0;
        if (oo000ooo6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oo000ooo = oo000ooo6;
        }
        recyclerView4.setAdapter(oo000ooo);
        OooOo0O();
        LiveEventBus.get("USER_ADD_BLACKLISTED", Long.TYPE).observe(this, new o00(this, 1));
    }
}
