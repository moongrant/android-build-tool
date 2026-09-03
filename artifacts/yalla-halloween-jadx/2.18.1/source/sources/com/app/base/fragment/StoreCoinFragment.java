package com.app.base.fragment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.ui.view.DotView;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o00;
import p142o00OOooO.o000O0O0;
import p142o00OOooO.o000OO00;
import p142o00OOooO.o000OO0O;
import p142o00OOooO.o000OOo0;
import p142o00OOooO.o00O0000;
import p391o0OOooOo.o0O00000;
import p499o0o00OoO.o0OO00O;
import p584o0oOoo.o000O;
import p598o0oo00O.oO0O0OoO;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.f9;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0014¨\u0006\r"}, d2 = {"Lcom/app/base/fragment/StoreCoinFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/f9;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class StoreCoinFragment extends p503o0o00o00.OooO<f9> {
    public static final int $stable = 0;

    public static final class OooO extends o00Oo0 {
        public OooO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (StoreCoinFragment.this.getContext() != null) {
                RoomThemeStoreActivity.OooO00o oooO00o = RoomThemeStoreActivity.f23000OooooO0;
                Context context = StoreCoinFragment.this.getContext();
                Intrinsics.checkNotNull(context);
                oooO00o.OooO00o(context, true);
            }
        }
    }

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0O00000.OooO0OO("Me_store_user_Vehicles");
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0o0().OooOoOO();
            SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
            VehicleStoreActivity.OooO00o oooO00o = VehicleStoreActivity.f23259OooooOO;
            Context context = StoreCoinFragment.this.getContext();
            Intrinsics.checkNotNull(context);
            oooO00o.OooO00o(context);
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            OooOo.OooO0O0("105005");
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = p497o0o00Oo.OooOOO0.OooO0o0();
            o000OOo0.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, o000OO00.OooO00o(o0oo00oOooO0o0, "storeBubbleDot"), o0oo00oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boolean.FALSE);
            o000O.OooO00o(oO0O0OoO.f47813OooO00o, null);
        }
    }

    public static final class OooO0OO extends o00Oo0 {
        public OooO0OO() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PurchaseLockRoomActivity.OooO00o oooO00o = PurchaseLockRoomActivity.f22505OooooOO;
            FragmentActivity fragmentActivityRequireActivity = StoreCoinFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            oooO00o.OooO00o(fragmentActivityRequireActivity);
        }
    }

    public static final class OooO0o extends o00Oo0 {
        public OooO0o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment.this.startActivity(new Intent(StoreCoinFragment.this.getContext(), (Class<?>) PurchaseTopCardActivity.class));
        }
    }

    public static final class OooOO0 extends o00Oo0 {
        public OooOO0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            SharedUrlManager.INSTANCE.getPrettyUserIdUrl().observe(StoreCoinFragment.this.getViewLifecycleOwner(), new o00(StoreCoinFragment.this, 0));
        }
    }

    public static final class OooOO0O extends o00Oo0 {
        public OooOO0O() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Context context = StoreCoinFragment.this.getContext();
            int i = PurchaseSkillCardActivity.f23211Oooooo;
            Intent intent = new Intent(context, (Class<?>) PurchaseSkillCardActivity.class);
            intent.putExtra("page", 0);
            context.startActivity(intent);
        }
    }

    public static final class OooOOO0 extends o00Oo0 {
        public OooOOO0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = p497o0o00Oo.OooOOO0.OooO0o0();
            o000OOo0.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o, o000OO00.OooO00o(o0oo00oOooO0o0, "uniqueMessageDot"), o0oo00oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boolean.FALSE);
            SharedUrlManager.INSTANCE.getPrettyRoomIdUrl().observe(StoreCoinFragment.this.getViewLifecycleOwner(), new o00O0000(StoreCoinFragment.this, 0));
        }
    }

    private final void initView() {
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        int i = 0;
        sharedMainMessageManager.getUniqueMessageDot().observe(requireActivity(), new p142o00OOooO.o000O(this, i));
        sharedMainMessageManager.getUserVehicleMessageDot().observe(requireActivity(), new o000OO0O(this, i));
        sharedMainMessageManager.getStoreBubbleDot().observe(requireActivity(), new o000O0O0(this, i));
        getBinding().f49346OooO0oO.setOnClickListener(new OooO0OO());
        getBinding().f49339OooO.setOnClickListener(new OooO0o());
        getBinding().f49347OooO0oo.setOnClickListener(new OooO());
        getBinding().f49348OooOO0.setOnClickListener(new OooOO0());
        getBinding().f49349OooOO0O.setOnClickListener(new OooOO0O());
        getBinding().f49344OooO0o.setOnClickListener(new OooOOO0());
        getBinding().f49350OooOO0o.setOnClickListener(new OooO00o());
        getBinding().f49345OooO0o0.setOnClickListener(new OooO0O0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m43initView$lambda0(StoreCoinFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DotView dotView = this$0.getBinding().f49342OooO0OO;
        Intrinsics.checkNotNull(bool);
        dotView.OooO0OO(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m44initView$lambda1(StoreCoinFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DotView dotView = this$0.getBinding().f49343OooO0Oo;
        Intrinsics.checkNotNull(bool);
        dotView.OooO0OO(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m45initView$lambda2(StoreCoinFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DotView dotView = this$0.getBinding().f49341OooO0O0;
        Intrinsics.checkNotNull(bool);
        dotView.OooO0OO(bool.booleanValue());
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public f9 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        f9 f9VarInflate = f9.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(f9VarInflate, "inflate(inflater)");
        return f9VarInflate;
    }
}
