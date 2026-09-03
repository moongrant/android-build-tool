package p519o0o0O0oO;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O0;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.dialog.OtherLoginType;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402o0Oo0OOO.o00O0000;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class k extends o00O0O00 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f52382OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f52383OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final TextView f52384OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final TextView f52385OooOOOo;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f52386OooO0Oo;

        public OooO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f52386OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f52386OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f52386OooO0Oo;
        }

        public final int hashCode() {
            return this.f52386OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52386OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            TextView textView = k.this.f52383OooOOO0;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOO0(textView, it.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005f  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean z;
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            boolean zBooleanValue = it.booleanValue();
            k kVar = k.this;
            if (zBooleanValue) {
                o000OO00.OooOOO0(kVar.f52382OooOOO, true);
            } else {
                Context context = o000O0.f10354OooO00o;
                Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
                if (context2 != null) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    try {
                        List<PackageInfo> installedPackages = context2.getPackageManager().getInstalledPackages(0);
                        Intrinsics.checkNotNullExpressionValue(installedPackages, "packageManager.getInstalledPackages(0)");
                        Iterator<T> it2 = installedPackages.iterator();
                        z = false;
                        while (it2.hasNext()) {
                            try {
                                String str = ((PackageInfo) it2.next()).packageName;
                                Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
                                if (StringsKt__StringsKt.contains(str, "com.yallatech.yallachat", true)) {
                                    z = true;
                                }
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    o000OO00.OooOOO0(kVar.f52382OooOOO, true);
                } else {
                    o000OO00.OooOOO0(kVar.f52382OooOOO, false);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            TextView textView = k.this.f52384OooOOOO;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOO0(textView, it.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            TextView textView = k.this.f52385OooOOOo;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOO0(textView, it.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull FragmentActivity context, boolean z) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewFindViewById = findViewById(oO00O0oO.tvFacebook);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tvFacebook)");
        TextView textView = (TextView) viewFindViewById;
        this.f52383OooOOO0 = textView;
        View viewFindViewById2 = findViewById(oO00O0oO.tvYallaChat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tvYallaChat)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f52382OooOOO = textView2;
        View viewFindViewById3 = findViewById(oO00O0oO.tvTwitter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tvTwitter)");
        TextView textView3 = (TextView) viewFindViewById3;
        this.f52384OooOOOO = textView3;
        View viewFindViewById4 = findViewById(oO00O0oO.tvWeChat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tvWeChat)");
        TextView textView4 = (TextView) viewFindViewById4;
        this.f52385OooOOOo = textView4;
        this.f52543OooO.setGravity(80);
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(80);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        if (!z) {
            textView4.setVisibility(8);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(oO00Oo00.anim_bottom_top_bottom);
        }
        o00O0000.OooO00o();
        o00O0000.f44476OooO00o.observe(this, new OooO(new OooO00o()));
        o00O0000.f44477OooO0O0.observe(this, new OooO(new OooO0O0()));
        o00O0000.f44478OooO0OO.observe(this, new OooO(new OooO0OO()));
        o00O0000.f44479OooO0Oo.observe(this, new OooO(new OooO0o()));
    }

    @Override // p519o0o0O0oO.o00O0O00
    public final int OooO00o() {
        return oO00OO0O.dialog_other_login;
    }

    @Override // p519o0o0O0oO.o00O0O00
    public final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == oO00O0oO.tvFacebook) {
            OooO0Oo(OtherLoginType.Facebook);
            return;
        }
        if (id == oO00O0oO.tvTwitter) {
            OooO0Oo(OtherLoginType.Twitter);
        } else if (id == oO00O0oO.tvWeChat) {
            OooO0Oo(OtherLoginType.WeChat);
        } else if (id == oO00O0oO.tvYallaChat) {
            OooO0Oo(OtherLoginType.YallaChat);
        }
    }

    public abstract void OooO0Oo(@NotNull OtherLoginType otherLoginType);
}
