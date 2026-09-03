package p579o0oOoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o000OOo;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o0O00O0o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p188o00o00o0.OooO0OO;
import p189o00o00oO.o0OO00O;
import p254o00ooO0O.oOO00O;
import p502o0o00o0.o00000O;
import p649o0ooOOoo.nf;
import p700oO0Oo.oo000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class c1 extends o00000O {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f45935OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final Function1<ThemeModel, Unit> f45936OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO0OO<ThemeModel> f45937OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f45938OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final List<OooO0O0> f45939OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final nf f45940o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(@NotNull FragmentActivity context, @NotNull Function1<? super ThemeModel, Unit> sendListener, @NotNull Function1<? super ThemeModel, Unit> purchaseListener) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendListener, "sendListener");
        Intrinsics.checkNotNullParameter(purchaseListener, "purchaseListener");
        this.f45935OoooO = sendListener;
        this.f45936OoooOO0 = purchaseListener;
        nf nfVarInflate = nf.inflate(LayoutInflater.from(context), this.f41545Oooo0oo, false);
        Intrinsics.checkNotNullExpressionValue(nfVarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        this.f45940o000oOoO = nfVarInflate;
        this.f45939OoooOo0 = new ArrayList();
        Window window = this.f41542Oooo;
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
        }
        ConstraintLayout constraintLayout = nfVarInflate.f50112OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.root");
        OooO0oO(constraintLayout);
        Window window2 = this.f41544Oooo0oO.getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.6f);
        }
        nfVarInflate.f50112OooO00o.setOnClickListener(new oo000o(this, 2));
        a1 a1Var = new a1(this, this.f41543Oooo0o);
        this.f45937OoooOOO = a1Var;
        a1Var.setOnItemChildClickListener(new o0OO00O(this, 4));
        nfVarInflate.f50115OooO0Oo.setLayoutManager(new FixLinearLayoutManager(this.f41543Oooo0o, 0));
        new o000OOo().attachToRecyclerView(nfVarInflate.f50115OooO0Oo);
        RecyclerView recyclerView = nfVarInflate.f50115OooO0Oo;
        OooO0OO<ThemeModel> oooO0OO = this.f45937OoooOOO;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        recyclerView.setAdapter(oooO0OO);
        nfVarInflate.f50115OooO0Oo.addOnScrollListener(new b1(this));
        nfVarInflate.f50113OooO0O0.setOnClickListener(this);
        nfVarInflate.f50114OooO0OO.setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0O00O0o.OooO0O0>] */
    @Override // p502o0o00o0.o00000O
    public final void OooO0Oo() {
        for (OooO0O0 oooO0O0 : this.f45939OoooOo0) {
            oooO0O0.OooO0o0();
            oooO0O0.OooO0O0();
        }
    }

    @Override // p502o0o00o0.o00000O
    public final void OooO0o0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        OooO0OO<ThemeModel> oooO0OO = null;
        boolean z = false;
        if (Intrinsics.areEqual(view, this.f45940o000oOoO.f50113OooO0O0)) {
            OooO0OO<ThemeModel> oooO0OO2 = this.f45937OoooOOO;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            int size = oooO0OO.getData().size();
            int i = this.f45938OoooOOo;
            int i2 = i - 1;
            if (i2 >= 0 && i2 < size) {
                z = true;
            }
            if (z) {
                this.f45940o000oOoO.f50115OooO0Oo.smoothScrollToPosition(i - 1);
                this.f45938OoooOOo--;
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(view, this.f45940o000oOoO.f50114OooO0OO)) {
            OooO0O0();
            return;
        }
        OooO0OO<ThemeModel> oooO0OO3 = this.f45937OoooOOO;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO = oooO0OO3;
        }
        int size2 = oooO0OO.getData().size();
        int i3 = this.f45938OoooOOo + 1;
        if (i3 >= 0 && i3 < size2) {
            z = true;
        }
        if (z) {
            this.f45940o000oOoO.f50115OooO0Oo.smoothScrollToPosition(i3);
            this.f45938OoooOOo++;
        }
    }

    public final void OooOO0O() {
        ImageView imageView = this.f45940o000oOoO.f50113OooO0O0;
        int i = this.f45938OoooOOo;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (i == 0) {
            oOO00O.OooO00o(imageView);
        } else {
            oOO00O.OooO(imageView);
        }
        ImageView imageView2 = this.f45940o000oOoO.f50114OooO0OO;
        int i2 = this.f45938OoooOOo;
        OooO0OO<ThemeModel> oooO0OO = this.f45937OoooOOO;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        int size = oooO0OO.getData().size() - 1;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        if (i2 == size) {
            oOO00O.OooO00o(imageView2);
        } else {
            oOO00O.OooO(imageView2);
        }
    }
}
