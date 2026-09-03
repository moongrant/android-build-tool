package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen;
import com.yalla.yalla.ui.view.DotView;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402o0Oo0OOO.o00O000o;
import p466o0Oooo0o.oo00o;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.p2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0014¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/fragment/StoreCoinFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/p2;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class StoreCoinFragment extends p508o0o0O.OooOO0O<p2> {
    public static final int $stable = 0;

    public static final class OooO extends Lambda implements Function1<Boolean, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f58570OooO0O0;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0OO000.OooO00o("105030");
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            com.google.firebase.messaging.o0OO00O.OooO00o("userVehicleMessageDot", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
            int i = VehicleStoreActivity.f27043OooOo;
            Context context = StoreCoinFragment.this.getContext();
            Intrinsics.checkNotNull(context);
            VehicleStoreActivity.OooO00o.OooO00o(context, false);
        }
    }

    public static final class OooO0O0 extends oo00o {
        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0OO000.OooO00o("105005");
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            com.google.firebase.messaging.o0OO00O.OooO00o("storeBubbleDot", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boolean.FALSE);
            oo0oOO0.OooO0o0(StoreChatBubbleScreen.INSTANCE, null, false, null, 14);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f58571OooO0OO;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f58572OooO0Oo;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends oo00o {
        public OooOO0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            int i = PurchaseLockRoomActivity.f26240OooOo0o;
            FragmentActivity context = StoreCoinFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(context, "requireActivity()");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) PurchaseLockRoomActivity.class));
            o0OO000.OooO00o("105117");
        }
    }

    public static final class OooOO0O extends oo00o {
        public OooOO0O() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            storeCoinFragment.startActivity(new Intent(storeCoinFragment.getContext(), (Class<?>) PurchaseTopCardActivity.class));
            o0OO000.OooO00o("105118");
        }
    }

    public static final class OooOOO extends oo00o {

        public static final class OooO00o implements Observer<String> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ StoreCoinFragment f28275OooO0Oo;

            public OooO00o(StoreCoinFragment storeCoinFragment) {
                this.f28275OooO0Oo = storeCoinFragment;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(String str) {
                String url = str;
                if (com.code.android.util.OooOo00.OooO00o(url)) {
                    return;
                }
                o0OO000.OooO00o("105036");
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32819OooO0o0 = url;
                webPageInfo.f32816OooO = true;
                webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(oO00OOo0.user_unique_id));
                int i = WebActivity.f25584OooOoO0;
                FragmentActivity fragmentActivityRequireActivity = this.f28275OooO0Oo.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
            }
        }

        public OooOOO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00O000o.o000oOoO o000oooo2 = o00O000o.f44500OooOO0o;
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            o000oooo2.observe(storeCoinFragment.getViewLifecycleOwner(), new OooO00o(storeCoinFragment));
        }
    }

    public static final class OooOOO0 extends oo00o {
        public OooOOO0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            if (storeCoinFragment.getContext() != null) {
                int i = RoomThemeStoreActivity.f26679OooOo0o;
                Context context = storeCoinFragment.getContext();
                Intrinsics.checkNotNull(context);
                Intent intent = new Intent(context, (Class<?>) RoomThemeStoreActivity.class);
                intent.putExtra("IS_SHOW_RECHARGE", true);
                intent.putExtra("IsFromMyOutfit", false);
                if (context != null) {
                    context.startActivity(intent);
                }
                o0OO000.OooO00o("105116");
            }
        }
    }

    public static final class OooOOOO extends oo00o {
        public OooOOOO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PurchaseSkillCardActivity.OooOo0(0, StoreCoinFragment.this.getContext());
            o0OO000.OooO00o("105121");
        }
    }

    public static final class OooOo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28278OooO0Oo;

        public OooOo(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28278OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28278OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28278OooO0Oo;
        }

        public final int hashCode() {
            return this.f28278OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28278OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo00 extends oo00o {

        public static final class OooO00o implements Observer<String> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ StoreCoinFragment f28280OooO0Oo;

            public OooO00o(StoreCoinFragment storeCoinFragment) {
                this.f28280OooO0Oo = storeCoinFragment;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(String str) {
                String url = str;
                o0OO000.OooO00o("105035");
                if (com.code.android.util.OooOo00.OooO00o(url)) {
                    return;
                }
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32819OooO0o0 = url;
                webPageInfo.f32816OooO = true;
                webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_unique_id));
                int i = WebActivity.f25584OooOoO0;
                FragmentActivity fragmentActivityRequireActivity = this.f28280OooO0Oo.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
            }
        }

        public OooOo00() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            com.google.firebase.messaging.o0OO00O.OooO00o("uniqueMessageDot", p464o0Oooo.o000000O.OooOOo0().getValue(), o0o0o00OooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boolean.FALSE);
            o00O000o.Oooo0 oooo0 = o00O000o.f44502OooOOO0;
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            oooo0.observe(storeCoinFragment.getViewLifecycleOwner(), new OooO00o(storeCoinFragment));
        }
    }

    private final void initView() {
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        sharedMainMessageManager.getUniqueMessageDot().observe(requireActivity(), new OooOo(new OooO0OO()));
        sharedMainMessageManager.getUserVehicleMessageDot().observe(requireActivity(), new OooOo(new OooO0o()));
        sharedMainMessageManager.getStoreBubbleDot().observe(requireActivity(), new OooOo(new OooO()));
        getBinding().f58575OooO0oO.setOnClickListener(new OooOO0());
        getBinding().f58568OooO.setOnClickListener(new OooOO0O());
        getBinding().f58576OooO0oo.setOnClickListener(new OooOOO0());
        getBinding().f58577OooOO0.setOnClickListener(new OooOOO());
        getBinding().f58578OooOO0O.setOnClickListener(new OooOOOO());
        getBinding().f58573OooO0o.setOnClickListener(new OooOo00());
        getBinding().f58579OooOO0o.setOnClickListener(new OooO00o());
        getBinding().f58574OooO0o0.setOnClickListener(new OooO0O0());
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public p2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        p2 p2VarInflate = p2.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(p2VarInflate, "inflate(inflater)");
        return p2VarInflate;
    }
}
