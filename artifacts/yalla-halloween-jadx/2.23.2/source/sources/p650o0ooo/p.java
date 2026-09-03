package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
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
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public abstract class p extends o0O0ooO {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final TextView f59073OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final TextView f59074OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final TextView f59075OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final TextView f59076OooOOOo;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f59077OooO0Oo;

        public OooO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f59077OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f59077OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f59077OooO0Oo;
        }

        public final int hashCode() {
            return this.f59077OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f59077OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            TextView textView = p.this.f59074OooOOO0;
            Intrinsics.checkNotNull(bool2);
            o000O.OooOOO0(textView, bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x005d  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            boolean z;
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            p pVar = p.this;
            if (zBooleanValue) {
                o000O.OooOOO0(pVar.f59073OooOOO, true);
            } else {
                Context context = o000O00O.f13421OooO00o;
                Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
                if (context2 != null) {
                    Intrinsics.checkNotNullParameter(context2, "context");
                    try {
                        List<PackageInfo> installedPackages = context2.getPackageManager().getInstalledPackages(0);
                        Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
                        Iterator<T> it = installedPackages.iterator();
                        z = false;
                        while (it.hasNext()) {
                            try {
                                String packageName = ((PackageInfo) it.next()).packageName;
                                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                                if (StringsKt__StringsKt.contains(packageName, "com.yallatech.yallachat", true)) {
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
                    o000O.OooOOO0(pVar.f59073OooOOO, true);
                } else {
                    o000O.OooOOO0(pVar.f59073OooOOO, false);
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
            Boolean bool2 = bool;
            TextView textView = p.this.f59075OooOOOO;
            Intrinsics.checkNotNull(bool2);
            o000O.OooOOO0(textView, bool2.booleanValue());
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
            TextView textView = p.this.f59076OooOOOo;
            Intrinsics.checkNotNull(bool2);
            o000O.OooOOO0(textView, bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(@NotNull FragmentActivity context, boolean z) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewFindViewById = findViewById(o0OO00O.tvFacebook);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f59074OooOOO0 = textView;
        View viewFindViewById2 = findViewById(o0OO00O.tvYallaChat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f59073OooOOO = textView2;
        View viewFindViewById3 = findViewById(o0OO00O.tvTwitter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById3;
        this.f59075OooOOOO = textView3;
        View viewFindViewById4 = findViewById(o0OO00O.tvWeChat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById4;
        this.f59076OooOOOo = textView4;
        this.f58669OooO.setGravity(80);
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
            window2.setWindowAnimations(o000000O.anim_bottom_top_bottom);
        }
        p583o0oOoo00.o000000O.OooO00o();
        p583o0oOoo00.o000000O.f56636OooO00o.observe(this, new OooO(new OooO00o()));
        p583o0oOoo00.o000000O.f56637OooO0O0.observe(this, new OooO(new OooO0O0()));
        p583o0oOoo00.o000000O.f56638OooO0OO.observe(this, new OooO(new OooO0OO()));
        p583o0oOoo00.o000000O.f56639OooO0Oo.observe(this, new OooO(new OooO0o()));
    }

    @Override // p650o0ooo.o0O0ooO
    public final int OooO00o() {
        return oo0o0Oo.dialog_other_login;
    }

    @Override // p650o0ooo.o0O0ooO
    public final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int id = view.getId();
        if (id == o0OO00O.tvFacebook) {
            OooO0Oo(OtherLoginType.Facebook);
            return;
        }
        if (id == o0OO00O.tvTwitter) {
            OooO0Oo(OtherLoginType.Twitter);
        } else if (id == o0OO00O.tvWeChat) {
            OooO0Oo(OtherLoginType.WeChat);
        } else if (id == o0OO00O.tvYallaChat) {
            OooO0Oo(OtherLoginType.YallaChat);
        }
    }

    public abstract void OooO0Oo(@NotNull OtherLoginType otherLoginType);
}
