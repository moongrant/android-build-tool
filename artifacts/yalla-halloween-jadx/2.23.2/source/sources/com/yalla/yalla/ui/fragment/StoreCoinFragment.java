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
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen;
import com.yalla.yalla.ui.view.DotView;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0OO000;
import p414o0Oo0oO.oO0OOo0o;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0014¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/fragment/StoreCoinFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o0OO000;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class StoreCoinFragment extends p527o0o0OO0o.o000O<o0OO000> {
    public static final int $stable = 0;

    public static final class OooO extends Lambda implements Function1<Boolean, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f44565OooO0O0;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0oo0000.OooO00o.OooO0O0("105030");
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            androidx.appcompat.widget.o0000O0O.OooO0O0("userVehicleMessageDot", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
            int i = VehicleStoreActivity.f26578OooOo;
            Context context = StoreCoinFragment.this.getContext();
            Intrinsics.checkNotNull(context);
            VehicleStoreActivity.OooO00o.OooO00o(context, false);
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {
        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0oo0000.OooO00o.OooO0O0("105005");
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            androidx.appcompat.widget.o0000O0O.OooO0O0("storeBubbleDot", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boolean.FALSE);
            o00O00.OooO0o0(StoreChatBubbleScreen.INSTANCE, null, false, null, 14);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f44566OooO0OO;
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
            DotView dotView = StoreCoinFragment.this.getBinding().f44567OooO0Oo;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends o0OOOO0o {
        public OooOO0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            int i = PurchaseLockRoomActivity.f25791OooOo0o;
            FragmentActivity context = StoreCoinFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) PurchaseLockRoomActivity.class));
            o0oo0000.OooO00o.OooO0O0("105117");
        }
    }

    public static final class OooOO0O extends o0OOOO0o {
        public OooOO0O() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            storeCoinFragment.startActivity(new Intent(storeCoinFragment.getContext(), (Class<?>) PurchaseTopCardActivity.class));
            o0oo0000.OooO00o.OooO0O0("105118");
        }
    }

    public static final class OooOOO extends o0OOOO0o {
        public OooOOO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0oOoo00.o00000OO.o000oOoO o000oooo2 = p583o0oOoo00.o00000OO.f56669OooOO0o;
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            o000oooo2.observe(storeCoinFragment.getViewLifecycleOwner(), new com.yalla.yalla.ui.activity.message.o000000(3, storeCoinFragment));
        }
    }

    public static final class OooOOO0 extends o0OOOO0o {
        public OooOOO0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            if (storeCoinFragment.getContext() != null) {
                int i = RoomThemeStoreActivity.f26225OooOo0o;
                Context context = storeCoinFragment.getContext();
                Intrinsics.checkNotNull(context);
                Intent intent = new Intent(context, (Class<?>) RoomThemeStoreActivity.class);
                intent.putExtra("IS_SHOW_RECHARGE", true);
                intent.putExtra("IsFromMyOutfit", false);
                if (context != null) {
                    context.startActivity(intent);
                }
                o0oo0000.OooO00o.OooO0O0("105116");
            }
        }
    }

    public static final class OooOOOO extends o0OOOO0o {
        public OooOOOO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PurchaseSkillCardActivity.OooOo0(0, StoreCoinFragment.this.getContext());
            o0oo0000.OooO00o.OooO0O0("105121");
        }
    }

    public static final class OooOo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27791OooO0Oo;

        public OooOo(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27791OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27791OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27791OooO0Oo;
        }

        public final int hashCode() {
            return this.f27791OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27791OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo00 extends o0OOOO0o {
        public OooOo00() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            androidx.appcompat.widget.o0000O0O.OooO0O0("uniqueMessageDot", o0O00oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boolean.FALSE);
            o0oOoo00.o00000OO.Oooo0 oooo0 = p583o0oOoo00.o00000OO.f56671OooOOO0;
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            oooo0.observe(storeCoinFragment.getViewLifecycleOwner(), new com.yalla.yalla.ui.activity.message.o000000O(3, storeCoinFragment));
        }
    }

    private final void initView() {
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        sharedMainMessageManager.getUniqueMessageDot().observe(requireActivity(), new OooOo(new OooO0OO()));
        sharedMainMessageManager.getUserVehicleMessageDot().observe(requireActivity(), new OooOo(new OooO0o()));
        sharedMainMessageManager.getStoreBubbleDot().observe(requireActivity(), new OooOo(new OooO()));
        getBinding().f44570OooO0oO.setOnClickListener(new OooOO0());
        getBinding().f44563OooO.setOnClickListener(new OooOO0O());
        getBinding().f44571OooO0oo.setOnClickListener(new OooOOO0());
        getBinding().f44572OooOO0.setOnClickListener(new OooOOO());
        getBinding().f44573OooOO0O.setOnClickListener(new OooOOOO());
        getBinding().f44568OooO0o.setOnClickListener(new OooOo00());
        getBinding().f44574OooOO0o.setOnClickListener(new OooO00o());
        getBinding().f44569OooO0o0.setOnClickListener(new OooO0O0());
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o0OO000 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0OO000 o0oo000Inflate = o0OO000.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0oo000Inflate, "inflate(...)");
        return o0oo000Inflate;
    }
}
