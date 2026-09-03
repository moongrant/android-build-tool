package p519o0o0O0oO;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152o00OoO.OooO;
import p152o00OoO.OooOO0;
import p203o00o0o0o.o000OO00;
import p584o0oOooO0.oO00OO0O;
import p641o0ooOOOO.d8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nThemePreviewDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,282:1\n1#2:283\n1855#3,2:284\n*S KotlinDebug\n*F\n+ 1 ThemePreviewDialog.kt\ncom/yalla/yalla/ui/dialog/ThemePreviewDialog\n*L\n258#1:284,2\n*E\n"})
public final class w3 extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f53193OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f53194OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public u3 f53195OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final d8 f53196OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f53197OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f53198OooOOOo;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f53199OooO0Oo;

        public OooO00o(s3 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53199OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f53199OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f53199OooO0Oo;
        }

        public final int hashCode() {
            return this.f53199OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53199OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(@NotNull FragmentActivity context, @NotNull RoomThemeStoreFragment.OooOo sendListener, @NotNull RoomThemeStoreFragment.Oooo000 purchaseListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendListener, "sendListener");
        Intrinsics.checkNotNullParameter(purchaseListener, "purchaseListener");
        this.f53193OooOO0O = sendListener;
        this.f53194OooOO0o = purchaseListener;
        d8 d8VarInflate = d8.inflate(LayoutInflater.from(context), this.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(d8VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        this.f53196OooOOO0 = d8VarInflate;
        this.f53198OooOOOo = new ArrayList();
        Window window = this.f52535OooO0oO;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        ConstraintLayout constraintLayout = d8VarInflate.f57739OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window2 = this.f52534OooO0o0.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.6f);
        }
        d8VarInflate.f57739OooO00o.setOnClickListener(new q3(this, 0));
        int i = oO00OO0O.room_item_theme_preview_dialog;
        Context context2 = this.f52532OooO0Oo;
        u3 u3Var = new u3(this, context2, i);
        this.f53195OooOOO = u3Var;
        u3Var.f10101OooO0oo = new o000OO00(this);
        FixLinearLayoutManager fixLinearLayoutManager = new FixLinearLayoutManager(context2, 0);
        RecyclerView recyclerView = d8VarInflate.f57742OooO0Oo;
        recyclerView.setLayoutManager(fixLinearLayoutManager);
        new o000OOo().attachToRecyclerView(recyclerView);
        u3 u3Var2 = this.f53195OooOOO;
        if (u3Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            u3Var2 = null;
        }
        recyclerView.setAdapter(u3Var2);
        recyclerView.addOnScrollListener(new v3(this));
        d8VarInflate.f57740OooO0O0.setOnClickListener(this);
        d8VarInflate.f57741OooO0OO.setOnClickListener(this);
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0Oo() {
        for (OooOO0 oooOO1 : this.f53198OooOOOo) {
            oooOO1.OooO0O0();
            OooO oooO = oooOO1.f38118OooO00o;
            if (oooO != null) {
                oooO.release();
            }
            oooOO1.f38118OooO00o = null;
        }
    }

    @Override // p519o0o0O0oO.o00O00OO
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d8 d8Var = this.f53196OooOOO0;
        boolean zAreEqual = Intrinsics.areEqual(view, d8Var.f57740OooO0O0);
        RecyclerView recyclerView = d8Var.f57742OooO0Oo;
        u3 u3Var = null;
        boolean z = false;
        if (zAreEqual) {
            u3 u3Var2 = this.f53195OooOOO;
            if (u3Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                u3Var = u3Var2;
            }
            int size = u3Var.f10111OooOOoo.size();
            int i = this.f53197OooOOOO;
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                z = true;
            }
            if (z) {
                recyclerView.smoothScrollToPosition(i - 1);
                this.f53197OooOOOO--;
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, d8Var.f57741OooO0OO)) {
            OooO0O0();
            return;
        }
        u3 u3Var3 = this.f53195OooOOO;
        if (u3Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            u3Var = u3Var3;
        }
        int size2 = u3Var.f10111OooOOoo.size();
        int i3 = this.f53197OooOOOO + 1;
        if (i3 >= 0 && i3 < size2) {
            z = true;
        }
        if (z) {
            recyclerView.smoothScrollToPosition(i3);
            this.f53197OooOOOO++;
        }
    }

    public final void OooOO0() {
        d8 d8Var = this.f53196OooOOO0;
        ImageView changeSwitch$lambda$3 = d8Var.f57740OooO0O0;
        int i = this.f53197OooOOOO;
        Intrinsics.checkNotNullExpressionValue(changeSwitch$lambda$3, "changeSwitch$lambda$3");
        if (i == 0) {
            com.code.android.util.o000OO00.OooO0O0(changeSwitch$lambda$3);
        } else {
            com.code.android.util.o000OO00.OooOOOO(changeSwitch$lambda$3);
        }
        int i2 = this.f53197OooOOOO;
        u3 u3Var = this.f53195OooOOO;
        if (u3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            u3Var = null;
        }
        int size = u3Var.f10111OooOOoo.size() - 1;
        ImageView changeSwitch$lambda$4 = d8Var.f57741OooO0OO;
        Intrinsics.checkNotNullExpressionValue(changeSwitch$lambda$4, "changeSwitch$lambda$4");
        if (i2 == size) {
            com.code.android.util.o000OO00.OooO0O0(changeSwitch$lambda$4);
        } else {
            com.code.android.util.o000OO00.OooOOOO(changeSwitch$lambda$4);
        }
    }
}
