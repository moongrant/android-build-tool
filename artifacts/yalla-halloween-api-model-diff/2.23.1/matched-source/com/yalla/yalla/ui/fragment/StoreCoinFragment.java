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
import p407o0Oo0OOO.o0OO000o;
import p416o0Oo0oO.oO0OOo0o;
import p472o0OoooO.oo0OOoo;
import p474o0OoooOO.oo0oO0;
import p527o0o0OO0.o00OO0O0;
import p532o0o0OOOO.o0O0o000;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0014¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/ui/fragment/StoreCoinFragment;", "Lo0o0OO0/o00OO0O0;", "Lo0Oo0OOO/o0OO000o;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class StoreCoinFragment extends o00OO0O0<o0OO000o> {
    public static final int $stable = 0;

    public static final class OooO extends Lambda implements Function1<Boolean, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f44557OooO0O0;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends oo0OOoo {
        public OooO00o() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            h0.OooO0O0("105030");
            oO0OOo0o oo0ooo0oOooO0o0 = p417o0Oo0oO0.o00Oo0.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0000O0O.OooO0OO.OooO0OO("userVehicleMessageDot", oo0oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUserVehicleMessageDot().postValue(Boolean.FALSE);
            int i = VehicleStoreActivity.f26579OooOo;
            Context context = StoreCoinFragment.this.getContext();
            Intrinsics.checkNotNull(context);
            VehicleStoreActivity.OooO00o.OooO00o(context, false);
        }
    }

    public static final class OooO0O0 extends oo0OOoo {
        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            h0.OooO0O0("105005");
            oO0OOo0o oo0ooo0oOooO0o0 = p417o0Oo0oO0.o00Oo0.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            o0000O0O.OooO0OO.OooO0OO("storeBubbleDot", oo0oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boolean.FALSE);
            o0O0o000.OooO0o0(StoreChatBubbleScreen.INSTANCE, null, false, null, 14);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            DotView dotView = StoreCoinFragment.this.getBinding().f44558OooO0OO;
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
            DotView dotView = StoreCoinFragment.this.getBinding().f44559OooO0Oo;
            Intrinsics.checkNotNull(bool2);
            dotView.OooOO0o(bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends oo0OOoo {
        public OooOO0() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            int i = PurchaseLockRoomActivity.f25793OooOo0o;
            FragmentActivity context = StoreCoinFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(context, "requireActivity(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) PurchaseLockRoomActivity.class));
            h0.OooO0O0("105117");
        }
    }

    public static final class OooOO0O extends oo0OOoo {
        public OooOO0O() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            storeCoinFragment.startActivity(new Intent(storeCoinFragment.getContext(), (Class<?>) PurchaseTopCardActivity.class));
            h0.OooO0O0("105118");
        }
    }

    public static final class OooOOO extends oo0OOoo {
        public OooOOO() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0oOoo00.o00000OO.o000oOoO o000oooo2 = p585o0oOoo00.o00000OO.f56626OooOO0o;
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            o000oooo2.observe(storeCoinFragment.getViewLifecycleOwner(), new com.yalla.yalla.ui.activity.message.o000OOo(3, storeCoinFragment));
        }
    }

    public static final class OooOOO0 extends oo0OOoo {
        public OooOOO0() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            if (storeCoinFragment.getContext() != null) {
                int i = RoomThemeStoreActivity.f26227OooOo0o;
                Context context = storeCoinFragment.getContext();
                Intrinsics.checkNotNull(context);
                Intent intent = new Intent(context, (Class<?>) RoomThemeStoreActivity.class);
                intent.putExtra("IS_SHOW_RECHARGE", true);
                intent.putExtra("IsFromMyOutfit", false);
                if (context != null) {
                    context.startActivity(intent);
                }
                h0.OooO0O0("105116");
            }
        }
    }

    public static final class OooOOOO extends oo0OOoo {
        public OooOOOO() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            PurchaseSkillCardActivity.OooOo0(0, StoreCoinFragment.this.getContext());
            h0.OooO0O0("105121");
        }
    }

    public static final class OooOo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27800OooO0Oo;

        public OooOo(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27800OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27800OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27800OooO0Oo;
        }

        public final int hashCode() {
            return this.f27800OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27800OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo00 extends oo0OOoo {
        public OooOo00() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            oO0OOo0o oo0ooo0oOooO0o0 = p417o0Oo0oO0.o00Oo0.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            o0000O0O.OooO0OO.OooO0OO("uniqueMessageDot", oo0oO0.OooOOo0().getValue(), oo0ooo0oOooO0o0, false);
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boolean.FALSE);
            o0oOoo00.o00000OO.Oooo0 oooo0 = p585o0oOoo00.o00000OO.f56628OooOOO0;
            StoreCoinFragment storeCoinFragment = StoreCoinFragment.this;
            oooo0.observe(storeCoinFragment.getViewLifecycleOwner(), new com.yalla.yalla.ui.activity.message.o000000(3, storeCoinFragment));
        }
    }

    private final void initView() {
        SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
        sharedMainMessageManager.getUniqueMessageDot().observe(requireActivity(), new OooOo(new OooO0OO()));
        sharedMainMessageManager.getUserVehicleMessageDot().observe(requireActivity(), new OooOo(new OooO0o()));
        sharedMainMessageManager.getStoreBubbleDot().observe(requireActivity(), new OooOo(new OooO()));
        getBinding().f44562OooO0oO.setOnClickListener(new OooOO0());
        getBinding().f44555OooO.setOnClickListener(new OooOO0O());
        getBinding().f44563OooO0oo.setOnClickListener(new OooOOO0());
        getBinding().f44564OooOO0.setOnClickListener(new OooOOO());
        getBinding().f44565OooOO0O.setOnClickListener(new OooOOOO());
        getBinding().f44560OooO0o.setOnClickListener(new OooOo00());
        getBinding().f44566OooOO0o.setOnClickListener(new OooO00o());
        getBinding().f44561OooO0o0.setOnClickListener(new OooO0O0());
    }

    @Override // p588o0oOooO0.o0O0O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
    }

    @Override // p527o0o0OO0.o00OO0O0
    @NotNull
    public o0OO000o getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o0OO000o o0oo000oInflate = o0OO000o.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o0oo000oInflate, "inflate(...)");
        return o0oo000oInflate;
    }
}
