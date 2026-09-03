package p650o0ooo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.view.AutoImage;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o0O000Oo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO000 extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f58913OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f58914OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OfficialActionModel f58915OooOOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            oOO000 ooo000 = oOO000.this;
            OfficialActionModel officialActionModel = ooo000.f58915OooOOO0;
            if (officialActionModel != null) {
                o0oo0000.OooO00o.OooO0OO("101049", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
            }
            ooo000.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            oOO000 ooo000 = oOO000.this;
            o0000O00.OooO0O0("MainDialogUserReturn 活动 \nData:'" + ooo000.f58915OooOOO0 + "'");
            OfficialActionModel officialActionModel = ooo000.f58915OooOOO0;
            if (officialActionModel != null) {
                o0oo0000.OooO00o.OooO0OO("101048", MapsKt.mapOf(TuplesKt.to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
                String url = officialActionModel.getH5EntranceUrl();
                if (url != null) {
                    if (url.length() > 0) {
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
                        Intrinsics.checkNotNullParameter(url, "url");
                        webPageInfo.f32283OooO0o0 = url;
                        webPageInfo.f32280OooO = true;
                        int i = WebActivity.f25130OooOoO0;
                        WebActivity.OooO00o.OooO00o(ooo000.f58507OooO0Oo, webPageInfo);
                        ooo000.OooO0O0();
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O000Oo> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O000Oo invoke() {
            oOO000 ooo000 = oOO000.this;
            o0O000Oo o0o000ooInflate = o0O000Oo.inflate(LayoutInflater.from(ooo000.f58507OooO0Oo), ooo000.f58508OooO0o, false);
            Intrinsics.checkNotNullExpressionValue(o0o000ooInflate, "inflate(...)");
            return o0o000ooInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity, 0);
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f58913OooOO0O = fragmentActivity;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f58914OooOO0o = lazy;
        ConstraintLayout constraintLayout = ((o0O000Oo) lazy.getValue()).f44411OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        OooO0oO(constraintLayout);
        Window window = this.f58510OooO0oO;
        if (window != null) {
            window.setGravity(17);
        }
        this.f58509OooO0o0.setCancelable(false);
        ImageView close = ((o0O000Oo) lazy.getValue()).f44413OooO0OO;
        Intrinsics.checkNotNullExpressionValue(close, "close");
        o000O.OooO(close, new OooO00o());
        AutoImage autoImage = ((o0O000Oo) lazy.getValue()).f44412OooO0O0;
        Intrinsics.checkNotNullExpressionValue(autoImage, "autoImage");
        o000O.OooO(autoImage, new OooO0O0());
    }
}
